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

package vn.dtt.gt.dk.dao.aswmsg.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AswmsgWebservice}.
 * </p>
 *
 * @author win_64
 * @see AswmsgWebservice
 * @generated
 */
public class AswmsgWebserviceWrapper implements AswmsgWebservice,
	ModelWrapper<AswmsgWebservice> {
	public AswmsgWebserviceWrapper(AswmsgWebservice aswmsgWebservice) {
		_aswmsgWebservice = aswmsgWebservice;
	}

	@Override
	public Class<?> getModelClass() {
		return AswmsgWebservice.class;
	}

	@Override
	public String getModelClassName() {
		return AswmsgWebservice.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("ServiceCode", getServiceCode());
		attributes.put("ServiceName", getServiceName());
		attributes.put("ServiceURL", getServiceURL());
		attributes.put("UserName", getUserName());
		attributes.put("Password", getPassword());
		attributes.put("Domain", getDomain());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String ServiceCode = (String)attributes.get("ServiceCode");

		if (ServiceCode != null) {
			setServiceCode(ServiceCode);
		}

		String ServiceName = (String)attributes.get("ServiceName");

		if (ServiceName != null) {
			setServiceName(ServiceName);
		}

		String ServiceURL = (String)attributes.get("ServiceURL");

		if (ServiceURL != null) {
			setServiceURL(ServiceURL);
		}

		String UserName = (String)attributes.get("UserName");

		if (UserName != null) {
			setUserName(UserName);
		}

		String Password = (String)attributes.get("Password");

		if (Password != null) {
			setPassword(Password);
		}

		String Domain = (String)attributes.get("Domain");

		if (Domain != null) {
			setDomain(Domain);
		}
	}

	/**
	* Returns the primary key of this aswmsg webservice.
	*
	* @return the primary key of this aswmsg webservice
	*/
	@Override
	public long getPrimaryKey() {
		return _aswmsgWebservice.getPrimaryKey();
	}

	/**
	* Sets the primary key of this aswmsg webservice.
	*
	* @param primaryKey the primary key of this aswmsg webservice
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_aswmsgWebservice.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this aswmsg webservice.
	*
	* @return the ID of this aswmsg webservice
	*/
	@Override
	public long getId() {
		return _aswmsgWebservice.getId();
	}

	/**
	* Sets the ID of this aswmsg webservice.
	*
	* @param Id the ID of this aswmsg webservice
	*/
	@Override
	public void setId(long Id) {
		_aswmsgWebservice.setId(Id);
	}

	/**
	* Returns the service code of this aswmsg webservice.
	*
	* @return the service code of this aswmsg webservice
	*/
	@Override
	public java.lang.String getServiceCode() {
		return _aswmsgWebservice.getServiceCode();
	}

	/**
	* Sets the service code of this aswmsg webservice.
	*
	* @param ServiceCode the service code of this aswmsg webservice
	*/
	@Override
	public void setServiceCode(java.lang.String ServiceCode) {
		_aswmsgWebservice.setServiceCode(ServiceCode);
	}

	/**
	* Returns the service name of this aswmsg webservice.
	*
	* @return the service name of this aswmsg webservice
	*/
	@Override
	public java.lang.String getServiceName() {
		return _aswmsgWebservice.getServiceName();
	}

	/**
	* Sets the service name of this aswmsg webservice.
	*
	* @param ServiceName the service name of this aswmsg webservice
	*/
	@Override
	public void setServiceName(java.lang.String ServiceName) {
		_aswmsgWebservice.setServiceName(ServiceName);
	}

	/**
	* Returns the service u r l of this aswmsg webservice.
	*
	* @return the service u r l of this aswmsg webservice
	*/
	@Override
	public java.lang.String getServiceURL() {
		return _aswmsgWebservice.getServiceURL();
	}

	/**
	* Sets the service u r l of this aswmsg webservice.
	*
	* @param ServiceURL the service u r l of this aswmsg webservice
	*/
	@Override
	public void setServiceURL(java.lang.String ServiceURL) {
		_aswmsgWebservice.setServiceURL(ServiceURL);
	}

	/**
	* Returns the user name of this aswmsg webservice.
	*
	* @return the user name of this aswmsg webservice
	*/
	@Override
	public java.lang.String getUserName() {
		return _aswmsgWebservice.getUserName();
	}

	/**
	* Sets the user name of this aswmsg webservice.
	*
	* @param UserName the user name of this aswmsg webservice
	*/
	@Override
	public void setUserName(java.lang.String UserName) {
		_aswmsgWebservice.setUserName(UserName);
	}

	/**
	* Returns the password of this aswmsg webservice.
	*
	* @return the password of this aswmsg webservice
	*/
	@Override
	public java.lang.String getPassword() {
		return _aswmsgWebservice.getPassword();
	}

	/**
	* Sets the password of this aswmsg webservice.
	*
	* @param Password the password of this aswmsg webservice
	*/
	@Override
	public void setPassword(java.lang.String Password) {
		_aswmsgWebservice.setPassword(Password);
	}

	/**
	* Returns the domain of this aswmsg webservice.
	*
	* @return the domain of this aswmsg webservice
	*/
	@Override
	public java.lang.String getDomain() {
		return _aswmsgWebservice.getDomain();
	}

	/**
	* Sets the domain of this aswmsg webservice.
	*
	* @param Domain the domain of this aswmsg webservice
	*/
	@Override
	public void setDomain(java.lang.String Domain) {
		_aswmsgWebservice.setDomain(Domain);
	}

	@Override
	public boolean isNew() {
		return _aswmsgWebservice.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_aswmsgWebservice.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _aswmsgWebservice.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_aswmsgWebservice.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _aswmsgWebservice.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _aswmsgWebservice.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_aswmsgWebservice.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _aswmsgWebservice.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_aswmsgWebservice.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_aswmsgWebservice.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_aswmsgWebservice.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AswmsgWebserviceWrapper((AswmsgWebservice)_aswmsgWebservice.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.aswmsg.model.AswmsgWebservice aswmsgWebservice) {
		return _aswmsgWebservice.compareTo(aswmsgWebservice);
	}

	@Override
	public int hashCode() {
		return _aswmsgWebservice.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgWebservice> toCacheModel() {
		return _aswmsgWebservice.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgWebservice toEscapedModel() {
		return new AswmsgWebserviceWrapper(_aswmsgWebservice.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgWebservice toUnescapedModel() {
		return new AswmsgWebserviceWrapper(_aswmsgWebservice.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _aswmsgWebservice.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _aswmsgWebservice.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_aswmsgWebservice.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AswmsgWebserviceWrapper)) {
			return false;
		}

		AswmsgWebserviceWrapper aswmsgWebserviceWrapper = (AswmsgWebserviceWrapper)obj;

		if (Validator.equals(_aswmsgWebservice,
					aswmsgWebserviceWrapper._aswmsgWebservice)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public AswmsgWebservice getWrappedAswmsgWebservice() {
		return _aswmsgWebservice;
	}

	@Override
	public AswmsgWebservice getWrappedModel() {
		return _aswmsgWebservice;
	}

	@Override
	public void resetOriginalValues() {
		_aswmsgWebservice.resetOriginalValues();
	}

	private AswmsgWebservice _aswmsgWebservice;
}