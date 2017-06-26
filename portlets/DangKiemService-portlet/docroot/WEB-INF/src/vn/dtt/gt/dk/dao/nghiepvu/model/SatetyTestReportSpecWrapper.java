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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SatetyTestReportSpec}.
 * </p>
 *
 * @author huymq
 * @see SatetyTestReportSpec
 * @generated
 */
public class SatetyTestReportSpecWrapper implements SatetyTestReportSpec,
	ModelWrapper<SatetyTestReportSpec> {
	public SatetyTestReportSpecWrapper(
		SatetyTestReportSpec satetyTestReportSpec) {
		_satetyTestReportSpec = satetyTestReportSpec;
	}

	@Override
	public Class<?> getModelClass() {
		return SatetyTestReportSpec.class;
	}

	@Override
	public String getModelClassName() {
		return SatetyTestReportSpec.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("saftyTestReportId", getSaftyTestReportId());
		attributes.put("specificationCode", getSpecificationCode());
		attributes.put("specificationName", getSpecificationName());
		attributes.put("specificationValue", getSpecificationValue());
		attributes.put("evaluationResult", getEvaluationResult());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long saftyTestReportId = (Long)attributes.get("saftyTestReportId");

		if (saftyTestReportId != null) {
			setSaftyTestReportId(saftyTestReportId);
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
	}

	/**
	* Returns the primary key of this satety test report spec.
	*
	* @return the primary key of this satety test report spec
	*/
	@Override
	public long getPrimaryKey() {
		return _satetyTestReportSpec.getPrimaryKey();
	}

	/**
	* Sets the primary key of this satety test report spec.
	*
	* @param primaryKey the primary key of this satety test report spec
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_satetyTestReportSpec.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this satety test report spec.
	*
	* @return the ID of this satety test report spec
	*/
	@Override
	public long getId() {
		return _satetyTestReportSpec.getId();
	}

	/**
	* Sets the ID of this satety test report spec.
	*
	* @param id the ID of this satety test report spec
	*/
	@Override
	public void setId(long id) {
		_satetyTestReportSpec.setId(id);
	}

	/**
	* Returns the safty test report ID of this satety test report spec.
	*
	* @return the safty test report ID of this satety test report spec
	*/
	@Override
	public long getSaftyTestReportId() {
		return _satetyTestReportSpec.getSaftyTestReportId();
	}

	/**
	* Sets the safty test report ID of this satety test report spec.
	*
	* @param saftyTestReportId the safty test report ID of this satety test report spec
	*/
	@Override
	public void setSaftyTestReportId(long saftyTestReportId) {
		_satetyTestReportSpec.setSaftyTestReportId(saftyTestReportId);
	}

	/**
	* Returns the specification code of this satety test report spec.
	*
	* @return the specification code of this satety test report spec
	*/
	@Override
	public java.lang.String getSpecificationCode() {
		return _satetyTestReportSpec.getSpecificationCode();
	}

	/**
	* Sets the specification code of this satety test report spec.
	*
	* @param specificationCode the specification code of this satety test report spec
	*/
	@Override
	public void setSpecificationCode(java.lang.String specificationCode) {
		_satetyTestReportSpec.setSpecificationCode(specificationCode);
	}

	/**
	* Returns the specification name of this satety test report spec.
	*
	* @return the specification name of this satety test report spec
	*/
	@Override
	public java.lang.String getSpecificationName() {
		return _satetyTestReportSpec.getSpecificationName();
	}

	/**
	* Sets the specification name of this satety test report spec.
	*
	* @param specificationName the specification name of this satety test report spec
	*/
	@Override
	public void setSpecificationName(java.lang.String specificationName) {
		_satetyTestReportSpec.setSpecificationName(specificationName);
	}

	/**
	* Returns the specification value of this satety test report spec.
	*
	* @return the specification value of this satety test report spec
	*/
	@Override
	public java.lang.String getSpecificationValue() {
		return _satetyTestReportSpec.getSpecificationValue();
	}

	/**
	* Sets the specification value of this satety test report spec.
	*
	* @param specificationValue the specification value of this satety test report spec
	*/
	@Override
	public void setSpecificationValue(java.lang.String specificationValue) {
		_satetyTestReportSpec.setSpecificationValue(specificationValue);
	}

	/**
	* Returns the evaluation result of this satety test report spec.
	*
	* @return the evaluation result of this satety test report spec
	*/
	@Override
	public long getEvaluationResult() {
		return _satetyTestReportSpec.getEvaluationResult();
	}

	/**
	* Sets the evaluation result of this satety test report spec.
	*
	* @param evaluationResult the evaluation result of this satety test report spec
	*/
	@Override
	public void setEvaluationResult(long evaluationResult) {
		_satetyTestReportSpec.setEvaluationResult(evaluationResult);
	}

	@Override
	public boolean isNew() {
		return _satetyTestReportSpec.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_satetyTestReportSpec.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _satetyTestReportSpec.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_satetyTestReportSpec.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _satetyTestReportSpec.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _satetyTestReportSpec.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_satetyTestReportSpec.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _satetyTestReportSpec.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_satetyTestReportSpec.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_satetyTestReportSpec.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_satetyTestReportSpec.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SatetyTestReportSpecWrapper((SatetyTestReportSpec)_satetyTestReportSpec.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec satetyTestReportSpec) {
		return _satetyTestReportSpec.compareTo(satetyTestReportSpec);
	}

	@Override
	public int hashCode() {
		return _satetyTestReportSpec.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec> toCacheModel() {
		return _satetyTestReportSpec.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec toEscapedModel() {
		return new SatetyTestReportSpecWrapper(_satetyTestReportSpec.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec toUnescapedModel() {
		return new SatetyTestReportSpecWrapper(_satetyTestReportSpec.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _satetyTestReportSpec.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _satetyTestReportSpec.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_satetyTestReportSpec.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SatetyTestReportSpecWrapper)) {
			return false;
		}

		SatetyTestReportSpecWrapper satetyTestReportSpecWrapper = (SatetyTestReportSpecWrapper)obj;

		if (Validator.equals(_satetyTestReportSpec,
					satetyTestReportSpecWrapper._satetyTestReportSpec)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public SatetyTestReportSpec getWrappedSatetyTestReportSpec() {
		return _satetyTestReportSpec;
	}

	@Override
	public SatetyTestReportSpec getWrappedModel() {
		return _satetyTestReportSpec;
	}

	@Override
	public void resetOriginalValues() {
		_satetyTestReportSpec.resetOriginalValues();
	}

	private SatetyTestReportSpec _satetyTestReportSpec;
}