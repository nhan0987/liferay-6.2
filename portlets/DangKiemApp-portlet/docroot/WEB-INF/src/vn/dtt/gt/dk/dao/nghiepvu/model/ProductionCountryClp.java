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
import vn.dtt.gt.dk.dao.nghiepvu.service.ProductionCountryLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class ProductionCountryClp extends BaseModelImpl<ProductionCountry>
	implements ProductionCountry {
	public ProductionCountryClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ProductionCountry.class;
	}

	@Override
	public String getModelClassName() {
		return ProductionCountry.class.getName();
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
		attributes.put("countryCode", getCountryCode());
		attributes.put("SynchDate", getSynchDate());

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

		String countryCode = (String)attributes.get("countryCode");

		if (countryCode != null) {
			setCountryCode(countryCode);
		}

		Date SynchDate = (Date)attributes.get("SynchDate");

		if (SynchDate != null) {
			setSynchDate(SynchDate);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_productionCountryRemoteModel != null) {
			try {
				Class<?> clazz = _productionCountryRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_productionCountryRemoteModel, id);
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

		if (_productionCountryRemoteModel != null) {
			try {
				Class<?> clazz = _productionCountryRemoteModel.getClass();

				Method method = clazz.getMethod("setVehicleGroupId", long.class);

				method.invoke(_productionCountryRemoteModel, vehicleGroupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCountryCode() {
		return _countryCode;
	}

	@Override
	public void setCountryCode(String countryCode) {
		_countryCode = countryCode;

		if (_productionCountryRemoteModel != null) {
			try {
				Class<?> clazz = _productionCountryRemoteModel.getClass();

				Method method = clazz.getMethod("setCountryCode", String.class);

				method.invoke(_productionCountryRemoteModel, countryCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSynchDate() {
		return _SynchDate;
	}

	@Override
	public void setSynchDate(Date SynchDate) {
		_SynchDate = SynchDate;

		if (_productionCountryRemoteModel != null) {
			try {
				Class<?> clazz = _productionCountryRemoteModel.getClass();

				Method method = clazz.getMethod("setSynchDate", Date.class);

				method.invoke(_productionCountryRemoteModel, SynchDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getProductionCountryRemoteModel() {
		return _productionCountryRemoteModel;
	}

	public void setProductionCountryRemoteModel(
		BaseModel<?> productionCountryRemoteModel) {
		_productionCountryRemoteModel = productionCountryRemoteModel;
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

		Class<?> remoteModelClass = _productionCountryRemoteModel.getClass();

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

		Object returnValue = method.invoke(_productionCountryRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ProductionCountryLocalServiceUtil.addProductionCountry(this);
		}
		else {
			ProductionCountryLocalServiceUtil.updateProductionCountry(this);
		}
	}

	@Override
	public ProductionCountry toEscapedModel() {
		return (ProductionCountry)ProxyUtil.newProxyInstance(ProductionCountry.class.getClassLoader(),
			new Class[] { ProductionCountry.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ProductionCountryClp clone = new ProductionCountryClp();

		clone.setId(getId());
		clone.setVehicleGroupId(getVehicleGroupId());
		clone.setCountryCode(getCountryCode());
		clone.setSynchDate(getSynchDate());

		return clone;
	}

	@Override
	public int compareTo(ProductionCountry productionCountry) {
		int value = 0;

		if (getId() < productionCountry.getId()) {
			value = -1;
		}
		else if (getId() > productionCountry.getId()) {
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

		if (!(obj instanceof ProductionCountryClp)) {
			return false;
		}

		ProductionCountryClp productionCountry = (ProductionCountryClp)obj;

		long primaryKey = productionCountry.getPrimaryKey();

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
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", vehicleGroupId=");
		sb.append(getVehicleGroupId());
		sb.append(", countryCode=");
		sb.append(getCountryCode());
		sb.append(", SynchDate=");
		sb.append(getSynchDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry");
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
			"<column><column-name>countryCode</column-name><column-value><![CDATA[");
		sb.append(getCountryCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SynchDate</column-name><column-value><![CDATA[");
		sb.append(getSynchDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _vehicleGroupId;
	private String _countryCode;
	private Date _SynchDate;
	private BaseModel<?> _productionCountryRemoteModel;
}