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
 * The base model interface for the CorporationTeam service. Represents a row in the &quot;vr_corporation_team&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationTeamModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationTeamImpl}.
 * </p>
 *
 * @author win_64
 * @see CorporationTeam
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationTeamImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationTeamModelImpl
 * @generated
 */
public interface CorporationTeamModel extends BaseModel<CorporationTeam> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a corporation team model instance should use the {@link CorporationTeam} interface instead.
	 */

	/**
	 * Returns the primary key of this corporation team.
	 *
	 * @return the primary key of this corporation team
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this corporation team.
	 *
	 * @param primaryKey the primary key of this corporation team
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this corporation team.
	 *
	 * @return the ID of this corporation team
	 */
	public long getId();

	/**
	 * Sets the ID of this corporation team.
	 *
	 * @param id the ID of this corporation team
	 */
	public void setId(long id);

	/**
	 * Returns the corporation ID of this corporation team.
	 *
	 * @return the corporation ID of this corporation team
	 */
	@AutoEscape
	public String getCorporationId();

	/**
	 * Sets the corporation ID of this corporation team.
	 *
	 * @param corporationId the corporation ID of this corporation team
	 */
	public void setCorporationId(String corporationId);

	/**
	 * Returns the team name of this corporation team.
	 *
	 * @return the team name of this corporation team
	 */
	@AutoEscape
	public String getTeamName();

	/**
	 * Sets the team name of this corporation team.
	 *
	 * @param teamName the team name of this corporation team
	 */
	public void setTeamName(String teamName);

	/**
	 * Returns the mark up delete of this corporation team.
	 *
	 * @return the mark up delete of this corporation team
	 */
	public int getMarkUpDelete();

	/**
	 * Sets the mark up delete of this corporation team.
	 *
	 * @param markUpDelete the mark up delete of this corporation team
	 */
	public void setMarkUpDelete(int markUpDelete);

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
	public int compareTo(CorporationTeam corporationTeam);

	@Override
	public int hashCode();

	@Override
	public CacheModel<CorporationTeam> toCacheModel();

	@Override
	public CorporationTeam toEscapedModel();

	@Override
	public CorporationTeam toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}