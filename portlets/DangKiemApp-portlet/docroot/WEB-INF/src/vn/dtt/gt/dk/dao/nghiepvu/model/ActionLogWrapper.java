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
 * This class is a wrapper for {@link ActionLog}.
 * </p>
 *
 * @author win_64
 * @see ActionLog
 * @generated
 */
public class ActionLogWrapper implements ActionLog, ModelWrapper<ActionLog> {
	public ActionLogWrapper(ActionLog actionLog) {
		_actionLog = actionLog;
	}

	@Override
	public Class<?> getModelClass() {
		return ActionLog.class;
	}

	@Override
	public String getModelClassName() {
		return ActionLog.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("hosothutucid", getHosothutucid());
		attributes.put("masohoso", getMasohoso());
		attributes.put("mabiennhan", getMabiennhan());
		attributes.put("ngayxemhoso", getNgayxemhoso());
		attributes.put("noidungmanhinh", getNoidungmanhinh());
		attributes.put("importername", getImportername());
		attributes.put("corporationid", getCorporationid());
		attributes.put("inspectorid", getInspectorid());
		attributes.put("inspectorname", getInspectorname());
		attributes.put("inspectorphone", getInspectorphone());
		attributes.put("inspectoremail", getInspectoremail());
		attributes.put("title", getTitle());
		attributes.put("contactcode", getContactcode());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long hosothutucid = (Long)attributes.get("hosothutucid");

		if (hosothutucid != null) {
			setHosothutucid(hosothutucid);
		}

		String masohoso = (String)attributes.get("masohoso");

		if (masohoso != null) {
			setMasohoso(masohoso);
		}

		String mabiennhan = (String)attributes.get("mabiennhan");

		if (mabiennhan != null) {
			setMabiennhan(mabiennhan);
		}

		Date ngayxemhoso = (Date)attributes.get("ngayxemhoso");

		if (ngayxemhoso != null) {
			setNgayxemhoso(ngayxemhoso);
		}

		String noidungmanhinh = (String)attributes.get("noidungmanhinh");

		if (noidungmanhinh != null) {
			setNoidungmanhinh(noidungmanhinh);
		}

		String importername = (String)attributes.get("importername");

		if (importername != null) {
			setImportername(importername);
		}

		String corporationid = (String)attributes.get("corporationid");

		if (corporationid != null) {
			setCorporationid(corporationid);
		}

		Long inspectorid = (Long)attributes.get("inspectorid");

		if (inspectorid != null) {
			setInspectorid(inspectorid);
		}

		String inspectorname = (String)attributes.get("inspectorname");

		if (inspectorname != null) {
			setInspectorname(inspectorname);
		}

		String inspectorphone = (String)attributes.get("inspectorphone");

		if (inspectorphone != null) {
			setInspectorphone(inspectorphone);
		}

		String inspectoremail = (String)attributes.get("inspectoremail");

		if (inspectoremail != null) {
			setInspectoremail(inspectoremail);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String contactcode = (String)attributes.get("contactcode");

		if (contactcode != null) {
			setContactcode(contactcode);
		}
	}

	/**
	* Returns the primary key of this action log.
	*
	* @return the primary key of this action log
	*/
	@Override
	public long getPrimaryKey() {
		return _actionLog.getPrimaryKey();
	}

	/**
	* Sets the primary key of this action log.
	*
	* @param primaryKey the primary key of this action log
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_actionLog.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this action log.
	*
	* @return the ID of this action log
	*/
	@Override
	public long getId() {
		return _actionLog.getId();
	}

	/**
	* Sets the ID of this action log.
	*
	* @param id the ID of this action log
	*/
	@Override
	public void setId(long id) {
		_actionLog.setId(id);
	}

	/**
	* Returns the hosothutucid of this action log.
	*
	* @return the hosothutucid of this action log
	*/
	@Override
	public long getHosothutucid() {
		return _actionLog.getHosothutucid();
	}

	/**
	* Sets the hosothutucid of this action log.
	*
	* @param hosothutucid the hosothutucid of this action log
	*/
	@Override
	public void setHosothutucid(long hosothutucid) {
		_actionLog.setHosothutucid(hosothutucid);
	}

	/**
	* Returns the masohoso of this action log.
	*
	* @return the masohoso of this action log
	*/
	@Override
	public java.lang.String getMasohoso() {
		return _actionLog.getMasohoso();
	}

	/**
	* Sets the masohoso of this action log.
	*
	* @param masohoso the masohoso of this action log
	*/
	@Override
	public void setMasohoso(java.lang.String masohoso) {
		_actionLog.setMasohoso(masohoso);
	}

	/**
	* Returns the mabiennhan of this action log.
	*
	* @return the mabiennhan of this action log
	*/
	@Override
	public java.lang.String getMabiennhan() {
		return _actionLog.getMabiennhan();
	}

	/**
	* Sets the mabiennhan of this action log.
	*
	* @param mabiennhan the mabiennhan of this action log
	*/
	@Override
	public void setMabiennhan(java.lang.String mabiennhan) {
		_actionLog.setMabiennhan(mabiennhan);
	}

	/**
	* Returns the ngayxemhoso of this action log.
	*
	* @return the ngayxemhoso of this action log
	*/
	@Override
	public java.util.Date getNgayxemhoso() {
		return _actionLog.getNgayxemhoso();
	}

	/**
	* Sets the ngayxemhoso of this action log.
	*
	* @param ngayxemhoso the ngayxemhoso of this action log
	*/
	@Override
	public void setNgayxemhoso(java.util.Date ngayxemhoso) {
		_actionLog.setNgayxemhoso(ngayxemhoso);
	}

	/**
	* Returns the noidungmanhinh of this action log.
	*
	* @return the noidungmanhinh of this action log
	*/
	@Override
	public java.lang.String getNoidungmanhinh() {
		return _actionLog.getNoidungmanhinh();
	}

	/**
	* Sets the noidungmanhinh of this action log.
	*
	* @param noidungmanhinh the noidungmanhinh of this action log
	*/
	@Override
	public void setNoidungmanhinh(java.lang.String noidungmanhinh) {
		_actionLog.setNoidungmanhinh(noidungmanhinh);
	}

	/**
	* Returns the importername of this action log.
	*
	* @return the importername of this action log
	*/
	@Override
	public java.lang.String getImportername() {
		return _actionLog.getImportername();
	}

	/**
	* Sets the importername of this action log.
	*
	* @param importername the importername of this action log
	*/
	@Override
	public void setImportername(java.lang.String importername) {
		_actionLog.setImportername(importername);
	}

	/**
	* Returns the corporationid of this action log.
	*
	* @return the corporationid of this action log
	*/
	@Override
	public java.lang.String getCorporationid() {
		return _actionLog.getCorporationid();
	}

	/**
	* Sets the corporationid of this action log.
	*
	* @param corporationid the corporationid of this action log
	*/
	@Override
	public void setCorporationid(java.lang.String corporationid) {
		_actionLog.setCorporationid(corporationid);
	}

	/**
	* Returns the inspectorid of this action log.
	*
	* @return the inspectorid of this action log
	*/
	@Override
	public long getInspectorid() {
		return _actionLog.getInspectorid();
	}

	/**
	* Sets the inspectorid of this action log.
	*
	* @param inspectorid the inspectorid of this action log
	*/
	@Override
	public void setInspectorid(long inspectorid) {
		_actionLog.setInspectorid(inspectorid);
	}

	/**
	* Returns the inspectorname of this action log.
	*
	* @return the inspectorname of this action log
	*/
	@Override
	public java.lang.String getInspectorname() {
		return _actionLog.getInspectorname();
	}

	/**
	* Sets the inspectorname of this action log.
	*
	* @param inspectorname the inspectorname of this action log
	*/
	@Override
	public void setInspectorname(java.lang.String inspectorname) {
		_actionLog.setInspectorname(inspectorname);
	}

	/**
	* Returns the inspectorphone of this action log.
	*
	* @return the inspectorphone of this action log
	*/
	@Override
	public java.lang.String getInspectorphone() {
		return _actionLog.getInspectorphone();
	}

	/**
	* Sets the inspectorphone of this action log.
	*
	* @param inspectorphone the inspectorphone of this action log
	*/
	@Override
	public void setInspectorphone(java.lang.String inspectorphone) {
		_actionLog.setInspectorphone(inspectorphone);
	}

	/**
	* Returns the inspectoremail of this action log.
	*
	* @return the inspectoremail of this action log
	*/
	@Override
	public java.lang.String getInspectoremail() {
		return _actionLog.getInspectoremail();
	}

	/**
	* Sets the inspectoremail of this action log.
	*
	* @param inspectoremail the inspectoremail of this action log
	*/
	@Override
	public void setInspectoremail(java.lang.String inspectoremail) {
		_actionLog.setInspectoremail(inspectoremail);
	}

	/**
	* Returns the title of this action log.
	*
	* @return the title of this action log
	*/
	@Override
	public java.lang.String getTitle() {
		return _actionLog.getTitle();
	}

	/**
	* Sets the title of this action log.
	*
	* @param title the title of this action log
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_actionLog.setTitle(title);
	}

	/**
	* Returns the contactcode of this action log.
	*
	* @return the contactcode of this action log
	*/
	@Override
	public java.lang.String getContactcode() {
		return _actionLog.getContactcode();
	}

	/**
	* Sets the contactcode of this action log.
	*
	* @param contactcode the contactcode of this action log
	*/
	@Override
	public void setContactcode(java.lang.String contactcode) {
		_actionLog.setContactcode(contactcode);
	}

	@Override
	public boolean isNew() {
		return _actionLog.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_actionLog.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _actionLog.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_actionLog.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _actionLog.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _actionLog.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_actionLog.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _actionLog.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_actionLog.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_actionLog.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_actionLog.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ActionLogWrapper((ActionLog)_actionLog.clone());
	}

	@Override
	public int compareTo(vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog actionLog) {
		return _actionLog.compareTo(actionLog);
	}

	@Override
	public int hashCode() {
		return _actionLog.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog> toCacheModel() {
		return _actionLog.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog toEscapedModel() {
		return new ActionLogWrapper(_actionLog.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog toUnescapedModel() {
		return new ActionLogWrapper(_actionLog.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _actionLog.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _actionLog.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_actionLog.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ActionLogWrapper)) {
			return false;
		}

		ActionLogWrapper actionLogWrapper = (ActionLogWrapper)obj;

		if (Validator.equals(_actionLog, actionLogWrapper._actionLog)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ActionLog getWrappedActionLog() {
		return _actionLog;
	}

	@Override
	public ActionLog getWrappedModel() {
		return _actionLog;
	}

	@Override
	public void resetOriginalValues() {
		_actionLog.resetOriginalValues();
	}

	private ActionLog _actionLog;
}