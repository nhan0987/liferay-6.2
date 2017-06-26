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
 * The base model interface for the DraftCertificateSpec service. Represents a row in the &quot;vr_draftcertificatespec&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DraftCertificateSpecModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DraftCertificateSpecImpl}.
 * </p>
 *
 * @author win_64
 * @see DraftCertificateSpec
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.DraftCertificateSpecImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.DraftCertificateSpecModelImpl
 * @generated
 */
public interface DraftCertificateSpecModel extends BaseModel<DraftCertificateSpec> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a draft certificate spec model instance should use the {@link DraftCertificateSpec} interface instead.
	 */

	/**
	 * Returns the primary key of this draft certificate spec.
	 *
	 * @return the primary key of this draft certificate spec
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this draft certificate spec.
	 *
	 * @param primaryKey the primary key of this draft certificate spec
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this draft certificate spec.
	 *
	 * @return the ID of this draft certificate spec
	 */
	public long getId();

	/**
	 * Sets the ID of this draft certificate spec.
	 *
	 * @param id the ID of this draft certificate spec
	 */
	public void setId(long id);

	/**
	 * Returns the draft certificate ID of this draft certificate spec.
	 *
	 * @return the draft certificate ID of this draft certificate spec
	 */
	public long getDraftCertificateId();

	/**
	 * Sets the draft certificate ID of this draft certificate spec.
	 *
	 * @param draftCertificateId the draft certificate ID of this draft certificate spec
	 */
	public void setDraftCertificateId(long draftCertificateId);

	/**
	 * Returns the specification code of this draft certificate spec.
	 *
	 * @return the specification code of this draft certificate spec
	 */
	@AutoEscape
	public String getSpecificationCode();

	/**
	 * Sets the specification code of this draft certificate spec.
	 *
	 * @param specificationCode the specification code of this draft certificate spec
	 */
	public void setSpecificationCode(String specificationCode);

	/**
	 * Returns the specification name of this draft certificate spec.
	 *
	 * @return the specification name of this draft certificate spec
	 */
	@AutoEscape
	public String getSpecificationName();

	/**
	 * Sets the specification name of this draft certificate spec.
	 *
	 * @param specificationName the specification name of this draft certificate spec
	 */
	public void setSpecificationName(String specificationName);

	/**
	 * Returns the specification value of this draft certificate spec.
	 *
	 * @return the specification value of this draft certificate spec
	 */
	@AutoEscape
	public String getSpecificationValue();

	/**
	 * Sets the specification value of this draft certificate spec.
	 *
	 * @param specificationValue the specification value of this draft certificate spec
	 */
	public void setSpecificationValue(String specificationValue);

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
		vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec draftCertificateSpec);

	@Override
	public int hashCode();

	@Override
	public CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec> toCacheModel();

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec toEscapedModel();

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}