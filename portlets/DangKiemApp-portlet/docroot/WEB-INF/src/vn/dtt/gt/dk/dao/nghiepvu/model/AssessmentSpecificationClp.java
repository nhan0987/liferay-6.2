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

import vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentSpecificationLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class AssessmentSpecificationClp extends BaseModelImpl<AssessmentSpecification>
	implements AssessmentSpecification {
	public AssessmentSpecificationClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return AssessmentSpecification.class;
	}

	@Override
	public String getModelClassName() {
		return AssessmentSpecification.class.getName();
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
		attributes.put("importercode", getImportercode());
		attributes.put("inspectorcontactcode", getInspectorcontactcode());
		attributes.put("productioncode", getProductioncode());
		attributes.put("specificationcategory", getSpecificationcategory());
		attributes.put("specificationgroupcode", getSpecificationgroupcode());
		attributes.put("specificationsequence", getSpecificationsequence());
		attributes.put("specificationcode", getSpecificationcode());
		attributes.put("specificationname", getSpecificationname());
		attributes.put("specificationvalue", getSpecificationvalue());
		attributes.put("specificationdescription", getSpecificationdescription());
		attributes.put("assessmentcoefficient", getAssessmentcoefficient());
		attributes.put("assessmentindex", getAssessmentindex());
		attributes.put("assessmentmark", getAssessmentmark());
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

		String importercode = (String)attributes.get("importercode");

		if (importercode != null) {
			setImportercode(importercode);
		}

		String inspectorcontactcode = (String)attributes.get(
				"inspectorcontactcode");

		if (inspectorcontactcode != null) {
			setInspectorcontactcode(inspectorcontactcode);
		}

		String productioncode = (String)attributes.get("productioncode");

		if (productioncode != null) {
			setProductioncode(productioncode);
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

		String specificationvalue = (String)attributes.get("specificationvalue");

		if (specificationvalue != null) {
			setSpecificationvalue(specificationvalue);
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

		Double assessmentindex = (Double)attributes.get("assessmentindex");

		if (assessmentindex != null) {
			setAssessmentindex(assessmentindex);
		}

		Double assessmentmark = (Double)attributes.get("assessmentmark");

		if (assessmentmark != null) {
			setAssessmentmark(assessmentmark);
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

		if (_assessmentSpecificationRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_assessmentSpecificationRemoteModel, id);
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

		if (_assessmentSpecificationRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationRemoteModel.getClass();

				Method method = clazz.getMethod("setAssessmenttype",
						String.class);

				method.invoke(_assessmentSpecificationRemoteModel,
					assessmenttype);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImportercode() {
		return _importercode;
	}

	@Override
	public void setImportercode(String importercode) {
		_importercode = importercode;

		if (_assessmentSpecificationRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationRemoteModel.getClass();

				Method method = clazz.getMethod("setImportercode", String.class);

				method.invoke(_assessmentSpecificationRemoteModel, importercode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectorcontactcode() {
		return _inspectorcontactcode;
	}

	@Override
	public void setInspectorcontactcode(String inspectorcontactcode) {
		_inspectorcontactcode = inspectorcontactcode;

		if (_assessmentSpecificationRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectorcontactcode",
						String.class);

				method.invoke(_assessmentSpecificationRemoteModel,
					inspectorcontactcode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProductioncode() {
		return _productioncode;
	}

	@Override
	public void setProductioncode(String productioncode) {
		_productioncode = productioncode;

		if (_assessmentSpecificationRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationRemoteModel.getClass();

				Method method = clazz.getMethod("setProductioncode",
						String.class);

				method.invoke(_assessmentSpecificationRemoteModel,
					productioncode);
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

		if (_assessmentSpecificationRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationRemoteModel.getClass();

				Method method = clazz.getMethod("setSpecificationcategory",
						String.class);

				method.invoke(_assessmentSpecificationRemoteModel,
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

		if (_assessmentSpecificationRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationRemoteModel.getClass();

				Method method = clazz.getMethod("setSpecificationgroupcode",
						String.class);

				method.invoke(_assessmentSpecificationRemoteModel,
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

		if (_assessmentSpecificationRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationRemoteModel.getClass();

				Method method = clazz.getMethod("setSpecificationsequence",
						int.class);

				method.invoke(_assessmentSpecificationRemoteModel,
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

		if (_assessmentSpecificationRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationRemoteModel.getClass();

				Method method = clazz.getMethod("setSpecificationcode",
						String.class);

				method.invoke(_assessmentSpecificationRemoteModel,
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

		if (_assessmentSpecificationRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationRemoteModel.getClass();

				Method method = clazz.getMethod("setSpecificationname",
						String.class);

				method.invoke(_assessmentSpecificationRemoteModel,
					specificationname);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSpecificationvalue() {
		return _specificationvalue;
	}

	@Override
	public void setSpecificationvalue(String specificationvalue) {
		_specificationvalue = specificationvalue;

		if (_assessmentSpecificationRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationRemoteModel.getClass();

				Method method = clazz.getMethod("setSpecificationvalue",
						String.class);

				method.invoke(_assessmentSpecificationRemoteModel,
					specificationvalue);
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

		if (_assessmentSpecificationRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationRemoteModel.getClass();

				Method method = clazz.getMethod("setSpecificationdescription",
						String.class);

				method.invoke(_assessmentSpecificationRemoteModel,
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

		if (_assessmentSpecificationRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationRemoteModel.getClass();

				Method method = clazz.getMethod("setAssessmentcoefficient",
						double.class);

				method.invoke(_assessmentSpecificationRemoteModel,
					assessmentcoefficient);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getAssessmentindex() {
		return _assessmentindex;
	}

	@Override
	public void setAssessmentindex(double assessmentindex) {
		_assessmentindex = assessmentindex;

		if (_assessmentSpecificationRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationRemoteModel.getClass();

				Method method = clazz.getMethod("setAssessmentindex",
						double.class);

				method.invoke(_assessmentSpecificationRemoteModel,
					assessmentindex);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getAssessmentmark() {
		return _assessmentmark;
	}

	@Override
	public void setAssessmentmark(double assessmentmark) {
		_assessmentmark = assessmentmark;

		if (_assessmentSpecificationRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationRemoteModel.getClass();

				Method method = clazz.getMethod("setAssessmentmark",
						double.class);

				method.invoke(_assessmentSpecificationRemoteModel,
					assessmentmark);
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

		if (_assessmentSpecificationRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationRemoteModel.getClass();

				Method method = clazz.getMethod("setAssessmentid", String.class);

				method.invoke(_assessmentSpecificationRemoteModel, assessmentid);
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

		if (_assessmentSpecificationRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationRemoteModel.getClass();

				Method method = clazz.getMethod("setAssessmentyear",
						String.class);

				method.invoke(_assessmentSpecificationRemoteModel,
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

		if (_assessmentSpecificationRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationRemoteModel.getClass();

				Method method = clazz.getMethod("setEvaluationperiod",
						String.class);

				method.invoke(_assessmentSpecificationRemoteModel,
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

		if (_assessmentSpecificationRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationRemoteModel.getClass();

				Method method = clazz.getMethod("setLatestassessment",
						Date.class);

				method.invoke(_assessmentSpecificationRemoteModel,
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

		if (_assessmentSpecificationRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentSpecificationRemoteModel.getClass();

				Method method = clazz.getMethod("setSynchdate", Date.class);

				method.invoke(_assessmentSpecificationRemoteModel, synchdate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getAssessmentSpecificationRemoteModel() {
		return _assessmentSpecificationRemoteModel;
	}

	public void setAssessmentSpecificationRemoteModel(
		BaseModel<?> assessmentSpecificationRemoteModel) {
		_assessmentSpecificationRemoteModel = assessmentSpecificationRemoteModel;
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

		Class<?> remoteModelClass = _assessmentSpecificationRemoteModel.getClass();

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

		Object returnValue = method.invoke(_assessmentSpecificationRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AssessmentSpecificationLocalServiceUtil.addAssessmentSpecification(this);
		}
		else {
			AssessmentSpecificationLocalServiceUtil.updateAssessmentSpecification(this);
		}
	}

	@Override
	public AssessmentSpecification toEscapedModel() {
		return (AssessmentSpecification)ProxyUtil.newProxyInstance(AssessmentSpecification.class.getClassLoader(),
			new Class[] { AssessmentSpecification.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AssessmentSpecificationClp clone = new AssessmentSpecificationClp();

		clone.setId(getId());
		clone.setAssessmenttype(getAssessmenttype());
		clone.setImportercode(getImportercode());
		clone.setInspectorcontactcode(getInspectorcontactcode());
		clone.setProductioncode(getProductioncode());
		clone.setSpecificationcategory(getSpecificationcategory());
		clone.setSpecificationgroupcode(getSpecificationgroupcode());
		clone.setSpecificationsequence(getSpecificationsequence());
		clone.setSpecificationcode(getSpecificationcode());
		clone.setSpecificationname(getSpecificationname());
		clone.setSpecificationvalue(getSpecificationvalue());
		clone.setSpecificationdescription(getSpecificationdescription());
		clone.setAssessmentcoefficient(getAssessmentcoefficient());
		clone.setAssessmentindex(getAssessmentindex());
		clone.setAssessmentmark(getAssessmentmark());
		clone.setAssessmentid(getAssessmentid());
		clone.setAssessmentyear(getAssessmentyear());
		clone.setEvaluationperiod(getEvaluationperiod());
		clone.setLatestassessment(getLatestassessment());
		clone.setSynchdate(getSynchdate());

		return clone;
	}

	@Override
	public int compareTo(AssessmentSpecification assessmentSpecification) {
		int value = 0;

		if (getId() < assessmentSpecification.getId()) {
			value = -1;
		}
		else if (getId() > assessmentSpecification.getId()) {
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

		if (!(obj instanceof AssessmentSpecificationClp)) {
			return false;
		}

		AssessmentSpecificationClp assessmentSpecification = (AssessmentSpecificationClp)obj;

		long primaryKey = assessmentSpecification.getPrimaryKey();

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
		StringBundler sb = new StringBundler(41);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", assessmenttype=");
		sb.append(getAssessmenttype());
		sb.append(", importercode=");
		sb.append(getImportercode());
		sb.append(", inspectorcontactcode=");
		sb.append(getInspectorcontactcode());
		sb.append(", productioncode=");
		sb.append(getProductioncode());
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
		sb.append(", specificationvalue=");
		sb.append(getSpecificationvalue());
		sb.append(", specificationdescription=");
		sb.append(getSpecificationdescription());
		sb.append(", assessmentcoefficient=");
		sb.append(getAssessmentcoefficient());
		sb.append(", assessmentindex=");
		sb.append(getAssessmentindex());
		sb.append(", assessmentmark=");
		sb.append(getAssessmentmark());
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
		StringBundler sb = new StringBundler(64);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification");
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
			"<column><column-name>importercode</column-name><column-value><![CDATA[");
		sb.append(getImportercode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorcontactcode</column-name><column-value><![CDATA[");
		sb.append(getInspectorcontactcode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productioncode</column-name><column-value><![CDATA[");
		sb.append(getProductioncode());
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
			"<column><column-name>specificationvalue</column-name><column-value><![CDATA[");
		sb.append(getSpecificationvalue());
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
			"<column><column-name>assessmentindex</column-name><column-value><![CDATA[");
		sb.append(getAssessmentindex());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessmentmark</column-name><column-value><![CDATA[");
		sb.append(getAssessmentmark());
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
	private String _importercode;
	private String _inspectorcontactcode;
	private String _productioncode;
	private String _specificationcategory;
	private String _specificationgroupcode;
	private int _specificationsequence;
	private String _specificationcode;
	private String _specificationname;
	private String _specificationvalue;
	private String _specificationdescription;
	private double _assessmentcoefficient;
	private double _assessmentindex;
	private double _assessmentmark;
	private String _assessmentid;
	private String _assessmentyear;
	private String _evaluationperiod;
	private Date _latestassessment;
	private Date _synchdate;
	private BaseModel<?> _assessmentSpecificationRemoteModel;
}