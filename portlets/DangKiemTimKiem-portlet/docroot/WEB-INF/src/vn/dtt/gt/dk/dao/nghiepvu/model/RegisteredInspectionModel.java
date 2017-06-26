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
 * The base model interface for the RegisteredInspection service. Represents a row in the &quot;vr_registeredinspection&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.RegisteredInspectionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.RegisteredInspectionImpl}.
 * </p>
 *
 * @author win_64
 * @see RegisteredInspection
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.RegisteredInspectionImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.RegisteredInspectionModelImpl
 * @generated
 */
public interface RegisteredInspectionModel extends BaseModel<RegisteredInspection> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a registered inspection model instance should use the {@link RegisteredInspection} interface instead.
	 */

	/**
	 * Returns the primary key of this registered inspection.
	 *
	 * @return the primary key of this registered inspection
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this registered inspection.
	 *
	 * @param primaryKey the primary key of this registered inspection
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this registered inspection.
	 *
	 * @return the ID of this registered inspection
	 */
	public long getId();

	/**
	 * Sets the ID of this registered inspection.
	 *
	 * @param id the ID of this registered inspection
	 */
	public void setId(long id);

	/**
	 * Returns the registered number of this registered inspection.
	 *
	 * @return the registered number of this registered inspection
	 */
	@AutoEscape
	public String getRegisteredNumber();

	/**
	 * Sets the registered number of this registered inspection.
	 *
	 * @param registeredNumber the registered number of this registered inspection
	 */
	public void setRegisteredNumber(String registeredNumber);

	/**
	 * Returns the dossier ID of this registered inspection.
	 *
	 * @return the dossier ID of this registered inspection
	 */
	public long getDossierId();

	/**
	 * Sets the dossier ID of this registered inspection.
	 *
	 * @param dossierId the dossier ID of this registered inspection
	 */
	public void setDossierId(long dossierId);

	/**
	 * Returns the attached file of this registered inspection.
	 *
	 * @return the attached file of this registered inspection
	 */
	public long getAttachedFile();

	/**
	 * Sets the attached file of this registered inspection.
	 *
	 * @param attachedFile the attached file of this registered inspection
	 */
	public void setAttachedFile(long attachedFile);

	/**
	 * Returns the importer code of this registered inspection.
	 *
	 * @return the importer code of this registered inspection
	 */
	@AutoEscape
	public String getImporterCode();

	/**
	 * Sets the importer code of this registered inspection.
	 *
	 * @param importerCode the importer code of this registered inspection
	 */
	public void setImporterCode(String importerCode);

	/**
	 * Returns the importer name of this registered inspection.
	 *
	 * @return the importer name of this registered inspection
	 */
	@AutoEscape
	public String getImporterName();

	/**
	 * Sets the importer name of this registered inspection.
	 *
	 * @param importerName the importer name of this registered inspection
	 */
	public void setImporterName(String importerName);

	/**
	 * Returns the importer address of this registered inspection.
	 *
	 * @return the importer address of this registered inspection
	 */
	@AutoEscape
	public String getImporterAddress();

	/**
	 * Sets the importer address of this registered inspection.
	 *
	 * @param importerAddress the importer address of this registered inspection
	 */
	public void setImporterAddress(String importerAddress);

	/**
	 * Returns the representative of this registered inspection.
	 *
	 * @return the representative of this registered inspection
	 */
	@AutoEscape
	public String getRepresentative();

	/**
	 * Sets the representative of this registered inspection.
	 *
	 * @param representative the representative of this registered inspection
	 */
	public void setRepresentative(String representative);

	/**
	 * Returns the phone of this registered inspection.
	 *
	 * @return the phone of this registered inspection
	 */
	@AutoEscape
	public String getPhone();

	/**
	 * Sets the phone of this registered inspection.
	 *
	 * @param phone the phone of this registered inspection
	 */
	public void setPhone(String phone);

	/**
	 * Returns the fax of this registered inspection.
	 *
	 * @return the fax of this registered inspection
	 */
	@AutoEscape
	public String getFax();

	/**
	 * Sets the fax of this registered inspection.
	 *
	 * @param fax the fax of this registered inspection
	 */
	public void setFax(String fax);

	/**
	 * Returns the email of this registered inspection.
	 *
	 * @return the email of this registered inspection
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this registered inspection.
	 *
	 * @param email the email of this registered inspection
	 */
	public void setEmail(String email);

	/**
	 * Returns the inspection date of this registered inspection.
	 *
	 * @return the inspection date of this registered inspection
	 */
	public Date getInspectionDate();

	/**
	 * Sets the inspection date of this registered inspection.
	 *
	 * @param inspectionDate the inspection date of this registered inspection
	 */
	public void setInspectionDate(Date inspectionDate);

	/**
	 * Returns the inspection site of this registered inspection.
	 *
	 * @return the inspection site of this registered inspection
	 */
	@AutoEscape
	public String getInspectionSite();

	/**
	 * Sets the inspection site of this registered inspection.
	 *
	 * @param inspectionSite the inspection site of this registered inspection
	 */
	public void setInspectionSite(String inspectionSite);

	/**
	 * Returns the inspection district code of this registered inspection.
	 *
	 * @return the inspection district code of this registered inspection
	 */
	@AutoEscape
	public String getInspectionDistrictCode();

	/**
	 * Sets the inspection district code of this registered inspection.
	 *
	 * @param inspectionDistrictCode the inspection district code of this registered inspection
	 */
	public void setInspectionDistrictCode(String inspectionDistrictCode);

	/**
	 * Returns the inspection province code of this registered inspection.
	 *
	 * @return the inspection province code of this registered inspection
	 */
	@AutoEscape
	public String getInspectionProvinceCode();

	/**
	 * Sets the inspection province code of this registered inspection.
	 *
	 * @param inspectionProvinceCode the inspection province code of this registered inspection
	 */
	public void setInspectionProvinceCode(String inspectionProvinceCode);

	/**
	 * Returns the contact name of this registered inspection.
	 *
	 * @return the contact name of this registered inspection
	 */
	@AutoEscape
	public String getContactName();

	/**
	 * Sets the contact name of this registered inspection.
	 *
	 * @param contactName the contact name of this registered inspection
	 */
	public void setContactName(String contactName);

	/**
	 * Returns the contact phone of this registered inspection.
	 *
	 * @return the contact phone of this registered inspection
	 */
	@AutoEscape
	public String getContactPhone();

	/**
	 * Sets the contact phone of this registered inspection.
	 *
	 * @param contactPhone the contact phone of this registered inspection
	 */
	public void setContactPhone(String contactPhone);

	/**
	 * Returns the contact email of this registered inspection.
	 *
	 * @return the contact email of this registered inspection
	 */
	@AutoEscape
	public String getContactEmail();

	/**
	 * Sets the contact email of this registered inspection.
	 *
	 * @param contactEmail the contact email of this registered inspection
	 */
	public void setContactEmail(String contactEmail);

	/**
	 * Returns the importer sign name of this registered inspection.
	 *
	 * @return the importer sign name of this registered inspection
	 */
	@AutoEscape
	public String getImporterSignName();

	/**
	 * Sets the importer sign name of this registered inspection.
	 *
	 * @param importerSignName the importer sign name of this registered inspection
	 */
	public void setImporterSignName(String importerSignName);

	/**
	 * Returns the importer sign title of this registered inspection.
	 *
	 * @return the importer sign title of this registered inspection
	 */
	@AutoEscape
	public String getImporterSignTitle();

	/**
	 * Sets the importer sign title of this registered inspection.
	 *
	 * @param importerSignTitle the importer sign title of this registered inspection
	 */
	public void setImporterSignTitle(String importerSignTitle);

	/**
	 * Returns the importer sign place of this registered inspection.
	 *
	 * @return the importer sign place of this registered inspection
	 */
	@AutoEscape
	public String getImporterSignPlace();

	/**
	 * Sets the importer sign place of this registered inspection.
	 *
	 * @param importerSignPlace the importer sign place of this registered inspection
	 */
	public void setImporterSignPlace(String importerSignPlace);

	/**
	 * Returns the importer sign date of this registered inspection.
	 *
	 * @return the importer sign date of this registered inspection
	 */
	public Date getImporterSignDate();

	/**
	 * Sets the importer sign date of this registered inspection.
	 *
	 * @param importerSignDate the importer sign date of this registered inspection
	 */
	public void setImporterSignDate(Date importerSignDate);

	/**
	 * Returns the inspector organization of this registered inspection.
	 *
	 * @return the inspector organization of this registered inspection
	 */
	@AutoEscape
	public String getInspectorOrganization();

	/**
	 * Sets the inspector organization of this registered inspection.
	 *
	 * @param inspectorOrganization the inspector organization of this registered inspection
	 */
	public void setInspectorOrganization(String inspectorOrganization);

	/**
	 * Returns the inspector division of this registered inspection.
	 *
	 * @return the inspector division of this registered inspection
	 */
	@AutoEscape
	public String getInspectorDivision();

	/**
	 * Sets the inspector division of this registered inspection.
	 *
	 * @param inspectorDivision the inspector division of this registered inspection
	 */
	public void setInspectorDivision(String inspectorDivision);

	/**
	 * Returns the inspector sig nname of this registered inspection.
	 *
	 * @return the inspector sig nname of this registered inspection
	 */
	@AutoEscape
	public String getInspectorSigNname();

	/**
	 * Sets the inspector sig nname of this registered inspection.
	 *
	 * @param inspectorSigNname the inspector sig nname of this registered inspection
	 */
	public void setInspectorSigNname(String inspectorSigNname);

	/**
	 * Returns the inspector sign title of this registered inspection.
	 *
	 * @return the inspector sign title of this registered inspection
	 */
	@AutoEscape
	public String getInspectorSignTitle();

	/**
	 * Sets the inspector sign title of this registered inspection.
	 *
	 * @param inspectorSignTitle the inspector sign title of this registered inspection
	 */
	public void setInspectorSignTitle(String inspectorSignTitle);

	/**
	 * Returns the inspector sign place of this registered inspection.
	 *
	 * @return the inspector sign place of this registered inspection
	 */
	@AutoEscape
	public String getInspectorSignPlace();

	/**
	 * Sets the inspector sign place of this registered inspection.
	 *
	 * @param inspectorSignPlace the inspector sign place of this registered inspection
	 */
	public void setInspectorSignPlace(String inspectorSignPlace);

	/**
	 * Returns the inspector sign date of this registered inspection.
	 *
	 * @return the inspector sign date of this registered inspection
	 */
	public Date getInspectorSignDate();

	/**
	 * Sets the inspector sign date of this registered inspection.
	 *
	 * @param inspectorSignDate the inspector sign date of this registered inspection
	 */
	public void setInspectorSignDate(Date inspectorSignDate);

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
		vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection registeredInspection);

	@Override
	public int hashCode();

	@Override
	public CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection> toCacheModel();

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection toEscapedModel();

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}