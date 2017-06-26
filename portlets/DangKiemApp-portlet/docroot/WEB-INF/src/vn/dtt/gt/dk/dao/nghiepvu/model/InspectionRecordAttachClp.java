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
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordAttachLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class InspectionRecordAttachClp extends BaseModelImpl<InspectionRecordAttach>
	implements InspectionRecordAttach {
	public InspectionRecordAttachClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return InspectionRecordAttach.class;
	}

	@Override
	public String getModelClassName() {
		return InspectionRecordAttach.class.getName();
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
		attributes.put("inspectionRecordId", getInspectionRecordId());
		attributes.put("hoSoThuTucId", getHoSoThuTucId());
		attributes.put("enTryId", getEnTryId());
		attributes.put("enTryName", getEnTryName());
		attributes.put("inspectorId", getInspectorId());
		attributes.put("uploadTime", getUploadTime());
		attributes.put("markUpDelte", getMarkUpDelte());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long inspectionRecordId = (Long)attributes.get("inspectionRecordId");

		if (inspectionRecordId != null) {
			setInspectionRecordId(inspectionRecordId);
		}

		Long hoSoThuTucId = (Long)attributes.get("hoSoThuTucId");

		if (hoSoThuTucId != null) {
			setHoSoThuTucId(hoSoThuTucId);
		}

		Long enTryId = (Long)attributes.get("enTryId");

		if (enTryId != null) {
			setEnTryId(enTryId);
		}

		String enTryName = (String)attributes.get("enTryName");

		if (enTryName != null) {
			setEnTryName(enTryName);
		}

		Long inspectorId = (Long)attributes.get("inspectorId");

		if (inspectorId != null) {
			setInspectorId(inspectorId);
		}

		Date uploadTime = (Date)attributes.get("uploadTime");

		if (uploadTime != null) {
			setUploadTime(uploadTime);
		}

		Integer markUpDelte = (Integer)attributes.get("markUpDelte");

		if (markUpDelte != null) {
			setMarkUpDelte(markUpDelte);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_inspectionRecordAttachRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionRecordAttachRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_inspectionRecordAttachRemoteModel, id);
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

		if (_inspectionRecordAttachRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionRecordAttachRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionRecordId",
						long.class);

				method.invoke(_inspectionRecordAttachRemoteModel,
					inspectionRecordId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getHoSoThuTucId() {
		return _hoSoThuTucId;
	}

	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_hoSoThuTucId = hoSoThuTucId;

		if (_inspectionRecordAttachRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionRecordAttachRemoteModel.getClass();

				Method method = clazz.getMethod("setHoSoThuTucId", long.class);

				method.invoke(_inspectionRecordAttachRemoteModel, hoSoThuTucId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getEnTryId() {
		return _enTryId;
	}

	@Override
	public void setEnTryId(long enTryId) {
		_enTryId = enTryId;

		if (_inspectionRecordAttachRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionRecordAttachRemoteModel.getClass();

				Method method = clazz.getMethod("setEnTryId", long.class);

				method.invoke(_inspectionRecordAttachRemoteModel, enTryId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEnTryName() {
		return _enTryName;
	}

	@Override
	public void setEnTryName(String enTryName) {
		_enTryName = enTryName;

		if (_inspectionRecordAttachRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionRecordAttachRemoteModel.getClass();

				Method method = clazz.getMethod("setEnTryName", String.class);

				method.invoke(_inspectionRecordAttachRemoteModel, enTryName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getInspectorId() {
		return _inspectorId;
	}

	@Override
	public void setInspectorId(long inspectorId) {
		_inspectorId = inspectorId;

		if (_inspectionRecordAttachRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionRecordAttachRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectorId", long.class);

				method.invoke(_inspectionRecordAttachRemoteModel, inspectorId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getUploadTime() {
		return _uploadTime;
	}

	@Override
	public void setUploadTime(Date uploadTime) {
		_uploadTime = uploadTime;

		if (_inspectionRecordAttachRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionRecordAttachRemoteModel.getClass();

				Method method = clazz.getMethod("setUploadTime", Date.class);

				method.invoke(_inspectionRecordAttachRemoteModel, uploadTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMarkUpDelte() {
		return _markUpDelte;
	}

	@Override
	public void setMarkUpDelte(int markUpDelte) {
		_markUpDelte = markUpDelte;

		if (_inspectionRecordAttachRemoteModel != null) {
			try {
				Class<?> clazz = _inspectionRecordAttachRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkUpDelte", int.class);

				method.invoke(_inspectionRecordAttachRemoteModel, markUpDelte);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getInspectionRecordAttachRemoteModel() {
		return _inspectionRecordAttachRemoteModel;
	}

	public void setInspectionRecordAttachRemoteModel(
		BaseModel<?> inspectionRecordAttachRemoteModel) {
		_inspectionRecordAttachRemoteModel = inspectionRecordAttachRemoteModel;
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

		Class<?> remoteModelClass = _inspectionRecordAttachRemoteModel.getClass();

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

		Object returnValue = method.invoke(_inspectionRecordAttachRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			InspectionRecordAttachLocalServiceUtil.addInspectionRecordAttach(this);
		}
		else {
			InspectionRecordAttachLocalServiceUtil.updateInspectionRecordAttach(this);
		}
	}

	@Override
	public InspectionRecordAttach toEscapedModel() {
		return (InspectionRecordAttach)ProxyUtil.newProxyInstance(InspectionRecordAttach.class.getClassLoader(),
			new Class[] { InspectionRecordAttach.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		InspectionRecordAttachClp clone = new InspectionRecordAttachClp();

		clone.setId(getId());
		clone.setInspectionRecordId(getInspectionRecordId());
		clone.setHoSoThuTucId(getHoSoThuTucId());
		clone.setEnTryId(getEnTryId());
		clone.setEnTryName(getEnTryName());
		clone.setInspectorId(getInspectorId());
		clone.setUploadTime(getUploadTime());
		clone.setMarkUpDelte(getMarkUpDelte());

		return clone;
	}

	@Override
	public int compareTo(InspectionRecordAttach inspectionRecordAttach) {
		int value = 0;

		if (getId() < inspectionRecordAttach.getId()) {
			value = -1;
		}
		else if (getId() > inspectionRecordAttach.getId()) {
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

		if (!(obj instanceof InspectionRecordAttachClp)) {
			return false;
		}

		InspectionRecordAttachClp inspectionRecordAttach = (InspectionRecordAttachClp)obj;

		long primaryKey = inspectionRecordAttach.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", inspectionRecordId=");
		sb.append(getInspectionRecordId());
		sb.append(", hoSoThuTucId=");
		sb.append(getHoSoThuTucId());
		sb.append(", enTryId=");
		sb.append(getEnTryId());
		sb.append(", enTryName=");
		sb.append(getEnTryName());
		sb.append(", inspectorId=");
		sb.append(getInspectorId());
		sb.append(", uploadTime=");
		sb.append(getUploadTime());
		sb.append(", markUpDelte=");
		sb.append(getMarkUpDelte());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionRecordId</column-name><column-value><![CDATA[");
		sb.append(getInspectionRecordId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoSoThuTucId</column-name><column-value><![CDATA[");
		sb.append(getHoSoThuTucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enTryId</column-name><column-value><![CDATA[");
		sb.append(getEnTryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enTryName</column-name><column-value><![CDATA[");
		sb.append(getEnTryName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorId</column-name><column-value><![CDATA[");
		sb.append(getInspectorId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>uploadTime</column-name><column-value><![CDATA[");
		sb.append(getUploadTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markUpDelte</column-name><column-value><![CDATA[");
		sb.append(getMarkUpDelte());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _inspectionRecordId;
	private long _hoSoThuTucId;
	private long _enTryId;
	private String _enTryName;
	private long _inspectorId;
	private Date _uploadTime;
	private int _markUpDelte;
	private BaseModel<?> _inspectionRecordAttachRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.class;
}