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
 * The base model interface for the CorporationView service. Represents a row in the &quot;vr_corporation_view&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationViewModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationViewImpl}.
 * </p>
 *
 * @author win_64
 * @see CorporationView
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationViewImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationViewModelImpl
 * @generated
 */
public interface CorporationViewModel extends BaseModel<CorporationView> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a corporation view model instance should use the {@link CorporationView} interface instead.
	 */

	/**
	 * Returns the primary key of this corporation view.
	 *
	 * @return the primary key of this corporation view
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this corporation view.
	 *
	 * @param primaryKey the primary key of this corporation view
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this corporation view.
	 *
	 * @return the ID of this corporation view
	 */
	public long getId();

	/**
	 * Sets the ID of this corporation view.
	 *
	 * @param id the ID of this corporation view
	 */
	public void setId(long id);

	/**
	 * Returns the corporation ID of this corporation view.
	 *
	 * @return the corporation ID of this corporation view
	 */
	@AutoEscape
	public String getCorporationId();

	/**
	 * Sets the corporation ID of this corporation view.
	 *
	 * @param corporationId the corporation ID of this corporation view
	 */
	public void setCorporationId(String corporationId);

	/**
	 * Returns the corporation name of this corporation view.
	 *
	 * @return the corporation name of this corporation view
	 */
	@AutoEscape
	public String getCorporationName();

	/**
	 * Sets the corporation name of this corporation view.
	 *
	 * @param corporationName the corporation name of this corporation view
	 */
	public void setCorporationName(String corporationName);

	/**
	 * Returns the inspector ID of this corporation view.
	 *
	 * @return the inspector ID of this corporation view
	 */
	public long getInspectorId();

	/**
	 * Sets the inspector ID of this corporation view.
	 *
	 * @param inspectorId the inspector ID of this corporation view
	 */
	public void setInspectorId(long inspectorId);

	/**
	 * Returns the is leader of this corporation view.
	 *
	 * @return the is leader of this corporation view
	 */
	public int getIsLeader();

	/**
	 * Sets the is leader of this corporation view.
	 *
	 * @param isLeader the is leader of this corporation view
	 */
	public void setIsLeader(int isLeader);

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
	public int compareTo(CorporationView corporationView);

	@Override
	public int hashCode();

	@Override
	public CacheModel<CorporationView> toCacheModel();

	@Override
	public CorporationView toEscapedModel();

	@Override
	public CorporationView toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}