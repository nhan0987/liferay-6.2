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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link InspectionRecordSpec}.
 * </p>
 *
 * @author huymq
 * @see InspectionRecordSpec
 * @generated
 */
public class InspectionRecordSpecWrapper implements InspectionRecordSpec,
	ModelWrapper<InspectionRecordSpec> {
	public InspectionRecordSpecWrapper(
		InspectionRecordSpec inspectionRecordSpec) {
		_inspectionRecordSpec = inspectionRecordSpec;
	}

	@Override
	public Class<?> getModelClass() {
		return InspectionRecordSpec.class;
	}

	@Override
	public String getModelClassName() {
		return InspectionRecordSpec.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("inspectionRecordid", getInspectionRecordid());
		attributes.put("specificationCode", getSpecificationCode());
		attributes.put("specificationName", getSpecificationName());
		attributes.put("specificationValue", getSpecificationValue());
		attributes.put("evaluationResult", getEvaluationResult());
		attributes.put("synchdate", getSynchdate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long inspectionRecordid = (Long)attributes.get("inspectionRecordid");

		if (inspectionRecordid != null) {
			setInspectionRecordid(inspectionRecordid);
		}

		String specificationCode = (String)attributes.get("specificationCode");

		if (specificationCode != null) {
			setSpecificationCode(specificationCode);
		}

		String specificationName = (String)attributes.get("specificationName");

		if (specificationName != null) {
			setSpecificationName(specificationName);
		}

		String specificationValue = (String)attributes.get("specificationValue");

		if (specificationValue != null) {
			setSpecificationValue(specificationValue);
		}

		Long evaluationResult = (Long)attributes.get("evaluationResult");

		if (evaluationResult != null) {
			setEvaluationResult(evaluationResult);
		}

		Date synchdate = (Date)attributes.get("synchdate");

		if (synchdate != null) {
			setSynchdate(synchdate);
		}
	}

	/**
	* Returns the primary key of this inspection record spec.
	*
	* @return the primary key of this inspection record spec
	*/
	@Override
	public long getPrimaryKey() {
		return _inspectionRecordSpec.getPrimaryKey();
	}

	/**
	* Sets the primary key of this inspection record spec.
	*
	* @param primaryKey the primary key of this inspection record spec
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_inspectionRecordSpec.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this inspection record spec.
	*
	* @return the ID of this inspection record spec
	*/
	@Override
	public long getId() {
		return _inspectionRecordSpec.getId();
	}

	/**
	* Sets the ID of this inspection record spec.
	*
	* @param id the ID of this inspection record spec
	*/
	@Override
	public void setId(long id) {
		_inspectionRecordSpec.setId(id);
	}

	/**
	* Returns the inspection recordid of this inspection record spec.
	*
	* @return the inspection recordid of this inspection record spec
	*/
	@Override
	public long getInspectionRecordid() {
		return _inspectionRecordSpec.getInspectionRecordid();
	}

	/**
	* Sets the inspection recordid of this inspection record spec.
	*
	* @param inspectionRecordid the inspection recordid of this inspection record spec
	*/
	@Override
	public void setInspectionRecordid(long inspectionRecordid) {
		_inspectionRecordSpec.setInspectionRecordid(inspectionRecordid);
	}

	/**
	* Returns the specification code of this inspection record spec.
	*
	* @return the specification code of this inspection record spec
	*/
	@Override
	public java.lang.String getSpecificationCode() {
		return _inspectionRecordSpec.getSpecificationCode();
	}

	/**
	* Sets the specification code of this inspection record spec.
	*
	* @param specificationCode the specification code of this inspection record spec
	*/
	@Override
	public void setSpecificationCode(java.lang.String specificationCode) {
		_inspectionRecordSpec.setSpecificationCode(specificationCode);
	}

	/**
	* Returns the specification name of this inspection record spec.
	*
	* @return the specification name of this inspection record spec
	*/
	@Override
	public java.lang.String getSpecificationName() {
		return _inspectionRecordSpec.getSpecificationName();
	}

	/**
	* Sets the specification name of this inspection record spec.
	*
	* @param specificationName the specification name of this inspection record spec
	*/
	@Override
	public void setSpecificationName(java.lang.String specificationName) {
		_inspectionRecordSpec.setSpecificationName(specificationName);
	}

	/**
	* Returns the specification value of this inspection record spec.
	*
	* @return the specification value of this inspection record spec
	*/
	@Override
	public java.lang.String getSpecificationValue() {
		return _inspectionRecordSpec.getSpecificationValue();
	}

	/**
	* Sets the specification value of this inspection record spec.
	*
	* @param specificationValue the specification value of this inspection record spec
	*/
	@Override
	public void setSpecificationValue(java.lang.String specificationValue) {
		_inspectionRecordSpec.setSpecificationValue(specificationValue);
	}

	/**
	* Returns the evaluation result of this inspection record spec.
	*
	* @return the evaluation result of this inspection record spec
	*/
	@Override
	public long getEvaluationResult() {
		return _inspectionRecordSpec.getEvaluationResult();
	}

	/**
	* Sets the evaluation result of this inspection record spec.
	*
	* @param evaluationResult the evaluation result of this inspection record spec
	*/
	@Override
	public void setEvaluationResult(long evaluationResult) {
		_inspectionRecordSpec.setEvaluationResult(evaluationResult);
	}

	/**
	* Returns the synchdate of this inspection record spec.
	*
	* @return the synchdate of this inspection record spec
	*/
	@Override
	public java.util.Date getSynchdate() {
		return _inspectionRecordSpec.getSynchdate();
	}

	/**
	* Sets the synchdate of this inspection record spec.
	*
	* @param synchdate the synchdate of this inspection record spec
	*/
	@Override
	public void setSynchdate(java.util.Date synchdate) {
		_inspectionRecordSpec.setSynchdate(synchdate);
	}

	@Override
	public boolean isNew() {
		return _inspectionRecordSpec.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_inspectionRecordSpec.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _inspectionRecordSpec.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_inspectionRecordSpec.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _inspectionRecordSpec.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _inspectionRecordSpec.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_inspectionRecordSpec.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _inspectionRecordSpec.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_inspectionRecordSpec.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_inspectionRecordSpec.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_inspectionRecordSpec.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new InspectionRecordSpecWrapper((InspectionRecordSpec)_inspectionRecordSpec.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec inspectionRecordSpec) {
		return _inspectionRecordSpec.compareTo(inspectionRecordSpec);
	}

	@Override
	public int hashCode() {
		return _inspectionRecordSpec.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec> toCacheModel() {
		return _inspectionRecordSpec.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec toEscapedModel() {
		return new InspectionRecordSpecWrapper(_inspectionRecordSpec.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec toUnescapedModel() {
		return new InspectionRecordSpecWrapper(_inspectionRecordSpec.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _inspectionRecordSpec.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _inspectionRecordSpec.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_inspectionRecordSpec.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof InspectionRecordSpecWrapper)) {
			return false;
		}

		InspectionRecordSpecWrapper inspectionRecordSpecWrapper = (InspectionRecordSpecWrapper)obj;

		if (Validator.equals(_inspectionRecordSpec,
					inspectionRecordSpecWrapper._inspectionRecordSpec)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public InspectionRecordSpec getWrappedInspectionRecordSpec() {
		return _inspectionRecordSpec;
	}

	@Override
	public InspectionRecordSpec getWrappedModel() {
		return _inspectionRecordSpec;
	}

	@Override
	public void resetOriginalValues() {
		_inspectionRecordSpec.resetOriginalValues();
	}

	private InspectionRecordSpec _inspectionRecordSpec;
}