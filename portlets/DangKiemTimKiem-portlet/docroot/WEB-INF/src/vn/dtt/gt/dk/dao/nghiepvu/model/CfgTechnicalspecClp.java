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

import vn.dtt.gt.dk.dao.nghiepvu.service.CfgTechnicalspecLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class CfgTechnicalspecClp extends BaseModelImpl<CfgTechnicalspec>
	implements CfgTechnicalspec {
	public CfgTechnicalspecClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return CfgTechnicalspec.class;
	}

	@Override
	public String getModelClassName() {
		return CfgTechnicalspec.class.getName();
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
		attributes.put("vehicleTypeCode", getVehicleTypeCode());
		attributes.put("vehicleTypeName", getVehicleTypeName());
		attributes.put("sequenceno", getSequenceno());
		attributes.put("specificationCode", getSpecificationCode());
		attributes.put("specificationName", getSpecificationName());
		attributes.put("specDescription", getSpecDescription());
		attributes.put("specCategory", getSpecCategory());
		attributes.put("specificationGroup", getSpecificationGroup());
		attributes.put("searchingIncluded", getSearchingIncluded());
		attributes.put("referenceIncluded", getReferenceIncluded());
		attributes.put("certificateIncluded", getCertificateIncluded());
		attributes.put("datagroupid", getDatagroupid());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String vehicleTypeCode = (String)attributes.get("vehicleTypeCode");

		if (vehicleTypeCode != null) {
			setVehicleTypeCode(vehicleTypeCode);
		}

		String vehicleTypeName = (String)attributes.get("vehicleTypeName");

		if (vehicleTypeName != null) {
			setVehicleTypeName(vehicleTypeName);
		}

		Long sequenceno = (Long)attributes.get("sequenceno");

		if (sequenceno != null) {
			setSequenceno(sequenceno);
		}

		String specificationCode = (String)attributes.get("specificationCode");

		if (specificationCode != null) {
			setSpecificationCode(specificationCode);
		}

		String specificationName = (String)attributes.get("specificationName");

		if (specificationName != null) {
			setSpecificationName(specificationName);
		}

		String specDescription = (String)attributes.get("specDescription");

		if (specDescription != null) {
			setSpecDescription(specDescription);
		}

		String specCategory = (String)attributes.get("specCategory");

		if (specCategory != null) {
			setSpecCategory(specCategory);
		}

		Long specificationGroup = (Long)attributes.get("specificationGroup");

		if (specificationGroup != null) {
			setSpecificationGroup(specificationGroup);
		}

		Long searchingIncluded = (Long)attributes.get("searchingIncluded");

		if (searchingIncluded != null) {
			setSearchingIncluded(searchingIncluded);
		}

		Long referenceIncluded = (Long)attributes.get("referenceIncluded");

		if (referenceIncluded != null) {
			setReferenceIncluded(referenceIncluded);
		}

		Long certificateIncluded = (Long)attributes.get("certificateIncluded");

		if (certificateIncluded != null) {
			setCertificateIncluded(certificateIncluded);
		}

		Long datagroupid = (Long)attributes.get("datagroupid");

		if (datagroupid != null) {
			setDatagroupid(datagroupid);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_cfgTechnicalspecRemoteModel != null) {
			try {
				Class<?> clazz = _cfgTechnicalspecRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_cfgTechnicalspecRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVehicleTypeCode() {
		return _vehicleTypeCode;
	}

	@Override
	public void setVehicleTypeCode(String vehicleTypeCode) {
		_vehicleTypeCode = vehicleTypeCode;

		if (_cfgTechnicalspecRemoteModel != null) {
			try {
				Class<?> clazz = _cfgTechnicalspecRemoteModel.getClass();

				Method method = clazz.getMethod("setVehicleTypeCode",
						String.class);

				method.invoke(_cfgTechnicalspecRemoteModel, vehicleTypeCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVehicleTypeName() {
		return _vehicleTypeName;
	}

	@Override
	public void setVehicleTypeName(String vehicleTypeName) {
		_vehicleTypeName = vehicleTypeName;

		if (_cfgTechnicalspecRemoteModel != null) {
			try {
				Class<?> clazz = _cfgTechnicalspecRemoteModel.getClass();

				Method method = clazz.getMethod("setVehicleTypeName",
						String.class);

				method.invoke(_cfgTechnicalspecRemoteModel, vehicleTypeName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSequenceno() {
		return _sequenceno;
	}

	@Override
	public void setSequenceno(long sequenceno) {
		_sequenceno = sequenceno;

		if (_cfgTechnicalspecRemoteModel != null) {
			try {
				Class<?> clazz = _cfgTechnicalspecRemoteModel.getClass();

				Method method = clazz.getMethod("setSequenceno", long.class);

				method.invoke(_cfgTechnicalspecRemoteModel, sequenceno);
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

		if (_cfgTechnicalspecRemoteModel != null) {
			try {
				Class<?> clazz = _cfgTechnicalspecRemoteModel.getClass();

				Method method = clazz.getMethod("setSpecificationCode",
						String.class);

				method.invoke(_cfgTechnicalspecRemoteModel, specificationCode);
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

		if (_cfgTechnicalspecRemoteModel != null) {
			try {
				Class<?> clazz = _cfgTechnicalspecRemoteModel.getClass();

				Method method = clazz.getMethod("setSpecificationName",
						String.class);

				method.invoke(_cfgTechnicalspecRemoteModel, specificationName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSpecDescription() {
		return _specDescription;
	}

	@Override
	public void setSpecDescription(String specDescription) {
		_specDescription = specDescription;

		if (_cfgTechnicalspecRemoteModel != null) {
			try {
				Class<?> clazz = _cfgTechnicalspecRemoteModel.getClass();

				Method method = clazz.getMethod("setSpecDescription",
						String.class);

				method.invoke(_cfgTechnicalspecRemoteModel, specDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSpecCategory() {
		return _specCategory;
	}

	@Override
	public void setSpecCategory(String specCategory) {
		_specCategory = specCategory;

		if (_cfgTechnicalspecRemoteModel != null) {
			try {
				Class<?> clazz = _cfgTechnicalspecRemoteModel.getClass();

				Method method = clazz.getMethod("setSpecCategory", String.class);

				method.invoke(_cfgTechnicalspecRemoteModel, specCategory);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSpecificationGroup() {
		return _specificationGroup;
	}

	@Override
	public void setSpecificationGroup(long specificationGroup) {
		_specificationGroup = specificationGroup;

		if (_cfgTechnicalspecRemoteModel != null) {
			try {
				Class<?> clazz = _cfgTechnicalspecRemoteModel.getClass();

				Method method = clazz.getMethod("setSpecificationGroup",
						long.class);

				method.invoke(_cfgTechnicalspecRemoteModel, specificationGroup);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSearchingIncluded() {
		return _searchingIncluded;
	}

	@Override
	public void setSearchingIncluded(long searchingIncluded) {
		_searchingIncluded = searchingIncluded;

		if (_cfgTechnicalspecRemoteModel != null) {
			try {
				Class<?> clazz = _cfgTechnicalspecRemoteModel.getClass();

				Method method = clazz.getMethod("setSearchingIncluded",
						long.class);

				method.invoke(_cfgTechnicalspecRemoteModel, searchingIncluded);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getReferenceIncluded() {
		return _referenceIncluded;
	}

	@Override
	public void setReferenceIncluded(long referenceIncluded) {
		_referenceIncluded = referenceIncluded;

		if (_cfgTechnicalspecRemoteModel != null) {
			try {
				Class<?> clazz = _cfgTechnicalspecRemoteModel.getClass();

				Method method = clazz.getMethod("setReferenceIncluded",
						long.class);

				method.invoke(_cfgTechnicalspecRemoteModel, referenceIncluded);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCertificateIncluded() {
		return _certificateIncluded;
	}

	@Override
	public void setCertificateIncluded(long certificateIncluded) {
		_certificateIncluded = certificateIncluded;

		if (_cfgTechnicalspecRemoteModel != null) {
			try {
				Class<?> clazz = _cfgTechnicalspecRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateIncluded",
						long.class);

				method.invoke(_cfgTechnicalspecRemoteModel, certificateIncluded);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDatagroupid() {
		return _datagroupid;
	}

	@Override
	public void setDatagroupid(long datagroupid) {
		_datagroupid = datagroupid;

		if (_cfgTechnicalspecRemoteModel != null) {
			try {
				Class<?> clazz = _cfgTechnicalspecRemoteModel.getClass();

				Method method = clazz.getMethod("setDatagroupid", long.class);

				method.invoke(_cfgTechnicalspecRemoteModel, datagroupid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCfgTechnicalspecRemoteModel() {
		return _cfgTechnicalspecRemoteModel;
	}

	public void setCfgTechnicalspecRemoteModel(
		BaseModel<?> cfgTechnicalspecRemoteModel) {
		_cfgTechnicalspecRemoteModel = cfgTechnicalspecRemoteModel;
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

		Class<?> remoteModelClass = _cfgTechnicalspecRemoteModel.getClass();

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

		Object returnValue = method.invoke(_cfgTechnicalspecRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CfgTechnicalspecLocalServiceUtil.addCfgTechnicalspec(this);
		}
		else {
			CfgTechnicalspecLocalServiceUtil.updateCfgTechnicalspec(this);
		}
	}

	@Override
	public CfgTechnicalspec toEscapedModel() {
		return (CfgTechnicalspec)ProxyUtil.newProxyInstance(CfgTechnicalspec.class.getClassLoader(),
			new Class[] { CfgTechnicalspec.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CfgTechnicalspecClp clone = new CfgTechnicalspecClp();

		clone.setId(getId());
		clone.setVehicleTypeCode(getVehicleTypeCode());
		clone.setVehicleTypeName(getVehicleTypeName());
		clone.setSequenceno(getSequenceno());
		clone.setSpecificationCode(getSpecificationCode());
		clone.setSpecificationName(getSpecificationName());
		clone.setSpecDescription(getSpecDescription());
		clone.setSpecCategory(getSpecCategory());
		clone.setSpecificationGroup(getSpecificationGroup());
		clone.setSearchingIncluded(getSearchingIncluded());
		clone.setReferenceIncluded(getReferenceIncluded());
		clone.setCertificateIncluded(getCertificateIncluded());
		clone.setDatagroupid(getDatagroupid());

		return clone;
	}

	@Override
	public int compareTo(CfgTechnicalspec cfgTechnicalspec) {
		int value = 0;

		if (getId() < cfgTechnicalspec.getId()) {
			value = -1;
		}
		else if (getId() > cfgTechnicalspec.getId()) {
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

		if (!(obj instanceof CfgTechnicalspecClp)) {
			return false;
		}

		CfgTechnicalspecClp cfgTechnicalspec = (CfgTechnicalspecClp)obj;

		long primaryKey = cfgTechnicalspec.getPrimaryKey();

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
		StringBundler sb = new StringBundler(27);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", vehicleTypeCode=");
		sb.append(getVehicleTypeCode());
		sb.append(", vehicleTypeName=");
		sb.append(getVehicleTypeName());
		sb.append(", sequenceno=");
		sb.append(getSequenceno());
		sb.append(", specificationCode=");
		sb.append(getSpecificationCode());
		sb.append(", specificationName=");
		sb.append(getSpecificationName());
		sb.append(", specDescription=");
		sb.append(getSpecDescription());
		sb.append(", specCategory=");
		sb.append(getSpecCategory());
		sb.append(", specificationGroup=");
		sb.append(getSpecificationGroup());
		sb.append(", searchingIncluded=");
		sb.append(getSearchingIncluded());
		sb.append(", referenceIncluded=");
		sb.append(getReferenceIncluded());
		sb.append(", certificateIncluded=");
		sb.append(getCertificateIncluded());
		sb.append(", datagroupid=");
		sb.append(getDatagroupid());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicleTypeCode</column-name><column-value><![CDATA[");
		sb.append(getVehicleTypeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicleTypeName</column-name><column-value><![CDATA[");
		sb.append(getVehicleTypeName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sequenceno</column-name><column-value><![CDATA[");
		sb.append(getSequenceno());
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
			"<column><column-name>specDescription</column-name><column-value><![CDATA[");
		sb.append(getSpecDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specCategory</column-name><column-value><![CDATA[");
		sb.append(getSpecCategory());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specificationGroup</column-name><column-value><![CDATA[");
		sb.append(getSpecificationGroup());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>searchingIncluded</column-name><column-value><![CDATA[");
		sb.append(getSearchingIncluded());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>referenceIncluded</column-name><column-value><![CDATA[");
		sb.append(getReferenceIncluded());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateIncluded</column-name><column-value><![CDATA[");
		sb.append(getCertificateIncluded());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>datagroupid</column-name><column-value><![CDATA[");
		sb.append(getDatagroupid());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _vehicleTypeCode;
	private String _vehicleTypeName;
	private long _sequenceno;
	private String _specificationCode;
	private String _specificationName;
	private String _specDescription;
	private String _specCategory;
	private long _specificationGroup;
	private long _searchingIncluded;
	private long _referenceIncluded;
	private long _certificateIncluded;
	private long _datagroupid;
	private BaseModel<?> _cfgTechnicalspecRemoteModel;
}