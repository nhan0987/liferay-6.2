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

import java.util.Date;

/**
 * The base model interface for the CorporationInspector service. Represents a row in the &quot;vr_corporation_inspector&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationInspectorModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationInspectorImpl}.
 * </p>
 *
 * @author huymq
 * @see CorporationInspector
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationInspectorImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationInspectorModelImpl
 * @generated
 */
public interface CorporationInspectorModel extends BaseModel<CorporationInspector> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a corporation inspector model instance should use the {@link CorporationInspector} interface instead.
	 */

	/**
	 * Returns the primary key of this corporation inspector.
	 *
	 * @return the primary key of this corporation inspector
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this corporation inspector.
	 *
	 * @param primaryKey the primary key of this corporation inspector
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this corporation inspector.
	 *
	 * @return the ID of this corporation inspector
	 */
	public long getId();

	/**
	 * Sets the ID of this corporation inspector.
	 *
	 * @param id the ID of this corporation inspector
	 */
	public void setId(long id);

	/**
	 * Returns the corporation ID of this corporation inspector.
	 *
	 * @return the corporation ID of this corporation inspector
	 */
	@AutoEscape
	public String getCorporationId();

	/**
	 * Sets the corporation ID of this corporation inspector.
	 *
	 * @param corporationId the corporation ID of this corporation inspector
	 */
	public void setCorporationId(String corporationId);

	/**
	 * Returns the inspectorid of this corporation inspector.
	 *
	 * @return the inspectorid of this corporation inspector
	 */
	public long getInspectorid();

	/**
	 * Sets the inspectorid of this corporation inspector.
	 *
	 * @param inspectorid the inspectorid of this corporation inspector
	 */
	public void setInspectorid(long inspectorid);

	/**
	 * Returns the inspector name of this corporation inspector.
	 *
	 * @return the inspector name of this corporation inspector
	 */
	@AutoEscape
	public String getInspectorName();

	/**
	 * Sets the inspector name of this corporation inspector.
	 *
	 * @param inspectorName the inspector name of this corporation inspector
	 */
	public void setInspectorName(String inspectorName);

	/**
	 * Returns the inspector phone of this corporation inspector.
	 *
	 * @return the inspector phone of this corporation inspector
	 */
	@AutoEscape
	public String getInspectorPhone();

	/**
	 * Sets the inspector phone of this corporation inspector.
	 *
	 * @param inspectorPhone the inspector phone of this corporation inspector
	 */
	public void setInspectorPhone(String inspectorPhone);

	/**
	 * Returns the inspector email of this corporation inspector.
	 *
	 * @return the inspector email of this corporation inspector
	 */
	@AutoEscape
	public String getInspectorEmail();

	/**
	 * Sets the inspector email of this corporation inspector.
	 *
	 * @param inspectorEmail the inspector email of this corporation inspector
	 */
	public void setInspectorEmail(String inspectorEmail);

	/**
	 * Returns the contactcode of this corporation inspector.
	 *
	 * @return the contactcode of this corporation inspector
	 */
	@AutoEscape
	public String getContactcode();

	/**
	 * Sets the contactcode of this corporation inspector.
	 *
	 * @param contactcode the contactcode of this corporation inspector
	 */
	public void setContactcode(String contactcode);

	/**
	 * Returns the regular tthc of this corporation inspector.
	 *
	 * @return the regular tthc of this corporation inspector
	 */
	public long getRegularTthc();

	/**
	 * Sets the regular tthc of this corporation inspector.
	 *
	 * @param regularTthc the regular tthc of this corporation inspector
	 */
	public void setRegularTthc(long regularTthc);

	/**
	 * Returns the team ID of this corporation inspector.
	 *
	 * @return the team ID of this corporation inspector
	 */
	public long getTeamId();

	/**
	 * Sets the team ID of this corporation inspector.
	 *
	 * @param teamId the team ID of this corporation inspector
	 */
	public void setTeamId(long teamId);

	/**
	 * Returns the markup team leader of this corporation inspector.
	 *
	 * @return the markup team leader of this corporation inspector
	 */
	public int getMarkupTeamLeader();

	/**
	 * Sets the markup team leader of this corporation inspector.
	 *
	 * @param markupTeamLeader the markup team leader of this corporation inspector
	 */
	public void setMarkupTeamLeader(int markupTeamLeader);

	/**
	 * Returns the mark up boss of this corporation inspector.
	 *
	 * @return the mark up boss of this corporation inspector
	 */
	public int getMarkUpBoss();

	/**
	 * Sets the mark up boss of this corporation inspector.
	 *
	 * @param markUpBoss the mark up boss of this corporation inspector
	 */
	public void setMarkUpBoss(int markUpBoss);

	/**
	 * Returns the place of this corporation inspector.
	 *
	 * @return the place of this corporation inspector
	 */
	@AutoEscape
	public String getPlace();

	/**
	 * Sets the place of this corporation inspector.
	 *
	 * @param place the place of this corporation inspector
	 */
	public void setPlace(String place);

	/**
	 * Returns the title of this corporation inspector.
	 *
	 * @return the title of this corporation inspector
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this corporation inspector.
	 *
	 * @param title the title of this corporation inspector
	 */
	public void setTitle(String title);

	/**
	 * Returns the filechuky ID of this corporation inspector.
	 *
	 * @return the filechuky ID of this corporation inspector
	 */
	public long getFilechukyId();

	/**
	 * Sets the filechuky ID of this corporation inspector.
	 *
	 * @param filechukyId the filechuky ID of this corporation inspector
	 */
	public void setFilechukyId(long filechukyId);

	/**
	 * Returns the synchdate of this corporation inspector.
	 *
	 * @return the synchdate of this corporation inspector
	 */
	public Date getSynchdate();

	/**
	 * Sets the synchdate of this corporation inspector.
	 *
	 * @param synchdate the synchdate of this corporation inspector
	 */
	public void setSynchdate(Date synchdate);

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
	public int compareTo(CorporationInspector corporationInspector);

	@Override
	public int hashCode();

	@Override
	public CacheModel<CorporationInspector> toCacheModel();

	@Override
	public CorporationInspector toEscapedModel();

	@Override
	public CorporationInspector toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}