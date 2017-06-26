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

import vn.dtt.gt.dk.dao.nghiepvu.service.CfgLimitTechnicalSpecLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class CfgLimitTechnicalSpecClp extends BaseModelImpl<CfgLimitTechnicalSpec>
	implements CfgLimitTechnicalSpec {
	public CfgLimitTechnicalSpecClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return CfgLimitTechnicalSpec.class;
	}

	@Override
	public String getModelClassName() {
		return CfgLimitTechnicalSpec.class.getName();
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
		attributes.put("vehicletypecode", getVehicletypecode());
		attributes.put("vehicletypename", getVehicletypename());
		attributes.put("reference_code_3", getReference_code_3());
		attributes.put("reference_name", getReference_name());
		attributes.put("searching_drive_config", getSearching_drive_config());
		attributes.put("altername", getAltername());
		attributes.put("sequenceno", getSequenceno());
		attributes.put("specificationcode", getSpecificationcode());
		attributes.put("specificationname", getSpecificationname());
		attributes.put("spec_description", getSpec_description());
		attributes.put("spec_category", getSpec_category());
		attributes.put("datagroupid", getDatagroupid());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String vehicletypecode = (String)attributes.get("vehicletypecode");

		if (vehicletypecode != null) {
			setVehicletypecode(vehicletypecode);
		}

		String vehicletypename = (String)attributes.get("vehicletypename");

		if (vehicletypename != null) {
			setVehicletypename(vehicletypename);
		}

		String reference_code_3 = (String)attributes.get("reference_code_3");

		if (reference_code_3 != null) {
			setReference_code_3(reference_code_3);
		}

		String reference_name = (String)attributes.get("reference_name");

		if (reference_name != null) {
			setReference_name(reference_name);
		}

		Integer searching_drive_config = (Integer)attributes.get(
				"searching_drive_config");

		if (searching_drive_config != null) {
			setSearching_drive_config(searching_drive_config);
		}

		String altername = (String)attributes.get("altername");

		if (altername != null) {
			setAltername(altername);
		}

		Integer sequenceno = (Integer)attributes.get("sequenceno");

		if (sequenceno != null) {
			setSequenceno(sequenceno);
		}

		String specificationcode = (String)attributes.get("specificationcode");

		if (specificationcode != null) {
			setSpecificationcode(specificationcode);
		}

		String specificationname = (String)attributes.get("specificationname");

		if (specificationname != null) {
			setSpecificationname(specificationname);
		}

		String spec_description = (String)attributes.get("spec_description");

		if (spec_description != null) {
			setSpec_description(spec_description);
		}

		String spec_category = (String)attributes.get("spec_category");

		if (spec_category != null) {
			setSpec_category(spec_category);
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

		if (_cfgLimitTechnicalSpecRemoteModel != null) {
			try {
				Class<?> clazz = _cfgLimitTechnicalSpecRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_cfgLimitTechnicalSpecRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVehicletypecode() {
		return _vehicletypecode;
	}

	@Override
	public void setVehicletypecode(String vehicletypecode) {
		_vehicletypecode = vehicletypecode;

		if (_cfgLimitTechnicalSpecRemoteModel != null) {
			try {
				Class<?> clazz = _cfgLimitTechnicalSpecRemoteModel.getClass();

				Method method = clazz.getMethod("setVehicletypecode",
						String.class);

				method.invoke(_cfgLimitTechnicalSpecRemoteModel, vehicletypecode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVehicletypename() {
		return _vehicletypename;
	}

	@Override
	public void setVehicletypename(String vehicletypename) {
		_vehicletypename = vehicletypename;

		if (_cfgLimitTechnicalSpecRemoteModel != null) {
			try {
				Class<?> clazz = _cfgLimitTechnicalSpecRemoteModel.getClass();

				Method method = clazz.getMethod("setVehicletypename",
						String.class);

				method.invoke(_cfgLimitTechnicalSpecRemoteModel, vehicletypename);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReference_code_3() {
		return _reference_code_3;
	}

	@Override
	public void setReference_code_3(String reference_code_3) {
		_reference_code_3 = reference_code_3;

		if (_cfgLimitTechnicalSpecRemoteModel != null) {
			try {
				Class<?> clazz = _cfgLimitTechnicalSpecRemoteModel.getClass();

				Method method = clazz.getMethod("setReference_code_3",
						String.class);

				method.invoke(_cfgLimitTechnicalSpecRemoteModel,
					reference_code_3);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReference_name() {
		return _reference_name;
	}

	@Override
	public void setReference_name(String reference_name) {
		_reference_name = reference_name;

		if (_cfgLimitTechnicalSpecRemoteModel != null) {
			try {
				Class<?> clazz = _cfgLimitTechnicalSpecRemoteModel.getClass();

				Method method = clazz.getMethod("setReference_name",
						String.class);

				method.invoke(_cfgLimitTechnicalSpecRemoteModel, reference_name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSearching_drive_config() {
		return _searching_drive_config;
	}

	@Override
	public void setSearching_drive_config(int searching_drive_config) {
		_searching_drive_config = searching_drive_config;

		if (_cfgLimitTechnicalSpecRemoteModel != null) {
			try {
				Class<?> clazz = _cfgLimitTechnicalSpecRemoteModel.getClass();

				Method method = clazz.getMethod("setSearching_drive_config",
						int.class);

				method.invoke(_cfgLimitTechnicalSpecRemoteModel,
					searching_drive_config);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAltername() {
		return _altername;
	}

	@Override
	public void setAltername(String altername) {
		_altername = altername;

		if (_cfgLimitTechnicalSpecRemoteModel != null) {
			try {
				Class<?> clazz = _cfgLimitTechnicalSpecRemoteModel.getClass();

				Method method = clazz.getMethod("setAltername", String.class);

				method.invoke(_cfgLimitTechnicalSpecRemoteModel, altername);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSequenceno() {
		return _sequenceno;
	}

	@Override
	public void setSequenceno(int sequenceno) {
		_sequenceno = sequenceno;

		if (_cfgLimitTechnicalSpecRemoteModel != null) {
			try {
				Class<?> clazz = _cfgLimitTechnicalSpecRemoteModel.getClass();

				Method method = clazz.getMethod("setSequenceno", int.class);

				method.invoke(_cfgLimitTechnicalSpecRemoteModel, sequenceno);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSpecificationcode() {
		return _specificationcode;
	}

	@Override
	public void setSpecificationcode(String specificationcode) {
		_specificationcode = specificationcode;

		if (_cfgLimitTechnicalSpecRemoteModel != null) {
			try {
				Class<?> clazz = _cfgLimitTechnicalSpecRemoteModel.getClass();

				Method method = clazz.getMethod("setSpecificationcode",
						String.class);

				method.invoke(_cfgLimitTechnicalSpecRemoteModel,
					specificationcode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSpecificationname() {
		return _specificationname;
	}

	@Override
	public void setSpecificationname(String specificationname) {
		_specificationname = specificationname;

		if (_cfgLimitTechnicalSpecRemoteModel != null) {
			try {
				Class<?> clazz = _cfgLimitTechnicalSpecRemoteModel.getClass();

				Method method = clazz.getMethod("setSpecificationname",
						String.class);

				method.invoke(_cfgLimitTechnicalSpecRemoteModel,
					specificationname);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSpec_description() {
		return _spec_description;
	}

	@Override
	public void setSpec_description(String spec_description) {
		_spec_description = spec_description;

		if (_cfgLimitTechnicalSpecRemoteModel != null) {
			try {
				Class<?> clazz = _cfgLimitTechnicalSpecRemoteModel.getClass();

				Method method = clazz.getMethod("setSpec_description",
						String.class);

				method.invoke(_cfgLimitTechnicalSpecRemoteModel,
					spec_description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSpec_category() {
		return _spec_category;
	}

	@Override
	public void setSpec_category(String spec_category) {
		_spec_category = spec_category;

		if (_cfgLimitTechnicalSpecRemoteModel != null) {
			try {
				Class<?> clazz = _cfgLimitTechnicalSpecRemoteModel.getClass();

				Method method = clazz.getMethod("setSpec_category", String.class);

				method.invoke(_cfgLimitTechnicalSpecRemoteModel, spec_category);
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

		if (_cfgLimitTechnicalSpecRemoteModel != null) {
			try {
				Class<?> clazz = _cfgLimitTechnicalSpecRemoteModel.getClass();

				Method method = clazz.getMethod("setDatagroupid", long.class);

				method.invoke(_cfgLimitTechnicalSpecRemoteModel, datagroupid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCfgLimitTechnicalSpecRemoteModel() {
		return _cfgLimitTechnicalSpecRemoteModel;
	}

	public void setCfgLimitTechnicalSpecRemoteModel(
		BaseModel<?> cfgLimitTechnicalSpecRemoteModel) {
		_cfgLimitTechnicalSpecRemoteModel = cfgLimitTechnicalSpecRemoteModel;
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

		Class<?> remoteModelClass = _cfgLimitTechnicalSpecRemoteModel.getClass();

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

		Object returnValue = method.invoke(_cfgLimitTechnicalSpecRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CfgLimitTechnicalSpecLocalServiceUtil.addCfgLimitTechnicalSpec(this);
		}
		else {
			CfgLimitTechnicalSpecLocalServiceUtil.updateCfgLimitTechnicalSpec(this);
		}
	}

	@Override
	public CfgLimitTechnicalSpec toEscapedModel() {
		return (CfgLimitTechnicalSpec)ProxyUtil.newProxyInstance(CfgLimitTechnicalSpec.class.getClassLoader(),
			new Class[] { CfgLimitTechnicalSpec.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CfgLimitTechnicalSpecClp clone = new CfgLimitTechnicalSpecClp();

		clone.setId(getId());
		clone.setVehicletypecode(getVehicletypecode());
		clone.setVehicletypename(getVehicletypename());
		clone.setReference_code_3(getReference_code_3());
		clone.setReference_name(getReference_name());
		clone.setSearching_drive_config(getSearching_drive_config());
		clone.setAltername(getAltername());
		clone.setSequenceno(getSequenceno());
		clone.setSpecificationcode(getSpecificationcode());
		clone.setSpecificationname(getSpecificationname());
		clone.setSpec_description(getSpec_description());
		clone.setSpec_category(getSpec_category());
		clone.setDatagroupid(getDatagroupid());

		return clone;
	}

	@Override
	public int compareTo(CfgLimitTechnicalSpec cfgLimitTechnicalSpec) {
		int value = 0;

		if (getSequenceno() < cfgLimitTechnicalSpec.getSequenceno()) {
			value = -1;
		}
		else if (getSequenceno() > cfgLimitTechnicalSpec.getSequenceno()) {
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

		if (!(obj instanceof CfgLimitTechnicalSpecClp)) {
			return false;
		}

		CfgLimitTechnicalSpecClp cfgLimitTechnicalSpec = (CfgLimitTechnicalSpecClp)obj;

		long primaryKey = cfgLimitTechnicalSpec.getPrimaryKey();

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
		StringBundler sb = new StringBundler(27);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", vehicletypecode=");
		sb.append(getVehicletypecode());
		sb.append(", vehicletypename=");
		sb.append(getVehicletypename());
		sb.append(", reference_code_3=");
		sb.append(getReference_code_3());
		sb.append(", reference_name=");
		sb.append(getReference_name());
		sb.append(", searching_drive_config=");
		sb.append(getSearching_drive_config());
		sb.append(", altername=");
		sb.append(getAltername());
		sb.append(", sequenceno=");
		sb.append(getSequenceno());
		sb.append(", specificationcode=");
		sb.append(getSpecificationcode());
		sb.append(", specificationname=");
		sb.append(getSpecificationname());
		sb.append(", spec_description=");
		sb.append(getSpec_description());
		sb.append(", spec_category=");
		sb.append(getSpec_category());
		sb.append(", datagroupid=");
		sb.append(getDatagroupid());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicletypecode</column-name><column-value><![CDATA[");
		sb.append(getVehicletypecode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicletypename</column-name><column-value><![CDATA[");
		sb.append(getVehicletypename());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reference_code_3</column-name><column-value><![CDATA[");
		sb.append(getReference_code_3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reference_name</column-name><column-value><![CDATA[");
		sb.append(getReference_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>searching_drive_config</column-name><column-value><![CDATA[");
		sb.append(getSearching_drive_config());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>altername</column-name><column-value><![CDATA[");
		sb.append(getAltername());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sequenceno</column-name><column-value><![CDATA[");
		sb.append(getSequenceno());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specificationcode</column-name><column-value><![CDATA[");
		sb.append(getSpecificationcode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specificationname</column-name><column-value><![CDATA[");
		sb.append(getSpecificationname());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>spec_description</column-name><column-value><![CDATA[");
		sb.append(getSpec_description());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>spec_category</column-name><column-value><![CDATA[");
		sb.append(getSpec_category());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>datagroupid</column-name><column-value><![CDATA[");
		sb.append(getDatagroupid());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _vehicletypecode;
	private String _vehicletypename;
	private String _reference_code_3;
	private String _reference_name;
	private int _searching_drive_config;
	private String _altername;
	private int _sequenceno;
	private String _specificationcode;
	private String _specificationname;
	private String _spec_description;
	private String _spec_category;
	private long _datagroupid;
	private BaseModel<?> _cfgLimitTechnicalSpecRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.class;
}