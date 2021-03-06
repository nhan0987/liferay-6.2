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

package vn.dtt.gt.dk.dao.aswmsg.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the AswmsgValidationLog service. Represents a row in the &quot;aswmsg_validationlog&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl}.
 * </p>
 *
 * @author win_64
 * @see AswmsgValidationLog
 * @see vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl
 * @see vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogModelImpl
 * @generated
 */
public interface AswmsgValidationLogModel extends BaseModel<AswmsgValidationLog> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a aswmsg validation log model instance should use the {@link AswmsgValidationLog} interface instead.
	 */

	/**
	 * Returns the primary key of this aswmsg validation log.
	 *
	 * @return the primary key of this aswmsg validation log
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this aswmsg validation log.
	 *
	 * @param primaryKey the primary key of this aswmsg validation log
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this aswmsg validation log.
	 *
	 * @return the ID of this aswmsg validation log
	 */
	public long getId();

	/**
	 * Sets the ID of this aswmsg validation log.
	 *
	 * @param Id the ID of this aswmsg validation log
	 */
	public void setId(long Id);

	/**
	 * Returns the message log ID of this aswmsg validation log.
	 *
	 * @return the message log ID of this aswmsg validation log
	 */
	public long getMessageLogId();

	/**
	 * Sets the message log ID of this aswmsg validation log.
	 *
	 * @param MessageLogId the message log ID of this aswmsg validation log
	 */
	public void setMessageLogId(long MessageLogId);

	/**
	 * Returns the tag name of this aswmsg validation log.
	 *
	 * @return the tag name of this aswmsg validation log
	 */
	@AutoEscape
	public String getTagName();

	/**
	 * Sets the tag name of this aswmsg validation log.
	 *
	 * @param TagName the tag name of this aswmsg validation log
	 */
	public void setTagName(String TagName);

	/**
	 * Returns the validation code of this aswmsg validation log.
	 *
	 * @return the validation code of this aswmsg validation log
	 */
	@AutoEscape
	public String getValidationCode();

	/**
	 * Sets the validation code of this aswmsg validation log.
	 *
	 * @param ValidationCode the validation code of this aswmsg validation log
	 */
	public void setValidationCode(String ValidationCode);

	/**
	 * Returns the description of this aswmsg validation log.
	 *
	 * @return the description of this aswmsg validation log
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this aswmsg validation log.
	 *
	 * @param Description the description of this aswmsg validation log
	 */
	public void setDescription(String Description);

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
		vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog aswmsgValidationLog);

	@Override
	public int hashCode();

	@Override
	public CacheModel<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog> toCacheModel();

	@Override
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog toEscapedModel();

	@Override
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}