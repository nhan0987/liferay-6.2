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
 * The base model interface for the EmissionTestRequest service. Represents a row in the &quot;vr_emissiontestrequest&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestRequestModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestRequestImpl}.
 * </p>
 *
 * @author win_64
 * @see EmissionTestRequest
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestRequestImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestRequestModelImpl
 * @generated
 */
public interface EmissionTestRequestModel extends BaseModel<EmissionTestRequest> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a emission test request model instance should use the {@link EmissionTestRequest} interface instead.
	 */

	/**
	 * Returns the primary key of this emission test request.
	 *
	 * @return the primary key of this emission test request
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this emission test request.
	 *
	 * @param primaryKey the primary key of this emission test request
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this emission test request.
	 *
	 * @return the ID of this emission test request
	 */
	public long getId();

	/**
	 * Sets the ID of this emission test request.
	 *
	 * @param id the ID of this emission test request
	 */
	public void setId(long id);

	/**
	 * Returns the confirmed inspection ID of this emission test request.
	 *
	 * @return the confirmed inspection ID of this emission test request
	 */
	public long getConfirmedInspectionId();

	/**
	 * Sets the confirmed inspection ID of this emission test request.
	 *
	 * @param confirmedInspectionId the confirmed inspection ID of this emission test request
	 */
	public void setConfirmedInspectionId(long confirmedInspectionId);

	/**
	 * Returns the request number of this emission test request.
	 *
	 * @return the request number of this emission test request
	 */
	@AutoEscape
	public String getRequestNumber();

	/**
	 * Sets the request number of this emission test request.
	 *
	 * @param requestNumber the request number of this emission test request
	 */
	public void setRequestNumber(String requestNumber);

	/**
	 * Returns the test time and place of this emission test request.
	 *
	 * @return the test time and place of this emission test request
	 */
	@AutoEscape
	public String getTestTimeAndPlace();

	/**
	 * Sets the test time and place of this emission test request.
	 *
	 * @param testTimeAndPlace the test time and place of this emission test request
	 */
	public void setTestTimeAndPlace(String testTimeAndPlace);

	/**
	 * Returns the test payment of this emission test request.
	 *
	 * @return the test payment of this emission test request
	 */
	@AutoEscape
	public String getTestPayment();

	/**
	 * Sets the test payment of this emission test request.
	 *
	 * @param testPayment the test payment of this emission test request
	 */
	public void setTestPayment(String testPayment);

	/**
	 * Returns the remarks of this emission test request.
	 *
	 * @return the remarks of this emission test request
	 */
	@AutoEscape
	public String getRemarks();

	/**
	 * Sets the remarks of this emission test request.
	 *
	 * @param remarks the remarks of this emission test request
	 */
	public void setRemarks(String remarks);

	/**
	 * Returns the corporation name of this emission test request.
	 *
	 * @return the corporation name of this emission test request
	 */
	@AutoEscape
	public String getCorporationName();

	/**
	 * Sets the corporation name of this emission test request.
	 *
	 * @param corporationName the corporation name of this emission test request
	 */
	public void setCorporationName(String corporationName);

	/**
	 * Returns the attached file of this emission test request.
	 *
	 * @return the attached file of this emission test request
	 */
	public long getAttachedFile();

	/**
	 * Sets the attached file of this emission test request.
	 *
	 * @param attachedFile the attached file of this emission test request
	 */
	public void setAttachedFile(long attachedFile);

	/**
	 * Returns the sign name of this emission test request.
	 *
	 * @return the sign name of this emission test request
	 */
	@AutoEscape
	public String getSignName();

	/**
	 * Sets the sign name of this emission test request.
	 *
	 * @param signName the sign name of this emission test request
	 */
	public void setSignName(String signName);

	/**
	 * Returns the sign title of this emission test request.
	 *
	 * @return the sign title of this emission test request
	 */
	@AutoEscape
	public String getSignTitle();

	/**
	 * Sets the sign title of this emission test request.
	 *
	 * @param signTitle the sign title of this emission test request
	 */
	public void setSignTitle(String signTitle);

	/**
	 * Returns the sign place of this emission test request.
	 *
	 * @return the sign place of this emission test request
	 */
	@AutoEscape
	public String getSignPlace();

	/**
	 * Sets the sign place of this emission test request.
	 *
	 * @param signPlace the sign place of this emission test request
	 */
	public void setSignPlace(String signPlace);

	/**
	 * Returns the sign date of this emission test request.
	 *
	 * @return the sign date of this emission test request
	 */
	public Date getSignDate();

	/**
	 * Sets the sign date of this emission test request.
	 *
	 * @param signDate the sign date of this emission test request
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
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequest emissionTestRequest);

	@Override
	public int hashCode();

	@Override
	public CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequest> toCacheModel();

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequest toEscapedModel();

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequest toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}