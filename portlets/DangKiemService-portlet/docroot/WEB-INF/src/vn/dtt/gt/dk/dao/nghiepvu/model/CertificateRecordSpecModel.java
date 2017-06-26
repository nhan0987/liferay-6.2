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
 * The base model interface for the CertificateRecordSpec service. Represents a row in the &quot;vr_certificaterecordspec&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordSpecModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordSpecImpl}.
 * </p>
 *
 * @author huymq
 * @see CertificateRecordSpec
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordSpecImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordSpecModelImpl
 * @generated
 */
public interface CertificateRecordSpecModel extends BaseModel<CertificateRecordSpec> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a certificate record spec model instance should use the {@link CertificateRecordSpec} interface instead.
	 */

	/**
	 * Returns the primary key of this certificate record spec.
	 *
	 * @return the primary key of this certificate record spec
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this certificate record spec.
	 *
	 * @param primaryKey the primary key of this certificate record spec
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this certificate record spec.
	 *
	 * @return the ID of this certificate record spec
	 */
	public long getId();

	/**
	 * Sets the ID of this certificate record spec.
	 *
	 * @param id the ID of this certificate record spec
	 */
	public void setId(long id);

	/**
	 * Returns the certificate record ID of this certificate record spec.
	 *
	 * @return the certificate record ID of this certificate record spec
	 */
	public long getCertificateRecordId();

	/**
	 * Sets the certificate record ID of this certificate record spec.
	 *
	 * @param certificateRecordId the certificate record ID of this certificate record spec
	 */
	public void setCertificateRecordId(long certificateRecordId);

	/**
	 * Returns the specification code of this certificate record spec.
	 *
	 * @return the specification code of this certificate record spec
	 */
	@AutoEscape
	public String getSpecificationCode();

	/**
	 * Sets the specification code of this certificate record spec.
	 *
	 * @param specificationCode the specification code of this certificate record spec
	 */
	public void setSpecificationCode(String specificationCode);

	/**
	 * Returns the specification name of this certificate record spec.
	 *
	 * @return the specification name of this certificate record spec
	 */
	@AutoEscape
	public String getSpecificationName();

	/**
	 * Sets the specification name of this certificate record spec.
	 *
	 * @param specificationName the specification name of this certificate record spec
	 */
	public void setSpecificationName(String specificationName);

	/**
	 * Returns the specification value of this certificate record spec.
	 *
	 * @return the specification value of this certificate record spec
	 */
	@AutoEscape
	public String getSpecificationValue();

	/**
	 * Sets the specification value of this certificate record spec.
	 *
	 * @param specificationValue the specification value of this certificate record spec
	 */
	public void setSpecificationValue(String specificationValue);

	/**
	 * Returns the version of this certificate record spec.
	 *
	 * @return the version of this certificate record spec
	 */
	public long getVersion();

	/**
	 * Sets the version of this certificate record spec.
	 *
	 * @param version the version of this certificate record spec
	 */
	public void setVersion(long version);

	/**
	 * Returns the synchdate of this certificate record spec.
	 *
	 * @return the synchdate of this certificate record spec
	 */
	public Date getSynchdate();

	/**
	 * Sets the synchdate of this certificate record spec.
	 *
	 * @param synchdate the synchdate of this certificate record spec
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
	public int compareTo(CertificateRecordSpec certificateRecordSpec);

	@Override
	public int hashCode();

	@Override
	public CacheModel<CertificateRecordSpec> toCacheModel();

	@Override
	public CertificateRecordSpec toEscapedModel();

	@Override
	public CertificateRecordSpec toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}