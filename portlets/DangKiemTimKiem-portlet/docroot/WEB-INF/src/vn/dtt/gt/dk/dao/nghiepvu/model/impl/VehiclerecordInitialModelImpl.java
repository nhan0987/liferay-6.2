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

import vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitialModel;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitialSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the VehiclerecordInitial service. Represents a row in the &quot;vr_vehiclerecord_initial&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitialModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VehiclerecordInitialImpl}.
 * </p>
 *
 * @author win_64
 * @see VehiclerecordInitialImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitialModel
 * @generated
 */
@JSON(strict = true)
public class VehiclerecordInitialModelImpl extends BaseModelImpl<VehiclerecordInitial>
	implements VehiclerecordInitialModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a vehiclerecord initial model instance should use the {@link vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial} interface instead.
	 */
	public static final String TABLE_NAME = "vr_vehiclerecord_initial";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "vehiclegroupid", Types.BIGINT },
			{ "sequenceno", Types.BIGINT },
			{ "codenumber", Types.BIGINT },
			{ "chassisnumber", Types.VARCHAR },
			{ "enginenumber", Types.VARCHAR },
			{ "productionyear", Types.BIGINT },
			{ "vehicleenginestatus", Types.VARCHAR },
			{ "vehiclecolor", Types.VARCHAR },
			{ "unitprice", Types.DOUBLE },
			{ "currency", Types.VARCHAR },
			{ "remarks", Types.VARCHAR },
			{ "confirmedinspectionid", Types.BIGINT },
			{ "inspectionrecordid", Types.BIGINT },
			{ "draftcertificateid", Types.BIGINT },
			{ "certificaterecordid", Types.BIGINT },
			{ "markupstatus", Types.BIGINT },
			{ "safetestrequirementid", Types.BIGINT },
			{ "emissiontestrequirementid", Types.BIGINT },
			{ "controlrequirementid", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table vr_vehiclerecord_initial (id LONG not null primary key,vehiclegroupid LONG,sequenceno LONG,codenumber LONG,chassisnumber VARCHAR(75) null,enginenumber VARCHAR(75) null,productionyear LONG,vehicleenginestatus VARCHAR(75) null,vehiclecolor VARCHAR(75) null,unitprice DOUBLE,currency VARCHAR(75) null,remarks VARCHAR(75) null,confirmedinspectionid LONG,inspectionrecordid LONG,draftcertificateid LONG,certificaterecordid LONG,markupstatus LONG,safetestrequirementid LONG,emissiontestrequirementid LONG,controlrequirementid LONG)";
	public static final String TABLE_SQL_DROP = "drop table vr_vehiclerecord_initial";
	public static final String ORDER_BY_JPQL = " ORDER BY vehiclerecordInitial.id DESC";
	public static final String ORDER_BY_SQL = " ORDER BY vr_vehiclerecord_initial.id DESC";
	public static final String DATA_SOURCE = "vrDataSource";
	public static final String SESSION_FACTORY = "vrSessionFactory";
	public static final String TX_MANAGER = "vrTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial"),
			true);
	public static long CODENUMBER_COLUMN_BITMASK = 1L;
	public static long VEHICLEGROUPID_COLUMN_BITMASK = 2L;
	public static long ID_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static VehiclerecordInitial toModel(
		VehiclerecordInitialSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		VehiclerecordInitial model = new VehiclerecordInitialImpl();

		model.setId(soapModel.getId());
		model.setVehicleGroupId(soapModel.getVehicleGroupId());
		model.setSequenceNo(soapModel.getSequenceNo());
		model.setCodeNumber(soapModel.getCodeNumber());
		model.setChassisNumber(soapModel.getChassisNumber());
		model.setEngineNumber(soapModel.getEngineNumber());
		model.setProductionYear(soapModel.getProductionYear());
		model.setVehicleEngineStatus(soapModel.getVehicleEngineStatus());
		model.setVehicleColor(soapModel.getVehicleColor());
		model.setUnitPrice(soapModel.getUnitPrice());
		model.setCurrency(soapModel.getCurrency());
		model.setRemarks(soapModel.getRemarks());
		model.setConfirmedInspectionId(soapModel.getConfirmedInspectionId());
		model.setInspectionRecordId(soapModel.getInspectionRecordId());
		model.setDraftCertificateId(soapModel.getDraftCertificateId());
		model.setCertificateRecordId(soapModel.getCertificateRecordId());
		model.setMarkUpStatus(soapModel.getMarkUpStatus());
		model.setSafeTestRequirementId(soapModel.getSafeTestRequirementId());
		model.setEmissionTestRequirementId(soapModel.getEmissionTestRequirementId());
		model.setControlRequirementId(soapModel.getControlRequirementId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<VehiclerecordInitial> toModels(
		VehiclerecordInitialSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<VehiclerecordInitial> models = new ArrayList<VehiclerecordInitial>(soapModels.length);

		for (VehiclerecordInitialSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial"));

	public VehiclerecordInitialModelImpl() {
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
		return VehiclerecordInitial.class;
	}

	@Override
	public String getModelClassName() {
		return VehiclerecordInitial.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("vehicleGroupId", getVehicleGroupId());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("codeNumber", getCodeNumber());
		attributes.put("chassisNumber", getChassisNumber());
		attributes.put("engineNumber", getEngineNumber());
		attributes.put("productionYear", getProductionYear());
		attributes.put("vehicleEngineStatus", getVehicleEngineStatus());
		attributes.put("vehicleColor", getVehicleColor());
		attributes.put("unitPrice", getUnitPrice());
		attributes.put("currency", getCurrency());
		attributes.put("remarks", getRemarks());
		attributes.put("confirmedInspectionId", getConfirmedInspectionId());
		attributes.put("inspectionRecordId", getInspectionRecordId());
		attributes.put("draftCertificateId", getDraftCertificateId());
		attributes.put("certificateRecordId", getCertificateRecordId());
		attributes.put("markUpStatus", getMarkUpStatus());
		attributes.put("safeTestRequirementId", getSafeTestRequirementId());
		attributes.put("emissionTestRequirementId",
			getEmissionTestRequirementId());
		attributes.put("controlRequirementId", getControlRequirementId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long vehicleGroupId = (Long)attributes.get("vehicleGroupId");

		if (vehicleGroupId != null) {
			setVehicleGroupId(vehicleGroupId);
		}

		Long sequenceNo = (Long)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}

		Long codeNumber = (Long)attributes.get("codeNumber");

		if (codeNumber != null) {
			setCodeNumber(codeNumber);
		}

		String chassisNumber = (String)attributes.get("chassisNumber");

		if (chassisNumber != null) {
			setChassisNumber(chassisNumber);
		}

		String engineNumber = (String)attributes.get("engineNumber");

		if (engineNumber != null) {
			setEngineNumber(engineNumber);
		}

		Long productionYear = (Long)attributes.get("productionYear");

		if (productionYear != null) {
			setProductionYear(productionYear);
		}

		String vehicleEngineStatus = (String)attributes.get(
				"vehicleEngineStatus");

		if (vehicleEngineStatus != null) {
			setVehicleEngineStatus(vehicleEngineStatus);
		}

		String vehicleColor = (String)attributes.get("vehicleColor");

		if (vehicleColor != null) {
			setVehicleColor(vehicleColor);
		}

		Double unitPrice = (Double)attributes.get("unitPrice");

		if (unitPrice != null) {
			setUnitPrice(unitPrice);
		}

		String currency = (String)attributes.get("currency");

		if (currency != null) {
			setCurrency(currency);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		Long confirmedInspectionId = (Long)attributes.get(
				"confirmedInspectionId");

		if (confirmedInspectionId != null) {
			setConfirmedInspectionId(confirmedInspectionId);
		}

		Long inspectionRecordId = (Long)attributes.get("inspectionRecordId");

		if (inspectionRecordId != null) {
			setInspectionRecordId(inspectionRecordId);
		}

		Long draftCertificateId = (Long)attributes.get("draftCertificateId");

		if (draftCertificateId != null) {
			setDraftCertificateId(draftCertificateId);
		}

		Long certificateRecordId = (Long)attributes.get("certificateRecordId");

		if (certificateRecordId != null) {
			setCertificateRecordId(certificateRecordId);
		}

		Long markUpStatus = (Long)attributes.get("markUpStatus");

		if (markUpStatus != null) {
			setMarkUpStatus(markUpStatus);
		}

		Long safeTestRequirementId = (Long)attributes.get(
				"safeTestRequirementId");

		if (safeTestRequirementId != null) {
			setSafeTestRequirementId(safeTestRequirementId);
		}

		Long emissionTestRequirementId = (Long)attributes.get(
				"emissionTestRequirementId");

		if (emissionTestRequirementId != null) {
			setEmissionTestRequirementId(emissionTestRequirementId);
		}

		Long controlRequirementId = (Long)attributes.get("controlRequirementId");

		if (controlRequirementId != null) {
			setControlRequirementId(controlRequirementId);
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
	public long getVehicleGroupId() {
		return _vehicleGroupId;
	}

	@Override
	public void setVehicleGroupId(long vehicleGroupId) {
		_columnBitmask |= VEHICLEGROUPID_COLUMN_BITMASK;

		if (!_setOriginalVehicleGroupId) {
			_setOriginalVehicleGroupId = true;

			_originalVehicleGroupId = _vehicleGroupId;
		}

		_vehicleGroupId = vehicleGroupId;
	}

	public long getOriginalVehicleGroupId() {
		return _originalVehicleGroupId;
	}

	@JSON
	@Override
	public long getSequenceNo() {
		return _sequenceNo;
	}

	@Override
	public void setSequenceNo(long sequenceNo) {
		_sequenceNo = sequenceNo;
	}

	@JSON
	@Override
	public long getCodeNumber() {
		return _codeNumber;
	}

	@Override
	public void setCodeNumber(long codeNumber) {
		_columnBitmask |= CODENUMBER_COLUMN_BITMASK;

		if (!_setOriginalCodeNumber) {
			_setOriginalCodeNumber = true;

			_originalCodeNumber = _codeNumber;
		}

		_codeNumber = codeNumber;
	}

	public long getOriginalCodeNumber() {
		return _originalCodeNumber;
	}

	@JSON
	@Override
	public String getChassisNumber() {
		if (_chassisNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _chassisNumber;
		}
	}

	@Override
	public void setChassisNumber(String chassisNumber) {
		_chassisNumber = chassisNumber;
	}

	@JSON
	@Override
	public String getEngineNumber() {
		if (_engineNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _engineNumber;
		}
	}

	@Override
	public void setEngineNumber(String engineNumber) {
		_engineNumber = engineNumber;
	}

	@JSON
	@Override
	public long getProductionYear() {
		return _productionYear;
	}

	@Override
	public void setProductionYear(long productionYear) {
		_productionYear = productionYear;
	}

	@JSON
	@Override
	public String getVehicleEngineStatus() {
		if (_vehicleEngineStatus == null) {
			return StringPool.BLANK;
		}
		else {
			return _vehicleEngineStatus;
		}
	}

	@Override
	public void setVehicleEngineStatus(String vehicleEngineStatus) {
		_vehicleEngineStatus = vehicleEngineStatus;
	}

	@JSON
	@Override
	public String getVehicleColor() {
		if (_vehicleColor == null) {
			return StringPool.BLANK;
		}
		else {
			return _vehicleColor;
		}
	}

	@Override
	public void setVehicleColor(String vehicleColor) {
		_vehicleColor = vehicleColor;
	}

	@JSON
	@Override
	public double getUnitPrice() {
		return _unitPrice;
	}

	@Override
	public void setUnitPrice(double unitPrice) {
		_unitPrice = unitPrice;
	}

	@JSON
	@Override
	public String getCurrency() {
		if (_currency == null) {
			return StringPool.BLANK;
		}
		else {
			return _currency;
		}
	}

	@Override
	public void setCurrency(String currency) {
		_currency = currency;
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
	public long getConfirmedInspectionId() {
		return _confirmedInspectionId;
	}

	@Override
	public void setConfirmedInspectionId(long confirmedInspectionId) {
		_confirmedInspectionId = confirmedInspectionId;
	}

	@JSON
	@Override
	public long getInspectionRecordId() {
		return _inspectionRecordId;
	}

	@Override
	public void setInspectionRecordId(long inspectionRecordId) {
		_inspectionRecordId = inspectionRecordId;
	}

	@JSON
	@Override
	public long getDraftCertificateId() {
		return _draftCertificateId;
	}

	@Override
	public void setDraftCertificateId(long draftCertificateId) {
		_draftCertificateId = draftCertificateId;
	}

	@JSON
	@Override
	public long getCertificateRecordId() {
		return _certificateRecordId;
	}

	@Override
	public void setCertificateRecordId(long certificateRecordId) {
		_certificateRecordId = certificateRecordId;
	}

	@JSON
	@Override
	public long getMarkUpStatus() {
		return _markUpStatus;
	}

	@Override
	public void setMarkUpStatus(long markUpStatus) {
		_markUpStatus = markUpStatus;
	}

	@JSON
	@Override
	public long getSafeTestRequirementId() {
		return _safeTestRequirementId;
	}

	@Override
	public void setSafeTestRequirementId(long safeTestRequirementId) {
		_safeTestRequirementId = safeTestRequirementId;
	}

	@JSON
	@Override
	public long getEmissionTestRequirementId() {
		return _emissionTestRequirementId;
	}

	@Override
	public void setEmissionTestRequirementId(long emissionTestRequirementId) {
		_emissionTestRequirementId = emissionTestRequirementId;
	}

	@JSON
	@Override
	public long getControlRequirementId() {
		return _controlRequirementId;
	}

	@Override
	public void setControlRequirementId(long controlRequirementId) {
		_controlRequirementId = controlRequirementId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			VehiclerecordInitial.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public VehiclerecordInitial toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (VehiclerecordInitial)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		VehiclerecordInitialImpl vehiclerecordInitialImpl = new VehiclerecordInitialImpl();

		vehiclerecordInitialImpl.setId(getId());
		vehiclerecordInitialImpl.setVehicleGroupId(getVehicleGroupId());
		vehiclerecordInitialImpl.setSequenceNo(getSequenceNo());
		vehiclerecordInitialImpl.setCodeNumber(getCodeNumber());
		vehiclerecordInitialImpl.setChassisNumber(getChassisNumber());
		vehiclerecordInitialImpl.setEngineNumber(getEngineNumber());
		vehiclerecordInitialImpl.setProductionYear(getProductionYear());
		vehiclerecordInitialImpl.setVehicleEngineStatus(getVehicleEngineStatus());
		vehiclerecordInitialImpl.setVehicleColor(getVehicleColor());
		vehiclerecordInitialImpl.setUnitPrice(getUnitPrice());
		vehiclerecordInitialImpl.setCurrency(getCurrency());
		vehiclerecordInitialImpl.setRemarks(getRemarks());
		vehiclerecordInitialImpl.setConfirmedInspectionId(getConfirmedInspectionId());
		vehiclerecordInitialImpl.setInspectionRecordId(getInspectionRecordId());
		vehiclerecordInitialImpl.setDraftCertificateId(getDraftCertificateId());
		vehiclerecordInitialImpl.setCertificateRecordId(getCertificateRecordId());
		vehiclerecordInitialImpl.setMarkUpStatus(getMarkUpStatus());
		vehiclerecordInitialImpl.setSafeTestRequirementId(getSafeTestRequirementId());
		vehiclerecordInitialImpl.setEmissionTestRequirementId(getEmissionTestRequirementId());
		vehiclerecordInitialImpl.setControlRequirementId(getControlRequirementId());

		vehiclerecordInitialImpl.resetOriginalValues();

		return vehiclerecordInitialImpl;
	}

	@Override
	public int compareTo(VehiclerecordInitial vehiclerecordInitial) {
		int value = 0;

		if (getId() < vehiclerecordInitial.getId()) {
			value = -1;
		}
		else if (getId() > vehiclerecordInitial.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

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

		if (!(obj instanceof VehiclerecordInitial)) {
			return false;
		}

		VehiclerecordInitial vehiclerecordInitial = (VehiclerecordInitial)obj;

		long primaryKey = vehiclerecordInitial.getPrimaryKey();

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
		VehiclerecordInitialModelImpl vehiclerecordInitialModelImpl = this;

		vehiclerecordInitialModelImpl._originalVehicleGroupId = vehiclerecordInitialModelImpl._vehicleGroupId;

		vehiclerecordInitialModelImpl._setOriginalVehicleGroupId = false;

		vehiclerecordInitialModelImpl._originalCodeNumber = vehiclerecordInitialModelImpl._codeNumber;

		vehiclerecordInitialModelImpl._setOriginalCodeNumber = false;

		vehiclerecordInitialModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<VehiclerecordInitial> toCacheModel() {
		VehiclerecordInitialCacheModel vehiclerecordInitialCacheModel = new VehiclerecordInitialCacheModel();

		vehiclerecordInitialCacheModel.id = getId();

		vehiclerecordInitialCacheModel.vehicleGroupId = getVehicleGroupId();

		vehiclerecordInitialCacheModel.sequenceNo = getSequenceNo();

		vehiclerecordInitialCacheModel.codeNumber = getCodeNumber();

		vehiclerecordInitialCacheModel.chassisNumber = getChassisNumber();

		String chassisNumber = vehiclerecordInitialCacheModel.chassisNumber;

		if ((chassisNumber != null) && (chassisNumber.length() == 0)) {
			vehiclerecordInitialCacheModel.chassisNumber = null;
		}

		vehiclerecordInitialCacheModel.engineNumber = getEngineNumber();

		String engineNumber = vehiclerecordInitialCacheModel.engineNumber;

		if ((engineNumber != null) && (engineNumber.length() == 0)) {
			vehiclerecordInitialCacheModel.engineNumber = null;
		}

		vehiclerecordInitialCacheModel.productionYear = getProductionYear();

		vehiclerecordInitialCacheModel.vehicleEngineStatus = getVehicleEngineStatus();

		String vehicleEngineStatus = vehiclerecordInitialCacheModel.vehicleEngineStatus;

		if ((vehicleEngineStatus != null) &&
				(vehicleEngineStatus.length() == 0)) {
			vehiclerecordInitialCacheModel.vehicleEngineStatus = null;
		}

		vehiclerecordInitialCacheModel.vehicleColor = getVehicleColor();

		String vehicleColor = vehiclerecordInitialCacheModel.vehicleColor;

		if ((vehicleColor != null) && (vehicleColor.length() == 0)) {
			vehiclerecordInitialCacheModel.vehicleColor = null;
		}

		vehiclerecordInitialCacheModel.unitPrice = getUnitPrice();

		vehiclerecordInitialCacheModel.currency = getCurrency();

		String currency = vehiclerecordInitialCacheModel.currency;

		if ((currency != null) && (currency.length() == 0)) {
			vehiclerecordInitialCacheModel.currency = null;
		}

		vehiclerecordInitialCacheModel.remarks = getRemarks();

		String remarks = vehiclerecordInitialCacheModel.remarks;

		if ((remarks != null) && (remarks.length() == 0)) {
			vehiclerecordInitialCacheModel.remarks = null;
		}

		vehiclerecordInitialCacheModel.confirmedInspectionId = getConfirmedInspectionId();

		vehiclerecordInitialCacheModel.inspectionRecordId = getInspectionRecordId();

		vehiclerecordInitialCacheModel.draftCertificateId = getDraftCertificateId();

		vehiclerecordInitialCacheModel.certificateRecordId = getCertificateRecordId();

		vehiclerecordInitialCacheModel.markUpStatus = getMarkUpStatus();

		vehiclerecordInitialCacheModel.safeTestRequirementId = getSafeTestRequirementId();

		vehiclerecordInitialCacheModel.emissionTestRequirementId = getEmissionTestRequirementId();

		vehiclerecordInitialCacheModel.controlRequirementId = getControlRequirementId();

		return vehiclerecordInitialCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", vehicleGroupId=");
		sb.append(getVehicleGroupId());
		sb.append(", sequenceNo=");
		sb.append(getSequenceNo());
		sb.append(", codeNumber=");
		sb.append(getCodeNumber());
		sb.append(", chassisNumber=");
		sb.append(getChassisNumber());
		sb.append(", engineNumber=");
		sb.append(getEngineNumber());
		sb.append(", productionYear=");
		sb.append(getProductionYear());
		sb.append(", vehicleEngineStatus=");
		sb.append(getVehicleEngineStatus());
		sb.append(", vehicleColor=");
		sb.append(getVehicleColor());
		sb.append(", unitPrice=");
		sb.append(getUnitPrice());
		sb.append(", currency=");
		sb.append(getCurrency());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append(", confirmedInspectionId=");
		sb.append(getConfirmedInspectionId());
		sb.append(", inspectionRecordId=");
		sb.append(getInspectionRecordId());
		sb.append(", draftCertificateId=");
		sb.append(getDraftCertificateId());
		sb.append(", certificateRecordId=");
		sb.append(getCertificateRecordId());
		sb.append(", markUpStatus=");
		sb.append(getMarkUpStatus());
		sb.append(", safeTestRequirementId=");
		sb.append(getSafeTestRequirementId());
		sb.append(", emissionTestRequirementId=");
		sb.append(getEmissionTestRequirementId());
		sb.append(", controlRequirementId=");
		sb.append(getControlRequirementId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(64);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicleGroupId</column-name><column-value><![CDATA[");
		sb.append(getVehicleGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sequenceNo</column-name><column-value><![CDATA[");
		sb.append(getSequenceNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>codeNumber</column-name><column-value><![CDATA[");
		sb.append(getCodeNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chassisNumber</column-name><column-value><![CDATA[");
		sb.append(getChassisNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>engineNumber</column-name><column-value><![CDATA[");
		sb.append(getEngineNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productionYear</column-name><column-value><![CDATA[");
		sb.append(getProductionYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicleEngineStatus</column-name><column-value><![CDATA[");
		sb.append(getVehicleEngineStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicleColor</column-name><column-value><![CDATA[");
		sb.append(getVehicleColor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitPrice</column-name><column-value><![CDATA[");
		sb.append(getUnitPrice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currency</column-name><column-value><![CDATA[");
		sb.append(getCurrency());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>confirmedInspectionId</column-name><column-value><![CDATA[");
		sb.append(getConfirmedInspectionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionRecordId</column-name><column-value><![CDATA[");
		sb.append(getInspectionRecordId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>draftCertificateId</column-name><column-value><![CDATA[");
		sb.append(getDraftCertificateId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateRecordId</column-name><column-value><![CDATA[");
		sb.append(getCertificateRecordId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markUpStatus</column-name><column-value><![CDATA[");
		sb.append(getMarkUpStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>safeTestRequirementId</column-name><column-value><![CDATA[");
		sb.append(getSafeTestRequirementId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emissionTestRequirementId</column-name><column-value><![CDATA[");
		sb.append(getEmissionTestRequirementId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>controlRequirementId</column-name><column-value><![CDATA[");
		sb.append(getControlRequirementId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = VehiclerecordInitial.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			VehiclerecordInitial.class
		};
	private long _id;
	private long _vehicleGroupId;
	private long _originalVehicleGroupId;
	private boolean _setOriginalVehicleGroupId;
	private long _sequenceNo;
	private long _codeNumber;
	private long _originalCodeNumber;
	private boolean _setOriginalCodeNumber;
	private String _chassisNumber;
	private String _engineNumber;
	private long _productionYear;
	private String _vehicleEngineStatus;
	private String _vehicleColor;
	private double _unitPrice;
	private String _currency;
	private String _remarks;
	private long _confirmedInspectionId;
	private long _inspectionRecordId;
	private long _draftCertificateId;
	private long _certificateRecordId;
	private long _markUpStatus;
	private long _safeTestRequirementId;
	private long _emissionTestRequirementId;
	private long _controlRequirementId;
	private long _columnBitmask;
	private VehiclerecordInitial _escapedModel;
}