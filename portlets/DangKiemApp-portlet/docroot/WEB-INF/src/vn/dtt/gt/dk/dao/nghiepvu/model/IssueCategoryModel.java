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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the IssueCategory service. Represents a row in the &quot;vr_assessmentissuecategory&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueCategoryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueCategoryImpl}.
 * </p>
 *
 * @author win_64
 * @see IssueCategory
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueCategoryImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueCategoryModelImpl
 * @generated
 */
public interface IssueCategoryModel extends BaseModel<IssueCategory> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a issue category model instance should use the {@link IssueCategory} interface instead.
	 */

	/**
	 * Returns the primary key of this issue category.
	 *
	 * @return the primary key of this issue category
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this issue category.
	 *
	 * @param primaryKey the primary key of this issue category
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this issue category.
	 *
	 * @return the ID of this issue category
	 */
	public long getId();

	/**
	 * Sets the ID of this issue category.
	 *
	 * @param id the ID of this issue category
	 */
	public void setId(long id);

	/**
	 * Returns the issuetrackingid of this issue category.
	 *
	 * @return the issuetrackingid of this issue category
	 */
	public int getIssuetrackingid();

	/**
	 * Sets the issuetrackingid of this issue category.
	 *
	 * @param issuetrackingid the issuetrackingid of this issue category
	 */
	public void setIssuetrackingid(int issuetrackingid);

	/**
	 * Returns the defectcategorycode of this issue category.
	 *
	 * @return the defectcategorycode of this issue category
	 */
	@AutoEscape
	public String getDefectcategorycode();

	/**
	 * Sets the defectcategorycode of this issue category.
	 *
	 * @param defectcategorycode the defectcategorycode of this issue category
	 */
	public void setDefectcategorycode(String defectcategorycode);

	/**
	 * Returns the defectcategoryshortname of this issue category.
	 *
	 * @return the defectcategoryshortname of this issue category
	 */
	@AutoEscape
	public String getDefectcategoryshortname();

	/**
	 * Sets the defectcategoryshortname of this issue category.
	 *
	 * @param defectcategoryshortname the defectcategoryshortname of this issue category
	 */
	public void setDefectcategoryshortname(String defectcategoryshortname);

	/**
	 * Returns the defectcategoryfullname of this issue category.
	 *
	 * @return the defectcategoryfullname of this issue category
	 */
	@AutoEscape
	public String getDefectcategoryfullname();

	/**
	 * Sets the defectcategoryfullname of this issue category.
	 *
	 * @param defectcategoryfullname the defectcategoryfullname of this issue category
	 */
	public void setDefectcategoryfullname(String defectcategoryfullname);

	/**
	 * Returns the defectdetection of this issue category.
	 *
	 * @return the defectdetection of this issue category
	 */
	public int getDefectdetection();

	/**
	 * Sets the defectdetection of this issue category.
	 *
	 * @param defectdetection the defectdetection of this issue category
	 */
	public void setDefectdetection(int defectdetection);

	/**
	 * Returns the defectdatagroupid of this issue category.
	 *
	 * @return the defectdatagroupid of this issue category
	 */
	public int getDefectdatagroupid();

	/**
	 * Sets the defectdatagroupid of this issue category.
	 *
	 * @param defectdatagroupid the defectdatagroupid of this issue category
	 */
	public void setDefectdatagroupid(int defectdatagroupid);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory issueCategory);

	@Override
	public int hashCode();

	@Override
	public CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory> toCacheModel();

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory toEscapedModel();

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}