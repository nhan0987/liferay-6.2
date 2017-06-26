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
 * This class is a wrapper for {@link VehicleGroupInitial}.
 * </p>
 *
 * @author win_64
 * @see VehicleGroupInitial
 * @generated
 */
public class VehicleGroupInitialWrapper implements VehicleGroupInitial,
	ModelWrapper<VehicleGroupInitial> {
	public VehicleGroupInitialWrapper(VehicleGroupInitial vehicleGroupInitial) {
		_vehicleGroupInitial = vehicleGroupInitial;
	}

	@Override
	public Class<?> getModelClass() {
		return VehicleGroupInitial.class;
	}

	@Override
	public String getModelClassName() {
		return VehicleGroupInitial.class.getName();
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
		attributes.put("remarks", getRemarks());
		attributes.put("attachedFile", getAttachedFile());

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

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}
	}

	/**
	* Returns the primary key of this vehicle group initial.
	*
	* @return the primary key of this vehicle group initial
	*/
	@Override
	public long getPrimaryKey() {
		return _vehicleGroupInitial.getPrimaryKey();
	}

	/**
	* Sets the primary key of this vehicle group initial.
	*
	* @param primaryKey the primary key of this vehicle group initial
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vehicleGroupInitial.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this vehicle group initial.
	*
	* @return the ID of this vehicle group initial
	*/
	@Override
	public long getId() {
		return _vehicleGroupInitial.getId();
	}

	/**
	* Sets the ID of this vehicle group initial.
	*
	* @param id the ID of this vehicle group initial
	*/
	@Override
	public void setId(long id) {
		_vehicleGroupInitial.setId(id);
	}

	/**
	* Returns the vehicle class of this vehicle group initial.
	*
	* @return the vehicle class of this vehicle group initial
	*/
	@Override
	public java.lang.String getVehicleClass() {
		return _vehicleGroupInitial.getVehicleClass();
	}

	/**
	* Sets the vehicle class of this vehicle group initial.
	*
	* @param vehicleClass the vehicle class of this vehicle group initial
	*/
	@Override
	public void setVehicleClass(java.lang.String vehicleClass) {
		_vehicleGroupInitial.setVehicleClass(vehicleClass);
	}

	/**
	* Returns the registered inspection ID of this vehicle group initial.
	*
	* @return the registered inspection ID of this vehicle group initial
	*/
	@Override
	public long getRegisteredInspectionId() {
		return _vehicleGroupInitial.getRegisteredInspectionId();
	}

	/**
	* Sets the registered inspection ID of this vehicle group initial.
	*
	* @param registeredInspectionId the registered inspection ID of this vehicle group initial
	*/
	@Override
	public void setRegisteredInspectionId(long registeredInspectionId) {
		_vehicleGroupInitial.setRegisteredInspectionId(registeredInspectionId);
	}

	/**
	* Returns the technical spec code of this vehicle group initial.
	*
	* @return the technical spec code of this vehicle group initial
	*/
	@Override
	public java.lang.String getTechnicalSpecCode() {
		return _vehicleGroupInitial.getTechnicalSpecCode();
	}

	/**
	* Sets the technical spec code of this vehicle group initial.
	*
	* @param technicalSpecCode the technical spec code of this vehicle group initial
	*/
	@Override
	public void setTechnicalSpecCode(java.lang.String technicalSpecCode) {
		_vehicleGroupInitial.setTechnicalSpecCode(technicalSpecCode);
	}

	/**
	* Returns the reference certificate no of this vehicle group initial.
	*
	* @return the reference certificate no of this vehicle group initial
	*/
	@Override
	public java.lang.String getReferenceCertificateNo() {
		return _vehicleGroupInitial.getReferenceCertificateNo();
	}

	/**
	* Sets the reference certificate no of this vehicle group initial.
	*
	* @param referenceCertificateNo the reference certificate no of this vehicle group initial
	*/
	@Override
	public void setReferenceCertificateNo(
		java.lang.String referenceCertificateNo) {
		_vehicleGroupInitial.setReferenceCertificateNo(referenceCertificateNo);
	}

	/**
	* Returns the safetytestreport no of this vehicle group initial.
	*
	* @return the safetytestreport no of this vehicle group initial
	*/
	@Override
	public java.lang.String getSafetytestreportNo() {
		return _vehicleGroupInitial.getSafetytestreportNo();
	}

	/**
	* Sets the safetytestreport no of this vehicle group initial.
	*
	* @param safetytestreportNo the safetytestreport no of this vehicle group initial
	*/
	@Override
	public void setSafetytestreportNo(java.lang.String safetytestreportNo) {
		_vehicleGroupInitial.setSafetytestreportNo(safetytestreportNo);
	}

	/**
	* Returns the emissiontestreport no of this vehicle group initial.
	*
	* @return the emissiontestreport no of this vehicle group initial
	*/
	@Override
	public java.lang.String getEmissiontestreportNo() {
		return _vehicleGroupInitial.getEmissiontestreportNo();
	}

	/**
	* Sets the emissiontestreport no of this vehicle group initial.
	*
	* @param emissiontestreportNo the emissiontestreport no of this vehicle group initial
	*/
	@Override
	public void setEmissiontestreportNo(java.lang.String emissiontestreportNo) {
		_vehicleGroupInitial.setEmissiontestreportNo(emissiontestreportNo);
	}

	/**
	* Returns the copreport no of this vehicle group initial.
	*
	* @return the copreport no of this vehicle group initial
	*/
	@Override
	public java.lang.String getCopreportNo() {
		return _vehicleGroupInitial.getCopreportNo();
	}

	/**
	* Sets the copreport no of this vehicle group initial.
	*
	* @param copreportNo the copreport no of this vehicle group initial
	*/
	@Override
	public void setCopreportNo(java.lang.String copreportNo) {
		_vehicleGroupInitial.setCopreportNo(copreportNo);
	}

	/**
	* Returns the vehicle type of this vehicle group initial.
	*
	* @return the vehicle type of this vehicle group initial
	*/
	@Override
	public java.lang.String getVehicleType() {
		return _vehicleGroupInitial.getVehicleType();
	}

	/**
	* Sets the vehicle type of this vehicle group initial.
	*
	* @param vehicleType the vehicle type of this vehicle group initial
	*/
	@Override
	public void setVehicleType(java.lang.String vehicleType) {
		_vehicleGroupInitial.setVehicleType(vehicleType);
	}

	/**
	* Returns the engine type of this vehicle group initial.
	*
	* @return the engine type of this vehicle group initial
	*/
	@Override
	public java.lang.String getEngineType() {
		return _vehicleGroupInitial.getEngineType();
	}

	/**
	* Sets the engine type of this vehicle group initial.
	*
	* @param engineType the engine type of this vehicle group initial
	*/
	@Override
	public void setEngineType(java.lang.String engineType) {
		_vehicleGroupInitial.setEngineType(engineType);
	}

	/**
	* Returns the trade mark of this vehicle group initial.
	*
	* @return the trade mark of this vehicle group initial
	*/
	@Override
	public java.lang.String getTradeMark() {
		return _vehicleGroupInitial.getTradeMark();
	}

	/**
	* Sets the trade mark of this vehicle group initial.
	*
	* @param tradeMark the trade mark of this vehicle group initial
	*/
	@Override
	public void setTradeMark(java.lang.String tradeMark) {
		_vehicleGroupInitial.setTradeMark(tradeMark);
	}

	/**
	* Returns the mark as vehicle of this vehicle group initial.
	*
	* @return the mark as vehicle of this vehicle group initial
	*/
	@Override
	public int getMarkAsVehicle() {
		return _vehicleGroupInitial.getMarkAsVehicle();
	}

	/**
	* Sets the mark as vehicle of this vehicle group initial.
	*
	* @param markAsVehicle the mark as vehicle of this vehicle group initial
	*/
	@Override
	public void setMarkAsVehicle(int markAsVehicle) {
		_vehicleGroupInitial.setMarkAsVehicle(markAsVehicle);
	}

	/**
	* Returns the commercial name of this vehicle group initial.
	*
	* @return the commercial name of this vehicle group initial
	*/
	@Override
	public java.lang.String getCommercialName() {
		return _vehicleGroupInitial.getCommercialName();
	}

	/**
	* Sets the commercial name of this vehicle group initial.
	*
	* @param commercialName the commercial name of this vehicle group initial
	*/
	@Override
	public void setCommercialName(java.lang.String commercialName) {
		_vehicleGroupInitial.setCommercialName(commercialName);
	}

	/**
	* Returns the model code of this vehicle group initial.
	*
	* @return the model code of this vehicle group initial
	*/
	@Override
	public java.lang.String getModelCode() {
		return _vehicleGroupInitial.getModelCode();
	}

	/**
	* Sets the model code of this vehicle group initial.
	*
	* @param modelCode the model code of this vehicle group initial
	*/
	@Override
	public void setModelCode(java.lang.String modelCode) {
		_vehicleGroupInitial.setModelCode(modelCode);
	}

	/**
	* Returns the production plant of this vehicle group initial.
	*
	* @return the production plant of this vehicle group initial
	*/
	@Override
	public java.lang.String getProductionPlant() {
		return _vehicleGroupInitial.getProductionPlant();
	}

	/**
	* Sets the production plant of this vehicle group initial.
	*
	* @param productionPlant the production plant of this vehicle group initial
	*/
	@Override
	public void setProductionPlant(java.lang.String productionPlant) {
		_vehicleGroupInitial.setProductionPlant(productionPlant);
	}

	/**
	* Returns the address of production plant of this vehicle group initial.
	*
	* @return the address of production plant of this vehicle group initial
	*/
	@Override
	public java.lang.String getAddressOfProductionPlant() {
		return _vehicleGroupInitial.getAddressOfProductionPlant();
	}

	/**
	* Sets the address of production plant of this vehicle group initial.
	*
	* @param addressOfProductionPlant the address of production plant of this vehicle group initial
	*/
	@Override
	public void setAddressOfProductionPlant(
		java.lang.String addressOfProductionPlant) {
		_vehicleGroupInitial.setAddressOfProductionPlant(addressOfProductionPlant);
	}

	/**
	* Returns the emission standard of this vehicle group initial.
	*
	* @return the emission standard of this vehicle group initial
	*/
	@Override
	public java.lang.String getEmissionStandard() {
		return _vehicleGroupInitial.getEmissionStandard();
	}

	/**
	* Sets the emission standard of this vehicle group initial.
	*
	* @param emissionStandard the emission standard of this vehicle group initial
	*/
	@Override
	public void setEmissionStandard(java.lang.String emissionStandard) {
		_vehicleGroupInitial.setEmissionStandard(emissionStandard);
	}

	/**
	* Returns the safety test report ID of this vehicle group initial.
	*
	* @return the safety test report ID of this vehicle group initial
	*/
	@Override
	public long getSafetyTestReportId() {
		return _vehicleGroupInitial.getSafetyTestReportId();
	}

	/**
	* Sets the safety test report ID of this vehicle group initial.
	*
	* @param safetyTestReportId the safety test report ID of this vehicle group initial
	*/
	@Override
	public void setSafetyTestReportId(long safetyTestReportId) {
		_vehicleGroupInitial.setSafetyTestReportId(safetyTestReportId);
	}

	/**
	* Returns the emission test report ID of this vehicle group initial.
	*
	* @return the emission test report ID of this vehicle group initial
	*/
	@Override
	public long getEmissionTestReportId() {
		return _vehicleGroupInitial.getEmissionTestReportId();
	}

	/**
	* Sets the emission test report ID of this vehicle group initial.
	*
	* @param emissionTestReportId the emission test report ID of this vehicle group initial
	*/
	@Override
	public void setEmissionTestReportId(long emissionTestReportId) {
		_vehicleGroupInitial.setEmissionTestReportId(emissionTestReportId);
	}

	/**
	* Returns the cop report ID of this vehicle group initial.
	*
	* @return the cop report ID of this vehicle group initial
	*/
	@Override
	public long getCopReportId() {
		return _vehicleGroupInitial.getCopReportId();
	}

	/**
	* Sets the cop report ID of this vehicle group initial.
	*
	* @param copReportId the cop report ID of this vehicle group initial
	*/
	@Override
	public void setCopReportId(long copReportId) {
		_vehicleGroupInitial.setCopReportId(copReportId);
	}

	/**
	* Returns the specification version of this vehicle group initial.
	*
	* @return the specification version of this vehicle group initial
	*/
	@Override
	public long getSpecificationVersion() {
		return _vehicleGroupInitial.getSpecificationVersion();
	}

	/**
	* Sets the specification version of this vehicle group initial.
	*
	* @param specificationVersion the specification version of this vehicle group initial
	*/
	@Override
	public void setSpecificationVersion(long specificationVersion) {
		_vehicleGroupInitial.setSpecificationVersion(specificationVersion);
	}

	/**
	* Returns the remarks of this vehicle group initial.
	*
	* @return the remarks of this vehicle group initial
	*/
	@Override
	public java.lang.String getRemarks() {
		return _vehicleGroupInitial.getRemarks();
	}

	/**
	* Sets the remarks of this vehicle group initial.
	*
	* @param remarks the remarks of this vehicle group initial
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_vehicleGroupInitial.setRemarks(remarks);
	}

	/**
	* Returns the attached file of this vehicle group initial.
	*
	* @return the attached file of this vehicle group initial
	*/
	@Override
	public long getAttachedFile() {
		return _vehicleGroupInitial.getAttachedFile();
	}

	/**
	* Sets the attached file of this vehicle group initial.
	*
	* @param attachedFile the attached file of this vehicle group initial
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_vehicleGroupInitial.setAttachedFile(attachedFile);
	}

	@Override
	public boolean isNew() {
		return _vehicleGroupInitial.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_vehicleGroupInitial.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _vehicleGroupInitial.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vehicleGroupInitial.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _vehicleGroupInitial.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _vehicleGroupInitial.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_vehicleGroupInitial.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _vehicleGroupInitial.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_vehicleGroupInitial.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_vehicleGroupInitial.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_vehicleGroupInitial.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new VehicleGroupInitialWrapper((VehicleGroupInitial)_vehicleGroupInitial.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial vehicleGroupInitial) {
		return _vehicleGroupInitial.compareTo(vehicleGroupInitial);
	}

	@Override
	public int hashCode() {
		return _vehicleGroupInitial.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial> toCacheModel() {
		return _vehicleGroupInitial.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial toEscapedModel() {
		return new VehicleGroupInitialWrapper(_vehicleGroupInitial.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial toUnescapedModel() {
		return new VehicleGroupInitialWrapper(_vehicleGroupInitial.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _vehicleGroupInitial.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vehicleGroupInitial.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_vehicleGroupInitial.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VehicleGroupInitialWrapper)) {
			return false;
		}

		VehicleGroupInitialWrapper vehicleGroupInitialWrapper = (VehicleGroupInitialWrapper)obj;

		if (Validator.equals(_vehicleGroupInitial,
					vehicleGroupInitialWrapper._vehicleGroupInitial)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public VehicleGroupInitial getWrappedVehicleGroupInitial() {
		return _vehicleGroupInitial;
	}

	@Override
	public VehicleGroupInitial getWrappedModel() {
		return _vehicleGroupInitial;
	}

	@Override
	public void resetOriginalValues() {
		_vehicleGroupInitial.resetOriginalValues();
	}

	private VehicleGroupInitial _vehicleGroupInitial;
}