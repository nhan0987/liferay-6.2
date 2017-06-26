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
 * The base model interface for the InspectionCommonStatus service. Represents a row in the &quot;vr_inspectionCommonStatus&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionCommonStatusModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionCommonStatusImpl}.
 * </p>
 *
 * @author huymq
 * @see InspectionCommonStatus
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionCommonStatusImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionCommonStatusModelImpl
 * @generated
 */
public interface InspectionCommonStatusModel extends BaseModel<InspectionCommonStatus> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a inspection common status model instance should use the {@link InspectionCommonStatus} interface instead.
	 */

	/**
	 * Returns the primary key of this inspection common status.
	 *
	 * @return the primary key of this inspection common status
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this inspection common status.
	 *
	 * @param primaryKey the primary key of this inspection common status
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this inspection common status.
	 *
	 * @return the ID of this inspection common status
	 */
	public long getId();

	/**
	 * Sets the ID of this inspection common status.
	 *
	 * @param id the ID of this inspection common status
	 */
	public void setId(long id);

	/**
	 * Returns the vehicle class of this inspection common status.
	 *
	 * @return the vehicle class of this inspection common status
	 */
	@AutoEscape
	public String getVehicleClass();

	/**
	 * Sets the vehicle class of this inspection common status.
	 *
	 * @param vehicleClass the vehicle class of this inspection common status
	 */
	public void setVehicleClass(String vehicleClass);

	/**
	 * Returns the sequence no of this inspection common status.
	 *
	 * @return the sequence no of this inspection common status
	 */
	public long getSequenceNo();

	/**
	 * Sets the sequence no of this inspection common status.
	 *
	 * @param sequenceNo the sequence no of this inspection common status
	 */
	public void setSequenceNo(long sequenceNo);

	/**
	 * Returns the type of this inspection common status.
	 *
	 * @return the type of this inspection common status
	 */
	public long getType();

	/**
	 * Sets the type of this inspection common status.
	 *
	 * @param type the type of this inspection common status
	 */
	public void setType(long type);

	/**
	 * Returns the group name of this inspection common status.
	 *
	 * @return the group name of this inspection common status
	 */
	@AutoEscape
	public String getGroupName();

	/**
	 * Sets the group name of this inspection common status.
	 *
	 * @param groupName the group name of this inspection common status
	 */
	public void setGroupName(String groupName);

	/**
	 * Returns the item name of this inspection common status.
	 *
	 * @return the item name of this inspection common status
	 */
	@AutoEscape
	public String getItemName();

	/**
	 * Sets the item name of this inspection common status.
	 *
	 * @param itemName the item name of this inspection common status
	 */
	public void setItemName(String itemName);

	/**
	 * Returns the common status of this inspection common status.
	 *
	 * @return the common status of this inspection common status
	 */
	public long getCommonStatus();

	/**
	 * Sets the common status of this inspection common status.
	 *
	 * @param commonStatus the common status of this inspection common status
	 */
	public void setCommonStatus(long commonStatus);

	/**
	 * Returns the inspection record ID of this inspection common status.
	 *
	 * @return the inspection record ID of this inspection common status
	 */
	public long getInspectionRecordId();

	/**
	 * Sets the inspection record ID of this inspection common status.
	 *
	 * @param inspectionRecordId the inspection record ID of this inspection common status
	 */
	public void setInspectionRecordId(long inspectionRecordId);

	/**
	 * Returns the common code of this inspection common status.
	 *
	 * @return the common code of this inspection common status
	 */
	@AutoEscape
	public String getCommonCode();

	/**
	 * Sets the common code of this inspection common status.
	 *
	 * @param commonCode the common code of this inspection common status
	 */
	public void setCommonCode(String commonCode);

	/**
	 * Returns the allow edit of this inspection common status.
	 *
	 * @return the allow edit of this inspection common status
	 */
	public int getAllowEdit();

	/**
	 * Sets the allow edit of this inspection common status.
	 *
	 * @param allowEdit the allow edit of this inspection common status
	 */
	public void setAllowEdit(int allowEdit);

	/**
	 * Returns the synchdate of this inspection common status.
	 *
	 * @return the synchdate of this inspection common status
	 */
	public Date getSynchdate();

	/**
	 * Sets the synchdate of this inspection common status.
	 *
	 * @param synchdate the synchdate of this inspection common status
	 */
	public void setSynchdate(Date synchdate);

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
	public int compareTo(InspectionCommonStatus inspectionCommonStatus);

	@Override
	public int hashCode();

	@Override
	public CacheModel<InspectionCommonStatus> toCacheModel();

	@Override
	public InspectionCommonStatus toEscapedModel();

	@Override
	public InspectionCommonStatus toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}