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
 * This class is a wrapper for {@link ConfirmedInspection}.
 * </p>
 *
 * @author win_64
 * @see ConfirmedInspection
 * @generated
 */
public class ConfirmedInspectionWrapper implements ConfirmedInspection,
	ModelWrapper<ConfirmedInspection> {
	public ConfirmedInspectionWrapper(ConfirmedInspection confirmedInspection) {
		_confirmedInspection = confirmedInspection;
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
	}

	/**
	* Returns the primary key of this confirmed inspection.
	*
	* @return the primary key of this confirmed inspection
	*/
	@Override
	public long getPrimaryKey() {
		return _confirmedInspection.getPrimaryKey();
	}

	/**
	* Sets the primary key of this confirmed inspection.
	*
	* @param primaryKey the primary key of this confirmed inspection
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_confirmedInspection.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this confirmed inspection.
	*
	* @return the ID of this confirmed inspection
	*/
	@Override
	public long getId() {
		return _confirmedInspection.getId();
	}

	/**
	* Sets the ID of this confirmed inspection.
	*
	* @param id the ID of this confirmed inspection
	*/
	@Override
	public void setId(long id) {
		_confirmedInspection.setId(id);
	}

	/**
	* Returns the registered inspection ID of this confirmed inspection.
	*
	* @return the registered inspection ID of this confirmed inspection
	*/
	@Override
	public long getRegisteredInspectionId() {
		return _confirmedInspection.getRegisteredInspectionId();
	}

	/**
	* Sets the registered inspection ID of this confirmed inspection.
	*
	* @param registeredInspectionId the registered inspection ID of this confirmed inspection
	*/
	@Override
	public void setRegisteredInspectionId(long registeredInspectionId) {
		_confirmedInspection.setRegisteredInspectionId(registeredInspectionId);
	}

	/**
	* Returns the customs declaration ID of this confirmed inspection.
	*
	* @return the customs declaration ID of this confirmed inspection
	*/
	@Override
	public long getCustomsDeclarationId() {
		return _confirmedInspection.getCustomsDeclarationId();
	}

	/**
	* Sets the customs declaration ID of this confirmed inspection.
	*
	* @param customsDeclarationId the customs declaration ID of this confirmed inspection
	*/
	@Override
	public void setCustomsDeclarationId(long customsDeclarationId) {
		_confirmedInspection.setCustomsDeclarationId(customsDeclarationId);
	}

	/**
	* Returns the confirmation code of this confirmed inspection.
	*
	* @return the confirmation code of this confirmed inspection
	*/
	@Override
	public long getConfirmationCode() {
		return _confirmedInspection.getConfirmationCode();
	}

	/**
	* Sets the confirmation code of this confirmed inspection.
	*
	* @param confirmationCode the confirmation code of this confirmed inspection
	*/
	@Override
	public void setConfirmationCode(long confirmationCode) {
		_confirmedInspection.setConfirmationCode(confirmationCode);
	}

	/**
	* Returns the attached file of this confirmed inspection.
	*
	* @return the attached file of this confirmed inspection
	*/
	@Override
	public long getAttachedFile() {
		return _confirmedInspection.getAttachedFile();
	}

	/**
	* Sets the attached file of this confirmed inspection.
	*
	* @param attachedFile the attached file of this confirmed inspection
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_confirmedInspection.setAttachedFile(attachedFile);
	}

	/**
	* Returns the inspection date of this confirmed inspection.
	*
	* @return the inspection date of this confirmed inspection
	*/
	@Override
	public java.util.Date getInspectionDate() {
		return _confirmedInspection.getInspectionDate();
	}

	/**
	* Sets the inspection date of this confirmed inspection.
	*
	* @param inspectionDate the inspection date of this confirmed inspection
	*/
	@Override
	public void setInspectionDate(java.util.Date inspectionDate) {
		_confirmedInspection.setInspectionDate(inspectionDate);
	}

	/**
	* Returns the inspection site of this confirmed inspection.
	*
	* @return the inspection site of this confirmed inspection
	*/
	@Override
	public java.lang.String getInspectionSite() {
		return _confirmedInspection.getInspectionSite();
	}

	/**
	* Sets the inspection site of this confirmed inspection.
	*
	* @param inspectionSite the inspection site of this confirmed inspection
	*/
	@Override
	public void setInspectionSite(java.lang.String inspectionSite) {
		_confirmedInspection.setInspectionSite(inspectionSite);
	}

	/**
	* Returns the inspection district code of this confirmed inspection.
	*
	* @return the inspection district code of this confirmed inspection
	*/
	@Override
	public java.lang.String getInspectionDistrictCode() {
		return _confirmedInspection.getInspectionDistrictCode();
	}

	/**
	* Sets the inspection district code of this confirmed inspection.
	*
	* @param inspectionDistrictCode the inspection district code of this confirmed inspection
	*/
	@Override
	public void setInspectionDistrictCode(
		java.lang.String inspectionDistrictCode) {
		_confirmedInspection.setInspectionDistrictCode(inspectionDistrictCode);
	}

	/**
	* Returns the inspection provincecode of this confirmed inspection.
	*
	* @return the inspection provincecode of this confirmed inspection
	*/
	@Override
	public java.lang.String getInspectionProvincecode() {
		return _confirmedInspection.getInspectionProvincecode();
	}

	/**
	* Sets the inspection provincecode of this confirmed inspection.
	*
	* @param inspectionProvincecode the inspection provincecode of this confirmed inspection
	*/
	@Override
	public void setInspectionProvincecode(
		java.lang.String inspectionProvincecode) {
		_confirmedInspection.setInspectionProvincecode(inspectionProvincecode);
	}

	/**
	* Returns the customs region of this confirmed inspection.
	*
	* @return the customs region of this confirmed inspection
	*/
	@Override
	public long getCustomsRegion() {
		return _confirmedInspection.getCustomsRegion();
	}

	/**
	* Sets the customs region of this confirmed inspection.
	*
	* @param customsRegion the customs region of this confirmed inspection
	*/
	@Override
	public void setCustomsRegion(long customsRegion) {
		_confirmedInspection.setCustomsRegion(customsRegion);
	}

	/**
	* Returns the markas changed site of this confirmed inspection.
	*
	* @return the markas changed site of this confirmed inspection
	*/
	@Override
	public long getMarkasChangedSite() {
		return _confirmedInspection.getMarkasChangedSite();
	}

	/**
	* Sets the markas changed site of this confirmed inspection.
	*
	* @param markasChangedSite the markas changed site of this confirmed inspection
	*/
	@Override
	public void setMarkasChangedSite(long markasChangedSite) {
		_confirmedInspection.setMarkasChangedSite(markasChangedSite);
	}

	/**
	* Returns the contact name of this confirmed inspection.
	*
	* @return the contact name of this confirmed inspection
	*/
	@Override
	public java.lang.String getContactName() {
		return _confirmedInspection.getContactName();
	}

	/**
	* Sets the contact name of this confirmed inspection.
	*
	* @param contactName the contact name of this confirmed inspection
	*/
	@Override
	public void setContactName(java.lang.String contactName) {
		_confirmedInspection.setContactName(contactName);
	}

	/**
	* Returns the contact phone of this confirmed inspection.
	*
	* @return the contact phone of this confirmed inspection
	*/
	@Override
	public java.lang.String getContactPhone() {
		return _confirmedInspection.getContactPhone();
	}

	/**
	* Sets the contact phone of this confirmed inspection.
	*
	* @param contactPhone the contact phone of this confirmed inspection
	*/
	@Override
	public void setContactPhone(java.lang.String contactPhone) {
		_confirmedInspection.setContactPhone(contactPhone);
	}

	/**
	* Returns the contact email of this confirmed inspection.
	*
	* @return the contact email of this confirmed inspection
	*/
	@Override
	public java.lang.String getContactEmail() {
		return _confirmedInspection.getContactEmail();
	}

	/**
	* Sets the contact email of this confirmed inspection.
	*
	* @param contactEmail the contact email of this confirmed inspection
	*/
	@Override
	public void setContactEmail(java.lang.String contactEmail) {
		_confirmedInspection.setContactEmail(contactEmail);
	}

	/**
	* Returns the sign name of this confirmed inspection.
	*
	* @return the sign name of this confirmed inspection
	*/
	@Override
	public java.lang.String getSignName() {
		return _confirmedInspection.getSignName();
	}

	/**
	* Sets the sign name of this confirmed inspection.
	*
	* @param signName the sign name of this confirmed inspection
	*/
	@Override
	public void setSignName(java.lang.String signName) {
		_confirmedInspection.setSignName(signName);
	}

	/**
	* Returns the sign title of this confirmed inspection.
	*
	* @return the sign title of this confirmed inspection
	*/
	@Override
	public java.lang.String getSignTitle() {
		return _confirmedInspection.getSignTitle();
	}

	/**
	* Sets the sign title of this confirmed inspection.
	*
	* @param signTitle the sign title of this confirmed inspection
	*/
	@Override
	public void setSignTitle(java.lang.String signTitle) {
		_confirmedInspection.setSignTitle(signTitle);
	}

	/**
	* Returns the sign place of this confirmed inspection.
	*
	* @return the sign place of this confirmed inspection
	*/
	@Override
	public java.lang.String getSignPlace() {
		return _confirmedInspection.getSignPlace();
	}

	/**
	* Sets the sign place of this confirmed inspection.
	*
	* @param signPlace the sign place of this confirmed inspection
	*/
	@Override
	public void setSignPlace(java.lang.String signPlace) {
		_confirmedInspection.setSignPlace(signPlace);
	}

	/**
	* Returns the sign date of this confirmed inspection.
	*
	* @return the sign date of this confirmed inspection
	*/
	@Override
	public java.util.Date getSignDate() {
		return _confirmedInspection.getSignDate();
	}

	/**
	* Sets the sign date of this confirmed inspection.
	*
	* @param signDate the sign date of this confirmed inspection
	*/
	@Override
	public void setSignDate(java.util.Date signDate) {
		_confirmedInspection.setSignDate(signDate);
	}

	/**
	* Returns the remarks of this confirmed inspection.
	*
	* @return the remarks of this confirmed inspection
	*/
	@Override
	public java.lang.String getRemarks() {
		return _confirmedInspection.getRemarks();
	}

	/**
	* Sets the remarks of this confirmed inspection.
	*
	* @param remarks the remarks of this confirmed inspection
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_confirmedInspection.setRemarks(remarks);
	}

	/**
	* Returns the corporation ID of this confirmed inspection.
	*
	* @return the corporation ID of this confirmed inspection
	*/
	@Override
	public java.lang.String getCorporationId() {
		return _confirmedInspection.getCorporationId();
	}

	/**
	* Sets the corporation ID of this confirmed inspection.
	*
	* @param corporationId the corporation ID of this confirmed inspection
	*/
	@Override
	public void setCorporationId(java.lang.String corporationId) {
		_confirmedInspection.setCorporationId(corporationId);
	}

	/**
	* Returns the inspector ID of this confirmed inspection.
	*
	* @return the inspector ID of this confirmed inspection
	*/
	@Override
	public long getInspectorId() {
		return _confirmedInspection.getInspectorId();
	}

	/**
	* Sets the inspector ID of this confirmed inspection.
	*
	* @param inspectorId the inspector ID of this confirmed inspection
	*/
	@Override
	public void setInspectorId(long inspectorId) {
		_confirmedInspection.setInspectorId(inspectorId);
	}

	/**
	* Returns the phieu xu ly phu ID of this confirmed inspection.
	*
	* @return the phieu xu ly phu ID of this confirmed inspection
	*/
	@Override
	public long getPhieuXuLyPhuId() {
		return _confirmedInspection.getPhieuXuLyPhuId();
	}

	/**
	* Sets the phieu xu ly phu ID of this confirmed inspection.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID of this confirmed inspection
	*/
	@Override
	public void setPhieuXuLyPhuId(long phieuXuLyPhuId) {
		_confirmedInspection.setPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	/**
	* Returns the ho so thu tuc ID of this confirmed inspection.
	*
	* @return the ho so thu tuc ID of this confirmed inspection
	*/
	@Override
	public long getHoSoThuTucId() {
		return _confirmedInspection.getHoSoThuTucId();
	}

	/**
	* Sets the ho so thu tuc ID of this confirmed inspection.
	*
	* @param hoSoThuTucId the ho so thu tuc ID of this confirmed inspection
	*/
	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_confirmedInspection.setHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the date from of this confirmed inspection.
	*
	* @return the date from of this confirmed inspection
	*/
	@Override
	public java.util.Date getDateFrom() {
		return _confirmedInspection.getDateFrom();
	}

	/**
	* Sets the date from of this confirmed inspection.
	*
	* @param dateFrom the date from of this confirmed inspection
	*/
	@Override
	public void setDateFrom(java.util.Date dateFrom) {
		_confirmedInspection.setDateFrom(dateFrom);
	}

	/**
	* Returns the date to of this confirmed inspection.
	*
	* @return the date to of this confirmed inspection
	*/
	@Override
	public java.util.Date getDateTo() {
		return _confirmedInspection.getDateTo();
	}

	/**
	* Sets the date to of this confirmed inspection.
	*
	* @param dateTo the date to of this confirmed inspection
	*/
	@Override
	public void setDateTo(java.util.Date dateTo) {
		_confirmedInspection.setDateTo(dateTo);
	}

	/**
	* Returns the leader of this confirmed inspection.
	*
	* @return the leader of this confirmed inspection
	*/
	@Override
	public int getLeader() {
		return _confirmedInspection.getLeader();
	}

	/**
	* Sets the leader of this confirmed inspection.
	*
	* @param leader the leader of this confirmed inspection
	*/
	@Override
	public void setLeader(int leader) {
		_confirmedInspection.setLeader(leader);
	}

	@Override
	public boolean isNew() {
		return _confirmedInspection.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_confirmedInspection.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _confirmedInspection.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_confirmedInspection.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _confirmedInspection.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _confirmedInspection.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_confirmedInspection.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _confirmedInspection.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_confirmedInspection.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_confirmedInspection.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_confirmedInspection.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ConfirmedInspectionWrapper((ConfirmedInspection)_confirmedInspection.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection confirmedInspection) {
		return _confirmedInspection.compareTo(confirmedInspection);
	}

	@Override
	public int hashCode() {
		return _confirmedInspection.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> toCacheModel() {
		return _confirmedInspection.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection toEscapedModel() {
		return new ConfirmedInspectionWrapper(_confirmedInspection.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection toUnescapedModel() {
		return new ConfirmedInspectionWrapper(_confirmedInspection.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _confirmedInspection.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _confirmedInspection.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_confirmedInspection.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ConfirmedInspectionWrapper)) {
			return false;
		}

		ConfirmedInspectionWrapper confirmedInspectionWrapper = (ConfirmedInspectionWrapper)obj;

		if (Validator.equals(_confirmedInspection,
					confirmedInspectionWrapper._confirmedInspection)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ConfirmedInspection getWrappedConfirmedInspection() {
		return _confirmedInspection;
	}

	@Override
	public ConfirmedInspection getWrappedModel() {
		return _confirmedInspection;
	}

	@Override
	public void resetOriginalValues() {
		_confirmedInspection.resetOriginalValues();
	}

	private ConfirmedInspection _confirmedInspection;
}