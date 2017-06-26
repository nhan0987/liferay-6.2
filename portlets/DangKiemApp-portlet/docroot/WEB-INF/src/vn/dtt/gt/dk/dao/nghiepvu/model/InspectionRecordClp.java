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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class InspectionRecordClp extends BaseModelImpl<InspectionRecord>
	implements InspectionRecord {
	public InspectionRecordClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return InspectionRecord.class;
	}

	@Override
	public String getModelClassName() {
		return InspectionRecord.class.getName();
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
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("inspectionRecordNo", getInspectionRecordNo());
		attributes.put("inspectionRecordDate", getInspectionRecordDate());
		attributes.put("corporationId", getCorporationId());
		attributes.put("inspectorId", getInspectorId());
		attributes.put("confirmedInspectionId", getConfirmedInspectionId());
		attributes.put("customsDeclarationid", getCustomsDeclarationid());
		attributes.put("inspectionSite", getInspectionSite());
		attributes.put("inspectionDateFrom", getInspectionDateFrom());
		attributes.put("inspectionDateTo", getInspectionDateTo());
		attributes.put("inspectionMode", getInspectionMode());
		attributes.put("description", getDescription());
		attributes.put("attachedFile", getAttachedFile());
		attributes.put("confirmedResult", getConfirmedResult());
		attributes.put("signName", getSignName());
		attributes.put("signTitle", getSignTitle());
		attributes.put("signPlace", getSignPlace());
		attributes.put("signDate", getSignDate());
		attributes.put("phieuXuLyPhuId", getPhieuXuLyPhuId());
		attributes.put("markupSafeTest", getMarkupSafeTest());
		attributes.put("markupEmissionTest", getMarkupEmissionTest());
		attributes.put("markupControl", getMarkupControl());
		attributes.put("registeredInspectionId", getRegisteredInspectionId());
		attributes.put("remarks", getRemarks());
		attributes.put("hoSoThuTucId", getHoSoThuTucId());
		attributes.put("otherCosts", getOtherCosts());
		attributes.put("markupPaid", getMarkupPaid());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String inspectionRecordNo = (String)attributes.get("inspectionRecordNo");

		if (inspectionRecordNo != null) {
			setInspectionRecordNo(inspectionRecordNo);
		}

		Date inspectionRecordDate = (Date)attributes.get("inspectionRecordDate");

		if (inspectionRecordDate != null) {
			setInspectionRecordDate(inspectionRecordDate);
		}

		String corporationId = (String)attributes.get("corporationId");

		if (corporationId != null) {
			setCorporationId(corporationId);
		}

		Long inspectorId = (Long)attributes.get("inspectorId");

		if (inspectorId != null) {
			setInspectorId(inspectorId);
		}

		Long confirmedInspectionId = (Long)attributes.get(
				"confirmedInspectionId");

		if (confirmedInspectionId != null) {
			setConfirmedInspectionId(confirmedInspectionId);
		}

		Long customsDeclarationid = (Long)attributes.get("customsDeclarationid");

		if (customsDeclarationid != null) {
			setCustomsDeclarationid(customsDeclarationid);
		}

		String inspectionSite = (String)attributes.get("inspectionSite");

		if (inspectionSite != null) {
			setInspectionSite(inspectionSite);
		}

		Date inspectionDateFrom = (Date)attributes.get("inspectionDateFrom");

		if (inspectionDateFrom != null) {
			setInspectionDateFrom(inspectionDateFrom);
		}

		Date inspectionDateTo = (Date)attributes.get("inspectionDateTo");

		if (inspectionDateTo != null) {
			setInspectionDateTo(inspectionDateTo);
		}

		Long inspectionMode = (Long)attributes.get("inspectionMode");

		if (inspectionMode != null) {
			setInspectionMode(inspectionMode);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}

		Long confirmedResult = (Long)attributes.get("confirmedResult");

		if (confirmedResult != null) {
			setConfirmedResult(confirmedResult);
		}

		String signName = (String)attributes.get("signName");

		if (signName != null) {
			setSignName(signName);
		}

		String signTitle = (String)attributes.get("signTitle");

		if (signTitle != null) {
			setSignTitle(signTitle);
		}

		String signPlace = (String)attributes.get("signPlace");

		if (signPlace != null) {
			setSignPlace(signPlace);
		}

		Date signDate = (Date)attributes.get("signDate");

		if (signDate != null) {
			setSignDate(signDate);
		}

		Long phieuXuLyPhuId = (Long)attributes.get("phieuXuLyPhuId");

		if (phieuXuLyPhuId != null) {
			setPhieuXuLyPhuId(phieuXuLyPhuId);
		}

		Long markupSafeTest = (Long)attributes.get("markupSafeTest");

		if (markupSafeTest != null) {
			setMarkupSafeTest(markupSafeTest);
		}

		Long markupEmissionTest = (Long)attributes.get("markupEmissionTest");

		if (markupEmissionTest != null) {
			setMarkupEmissionTest(markupEmissionTest);
		}

		Long markupControl = (Long)attributes.get("markupControl");

		if (markupControl != null) {
			setMarkupControl(markupControl);
		}

		Long registeredInspectionId = (Long)attributes.get(
				"registeredInspectionId");

		if (registeredInspectionId != null) {
			setRegisteredInspectionId(registeredInspectionId);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		Long hoSoThuTucId = (Long)attributes.get("hoSoThuTucId");

		if (hoSoThuTucId != null) {
			setHoSoThuTucId(hoSoThuTucId);
		}

		Double otherCosts = (Double)attributes.get("otherCosts");

		if (otherCosts != null) {
			setOtherCosts(otherCosts);
		}

		Long markupPaid = (Long)attributes.get("markupPaid");

		if (markupPaid != null) {
			setMarkupPaid(markupPaid);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_inspectionRecordRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_inspectionRecordRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectionRecordNo() {
		return _inspectionRecordNo;
	}

	@Override
	public void setInspectionRecordNo(String inspectionRecordNo) {
		_inspectionRecordNo = inspectionRecordNo;

		if (_inspectionRecordRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionRecordNo",
						String.class);

				method.invoke(_inspectionRecordRemoteModel, inspectionRecordNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getInspectionRecordDate() {
		return _inspectionRecordDate;
	}

	@Override
	public void setInspectionRecordDate(Date inspectionRecordDate) {
		_inspectionRecordDate = inspectionRecordDate;

		if (_inspectionRecordRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionRecordDate",
						Date.class);

				method.invoke(_inspectionRecordRemoteModel, inspectionRecordDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCorporationId() {
		return _corporationId;
	}

	@Override
	public void setCorporationId(String corporationId) {
		_corporationId = corporationId;

		if (_inspectionRecordRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setCorporationId", String.class);

				method.invoke(_inspectionRecordRemoteModel, corporationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getInspectorId() {
		return _inspectorId;
	}

	@Override
	public void setInspectorId(long inspectorId) {
		_inspectorId = inspectorId;

		if (_inspectionRecordRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectorId", long.class);

				method.invoke(_inspectionRecordRemoteModel, inspectorId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getConfirmedInspectionId() {
		return _confirmedInspectionId;
	}

	@Override
	public void setConfirmedInspectionId(long confirmedInspectionId) {
		_confirmedInspectionId = confirmedInspectionId;

		if (_inspectionRecordRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setConfirmedInspectionId",
						long.class);

				method.invoke(_inspectionRecordRemoteModel,
					confirmedInspectionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCustomsDeclarationid() {
		return _customsDeclarationid;
	}

	@Override
	public void setCustomsDeclarationid(long customsDeclarationid) {
		_customsDeclarationid = customsDeclarationid;

		if (_inspectionRecordRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setCustomsDeclarationid",
						long.class);

				method.invoke(_inspectionRecordRemoteModel, customsDeclarationid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectionSite() {
		return _inspectionSite;
	}

	@Override
	public void setInspectionSite(String inspectionSite) {
		_inspectionSite = inspectionSite;

		if (_inspectionRecordRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionSite",
						String.class);

				method.invoke(_inspectionRecordRemoteModel, inspectionSite);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getInspectionDateFrom() {
		return _inspectionDateFrom;
	}

	@Override
	public void setInspectionDateFrom(Date inspectionDateFrom) {
		_inspectionDateFrom = inspectionDateFrom;

		if (_inspectionRecordRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionDateFrom",
						Date.class);

				method.invoke(_inspectionRecordRemoteModel, inspectionDateFrom);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getInspectionDateTo() {
		return _inspectionDateTo;
	}

	@Override
	public void setInspectionDateTo(Date inspectionDateTo) {
		_inspectionDateTo = inspectionDateTo;

		if (_inspectionRecordRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionDateTo",
						Date.class);

				method.invoke(_inspectionRecordRemoteModel, inspectionDateTo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getInspectionMode() {
		return _inspectionMode;
	}

	@Override
	public void setInspectionMode(long inspectionMode) {
		_inspectionMode = inspectionMode;

		if (_inspectionRecordRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionMode", long.class);

				method.invoke(_inspectionRecordRemoteModel, inspectionMode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_inspectionRecordRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_inspectionRecordRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAttachedFile() {
		return _attachedFile;
	}

	@Override
	public void setAttachedFile(long attachedFile) {
		_attachedFile = attachedFile;

		if (_inspectionRecordRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setAttachedFile", long.class);

				method.invoke(_inspectionRecordRemoteModel, attachedFile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getConfirmedResult() {
		return _confirmedResult;
	}

	@Override
	public void setConfirmedResult(long confirmedResult) {
		_confirmedResult = confirmedResult;

		if (_inspectionRecordRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setConfirmedResult", long.class);

				method.invoke(_inspectionRecordRemoteModel, confirmedResult);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSignName() {
		return _signName;
	}

	@Override
	public void setSignName(String signName) {
		_signName = signName;

		if (_inspectionRecordRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setSignName", String.class);

				method.invoke(_inspectionRecordRemoteModel, signName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSignTitle() {
		return _signTitle;
	}

	@Override
	public void setSignTitle(String signTitle) {
		_signTitle = signTitle;

		if (_inspectionRecordRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setSignTitle", String.class);

				method.invoke(_inspectionRecordRemoteModel, signTitle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSignPlace() {
		return _signPlace;
	}

	@Override
	public void setSignPlace(String signPlace) {
		_signPlace = signPlace;

		if (_inspectionRecordRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setSignPlace", String.class);

				method.invoke(_inspectionRecordRemoteModel, signPlace);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSignDate() {
		return _signDate;
	}

	@Override
	public void setSignDate(Date signDate) {
		_signDate = signDate;

		if (_inspectionRecordRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setSignDate", Date.class);

				method.invoke(_inspectionRecordRemoteModel, signDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPhieuXuLyPhuId() {
		return _phieuXuLyPhuId;
	}

	@Override
	public void setPhieuXuLyPhuId(long phieuXuLyPhuId) {
		_phieuXuLyPhuId = phieuXuLyPhuId;

		if (_inspectionRecordRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setPhieuXuLyPhuId", long.class);

				method.invoke(_inspectionRecordRemoteModel, phieuXuLyPhuId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getMarkupSafeTest() {
		return _markupSafeTest;
	}

	@Override
	public void setMarkupSafeTest(long markupSafeTest) {
		_markupSafeTest = markupSafeTest;

		if (_inspectionRecordRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkupSafeTest", long.class);

				method.invoke(_inspectionRecordRemoteModel, markupSafeTest);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getMarkupEmissionTest() {
		return _markupEmissionTest;
	}

	@Override
	public void setMarkupEmissionTest(long markupEmissionTest) {
		_markupEmissionTest = markupEmissionTest;

		if (_inspectionRecordRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkupEmissionTest",
						long.class);

				method.invoke(_inspectionRecordRemoteModel, markupEmissionTest);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getMarkupControl() {
		return _markupControl;
	}

	@Override
	public void setMarkupControl(long markupControl) {
		_markupControl = markupControl;

		if (_inspectionRecordRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkupControl", long.class);

				method.invoke(_inspectionRecordRemoteModel, markupControl);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getRegisteredInspectionId() {
		return _registeredInspectionId;
	}

	@Override
	public void setRegisteredInspectionId(long registeredInspectionId) {
		_registeredInspectionId = registeredInspectionId;

		if (_inspectionRecordRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setRegisteredInspectionId",
						long.class);

				method.invoke(_inspectionRecordRemoteModel,
					registeredInspectionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRemarks() {
		return _remarks;
	}

	@Override
	public void setRemarks(String remarks) {
		_remarks = remarks;

		if (_inspectionRecordRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setRemarks", String.class);

				method.invoke(_inspectionRecordRemoteModel, remarks);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getHoSoThuTucId() {
		return _hoSoThuTucId;
	}

	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_hoSoThuTucId = hoSoThuTucId;

		if (_inspectionRecordRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setHoSoThuTucId", long.class);

				method.invoke(_inspectionRecordRemoteModel, hoSoThuTucId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getOtherCosts() {
		return _otherCosts;
	}

	@Override
	public void setOtherCosts(double otherCosts) {
		_otherCosts = otherCosts;

		if (_inspectionRecordRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setOtherCosts", double.class);

				method.invoke(_inspectionRecordRemoteModel, otherCosts);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getMarkupPaid() {
		return _markupPaid;
	}

	@Override
	public void setMarkupPaid(long markupPaid) {
		_markupPaid = markupPaid;

		if (_inspectionRecordRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkupPaid", long.class);

				method.invoke(_inspectionRecordRemoteModel, markupPaid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getInspectionRecordRemoteModel() {
		return _inspectionRecordRemoteModel;
	}

	public void setInspectionRecordRemoteModel(
		BaseModel<?> inspectionRecordRemoteModel) {
		_inspectionRecordRemoteModel = inspectionRecordRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _inspectionRecordRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_inspectionRecordRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			InspectionRecordLocalServiceUtil.addInspectionRecord(this);
		}
		else {
			InspectionRecordLocalServiceUtil.updateInspectionRecord(this);
		}
	}

	@Override
	public InspectionRecord toEscapedModel() {
		return (InspectionRecord)ProxyUtil.newProxyInstance(InspectionRecord.class.getClassLoader(),
			new Class[] { InspectionRecord.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		InspectionRecordClp clone = new InspectionRecordClp();

		clone.setId(getId());
		clone.setInspectionRecordNo(getInspectionRecordNo());
		clone.setInspectionRecordDate(getInspectionRecordDate());
		clone.setCorporationId(getCorporationId());
		clone.setInspectorId(getInspectorId());
		clone.setConfirmedInspectionId(getConfirmedInspectionId());
		clone.setCustomsDeclarationid(getCustomsDeclarationid());
		clone.setInspectionSite(getInspectionSite());
		clone.setInspectionDateFrom(getInspectionDateFrom());
		clone.setInspectionDateTo(getInspectionDateTo());
		clone.setInspectionMode(getInspectionMode());
		clone.setDescription(getDescription());
		clone.setAttachedFile(getAttachedFile());
		clone.setConfirmedResult(getConfirmedResult());
		clone.setSignName(getSignName());
		clone.setSignTitle(getSignTitle());
		clone.setSignPlace(getSignPlace());
		clone.setSignDate(getSignDate());
		clone.setPhieuXuLyPhuId(getPhieuXuLyPhuId());
		clone.setMarkupSafeTest(getMarkupSafeTest());
		clone.setMarkupEmissionTest(getMarkupEmissionTest());
		clone.setMarkupControl(getMarkupControl());
		clone.setRegisteredInspectionId(getRegisteredInspectionId());
		clone.setRemarks(getRemarks());
		clone.setHoSoThuTucId(getHoSoThuTucId());
		clone.setOtherCosts(getOtherCosts());
		clone.setMarkupPaid(getMarkupPaid());

		return clone;
	}

	@Override
	public int compareTo(InspectionRecord inspectionRecord) {
		int value = 0;

		if (getId() < inspectionRecord.getId()) {
			value = -1;
		}
		else if (getId() > inspectionRecord.getId()) {
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

		if (!(obj instanceof InspectionRecordClp)) {
			return false;
		}

		InspectionRecordClp inspectionRecord = (InspectionRecordClp)obj;

		long primaryKey = inspectionRecord.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(55);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", inspectionRecordNo=");
		sb.append(getInspectionRecordNo());
		sb.append(", inspectionRecordDate=");
		sb.append(getInspectionRecordDate());
		sb.append(", corporationId=");
		sb.append(getCorporationId());
		sb.append(", inspectorId=");
		sb.append(getInspectorId());
		sb.append(", confirmedInspectionId=");
		sb.append(getConfirmedInspectionId());
		sb.append(", customsDeclarationid=");
		sb.append(getCustomsDeclarationid());
		sb.append(", inspectionSite=");
		sb.append(getInspectionSite());
		sb.append(", inspectionDateFrom=");
		sb.append(getInspectionDateFrom());
		sb.append(", inspectionDateTo=");
		sb.append(getInspectionDateTo());
		sb.append(", inspectionMode=");
		sb.append(getInspectionMode());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", attachedFile=");
		sb.append(getAttachedFile());
		sb.append(", confirmedResult=");
		sb.append(getConfirmedResult());
		sb.append(", signName=");
		sb.append(getSignName());
		sb.append(", signTitle=");
		sb.append(getSignTitle());
		sb.append(", signPlace=");
		sb.append(getSignPlace());
		sb.append(", signDate=");
		sb.append(getSignDate());
		sb.append(", phieuXuLyPhuId=");
		sb.append(getPhieuXuLyPhuId());
		sb.append(", markupSafeTest=");
		sb.append(getMarkupSafeTest());
		sb.append(", markupEmissionTest=");
		sb.append(getMarkupEmissionTest());
		sb.append(", markupControl=");
		sb.append(getMarkupControl());
		sb.append(", registeredInspectionId=");
		sb.append(getRegisteredInspectionId());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append(", hoSoThuTucId=");
		sb.append(getHoSoThuTucId());
		sb.append(", otherCosts=");
		sb.append(getOtherCosts());
		sb.append(", markupPaid=");
		sb.append(getMarkupPaid());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(85);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionRecordNo</column-name><column-value><![CDATA[");
		sb.append(getInspectionRecordNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionRecordDate</column-name><column-value><![CDATA[");
		sb.append(getInspectionRecordDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>corporationId</column-name><column-value><![CDATA[");
		sb.append(getCorporationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorId</column-name><column-value><![CDATA[");
		sb.append(getInspectorId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>confirmedInspectionId</column-name><column-value><![CDATA[");
		sb.append(getConfirmedInspectionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>customsDeclarationid</column-name><column-value><![CDATA[");
		sb.append(getCustomsDeclarationid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionSite</column-name><column-value><![CDATA[");
		sb.append(getInspectionSite());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionDateFrom</column-name><column-value><![CDATA[");
		sb.append(getInspectionDateFrom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionDateTo</column-name><column-value><![CDATA[");
		sb.append(getInspectionDateTo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionMode</column-name><column-value><![CDATA[");
		sb.append(getInspectionMode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attachedFile</column-name><column-value><![CDATA[");
		sb.append(getAttachedFile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>confirmedResult</column-name><column-value><![CDATA[");
		sb.append(getConfirmedResult());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signName</column-name><column-value><![CDATA[");
		sb.append(getSignName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signTitle</column-name><column-value><![CDATA[");
		sb.append(getSignTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signPlace</column-name><column-value><![CDATA[");
		sb.append(getSignPlace());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signDate</column-name><column-value><![CDATA[");
		sb.append(getSignDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phieuXuLyPhuId</column-name><column-value><![CDATA[");
		sb.append(getPhieuXuLyPhuId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markupSafeTest</column-name><column-value><![CDATA[");
		sb.append(getMarkupSafeTest());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markupEmissionTest</column-name><column-value><![CDATA[");
		sb.append(getMarkupEmissionTest());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markupControl</column-name><column-value><![CDATA[");
		sb.append(getMarkupControl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registeredInspectionId</column-name><column-value><![CDATA[");
		sb.append(getRegisteredInspectionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoSoThuTucId</column-name><column-value><![CDATA[");
		sb.append(getHoSoThuTucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>otherCosts</column-name><column-value><![CDATA[");
		sb.append(getOtherCosts());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markupPaid</column-name><column-value><![CDATA[");
		sb.append(getMarkupPaid());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _inspectionRecordNo;
	private Date _inspectionRecordDate;
	private String _corporationId;
	private long _inspectorId;
	private long _confirmedInspectionId;
	private long _customsDeclarationid;
	private String _inspectionSite;
	private Date _inspectionDateFrom;
	private Date _inspectionDateTo;
	private long _inspectionMode;
	private String _description;
	private long _attachedFile;
	private long _confirmedResult;
	private String _signName;
	private String _signTitle;
	private String _signPlace;
	private Date _signDate;
	private long _phieuXuLyPhuId;
	private long _markupSafeTest;
	private long _markupEmissionTest;
	private long _markupControl;
	private long _registeredInspectionId;
	private String _remarks;
	private long _hoSoThuTucId;
	private double _otherCosts;
	private long _markupPaid;
	private BaseModel<?> _inspectionRecordRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.class;
}