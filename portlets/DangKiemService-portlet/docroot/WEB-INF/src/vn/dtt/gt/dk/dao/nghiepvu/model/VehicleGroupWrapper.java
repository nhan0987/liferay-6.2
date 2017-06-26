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
 * This class is a wrapper for {@link VehicleGroup}.
 * </p>
 *
 * @author huymq
 * @see VehicleGroup
 * @generated
 */
public class VehicleGroupWrapper implements VehicleGroup,
	ModelWrapper<VehicleGroup> {
	public VehicleGroupWrapper(VehicleGroup vehicleGroup) {
		_vehicleGroup = vehicleGroup;
	}

	@Override
	public Class<?> getModelClass() {
		return VehicleGroup.class;
	}

	@Override
	public String getModelClassName() {
		return VehicleGroup.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("vehicleClass", getVehicleClass());
		attributes.put("registeredInspectionId", getRegisteredInspectionId());
		attributes.put("technicalSpecCode", getTechnicalSpecCode());
		attributes.put("referenceCertificateNo", getReferenceCertificateNo());
		attributes.put("safetytestreportNo", getSafetytestreportNo());
		attributes.put("emissiontestreportNo", getEmissiontestreportNo());
		attributes.put("copreportNo", getCopreportNo());
		attributes.put("vehicleType", getVehicleType());
		attributes.put("engineType", getEngineType());
		attributes.put("tradeMark", getTradeMark());
		attributes.put("markAsVehicle", getMarkAsVehicle());
		attributes.put("commercialName", getCommercialName());
		attributes.put("modelCode", getModelCode());
		attributes.put("productionPlant", getProductionPlant());
		attributes.put("addressOfProductionPlant", getAddressOfProductionPlant());
		attributes.put("emissionStandard", getEmissionStandard());
		attributes.put("safetyTestReportId", getSafetyTestReportId());
		attributes.put("emissionTestReportId", getEmissionTestReportId());
		attributes.put("copReportId", getCopReportId());
		attributes.put("specificationVersion", getSpecificationVersion());
		attributes.put("hoSoThuTucId", getHoSoThuTucId());
		attributes.put("remarks", getRemarks());
		attributes.put("attachedFile", getAttachedFile());
		attributes.put("synchdate", getSynchdate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String vehicleClass = (String)attributes.get("vehicleClass");

		if (vehicleClass != null) {
			setVehicleClass(vehicleClass);
		}

		Long registeredInspectionId = (Long)attributes.get(
				"registeredInspectionId");

		if (registeredInspectionId != null) {
			setRegisteredInspectionId(registeredInspectionId);
		}

		String technicalSpecCode = (String)attributes.get("technicalSpecCode");

		if (technicalSpecCode != null) {
			setTechnicalSpecCode(technicalSpecCode);
		}

		String referenceCertificateNo = (String)attributes.get(
				"referenceCertificateNo");

		if (referenceCertificateNo != null) {
			setReferenceCertificateNo(referenceCertificateNo);
		}

		String safetytestreportNo = (String)attributes.get("safetytestreportNo");

		if (safetytestreportNo != null) {
			setSafetytestreportNo(safetytestreportNo);
		}

		String emissiontestreportNo = (String)attributes.get(
				"emissiontestreportNo");

		if (emissiontestreportNo != null) {
			setEmissiontestreportNo(emissiontestreportNo);
		}

		String copreportNo = (String)attributes.get("copreportNo");

		if (copreportNo != null) {
			setCopreportNo(copreportNo);
		}

		String vehicleType = (String)attributes.get("vehicleType");

		if (vehicleType != null) {
			setVehicleType(vehicleType);
		}

		String engineType = (String)attributes.get("engineType");

		if (engineType != null) {
			setEngineType(engineType);
		}

		String tradeMark = (String)attributes.get("tradeMark");

		if (tradeMark != null) {
			setTradeMark(tradeMark);
		}

		Integer markAsVehicle = (Integer)attributes.get("markAsVehicle");

		if (markAsVehicle != null) {
			setMarkAsVehicle(markAsVehicle);
		}

		String commercialName = (String)attributes.get("commercialName");

		if (commercialName != null) {
			setCommercialName(commercialName);
		}

		String modelCode = (String)attributes.get("modelCode");

		if (modelCode != null) {
			setModelCode(modelCode);
		}

		String productionPlant = (String)attributes.get("productionPlant");

		if (productionPlant != null) {
			setProductionPlant(productionPlant);
		}

		String addressOfProductionPlant = (String)attributes.get(
				"addressOfProductionPlant");

		if (addressOfProductionPlant != null) {
			setAddressOfProductionPlant(addressOfProductionPlant);
		}

		String emissionStandard = (String)attributes.get("emissionStandard");

		if (emissionStandard != null) {
			setEmissionStandard(emissionStandard);
		}

		Long safetyTestReportId = (Long)attributes.get("safetyTestReportId");

		if (safetyTestReportId != null) {
			setSafetyTestReportId(safetyTestReportId);
		}

		Long emissionTestReportId = (Long)attributes.get("emissionTestReportId");

		if (emissionTestReportId != null) {
			setEmissionTestReportId(emissionTestReportId);
		}

		Long copReportId = (Long)attributes.get("copReportId");

		if (copReportId != null) {
			setCopReportId(copReportId);
		}

		Long specificationVersion = (Long)attributes.get("specificationVersion");

		if (specificationVersion != null) {
			setSpecificationVersion(specificationVersion);
		}

		Long hoSoThuTucId = (Long)attributes.get("hoSoThuTucId");

		if (hoSoThuTucId != null) {
			setHoSoThuTucId(hoSoThuTucId);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}

		Date synchdate = (Date)attributes.get("synchdate");

		if (synchdate != null) {
			setSynchdate(synchdate);
		}
	}

	/**
	* Returns the primary key of this vehicle group.
	*
	* @return the primary key of this vehicle group
	*/
	@Override
	public long getPrimaryKey() {
		return _vehicleGroup.getPrimaryKey();
	}

	/**
	* Sets the primary key of this vehicle group.
	*
	* @param primaryKey the primary key of this vehicle group
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vehicleGroup.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this vehicle group.
	*
	* @return the ID of this vehicle group
	*/
	@Override
	public long getId() {
		return _vehicleGroup.getId();
	}

	/**
	* Sets the ID of this vehicle group.
	*
	* @param id the ID of this vehicle group
	*/
	@Override
	public void setId(long id) {
		_vehicleGroup.setId(id);
	}

	/**
	* Returns the vehicle class of this vehicle group.
	*
	* @return the vehicle class of this vehicle group
	*/
	@Override
	public java.lang.String getVehicleClass() {
		return _vehicleGroup.getVehicleClass();
	}

	/**
	* Sets the vehicle class of this vehicle group.
	*
	* @param vehicleClass the vehicle class of this vehicle group
	*/
	@Override
	public void setVehicleClass(java.lang.String vehicleClass) {
		_vehicleGroup.setVehicleClass(vehicleClass);
	}

	/**
	* Returns the registered inspection ID of this vehicle group.
	*
	* @return the registered inspection ID of this vehicle group
	*/
	@Override
	public long getRegisteredInspectionId() {
		return _vehicleGroup.getRegisteredInspectionId();
	}

	/**
	* Sets the registered inspection ID of this vehicle group.
	*
	* @param registeredInspectionId the registered inspection ID of this vehicle group
	*/
	@Override
	public void setRegisteredInspectionId(long registeredInspectionId) {
		_vehicleGroup.setRegisteredInspectionId(registeredInspectionId);
	}

	/**
	* Returns the technical spec code of this vehicle group.
	*
	* @return the technical spec code of this vehicle group
	*/
	@Override
	public java.lang.String getTechnicalSpecCode() {
		return _vehicleGroup.getTechnicalSpecCode();
	}

	/**
	* Sets the technical spec code of this vehicle group.
	*
	* @param technicalSpecCode the technical spec code of this vehicle group
	*/
	@Override
	public void setTechnicalSpecCode(java.lang.String technicalSpecCode) {
		_vehicleGroup.setTechnicalSpecCode(technicalSpecCode);
	}

	/**
	* Returns the reference certificate no of this vehicle group.
	*
	* @return the reference certificate no of this vehicle group
	*/
	@Override
	public java.lang.String getReferenceCertificateNo() {
		return _vehicleGroup.getReferenceCertificateNo();
	}

	/**
	* Sets the reference certificate no of this vehicle group.
	*
	* @param referenceCertificateNo the reference certificate no of this vehicle group
	*/
	@Override
	public void setReferenceCertificateNo(
		java.lang.String referenceCertificateNo) {
		_vehicleGroup.setReferenceCertificateNo(referenceCertificateNo);
	}

	/**
	* Returns the safetytestreport no of this vehicle group.
	*
	* @return the safetytestreport no of this vehicle group
	*/
	@Override
	public java.lang.String getSafetytestreportNo() {
		return _vehicleGroup.getSafetytestreportNo();
	}

	/**
	* Sets the safetytestreport no of this vehicle group.
	*
	* @param safetytestreportNo the safetytestreport no of this vehicle group
	*/
	@Override
	public void setSafetytestreportNo(java.lang.String safetytestreportNo) {
		_vehicleGroup.setSafetytestreportNo(safetytestreportNo);
	}

	/**
	* Returns the emissiontestreport no of this vehicle group.
	*
	* @return the emissiontestreport no of this vehicle group
	*/
	@Override
	public java.lang.String getEmissiontestreportNo() {
		return _vehicleGroup.getEmissiontestreportNo();
	}

	/**
	* Sets the emissiontestreport no of this vehicle group.
	*
	* @param emissiontestreportNo the emissiontestreport no of this vehicle group
	*/
	@Override
	public void setEmissiontestreportNo(java.lang.String emissiontestreportNo) {
		_vehicleGroup.setEmissiontestreportNo(emissiontestreportNo);
	}

	/**
	* Returns the copreport no of this vehicle group.
	*
	* @return the copreport no of this vehicle group
	*/
	@Override
	public java.lang.String getCopreportNo() {
		return _vehicleGroup.getCopreportNo();
	}

	/**
	* Sets the copreport no of this vehicle group.
	*
	* @param copreportNo the copreport no of this vehicle group
	*/
	@Override
	public void setCopreportNo(java.lang.String copreportNo) {
		_vehicleGroup.setCopreportNo(copreportNo);
	}

	/**
	* Returns the vehicle type of this vehicle group.
	*
	* @return the vehicle type of this vehicle group
	*/
	@Override
	public java.lang.String getVehicleType() {
		return _vehicleGroup.getVehicleType();
	}

	/**
	* Sets the vehicle type of this vehicle group.
	*
	* @param vehicleType the vehicle type of this vehicle group
	*/
	@Override
	public void setVehicleType(java.lang.String vehicleType) {
		_vehicleGroup.setVehicleType(vehicleType);
	}

	/**
	* Returns the engine type of this vehicle group.
	*
	* @return the engine type of this vehicle group
	*/
	@Override
	public java.lang.String getEngineType() {
		return _vehicleGroup.getEngineType();
	}

	/**
	* Sets the engine type of this vehicle group.
	*
	* @param engineType the engine type of this vehicle group
	*/
	@Override
	public void setEngineType(java.lang.String engineType) {
		_vehicleGroup.setEngineType(engineType);
	}

	/**
	* Returns the trade mark of this vehicle group.
	*
	* @return the trade mark of this vehicle group
	*/
	@Override
	public java.lang.String getTradeMark() {
		return _vehicleGroup.getTradeMark();
	}

	/**
	* Sets the trade mark of this vehicle group.
	*
	* @param tradeMark the trade mark of this vehicle group
	*/
	@Override
	public void setTradeMark(java.lang.String tradeMark) {
		_vehicleGroup.setTradeMark(tradeMark);
	}

	/**
	* Returns the mark as vehicle of this vehicle group.
	*
	* @return the mark as vehicle of this vehicle group
	*/
	@Override
	public int getMarkAsVehicle() {
		return _vehicleGroup.getMarkAsVehicle();
	}

	/**
	* Sets the mark as vehicle of this vehicle group.
	*
	* @param markAsVehicle the mark as vehicle of this vehicle group
	*/
	@Override
	public void setMarkAsVehicle(int markAsVehicle) {
		_vehicleGroup.setMarkAsVehicle(markAsVehicle);
	}

	/**
	* Returns the commercial name of this vehicle group.
	*
	* @return the commercial name of this vehicle group
	*/
	@Override
	public java.lang.String getCommercialName() {
		return _vehicleGroup.getCommercialName();
	}

	/**
	* Sets the commercial name of this vehicle group.
	*
	* @param commercialName the commercial name of this vehicle group
	*/
	@Override
	public void setCommercialName(java.lang.String commercialName) {
		_vehicleGroup.setCommercialName(commercialName);
	}

	/**
	* Returns the model code of this vehicle group.
	*
	* @return the model code of this vehicle group
	*/
	@Override
	public java.lang.String getModelCode() {
		return _vehicleGroup.getModelCode();
	}

	/**
	* Sets the model code of this vehicle group.
	*
	* @param modelCode the model code of this vehicle group
	*/
	@Override
	public void setModelCode(java.lang.String modelCode) {
		_vehicleGroup.setModelCode(modelCode);
	}

	/**
	* Returns the production plant of this vehicle group.
	*
	* @return the production plant of this vehicle group
	*/
	@Override
	public java.lang.String getProductionPlant() {
		return _vehicleGroup.getProductionPlant();
	}

	/**
	* Sets the production plant of this vehicle group.
	*
	* @param productionPlant the production plant of this vehicle group
	*/
	@Override
	public void setProductionPlant(java.lang.String productionPlant) {
		_vehicleGroup.setProductionPlant(productionPlant);
	}

	/**
	* Returns the address of production plant of this vehicle group.
	*
	* @return the address of production plant of this vehicle group
	*/
	@Override
	public java.lang.String getAddressOfProductionPlant() {
		return _vehicleGroup.getAddressOfProductionPlant();
	}

	/**
	* Sets the address of production plant of this vehicle group.
	*
	* @param addressOfProductionPlant the address of production plant of this vehicle group
	*/
	@Override
	public void setAddressOfProductionPlant(
		java.lang.String addressOfProductionPlant) {
		_vehicleGroup.setAddressOfProductionPlant(addressOfProductionPlant);
	}

	/**
	* Returns the emission standard of this vehicle group.
	*
	* @return the emission standard of this vehicle group
	*/
	@Override
	public java.lang.String getEmissionStandard() {
		return _vehicleGroup.getEmissionStandard();
	}

	/**
	* Sets the emission standard of this vehicle group.
	*
	* @param emissionStandard the emission standard of this vehicle group
	*/
	@Override
	public void setEmissionStandard(java.lang.String emissionStandard) {
		_vehicleGroup.setEmissionStandard(emissionStandard);
	}

	/**
	* Returns the safety test report ID of this vehicle group.
	*
	* @return the safety test report ID of this vehicle group
	*/
	@Override
	public long getSafetyTestReportId() {
		return _vehicleGroup.getSafetyTestReportId();
	}

	/**
	* Sets the safety test report ID of this vehicle group.
	*
	* @param safetyTestReportId the safety test report ID of this vehicle group
	*/
	@Override
	public void setSafetyTestReportId(long safetyTestReportId) {
		_vehicleGroup.setSafetyTestReportId(safetyTestReportId);
	}

	/**
	* Returns the emission test report ID of this vehicle group.
	*
	* @return the emission test report ID of this vehicle group
	*/
	@Override
	public long getEmissionTestReportId() {
		return _vehicleGroup.getEmissionTestReportId();
	}

	/**
	* Sets the emission test report ID of this vehicle group.
	*
	* @param emissionTestReportId the emission test report ID of this vehicle group
	*/
	@Override
	public void setEmissionTestReportId(long emissionTestReportId) {
		_vehicleGroup.setEmissionTestReportId(emissionTestReportId);
	}

	/**
	* Returns the cop report ID of this vehicle group.
	*
	* @return the cop report ID of this vehicle group
	*/
	@Override
	public long getCopReportId() {
		return _vehicleGroup.getCopReportId();
	}

	/**
	* Sets the cop report ID of this vehicle group.
	*
	* @param copReportId the cop report ID of this vehicle group
	*/
	@Override
	public void setCopReportId(long copReportId) {
		_vehicleGroup.setCopReportId(copReportId);
	}

	/**
	* Returns the specification version of this vehicle group.
	*
	* @return the specification version of this vehicle group
	*/
	@Override
	public long getSpecificationVersion() {
		return _vehicleGroup.getSpecificationVersion();
	}

	/**
	* Sets the specification version of this vehicle group.
	*
	* @param specificationVersion the specification version of this vehicle group
	*/
	@Override
	public void setSpecificationVersion(long specificationVersion) {
		_vehicleGroup.setSpecificationVersion(specificationVersion);
	}

	/**
	* Returns the ho so thu tuc ID of this vehicle group.
	*
	* @return the ho so thu tuc ID of this vehicle group
	*/
	@Override
	public long getHoSoThuTucId() {
		return _vehicleGroup.getHoSoThuTucId();
	}

	/**
	* Sets the ho so thu tuc ID of this vehicle group.
	*
	* @param hoSoThuTucId the ho so thu tuc ID of this vehicle group
	*/
	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_vehicleGroup.setHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the remarks of this vehicle group.
	*
	* @return the remarks of this vehicle group
	*/
	@Override
	public java.lang.String getRemarks() {
		return _vehicleGroup.getRemarks();
	}

	/**
	* Sets the remarks of this vehicle group.
	*
	* @param remarks the remarks of this vehicle group
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_vehicleGroup.setRemarks(remarks);
	}

	/**
	* Returns the attached file of this vehicle group.
	*
	* @return the attached file of this vehicle group
	*/
	@Override
	public long getAttachedFile() {
		return _vehicleGroup.getAttachedFile();
	}

	/**
	* Sets the attached file of this vehicle group.
	*
	* @param attachedFile the attached file of this vehicle group
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_vehicleGroup.setAttachedFile(attachedFile);
	}

	/**
	* Returns the synchdate of this vehicle group.
	*
	* @return the synchdate of this vehicle group
	*/
	@Override
	public java.util.Date getSynchdate() {
		return _vehicleGroup.getSynchdate();
	}

	/**
	* Sets the synchdate of this vehicle group.
	*
	* @param synchdate the synchdate of this vehicle group
	*/
	@Override
	public void setSynchdate(java.util.Date synchdate) {
		_vehicleGroup.setSynchdate(synchdate);
	}

	@Override
	public boolean isNew() {
		return _vehicleGroup.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_vehicleGroup.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _vehicleGroup.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vehicleGroup.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _vehicleGroup.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _vehicleGroup.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_vehicleGroup.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _vehicleGroup.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_vehicleGroup.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_vehicleGroup.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_vehicleGroup.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new VehicleGroupWrapper((VehicleGroup)_vehicleGroup.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup vehicleGroup) {
		return _vehicleGroup.compareTo(vehicleGroup);
	}

	@Override
	public int hashCode() {
		return _vehicleGroup.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup> toCacheModel() {
		return _vehicleGroup.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup toEscapedModel() {
		return new VehicleGroupWrapper(_vehicleGroup.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup toUnescapedModel() {
		return new VehicleGroupWrapper(_vehicleGroup.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _vehicleGroup.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vehicleGroup.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_vehicleGroup.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VehicleGroupWrapper)) {
			return false;
		}

		VehicleGroupWrapper vehicleGroupWrapper = (VehicleGroupWrapper)obj;

		if (Validator.equals(_vehicleGroup, vehicleGroupWrapper._vehicleGroup)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public VehicleGroup getWrappedVehicleGroup() {
		return _vehicleGroup;
	}

	@Override
	public VehicleGroup getWrappedModel() {
		return _vehicleGroup;
	}

	@Override
	public void resetOriginalValues() {
		_vehicleGroup.resetOriginalValues();
	}

	private VehicleGroup _vehicleGroup;
}