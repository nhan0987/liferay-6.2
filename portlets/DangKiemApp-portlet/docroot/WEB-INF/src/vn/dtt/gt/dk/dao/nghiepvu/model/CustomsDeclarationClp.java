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
import vn.dtt.gt.dk.dao.nghiepvu.service.CustomsDeclarationLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class CustomsDeclarationClp extends BaseModelImpl<CustomsDeclaration>
	implements CustomsDeclaration {
	public CustomsDeclarationClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return CustomsDeclaration.class;
	}

	@Override
	public String getModelClassName() {
		return CustomsDeclaration.class.getName();
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
		attributes.put("importCustomDeclareNo", getImportCustomDeclareNo());
		attributes.put("importCustomDeclareDate", getImportCustomDeclareDate());
		attributes.put("customsResult", getCustomsResult());
		attributes.put("productCheck", getProductCheck());
		attributes.put("releaseDate", getReleaseDate());
		attributes.put("hosothutucId", getHosothutucId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String importCustomDeclareNo = (String)attributes.get(
				"importCustomDeclareNo");

		if (importCustomDeclareNo != null) {
			setImportCustomDeclareNo(importCustomDeclareNo);
		}

		Date importCustomDeclareDate = (Date)attributes.get(
				"importCustomDeclareDate");

		if (importCustomDeclareDate != null) {
			setImportCustomDeclareDate(importCustomDeclareDate);
		}

		String customsResult = (String)attributes.get("customsResult");

		if (customsResult != null) {
			setCustomsResult(customsResult);
		}

		String productCheck = (String)attributes.get("productCheck");

		if (productCheck != null) {
			setProductCheck(productCheck);
		}

		Date releaseDate = (Date)attributes.get("releaseDate");

		if (releaseDate != null) {
			setReleaseDate(releaseDate);
		}

		Long hosothutucId = (Long)attributes.get("hosothutucId");

		if (hosothutucId != null) {
			setHosothutucId(hosothutucId);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_customsDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _customsDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_customsDeclarationRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImportCustomDeclareNo() {
		return _importCustomDeclareNo;
	}

	@Override
	public void setImportCustomDeclareNo(String importCustomDeclareNo) {
		_importCustomDeclareNo = importCustomDeclareNo;

		if (_customsDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _customsDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setImportCustomDeclareNo",
						String.class);

				method.invoke(_customsDeclarationRemoteModel,
					importCustomDeclareNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getImportCustomDeclareDate() {
		return _importCustomDeclareDate;
	}

	@Override
	public void setImportCustomDeclareDate(Date importCustomDeclareDate) {
		_importCustomDeclareDate = importCustomDeclareDate;

		if (_customsDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _customsDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setImportCustomDeclareDate",
						Date.class);

				method.invoke(_customsDeclarationRemoteModel,
					importCustomDeclareDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCustomsResult() {
		return _customsResult;
	}

	@Override
	public void setCustomsResult(String customsResult) {
		_customsResult = customsResult;

		if (_customsDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _customsDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setCustomsResult", String.class);

				method.invoke(_customsDeclarationRemoteModel, customsResult);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProductCheck() {
		return _productCheck;
	}

	@Override
	public void setProductCheck(String productCheck) {
		_productCheck = productCheck;

		if (_customsDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _customsDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setProductCheck", String.class);

				method.invoke(_customsDeclarationRemoteModel, productCheck);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getReleaseDate() {
		return _releaseDate;
	}

	@Override
	public void setReleaseDate(Date releaseDate) {
		_releaseDate = releaseDate;

		if (_customsDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _customsDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setReleaseDate", Date.class);

				method.invoke(_customsDeclarationRemoteModel, releaseDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getHosothutucId() {
		return _hosothutucId;
	}

	@Override
	public void setHosothutucId(long hosothutucId) {
		_hosothutucId = hosothutucId;

		if (_customsDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _customsDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setHosothutucId", long.class);

				method.invoke(_customsDeclarationRemoteModel, hosothutucId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCustomsDeclarationRemoteModel() {
		return _customsDeclarationRemoteModel;
	}

	public void setCustomsDeclarationRemoteModel(
		BaseModel<?> customsDeclarationRemoteModel) {
		_customsDeclarationRemoteModel = customsDeclarationRemoteModel;
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

		Class<?> remoteModelClass = _customsDeclarationRemoteModel.getClass();

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

		Object returnValue = method.invoke(_customsDeclarationRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CustomsDeclarationLocalServiceUtil.addCustomsDeclaration(this);
		}
		else {
			CustomsDeclarationLocalServiceUtil.updateCustomsDeclaration(this);
		}
	}

	@Override
	public CustomsDeclaration toEscapedModel() {
		return (CustomsDeclaration)ProxyUtil.newProxyInstance(CustomsDeclaration.class.getClassLoader(),
			new Class[] { CustomsDeclaration.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CustomsDeclarationClp clone = new CustomsDeclarationClp();

		clone.setId(getId());
		clone.setImportCustomDeclareNo(getImportCustomDeclareNo());
		clone.setImportCustomDeclareDate(getImportCustomDeclareDate());
		clone.setCustomsResult(getCustomsResult());
		clone.setProductCheck(getProductCheck());
		clone.setReleaseDate(getReleaseDate());
		clone.setHosothutucId(getHosothutucId());

		return clone;
	}

	@Override
	public int compareTo(CustomsDeclaration customsDeclaration) {
		int value = 0;

		if (getId() < customsDeclaration.getId()) {
			value = -1;
		}
		else if (getId() > customsDeclaration.getId()) {
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

		if (!(obj instanceof CustomsDeclarationClp)) {
			return false;
		}

		CustomsDeclarationClp customsDeclaration = (CustomsDeclarationClp)obj;

		long primaryKey = customsDeclaration.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", importCustomDeclareNo=");
		sb.append(getImportCustomDeclareNo());
		sb.append(", importCustomDeclareDate=");
		sb.append(getImportCustomDeclareDate());
		sb.append(", customsResult=");
		sb.append(getCustomsResult());
		sb.append(", productCheck=");
		sb.append(getProductCheck());
		sb.append(", releaseDate=");
		sb.append(getReleaseDate());
		sb.append(", hosothutucId=");
		sb.append(getHosothutucId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>importCustomDeclareNo</column-name><column-value><![CDATA[");
		sb.append(getImportCustomDeclareNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>importCustomDeclareDate</column-name><column-value><![CDATA[");
		sb.append(getImportCustomDeclareDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>customsResult</column-name><column-value><![CDATA[");
		sb.append(getCustomsResult());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productCheck</column-name><column-value><![CDATA[");
		sb.append(getProductCheck());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>releaseDate</column-name><column-value><![CDATA[");
		sb.append(getReleaseDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hosothutucId</column-name><column-value><![CDATA[");
		sb.append(getHosothutucId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _importCustomDeclareNo;
	private Date _importCustomDeclareDate;
	private String _customsResult;
	private String _productCheck;
	private Date _releaseDate;
	private long _hosothutucId;
	private BaseModel<?> _customsDeclarationRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.class;
}