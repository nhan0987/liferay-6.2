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
 * This class is a wrapper for {@link IssueCategory}.
 * </p>
 *
 * @author win_64
 * @see IssueCategory
 * @generated
 */
public class IssueCategoryWrapper implements IssueCategory,
	ModelWrapper<IssueCategory> {
	public IssueCategoryWrapper(IssueCategory issueCategory) {
		_issueCategory = issueCategory;
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

	/**
	* Returns the primary key of this issue category.
	*
	* @return the primary key of this issue category
	*/
	@Override
	public long getPrimaryKey() {
		return _issueCategory.getPrimaryKey();
	}

	/**
	* Sets the primary key of this issue category.
	*
	* @param primaryKey the primary key of this issue category
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_issueCategory.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this issue category.
	*
	* @return the ID of this issue category
	*/
	@Override
	public long getId() {
		return _issueCategory.getId();
	}

	/**
	* Sets the ID of this issue category.
	*
	* @param id the ID of this issue category
	*/
	@Override
	public void setId(long id) {
		_issueCategory.setId(id);
	}

	/**
	* Returns the issuetrackingid of this issue category.
	*
	* @return the issuetrackingid of this issue category
	*/
	@Override
	public int getIssuetrackingid() {
		return _issueCategory.getIssuetrackingid();
	}

	/**
	* Sets the issuetrackingid of this issue category.
	*
	* @param issuetrackingid the issuetrackingid of this issue category
	*/
	@Override
	public void setIssuetrackingid(int issuetrackingid) {
		_issueCategory.setIssuetrackingid(issuetrackingid);
	}

	/**
	* Returns the defectcategorycode of this issue category.
	*
	* @return the defectcategorycode of this issue category
	*/
	@Override
	public java.lang.String getDefectcategorycode() {
		return _issueCategory.getDefectcategorycode();
	}

	/**
	* Sets the defectcategorycode of this issue category.
	*
	* @param defectcategorycode the defectcategorycode of this issue category
	*/
	@Override
	public void setDefectcategorycode(java.lang.String defectcategorycode) {
		_issueCategory.setDefectcategorycode(defectcategorycode);
	}

	/**
	* Returns the defectcategoryshortname of this issue category.
	*
	* @return the defectcategoryshortname of this issue category
	*/
	@Override
	public java.lang.String getDefectcategoryshortname() {
		return _issueCategory.getDefectcategoryshortname();
	}

	/**
	* Sets the defectcategoryshortname of this issue category.
	*
	* @param defectcategoryshortname the defectcategoryshortname of this issue category
	*/
	@Override
	public void setDefectcategoryshortname(
		java.lang.String defectcategoryshortname) {
		_issueCategory.setDefectcategoryshortname(defectcategoryshortname);
	}

	/**
	* Returns the defectcategoryfullname of this issue category.
	*
	* @return the defectcategoryfullname of this issue category
	*/
	@Override
	public java.lang.String getDefectcategoryfullname() {
		return _issueCategory.getDefectcategoryfullname();
	}

	/**
	* Sets the defectcategoryfullname of this issue category.
	*
	* @param defectcategoryfullname the defectcategoryfullname of this issue category
	*/
	@Override
	public void setDefectcategoryfullname(
		java.lang.String defectcategoryfullname) {
		_issueCategory.setDefectcategoryfullname(defectcategoryfullname);
	}

	/**
	* Returns the defectdetection of this issue category.
	*
	* @return the defectdetection of this issue category
	*/
	@Override
	public int getDefectdetection() {
		return _issueCategory.getDefectdetection();
	}

	/**
	* Sets the defectdetection of this issue category.
	*
	* @param defectdetection the defectdetection of this issue category
	*/
	@Override
	public void setDefectdetection(int defectdetection) {
		_issueCategory.setDefectdetection(defectdetection);
	}

	/**
	* Returns the defectdatagroupid of this issue category.
	*
	* @return the defectdatagroupid of this issue category
	*/
	@Override
	public int getDefectdatagroupid() {
		return _issueCategory.getDefectdatagroupid();
	}

	/**
	* Sets the defectdatagroupid of this issue category.
	*
	* @param defectdatagroupid the defectdatagroupid of this issue category
	*/
	@Override
	public void setDefectdatagroupid(int defectdatagroupid) {
		_issueCategory.setDefectdatagroupid(defectdatagroupid);
	}

	@Override
	public boolean isNew() {
		return _issueCategory.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_issueCategory.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _issueCategory.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_issueCategory.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _issueCategory.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _issueCategory.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_issueCategory.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _issueCategory.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_issueCategory.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_issueCategory.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_issueCategory.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new IssueCategoryWrapper((IssueCategory)_issueCategory.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory issueCategory) {
		return _issueCategory.compareTo(issueCategory);
	}

	@Override
	public int hashCode() {
		return _issueCategory.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory> toCacheModel() {
		return _issueCategory.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory toEscapedModel() {
		return new IssueCategoryWrapper(_issueCategory.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory toUnescapedModel() {
		return new IssueCategoryWrapper(_issueCategory.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _issueCategory.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _issueCategory.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_issueCategory.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof IssueCategoryWrapper)) {
			return false;
		}

		IssueCategoryWrapper issueCategoryWrapper = (IssueCategoryWrapper)obj;

		if (Validator.equals(_issueCategory, issueCategoryWrapper._issueCategory)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public IssueCategory getWrappedIssueCategory() {
		return _issueCategory;
	}

	@Override
	public IssueCategory getWrappedModel() {
		return _issueCategory;
	}

	@Override
	public void resetOriginalValues() {
		_issueCategory.resetOriginalValues();
	}

	private IssueCategory _issueCategory;
}