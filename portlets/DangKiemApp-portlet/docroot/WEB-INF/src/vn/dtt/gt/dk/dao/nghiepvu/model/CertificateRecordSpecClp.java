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

import vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordSpecLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class CertificateRecordSpecClp extends BaseModelImpl<CertificateRecordSpec>
	implements CertificateRecordSpec {
	public CertificateRecordSpecClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return CertificateRecordSpec.class;
	}

	@Override
	public String getModelClassName() {
		return CertificateRecordSpec.class.getName();
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
		attributes.put("certificateRecordId", getCertificateRecordId());
		attributes.put("specificationCode", getSpecificationCode());
		attributes.put("specificationName", getSpecificationName());
		attributes.put("specificationValue", getSpecificationValue());
		attributes.put("version", getVersion());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long certificateRecordId = (Long)attributes.get("certificateRecordId");

		if (certificateRecordId != null) {
			setCertificateRecordId(certificateRecordId);
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

		Long version = (Long)attributes.get("version");

		if (version != null) {
			setVersion(version);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_certificateRecordSpecRemoteModel != null) {
			try {
				Class<?> clazz = _certificateRecordSpecRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_certificateRecordSpecRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCertificateRecordId() {
		return _certificateRecordId;
	}

	@Override
	public void setCertificateRecordId(long certificateRecordId) {
		_certificateRecordId = certificateRecordId;

		if (_certificateRecordSpecRemoteModel != null) {
			try {
				Class<?> clazz = _certificateRecordSpecRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateRecordId",
						long.class);

				method.invoke(_certificateRecordSpecRemoteModel,
					certificateRecordId);
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

		if (_certificateRecordSpecRemoteModel != null) {
			try {
				Class<?> clazz = _certificateRecordSpecRemoteModel.getClass();

				Method method = clazz.getMethod("setSpecificationCode",
						String.class);

				method.invoke(_certificateRecordSpecRemoteModel,
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

		if (_certificateRecordSpecRemoteModel != null) {
			try {
				Class<?> clazz = _certificateRecordSpecRemoteModel.getClass();

				Method method = clazz.getMethod("setSpecificationName",
						String.class);

				method.invoke(_certificateRecordSpecRemoteModel,
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

		if (_certificateRecordSpecRemoteModel != null) {
			try {
				Class<?> clazz = _certificateRecordSpecRemoteModel.getClass();

				Method method = clazz.getMethod("setSpecificationValue",
						String.class);

				method.invoke(_certificateRecordSpecRemoteModel,
					specificationValue);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getVersion() {
		return _version;
	}

	@Override
	public void setVersion(long version) {
		_version = version;

		if (_certificateRecordSpecRemoteModel != null) {
			try {
				Class<?> clazz = _certificateRecordSpecRemoteModel.getClass();

				Method method = clazz.getMethod("setVersion", long.class);

				method.invoke(_certificateRecordSpecRemoteModel, version);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCertificateRecordSpecRemoteModel() {
		return _certificateRecordSpecRemoteModel;
	}

	public void setCertificateRecordSpecRemoteModel(
		BaseModel<?> certificateRecordSpecRemoteModel) {
		_certificateRecordSpecRemoteModel = certificateRecordSpecRemoteModel;
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

		Class<?> remoteModelClass = _certificateRecordSpecRemoteModel.getClass();

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

		Object returnValue = method.invoke(_certificateRecordSpecRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CertificateRecordSpecLocalServiceUtil.addCertificateRecordSpec(this);
		}
		else {
			CertificateRecordSpecLocalServiceUtil.updateCertificateRecordSpec(this);
		}
	}

	@Override
	public CertificateRecordSpec toEscapedModel() {
		return (CertificateRecordSpec)ProxyUtil.newProxyInstance(CertificateRecordSpec.class.getClassLoader(),
			new Class[] { CertificateRecordSpec.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CertificateRecordSpecClp clone = new CertificateRecordSpecClp();

		clone.setId(getId());
		clone.setCertificateRecordId(getCertificateRecordId());
		clone.setSpecificationCode(getSpecificationCode());
		clone.setSpecificationName(getSpecificationName());
		clone.setSpecificationValue(getSpecificationValue());
		clone.setVersion(getVersion());

		return clone;
	}

	@Override
	public int compareTo(CertificateRecordSpec certificateRecordSpec) {
		int value = 0;

		if (getId() < certificateRecordSpec.getId()) {
			value = -1;
		}
		else if (getId() > certificateRecordSpec.getId()) {
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

		if (!(obj instanceof CertificateRecordSpecClp)) {
			return false;
		}

		CertificateRecordSpecClp certificateRecordSpec = (CertificateRecordSpecClp)obj;

		long primaryKey = certificateRecordSpec.getPrimaryKey();

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
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", certificateRecordId=");
		sb.append(getCertificateRecordId());
		sb.append(", specificationCode=");
		sb.append(getSpecificationCode());
		sb.append(", specificationName=");
		sb.append(getSpecificationName());
		sb.append(", specificationValue=");
		sb.append(getSpecificationValue());
		sb.append(", version=");
		sb.append(getVersion());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateRecordId</column-name><column-value><![CDATA[");
		sb.append(getCertificateRecordId());
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
			"<column><column-name>version</column-name><column-value><![CDATA[");
		sb.append(getVersion());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _certificateRecordId;
	private String _specificationCode;
	private String _specificationName;
	private String _specificationValue;
	private long _version;
	private BaseModel<?> _certificateRecordSpecRemoteModel;
}