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
 * This class is a wrapper for {@link CorporationTeam}.
 * </p>
 *
 * @author win_64
 * @see CorporationTeam
 * @generated
 */
public class CorporationTeamWrapper implements CorporationTeam,
	ModelWrapper<CorporationTeam> {
	public CorporationTeamWrapper(CorporationTeam corporationTeam) {
		_corporationTeam = corporationTeam;
	}

	@Override
	public Class<?> getModelClass() {
		return CorporationTeam.class;
	}

	@Override
	public String getModelClassName() {
		return CorporationTeam.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("corporationId", getCorporationId());
		attributes.put("teamName", getTeamName());
		attributes.put("markUpDelete", getMarkUpDelete());

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

		String teamName = (String)attributes.get("teamName");

		if (teamName != null) {
			setTeamName(teamName);
		}

		Integer markUpDelete = (Integer)attributes.get("markUpDelete");

		if (markUpDelete != null) {
			setMarkUpDelete(markUpDelete);
		}
	}

	/**
	* Returns the primary key of this corporation team.
	*
	* @return the primary key of this corporation team
	*/
	@Override
	public long getPrimaryKey() {
		return _corporationTeam.getPrimaryKey();
	}

	/**
	* Sets the primary key of this corporation team.
	*
	* @param primaryKey the primary key of this corporation team
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_corporationTeam.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this corporation team.
	*
	* @return the ID of this corporation team
	*/
	@Override
	public long getId() {
		return _corporationTeam.getId();
	}

	/**
	* Sets the ID of this corporation team.
	*
	* @param id the ID of this corporation team
	*/
	@Override
	public void setId(long id) {
		_corporationTeam.setId(id);
	}

	/**
	* Returns the corporation ID of this corporation team.
	*
	* @return the corporation ID of this corporation team
	*/
	@Override
	public java.lang.String getCorporationId() {
		return _corporationTeam.getCorporationId();
	}

	/**
	* Sets the corporation ID of this corporation team.
	*
	* @param corporationId the corporation ID of this corporation team
	*/
	@Override
	public void setCorporationId(java.lang.String corporationId) {
		_corporationTeam.setCorporationId(corporationId);
	}

	/**
	* Returns the team name of this corporation team.
	*
	* @return the team name of this corporation team
	*/
	@Override
	public java.lang.String getTeamName() {
		return _corporationTeam.getTeamName();
	}

	/**
	* Sets the team name of this corporation team.
	*
	* @param teamName the team name of this corporation team
	*/
	@Override
	public void setTeamName(java.lang.String teamName) {
		_corporationTeam.setTeamName(teamName);
	}

	/**
	* Returns the mark up delete of this corporation team.
	*
	* @return the mark up delete of this corporation team
	*/
	@Override
	public int getMarkUpDelete() {
		return _corporationTeam.getMarkUpDelete();
	}

	/**
	* Sets the mark up delete of this corporation team.
	*
	* @param markUpDelete the mark up delete of this corporation team
	*/
	@Override
	public void setMarkUpDelete(int markUpDelete) {
		_corporationTeam.setMarkUpDelete(markUpDelete);
	}

	@Override
	public boolean isNew() {
		return _corporationTeam.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_corporationTeam.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _corporationTeam.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_corporationTeam.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _corporationTeam.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _corporationTeam.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_corporationTeam.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _corporationTeam.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_corporationTeam.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_corporationTeam.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_corporationTeam.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CorporationTeamWrapper((CorporationTeam)_corporationTeam.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam corporationTeam) {
		return _corporationTeam.compareTo(corporationTeam);
	}

	@Override
	public int hashCode() {
		return _corporationTeam.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam> toCacheModel() {
		return _corporationTeam.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam toEscapedModel() {
		return new CorporationTeamWrapper(_corporationTeam.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam toUnescapedModel() {
		return new CorporationTeamWrapper(_corporationTeam.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _corporationTeam.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _corporationTeam.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_corporationTeam.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CorporationTeamWrapper)) {
			return false;
		}

		CorporationTeamWrapper corporationTeamWrapper = (CorporationTeamWrapper)obj;

		if (Validator.equals(_corporationTeam,
					corporationTeamWrapper._corporationTeam)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CorporationTeam getWrappedCorporationTeam() {
		return _corporationTeam;
	}

	@Override
	public CorporationTeam getWrappedModel() {
		return _corporationTeam;
	}

	@Override
	public void resetOriginalValues() {
		_corporationTeam.resetOriginalValues();
	}

	private CorporationTeam _corporationTeam;
}