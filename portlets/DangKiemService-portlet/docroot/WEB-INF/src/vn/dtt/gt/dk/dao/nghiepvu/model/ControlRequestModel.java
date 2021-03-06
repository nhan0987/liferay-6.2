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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the ControlRequest service. Represents a row in the &quot;vr_controlrequest&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlRequestModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlRequestImpl}.
 * </p>
 *
 * @author huymq
 * @see ControlRequest
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlRequestImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlRequestModelImpl
 * @generated
 */
public interface ControlRequestModel extends BaseModel<ControlRequest> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a control request model instance should use the {@link ControlRequest} interface instead.
	 */

	/**
	 * Returns the primary key of this control request.
	 *
	 * @return the primary key of this control request
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this control request.
	 *
	 * @param primaryKey the primary key of this control request
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this control request.
	 *
	 * @return the ID of this control request
	 */
	public long getId();

	/**
	 * Sets the ID of this control request.
	 *
	 * @param id the ID of this control request
	 */
	public void setId(long id);

	/**
	 * Returns the confirmed inspection ID of this control request.
	 *
	 * @return the confirmed inspection ID of this control request
	 */
	public long getConfirmedInspectionId();

	/**
	 * Sets the confirmed inspection ID of this control request.
	 *
	 * @param confirmedInspectionId the confirmed inspection ID of this control request
	 */
	public void setConfirmedInspectionId(long confirmedInspectionId);

	/**
	 * Returns the request number of this control request.
	 *
	 * @return the request number of this control request
	 */
	@AutoEscape
	public String getRequestNumber();

	/**
	 * Sets the request number of this control request.
	 *
	 * @param requestNumber the request number of this control request
	 */
	public void setRequestNumber(String requestNumber);

	/**
	 * Returns the corporation name of this control request.
	 *
	 * @return the corporation name of this control request
	 */
	@AutoEscape
	public String getCorporationName();

	/**
	 * Sets the corporation name of this control request.
	 *
	 * @param corporationName the corporation name of this control request
	 */
	public void setCorporationName(String corporationName);

	/**
	 * Returns the control content of this control request.
	 *
	 * @return the control content of this control request
	 */
	@AutoEscape
	public String getControlContent();

	/**
	 * Sets the control content of this control request.
	 *
	 * @param controlContent the control content of this control request
	 */
	public void setControlContent(String controlContent);

	/**
	 * Returns the control dead line of this control request.
	 *
	 * @return the control dead line of this control request
	 */
	public Date getControlDeadLine();

	/**
	 * Sets the control dead line of this control request.
	 *
	 * @param controlDeadLine the control dead line of this control request
	 */
	public void setControlDeadLine(Date controlDeadLine);

	/**
	 * Returns the remarks of this control request.
	 *
	 * @return the remarks of this control request
	 */
	@AutoEscape
	public String getRemarks();

	/**
	 * Sets the remarks of this control request.
	 *
	 * @param remarks the remarks of this control request
	 */
	public void setRemarks(String remarks);

	/**
	 * Returns the attached file of this control request.
	 *
	 * @return the attached file of this control request
	 */
	public long getAttachedFile();

	/**
	 * Sets the attached file of this control request.
	 *
	 * @param attachedFile the attached file of this control request
	 */
	public void setAttachedFile(long attachedFile);

	/**
	 * Returns the sign name of this control request.
	 *
	 * @return the sign name of this control request
	 */
	@AutoEscape
	public String getSignName();

	/**
	 * Sets the sign name of this control request.
	 *
	 * @param signName the sign name of this control request
	 */
	public void setSignName(String signName);

	/**
	 * Returns the sign title of this control request.
	 *
	 * @return the sign title of this control request
	 */
	@AutoEscape
	public String getSignTitle();

	/**
	 * Sets the sign title of this control request.
	 *
	 * @param signTitle the sign title of this control request
	 */
	public void setSignTitle(String signTitle);

	/**
	 * Returns the sign place of this control request.
	 *
	 * @return the sign place of this control request
	 */
	@AutoEscape
	public String getSignPlace();

	/**
	 * Sets the sign place of this control request.
	 *
	 * @param signPlace the sign place of this control request
	 */
	public void setSignPlace(String signPlace);

	/**
	 * Returns the sign date of this control request.
	 *
	 * @return the sign date of this control request
	 */
	public Date getSignDate();

	/**
	 * Sets the sign date of this control request.
	 *
	 * @param signDate the sign date of this control request
	 */
	public void setSignDate(Date signDate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(ControlRequest controlRequest);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ControlRequest> toCacheModel();

	@Override
	public ControlRequest toEscapedModel();

	@Override
	public ControlRequest toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}