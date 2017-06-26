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

import vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo;
import vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCoModel;
import vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCoSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the ViewTrungSoKhungDongCo service. Represents a row in the &quot;view_trungsokhungdongco&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCoModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ViewTrungSoKhungDongCoImpl}.
 * </p>
 *
 * @author win_64
 * @see ViewTrungSoKhungDongCoImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCoModel
 * @generated
 */
@JSON(strict = true)
public class ViewTrungSoKhungDongCoModelImpl extends BaseModelImpl<ViewTrungSoKhungDongCo>
	implements ViewTrungSoKhungDongCoModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a view trung so khung dong co model instance should use the {@link vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo} interface instead.
	 */
	public static final String TABLE_NAME = "view_trungsokhungdongco";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "vehiclegroupid", Types.BIGINT },
			{ "debitnoteid", Types.BIGINT },
			{ "sequenceno", Types.BIGINT },
			{ "codenumber", Types.BIGINT },
			{ "chassisnumber", Types.VARCHAR },
			{ "enginenumber", Types.VARCHAR },
			{ "productionyear", Types.VARCHAR },
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
			{ "controlrequirementid", Types.BIGINT },
			{ "MarkAsSample", Types.INTEGER },
			{ "registerednumber", Types.VARCHAR },
			{ "contactname", Types.VARCHAR },
			{ "contactphone", Types.VARCHAR },
			{ "inspectiondate", Types.TIMESTAMP },
			{ "importername", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table view_trungsokhungdongco (id LONG not null primary key,vehiclegroupid LONG,debitnoteid LONG,sequenceno LONG,codenumber LONG,chassisnumber VARCHAR(75) null,enginenumber VARCHAR(75) null,productionyear VARCHAR(75) null,vehicleenginestatus VARCHAR(75) null,vehiclecolor VARCHAR(75) null,unitprice DOUBLE,currency VARCHAR(75) null,remarks VARCHAR(75) null,confirmedinspectionid LONG,inspectionrecordid LONG,draftcertificateid LONG,certificaterecordid LONG,markupstatus LONG,safetestrequirementid LONG,emissiontestrequirementid LONG,controlrequirementid LONG,MarkAsSample INTEGER,registerednumber VARCHAR(75) null,contactname VARCHAR(75) null,contactphone VARCHAR(75) null,inspectiondate DATE null,importername VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table view_trungsokhungdongco";
	public static final String ORDER_BY_JPQL = " ORDER BY viewTrungSoKhungDongCo.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY view_trungsokhungdongco.id ASC";
	public static final String DATA_SOURCE = "vrDataSource";
	public static final String SESSION_FACTORY = "vrSessionFactory";
	public static final String TX_MANAGER = "vrTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static ViewTrungSoKhungDongCo toModel(
		ViewTrungSoKhungDongCoSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		ViewTrungSoKhungDongCo model = new ViewTrungSoKhungDongCoImpl();

		model.setId(soapModel.getId());
		model.setVehicleGroupId(soapModel.getVehicleGroupId());
		model.setDebitNoteId(soapModel.getDebitNoteId());
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
		model.setMarkAsSample(soapModel.getMarkAsSample());
		model.setRegisteredNumber(soapModel.getRegisteredNumber());
		model.setContactName(soapModel.getContactName());
		model.setContactPhone(soapModel.getContactPhone());
		model.setInspectionDate(soapModel.getInspectionDate());
		model.setImporterName(soapModel.getImporterName());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<ViewTrungSoKhungDongCo> toModels(
		ViewTrungSoKhungDongCoSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<ViewTrungSoKhungDongCo> models = new ArrayList<ViewTrungSoKhungDongCo>(soapModels.length);

		for (ViewTrungSoKhungDongCoSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo"));

	public ViewTrungSoKhungDongCoModelImpl() {
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
		return ViewTrungSoKhungDongCo.class;
	}

	@Override
	public String getModelClassName() {
		return ViewTrungSoKhungDongCo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("vehicleGroupId", getVehicleGroupId());
		attributes.put("debitNoteId", getDebitNoteId());
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
		attributes.put("markAsSample", getMarkAsSample());
		attributes.put("registeredNumber", getRegisteredNumber());
		attributes.put("contactName", getContactName());
		attributes.put("contactPhone", getContactPhone());
		attributes.put("inspectionDate", getInspectionDate());
		attributes.put("importerName", getImporterName());

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

		Long debitNoteId = (Long)attributes.get("debitNoteId");

		if (debitNoteId != null) {
			setDebitNoteId(debitNoteId);
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

		String productionYear = (String)attributes.get("productionYear");

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

		Integer markAsSample = (Integer)attributes.get("markAsSample");

		if (markAsSample != null) {
			setMarkAsSample(markAsSample);
		}

		String registeredNumber = (String)attributes.get("registeredNumber");

		if (registeredNumber != null) {
			setRegisteredNumber(registeredNumber);
		}

		String contactName = (String)attributes.get("contactName");

		if (contactName != null) {
			setContactName(contactName);
		}

		String contactPhone = (String)attributes.get("contactPhone");

		if (contactPhone != null) {
			setContactPhone(contactPhone);
		}

		Date inspectionDate = (Date)attributes.get("inspectionDate");

		if (inspectionDate != null) {
			setInspectionDate(inspectionDate);
		}

		String importerName = (String)attributes.get("importerName");

		if (importerName != null) {
			setImporterName(importerName);
		}
	}

	@JSON
	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;
	}

	@JSON
	@Override
	public long getVehicleGroupId() {
		return _vehicleGroupId;
	}

	@Override
	public void setVehicleGroupId(long vehicleGroupId) {
		_vehicleGroupId = vehicleGroupId;
	}

	@JSON
	@Override
	public long getDebitNoteId() {
		return _debitNoteId;
	}

	@Override
	public void setDebitNoteId(long debitNoteId) {
		_debitNoteId = debitNoteId;
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
		_codeNumber = codeNumber;
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
	public String getProductionYear() {
		if (_productionYear == null) {
			return StringPool.BLANK;
		}
		else {
			return _productionYear;
		}
	}

	@Override
	public void setProductionYear(String productionYear) {
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

	@JSON
	@Override
	public int getMarkAsSample() {
		return _markAsSample;
	}

	@Override
	public void setMarkAsSample(int markAsSample) {
		_markAsSample = markAsSample;
	}

	@JSON
	@Override
	public String getRegisteredNumber() {
		if (_registeredNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _registeredNumber;
		}
	}

	@Override
	public void setRegisteredNumber(String registeredNumber) {
		_registeredNumber = registeredNumber;
	}

	@JSON
	@Override
	public String getContactName() {
		if (_contactName == null) {
			return StringPool.BLANK;
		}
		else {
			return _contactName;
		}
	}

	@Override
	public void setContactName(String contactName) {
		_contactName = contactName;
	}

	@JSON
	@Override
	public String getContactPhone() {
		if (_contactPhone == null) {
			return StringPool.BLANK;
		}
		else {
			return _contactPhone;
		}
	}

	@Override
	public void setContactPhone(String contactPhone) {
		_contactPhone = contactPhone;
	}

	@JSON
	@Override
	public Date getInspectionDate() {
		return _inspectionDate;
	}

	@Override
	public void setInspectionDate(Date inspectionDate) {
		_inspectionDate = inspectionDate;
	}

	@JSON
	@Override
	public String getImporterName() {
		if (_importerName == null) {
			return StringPool.BLANK;
		}
		else {
			return _importerName;
		}
	}

	@Override
	public void setImporterName(String importerName) {
		_importerName = importerName;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			ViewTrungSoKhungDongCo.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public ViewTrungSoKhungDongCo toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ViewTrungSoKhungDongCo)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ViewTrungSoKhungDongCoImpl viewTrungSoKhungDongCoImpl = new ViewTrungSoKhungDongCoImpl();

		viewTrungSoKhungDongCoImpl.setId(getId());
		viewTrungSoKhungDongCoImpl.setVehicleGroupId(getVehicleGroupId());
		viewTrungSoKhungDongCoImpl.setDebitNoteId(getDebitNoteId());
		viewTrungSoKhungDongCoImpl.setSequenceNo(getSequenceNo());
		viewTrungSoKhungDongCoImpl.setCodeNumber(getCodeNumber());
		viewTrungSoKhungDongCoImpl.setChassisNumber(getChassisNumber());
		viewTrungSoKhungDongCoImpl.setEngineNumber(getEngineNumber());
		viewTrungSoKhungDongCoImpl.setProductionYear(getProductionYear());
		viewTrungSoKhungDongCoImpl.setVehicleEngineStatus(getVehicleEngineStatus());
		viewTrungSoKhungDongCoImpl.setVehicleColor(getVehicleColor());
		viewTrungSoKhungDongCoImpl.setUnitPrice(getUnitPrice());
		viewTrungSoKhungDongCoImpl.setCurrency(getCurrency());
		viewTrungSoKhungDongCoImpl.setRemarks(getRemarks());
		viewTrungSoKhungDongCoImpl.setConfirmedInspectionId(getConfirmedInspectionId());
		viewTrungSoKhungDongCoImpl.setInspectionRecordId(getInspectionRecordId());
		viewTrungSoKhungDongCoImpl.setDraftCertificateId(getDraftCertificateId());
		viewTrungSoKhungDongCoImpl.setCertificateRecordId(getCertificateRecordId());
		viewTrungSoKhungDongCoImpl.setMarkUpStatus(getMarkUpStatus());
		viewTrungSoKhungDongCoImpl.setSafeTestRequirementId(getSafeTestRequirementId());
		viewTrungSoKhungDongCoImpl.setEmissionTestRequirementId(getEmissionTestRequirementId());
		viewTrungSoKhungDongCoImpl.setControlRequirementId(getControlRequirementId());
		viewTrungSoKhungDongCoImpl.setMarkAsSample(getMarkAsSample());
		viewTrungSoKhungDongCoImpl.setRegisteredNumber(getRegisteredNumber());
		viewTrungSoKhungDongCoImpl.setContactName(getContactName());
		viewTrungSoKhungDongCoImpl.setContactPhone(getContactPhone());
		viewTrungSoKhungDongCoImpl.setInspectionDate(getInspectionDate());
		viewTrungSoKhungDongCoImpl.setImporterName(getImporterName());

		viewTrungSoKhungDongCoImpl.resetOriginalValues();

		return viewTrungSoKhungDongCoImpl;
	}

	@Override
	public int compareTo(ViewTrungSoKhungDongCo viewTrungSoKhungDongCo) {
		int value = 0;

		if (getId() < viewTrungSoKhungDongCo.getId()) {
			value = -1;
		}
		else if (getId() > viewTrungSoKhungDongCo.getId()) {
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

		if (!(obj instanceof ViewTrungSoKhungDongCo)) {
			return false;
		}

		ViewTrungSoKhungDongCo viewTrungSoKhungDongCo = (ViewTrungSoKhungDongCo)obj;

		long primaryKey = viewTrungSoKhungDongCo.getPrimaryKey();

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
	}

	@Override
	public CacheModel<ViewTrungSoKhungDongCo> toCacheModel() {
		ViewTrungSoKhungDongCoCacheModel viewTrungSoKhungDongCoCacheModel = new ViewTrungSoKhungDongCoCacheModel();

		viewTrungSoKhungDongCoCacheModel.id = getId();

		viewTrungSoKhungDongCoCacheModel.vehicleGroupId = getVehicleGroupId();

		viewTrungSoKhungDongCoCacheModel.debitNoteId = getDebitNoteId();

		viewTrungSoKhungDongCoCacheModel.sequenceNo = getSequenceNo();

		viewTrungSoKhungDongCoCacheModel.codeNumber = getCodeNumber();

		viewTrungSoKhungDongCoCacheModel.chassisNumber = getChassisNumber();

		String chassisNumber = viewTrungSoKhungDongCoCacheModel.chassisNumber;

		if ((chassisNumber != null) && (chassisNumber.length() == 0)) {
			viewTrungSoKhungDongCoCacheModel.chassisNumber = null;
		}

		viewTrungSoKhungDongCoCacheModel.engineNumber = getEngineNumber();

		String engineNumber = viewTrungSoKhungDongCoCacheModel.engineNumber;

		if ((engineNumber != null) && (engineNumber.length() == 0)) {
			viewTrungSoKhungDongCoCacheModel.engineNumber = null;
		}

		viewTrungSoKhungDongCoCacheModel.productionYear = getProductionYear();

		String productionYear = viewTrungSoKhungDongCoCacheModel.productionYear;

		if ((productionYear != null) && (productionYear.length() == 0)) {
			viewTrungSoKhungDongCoCacheModel.productionYear = null;
		}

		viewTrungSoKhungDongCoCacheModel.vehicleEngineStatus = getVehicleEngineStatus();

		String vehicleEngineStatus = viewTrungSoKhungDongCoCacheModel.vehicleEngineStatus;

		if ((vehicleEngineStatus != null) &&
				(vehicleEngineStatus.length() == 0)) {
			viewTrungSoKhungDongCoCacheModel.vehicleEngineStatus = null;
		}

		viewTrungSoKhungDongCoCacheModel.vehicleColor = getVehicleColor();

		String vehicleColor = viewTrungSoKhungDongCoCacheModel.vehicleColor;

		if ((vehicleColor != null) && (vehicleColor.length() == 0)) {
			viewTrungSoKhungDongCoCacheModel.vehicleColor = null;
		}

		viewTrungSoKhungDongCoCacheModel.unitPrice = getUnitPrice();

		viewTrungSoKhungDongCoCacheModel.currency = getCurrency();

		String currency = viewTrungSoKhungDongCoCacheModel.currency;

		if ((currency != null) && (currency.length() == 0)) {
			viewTrungSoKhungDongCoCacheModel.currency = null;
		}

		viewTrungSoKhungDongCoCacheModel.remarks = getRemarks();

		String remarks = viewTrungSoKhungDongCoCacheModel.remarks;

		if ((remarks != null) && (remarks.length() == 0)) {
			viewTrungSoKhungDongCoCacheModel.remarks = null;
		}

		viewTrungSoKhungDongCoCacheModel.confirmedInspectionId = getConfirmedInspectionId();

		viewTrungSoKhungDongCoCacheModel.inspectionRecordId = getInspectionRecordId();

		viewTrungSoKhungDongCoCacheModel.draftCertificateId = getDraftCertificateId();

		viewTrungSoKhungDongCoCacheModel.certificateRecordId = getCertificateRecordId();

		viewTrungSoKhungDongCoCacheModel.markUpStatus = getMarkUpStatus();

		viewTrungSoKhungDongCoCacheModel.safeTestRequirementId = getSafeTestRequirementId();

		viewTrungSoKhungDongCoCacheModel.emissionTestRequirementId = getEmissionTestRequirementId();

		viewTrungSoKhungDongCoCacheModel.controlRequirementId = getControlRequirementId();

		viewTrungSoKhungDongCoCacheModel.markAsSample = getMarkAsSample();

		viewTrungSoKhungDongCoCacheModel.registeredNumber = getRegisteredNumber();

		String registeredNumber = viewTrungSoKhungDongCoCacheModel.registeredNumber;

		if ((registeredNumber != null) && (registeredNumber.length() == 0)) {
			viewTrungSoKhungDongCoCacheModel.registeredNumber = null;
		}

		viewTrungSoKhungDongCoCacheModel.contactName = getContactName();

		String contactName = viewTrungSoKhungDongCoCacheModel.contactName;

		if ((contactName != null) && (contactName.length() == 0)) {
			viewTrungSoKhungDongCoCacheModel.contactName = null;
		}

		viewTrungSoKhungDongCoCacheModel.contactPhone = getContactPhone();

		String contactPhone = viewTrungSoKhungDongCoCacheModel.contactPhone;

		if ((contactPhone != null) && (contactPhone.length() == 0)) {
			viewTrungSoKhungDongCoCacheModel.contactPhone = null;
		}

		Date inspectionDate = getInspectionDate();

		if (inspectionDate != null) {
			viewTrungSoKhungDongCoCacheModel.inspectionDate = inspectionDate.getTime();
		}
		else {
			viewTrungSoKhungDongCoCacheModel.inspectionDate = Long.MIN_VALUE;
		}

		viewTrungSoKhungDongCoCacheModel.importerName = getImporterName();

		String importerName = viewTrungSoKhungDongCoCacheModel.importerName;

		if ((importerName != null) && (importerName.length() == 0)) {
			viewTrungSoKhungDongCoCacheModel.importerName = null;
		}

		return viewTrungSoKhungDongCoCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(55);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", vehicleGroupId=");
		sb.append(getVehicleGroupId());
		sb.append(", debitNoteId=");
		sb.append(getDebitNoteId());
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
		sb.append(", markAsSample=");
		sb.append(getMarkAsSample());
		sb.append(", registeredNumber=");
		sb.append(getRegisteredNumber());
		sb.append(", contactName=");
		sb.append(getContactName());
		sb.append(", contactPhone=");
		sb.append(getContactPhone());
		sb.append(", inspectionDate=");
		sb.append(getInspectionDate());
		sb.append(", importerName=");
		sb.append(getImporterName());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(85);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo");
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
			"<column><column-name>debitNoteId</column-name><column-value><![CDATA[");
		sb.append(getDebitNoteId());
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
		sb.append(
			"<column><column-name>markAsSample</column-name><column-value><![CDATA[");
		sb.append(getMarkAsSample());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registeredNumber</column-name><column-value><![CDATA[");
		sb.append(getRegisteredNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactName</column-name><column-value><![CDATA[");
		sb.append(getContactName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactPhone</column-name><column-value><![CDATA[");
		sb.append(getContactPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionDate</column-name><column-value><![CDATA[");
		sb.append(getInspectionDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>importerName</column-name><column-value><![CDATA[");
		sb.append(getImporterName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = ViewTrungSoKhungDongCo.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			ViewTrungSoKhungDongCo.class
		};
	private long _id;
	private long _vehicleGroupId;
	private long _debitNoteId;
	private long _sequenceNo;
	private long _codeNumber;
	private String _chassisNumber;
	private String _engineNumber;
	private String _productionYear;
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
	private int _markAsSample;
	private String _registeredNumber;
	private String _contactName;
	private String _contactPhone;
	private Date _inspectionDate;
	private String _importerName;
	private ViewTrungSoKhungDongCo _escapedModel;
}