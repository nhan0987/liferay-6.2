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
import vn.dtt.gt.dk.dao.nghiepvu.service.ExchangeRateLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author huymq
 */
public class ExchangeRateClp extends BaseModelImpl<ExchangeRate>
	implements ExchangeRate {
	public ExchangeRateClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ExchangeRate.class;
	}

	@Override
	public String getModelClassName() {
		return ExchangeRate.class.getName();
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
		attributes.put("originalCurrency", getOriginalCurrency());
		attributes.put("basicCurrency", getBasicCurrency());
		attributes.put("exchangeRate", getExchangeRate());
		attributes.put("publishDate", getPublishDate());
		attributes.put("validFrom", getValidFrom());
		attributes.put("validUntil", getValidUntil());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String originalCurrency = (String)attributes.get("originalCurrency");

		if (originalCurrency != null) {
			setOriginalCurrency(originalCurrency);
		}

		String basicCurrency = (String)attributes.get("basicCurrency");

		if (basicCurrency != null) {
			setBasicCurrency(basicCurrency);
		}

		Double exchangeRate = (Double)attributes.get("exchangeRate");

		if (exchangeRate != null) {
			setExchangeRate(exchangeRate);
		}

		Date publishDate = (Date)attributes.get("publishDate");

		if (publishDate != null) {
			setPublishDate(publishDate);
		}

		Date validFrom = (Date)attributes.get("validFrom");

		if (validFrom != null) {
			setValidFrom(validFrom);
		}

		Date validUntil = (Date)attributes.get("validUntil");

		if (validUntil != null) {
			setValidUntil(validUntil);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_exchangeRateRemoteModel != null) {
			try {
				Class<?> clazz = _exchangeRateRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_exchangeRateRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOriginalCurrency() {
		return _originalCurrency;
	}

	@Override
	public void setOriginalCurrency(String originalCurrency) {
		_originalCurrency = originalCurrency;

		if (_exchangeRateRemoteModel != null) {
			try {
				Class<?> clazz = _exchangeRateRemoteModel.getClass();

				Method method = clazz.getMethod("setOriginalCurrency",
						String.class);

				method.invoke(_exchangeRateRemoteModel, originalCurrency);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBasicCurrency() {
		return _basicCurrency;
	}

	@Override
	public void setBasicCurrency(String basicCurrency) {
		_basicCurrency = basicCurrency;

		if (_exchangeRateRemoteModel != null) {
			try {
				Class<?> clazz = _exchangeRateRemoteModel.getClass();

				Method method = clazz.getMethod("setBasicCurrency", String.class);

				method.invoke(_exchangeRateRemoteModel, basicCurrency);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getExchangeRate() {
		return _exchangeRate;
	}

	@Override
	public void setExchangeRate(double exchangeRate) {
		_exchangeRate = exchangeRate;

		if (_exchangeRateRemoteModel != null) {
			try {
				Class<?> clazz = _exchangeRateRemoteModel.getClass();

				Method method = clazz.getMethod("setExchangeRate", double.class);

				method.invoke(_exchangeRateRemoteModel, exchangeRate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getPublishDate() {
		return _publishDate;
	}

	@Override
	public void setPublishDate(Date publishDate) {
		_publishDate = publishDate;

		if (_exchangeRateRemoteModel != null) {
			try {
				Class<?> clazz = _exchangeRateRemoteModel.getClass();

				Method method = clazz.getMethod("setPublishDate", Date.class);

				method.invoke(_exchangeRateRemoteModel, publishDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getValidFrom() {
		return _validFrom;
	}

	@Override
	public void setValidFrom(Date validFrom) {
		_validFrom = validFrom;

		if (_exchangeRateRemoteModel != null) {
			try {
				Class<?> clazz = _exchangeRateRemoteModel.getClass();

				Method method = clazz.getMethod("setValidFrom", Date.class);

				method.invoke(_exchangeRateRemoteModel, validFrom);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getValidUntil() {
		return _validUntil;
	}

	@Override
	public void setValidUntil(Date validUntil) {
		_validUntil = validUntil;

		if (_exchangeRateRemoteModel != null) {
			try {
				Class<?> clazz = _exchangeRateRemoteModel.getClass();

				Method method = clazz.getMethod("setValidUntil", Date.class);

				method.invoke(_exchangeRateRemoteModel, validUntil);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getExchangeRateRemoteModel() {
		return _exchangeRateRemoteModel;
	}

	public void setExchangeRateRemoteModel(BaseModel<?> exchangeRateRemoteModel) {
		_exchangeRateRemoteModel = exchangeRateRemoteModel;
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

		Class<?> remoteModelClass = _exchangeRateRemoteModel.getClass();

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

		Object returnValue = method.invoke(_exchangeRateRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ExchangeRateLocalServiceUtil.addExchangeRate(this);
		}
		else {
			ExchangeRateLocalServiceUtil.updateExchangeRate(this);
		}
	}

	@Override
	public ExchangeRate toEscapedModel() {
		return (ExchangeRate)ProxyUtil.newProxyInstance(ExchangeRate.class.getClassLoader(),
			new Class[] { ExchangeRate.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ExchangeRateClp clone = new ExchangeRateClp();

		clone.setId(getId());
		clone.setOriginalCurrency(getOriginalCurrency());
		clone.setBasicCurrency(getBasicCurrency());
		clone.setExchangeRate(getExchangeRate());
		clone.setPublishDate(getPublishDate());
		clone.setValidFrom(getValidFrom());
		clone.setValidUntil(getValidUntil());

		return clone;
	}

	@Override
	public int compareTo(ExchangeRate exchangeRate) {
		int value = 0;

		if (getId() < exchangeRate.getId()) {
			value = -1;
		}
		else if (getId() > exchangeRate.getId()) {
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

		if (!(obj instanceof ExchangeRateClp)) {
			return false;
		}

		ExchangeRateClp exchangeRate = (ExchangeRateClp)obj;

		long primaryKey = exchangeRate.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", originalCurrency=");
		sb.append(getOriginalCurrency());
		sb.append(", basicCurrency=");
		sb.append(getBasicCurrency());
		sb.append(", exchangeRate=");
		sb.append(getExchangeRate());
		sb.append(", publishDate=");
		sb.append(getPublishDate());
		sb.append(", validFrom=");
		sb.append(getValidFrom());
		sb.append(", validUntil=");
		sb.append(getValidUntil());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>originalCurrency</column-name><column-value><![CDATA[");
		sb.append(getOriginalCurrency());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>basicCurrency</column-name><column-value><![CDATA[");
		sb.append(getBasicCurrency());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>exchangeRate</column-name><column-value><![CDATA[");
		sb.append(getExchangeRate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>publishDate</column-name><column-value><![CDATA[");
		sb.append(getPublishDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>validFrom</column-name><column-value><![CDATA[");
		sb.append(getValidFrom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>validUntil</column-name><column-value><![CDATA[");
		sb.append(getValidUntil());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _originalCurrency;
	private String _basicCurrency;
	private double _exchangeRate;
	private Date _publishDate;
	private Date _validFrom;
	private Date _validUntil;
	private BaseModel<?> _exchangeRateRemoteModel;
}