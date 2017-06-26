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
 * This class is a wrapper for {@link CorporationInspector}.
 * </p>
 *
 * @author huymq
 * @see CorporationInspector
 * @generated
 */
public class CorporationInspectorWrapper implements CorporationInspector,
	ModelWrapper<CorporationInspector> {
	public CorporationInspectorWrapper(
		CorporationInspector corporationInspector) {
		_corporationInspector = corporationInspector;
	}

	@Override
	public Class<?> getModelClass() {
		return CorporationInspector.class;
	}

	@Override
	public String getModelClassName() {
		return CorporationInspector.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("corporationId", getCorporationId());
		attributes.put("inspectorid", getInspectorid());
		attributes.put("inspectorName", getInspectorName());
		attributes.put("inspectorPhone", getInspectorPhone());
		attributes.put("inspectorEmail", getInspectorEmail());
		attributes.put("contactcode", getContactcode());
		attributes.put("regularTthc", getRegularTthc());
		attributes.put("teamId", getTeamId());
		attributes.put("markupTeamLeader", getMarkupTeamLeader());
		attributes.put("markUpBoss", getMarkUpBoss());
		attributes.put("place", getPlace());
		attributes.put("title", getTitle());
		attributes.put("filechukyId", getFilechukyId());
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

		Long inspectorid = (Long)attributes.get("inspectorid");

		if (inspectorid != null) {
			setInspectorid(inspectorid);
		}

		String inspectorName = (String)attributes.get("inspectorName");

		if (inspectorName != null) {
			setInspectorName(inspectorName);
		}

		String inspectorPhone = (String)attributes.get("inspectorPhone");

		if (inspectorPhone != null) {
			setInspectorPhone(inspectorPhone);
		}

		String inspectorEmail = (String)attributes.get("inspectorEmail");

		if (inspectorEmail != null) {
			setInspectorEmail(inspectorEmail);
		}

		String contactcode = (String)attributes.get("contactcode");

		if (contactcode != null) {
			setContactcode(contactcode);
		}

		Long regularTthc = (Long)attributes.get("regularTthc");

		if (regularTthc != null) {
			setRegularTthc(regularTthc);
		}

		Long teamId = (Long)attributes.get("teamId");

		if (teamId != null) {
			setTeamId(teamId);
		}

		Integer markupTeamLeader = (Integer)attributes.get("markupTeamLeader");

		if (markupTeamLeader != null) {
			setMarkupTeamLeader(markupTeamLeader);
		}

		Integer markUpBoss = (Integer)attributes.get("markUpBoss");

		if (markUpBoss != null) {
			setMarkUpBoss(markUpBoss);
		}

		String place = (String)attributes.get("place");

		if (place != null) {
			setPlace(place);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		Long filechukyId = (Long)attributes.get("filechukyId");

		if (filechukyId != null) {
			setFilechukyId(filechukyId);
		}

		Date synchdate = (Date)attributes.get("synchdate");

		if (synchdate != null) {
			setSynchdate(synchdate);
		}
	}

	/**
	* Returns the primary key of this corporation inspector.
	*
	* @return the primary key of this corporation inspector
	*/
	@Override
	public long getPrimaryKey() {
		return _corporationInspector.getPrimaryKey();
	}

	/**
	* Sets the primary key of this corporation inspector.
	*
	* @param primaryKey the primary key of this corporation inspector
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_corporationInspector.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this corporation inspector.
	*
	* @return the ID of this corporation inspector
	*/
	@Override
	public long getId() {
		return _corporationInspector.getId();
	}

	/**
	* Sets the ID of this corporation inspector.
	*
	* @param id the ID of this corporation inspector
	*/
	@Override
	public void setId(long id) {
		_corporationInspector.setId(id);
	}

	/**
	* Returns the corporation ID of this corporation inspector.
	*
	* @return the corporation ID of this corporation inspector
	*/
	@Override
	public java.lang.String getCorporationId() {
		return _corporationInspector.getCorporationId();
	}

	/**
	* Sets the corporation ID of this corporation inspector.
	*
	* @param corporationId the corporation ID of this corporation inspector
	*/
	@Override
	public void setCorporationId(java.lang.String corporationId) {
		_corporationInspector.setCorporationId(corporationId);
	}

	/**
	* Returns the inspectorid of this corporation inspector.
	*
	* @return the inspectorid of this corporation inspector
	*/
	@Override
	public long getInspectorid() {
		return _corporationInspector.getInspectorid();
	}

	/**
	* Sets the inspectorid of this corporation inspector.
	*
	* @param inspectorid the inspectorid of this corporation inspector
	*/
	@Override
	public void setInspectorid(long inspectorid) {
		_corporationInspector.setInspectorid(inspectorid);
	}

	/**
	* Returns the inspector name of this corporation inspector.
	*
	* @return the inspector name of this corporation inspector
	*/
	@Override
	public java.lang.String getInspectorName() {
		return _corporationInspector.getInspectorName();
	}

	/**
	* Sets the inspector name of this corporation inspector.
	*
	* @param inspectorName the inspector name of this corporation inspector
	*/
	@Override
	public void setInspectorName(java.lang.String inspectorName) {
		_corporationInspector.setInspectorName(inspectorName);
	}

	/**
	* Returns the inspector phone of this corporation inspector.
	*
	* @return the inspector phone of this corporation inspector
	*/
	@Override
	public java.lang.String getInspectorPhone() {
		return _corporationInspector.getInspectorPhone();
	}

	/**
	* Sets the inspector phone of this corporation inspector.
	*
	* @param inspectorPhone the inspector phone of this corporation inspector
	*/
	@Override
	public void setInspectorPhone(java.lang.String inspectorPhone) {
		_corporationInspector.setInspectorPhone(inspectorPhone);
	}

	/**
	* Returns the inspector email of this corporation inspector.
	*
	* @return the inspector email of this corporation inspector
	*/
	@Override
	public java.lang.String getInspectorEmail() {
		return _corporationInspector.getInspectorEmail();
	}

	/**
	* Sets the inspector email of this corporation inspector.
	*
	* @param inspectorEmail the inspector email of this corporation inspector
	*/
	@Override
	public void setInspectorEmail(java.lang.String inspectorEmail) {
		_corporationInspector.setInspectorEmail(inspectorEmail);
	}

	/**
	* Returns the contactcode of this corporation inspector.
	*
	* @return the contactcode of this corporation inspector
	*/
	@Override
	public java.lang.String getContactcode() {
		return _corporationInspector.getContactcode();
	}

	/**
	* Sets the contactcode of this corporation inspector.
	*
	* @param contactcode the contactcode of this corporation inspector
	*/
	@Override
	public void setContactcode(java.lang.String contactcode) {
		_corporationInspector.setContactcode(contactcode);
	}

	/**
	* Returns the regular tthc of this corporation inspector.
	*
	* @return the regular tthc of this corporation inspector
	*/
	@Override
	public long getRegularTthc() {
		return _corporationInspector.getRegularTthc();
	}

	/**
	* Sets the regular tthc of this corporation inspector.
	*
	* @param regularTthc the regular tthc of this corporation inspector
	*/
	@Override
	public void setRegularTthc(long regularTthc) {
		_corporationInspector.setRegularTthc(regularTthc);
	}

	/**
	* Returns the team ID of this corporation inspector.
	*
	* @return the team ID of this corporation inspector
	*/
	@Override
	public long getTeamId() {
		return _corporationInspector.getTeamId();
	}

	/**
	* Sets the team ID of this corporation inspector.
	*
	* @param teamId the team ID of this corporation inspector
	*/
	@Override
	public void setTeamId(long teamId) {
		_corporationInspector.setTeamId(teamId);
	}

	/**
	* Returns the markup team leader of this corporation inspector.
	*
	* @return the markup team leader of this corporation inspector
	*/
	@Override
	public int getMarkupTeamLeader() {
		return _corporationInspector.getMarkupTeamLeader();
	}

	/**
	* Sets the markup team leader of this corporation inspector.
	*
	* @param markupTeamLeader the markup team leader of this corporation inspector
	*/
	@Override
	public void setMarkupTeamLeader(int markupTeamLeader) {
		_corporationInspector.setMarkupTeamLeader(markupTeamLeader);
	}

	/**
	* Returns the mark up boss of this corporation inspector.
	*
	* @return the mark up boss of this corporation inspector
	*/
	@Override
	public int getMarkUpBoss() {
		return _corporationInspector.getMarkUpBoss();
	}

	/**
	* Sets the mark up boss of this corporation inspector.
	*
	* @param markUpBoss the mark up boss of this corporation inspector
	*/
	@Override
	public void setMarkUpBoss(int markUpBoss) {
		_corporationInspector.setMarkUpBoss(markUpBoss);
	}

	/**
	* Returns the place of this corporation inspector.
	*
	* @return the place of this corporation inspector
	*/
	@Override
	public java.lang.String getPlace() {
		return _corporationInspector.getPlace();
	}

	/**
	* Sets the place of this corporation inspector.
	*
	* @param place the place of this corporation inspector
	*/
	@Override
	public void setPlace(java.lang.String place) {
		_corporationInspector.setPlace(place);
	}

	/**
	* Returns the title of this corporation inspector.
	*
	* @return the title of this corporation inspector
	*/
	@Override
	public java.lang.String getTitle() {
		return _corporationInspector.getTitle();
	}

	/**
	* Sets the title of this corporation inspector.
	*
	* @param title the title of this corporation inspector
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_corporationInspector.setTitle(title);
	}

	/**
	* Returns the filechuky ID of this corporation inspector.
	*
	* @return the filechuky ID of this corporation inspector
	*/
	@Override
	public long getFilechukyId() {
		return _corporationInspector.getFilechukyId();
	}

	/**
	* Sets the filechuky ID of this corporation inspector.
	*
	* @param filechukyId the filechuky ID of this corporation inspector
	*/
	@Override
	public void setFilechukyId(long filechukyId) {
		_corporationInspector.setFilechukyId(filechukyId);
	}

	/**
	* Returns the synchdate of this corporation inspector.
	*
	* @return the synchdate of this corporation inspector
	*/
	@Override
	public java.util.Date getSynchdate() {
		return _corporationInspector.getSynchdate();
	}

	/**
	* Sets the synchdate of this corporation inspector.
	*
	* @param synchdate the synchdate of this corporation inspector
	*/
	@Override
	public void setSynchdate(java.util.Date synchdate) {
		_corporationInspector.setSynchdate(synchdate);
	}

	@Override
	public boolean isNew() {
		return _corporationInspector.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_corporationInspector.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _corporationInspector.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_corporationInspector.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _corporationInspector.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _corporationInspector.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_corporationInspector.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _corporationInspector.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_corporationInspector.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_corporationInspector.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_corporationInspector.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CorporationInspectorWrapper((CorporationInspector)_corporationInspector.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector corporationInspector) {
		return _corporationInspector.compareTo(corporationInspector);
	}

	@Override
	public int hashCode() {
		return _corporationInspector.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector> toCacheModel() {
		return _corporationInspector.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector toEscapedModel() {
		return new CorporationInspectorWrapper(_corporationInspector.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector toUnescapedModel() {
		return new CorporationInspectorWrapper(_corporationInspector.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _corporationInspector.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _corporationInspector.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_corporationInspector.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CorporationInspectorWrapper)) {
			return false;
		}

		CorporationInspectorWrapper corporationInspectorWrapper = (CorporationInspectorWrapper)obj;

		if (Validator.equals(_corporationInspector,
					corporationInspectorWrapper._corporationInspector)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CorporationInspector getWrappedCorporationInspector() {
		return _corporationInspector;
	}

	@Override
	public CorporationInspector getWrappedModel() {
		return _corporationInspector;
	}

	@Override
	public void resetOriginalValues() {
		_corporationInspector.resetOriginalValues();
	}

	private CorporationInspector _corporationInspector;
}