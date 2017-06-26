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

import vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentPeriodLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class AssessmentPeriodClp extends BaseModelImpl<AssessmentPeriod>
	implements AssessmentPeriod {
	public AssessmentPeriodClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return AssessmentPeriod.class;
	}

	@Override
	public String getModelClassName() {
		return AssessmentPeriod.class.getName();
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
		attributes.put("assessmentid", getAssessmentid());
		attributes.put("assessmentyear", getAssessmentyear());
		attributes.put("evaluationperiod", getEvaluationperiod());
		attributes.put("importerchecked", getImporterchecked());
		attributes.put("inspectorchecked", getInspectorchecked());
		attributes.put("productionchecked", getProductionchecked());
		attributes.put("synchdate", getSynchdate());
		attributes.put("previousassessmentid", getPreviousassessmentid());
		attributes.put("previousassessmentyear", getPreviousassessmentyear());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
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

		Integer importerchecked = (Integer)attributes.get("importerchecked");

		if (importerchecked != null) {
			setImporterchecked(importerchecked);
		}

		Integer inspectorchecked = (Integer)attributes.get("inspectorchecked");

		if (inspectorchecked != null) {
			setInspectorchecked(inspectorchecked);
		}

		Integer productionchecked = (Integer)attributes.get("productionchecked");

		if (productionchecked != null) {
			setProductionchecked(productionchecked);
		}

		Date synchdate = (Date)attributes.get("synchdate");

		if (synchdate != null) {
			setSynchdate(synchdate);
		}

		String previousassessmentid = (String)attributes.get(
				"previousassessmentid");

		if (previousassessmentid != null) {
			setPreviousassessmentid(previousassessmentid);
		}

		String previousassessmentyear = (String)attributes.get(
				"previousassessmentyear");

		if (previousassessmentyear != null) {
			setPreviousassessmentyear(previousassessmentyear);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_assessmentPeriodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentPeriodRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_assessmentPeriodRemoteModel, id);
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

		if (_assessmentPeriodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentPeriodRemoteModel.getClass();

				Method method = clazz.getMethod("setAssessmentid", String.class);

				method.invoke(_assessmentPeriodRemoteModel, assessmentid);
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

		if (_assessmentPeriodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentPeriodRemoteModel.getClass();

				Method method = clazz.getMethod("setAssessmentyear",
						String.class);

				method.invoke(_assessmentPeriodRemoteModel, assessmentyear);
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

		if (_assessmentPeriodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentPeriodRemoteModel.getClass();

				Method method = clazz.getMethod("setEvaluationperiod",
						String.class);

				method.invoke(_assessmentPeriodRemoteModel, evaluationperiod);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getImporterchecked() {
		return _importerchecked;
	}

	@Override
	public void setImporterchecked(int importerchecked) {
		_importerchecked = importerchecked;

		if (_assessmentPeriodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentPeriodRemoteModel.getClass();

				Method method = clazz.getMethod("setImporterchecked", int.class);

				method.invoke(_assessmentPeriodRemoteModel, importerchecked);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getInspectorchecked() {
		return _inspectorchecked;
	}

	@Override
	public void setInspectorchecked(int inspectorchecked) {
		_inspectorchecked = inspectorchecked;

		if (_assessmentPeriodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentPeriodRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectorchecked", int.class);

				method.invoke(_assessmentPeriodRemoteModel, inspectorchecked);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getProductionchecked() {
		return _productionchecked;
	}

	@Override
	public void setProductionchecked(int productionchecked) {
		_productionchecked = productionchecked;

		if (_assessmentPeriodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentPeriodRemoteModel.getClass();

				Method method = clazz.getMethod("setProductionchecked",
						int.class);

				method.invoke(_assessmentPeriodRemoteModel, productionchecked);
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

		if (_assessmentPeriodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentPeriodRemoteModel.getClass();

				Method method = clazz.getMethod("setSynchdate", Date.class);

				method.invoke(_assessmentPeriodRemoteModel, synchdate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPreviousassessmentid() {
		return _previousassessmentid;
	}

	@Override
	public void setPreviousassessmentid(String previousassessmentid) {
		_previousassessmentid = previousassessmentid;

		if (_assessmentPeriodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentPeriodRemoteModel.getClass();

				Method method = clazz.getMethod("setPreviousassessmentid",
						String.class);

				method.invoke(_assessmentPeriodRemoteModel, previousassessmentid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPreviousassessmentyear() {
		return _previousassessmentyear;
	}

	@Override
	public void setPreviousassessmentyear(String previousassessmentyear) {
		_previousassessmentyear = previousassessmentyear;

		if (_assessmentPeriodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentPeriodRemoteModel.getClass();

				Method method = clazz.getMethod("setPreviousassessmentyear",
						String.class);

				method.invoke(_assessmentPeriodRemoteModel,
					previousassessmentyear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getAssessmentPeriodRemoteModel() {
		return _assessmentPeriodRemoteModel;
	}

	public void setAssessmentPeriodRemoteModel(
		BaseModel<?> assessmentPeriodRemoteModel) {
		_assessmentPeriodRemoteModel = assessmentPeriodRemoteModel;
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

		Class<?> remoteModelClass = _assessmentPeriodRemoteModel.getClass();

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

		Object returnValue = method.invoke(_assessmentPeriodRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AssessmentPeriodLocalServiceUtil.addAssessmentPeriod(this);
		}
		else {
			AssessmentPeriodLocalServiceUtil.updateAssessmentPeriod(this);
		}
	}

	@Override
	public AssessmentPeriod toEscapedModel() {
		return (AssessmentPeriod)ProxyUtil.newProxyInstance(AssessmentPeriod.class.getClassLoader(),
			new Class[] { AssessmentPeriod.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AssessmentPeriodClp clone = new AssessmentPeriodClp();

		clone.setId(getId());
		clone.setAssessmentid(getAssessmentid());
		clone.setAssessmentyear(getAssessmentyear());
		clone.setEvaluationperiod(getEvaluationperiod());
		clone.setImporterchecked(getImporterchecked());
		clone.setInspectorchecked(getInspectorchecked());
		clone.setProductionchecked(getProductionchecked());
		clone.setSynchdate(getSynchdate());
		clone.setPreviousassessmentid(getPreviousassessmentid());
		clone.setPreviousassessmentyear(getPreviousassessmentyear());

		return clone;
	}

	@Override
	public int compareTo(AssessmentPeriod assessmentPeriod) {
		int value = 0;

		if (getId() < assessmentPeriod.getId()) {
			value = -1;
		}
		else if (getId() > assessmentPeriod.getId()) {
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

		if (!(obj instanceof AssessmentPeriodClp)) {
			return false;
		}

		AssessmentPeriodClp assessmentPeriod = (AssessmentPeriodClp)obj;

		long primaryKey = assessmentPeriod.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", assessmentid=");
		sb.append(getAssessmentid());
		sb.append(", assessmentyear=");
		sb.append(getAssessmentyear());
		sb.append(", evaluationperiod=");
		sb.append(getEvaluationperiod());
		sb.append(", importerchecked=");
		sb.append(getImporterchecked());
		sb.append(", inspectorchecked=");
		sb.append(getInspectorchecked());
		sb.append(", productionchecked=");
		sb.append(getProductionchecked());
		sb.append(", synchdate=");
		sb.append(getSynchdate());
		sb.append(", previousassessmentid=");
		sb.append(getPreviousassessmentid());
		sb.append(", previousassessmentyear=");
		sb.append(getPreviousassessmentyear());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
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
			"<column><column-name>importerchecked</column-name><column-value><![CDATA[");
		sb.append(getImporterchecked());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorchecked</column-name><column-value><![CDATA[");
		sb.append(getInspectorchecked());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productionchecked</column-name><column-value><![CDATA[");
		sb.append(getProductionchecked());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>synchdate</column-name><column-value><![CDATA[");
		sb.append(getSynchdate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>previousassessmentid</column-name><column-value><![CDATA[");
		sb.append(getPreviousassessmentid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>previousassessmentyear</column-name><column-value><![CDATA[");
		sb.append(getPreviousassessmentyear());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _assessmentid;
	private String _assessmentyear;
	private String _evaluationperiod;
	private int _importerchecked;
	private int _inspectorchecked;
	private int _productionchecked;
	private Date _synchdate;
	private String _previousassessmentid;
	private String _previousassessmentyear;
	private BaseModel<?> _assessmentPeriodRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.class;
}