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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionCommonStatusLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class InspectionCommonStatusClp extends BaseModelImpl<InspectionCommonStatus>
	implements InspectionCommonStatus {
	public InspectionCommonStatusClp() {
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
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_inspectionCommonStatusRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionCommonStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_inspectionCommonStatusRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVehicleClass() {
		return _vehicleClass;
	}

	@Override
	public void setVehicleClass(String vehicleClass) {
		_vehicleClass = vehicleClass;

		if (_inspectionCommonStatusRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionCommonStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setVehicleClass", String.class);

				method.invoke(_inspectionCommonStatusRemoteModel, vehicleClass);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSequenceNo() {
		return _sequenceNo;
	}

	@Override
	public void setSequenceNo(long sequenceNo) {
		_sequenceNo = sequenceNo;

		if (_inspectionCommonStatusRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionCommonStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setSequenceNo", long.class);

				method.invoke(_inspectionCommonStatusRemoteModel, sequenceNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getType() {
		return _type;
	}

	@Override
	public void setType(long type) {
		_type = type;

		if (_inspectionCommonStatusRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionCommonStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setType", long.class);

				method.invoke(_inspectionCommonStatusRemoteModel, type);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGroupName() {
		return _groupName;
	}

	@Override
	public void setGroupName(String groupName) {
		_groupName = groupName;

		if (_inspectionCommonStatusRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionCommonStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupName", String.class);

				method.invoke(_inspectionCommonStatusRemoteModel, groupName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getItemName() {
		return _itemName;
	}

	@Override
	public void setItemName(String itemName) {
		_itemName = itemName;

		if (_inspectionCommonStatusRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionCommonStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setItemName", String.class);

				method.invoke(_inspectionCommonStatusRemoteModel, itemName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCommonStatus() {
		return _commonStatus;
	}

	@Override
	public void setCommonStatus(long commonStatus) {
		_commonStatus = commonStatus;

		if (_inspectionCommonStatusRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionCommonStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setCommonStatus", long.class);

				method.invoke(_inspectionCommonStatusRemoteModel, commonStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getInspectionRecordId() {
		return _inspectionRecordId;
	}

	@Override
	public void setInspectionRecordId(long inspectionRecordId) {
		_inspectionRecordId = inspectionRecordId;

		if (_inspectionCommonStatusRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionCommonStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionRecordId",
						long.class);

				method.invoke(_inspectionCommonStatusRemoteModel,
					inspectionRecordId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCommonCode() {
		return _commonCode;
	}

	@Override
	public void setCommonCode(String commonCode) {
		_commonCode = commonCode;

		if (_inspectionCommonStatusRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionCommonStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setCommonCode", String.class);

				method.invoke(_inspectionCommonStatusRemoteModel, commonCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getAllowEdit() {
		return _allowEdit;
	}

	@Override
	public void setAllowEdit(int allowEdit) {
		_allowEdit = allowEdit;

		if (_inspectionCommonStatusRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionCommonStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setAllowEdit", int.class);

				method.invoke(_inspectionCommonStatusRemoteModel, allowEdit);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getInspectionCommonStatusRemoteModel() {
		return _inspectionCommonStatusRemoteModel;
	}

	public void setInspectionCommonStatusRemoteModel(
		BaseModel<?> inspectionCommonStatusRemoteModel) {
		_inspectionCommonStatusRemoteModel = inspectionCommonStatusRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _inspectionCommonStatusRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_inspectionCommonStatusRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			InspectionCommonStatusLocalServiceUtil.addInspectionCommonStatus(this);
		}
		else {
			InspectionCommonStatusLocalServiceUtil.updateInspectionCommonStatus(this);
		}
	}

	@Override
	public InspectionCommonStatus toEscapedModel() {
		return (InspectionCommonStatus)ProxyUtil.newProxyInstance(InspectionCommonStatus.class.getClassLoader(),
			new Class[] { InspectionCommonStatus.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		InspectionCommonStatusClp clone = new InspectionCommonStatusClp();

		clone.setId(getId());
		clone.setVehicleClass(getVehicleClass());
		clone.setSequenceNo(getSequenceNo());
		clone.setType(getType());
		clone.setGroupName(getGroupName());
		clone.setItemName(getItemName());
		clone.setCommonStatus(getCommonStatus());
		clone.setInspectionRecordId(getInspectionRecordId());
		clone.setCommonCode(getCommonCode());
		clone.setAllowEdit(getAllowEdit());

		return clone;
	}

	@Override
	public int compareTo(InspectionCommonStatus inspectionCommonStatus) {
		int value = 0;

		if (getId() < inspectionCommonStatus.getId()) {
			value = -1;
		}
		else if (getId() > inspectionCommonStatus.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof InspectionCommonStatusClp)) {
			return false;
		}

		InspectionCommonStatusClp inspectionCommonStatus = (InspectionCommonStatusClp)obj;

		long primaryKey = inspectionCommonStatus.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", vehicleClass=");
		sb.append(getVehicleClass());
		sb.append(", sequenceNo=");
		sb.append(getSequenceNo());
		sb.append(", type=");
		sb.append(getType());
		sb.append(", groupName=");
		sb.append(getGroupName());
		sb.append(", itemName=");
		sb.append(getItemName());
		sb.append(", commonStatus=");
		sb.append(getCommonStatus());
		sb.append(", inspectionRecordId=");
		sb.append(getInspectionRecordId());
		sb.append(", commonCode=");
		sb.append(getCommonCode());
		sb.append(", allowEdit=");
		sb.append(getAllowEdit());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicleClass</column-name><column-value><![CDATA[");
		sb.append(getVehicleClass());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sequenceNo</column-name><column-value><![CDATA[");
		sb.append(getSequenceNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupName</column-name><column-value><![CDATA[");
		sb.append(getGroupName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>itemName</column-name><column-value><![CDATA[");
		sb.append(getItemName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>commonStatus</column-name><column-value><![CDATA[");
		sb.append(getCommonStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionRecordId</column-name><column-value><![CDATA[");
		sb.append(getInspectionRecordId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>commonCode</column-name><column-value><![CDATA[");
		sb.append(getCommonCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>allowEdit</column-name><column-value><![CDATA[");
		sb.append(getAllowEdit());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _vehicleClass;
	private long _sequenceNo;
	private long _type;
	private String _groupName;
	private String _itemName;
	private long _commonStatus;
	private long _inspectionRecordId;
	private String _commonCode;
	private int _allowEdit;
	private BaseModel<?> _inspectionCommonStatusRemoteModel;
}