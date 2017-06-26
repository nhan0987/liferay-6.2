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

package vn.dtt.gt.dk.dao.nghiepvu.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupModel;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the VehicleGroup service. Represents a row in the &quot;vr_vehiclegroup&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VehicleGroupImpl}.
 * </p>
 *
 * @author huymq
 * @see VehicleGroupImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupModel
 * @generated
 */
@JSON(strict = true)
public class VehicleGroupModelImpl extends BaseModelImpl<VehicleGroup>
	implements VehicleGroupModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a vehicle group model instance should use the {@link vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup} interface instead.
	 */
	public static final String TABLE_NAME = "vr_vehiclegroup";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "vehicleclass", Types.VARCHAR },
			{ "registeredinspectionid", Types.BIGINT },
			{ "technicalspeccode", Types.VARCHAR },
			{ "referencecertificateno", Types.VARCHAR },
			{ "safetytestreportno", Types.VARCHAR },
			{ "emissiontestreportno", Types.VARCHAR },
			{ "copreportno", Types.VARCHAR },
			{ "vehicletype", Types.VARCHAR },
			{ "enginetype", Types.VARCHAR },
			{ "trademark", Types.VARCHAR },
			{ "markasvehicle", Types.INTEGER },
			{ "commercialname", Types.VARCHAR },
			{ "modelcode", Types.VARCHAR },
			{ "productionplant", Types.VARCHAR },
			{ "addressofproductionplant", Types.VARCHAR },
			{ "emissionstandard", Types.VARCHAR },
			{ "safetytestreportid", Types.BIGINT },
			{ "emissiontestreportid", Types.BIGINT },
			{ "copreportid", Types.BIGINT },
			{ "specificationversion", Types.BIGINT },
			{ "hosothutucid", Types.BIGINT },
			{ "remarks", Types.VARCHAR },
			{ "ATTACHEDFILE", Types.BIGINT },
			{ "synchdate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table vr_vehiclegroup (id LONG not null primary key,vehicleclass VARCHAR(75) null,registeredinspectionid LONG,technicalspeccode VARCHAR(75) null,referencecertificateno VARCHAR(75) null,safetytestreportno VARCHAR(75) null,emissiontestreportno VARCHAR(75) null,copreportno VARCHAR(75) null,vehicletype VARCHAR(75) null,enginetype VARCHAR(75) null,trademark VARCHAR(75) null,markasvehicle INTEGER,commercialname VARCHAR(75) null,modelcode VARCHAR(75) null,productionplant VARCHAR(75) null,addressofproductionplant VARCHAR(75) null,emissionstandard VARCHAR(75) null,safetytestreportid LONG,emissiontestreportid LONG,copreportid LONG,specificationversion LONG,hosothutucid LONG,remarks VARCHAR(75) null,ATTACHEDFILE LONG,synchdate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table vr_vehiclegroup";
	public static final String ORDER_BY_JPQL = " ORDER BY vehicleGroup.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY vr_vehiclegroup.id ASC";
	public static final String DATA_SOURCE = "vrDataSource";
	public static final String SESSION_FACTORY = "vrSessionFactory";
	public static final String TX_MANAGER = "vrTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup"),
			true);
	public static long HOSOTHUTUCID_COLUMN_BITMASK = 1L;
	public static long REGISTEREDINSPECTIONID_COLUMN_BITMASK = 2L;
	public static long TECHNICALSPECCODE_COLUMN_BITMASK = 4L;
	public static long ID_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static VehicleGroup toModel(VehicleGroupSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		VehicleGroup model = new VehicleGroupImpl();

		model.setId(soapModel.getId());
		model.setVehicleClass(soapModel.getVehicleClass());
		model.setRegisteredInspectionId(soapModel.getRegisteredInspectionId());
		model.setTechnicalSpecCode(soapModel.getTechnicalSpecCode());
		model.setReferenceCertificateNo(soapModel.getReferenceCertificateNo());
		model.setSafetytestreportNo(soapModel.getSafetytestreportNo());
		model.setEmissiontestreportNo(soapModel.getEmissiontestreportNo());
		model.setCopreportNo(soapModel.getCopreportNo());
		model.setVehicleType(soapModel.getVehicleType());
		model.setEngineType(soapModel.getEngineType());
		model.setTradeMark(soapModel.getTradeMark());
		model.setMarkAsVehicle(soapModel.getMarkAsVehicle());
		model.setCommercialName(soapModel.getCommercialName());
		model.setModelCode(soapModel.getModelCode());
		model.setProductionPlant(soapModel.getProductionPlant());
		model.setAddressOfProductionPlant(soapModel.getAddressOfProductionPlant());
		model.setEmissionStandard(soapModel.getEmissionStandard());
		model.setSafetyTestReportId(soapModel.getSafetyTestReportId());
		model.setEmissionTestReportId(soapModel.getEmissionTestReportId());
		model.setCopReportId(soapModel.getCopReportId());
		model.setSpecificationVersion(soapModel.getSpecificationVersion());
		model.setHoSoThuTucId(soapModel.getHoSoThuTucId());
		model.setRemarks(soapModel.getRemarks());
		model.setAttachedFile(soapModel.getAttachedFile());
		model.setSynchdate(soapModel.getSynchdate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<VehicleGroup> toModels(VehicleGroupSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<VehicleGroup> models = new ArrayList<VehicleGroup>(soapModels.length);

		for (VehicleGroupSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup"));

	public VehicleGroupModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@JSON
	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_columnBitmask = -1L;

		_id = id;
	}

	@JSON
	@Override
	public String getVehicleClass() {
		if (_vehicleClass == null) {
			return StringPool.BLANK;
		}
		else {
			return _vehicleClass;
		}
	}

	@Override
	public void setVehicleClass(String vehicleClass) {
		_vehicleClass = vehicleClass;
	}

	@JSON
	@Override
	public long getRegisteredInspectionId() {
		return _registeredInspectionId;
	}

	@Override
	public void setRegisteredInspectionId(long registeredInspectionId) {
		_columnBitmask |= REGISTEREDINSPECTIONID_COLUMN_BITMASK;

		if (!_setOriginalRegisteredInspectionId) {
			_setOriginalRegisteredInspectionId = true;

			_originalRegisteredInspectionId = _registeredInspectionId;
		}

		_registeredInspectionId = registeredInspectionId;
	}

	public long getOriginalRegisteredInspectionId() {
		return _originalRegisteredInspectionId;
	}

	@JSON
	@Override
	public String getTechnicalSpecCode() {
		if (_technicalSpecCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _technicalSpecCode;
		}
	}

	@Override
	public void setTechnicalSpecCode(String technicalSpecCode) {
		_columnBitmask |= TECHNICALSPECCODE_COLUMN_BITMASK;

		if (_originalTechnicalSpecCode == null) {
			_originalTechnicalSpecCode = _technicalSpecCode;
		}

		_technicalSpecCode = technicalSpecCode;
	}

	public String getOriginalTechnicalSpecCode() {
		return GetterUtil.getString(_originalTechnicalSpecCode);
	}

	@JSON
	@Override
	public String getReferenceCertificateNo() {
		if (_referenceCertificateNo == null) {
			return StringPool.BLANK;
		}
		else {
			return _referenceCertificateNo;
		}
	}

	@Override
	public void setReferenceCertificateNo(String referenceCertificateNo) {
		_referenceCertificateNo = referenceCertificateNo;
	}

	@JSON
	@Override
	public String getSafetytestreportNo() {
		if (_safetytestreportNo == null) {
			return StringPool.BLANK;
		}
		else {
			return _safetytestreportNo;
		}
	}

	@Override
	public void setSafetytestreportNo(String safetytestreportNo) {
		_safetytestreportNo = safetytestreportNo;
	}

	@JSON
	@Override
	public String getEmissiontestreportNo() {
		if (_emissiontestreportNo == null) {
			return StringPool.BLANK;
		}
		else {
			return _emissiontestreportNo;
		}
	}

	@Override
	public void setEmissiontestreportNo(String emissiontestreportNo) {
		_emissiontestreportNo = emissiontestreportNo;
	}

	@JSON
	@Override
	public String getCopreportNo() {
		if (_copreportNo == null) {
			return StringPool.BLANK;
		}
		else {
			return _copreportNo;
		}
	}

	@Override
	public void setCopreportNo(String copreportNo) {
		_copreportNo = copreportNo;
	}

	@JSON
	@Override
	public String getVehicleType() {
		if (_vehicleType == null) {
			return StringPool.BLANK;
		}
		else {
			return _vehicleType;
		}
	}

	@Override
	public void setVehicleType(String vehicleType) {
		_vehicleType = vehicleType;
	}

	@JSON
	@Override
	public String getEngineType() {
		if (_engineType == null) {
			return StringPool.BLANK;
		}
		else {
			return _engineType;
		}
	}

	@Override
	public void setEngineType(String engineType) {
		_engineType = engineType;
	}

	@JSON
	@Override
	public String getTradeMark() {
		if (_tradeMark == null) {
			return StringPool.BLANK;
		}
		else {
			return _tradeMark;
		}
	}

	@Override
	public void setTradeMark(String tradeMark) {
		_tradeMark = tradeMark;
	}

	@JSON
	@Override
	public int getMarkAsVehicle() {
		return _markAsVehicle;
	}

	@Override
	public void setMarkAsVehicle(int markAsVehicle) {
		_markAsVehicle = markAsVehicle;
	}

	@JSON
	@Override
	public String getCommercialName() {
		if (_commercialName == null) {
			return StringPool.BLANK;
		}
		else {
			return _commercialName;
		}
	}

	@Override
	public void setCommercialName(String commercialName) {
		_commercialName = commercialName;
	}

	@JSON
	@Override
	public String getModelCode() {
		if (_modelCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _modelCode;
		}
	}

	@Override
	public void setModelCode(String modelCode) {
		_modelCode = modelCode;
	}

	@JSON
	@Override
	public String getProductionPlant() {
		if (_productionPlant == null) {
			return StringPool.BLANK;
		}
		else {
			return _productionPlant;
		}
	}

	@Override
	public void setProductionPlant(String productionPlant) {
		_productionPlant = productionPlant;
	}

	@JSON
	@Override
	public String getAddressOfProductionPlant() {
		if (_addressOfProductionPlant == null) {
			return StringPool.BLANK;
		}
		else {
			return _addressOfProductionPlant;
		}
	}

	@Override
	public void setAddressOfProductionPlant(String addressOfProductionPlant) {
		_addressOfProductionPlant = addressOfProductionPlant;
	}

	@JSON
	@Override
	public String getEmissionStandard() {
		if (_emissionStandard == null) {
			return StringPool.BLANK;
		}
		else {
			return _emissionStandard;
		}
	}

	@Override
	public void setEmissionStandard(String emissionStandard) {
		_emissionStandard = emissionStandard;
	}

	@JSON
	@Override
	public long getSafetyTestReportId() {
		return _safetyTestReportId;
	}

	@Override
	public void setSafetyTestReportId(long safetyTestReportId) {
		_safetyTestReportId = safetyTestReportId;
	}

	@JSON
	@Override
	public long getEmissionTestReportId() {
		return _emissionTestReportId;
	}

	@Override
	public void setEmissionTestReportId(long emissionTestReportId) {
		_emissionTestReportId = emissionTestReportId;
	}

	@JSON
	@Override
	public long getCopReportId() {
		return _copReportId;
	}

	@Override
	public void setCopReportId(long copReportId) {
		_copReportId = copReportId;
	}

	@JSON
	@Override
	public long getSpecificationVersion() {
		return _specificationVersion;
	}

	@Override
	public void setSpecificationVersion(long specificationVersion) {
		_specificationVersion = specificationVersion;
	}

	@JSON
	@Override
	public long getHoSoThuTucId() {
		return _hoSoThuTucId;
	}

	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_columnBitmask |= HOSOTHUTUCID_COLUMN_BITMASK;

		if (!_setOriginalHoSoThuTucId) {
			_setOriginalHoSoThuTucId = true;

			_originalHoSoThuTucId = _hoSoThuTucId;
		}

		_hoSoThuTucId = hoSoThuTucId;
	}

	public long getOriginalHoSoThuTucId() {
		return _originalHoSoThuTucId;
	}

	@JSON
	@Override
	public String getRemarks() {
		if (_remarks == null) {
			return StringPool.BLANK;
		}
		else {
			return _remarks;
		}
	}

	@Override
	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	@JSON
	@Override
	public long getAttachedFile() {
		return _attachedFile;
	}

	@Override
	public void setAttachedFile(long attachedFile) {
		_attachedFile = attachedFile;
	}

	@JSON
	@Override
	public Date getSynchdate() {
		return _synchdate;
	}

	@Override
	public void setSynchdate(Date synchdate) {
		_synchdate = synchdate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			VehicleGroup.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public VehicleGroup toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (VehicleGroup)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		VehicleGroupImpl vehicleGroupImpl = new VehicleGroupImpl();

		vehicleGroupImpl.setId(getId());
		vehicleGroupImpl.setVehicleClass(getVehicleClass());
		vehicleGroupImpl.setRegisteredInspectionId(getRegisteredInspectionId());
		vehicleGroupImpl.setTechnicalSpecCode(getTechnicalSpecCode());
		vehicleGroupImpl.setReferenceCertificateNo(getReferenceCertificateNo());
		vehicleGroupImpl.setSafetytestreportNo(getSafetytestreportNo());
		vehicleGroupImpl.setEmissiontestreportNo(getEmissiontestreportNo());
		vehicleGroupImpl.setCopreportNo(getCopreportNo());
		vehicleGroupImpl.setVehicleType(getVehicleType());
		vehicleGroupImpl.setEngineType(getEngineType());
		vehicleGroupImpl.setTradeMark(getTradeMark());
		vehicleGroupImpl.setMarkAsVehicle(getMarkAsVehicle());
		vehicleGroupImpl.setCommercialName(getCommercialName());
		vehicleGroupImpl.setModelCode(getModelCode());
		vehicleGroupImpl.setProductionPlant(getProductionPlant());
		vehicleGroupImpl.setAddressOfProductionPlant(getAddressOfProductionPlant());
		vehicleGroupImpl.setEmissionStandard(getEmissionStandard());
		vehicleGroupImpl.setSafetyTestReportId(getSafetyTestReportId());
		vehicleGroupImpl.setEmissionTestReportId(getEmissionTestReportId());
		vehicleGroupImpl.setCopReportId(getCopReportId());
		vehicleGroupImpl.setSpecificationVersion(getSpecificationVersion());
		vehicleGroupImpl.setHoSoThuTucId(getHoSoThuTucId());
		vehicleGroupImpl.setRemarks(getRemarks());
		vehicleGroupImpl.setAttachedFile(getAttachedFile());
		vehicleGroupImpl.setSynchdate(getSynchdate());

		vehicleGroupImpl.resetOriginalValues();

		return vehicleGroupImpl;
	}

	@Override
	public int compareTo(VehicleGroup vehicleGroup) {
		int value = 0;

		if (getId() < vehicleGroup.getId()) {
			value = -1;
		}
		else if (getId() > vehicleGroup.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VehicleGroup)) {
			return false;
		}

		VehicleGroup vehicleGroup = (VehicleGroup)obj;

		long primaryKey = vehicleGroup.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		VehicleGroupModelImpl vehicleGroupModelImpl = this;

		vehicleGroupModelImpl._originalRegisteredInspectionId = vehicleGroupModelImpl._registeredInspectionId;

		vehicleGroupModelImpl._setOriginalRegisteredInspectionId = false;

		vehicleGroupModelImpl._originalTechnicalSpecCode = vehicleGroupModelImpl._technicalSpecCode;

		vehicleGroupModelImpl._originalHoSoThuTucId = vehicleGroupModelImpl._hoSoThuTucId;

		vehicleGroupModelImpl._setOriginalHoSoThuTucId = false;

		vehicleGroupModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<VehicleGroup> toCacheModel() {
		VehicleGroupCacheModel vehicleGroupCacheModel = new VehicleGroupCacheModel();

		vehicleGroupCacheModel.id = getId();

		vehicleGroupCacheModel.vehicleClass = getVehicleClass();

		String vehicleClass = vehicleGroupCacheModel.vehicleClass;

		if ((vehicleClass != null) && (vehicleClass.length() == 0)) {
			vehicleGroupCacheModel.vehicleClass = null;
		}

		vehicleGroupCacheModel.registeredInspectionId = getRegisteredInspectionId();

		vehicleGroupCacheModel.technicalSpecCode = getTechnicalSpecCode();

		String technicalSpecCode = vehicleGroupCacheModel.technicalSpecCode;

		if ((technicalSpecCode != null) && (technicalSpecCode.length() == 0)) {
			vehicleGroupCacheModel.technicalSpecCode = null;
		}

		vehicleGroupCacheModel.referenceCertificateNo = getReferenceCertificateNo();

		String referenceCertificateNo = vehicleGroupCacheModel.referenceCertificateNo;

		if ((referenceCertificateNo != null) &&
				(referenceCertificateNo.length() == 0)) {
			vehicleGroupCacheModel.referenceCertificateNo = null;
		}

		vehicleGroupCacheModel.safetytestreportNo = getSafetytestreportNo();

		String safetytestreportNo = vehicleGroupCacheModel.safetytestreportNo;

		if ((safetytestreportNo != null) && (safetytestreportNo.length() == 0)) {
			vehicleGroupCacheModel.safetytestreportNo = null;
		}

		vehicleGroupCacheModel.emissiontestreportNo = getEmissiontestreportNo();

		String emissiontestreportNo = vehicleGroupCacheModel.emissiontestreportNo;

		if ((emissiontestreportNo != null) &&
				(emissiontestreportNo.length() == 0)) {
			vehicleGroupCacheModel.emissiontestreportNo = null;
		}

		vehicleGroupCacheModel.copreportNo = getCopreportNo();

		String copreportNo = vehicleGroupCacheModel.copreportNo;

		if ((copreportNo != null) && (copreportNo.length() == 0)) {
			vehicleGroupCacheModel.copreportNo = null;
		}

		vehicleGroupCacheModel.vehicleType = getVehicleType();

		String vehicleType = vehicleGroupCacheModel.vehicleType;

		if ((vehicleType != null) && (vehicleType.length() == 0)) {
			vehicleGroupCacheModel.vehicleType = null;
		}

		vehicleGroupCacheModel.engineType = getEngineType();

		String engineType = vehicleGroupCacheModel.engineType;

		if ((engineType != null) && (engineType.length() == 0)) {
			vehicleGroupCacheModel.engineType = null;
		}

		vehicleGroupCacheModel.tradeMark = getTradeMark();

		String tradeMark = vehicleGroupCacheModel.tradeMark;

		if ((tradeMark != null) && (tradeMark.length() == 0)) {
			vehicleGroupCacheModel.tradeMark = null;
		}

		vehicleGroupCacheModel.markAsVehicle = getMarkAsVehicle();

		vehicleGroupCacheModel.commercialName = getCommercialName();

		String commercialName = vehicleGroupCacheModel.commercialName;

		if ((commercialName != null) && (commercialName.length() == 0)) {
			vehicleGroupCacheModel.commercialName = null;
		}

		vehicleGroupCacheModel.modelCode = getModelCode();

		String modelCode = vehicleGroupCacheModel.modelCode;

		if ((modelCode != null) && (modelCode.length() == 0)) {
			vehicleGroupCacheModel.modelCode = null;
		}

		vehicleGroupCacheModel.productionPlant = getProductionPlant();

		String productionPlant = vehicleGroupCacheModel.productionPlant;

		if ((productionPlant != null) && (productionPlant.length() == 0)) {
			vehicleGroupCacheModel.productionPlant = null;
		}

		vehicleGroupCacheModel.addressOfProductionPlant = getAddressOfProductionPlant();

		String addressOfProductionPlant = vehicleGroupCacheModel.addressOfProductionPlant;

		if ((addressOfProductionPlant != null) &&
				(addressOfProductionPlant.length() == 0)) {
			vehicleGroupCacheModel.addressOfProductionPlant = null;
		}

		vehicleGroupCacheModel.emissionStandard = getEmissionStandard();

		String emissionStandard = vehicleGroupCacheModel.emissionStandard;

		if ((emissionStandard != null) && (emissionStandard.length() == 0)) {
			vehicleGroupCacheModel.emissionStandard = null;
		}

		vehicleGroupCacheModel.safetyTestReportId = getSafetyTestReportId();

		vehicleGroupCacheModel.emissionTestReportId = getEmissionTestReportId();

		vehicleGroupCacheModel.copReportId = getCopReportId();

		vehicleGroupCacheModel.specificationVersion = getSpecificationVersion();

		vehicleGroupCacheModel.hoSoThuTucId = getHoSoThuTucId();

		vehicleGroupCacheModel.remarks = getRemarks();

		String remarks = vehicleGroupCacheModel.remarks;

		if ((remarks != null) && (remarks.length() == 0)) {
			vehicleGroupCacheModel.remarks = null;
		}

		vehicleGroupCacheModel.attachedFile = getAttachedFile();

		Date synchdate = getSynchdate();

		if (synchdate != null) {
			vehicleGroupCacheModel.synchdate = synchdate.getTime();
		}
		else {
			vehicleGroupCacheModel.synchdate = Long.MIN_VALUE;
		}

		return vehicleGroupCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(51);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", vehicleClass=");
		sb.append(getVehicleClass());
		sb.append(", registeredInspectionId=");
		sb.append(getRegisteredInspectionId());
		sb.append(", technicalSpecCode=");
		sb.append(getTechnicalSpecCode());
		sb.append(", referenceCertificateNo=");
		sb.append(getReferenceCertificateNo());
		sb.append(", safetytestreportNo=");
		sb.append(getSafetytestreportNo());
		sb.append(", emissiontestreportNo=");
		sb.append(getEmissiontestreportNo());
		sb.append(", copreportNo=");
		sb.append(getCopreportNo());
		sb.append(", vehicleType=");
		sb.append(getVehicleType());
		sb.append(", engineType=");
		sb.append(getEngineType());
		sb.append(", tradeMark=");
		sb.append(getTradeMark());
		sb.append(", markAsVehicle=");
		sb.append(getMarkAsVehicle());
		sb.append(", commercialName=");
		sb.append(getCommercialName());
		sb.append(", modelCode=");
		sb.append(getModelCode());
		sb.append(", productionPlant=");
		sb.append(getProductionPlant());
		sb.append(", addressOfProductionPlant=");
		sb.append(getAddressOfProductionPlant());
		sb.append(", emissionStandard=");
		sb.append(getEmissionStandard());
		sb.append(", safetyTestReportId=");
		sb.append(getSafetyTestReportId());
		sb.append(", emissionTestReportId=");
		sb.append(getEmissionTestReportId());
		sb.append(", copReportId=");
		sb.append(getCopReportId());
		sb.append(", specificationVersion=");
		sb.append(getSpecificationVersion());
		sb.append(", hoSoThuTucId=");
		sb.append(getHoSoThuTucId());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append(", attachedFile=");
		sb.append(getAttachedFile());
		sb.append(", synchdate=");
		sb.append(getSynchdate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(79);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicleClass</column-name><column-value><![CDATA[");
		sb.append(getVehicleClass());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registeredInspectionId</column-name><column-value><![CDATA[");
		sb.append(getRegisteredInspectionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>technicalSpecCode</column-name><column-value><![CDATA[");
		sb.append(getTechnicalSpecCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>referenceCertificateNo</column-name><column-value><![CDATA[");
		sb.append(getReferenceCertificateNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>safetytestreportNo</column-name><column-value><![CDATA[");
		sb.append(getSafetytestreportNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emissiontestreportNo</column-name><column-value><![CDATA[");
		sb.append(getEmissiontestreportNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>copreportNo</column-name><column-value><![CDATA[");
		sb.append(getCopreportNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicleType</column-name><column-value><![CDATA[");
		sb.append(getVehicleType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>engineType</column-name><column-value><![CDATA[");
		sb.append(getEngineType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tradeMark</column-name><column-value><![CDATA[");
		sb.append(getTradeMark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markAsVehicle</column-name><column-value><![CDATA[");
		sb.append(getMarkAsVehicle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>commercialName</column-name><column-value><![CDATA[");
		sb.append(getCommercialName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modelCode</column-name><column-value><![CDATA[");
		sb.append(getModelCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productionPlant</column-name><column-value><![CDATA[");
		sb.append(getProductionPlant());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>addressOfProductionPlant</column-name><column-value><![CDATA[");
		sb.append(getAddressOfProductionPlant());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emissionStandard</column-name><column-value><![CDATA[");
		sb.append(getEmissionStandard());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>safetyTestReportId</column-name><column-value><![CDATA[");
		sb.append(getSafetyTestReportId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emissionTestReportId</column-name><column-value><![CDATA[");
		sb.append(getEmissionTestReportId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>copReportId</column-name><column-value><![CDATA[");
		sb.append(getCopReportId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specificationVersion</column-name><column-value><![CDATA[");
		sb.append(getSpecificationVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoSoThuTucId</column-name><column-value><![CDATA[");
		sb.append(getHoSoThuTucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attachedFile</column-name><column-value><![CDATA[");
		sb.append(getAttachedFile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>synchdate</column-name><column-value><![CDATA[");
		sb.append(getSynchdate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = VehicleGroup.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			VehicleGroup.class
		};
	private long _id;
	private String _vehicleClass;
	private long _registeredInspectionId;
	private long _originalRegisteredInspectionId;
	private boolean _setOriginalRegisteredInspectionId;
	private String _technicalSpecCode;
	private String _originalTechnicalSpecCode;
	private String _referenceCertificateNo;
	private String _safetytestreportNo;
	private String _emissiontestreportNo;
	private String _copreportNo;
	private String _vehicleType;
	private String _engineType;
	private String _tradeMark;
	private int _markAsVehicle;
	private String _commercialName;
	private String _modelCode;
	private String _productionPlant;
	private String _addressOfProductionPlant;
	private String _emissionStandard;
	private long _safetyTestReportId;
	private long _emissionTestReportId;
	private long _copReportId;
	private long _specificationVersion;
	private long _hoSoThuTucId;
	private long _originalHoSoThuTucId;
	private boolean _setOriginalHoSoThuTucId;
	private String _remarks;
	private long _attachedFile;
	private Date _synchdate;
	private long _columnBitmask;
	private VehicleGroup _escapedModel;
}