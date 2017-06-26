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
import vn.dtt.gt.dk.dao.nghiepvu.service.IssueCategoryLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class IssueCategoryClp extends BaseModelImpl<IssueCategory>
	implements IssueCategory {
	public IssueCategoryClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return IssueCategory.class;
	}

	@Override
	public String getModelClassName() {
		return IssueCategory.class.getName();
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
		attributes.put("issuetrackingid", getIssuetrackingid());
		attributes.put("defectcategorycode", getDefectcategorycode());
		attributes.put("defectcategoryshortname", getDefectcategoryshortname());
		attributes.put("defectcategoryfullname", getDefectcategoryfullname());
		attributes.put("defectdetection", getDefectdetection());
		attributes.put("defectdatagroupid", getDefectdatagroupid());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer issuetrackingid = (Integer)attributes.get("issuetrackingid");

		if (issuetrackingid != null) {
			setIssuetrackingid(issuetrackingid);
		}

		String defectcategorycode = (String)attributes.get("defectcategorycode");

		if (defectcategorycode != null) {
			setDefectcategorycode(defectcategorycode);
		}

		String defectcategoryshortname = (String)attributes.get(
				"defectcategoryshortname");

		if (defectcategoryshortname != null) {
			setDefectcategoryshortname(defectcategoryshortname);
		}

		String defectcategoryfullname = (String)attributes.get(
				"defectcategoryfullname");

		if (defectcategoryfullname != null) {
			setDefectcategoryfullname(defectcategoryfullname);
		}

		Integer defectdetection = (Integer)attributes.get("defectdetection");

		if (defectdetection != null) {
			setDefectdetection(defectdetection);
		}

		Integer defectdatagroupid = (Integer)attributes.get("defectdatagroupid");

		if (defectdatagroupid != null) {
			setDefectdatagroupid(defectdatagroupid);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_issueCategoryRemoteModel != null) {
			try {
				Class<?> clazz = _issueCategoryRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_issueCategoryRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIssuetrackingid() {
		return _issuetrackingid;
	}

	@Override
	public void setIssuetrackingid(int issuetrackingid) {
		_issuetrackingid = issuetrackingid;

		if (_issueCategoryRemoteModel != null) {
			try {
				Class<?> clazz = _issueCategoryRemoteModel.getClass();

				Method method = clazz.getMethod("setIssuetrackingid", int.class);

				method.invoke(_issueCategoryRemoteModel, issuetrackingid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDefectcategorycode() {
		return _defectcategorycode;
	}

	@Override
	public void setDefectcategorycode(String defectcategorycode) {
		_defectcategorycode = defectcategorycode;

		if (_issueCategoryRemoteModel != null) {
			try {
				Class<?> clazz = _issueCategoryRemoteModel.getClass();

				Method method = clazz.getMethod("setDefectcategorycode",
						String.class);

				method.invoke(_issueCategoryRemoteModel, defectcategorycode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDefectcategoryshortname() {
		return _defectcategoryshortname;
	}

	@Override
	public void setDefectcategoryshortname(String defectcategoryshortname) {
		_defectcategoryshortname = defectcategoryshortname;

		if (_issueCategoryRemoteModel != null) {
			try {
				Class<?> clazz = _issueCategoryRemoteModel.getClass();

				Method method = clazz.getMethod("setDefectcategoryshortname",
						String.class);

				method.invoke(_issueCategoryRemoteModel, defectcategoryshortname);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDefectcategoryfullname() {
		return _defectcategoryfullname;
	}

	@Override
	public void setDefectcategoryfullname(String defectcategoryfullname) {
		_defectcategoryfullname = defectcategoryfullname;

		if (_issueCategoryRemoteModel != null) {
			try {
				Class<?> clazz = _issueCategoryRemoteModel.getClass();

				Method method = clazz.getMethod("setDefectcategoryfullname",
						String.class);

				method.invoke(_issueCategoryRemoteModel, defectcategoryfullname);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDefectdetection() {
		return _defectdetection;
	}

	@Override
	public void setDefectdetection(int defectdetection) {
		_defectdetection = defectdetection;

		if (_issueCategoryRemoteModel != null) {
			try {
				Class<?> clazz = _issueCategoryRemoteModel.getClass();

				Method method = clazz.getMethod("setDefectdetection", int.class);

				method.invoke(_issueCategoryRemoteModel, defectdetection);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDefectdatagroupid() {
		return _defectdatagroupid;
	}

	@Override
	public void setDefectdatagroupid(int defectdatagroupid) {
		_defectdatagroupid = defectdatagroupid;

		if (_issueCategoryRemoteModel != null) {
			try {
				Class<?> clazz = _issueCategoryRemoteModel.getClass();

				Method method = clazz.getMethod("setDefectdatagroupid",
						int.class);

				method.invoke(_issueCategoryRemoteModel, defectdatagroupid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getIssueCategoryRemoteModel() {
		return _issueCategoryRemoteModel;
	}

	public void setIssueCategoryRemoteModel(
		BaseModel<?> issueCategoryRemoteModel) {
		_issueCategoryRemoteModel = issueCategoryRemoteModel;
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

		Class<?> remoteModelClass = _issueCategoryRemoteModel.getClass();

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

		Object returnValue = method.invoke(_issueCategoryRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			IssueCategoryLocalServiceUtil.addIssueCategory(this);
		}
		else {
			IssueCategoryLocalServiceUtil.updateIssueCategory(this);
		}
	}

	@Override
	public IssueCategory toEscapedModel() {
		return (IssueCategory)ProxyUtil.newProxyInstance(IssueCategory.class.getClassLoader(),
			new Class[] { IssueCategory.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		IssueCategoryClp clone = new IssueCategoryClp();

		clone.setId(getId());
		clone.setIssuetrackingid(getIssuetrackingid());
		clone.setDefectcategorycode(getDefectcategorycode());
		clone.setDefectcategoryshortname(getDefectcategoryshortname());
		clone.setDefectcategoryfullname(getDefectcategoryfullname());
		clone.setDefectdetection(getDefectdetection());
		clone.setDefectdatagroupid(getDefectdatagroupid());

		return clone;
	}

	@Override
	public int compareTo(IssueCategory issueCategory) {
		int value = 0;

		if (getId() < issueCategory.getId()) {
			value = -1;
		}
		else if (getId() > issueCategory.getId()) {
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

		if (!(obj instanceof IssueCategoryClp)) {
			return false;
		}

		IssueCategoryClp issueCategory = (IssueCategoryClp)obj;

		long primaryKey = issueCategory.getPrimaryKey();

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
		sb.append(", issuetrackingid=");
		sb.append(getIssuetrackingid());
		sb.append(", defectcategorycode=");
		sb.append(getDefectcategorycode());
		sb.append(", defectcategoryshortname=");
		sb.append(getDefectcategoryshortname());
		sb.append(", defectcategoryfullname=");
		sb.append(getDefectcategoryfullname());
		sb.append(", defectdetection=");
		sb.append(getDefectdetection());
		sb.append(", defectdatagroupid=");
		sb.append(getDefectdatagroupid());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>issuetrackingid</column-name><column-value><![CDATA[");
		sb.append(getIssuetrackingid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>defectcategorycode</column-name><column-value><![CDATA[");
		sb.append(getDefectcategorycode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>defectcategoryshortname</column-name><column-value><![CDATA[");
		sb.append(getDefectcategoryshortname());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>defectcategoryfullname</column-name><column-value><![CDATA[");
		sb.append(getDefectcategoryfullname());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>defectdetection</column-name><column-value><![CDATA[");
		sb.append(getDefectdetection());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>defectdatagroupid</column-name><column-value><![CDATA[");
		sb.append(getDefectdatagroupid());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private int _issuetrackingid;
	private String _defectcategorycode;
	private String _defectcategoryshortname;
	private String _defectcategoryfullname;
	private int _defectdetection;
	private int _defectdatagroupid;
	private BaseModel<?> _issueCategoryRemoteModel;
}