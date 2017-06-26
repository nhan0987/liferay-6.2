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
 * This class is a wrapper for {@link InspectionCommonStatus}.
 * </p>
 *
 * @author win_64
 * @see InspectionCommonStatus
 * @generated
 */
public class InspectionCommonStatusWrapper implements InspectionCommonStatus,
	ModelWrapper<InspectionCommonStatus> {
	public InspectionCommonStatusWrapper(
		InspectionCommonStatus inspectionCommonStatus) {
		_inspectionCommonStatus = inspectionCommonStatus;
	}

	@Override
	public Class<?> getModelClass() {
		return InspectionCommonStatus.class;
	}

	@Override
	public String getModelClassName() {
		return InspectionCommonStatus.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("vehicleClass", getVehicleClass());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("type", getType());
		attributes.put("groupName", getGroupName());
		attributes.put("itemName", getItemName());
		attributes.put("commonStatus", getCommonStatus());
		attributes.put("inspectionRecordId", getInspectionRecordId());
		attributes.put("commonCode", getCommonCode());
		attributes.put("allowEdit", getAllowEdit());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String vehicleClass = (String)attributes.get("vehicleClass");

		if (vehicleClass != null) {
			setVehicleClass(vehicleClass);
		}

		Long sequenceNo = (Long)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}

		Long type = (Long)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		String groupName = (String)attributes.get("groupName");

		if (groupName != null) {
			setGroupName(groupName);
		}

		String itemName = (String)attributes.get("itemName");

		if (itemName != null) {
			setItemName(itemName);
		}

		Long commonStatus = (Long)attributes.get("commonStatus");

		if (commonStatus != null) {
			setCommonStatus(commonStatus);
		}

		Long inspectionRecordId = (Long)attributes.get("inspectionRecordId");

		if (inspectionRecordId != null) {
			setInspectionRecordId(inspectionRecordId);
		}

		String commonCode = (String)attributes.get("commonCode");

		if (commonCode != null) {
			setCommonCode(commonCode);
		}

		Integer allowEdit = (Integer)attributes.get("allowEdit");

		if (allowEdit != null) {
			setAllowEdit(allowEdit);
		}
	}

	/**
	* Returns the primary key of this inspection common status.
	*
	* @return the primary key of this inspection common status
	*/
	@Override
	public long getPrimaryKey() {
		return _inspectionCommonStatus.getPrimaryKey();
	}

	/**
	* Sets the primary key of this inspection common status.
	*
	* @param primaryKey the primary key of this inspection common status
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_inspectionCommonStatus.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this inspection common status.
	*
	* @return the ID of this inspection common status
	*/
	@Override
	public long getId() {
		return _inspectionCommonStatus.getId();
	}

	/**
	* Sets the ID of this inspection common status.
	*
	* @param id the ID of this inspection common status
	*/
	@Override
	public void setId(long id) {
		_inspectionCommonStatus.setId(id);
	}

	/**
	* Returns the vehicle class of this inspection common status.
	*
	* @return the vehicle class of this inspection common status
	*/
	@Override
	public java.lang.String getVehicleClass() {
		return _inspectionCommonStatus.getVehicleClass();
	}

	/**
	* Sets the vehicle class of this inspection common status.
	*
	* @param vehicleClass the vehicle class of this inspection common status
	*/
	@Override
	public void setVehicleClass(java.lang.String vehicleClass) {
		_inspectionCommonStatus.setVehicleClass(vehicleClass);
	}

	/**
	* Returns the sequence no of this inspection common status.
	*
	* @return the sequence no of this inspection common status
	*/
	@Override
	public long getSequenceNo() {
		return _inspectionCommonStatus.getSequenceNo();
	}

	/**
	* Sets the sequence no of this inspection common status.
	*
	* @param sequenceNo the sequence no of this inspection common status
	*/
	@Override
	public void setSequenceNo(long sequenceNo) {
		_inspectionCommonStatus.setSequenceNo(sequenceNo);
	}

	/**
	* Returns the type of this inspection common status.
	*
	* @return the type of this inspection common status
	*/
	@Override
	public long getType() {
		return _inspectionCommonStatus.getType();
	}

	/**
	* Sets the type of this inspection common status.
	*
	* @param type the type of this inspection common status
	*/
	@Override
	public void setType(long type) {
		_inspectionCommonStatus.setType(type);
	}

	/**
	* Returns the group name of this inspection common status.
	*
	* @return the group name of this inspection common status
	*/
	@Override
	public java.lang.String getGroupName() {
		return _inspectionCommonStatus.getGroupName();
	}

	/**
	* Sets the group name of this inspection common status.
	*
	* @param groupName the group name of this inspection common status
	*/
	@Override
	public void setGroupName(java.lang.String groupName) {
		_inspectionCommonStatus.setGroupName(groupName);
	}

	/**
	* Returns the item name of this inspection common status.
	*
	* @return the item name of this inspection common status
	*/
	@Override
	public java.lang.String getItemName() {
		return _inspectionCommonStatus.getItemName();
	}

	/**
	* Sets the item name of this inspection common status.
	*
	* @param itemName the item name of this inspection common status
	*/
	@Override
	public void setItemName(java.lang.String itemName) {
		_inspectionCommonStatus.setItemName(itemName);
	}

	/**
	* Returns the common status of this inspection common status.
	*
	* @return the common status of this inspection common status
	*/
	@Override
	public long getCommonStatus() {
		return _inspectionCommonStatus.getCommonStatus();
	}

	/**
	* Sets the common status of this inspection common status.
	*
	* @param commonStatus the common status of this inspection common status
	*/
	@Override
	public void setCommonStatus(long commonStatus) {
		_inspectionCommonStatus.setCommonStatus(commonStatus);
	}

	/**
	* Returns the inspection record ID of this inspection common status.
	*
	* @return the inspection record ID of this inspection common status
	*/
	@Override
	public long getInspectionRecordId() {
		return _inspectionCommonStatus.getInspectionRecordId();
	}

	/**
	* Sets the inspection record ID of this inspection common status.
	*
	* @param inspectionRecordId the inspection record ID of this inspection common status
	*/
	@Override
	public void setInspectionRecordId(long inspectionRecordId) {
		_inspectionCommonStatus.setInspectionRecordId(inspectionRecordId);
	}

	/**
	* Returns the common code of this inspection common status.
	*
	* @return the common code of this inspection common status
	*/
	@Override
	public java.lang.String getCommonCode() {
		return _inspectionCommonStatus.getCommonCode();
	}

	/**
	* Sets the common code of this inspection common status.
	*
	* @param commonCode the common code of this inspection common status
	*/
	@Override
	public void setCommonCode(java.lang.String commonCode) {
		_inspectionCommonStatus.setCommonCode(commonCode);
	}

	/**
	* Returns the allow edit of this inspection common status.
	*
	* @return the allow edit of this inspection common status
	*/
	@Override
	public int getAllowEdit() {
		return _inspectionCommonStatus.getAllowEdit();
	}

	/**
	* Sets the allow edit of this inspection common status.
	*
	* @param allowEdit the allow edit of this inspection common status
	*/
	@Override
	public void setAllowEdit(int allowEdit) {
		_inspectionCommonStatus.setAllowEdit(allowEdit);
	}

	@Override
	public boolean isNew() {
		return _inspectionCommonStatus.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_inspectionCommonStatus.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _inspectionCommonStatus.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_inspectionCommonStatus.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _inspectionCommonStatus.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _inspectionCommonStatus.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_inspectionCommonStatus.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _inspectionCommonStatus.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_inspectionCommonStatus.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_inspectionCommonStatus.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_inspectionCommonStatus.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new InspectionCommonStatusWrapper((InspectionCommonStatus)_inspectionCommonStatus.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus inspectionCommonStatus) {
		return _inspectionCommonStatus.compareTo(inspectionCommonStatus);
	}

	@Override
	public int hashCode() {
		return _inspectionCommonStatus.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus> toCacheModel() {
		return _inspectionCommonStatus.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus toEscapedModel() {
		return new InspectionCommonStatusWrapper(_inspectionCommonStatus.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus toUnescapedModel() {
		return new InspectionCommonStatusWrapper(_inspectionCommonStatus.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _inspectionCommonStatus.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _inspectionCommonStatus.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_inspectionCommonStatus.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof InspectionCommonStatusWrapper)) {
			return false;
		}

		InspectionCommonStatusWrapper inspectionCommonStatusWrapper = (InspectionCommonStatusWrapper)obj;

		if (Validator.equals(_inspectionCommonStatus,
					inspectionCommonStatusWrapper._inspectionCommonStatus)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public InspectionCommonStatus getWrappedInspectionCommonStatus() {
		return _inspectionCommonStatus;
	}

	@Override
	public InspectionCommonStatus getWrappedModel() {
		return _inspectionCommonStatus;
	}

	@Override
	public void resetOriginalValues() {
		_inspectionCommonStatus.resetOriginalValues();
	}

	private InspectionCommonStatus _inspectionCommonStatus;
}