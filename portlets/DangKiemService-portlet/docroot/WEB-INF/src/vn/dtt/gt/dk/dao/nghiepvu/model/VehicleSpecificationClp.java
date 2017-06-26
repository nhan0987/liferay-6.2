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
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleSpecificationLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author huymq
 */
public class VehicleSpecificationClp extends BaseModelImpl<VehicleSpecification>
	implements VehicleSpecification {
	public VehicleSpecificationClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return VehicleSpecification.class;
	}

	@Override
	public String getModelClassName() {
		return VehicleSpecification.class.getName();
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
		attributes.put("vehicleGroupId", getVehicleGroupId());
		attributes.put("specificationVersion", getSpecificationVersion());
		attributes.put("specificationSourceCode", getSpecificationSourceCode());
		attributes.put("specificationCode", getSpecificationCode());
		attributes.put("specificationName", getSpecificationName());
		attributes.put("specificationValue", getSpecificationValue());
		attributes.put("safetyTestReportId", getSafetyTestReportId());
		attributes.put("inspectionRecordId", getInspectionRecordId());
		attributes.put("specificResult", getSpecificResult());
		attributes.put("synchdate", getSynchdate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long vehicleGroupId = (Long)attributes.get("vehicleGroupId");

		if (vehicleGroupId != null) {
			setVehicleGroupId(vehicleGroupId);
		}

		Long specificationVersion = (Long)attributes.get("specificationVersion");

		if (specificationVersion != null) {
			setSpecificationVersion(specificationVersion);
		}

		String specificationSourceCode = (String)attributes.get(
				"specificationSourceCode");

		if (specificationSourceCode != null) {
			setSpecificationSourceCode(specificationSourceCode);
		}

		String specificationCode = (String)attributes.get("specificationCode");

		if (specificationCode != null) {
			setSpecificationCode(specificationCode);
		}

		String specificationName = (String)attributes.get("specificationName");

		if (specificationName != null) {
			setSpecificationName(specificationName);
		}

		String specificationValue = (String)attributes.get("specificationValue");

		if (specificationValue != null) {
			setSpecificationValue(specificationValue);
		}

		Long safetyTestReportId = (Long)attributes.get("safetyTestReportId");

		if (safetyTestReportId != null) {
			setSafetyTestReportId(safetyTestReportId);
		}

		Long inspectionRecordId = (Long)attributes.get("inspectionRecordId");

		if (inspectionRecordId != null) {
			setInspectionRecordId(inspectionRecordId);
		}

		Long specificResult = (Long)attributes.get("specificResult");

		if (specificResult != null) {
			setSpecificResult(specificResult);
		}

		Date synchdate = (Date)attributes.get("synchdate");

		if (synchdate != null) {
			setSynchdate(synchdate);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_vehicleSpecificationRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleSpecificationRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_vehicleSpecificationRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getVehicleGroupId() {
		return _vehicleGroupId;
	}

	@Override
	public void setVehicleGroupId(long vehicleGroupId) {
		_vehicleGroupId = vehicleGroupId;

		if (_vehicleSpecificationRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleSpecificationRemoteModel.getClass();

				Method method = clazz.getMethod("setVehicleGroupId", long.class);

				method.invoke(_vehicleSpecificationRemoteModel, vehicleGroupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSpecificationVersion() {
		return _specificationVersion;
	}

	@Override
	public void setSpecificationVersion(long specificationVersion) {
		_specificationVersion = specificationVersion;

		if (_vehicleSpecificationRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleSpecificationRemoteModel.getClass();

				Method method = clazz.getMethod("setSpecificationVersion",
						long.class);

				method.invoke(_vehicleSpecificationRemoteModel,
					specificationVersion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSpecificationSourceCode() {
		return _specificationSourceCode;
	}

	@Override
	public void setSpecificationSourceCode(String specificationSourceCode) {
		_specificationSourceCode = specificationSourceCode;

		if (_vehicleSpecificationRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleSpecificationRemoteModel.getClass();

				Method method = clazz.getMethod("setSpecificationSourceCode",
						String.class);

				method.invoke(_vehicleSpecificationRemoteModel,
					specificationSourceCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSpecificationCode() {
		return _specificationCode;
	}

	@Override
	public void setSpecificationCode(String specificationCode) {
		_specificationCode = specificationCode;

		if (_vehicleSpecificationRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleSpecificationRemoteModel.getClass();

				Method method = clazz.getMethod("setSpecificationCode",
						String.class);

				method.invoke(_vehicleSpecificationRemoteModel,
					specificationCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSpecificationName() {
		return _specificationName;
	}

	@Override
	public void setSpecificationName(String specificationName) {
		_specificationName = specificationName;

		if (_vehicleSpecificationRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleSpecificationRemoteModel.getClass();

				Method method = clazz.getMethod("setSpecificationName",
						String.class);

				method.invoke(_vehicleSpecificationRemoteModel,
					specificationName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSpecificationValue() {
		return _specificationValue;
	}

	@Override
	public void setSpecificationValue(String specificationValue) {
		_specificationValue = specificationValue;

		if (_vehicleSpecificationRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleSpecificationRemoteModel.getClass();

				Method method = clazz.getMethod("setSpecificationValue",
						String.class);

				method.invoke(_vehicleSpecificationRemoteModel,
					specificationValue);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSafetyTestReportId() {
		return _safetyTestReportId;
	}

	@Override
	public void setSafetyTestReportId(long safetyTestReportId) {
		_safetyTestReportId = safetyTestReportId;

		if (_vehicleSpecificationRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleSpecificationRemoteModel.getClass();

				Method method = clazz.getMethod("setSafetyTestReportId",
						long.class);

				method.invoke(_vehicleSpecificationRemoteModel,
					safetyTestReportId);
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

		if (_vehicleSpecificationRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleSpecificationRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionRecordId",
						long.class);

				method.invoke(_vehicleSpecificationRemoteModel,
					inspectionRecordId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSpecificResult() {
		return _specificResult;
	}

	@Override
	public void setSpecificResult(long specificResult) {
		_specificResult = specificResult;

		if (_vehicleSpecificationRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleSpecificationRemoteModel.getClass();

				Method method = clazz.getMethod("setSpecificResult", long.class);

				method.invoke(_vehicleSpecificationRemoteModel, specificResult);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSynchdate() {
		return _synchdate;
	}

	@Override
	public void setSynchdate(Date synchdate) {
		_synchdate = synchdate;

		if (_vehicleSpecificationRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleSpecificationRemoteModel.getClass();

				Method method = clazz.getMethod("setSynchdate", Date.class);

				method.invoke(_vehicleSpecificationRemoteModel, synchdate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getVehicleSpecificationRemoteModel() {
		return _vehicleSpecificationRemoteModel;
	}

	public void setVehicleSpecificationRemoteModel(
		BaseModel<?> vehicleSpecificationRemoteModel) {
		_vehicleSpecificationRemoteModel = vehicleSpecificationRemoteModel;
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

		Class<?> remoteModelClass = _vehicleSpecificationRemoteModel.getClass();

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

		Object returnValue = method.invoke(_vehicleSpecificationRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			VehicleSpecificationLocalServiceUtil.addVehicleSpecification(this);
		}
		else {
			VehicleSpecificationLocalServiceUtil.updateVehicleSpecification(this);
		}
	}

	@Override
	public VehicleSpecification toEscapedModel() {
		return (VehicleSpecification)ProxyUtil.newProxyInstance(VehicleSpecification.class.getClassLoader(),
			new Class[] { VehicleSpecification.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		VehicleSpecificationClp clone = new VehicleSpecificationClp();

		clone.setId(getId());
		clone.setVehicleGroupId(getVehicleGroupId());
		clone.setSpecificationVersion(getSpecificationVersion());
		clone.setSpecificationSourceCode(getSpecificationSourceCode());
		clone.setSpecificationCode(getSpecificationCode());
		clone.setSpecificationName(getSpecificationName());
		clone.setSpecificationValue(getSpecificationValue());
		clone.setSafetyTestReportId(getSafetyTestReportId());
		clone.setInspectionRecordId(getInspectionRecordId());
		clone.setSpecificResult(getSpecificResult());
		clone.setSynchdate(getSynchdate());

		return clone;
	}

	@Override
	public int compareTo(VehicleSpecification vehicleSpecification) {
		int value = 0;

		if (getId() < vehicleSpecification.getId()) {
			value = -1;
		}
		else if (getId() > vehicleSpecification.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		if (!(obj instanceof VehicleSpecificationClp)) {
			return false;
		}

		VehicleSpecificationClp vehicleSpecification = (VehicleSpecificationClp)obj;

		long primaryKey = vehicleSpecification.getPrimaryKey();

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
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", vehicleGroupId=");
		sb.append(getVehicleGroupId());
		sb.append(", specificationVersion=");
		sb.append(getSpecificationVersion());
		sb.append(", specificationSourceCode=");
		sb.append(getSpecificationSourceCode());
		sb.append(", specificationCode=");
		sb.append(getSpecificationCode());
		sb.append(", specificationName=");
		sb.append(getSpecificationName());
		sb.append(", specificationValue=");
		sb.append(getSpecificationValue());
		sb.append(", safetyTestReportId=");
		sb.append(getSafetyTestReportId());
		sb.append(", inspectionRecordId=");
		sb.append(getInspectionRecordId());
		sb.append(", specificResult=");
		sb.append(getSpecificResult());
		sb.append(", synchdate=");
		sb.append(getSynchdate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicleGroupId</column-name><column-value><![CDATA[");
		sb.append(getVehicleGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specificationVersion</column-name><column-value><![CDATA[");
		sb.append(getSpecificationVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specificationSourceCode</column-name><column-value><![CDATA[");
		sb.append(getSpecificationSourceCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specificationCode</column-name><column-value><![CDATA[");
		sb.append(getSpecificationCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specificationName</column-name><column-value><![CDATA[");
		sb.append(getSpecificationName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specificationValue</column-name><column-value><![CDATA[");
		sb.append(getSpecificationValue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>safetyTestReportId</column-name><column-value><![CDATA[");
		sb.append(getSafetyTestReportId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionRecordId</column-name><column-value><![CDATA[");
		sb.append(getInspectionRecordId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specificResult</column-name><column-value><![CDATA[");
		sb.append(getSpecificResult());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>synchdate</column-name><column-value><![CDATA[");
		sb.append(getSynchdate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _vehicleGroupId;
	private long _specificationVersion;
	private String _specificationSourceCode;
	private String _specificationCode;
	private String _specificationName;
	private String _specificationValue;
	private long _safetyTestReportId;
	private long _inspectionRecordId;
	private long _specificResult;
	private Date _synchdate;
	private BaseModel<?> _vehicleSpecificationRemoteModel;
}