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
 * This class is a wrapper for {@link InspectionRecordAttach}.
 * </p>
 *
 * @author huymq
 * @see InspectionRecordAttach
 * @generated
 */
public class InspectionRecordAttachWrapper implements InspectionRecordAttach,
	ModelWrapper<InspectionRecordAttach> {
	public InspectionRecordAttachWrapper(
		InspectionRecordAttach inspectionRecordAttach) {
		_inspectionRecordAttach = inspectionRecordAttach;
	}

	@Override
	public Class<?> getModelClass() {
		return InspectionRecordAttach.class;
	}

	@Override
	public String getModelClassName() {
		return InspectionRecordAttach.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("inspectionRecordId", getInspectionRecordId());
		attributes.put("hoSoThuTucId", getHoSoThuTucId());
		attributes.put("enTryId", getEnTryId());
		attributes.put("enTryName", getEnTryName());
		attributes.put("inspectorId", getInspectorId());
		attributes.put("uploadTime", getUploadTime());
		attributes.put("markUpDelte", getMarkUpDelte());
		attributes.put("synchdate", getSynchdate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long inspectionRecordId = (Long)attributes.get("inspectionRecordId");

		if (inspectionRecordId != null) {
			setInspectionRecordId(inspectionRecordId);
		}

		Long hoSoThuTucId = (Long)attributes.get("hoSoThuTucId");

		if (hoSoThuTucId != null) {
			setHoSoThuTucId(hoSoThuTucId);
		}

		String enTryId = (String)attributes.get("enTryId");

		if (enTryId != null) {
			setEnTryId(enTryId);
		}

		String enTryName = (String)attributes.get("enTryName");

		if (enTryName != null) {
			setEnTryName(enTryName);
		}

		Long inspectorId = (Long)attributes.get("inspectorId");

		if (inspectorId != null) {
			setInspectorId(inspectorId);
		}

		Date uploadTime = (Date)attributes.get("uploadTime");

		if (uploadTime != null) {
			setUploadTime(uploadTime);
		}

		Integer markUpDelte = (Integer)attributes.get("markUpDelte");

		if (markUpDelte != null) {
			setMarkUpDelte(markUpDelte);
		}

		Date synchdate = (Date)attributes.get("synchdate");

		if (synchdate != null) {
			setSynchdate(synchdate);
		}
	}

	/**
	* Returns the primary key of this inspection record attach.
	*
	* @return the primary key of this inspection record attach
	*/
	@Override
	public long getPrimaryKey() {
		return _inspectionRecordAttach.getPrimaryKey();
	}

	/**
	* Sets the primary key of this inspection record attach.
	*
	* @param primaryKey the primary key of this inspection record attach
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_inspectionRecordAttach.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this inspection record attach.
	*
	* @return the ID of this inspection record attach
	*/
	@Override
	public long getId() {
		return _inspectionRecordAttach.getId();
	}

	/**
	* Sets the ID of this inspection record attach.
	*
	* @param id the ID of this inspection record attach
	*/
	@Override
	public void setId(long id) {
		_inspectionRecordAttach.setId(id);
	}

	/**
	* Returns the inspection record ID of this inspection record attach.
	*
	* @return the inspection record ID of this inspection record attach
	*/
	@Override
	public long getInspectionRecordId() {
		return _inspectionRecordAttach.getInspectionRecordId();
	}

	/**
	* Sets the inspection record ID of this inspection record attach.
	*
	* @param inspectionRecordId the inspection record ID of this inspection record attach
	*/
	@Override
	public void setInspectionRecordId(long inspectionRecordId) {
		_inspectionRecordAttach.setInspectionRecordId(inspectionRecordId);
	}

	/**
	* Returns the ho so thu tuc ID of this inspection record attach.
	*
	* @return the ho so thu tuc ID of this inspection record attach
	*/
	@Override
	public long getHoSoThuTucId() {
		return _inspectionRecordAttach.getHoSoThuTucId();
	}

	/**
	* Sets the ho so thu tuc ID of this inspection record attach.
	*
	* @param hoSoThuTucId the ho so thu tuc ID of this inspection record attach
	*/
	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_inspectionRecordAttach.setHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the en try ID of this inspection record attach.
	*
	* @return the en try ID of this inspection record attach
	*/
	@Override
	public java.lang.String getEnTryId() {
		return _inspectionRecordAttach.getEnTryId();
	}

	/**
	* Sets the en try ID of this inspection record attach.
	*
	* @param enTryId the en try ID of this inspection record attach
	*/
	@Override
	public void setEnTryId(java.lang.String enTryId) {
		_inspectionRecordAttach.setEnTryId(enTryId);
	}

	/**
	* Returns the en try name of this inspection record attach.
	*
	* @return the en try name of this inspection record attach
	*/
	@Override
	public java.lang.String getEnTryName() {
		return _inspectionRecordAttach.getEnTryName();
	}

	/**
	* Sets the en try name of this inspection record attach.
	*
	* @param enTryName the en try name of this inspection record attach
	*/
	@Override
	public void setEnTryName(java.lang.String enTryName) {
		_inspectionRecordAttach.setEnTryName(enTryName);
	}

	/**
	* Returns the inspector ID of this inspection record attach.
	*
	* @return the inspector ID of this inspection record attach
	*/
	@Override
	public long getInspectorId() {
		return _inspectionRecordAttach.getInspectorId();
	}

	/**
	* Sets the inspector ID of this inspection record attach.
	*
	* @param inspectorId the inspector ID of this inspection record attach
	*/
	@Override
	public void setInspectorId(long inspectorId) {
		_inspectionRecordAttach.setInspectorId(inspectorId);
	}

	/**
	* Returns the upload time of this inspection record attach.
	*
	* @return the upload time of this inspection record attach
	*/
	@Override
	public java.util.Date getUploadTime() {
		return _inspectionRecordAttach.getUploadTime();
	}

	/**
	* Sets the upload time of this inspection record attach.
	*
	* @param uploadTime the upload time of this inspection record attach
	*/
	@Override
	public void setUploadTime(java.util.Date uploadTime) {
		_inspectionRecordAttach.setUploadTime(uploadTime);
	}

	/**
	* Returns the mark up delte of this inspection record attach.
	*
	* @return the mark up delte of this inspection record attach
	*/
	@Override
	public int getMarkUpDelte() {
		return _inspectionRecordAttach.getMarkUpDelte();
	}

	/**
	* Sets the mark up delte of this inspection record attach.
	*
	* @param markUpDelte the mark up delte of this inspection record attach
	*/
	@Override
	public void setMarkUpDelte(int markUpDelte) {
		_inspectionRecordAttach.setMarkUpDelte(markUpDelte);
	}

	/**
	* Returns the synchdate of this inspection record attach.
	*
	* @return the synchdate of this inspection record attach
	*/
	@Override
	public java.util.Date getSynchdate() {
		return _inspectionRecordAttach.getSynchdate();
	}

	/**
	* Sets the synchdate of this inspection record attach.
	*
	* @param synchdate the synchdate of this inspection record attach
	*/
	@Override
	public void setSynchdate(java.util.Date synchdate) {
		_inspectionRecordAttach.setSynchdate(synchdate);
	}

	@Override
	public boolean isNew() {
		return _inspectionRecordAttach.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_inspectionRecordAttach.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _inspectionRecordAttach.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_inspectionRecordAttach.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _inspectionRecordAttach.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _inspectionRecordAttach.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_inspectionRecordAttach.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _inspectionRecordAttach.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_inspectionRecordAttach.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_inspectionRecordAttach.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_inspectionRecordAttach.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new InspectionRecordAttachWrapper((InspectionRecordAttach)_inspectionRecordAttach.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach inspectionRecordAttach) {
		return _inspectionRecordAttach.compareTo(inspectionRecordAttach);
	}

	@Override
	public int hashCode() {
		return _inspectionRecordAttach.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach> toCacheModel() {
		return _inspectionRecordAttach.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach toEscapedModel() {
		return new InspectionRecordAttachWrapper(_inspectionRecordAttach.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach toUnescapedModel() {
		return new InspectionRecordAttachWrapper(_inspectionRecordAttach.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _inspectionRecordAttach.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _inspectionRecordAttach.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_inspectionRecordAttach.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof InspectionRecordAttachWrapper)) {
			return false;
		}

		InspectionRecordAttachWrapper inspectionRecordAttachWrapper = (InspectionRecordAttachWrapper)obj;

		if (Validator.equals(_inspectionRecordAttach,
					inspectionRecordAttachWrapper._inspectionRecordAttach)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public InspectionRecordAttach getWrappedInspectionRecordAttach() {
		return _inspectionRecordAttach;
	}

	@Override
	public InspectionRecordAttach getWrappedModel() {
		return _inspectionRecordAttach;
	}

	@Override
	public void resetOriginalValues() {
		_inspectionRecordAttach.resetOriginalValues();
	}

	private InspectionRecordAttach _inspectionRecordAttach;
}