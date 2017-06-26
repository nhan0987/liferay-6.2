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

import vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentSpecificationConfigLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class AssessmentSpecificationConfigClp extends BaseModelImpl<AssessmentSpecificationConfig>
	implements AssessmentSpecificationConfig {
	public AssessmentSpecificationConfigClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return AssessmentSpecificationConfig.class;
	}

	@Override
	public String getModelClassName() {
		return AssessmentSpecificationConfig.class.getName();
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
		attributes.put("assessmenttype", getAssessmenttype());
		attributes.put("specificationcategory", getSpecificationcategory());
		attributes.put("specificationgroupcode", getSpecificationgroupcode());
		attributes.put("specificationsequence", getSpecificationsequence());
		attributes.put("specificationcode", getSpecificationcode());
		attributes.put("specificationname", getSpecificationname());
		attributes.put("specificationdescription", getSpecificationdescription());
		attributes.put("assessmentcoefficient", getAssessmentcoefficient());
		attributes.put("assessmentindexmin", getAssessmentindexmin());
		attributes.put("assessmentmarkmin", getAssessmentmarkmin());
		attributes.put("assessmentindexmax", getAssessmentindexmax());
		attributes.put("assessmentmarkmax", getAssessmentmarkmax());
		attributes.put("assessmentid", getAssessmentid());
		attributes.put("assessmentyear", getAssessmentyear());
		attributes.put("evaluationperiod", getEvaluationperiod());
		attributes.put("latestassessment", getLatestassessment());
		attributes.put("synchdate", getSynchdate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String assessmenttype = (String)attributes.get("assessmenttype");

		if (assessmenttype != null) {
			setAssessmenttype(assessmenttype);
		}

		String specificationcategory = (String)attributes.get(
				"specificationcategory");

		if (specificationcategory != null) {
			setSpecificationcategory(specificationcategory);
		}

		String specificationgroupcode = (String)attributes.get(
				"specificationgroupcode");

		if (specificationgroupcode != null) {
			setSpecificationgroupcode(specificationgroupcode);
		}

		Integer specificationsequence = (Integer)attributes.get(
				"specificationsequence");

		if (specificationsequence != null) {
			setSpecificationsequence(specificationsequence);
		}

		String specificationcode = (String)attributes.get("specificationcode");

		if (specificationcode != null) {
			setSpecificationcode(specificationcode);
		}

		String specificationname = (String)attributes.get("specificationname");

		if (specificationname != null) {
			setSpecificationname(specificationname);
		}

		String specificationdescription = (String)attributes.get(
				"specificationdescription");

		if (specificationdescription != null) {
			setSpecificationdescription(specificationdescription);
		}

		Double assessmentcoefficient = (Double)attributes.get(
				"assessmentcoefficient");

		if (assessmentcoefficient != null) {
			setAssessmentcoefficient(assessmentcoefficient);
		}

		Double assessmentindexmin = (Double)attributes.get("assessmentindexmin");

		if (assessmentindexmin != null) {
			setAssessmentindexmin(assessmentindexmin);
		}

		Double assessmentmarkmin = (Double)attributes.get("assessmentmarkmin");

		if (assessmentmarkmin != null) {
			setAssessmentmarkmin(assessmentmarkmin);
		}

		Double assessmentindexmax = (Double)attributes.get("assessmentindexmax");

		if (assessmentindexmax != null) {
			setAssessmentindexmax(assessmentindexmax);
		}

		Double assessmentmarkmax = (Double)attributes.get("assessmentmarkmax");

		if (assessmentmarkmax != null) {
			setAssessmentmarkmax(assessmentmarkmax);
		}

		String assessmentid = (String)attributes.get("assessmentid");

		if (assessmentid != null) {
			setAssessmentid(assessmentid);
		}

		String assessmentyear = (String)attributes.get("assessmentyear");

		if (assessmentyear != null) {
			setAssessmentyear(assessmentyear);
		}

		String evaluationperiod = (String)attributes.get("evaluationperiod");

		if (evaluationperiod != null) {
			setEvaluationperiod(evaluationperiod);
		}

		Date latestassessment = (Date)attributes.get("latestassessment");

		if (latestassessment != null) {
			setLatestassessment(latestassessment);
		}

		Date synchdate = (Date)attributes.get("synchdate");

		if (synchdate != null) {
			setSynchdate(synchdate);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_assessmentSpecificationConfigRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_assessmentSpecificationConfigRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAssessmenttype() {
		return _assessmenttype;
	}

	@Override
	public void setAssessmenttype(String assessmenttype) {
		_assessmenttype = assessmenttype;

		if (_assessmentSpecificationConfigRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setAssessmenttype",
						String.class);

				method.invoke(_assessmentSpecificationConfigRemoteModel,
					assessmenttype);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSpecificationcategory() {
		return _specificationcategory;
	}

	@Override
	public void setSpecificationcategory(String specificationcategory) {
		_specificationcategory = specificationcategory;

		if (_assessmentSpecificationConfigRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setSpecificationcategory",
						String.class);

				method.invoke(_assessmentSpecificationConfigRemoteModel,
					specificationcategory);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSpecificationgroupcode() {
		return _specificationgroupcode;
	}

	@Override
	public void setSpecificationgroupcode(String specificationgroupcode) {
		_specificationgroupcode = specificationgroupcode;

		if (_assessmentSpecificationConfigRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setSpecificationgroupcode",
						String.class);

				method.invoke(_assessmentSpecificationConfigRemoteModel,
					specificationgroupcode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSpecificationsequence() {
		return _specificationsequence;
	}

	@Override
	public void setSpecificationsequence(int specificationsequence) {
		_specificationsequence = specificationsequence;

		if (_assessmentSpecificationConfigRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setSpecificationsequence",
						int.class);

				method.invoke(_assessmentSpecificationConfigRemoteModel,
					specificationsequence);
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

		if (_assessmentSpecificationConfigRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setSpecificationcode",
						String.class);

				method.invoke(_assessmentSpecificationConfigRemoteModel,
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

		if (_assessmentSpecificationConfigRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setSpecificationname",
						String.class);

				method.invoke(_assessmentSpecificationConfigRemoteModel,
					specificationname);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSpecificationdescription() {
		return _specificationdescription;
	}

	@Override
	public void setSpecificationdescription(String specificationdescription) {
		_specificationdescription = specificationdescription;

		if (_assessmentSpecificationConfigRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setSpecificationdescription",
						String.class);

				method.invoke(_assessmentSpecificationConfigRemoteModel,
					specificationdescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getAssessmentcoefficient() {
		return _assessmentcoefficient;
	}

	@Override
	public void setAssessmentcoefficient(double assessmentcoefficient) {
		_assessmentcoefficient = assessmentcoefficient;

		if (_assessmentSpecificationConfigRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setAssessmentcoefficient",
						double.class);

				method.invoke(_assessmentSpecificationConfigRemoteModel,
					assessmentcoefficient);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getAssessmentindexmin() {
		return _assessmentindexmin;
	}

	@Override
	public void setAssessmentindexmin(double assessmentindexmin) {
		_assessmentindexmin = assessmentindexmin;

		if (_assessmentSpecificationConfigRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setAssessmentindexmin",
						double.class);

				method.invoke(_assessmentSpecificationConfigRemoteModel,
					assessmentindexmin);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getAssessmentmarkmin() {
		return _assessmentmarkmin;
	}

	@Override
	public void setAssessmentmarkmin(double assessmentmarkmin) {
		_assessmentmarkmin = assessmentmarkmin;

		if (_assessmentSpecificationConfigRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setAssessmentmarkmin",
						double.class);

				method.invoke(_assessmentSpecificationConfigRemoteModel,
					assessmentmarkmin);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getAssessmentindexmax() {
		return _assessmentindexmax;
	}

	@Override
	public void setAssessmentindexmax(double assessmentindexmax) {
		_assessmentindexmax = assessmentindexmax;

		if (_assessmentSpecificationConfigRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setAssessmentindexmax",
						double.class);

				method.invoke(_assessmentSpecificationConfigRemoteModel,
					assessmentindexmax);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getAssessmentmarkmax() {
		return _assessmentmarkmax;
	}

	@Override
	public void setAssessmentmarkmax(double assessmentmarkmax) {
		_assessmentmarkmax = assessmentmarkmax;

		if (_assessmentSpecificationConfigRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setAssessmentmarkmax",
						double.class);

				method.invoke(_assessmentSpecificationConfigRemoteModel,
					assessmentmarkmax);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAssessmentid() {
		return _assessmentid;
	}

	@Override
	public void setAssessmentid(String assessmentid) {
		_assessmentid = assessmentid;

		if (_assessmentSpecificationConfigRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setAssessmentid", String.class);

				method.invoke(_assessmentSpecificationConfigRemoteModel,
					assessmentid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAssessmentyear() {
		return _assessmentyear;
	}

	@Override
	public void setAssessmentyear(String assessmentyear) {
		_assessmentyear = assessmentyear;

		if (_assessmentSpecificationConfigRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setAssessmentyear",
						String.class);

				method.invoke(_assessmentSpecificationConfigRemoteModel,
					assessmentyear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEvaluationperiod() {
		return _evaluationperiod;
	}

	@Override
	public void setEvaluationperiod(String evaluationperiod) {
		_evaluationperiod = evaluationperiod;

		if (_assessmentSpecificationConfigRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setEvaluationperiod",
						String.class);

				method.invoke(_assessmentSpecificationConfigRemoteModel,
					evaluationperiod);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getLatestassessment() {
		return _latestassessment;
	}

	@Override
	public void setLatestassessment(Date latestassessment) {
		_latestassessment = latestassessment;

		if (_assessmentSpecificationConfigRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setLatestassessment",
						Date.class);

				method.invoke(_assessmentSpecificationConfigRemoteModel,
					latestassessment);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSynchdate() {
		return _synchdate;
	}

	@Override
	public void setSynchdate(Date synchdate) {
		_synchdate = synchdate;

		if (_assessmentSpecificationConfigRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setSynchdate", Date.class);

				method.invoke(_assessmentSpecificationConfigRemoteModel,
					synchdate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getAssessmentSpecificationConfigRemoteModel() {
		return _assessmentSpecificationConfigRemoteModel;
	}

	public void setAssessmentSpecificationConfigRemoteModel(
		BaseModel<?> assessmentSpecificationConfigRemoteModel) {
		_assessmentSpecificationConfigRemoteModel = assessmentSpecificationConfigRemoteModel;
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

		Class<?> remoteModelClass = _assessmentSpecificationConfigRemoteModel.getClass();

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

		Object returnValue = method.invoke(_assessmentSpecificationConfigRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AssessmentSpecificationConfigLocalServiceUtil.addAssessmentSpecificationConfig(this);
		}
		else {
			AssessmentSpecificationConfigLocalServiceUtil.updateAssessmentSpecificationConfig(this);
		}
	}

	@Override
	public AssessmentSpecificationConfig toEscapedModel() {
		return (AssessmentSpecificationConfig)ProxyUtil.newProxyInstance(AssessmentSpecificationConfig.class.getClassLoader(),
			new Class[] { AssessmentSpecificationConfig.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AssessmentSpecificationConfigClp clone = new AssessmentSpecificationConfigClp();

		clone.setId(getId());
		clone.setAssessmenttype(getAssessmenttype());
		clone.setSpecificationcategory(getSpecificationcategory());
		clone.setSpecificationgroupcode(getSpecificationgroupcode());
		clone.setSpecificationsequence(getSpecificationsequence());
		clone.setSpecificationcode(getSpecificationcode());
		clone.setSpecificationname(getSpecificationname());
		clone.setSpecificationdescription(getSpecificationdescription());
		clone.setAssessmentcoefficient(getAssessmentcoefficient());
		clone.setAssessmentindexmin(getAssessmentindexmin());
		clone.setAssessmentmarkmin(getAssessmentmarkmin());
		clone.setAssessmentindexmax(getAssessmentindexmax());
		clone.setAssessmentmarkmax(getAssessmentmarkmax());
		clone.setAssessmentid(getAssessmentid());
		clone.setAssessmentyear(getAssessmentyear());
		clone.setEvaluationperiod(getEvaluationperiod());
		clone.setLatestassessment(getLatestassessment());
		clone.setSynchdate(getSynchdate());

		return clone;
	}

	@Override
	public int compareTo(
		AssessmentSpecificationConfig assessmentSpecificationConfig) {
		int value = 0;

		if (getId() < assessmentSpecificationConfig.getId()) {
			value = -1;
		}
		else if (getId() > assessmentSpecificationConfig.getId()) {
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

		if (!(obj instanceof AssessmentSpecificationConfigClp)) {
			return false;
		}

		AssessmentSpecificationConfigClp assessmentSpecificationConfig = (AssessmentSpecificationConfigClp)obj;

		long primaryKey = assessmentSpecificationConfig.getPrimaryKey();

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
		StringBundler sb = new StringBundler(37);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", assessmenttype=");
		sb.append(getAssessmenttype());
		sb.append(", specificationcategory=");
		sb.append(getSpecificationcategory());
		sb.append(", specificationgroupcode=");
		sb.append(getSpecificationgroupcode());
		sb.append(", specificationsequence=");
		sb.append(getSpecificationsequence());
		sb.append(", specificationcode=");
		sb.append(getSpecificationcode());
		sb.append(", specificationname=");
		sb.append(getSpecificationname());
		sb.append(", specificationdescription=");
		sb.append(getSpecificationdescription());
		sb.append(", assessmentcoefficient=");
		sb.append(getAssessmentcoefficient());
		sb.append(", assessmentindexmin=");
		sb.append(getAssessmentindexmin());
		sb.append(", assessmentmarkmin=");
		sb.append(getAssessmentmarkmin());
		sb.append(", assessmentindexmax=");
		sb.append(getAssessmentindexmax());
		sb.append(", assessmentmarkmax=");
		sb.append(getAssessmentmarkmax());
		sb.append(", assessmentid=");
		sb.append(getAssessmentid());
		sb.append(", assessmentyear=");
		sb.append(getAssessmentyear());
		sb.append(", evaluationperiod=");
		sb.append(getEvaluationperiod());
		sb.append(", latestassessment=");
		sb.append(getLatestassessment());
		sb.append(", synchdate=");
		sb.append(getSynchdate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(58);

		sb.append("<model><model-name>");
		sb.append(
			"vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessmenttype</column-name><column-value><![CDATA[");
		sb.append(getAssessmenttype());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specificationcategory</column-name><column-value><![CDATA[");
		sb.append(getSpecificationcategory());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specificationgroupcode</column-name><column-value><![CDATA[");
		sb.append(getSpecificationgroupcode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specificationsequence</column-name><column-value><![CDATA[");
		sb.append(getSpecificationsequence());
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
			"<column><column-name>specificationdescription</column-name><column-value><![CDATA[");
		sb.append(getSpecificationdescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessmentcoefficient</column-name><column-value><![CDATA[");
		sb.append(getAssessmentcoefficient());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessmentindexmin</column-name><column-value><![CDATA[");
		sb.append(getAssessmentindexmin());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessmentmarkmin</column-name><column-value><![CDATA[");
		sb.append(getAssessmentmarkmin());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessmentindexmax</column-name><column-value><![CDATA[");
		sb.append(getAssessmentindexmax());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessmentmarkmax</column-name><column-value><![CDATA[");
		sb.append(getAssessmentmarkmax());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessmentid</column-name><column-value><![CDATA[");
		sb.append(getAssessmentid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessmentyear</column-name><column-value><![CDATA[");
		sb.append(getAssessmentyear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>evaluationperiod</column-name><column-value><![CDATA[");
		sb.append(getEvaluationperiod());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>latestassessment</column-name><column-value><![CDATA[");
		sb.append(getLatestassessment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>synchdate</column-name><column-value><![CDATA[");
		sb.append(getSynchdate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _assessmenttype;
	private String _specificationcategory;
	private String _specificationgroupcode;
	private int _specificationsequence;
	private String _specificationcode;
	private String _specificationname;
	private String _specificationdescription;
	private double _assessmentcoefficient;
	private double _assessmentindexmin;
	private double _assessmentmarkmin;
	private double _assessmentindexmax;
	private double _assessmentmarkmax;
	private String _assessmentid;
	private String _assessmentyear;
	private String _evaluationperiod;
	private Date _latestassessment;
	private Date _synchdate;
	private BaseModel<?> _assessmentSpecificationConfigRemoteModel;
}