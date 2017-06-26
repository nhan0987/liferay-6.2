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

package vn.dtt.gt.dk.dao.api.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Api}.
 * </p>
 *
 * @author huymq
 * @see Api
 * @generated
 */
public class ApiWrapper implements Api, ModelWrapper<Api> {
	public ApiWrapper(Api api) {
		_api = api;
	}

	@Override
	public Class<?> getModelClass() {
		return Api.class;
	}

	@Override
	public String getModelClassName() {
		return Api.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("userAgent", getUserAgent());
		attributes.put("ip", getIp());
		attributes.put("code", getCode());
		attributes.put("registeredNumber", getRegisteredNumber());
		attributes.put("request", getRequest());
		attributes.put("response", getResponse());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String userAgent = (String)attributes.get("userAgent");

		if (userAgent != null) {
			setUserAgent(userAgent);
		}

		String ip = (String)attributes.get("ip");

		if (ip != null) {
			setIp(ip);
		}

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
		}

		String registeredNumber = (String)attributes.get("registeredNumber");

		if (registeredNumber != null) {
			setRegisteredNumber(registeredNumber);
		}

		String request = (String)attributes.get("request");

		if (request != null) {
			setRequest(request);
		}

		String response = (String)attributes.get("response");

		if (response != null) {
			setResponse(response);
		}
	}

	/**
	* Returns the primary key of this api.
	*
	* @return the primary key of this api
	*/
	@Override
	public long getPrimaryKey() {
		return _api.getPrimaryKey();
	}

	/**
	* Sets the primary key of this api.
	*
	* @param primaryKey the primary key of this api
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_api.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this api.
	*
	* @return the ID of this api
	*/
	@Override
	public long getId() {
		return _api.getId();
	}

	/**
	* Sets the ID of this api.
	*
	* @param id the ID of this api
	*/
	@Override
	public void setId(long id) {
		_api.setId(id);
	}

	/**
	* Returns the create date of this api.
	*
	* @return the create date of this api
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _api.getCreateDate();
	}

	/**
	* Sets the create date of this api.
	*
	* @param createDate the create date of this api
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_api.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this api.
	*
	* @return the modified date of this api
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _api.getModifiedDate();
	}

	/**
	* Sets the modified date of this api.
	*
	* @param modifiedDate the modified date of this api
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_api.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the user agent of this api.
	*
	* @return the user agent of this api
	*/
	@Override
	public java.lang.String getUserAgent() {
		return _api.getUserAgent();
	}

	/**
	* Sets the user agent of this api.
	*
	* @param userAgent the user agent of this api
	*/
	@Override
	public void setUserAgent(java.lang.String userAgent) {
		_api.setUserAgent(userAgent);
	}

	/**
	* Returns the ip of this api.
	*
	* @return the ip of this api
	*/
	@Override
	public java.lang.String getIp() {
		return _api.getIp();
	}

	/**
	* Sets the ip of this api.
	*
	* @param ip the ip of this api
	*/
	@Override
	public void setIp(java.lang.String ip) {
		_api.setIp(ip);
	}

	/**
	* Returns the code of this api.
	*
	* @return the code of this api
	*/
	@Override
	public java.lang.String getCode() {
		return _api.getCode();
	}

	/**
	* Sets the code of this api.
	*
	* @param code the code of this api
	*/
	@Override
	public void setCode(java.lang.String code) {
		_api.setCode(code);
	}

	/**
	* Returns the registered number of this api.
	*
	* @return the registered number of this api
	*/
	@Override
	public java.lang.String getRegisteredNumber() {
		return _api.getRegisteredNumber();
	}

	/**
	* Sets the registered number of this api.
	*
	* @param registeredNumber the registered number of this api
	*/
	@Override
	public void setRegisteredNumber(java.lang.String registeredNumber) {
		_api.setRegisteredNumber(registeredNumber);
	}

	/**
	* Returns the request of this api.
	*
	* @return the request of this api
	*/
	@Override
	public java.lang.String getRequest() {
		return _api.getRequest();
	}

	/**
	* Sets the request of this api.
	*
	* @param request the request of this api
	*/
	@Override
	public void setRequest(java.lang.String request) {
		_api.setRequest(request);
	}

	/**
	* Returns the response of this api.
	*
	* @return the response of this api
	*/
	@Override
	public java.lang.String getResponse() {
		return _api.getResponse();
	}

	/**
	* Sets the response of this api.
	*
	* @param response the response of this api
	*/
	@Override
	public void setResponse(java.lang.String response) {
		_api.setResponse(response);
	}

	@Override
	public boolean isNew() {
		return _api.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_api.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _api.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_api.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _api.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _api.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_api.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _api.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_api.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_api.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_api.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ApiWrapper((Api)_api.clone());
	}

	@Override
	public int compareTo(vn.dtt.gt.dk.dao.api.model.Api api) {
		return _api.compareTo(api);
	}

	@Override
	public int hashCode() {
		return _api.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.api.model.Api> toCacheModel() {
		return _api.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.api.model.Api toEscapedModel() {
		return new ApiWrapper(_api.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.api.model.Api toUnescapedModel() {
		return new ApiWrapper(_api.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _api.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _api.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_api.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ApiWrapper)) {
			return false;
		}

		ApiWrapper apiWrapper = (ApiWrapper)obj;

		if (Validator.equals(_api, apiWrapper._api)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Api getWrappedApi() {
		return _api;
	}

	@Override
	public Api getWrappedModel() {
		return _api;
	}

	@Override
	public void resetOriginalValues() {
		_api.resetOriginalValues();
	}

	private Api _api;
}