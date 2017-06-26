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

import java.util.Date;

/**
 * The base model interface for the AswmsgMessageLog service. Represents a row in the &quot;aswmsg_messagelog&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageLogModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageLogImpl}.
 * </p>
 *
 * @author win_64
 * @see AswmsgMessageLog
 * @see vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageLogImpl
 * @see vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageLogModelImpl
 * @generated
 */
public interface AswmsgMessageLogModel extends BaseModel<AswmsgMessageLog> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a aswmsg message log model instance should use the {@link AswmsgMessageLog} interface instead.
	 */

	/**
	 * Returns the primary key of this aswmsg message log.
	 *
	 * @return the primary key of this aswmsg message log
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this aswmsg message log.
	 *
	 * @param primaryKey the primary key of this aswmsg message log
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this aswmsg message log.
	 *
	 * @return the ID of this aswmsg message log
	 */
	public long getId();

	/**
	 * Sets the ID of this aswmsg message log.
	 *
	 * @param Id the ID of this aswmsg message log
	 */
	public void setId(long Id);

	/**
	 * Returns the version of this aswmsg message log.
	 *
	 * @return the version of this aswmsg message log
	 */
	@AutoEscape
	public String getVersion();

	/**
	 * Sets the version of this aswmsg message log.
	 *
	 * @param Version the version of this aswmsg message log
	 */
	public void setVersion(String Version);

	/**
	 * Returns the message ID of this aswmsg message log.
	 *
	 * @return the message ID of this aswmsg message log
	 */
	@AutoEscape
	public String getMessageId();

	/**
	 * Sets the message ID of this aswmsg message log.
	 *
	 * @param MessageId the message ID of this aswmsg message log
	 */
	public void setMessageId(String MessageId);

	/**
	 * Returns the sender name of this aswmsg message log.
	 *
	 * @return the sender name of this aswmsg message log
	 */
	@AutoEscape
	public String getSenderName();

	/**
	 * Sets the sender name of this aswmsg message log.
	 *
	 * @param SenderName the sender name of this aswmsg message log
	 */
	public void setSenderName(String SenderName);

	/**
	 * Returns the sender identity of this aswmsg message log.
	 *
	 * @return the sender identity of this aswmsg message log
	 */
	@AutoEscape
	public String getSenderIdentity();

	/**
	 * Sets the sender identity of this aswmsg message log.
	 *
	 * @param SenderIdentity the sender identity of this aswmsg message log
	 */
	public void setSenderIdentity(String SenderIdentity);

	/**
	 * Returns the sender country code of this aswmsg message log.
	 *
	 * @return the sender country code of this aswmsg message log
	 */
	@AutoEscape
	public String getSenderCountryCode();

	/**
	 * Sets the sender country code of this aswmsg message log.
	 *
	 * @param SenderCountryCode the sender country code of this aswmsg message log
	 */
	public void setSenderCountryCode(String SenderCountryCode);

	/**
	 * Returns the sender ministry code of this aswmsg message log.
	 *
	 * @return the sender ministry code of this aswmsg message log
	 */
	@AutoEscape
	public String getSenderMinistryCode();

	/**
	 * Sets the sender ministry code of this aswmsg message log.
	 *
	 * @param SenderMinistryCode the sender ministry code of this aswmsg message log
	 */
	public void setSenderMinistryCode(String SenderMinistryCode);

	/**
	 * Returns the sender organization code of this aswmsg message log.
	 *
	 * @return the sender organization code of this aswmsg message log
	 */
	@AutoEscape
	public String getSenderOrganizationCode();

	/**
	 * Sets the sender organization code of this aswmsg message log.
	 *
	 * @param SenderOrganizationCode the sender organization code of this aswmsg message log
	 */
	public void setSenderOrganizationCode(String SenderOrganizationCode);

	/**
	 * Returns the sender unit code of this aswmsg message log.
	 *
	 * @return the sender unit code of this aswmsg message log
	 */
	@AutoEscape
	public String getSenderUnitCode();

	/**
	 * Sets the sender unit code of this aswmsg message log.
	 *
	 * @param SenderUnitCode the sender unit code of this aswmsg message log
	 */
	public void setSenderUnitCode(String SenderUnitCode);

	/**
	 * Returns the receiver name of this aswmsg message log.
	 *
	 * @return the receiver name of this aswmsg message log
	 */
	@AutoEscape
	public String getReceiverName();

	/**
	 * Sets the receiver name of this aswmsg message log.
	 *
	 * @param ReceiverName the receiver name of this aswmsg message log
	 */
	public void setReceiverName(String ReceiverName);

	/**
	 * Returns the receiver identity of this aswmsg message log.
	 *
	 * @return the receiver identity of this aswmsg message log
	 */
	@AutoEscape
	public String getReceiverIdentity();

	/**
	 * Sets the receiver identity of this aswmsg message log.
	 *
	 * @param ReceiverIdentity the receiver identity of this aswmsg message log
	 */
	public void setReceiverIdentity(String ReceiverIdentity);

	/**
	 * Returns the receiver country code of this aswmsg message log.
	 *
	 * @return the receiver country code of this aswmsg message log
	 */
	@AutoEscape
	public String getReceiverCountryCode();

	/**
	 * Sets the receiver country code of this aswmsg message log.
	 *
	 * @param ReceiverCountryCode the receiver country code of this aswmsg message log
	 */
	public void setReceiverCountryCode(String ReceiverCountryCode);

	/**
	 * Returns the receiver ministry code of this aswmsg message log.
	 *
	 * @return the receiver ministry code of this aswmsg message log
	 */
	@AutoEscape
	public String getReceiverMinistryCode();

	/**
	 * Sets the receiver ministry code of this aswmsg message log.
	 *
	 * @param ReceiverMinistryCode the receiver ministry code of this aswmsg message log
	 */
	public void setReceiverMinistryCode(String ReceiverMinistryCode);

	/**
	 * Returns the receiver organization code of this aswmsg message log.
	 *
	 * @return the receiver organization code of this aswmsg message log
	 */
	@AutoEscape
	public String getReceiverOrganizationCode();

	/**
	 * Sets the receiver organization code of this aswmsg message log.
	 *
	 * @param ReceiverOrganizationCode the receiver organization code of this aswmsg message log
	 */
	public void setReceiverOrganizationCode(String ReceiverOrganizationCode);

	/**
	 * Returns the receiver unit code of this aswmsg message log.
	 *
	 * @return the receiver unit code of this aswmsg message log
	 */
	@AutoEscape
	public String getReceiverUnitCode();

	/**
	 * Sets the receiver unit code of this aswmsg message log.
	 *
	 * @param ReceiverUnitCode the receiver unit code of this aswmsg message log
	 */
	public void setReceiverUnitCode(String ReceiverUnitCode);

	/**
	 * Returns the document type of this aswmsg message log.
	 *
	 * @return the document type of this aswmsg message log
	 */
	@AutoEscape
	public String getDocumentType();

	/**
	 * Sets the document type of this aswmsg message log.
	 *
	 * @param DocumentType the document type of this aswmsg message log
	 */
	public void setDocumentType(String DocumentType);

	/**
	 * Returns the type of this aswmsg message log.
	 *
	 * @return the type of this aswmsg message log
	 */
	public int getType();

	/**
	 * Sets the type of this aswmsg message log.
	 *
	 * @param Type the type of this aswmsg message log
	 */
	public void setType(int Type);

	/**
	 * Returns the function of this aswmsg message log.
	 *
	 * @return the function of this aswmsg message log
	 */
	@AutoEscape
	public String getFunction();

	/**
	 * Sets the function of this aswmsg message log.
	 *
	 * @param Function the function of this aswmsg message log
	 */
	public void setFunction(String Function);

	/**
	 * Returns the reference of this aswmsg message log.
	 *
	 * @return the reference of this aswmsg message log
	 */
	public long getReference();

	/**
	 * Sets the reference of this aswmsg message log.
	 *
	 * @param Reference the reference of this aswmsg message log
	 */
	public void setReference(long Reference);

	/**
	 * Returns the pre reference of this aswmsg message log.
	 *
	 * @return the pre reference of this aswmsg message log
	 */
	public long getPreReference();

	/**
	 * Sets the pre reference of this aswmsg message log.
	 *
	 * @param PreReference the pre reference of this aswmsg message log
	 */
	public void setPreReference(long PreReference);

	/**
	 * Returns the document year of this aswmsg message log.
	 *
	 * @return the document year of this aswmsg message log
	 */
	public int getDocumentYear();

	/**
	 * Sets the document year of this aswmsg message log.
	 *
	 * @param DocumentYear the document year of this aswmsg message log
	 */
	public void setDocumentYear(int DocumentYear);

	/**
	 * Returns the send date of this aswmsg message log.
	 *
	 * @return the send date of this aswmsg message log
	 */
	public Date getSendDate();

	/**
	 * Sets the send date of this aswmsg message log.
	 *
	 * @param SendDate the send date of this aswmsg message log
	 */
	public void setSendDate(Date SendDate);

	/**
	 * Returns the signature of this aswmsg message log.
	 *
	 * @return the signature of this aswmsg message log
	 */
	@AutoEscape
	public String getSignature();

	/**
	 * Sets the signature of this aswmsg message log.
	 *
	 * @param Signature the signature of this aswmsg message log
	 */
	public void setSignature(String Signature);

	/**
	 * Returns the system signature of this aswmsg message log.
	 *
	 * @return the system signature of this aswmsg message log
	 */
	@AutoEscape
	public String getSystemSignature();

	/**
	 * Sets the system signature of this aswmsg message log.
	 *
	 * @param SystemSignature the system signature of this aswmsg message log
	 */
	public void setSystemSignature(String SystemSignature);

	/**
	 * Returns the all content of this aswmsg message log.
	 *
	 * @return the all content of this aswmsg message log
	 */
	@AutoEscape
	public String getAllContent();

	/**
	 * Sets the all content of this aswmsg message log.
	 *
	 * @param AllContent the all content of this aswmsg message log
	 */
	public void setAllContent(String AllContent);

	/**
	 * Returns the created time of this aswmsg message log.
	 *
	 * @return the created time of this aswmsg message log
	 */
	public Date getCreatedTime();

	/**
	 * Sets the created time of this aswmsg message log.
	 *
	 * @param CreatedTime the created time of this aswmsg message log
	 */
	public void setCreatedTime(Date CreatedTime);

	/**
	 * Returns the webservice of this aswmsg message log.
	 *
	 * @return the webservice of this aswmsg message log
	 */
	public int getWebservice();

	/**
	 * Sets the webservice of this aswmsg message log.
	 *
	 * @param Webservice the webservice of this aswmsg message log
	 */
	public void setWebservice(int Webservice);

	/**
	 * Returns the validated of this aswmsg message log.
	 *
	 * @return the validated of this aswmsg message log
	 */
	public int getValidated();

	/**
	 * Sets the validated of this aswmsg message log.
	 *
	 * @param Validated the validated of this aswmsg message log
	 */
	public void setValidated(int Validated);

	/**
	 * Returns the description of this aswmsg message log.
	 *
	 * @return the description of this aswmsg message log
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this aswmsg message log.
	 *
	 * @param Description the description of this aswmsg message log
	 */
	public void setDescription(String Description);

	/**
	 * Returns the validation code of this aswmsg message log.
	 *
	 * @return the validation code of this aswmsg message log
	 */
	@AutoEscape
	public String getValidationCode();

	/**
	 * Sets the validation code of this aswmsg message log.
	 *
	 * @param ValidationCode the validation code of this aswmsg message log
	 */
	public void setValidationCode(String ValidationCode);

	/**
	 * Returns the so lan gui of this aswmsg message log.
	 *
	 * @return the so lan gui of this aswmsg message log
	 */
	public int getSoLanGui();

	/**
	 * Sets the so lan gui of this aswmsg message log.
	 *
	 * @param soLanGui the so lan gui of this aswmsg message log
	 */
	public void setSoLanGui(int soLanGui);

	/**
	 * Returns the file log ID of this aswmsg message log.
	 *
	 * @return the file log ID of this aswmsg message log
	 */
	public long getFileLogId();

	/**
	 * Sets the file log ID of this aswmsg message log.
	 *
	 * @param fileLogId the file log ID of this aswmsg message log
	 */
	public void setFileLogId(long fileLogId);

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
	public int compareTo(AswmsgMessageLog aswmsgMessageLog);

	@Override
	public int hashCode();

	@Override
	public CacheModel<AswmsgMessageLog> toCacheModel();

	@Override
	public AswmsgMessageLog toEscapedModel();

	@Override
	public AswmsgMessageLog toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}