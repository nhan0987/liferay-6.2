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
 * This class is a wrapper for {@link CorporationView}.
 * </p>
 *
 * @author huymq
 * @see CorporationView
 * @generated
 */
public class CorporationViewWrapper implements CorporationView,
	ModelWrapper<CorporationView> {
	public CorporationViewWrapper(CorporationView corporationView) {
		_corporationView = corporationView;
	}

	@Override
	public Class<?> getModelClass() {
		return CorporationView.class;
	}

	@Override
	public String getModelClassName() {
		return CorporationView.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("corporationId", getCorporationId());
		attributes.put("corporationName", getCorporationName());
		attributes.put("inspectorId", getInspectorId());
		attributes.put("isLeader", getIsLeader());
		attributes.put("synchdate", getSynchdate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String corporationId = (String)attributes.get("corporationId");

		if (corporationId != null) {
			setCorporationId(corporationId);
		}

		String corporationName = (String)attributes.get("corporationName");

		if (corporationName != null) {
			setCorporationName(corporationName);
		}

		Long inspectorId = (Long)attributes.get("inspectorId");

		if (inspectorId != null) {
			setInspectorId(inspectorId);
		}

		Integer isLeader = (Integer)attributes.get("isLeader");

		if (isLeader != null) {
			setIsLeader(isLeader);
		}

		Date synchdate = (Date)attributes.get("synchdate");

		if (synchdate != null) {
			setSynchdate(synchdate);
		}
	}

	/**
	* Returns the primary key of this corporation view.
	*
	* @return the primary key of this corporation view
	*/
	@Override
	public long getPrimaryKey() {
		return _corporationView.getPrimaryKey();
	}

	/**
	* Sets the primary key of this corporation view.
	*
	* @param primaryKey the primary key of this corporation view
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_corporationView.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this corporation view.
	*
	* @return the ID of this corporation view
	*/
	@Override
	public long getId() {
		return _corporationView.getId();
	}

	/**
	* Sets the ID of this corporation view.
	*
	* @param id the ID of this corporation view
	*/
	@Override
	public void setId(long id) {
		_corporationView.setId(id);
	}

	/**
	* Returns the corporation ID of this corporation view.
	*
	* @return the corporation ID of this corporation view
	*/
	@Override
	public java.lang.String getCorporationId() {
		return _corporationView.getCorporationId();
	}

	/**
	* Sets the corporation ID of this corporation view.
	*
	* @param corporationId the corporation ID of this corporation view
	*/
	@Override
	public void setCorporationId(java.lang.String corporationId) {
		_corporationView.setCorporationId(corporationId);
	}

	/**
	* Returns the corporation name of this corporation view.
	*
	* @return the corporation name of this corporation view
	*/
	@Override
	public java.lang.String getCorporationName() {
		return _corporationView.getCorporationName();
	}

	/**
	* Sets the corporation name of this corporation view.
	*
	* @param corporationName the corporation name of this corporation view
	*/
	@Override
	public void setCorporationName(java.lang.String corporationName) {
		_corporationView.setCorporationName(corporationName);
	}

	/**
	* Returns the inspector ID of this corporation view.
	*
	* @return the inspector ID of this corporation view
	*/
	@Override
	public long getInspectorId() {
		return _corporationView.getInspectorId();
	}

	/**
	* Sets the inspector ID of this corporation view.
	*
	* @param inspectorId the inspector ID of this corporation view
	*/
	@Override
	public void setInspectorId(long inspectorId) {
		_corporationView.setInspectorId(inspectorId);
	}

	/**
	* Returns the is leader of this corporation view.
	*
	* @return the is leader of this corporation view
	*/
	@Override
	public int getIsLeader() {
		return _corporationView.getIsLeader();
	}

	/**
	* Sets the is leader of this corporation view.
	*
	* @param isLeader the is leader of this corporation view
	*/
	@Override
	public void setIsLeader(int isLeader) {
		_corporationView.setIsLeader(isLeader);
	}

	/**
	* Returns the synchdate of this corporation view.
	*
	* @return the synchdate of this corporation view
	*/
	@Override
	public java.util.Date getSynchdate() {
		return _corporationView.getSynchdate();
	}

	/**
	* Sets the synchdate of this corporation view.
	*
	* @param synchdate the synchdate of this corporation view
	*/
	@Override
	public void setSynchdate(java.util.Date synchdate) {
		_corporationView.setSynchdate(synchdate);
	}

	@Override
	public boolean isNew() {
		return _corporationView.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_corporationView.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _corporationView.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_corporationView.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _corporationView.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _corporationView.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_corporationView.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _corporationView.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_corporationView.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_corporationView.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_corporationView.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CorporationViewWrapper((CorporationView)_corporationView.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView corporationView) {
		return _corporationView.compareTo(corporationView);
	}

	@Override
	public int hashCode() {
		return _corporationView.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView> toCacheModel() {
		return _corporationView.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView toEscapedModel() {
		return new CorporationViewWrapper(_corporationView.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView toUnescapedModel() {
		return new CorporationViewWrapper(_corporationView.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _corporationView.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _corporationView.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_corporationView.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CorporationViewWrapper)) {
			return false;
		}

		CorporationViewWrapper corporationViewWrapper = (CorporationViewWrapper)obj;

		if (Validator.equals(_corporationView,
					corporationViewWrapper._corporationView)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CorporationView getWrappedCorporationView() {
		return _corporationView;
	}

	@Override
	public CorporationView getWrappedModel() {
		return _corporationView;
	}

	@Override
	public void resetOriginalValues() {
		_corporationView.resetOriginalValues();
	}

	private CorporationView _corporationView;
}