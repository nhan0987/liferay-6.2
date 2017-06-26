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
 * The base model interface for the ViewDangKiemTimKiem service. Represents a row in the &quot;view_dangkiemtimkiem&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ViewDangKiemTimKiemModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ViewDangKiemTimKiemImpl}.
 * </p>
 *
 * @author win_64
 * @see ViewDangKiemTimKiem
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.ViewDangKiemTimKiemImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.ViewDangKiemTimKiemModelImpl
 * @generated
 */
public interface ViewDangKiemTimKiemModel extends BaseModel<ViewDangKiemTimKiem> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a view dang kiem tim kiem model instance should use the {@link ViewDangKiemTimKiem} interface instead.
	 */

	/**
	 * Returns the primary key of this view dang kiem tim kiem.
	 *
	 * @return the primary key of this view dang kiem tim kiem
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this view dang kiem tim kiem.
	 *
	 * @param primaryKey the primary key of this view dang kiem tim kiem
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this view dang kiem tim kiem.
	 *
	 * @return the ID of this view dang kiem tim kiem
	 */
	public long getId();

	/**
	 * Sets the ID of this view dang kiem tim kiem.
	 *
	 * @param id the ID of this view dang kiem tim kiem
	 */
	public void setId(long id);

	/**
	 * Returns the vehicle group ID of this view dang kiem tim kiem.
	 *
	 * @return the vehicle group ID of this view dang kiem tim kiem
	 */
	public long getVehicleGroupId();

	/**
	 * Sets the vehicle group ID of this view dang kiem tim kiem.
	 *
	 * @param vehicleGroupId the vehicle group ID of this view dang kiem tim kiem
	 */
	public void setVehicleGroupId(long vehicleGroupId);

	/**
	 * Returns the debit note ID of this view dang kiem tim kiem.
	 *
	 * @return the debit note ID of this view dang kiem tim kiem
	 */
	public long getDebitNoteId();

	/**
	 * Sets the debit note ID of this view dang kiem tim kiem.
	 *
	 * @param debitNoteId the debit note ID of this view dang kiem tim kiem
	 */
	public void setDebitNoteId(long debitNoteId);

	/**
	 * Returns the sequence no of this view dang kiem tim kiem.
	 *
	 * @return the sequence no of this view dang kiem tim kiem
	 */
	public long getSequenceNo();

	/**
	 * Sets the sequence no of this view dang kiem tim kiem.
	 *
	 * @param sequenceNo the sequence no of this view dang kiem tim kiem
	 */
	public void setSequenceNo(long sequenceNo);

	/**
	 * Returns the code number of this view dang kiem tim kiem.
	 *
	 * @return the code number of this view dang kiem tim kiem
	 */
	public long getCodeNumber();

	/**
	 * Sets the code number of this view dang kiem tim kiem.
	 *
	 * @param codeNumber the code number of this view dang kiem tim kiem
	 */
	public void setCodeNumber(long codeNumber);

	/**
	 * Returns the chassis number of this view dang kiem tim kiem.
	 *
	 * @return the chassis number of this view dang kiem tim kiem
	 */
	@AutoEscape
	public String getChassisNumber();

	/**
	 * Sets the chassis number of this view dang kiem tim kiem.
	 *
	 * @param chassisNumber the chassis number of this view dang kiem tim kiem
	 */
	public void setChassisNumber(String chassisNumber);

	/**
	 * Returns the engine number of this view dang kiem tim kiem.
	 *
	 * @return the engine number of this view dang kiem tim kiem
	 */
	@AutoEscape
	public String getEngineNumber();

	/**
	 * Sets the engine number of this view dang kiem tim kiem.
	 *
	 * @param engineNumber the engine number of this view dang kiem tim kiem
	 */
	public void setEngineNumber(String engineNumber);

	/**
	 * Returns the production year of this view dang kiem tim kiem.
	 *
	 * @return the production year of this view dang kiem tim kiem
	 */
	public long getProductionYear();

	/**
	 * Sets the production year of this view dang kiem tim kiem.
	 *
	 * @param productionYear the production year of this view dang kiem tim kiem
	 */
	public void setProductionYear(long productionYear);

	/**
	 * Returns the vehicle engine status of this view dang kiem tim kiem.
	 *
	 * @return the vehicle engine status of this view dang kiem tim kiem
	 */
	@AutoEscape
	public String getVehicleEngineStatus();

	/**
	 * Sets the vehicle engine status of this view dang kiem tim kiem.
	 *
	 * @param vehicleEngineStatus the vehicle engine status of this view dang kiem tim kiem
	 */
	public void setVehicleEngineStatus(String vehicleEngineStatus);

	/**
	 * Returns the vehicle color of this view dang kiem tim kiem.
	 *
	 * @return the vehicle color of this view dang kiem tim kiem
	 */
	@AutoEscape
	public String getVehicleColor();

	/**
	 * Sets the vehicle color of this view dang kiem tim kiem.
	 *
	 * @param vehicleColor the vehicle color of this view dang kiem tim kiem
	 */
	public void setVehicleColor(String vehicleColor);

	/**
	 * Returns the unit price of this view dang kiem tim kiem.
	 *
	 * @return the unit price of this view dang kiem tim kiem
	 */
	public double getUnitPrice();

	/**
	 * Sets the unit price of this view dang kiem tim kiem.
	 *
	 * @param unitPrice the unit price of this view dang kiem tim kiem
	 */
	public void setUnitPrice(double unitPrice);

	/**
	 * Returns the currency of this view dang kiem tim kiem.
	 *
	 * @return the currency of this view dang kiem tim kiem
	 */
	@AutoEscape
	public String getCurrency();

	/**
	 * Sets the currency of this view dang kiem tim kiem.
	 *
	 * @param currency the currency of this view dang kiem tim kiem
	 */
	public void setCurrency(String currency);

	/**
	 * Returns the remarks of this view dang kiem tim kiem.
	 *
	 * @return the remarks of this view dang kiem tim kiem
	 */
	@AutoEscape
	public String getRemarks();

	/**
	 * Sets the remarks of this view dang kiem tim kiem.
	 *
	 * @param remarks the remarks of this view dang kiem tim kiem
	 */
	public void setRemarks(String remarks);

	/**
	 * Returns the confirmed inspection ID of this view dang kiem tim kiem.
	 *
	 * @return the confirmed inspection ID of this view dang kiem tim kiem
	 */
	public long getConfirmedInspectionId();

	/**
	 * Sets the confirmed inspection ID of this view dang kiem tim kiem.
	 *
	 * @param confirmedInspectionId the confirmed inspection ID of this view dang kiem tim kiem
	 */
	public void setConfirmedInspectionId(long confirmedInspectionId);

	/**
	 * Returns the inspection record ID of this view dang kiem tim kiem.
	 *
	 * @return the inspection record ID of this view dang kiem tim kiem
	 */
	public long getInspectionRecordId();

	/**
	 * Sets the inspection record ID of this view dang kiem tim kiem.
	 *
	 * @param inspectionRecordId the inspection record ID of this view dang kiem tim kiem
	 */
	public void setInspectionRecordId(long inspectionRecordId);

	/**
	 * Returns the draft certificate ID of this view dang kiem tim kiem.
	 *
	 * @return the draft certificate ID of this view dang kiem tim kiem
	 */
	public long getDraftCertificateId();

	/**
	 * Sets the draft certificate ID of this view dang kiem tim kiem.
	 *
	 * @param draftCertificateId the draft certificate ID of this view dang kiem tim kiem
	 */
	public void setDraftCertificateId(long draftCertificateId);

	/**
	 * Returns the certificate record ID of this view dang kiem tim kiem.
	 *
	 * @return the certificate record ID of this view dang kiem tim kiem
	 */
	public long getCertificateRecordId();

	/**
	 * Sets the certificate record ID of this view dang kiem tim kiem.
	 *
	 * @param certificateRecordId the certificate record ID of this view dang kiem tim kiem
	 */
	public void setCertificateRecordId(long certificateRecordId);

	/**
	 * Returns the mark up status of this view dang kiem tim kiem.
	 *
	 * @return the mark up status of this view dang kiem tim kiem
	 */
	public long getMarkUpStatus();

	/**
	 * Sets the mark up status of this view dang kiem tim kiem.
	 *
	 * @param markUpStatus the mark up status of this view dang kiem tim kiem
	 */
	public void setMarkUpStatus(long markUpStatus);

	/**
	 * Returns the safe test requirement ID of this view dang kiem tim kiem.
	 *
	 * @return the safe test requirement ID of this view dang kiem tim kiem
	 */
	public long getSafeTestRequirementId();

	/**
	 * Sets the safe test requirement ID of this view dang kiem tim kiem.
	 *
	 * @param safeTestRequirementId the safe test requirement ID of this view dang kiem tim kiem
	 */
	public void setSafeTestRequirementId(long safeTestRequirementId);

	/**
	 * Returns the emission test requirement ID of this view dang kiem tim kiem.
	 *
	 * @return the emission test requirement ID of this view dang kiem tim kiem
	 */
	public long getEmissionTestRequirementId();

	/**
	 * Sets the emission test requirement ID of this view dang kiem tim kiem.
	 *
	 * @param emissionTestRequirementId the emission test requirement ID of this view dang kiem tim kiem
	 */
	public void setEmissionTestRequirementId(long emissionTestRequirementId);

	/**
	 * Returns the control requirement ID of this view dang kiem tim kiem.
	 *
	 * @return the control requirement ID of this view dang kiem tim kiem
	 */
	public long getControlRequirementId();

	/**
	 * Sets the control requirement ID of this view dang kiem tim kiem.
	 *
	 * @param controlRequirementId the control requirement ID of this view dang kiem tim kiem
	 */
	public void setControlRequirementId(long controlRequirementId);

	/**
	 * Returns the mark as sample of this view dang kiem tim kiem.
	 *
	 * @return the mark as sample of this view dang kiem tim kiem
	 */
	public int getMarkAsSample();

	/**
	 * Sets the mark as sample of this view dang kiem tim kiem.
	 *
	 * @param markAsSample the mark as sample of this view dang kiem tim kiem
	 */
	public void setMarkAsSample(int markAsSample);

	/**
	 * Returns the inspectionrecordno of this view dang kiem tim kiem.
	 *
	 * @return the inspectionrecordno of this view dang kiem tim kiem
	 */
	@AutoEscape
	public String getInspectionrecordno();

	/**
	 * Sets the inspectionrecordno of this view dang kiem tim kiem.
	 *
	 * @param inspectionrecordno the inspectionrecordno of this view dang kiem tim kiem
	 */
	public void setInspectionrecordno(String inspectionrecordno);

	/**
	 * Returns the inspection record date of this view dang kiem tim kiem.
	 *
	 * @return the inspection record date of this view dang kiem tim kiem
	 */
	public Date getInspectionRecordDate();

	/**
	 * Sets the inspection record date of this view dang kiem tim kiem.
	 *
	 * @param inspectionRecordDate the inspection record date of this view dang kiem tim kiem
	 */
	public void setInspectionRecordDate(Date inspectionRecordDate);

	/**
	 * Returns the attached file bbkt of this view dang kiem tim kiem.
	 *
	 * @return the attached file bbkt of this view dang kiem tim kiem
	 */
	public long getAttachedFileBbkt();

	/**
	 * Sets the attached file bbkt of this view dang kiem tim kiem.
	 *
	 * @param attachedFileBbkt the attached file bbkt of this view dang kiem tim kiem
	 */
	public void setAttachedFileBbkt(long attachedFileBbkt);

	/**
	 * Returns the certificate number of this view dang kiem tim kiem.
	 *
	 * @return the certificate number of this view dang kiem tim kiem
	 */
	@AutoEscape
	public String getCertificateNumber();

	/**
	 * Sets the certificate number of this view dang kiem tim kiem.
	 *
	 * @param certificateNumber the certificate number of this view dang kiem tim kiem
	 */
	public void setCertificateNumber(String certificateNumber);

	/**
	 * Returns the sign date of this view dang kiem tim kiem.
	 *
	 * @return the sign date of this view dang kiem tim kiem
	 */
	public Date getSignDate();

	/**
	 * Sets the sign date of this view dang kiem tim kiem.
	 *
	 * @param signDate the sign date of this view dang kiem tim kiem
	 */
	public void setSignDate(Date signDate);

	/**
	 * Returns the attached file of this view dang kiem tim kiem.
	 *
	 * @return the attached file of this view dang kiem tim kiem
	 */
	public long getAttachedFile();

	/**
	 * Sets the attached file of this view dang kiem tim kiem.
	 *
	 * @param attachedFile the attached file of this view dang kiem tim kiem
	 */
	public void setAttachedFile(long attachedFile);

	/**
	 * Returns the registered number of this view dang kiem tim kiem.
	 *
	 * @return the registered number of this view dang kiem tim kiem
	 */
	@AutoEscape
	public String getRegisteredNumber();

	/**
	 * Sets the registered number of this view dang kiem tim kiem.
	 *
	 * @param registeredNumber the registered number of this view dang kiem tim kiem
	 */
	public void setRegisteredNumber(String registeredNumber);

	/**
	 * Returns the inspector sign date of this view dang kiem tim kiem.
	 *
	 * @return the inspector sign date of this view dang kiem tim kiem
	 */
	public Date getInspectorSignDate();

	/**
	 * Sets the inspector sign date of this view dang kiem tim kiem.
	 *
	 * @param inspectorSignDate the inspector sign date of this view dang kiem tim kiem
	 */
	public void setInspectorSignDate(Date inspectorSignDate);

	/**
	 * Returns the vehicle class of this view dang kiem tim kiem.
	 *
	 * @return the vehicle class of this view dang kiem tim kiem
	 */
	@AutoEscape
	public String getVehicleClass();

	/**
	 * Sets the vehicle class of this view dang kiem tim kiem.
	 *
	 * @param vehicleClass the vehicle class of this view dang kiem tim kiem
	 */
	public void setVehicleClass(String vehicleClass);

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
	public int compareTo(ViewDangKiemTimKiem viewDangKiemTimKiem);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ViewDangKiemTimKiem> toCacheModel();

	@Override
	public ViewDangKiemTimKiem toEscapedModel();

	@Override
	public ViewDangKiemTimKiem toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}