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
 * This class is a wrapper for {@link CorporationAttendee}.
 * </p>
 *
 * @author win_64
 * @see CorporationAttendee
 * @generated
 */
public class CorporationAttendeeWrapper implements CorporationAttendee,
	ModelWrapper<CorporationAttendee> {
	public CorporationAttendeeWrapper(CorporationAttendee corporationAttendee) {
		_corporationAttendee = corporationAttendee;
	}

	@Override
	public Class<?> getModelClass() {
		return CorporationAttendee.class;
	}

	@Override
	public String getModelClassName() {
		return CorporationAttendee.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("confirmedInspectionId", getConfirmedInspectionId());
		attributes.put("sequence", getSequence());
		attributes.put("inspectorid", getInspectorid());
		attributes.put("inspectorName", getInspectorName());
		attributes.put("inspectorRole", getInspectorRole());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long confirmedInspectionId = (Long)attributes.get(
				"confirmedInspectionId");

		if (confirmedInspectionId != null) {
			setConfirmedInspectionId(confirmedInspectionId);
		}

		Long sequence = (Long)attributes.get("sequence");

		if (sequence != null) {
			setSequence(sequence);
		}

		Long inspectorid = (Long)attributes.get("inspectorid");

		if (inspectorid != null) {
			setInspectorid(inspectorid);
		}

		String inspectorName = (String)attributes.get("inspectorName");

		if (inspectorName != null) {
			setInspectorName(inspectorName);
		}

		Long inspectorRole = (Long)attributes.get("inspectorRole");

		if (inspectorRole != null) {
			setInspectorRole(inspectorRole);
		}
	}

	/**
	* Returns the primary key of this corporation attendee.
	*
	* @return the primary key of this corporation attendee
	*/
	@Override
	public long getPrimaryKey() {
		return _corporationAttendee.getPrimaryKey();
	}

	/**
	* Sets the primary key of this corporation attendee.
	*
	* @param primaryKey the primary key of this corporation attendee
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_corporationAttendee.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this corporation attendee.
	*
	* @return the ID of this corporation attendee
	*/
	@Override
	public long getId() {
		return _corporationAttendee.getId();
	}

	/**
	* Sets the ID of this corporation attendee.
	*
	* @param id the ID of this corporation attendee
	*/
	@Override
	public void setId(long id) {
		_corporationAttendee.setId(id);
	}

	/**
	* Returns the confirmed inspection ID of this corporation attendee.
	*
	* @return the confirmed inspection ID of this corporation attendee
	*/
	@Override
	public long getConfirmedInspectionId() {
		return _corporationAttendee.getConfirmedInspectionId();
	}

	/**
	* Sets the confirmed inspection ID of this corporation attendee.
	*
	* @param confirmedInspectionId the confirmed inspection ID of this corporation attendee
	*/
	@Override
	public void setConfirmedInspectionId(long confirmedInspectionId) {
		_corporationAttendee.setConfirmedInspectionId(confirmedInspectionId);
	}

	/**
	* Returns the sequence of this corporation attendee.
	*
	* @return the sequence of this corporation attendee
	*/
	@Override
	public long getSequence() {
		return _corporationAttendee.getSequence();
	}

	/**
	* Sets the sequence of this corporation attendee.
	*
	* @param sequence the sequence of this corporation attendee
	*/
	@Override
	public void setSequence(long sequence) {
		_corporationAttendee.setSequence(sequence);
	}

	/**
	* Returns the inspectorid of this corporation attendee.
	*
	* @return the inspectorid of this corporation attendee
	*/
	@Override
	public long getInspectorid() {
		return _corporationAttendee.getInspectorid();
	}

	/**
	* Sets the inspectorid of this corporation attendee.
	*
	* @param inspectorid the inspectorid of this corporation attendee
	*/
	@Override
	public void setInspectorid(long inspectorid) {
		_corporationAttendee.setInspectorid(inspectorid);
	}

	/**
	* Returns the inspector name of this corporation attendee.
	*
	* @return the inspector name of this corporation attendee
	*/
	@Override
	public java.lang.String getInspectorName() {
		return _corporationAttendee.getInspectorName();
	}

	/**
	* Sets the inspector name of this corporation attendee.
	*
	* @param inspectorName the inspector name of this corporation attendee
	*/
	@Override
	public void setInspectorName(java.lang.String inspectorName) {
		_corporationAttendee.setInspectorName(inspectorName);
	}

	/**
	* Returns the inspector role of this corporation attendee.
	*
	* @return the inspector role of this corporation attendee
	*/
	@Override
	public long getInspectorRole() {
		return _corporationAttendee.getInspectorRole();
	}

	/**
	* Sets the inspector role of this corporation attendee.
	*
	* @param inspectorRole the inspector role of this corporation attendee
	*/
	@Override
	public void setInspectorRole(long inspectorRole) {
		_corporationAttendee.setInspectorRole(inspectorRole);
	}

	@Override
	public boolean isNew() {
		return _corporationAttendee.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_corporationAttendee.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _corporationAttendee.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_corporationAttendee.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _corporationAttendee.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _corporationAttendee.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_corporationAttendee.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _corporationAttendee.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_corporationAttendee.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_corporationAttendee.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_corporationAttendee.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CorporationAttendeeWrapper((CorporationAttendee)_corporationAttendee.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee corporationAttendee) {
		return _corporationAttendee.compareTo(corporationAttendee);
	}

	@Override
	public int hashCode() {
		return _corporationAttendee.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee> toCacheModel() {
		return _corporationAttendee.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee toEscapedModel() {
		return new CorporationAttendeeWrapper(_corporationAttendee.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee toUnescapedModel() {
		return new CorporationAttendeeWrapper(_corporationAttendee.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _corporationAttendee.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _corporationAttendee.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_corporationAttendee.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CorporationAttendeeWrapper)) {
			return false;
		}

		CorporationAttendeeWrapper corporationAttendeeWrapper = (CorporationAttendeeWrapper)obj;

		if (Validator.equals(_corporationAttendee,
					corporationAttendeeWrapper._corporationAttendee)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CorporationAttendee getWrappedCorporationAttendee() {
		return _corporationAttendee;
	}

	@Override
	public CorporationAttendee getWrappedModel() {
		return _corporationAttendee;
	}

	@Override
	public void resetOriginalValues() {
		_corporationAttendee.resetOriginalValues();
	}

	private CorporationAttendee _corporationAttendee;
}