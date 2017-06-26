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
 * The base model interface for the InspectionRecordSpec service. Represents a row in the &quot;vr_inspectionrecordspec&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordSpecModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordSpecImpl}.
 * </p>
 *
 * @author win_64
 * @see InspectionRecordSpec
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordSpecImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordSpecModelImpl
 * @generated
 */
public interface InspectionRecordSpecModel extends BaseModel<InspectionRecordSpec> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a inspection record spec model instance should use the {@link InspectionRecordSpec} interface instead.
	 */

	/**
	 * Returns the primary key of this inspection record spec.
	 *
	 * @return the primary key of this inspection record spec
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this inspection record spec.
	 *
	 * @param primaryKey the primary key of this inspection record spec
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this inspection record spec.
	 *
	 * @return the ID of this inspection record spec
	 */
	public long getId();

	/**
	 * Sets the ID of this inspection record spec.
	 *
	 * @param id the ID of this inspection record spec
	 */
	public void setId(long id);

	/**
	 * Returns the inspection recordid of this inspection record spec.
	 *
	 * @return the inspection recordid of this inspection record spec
	 */
	public long getInspectionRecordid();

	/**
	 * Sets the inspection recordid of this inspection record spec.
	 *
	 * @param inspectionRecordid the inspection recordid of this inspection record spec
	 */
	public void setInspectionRecordid(long inspectionRecordid);

	/**
	 * Returns the specification code of this inspection record spec.
	 *
	 * @return the specification code of this inspection record spec
	 */
	@AutoEscape
	public String getSpecificationCode();

	/**
	 * Sets the specification code of this inspection record spec.
	 *
	 * @param specificationCode the specification code of this inspection record spec
	 */
	public void setSpecificationCode(String specificationCode);

	/**
	 * Returns the specification name of this inspection record spec.
	 *
	 * @return the specification name of this inspection record spec
	 */
	@AutoEscape
	public String getSpecificationName();

	/**
	 * Sets the specification name of this inspection record spec.
	 *
	 * @param specificationName the specification name of this inspection record spec
	 */
	public void setSpecificationName(String specificationName);

	/**
	 * Returns the specification value of this inspection record spec.
	 *
	 * @return the specification value of this inspection record spec
	 */
	@AutoEscape
	public String getSpecificationValue();

	/**
	 * Sets the specification value of this inspection record spec.
	 *
	 * @param specificationValue the specification value of this inspection record spec
	 */
	public void setSpecificationValue(String specificationValue);

	/**
	 * Returns the evaluation result of this inspection record spec.
	 *
	 * @return the evaluation result of this inspection record spec
	 */
	public long getEvaluationResult();

	/**
	 * Sets the evaluation result of this inspection record spec.
	 *
	 * @param evaluationResult the evaluation result of this inspection record spec
	 */
	public void setEvaluationResult(long evaluationResult);

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
		vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec inspectionRecordSpec);

	@Override
	public int hashCode();

	@Override
	public CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec> toCacheModel();

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec toEscapedModel();

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}