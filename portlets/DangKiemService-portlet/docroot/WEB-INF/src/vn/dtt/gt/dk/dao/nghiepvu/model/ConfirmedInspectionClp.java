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
import vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author huymq
 */
public class ConfirmedInspectionClp extends BaseModelImpl<ConfirmedInspection>
	implements ConfirmedInspection {
	public ConfirmedInspectionClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ConfirmedInspection.class;
	}

	@Override
	public String getModelClassName() {
		return ConfirmedInspection.class.getName();
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
		attributes.put("registeredInspectionId", getRegisteredInspectionId());
		attributes.put("customsDeclarationId", getCustomsDeclarationId());
		attributes.put("confirmationCode", getConfirmationCode());
		attributes.put("attachedFile", getAttachedFile());
		attributes.put("inspectionDate", getInspectionDate());
		attributes.put("inspectionSite", getInspectionSite());
		attributes.put("inspectionDistrictCode", getInspectionDistrictCode());
		attributes.put("inspectionProvincecode", getInspectionProvincecode());
		attributes.put("customsRegion", getCustomsRegion());
		attributes.put("markasChangedSite", getMarkasChangedSite());
		attributes.put("contactName", getContactName());
		attributes.put("contactPhone", getContactPhone());
		attributes.put("contactEmail", getContactEmail());
		attributes.put("signName", getSignName());
		attributes.put("signTitle", getSignTitle());
		attributes.put("signPlace", getSignPlace());
		attributes.put("signDate", getSignDate());
		attributes.put("remarks", getRemarks());
		attributes.put("corporationId", getCorporationId());
		attributes.put("inspectorId", getInspectorId());
		attributes.put("phieuXuLyPhuId", getPhieuXuLyPhuId());
		attributes.put("hoSoThuTucId", getHoSoThuTucId());
		attributes.put("dateFrom", getDateFrom());
		attributes.put("dateTo", getDateTo());
		attributes.put("leader", getLeader());
		attributes.put("synchdate", getSynchdate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long registeredInspectionId = (Long)attributes.get(
				"registeredInspectionId");

		if (registeredInspectionId != null) {
			setRegisteredInspectionId(registeredInspectionId);
		}

		Long customsDeclarationId = (Long)attributes.get("customsDeclarationId");

		if (customsDeclarationId != null) {
			setCustomsDeclarationId(customsDeclarationId);
		}

		Long confirmationCode = (Long)attributes.get("confirmationCode");

		if (confirmationCode != null) {
			setConfirmationCode(confirmationCode);
		}

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}

		Date inspectionDate = (Date)attributes.get("inspectionDate");

		if (inspectionDate != null) {
			setInspectionDate(inspectionDate);
		}

		String inspectionSite = (String)attributes.get("inspectionSite");

		if (inspectionSite != null) {
			setInspectionSite(inspectionSite);
		}

		String inspectionDistrictCode = (String)attributes.get(
				"inspectionDistrictCode");

		if (inspectionDistrictCode != null) {
			setInspectionDistrictCode(inspectionDistrictCode);
		}

		String inspectionProvincecode = (String)attributes.get(
				"inspectionProvincecode");

		if (inspectionProvincecode != null) {
			setInspectionProvincecode(inspectionProvincecode);
		}

		Long customsRegion = (Long)attributes.get("customsRegion");

		if (customsRegion != null) {
			setCustomsRegion(customsRegion);
		}

		Long markasChangedSite = (Long)attributes.get("markasChangedSite");

		if (markasChangedSite != null) {
			setMarkasChangedSite(markasChangedSite);
		}

		String contactName = (String)attributes.get("contactName");

		if (contactName != null) {
			setContactName(contactName);
		}

		String contactPhone = (String)attributes.get("contactPhone");

		if (contactPhone != null) {
			setContactPhone(contactPhone);
		}

		String contactEmail = (String)attributes.get("contactEmail");

		if (contactEmail != null) {
			setContactEmail(contactEmail);
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

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		String corporationId = (String)attributes.get("corporationId");

		if (corporationId != null) {
			setCorporationId(corporationId);
		}

		Long inspectorId = (Long)attributes.get("inspectorId");

		if (inspectorId != null) {
			setInspectorId(inspectorId);
		}

		Long phieuXuLyPhuId = (Long)attributes.get("phieuXuLyPhuId");

		if (phieuXuLyPhuId != null) {
			setPhieuXuLyPhuId(phieuXuLyPhuId);
		}

		Long hoSoThuTucId = (Long)attributes.get("hoSoThuTucId");

		if (hoSoThuTucId != null) {
			setHoSoThuTucId(hoSoThuTucId);
		}

		Date dateFrom = (Date)attributes.get("dateFrom");

		if (dateFrom != null) {
			setDateFrom(dateFrom);
		}

		Date dateTo = (Date)attributes.get("dateTo");

		if (dateTo != null) {
			setDateTo(dateTo);
		}

		Integer leader = (Integer)attributes.get("leader");

		if (leader != null) {
			setLeader(leader);
		}

		Date synchdate = (Date)attributes.get("synchdate");

		if (synchdate != null) {
			setSynchdate(synchdate);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_confirmedInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _confirmedInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_confirmedInspectionRemoteModel, id);
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

		if (_confirmedInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _confirmedInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setRegisteredInspectionId",
						long.class);

				method.invoke(_confirmedInspectionRemoteModel,
					registeredInspectionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCustomsDeclarationId() {
		return _customsDeclarationId;
	}

	@Override
	public void setCustomsDeclarationId(long customsDeclarationId) {
		_customsDeclarationId = customsDeclarationId;

		if (_confirmedInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _confirmedInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setCustomsDeclarationId",
						long.class);

				method.invoke(_confirmedInspectionRemoteModel,
					customsDeclarationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getConfirmationCode() {
		return _confirmationCode;
	}

	@Override
	public void setConfirmationCode(long confirmationCode) {
		_confirmationCode = confirmationCode;

		if (_confirmedInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _confirmedInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setConfirmationCode",
						long.class);

				method.invoke(_confirmedInspectionRemoteModel, confirmationCode);
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

		if (_confirmedInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _confirmedInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setAttachedFile", long.class);

				method.invoke(_confirmedInspectionRemoteModel, attachedFile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getInspectionDate() {
		return _inspectionDate;
	}

	@Override
	public void setInspectionDate(Date inspectionDate) {
		_inspectionDate = inspectionDate;

		if (_confirmedInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _confirmedInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionDate", Date.class);

				method.invoke(_confirmedInspectionRemoteModel, inspectionDate);
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

		if (_confirmedInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _confirmedInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionSite",
						String.class);

				method.invoke(_confirmedInspectionRemoteModel, inspectionSite);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectionDistrictCode() {
		return _inspectionDistrictCode;
	}

	@Override
	public void setInspectionDistrictCode(String inspectionDistrictCode) {
		_inspectionDistrictCode = inspectionDistrictCode;

		if (_confirmedInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _confirmedInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionDistrictCode",
						String.class);

				method.invoke(_confirmedInspectionRemoteModel,
					inspectionDistrictCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectionProvincecode() {
		return _inspectionProvincecode;
	}

	@Override
	public void setInspectionProvincecode(String inspectionProvincecode) {
		_inspectionProvincecode = inspectionProvincecode;

		if (_confirmedInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _confirmedInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionProvincecode",
						String.class);

				method.invoke(_confirmedInspectionRemoteModel,
					inspectionProvincecode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCustomsRegion() {
		return _customsRegion;
	}

	@Override
	public void setCustomsRegion(long customsRegion) {
		_customsRegion = customsRegion;

		if (_confirmedInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _confirmedInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setCustomsRegion", long.class);

				method.invoke(_confirmedInspectionRemoteModel, customsRegion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getMarkasChangedSite() {
		return _markasChangedSite;
	}

	@Override
	public void setMarkasChangedSite(long markasChangedSite) {
		_markasChangedSite = markasChangedSite;

		if (_confirmedInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _confirmedInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkasChangedSite",
						long.class);

				method.invoke(_confirmedInspectionRemoteModel, markasChangedSite);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContactName() {
		return _contactName;
	}

	@Override
	public void setContactName(String contactName) {
		_contactName = contactName;

		if (_confirmedInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _confirmedInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setContactName", String.class);

				method.invoke(_confirmedInspectionRemoteModel, contactName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContactPhone() {
		return _contactPhone;
	}

	@Override
	public void setContactPhone(String contactPhone) {
		_contactPhone = contactPhone;

		if (_confirmedInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _confirmedInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setContactPhone", String.class);

				method.invoke(_confirmedInspectionRemoteModel, contactPhone);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContactEmail() {
		return _contactEmail;
	}

	@Override
	public void setContactEmail(String contactEmail) {
		_contactEmail = contactEmail;

		if (_confirmedInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _confirmedInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setContactEmail", String.class);

				method.invoke(_confirmedInspectionRemoteModel, contactEmail);
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

		if (_confirmedInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _confirmedInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setSignName", String.class);

				method.invoke(_confirmedInspectionRemoteModel, signName);
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

		if (_confirmedInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _confirmedInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setSignTitle", String.class);

				method.invoke(_confirmedInspectionRemoteModel, signTitle);
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

		if (_confirmedInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _confirmedInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setSignPlace", String.class);

				method.invoke(_confirmedInspectionRemoteModel, signPlace);
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

		if (_confirmedInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _confirmedInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setSignDate", Date.class);

				method.invoke(_confirmedInspectionRemoteModel, signDate);
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

		if (_confirmedInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _confirmedInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setRemarks", String.class);

				method.invoke(_confirmedInspectionRemoteModel, remarks);
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

		if (_confirmedInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _confirmedInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setCorporationId", String.class);

				method.invoke(_confirmedInspectionRemoteModel, corporationId);
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

		if (_confirmedInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _confirmedInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectorId", long.class);

				method.invoke(_confirmedInspectionRemoteModel, inspectorId);
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

		if (_confirmedInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _confirmedInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setPhieuXuLyPhuId", long.class);

				method.invoke(_confirmedInspectionRemoteModel, phieuXuLyPhuId);
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

		if (_confirmedInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _confirmedInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setHoSoThuTucId", long.class);

				method.invoke(_confirmedInspectionRemoteModel, hoSoThuTucId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDateFrom() {
		return _dateFrom;
	}

	@Override
	public void setDateFrom(Date dateFrom) {
		_dateFrom = dateFrom;

		if (_confirmedInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _confirmedInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setDateFrom", Date.class);

				method.invoke(_confirmedInspectionRemoteModel, dateFrom);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDateTo() {
		return _dateTo;
	}

	@Override
	public void setDateTo(Date dateTo) {
		_dateTo = dateTo;

		if (_confirmedInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _confirmedInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setDateTo", Date.class);

				method.invoke(_confirmedInspectionRemoteModel, dateTo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLeader() {
		return _leader;
	}

	@Override
	public void setLeader(int leader) {
		_leader = leader;

		if (_confirmedInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _confirmedInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setLeader", int.class);

				method.invoke(_confirmedInspectionRemoteModel, leader);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSynchdate() {
		return _synchdate;
	}

	@Override
	public void setSynchdate(Date synchdate) {
		_synchdate = synchdate;

		if (_confirmedInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _confirmedInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setSynchdate", Date.class);

				method.invoke(_confirmedInspectionRemoteModel, synchdate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getConfirmedInspectionRemoteModel() {
		return _confirmedInspectionRemoteModel;
	}

	public void setConfirmedInspectionRemoteModel(
		BaseModel<?> confirmedInspectionRemoteModel) {
		_confirmedInspectionRemoteModel = confirmedInspectionRemoteModel;
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

		Class<?> remoteModelClass = _confirmedInspectionRemoteModel.getClass();

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

		Object returnValue = method.invoke(_confirmedInspectionRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ConfirmedInspectionLocalServiceUtil.addConfirmedInspection(this);
		}
		else {
			ConfirmedInspectionLocalServiceUtil.updateConfirmedInspection(this);
		}
	}

	@Override
	public ConfirmedInspection toEscapedModel() {
		return (ConfirmedInspection)ProxyUtil.newProxyInstance(ConfirmedInspection.class.getClassLoader(),
			new Class[] { ConfirmedInspection.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ConfirmedInspectionClp clone = new ConfirmedInspectionClp();

		clone.setId(getId());
		clone.setRegisteredInspectionId(getRegisteredInspectionId());
		clone.setCustomsDeclarationId(getCustomsDeclarationId());
		clone.setConfirmationCode(getConfirmationCode());
		clone.setAttachedFile(getAttachedFile());
		clone.setInspectionDate(getInspectionDate());
		clone.setInspectionSite(getInspectionSite());
		clone.setInspectionDistrictCode(getInspectionDistrictCode());
		clone.setInspectionProvincecode(getInspectionProvincecode());
		clone.setCustomsRegion(getCustomsRegion());
		clone.setMarkasChangedSite(getMarkasChangedSite());
		clone.setContactName(getContactName());
		clone.setContactPhone(getContactPhone());
		clone.setContactEmail(getContactEmail());
		clone.setSignName(getSignName());
		clone.setSignTitle(getSignTitle());
		clone.setSignPlace(getSignPlace());
		clone.setSignDate(getSignDate());
		clone.setRemarks(getRemarks());
		clone.setCorporationId(getCorporationId());
		clone.setInspectorId(getInspectorId());
		clone.setPhieuXuLyPhuId(getPhieuXuLyPhuId());
		clone.setHoSoThuTucId(getHoSoThuTucId());
		clone.setDateFrom(getDateFrom());
		clone.setDateTo(getDateTo());
		clone.setLeader(getLeader());
		clone.setSynchdate(getSynchdate());

		return clone;
	}

	@Override
	public int compareTo(ConfirmedInspection confirmedInspection) {
		int value = 0;

		if (getId() < confirmedInspection.getId()) {
			value = -1;
		}
		else if (getId() > confirmedInspection.getId()) {
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

		if (!(obj instanceof ConfirmedInspectionClp)) {
			return false;
		}

		ConfirmedInspectionClp confirmedInspection = (ConfirmedInspectionClp)obj;

		long primaryKey = confirmedInspection.getPrimaryKey();

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
	public String toString() {
		StringBundler sb = new StringBundler(55);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", registeredInspectionId=");
		sb.append(getRegisteredInspectionId());
		sb.append(", customsDeclarationId=");
		sb.append(getCustomsDeclarationId());
		sb.append(", confirmationCode=");
		sb.append(getConfirmationCode());
		sb.append(", attachedFile=");
		sb.append(getAttachedFile());
		sb.append(", inspectionDate=");
		sb.append(getInspectionDate());
		sb.append(", inspectionSite=");
		sb.append(getInspectionSite());
		sb.append(", inspectionDistrictCode=");
		sb.append(getInspectionDistrictCode());
		sb.append(", inspectionProvincecode=");
		sb.append(getInspectionProvincecode());
		sb.append(", customsRegion=");
		sb.append(getCustomsRegion());
		sb.append(", markasChangedSite=");
		sb.append(getMarkasChangedSite());
		sb.append(", contactName=");
		sb.append(getContactName());
		sb.append(", contactPhone=");
		sb.append(getContactPhone());
		sb.append(", contactEmail=");
		sb.append(getContactEmail());
		sb.append(", signName=");
		sb.append(getSignName());
		sb.append(", signTitle=");
		sb.append(getSignTitle());
		sb.append(", signPlace=");
		sb.append(getSignPlace());
		sb.append(", signDate=");
		sb.append(getSignDate());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append(", corporationId=");
		sb.append(getCorporationId());
		sb.append(", inspectorId=");
		sb.append(getInspectorId());
		sb.append(", phieuXuLyPhuId=");
		sb.append(getPhieuXuLyPhuId());
		sb.append(", hoSoThuTucId=");
		sb.append(getHoSoThuTucId());
		sb.append(", dateFrom=");
		sb.append(getDateFrom());
		sb.append(", dateTo=");
		sb.append(getDateTo());
		sb.append(", leader=");
		sb.append(getLeader());
		sb.append(", synchdate=");
		sb.append(getSynchdate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(85);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registeredInspectionId</column-name><column-value><![CDATA[");
		sb.append(getRegisteredInspectionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>customsDeclarationId</column-name><column-value><![CDATA[");
		sb.append(getCustomsDeclarationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>confirmationCode</column-name><column-value><![CDATA[");
		sb.append(getConfirmationCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attachedFile</column-name><column-value><![CDATA[");
		sb.append(getAttachedFile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionDate</column-name><column-value><![CDATA[");
		sb.append(getInspectionDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionSite</column-name><column-value><![CDATA[");
		sb.append(getInspectionSite());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionDistrictCode</column-name><column-value><![CDATA[");
		sb.append(getInspectionDistrictCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionProvincecode</column-name><column-value><![CDATA[");
		sb.append(getInspectionProvincecode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>customsRegion</column-name><column-value><![CDATA[");
		sb.append(getCustomsRegion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markasChangedSite</column-name><column-value><![CDATA[");
		sb.append(getMarkasChangedSite());
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
			"<column><column-name>contactEmail</column-name><column-value><![CDATA[");
		sb.append(getContactEmail());
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
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
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
			"<column><column-name>phieuXuLyPhuId</column-name><column-value><![CDATA[");
		sb.append(getPhieuXuLyPhuId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoSoThuTucId</column-name><column-value><![CDATA[");
		sb.append(getHoSoThuTucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateFrom</column-name><column-value><![CDATA[");
		sb.append(getDateFrom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateTo</column-name><column-value><![CDATA[");
		sb.append(getDateTo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>leader</column-name><column-value><![CDATA[");
		sb.append(getLeader());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>synchdate</column-name><column-value><![CDATA[");
		sb.append(getSynchdate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _registeredInspectionId;
	private long _customsDeclarationId;
	private long _confirmationCode;
	private long _attachedFile;
	private Date _inspectionDate;
	private String _inspectionSite;
	private String _inspectionDistrictCode;
	private String _inspectionProvincecode;
	private long _customsRegion;
	private long _markasChangedSite;
	private String _contactName;
	private String _contactPhone;
	private String _contactEmail;
	private String _signName;
	private String _signTitle;
	private String _signPlace;
	private Date _signDate;
	private String _remarks;
	private String _corporationId;
	private long _inspectorId;
	private long _phieuXuLyPhuId;
	private long _hoSoThuTucId;
	private Date _dateFrom;
	private Date _dateTo;
	private int _leader;
	private Date _synchdate;
	private BaseModel<?> _confirmedInspectionRemoteModel;
}