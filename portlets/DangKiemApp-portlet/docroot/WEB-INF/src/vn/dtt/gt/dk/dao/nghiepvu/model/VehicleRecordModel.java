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
 * The base model interface for the VehicleRecord service. Represents a row in the &quot;vr_vehiclerecord&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordImpl}.
 * </p>
 *
 * @author win_64
 * @see VehicleRecord
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl
 * @generated
 */
public interface VehicleRecordModel extends BaseModel<VehicleRecord> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a vehicle record model instance should use the {@link VehicleRecord} interface instead.
	 */

	/**
	 * Returns the primary key of this vehicle record.
	 *
	 * @return the primary key of this vehicle record
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this vehicle record.
	 *
	 * @param primaryKey the primary key of this vehicle record
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this vehicle record.
	 *
	 * @return the ID of this vehicle record
	 */
	public long getId();

	/**
	 * Sets the ID of this vehicle record.
	 *
	 * @param id the ID of this vehicle record
	 */
	public void setId(long id);

	/**
	 * Returns the vehicle group ID of this vehicle record.
	 *
	 * @return the vehicle group ID of this vehicle record
	 */
	public long getVehicleGroupId();

	/**
	 * Sets the vehicle group ID of this vehicle record.
	 *
	 * @param vehicleGroupId the vehicle group ID of this vehicle record
	 */
	public void setVehicleGroupId(long vehicleGroupId);

	/**
	 * Returns the debit note ID of this vehicle record.
	 *
	 * @return the debit note ID of this vehicle record
	 */
	public long getDebitNoteId();

	/**
	 * Sets the debit note ID of this vehicle record.
	 *
	 * @param debitNoteId the debit note ID of this vehicle record
	 */
	public void setDebitNoteId(long debitNoteId);

	/**
	 * Returns the sequence no of this vehicle record.
	 *
	 * @return the sequence no of this vehicle record
	 */
	public long getSequenceNo();

	/**
	 * Sets the sequence no of this vehicle record.
	 *
	 * @param sequenceNo the sequence no of this vehicle record
	 */
	public void setSequenceNo(long sequenceNo);

	/**
	 * Returns the code number of this vehicle record.
	 *
	 * @return the code number of this vehicle record
	 */
	public long getCodeNumber();

	/**
	 * Sets the code number of this vehicle record.
	 *
	 * @param codeNumber the code number of this vehicle record
	 */
	public void setCodeNumber(long codeNumber);

	/**
	 * Returns the chassis number of this vehicle record.
	 *
	 * @return the chassis number of this vehicle record
	 */
	@AutoEscape
	public String getChassisNumber();

	/**
	 * Sets the chassis number of this vehicle record.
	 *
	 * @param chassisNumber the chassis number of this vehicle record
	 */
	public void setChassisNumber(String chassisNumber);

	/**
	 * Returns the engine number of this vehicle record.
	 *
	 * @return the engine number of this vehicle record
	 */
	@AutoEscape
	public String getEngineNumber();

	/**
	 * Sets the engine number of this vehicle record.
	 *
	 * @param engineNumber the engine number of this vehicle record
	 */
	public void setEngineNumber(String engineNumber);

	/**
	 * Returns the production year of this vehicle record.
	 *
	 * @return the production year of this vehicle record
	 */
	@AutoEscape
	public String getProductionYear();

	/**
	 * Sets the production year of this vehicle record.
	 *
	 * @param productionYear the production year of this vehicle record
	 */
	public void setProductionYear(String productionYear);

	/**
	 * Returns the vehicle engine status of this vehicle record.
	 *
	 * @return the vehicle engine status of this vehicle record
	 */
	@AutoEscape
	public String getVehicleEngineStatus();

	/**
	 * Sets the vehicle engine status of this vehicle record.
	 *
	 * @param vehicleEngineStatus the vehicle engine status of this vehicle record
	 */
	public void setVehicleEngineStatus(String vehicleEngineStatus);

	/**
	 * Returns the vehicle color of this vehicle record.
	 *
	 * @return the vehicle color of this vehicle record
	 */
	@AutoEscape
	public String getVehicleColor();

	/**
	 * Sets the vehicle color of this vehicle record.
	 *
	 * @param vehicleColor the vehicle color of this vehicle record
	 */
	public void setVehicleColor(String vehicleColor);

	/**
	 * Returns the unit price of this vehicle record.
	 *
	 * @return the unit price of this vehicle record
	 */
	public double getUnitPrice();

	/**
	 * Sets the unit price of this vehicle record.
	 *
	 * @param unitPrice the unit price of this vehicle record
	 */
	public void setUnitPrice(double unitPrice);

	/**
	 * Returns the currency of this vehicle record.
	 *
	 * @return the currency of this vehicle record
	 */
	@AutoEscape
	public String getCurrency();

	/**
	 * Sets the currency of this vehicle record.
	 *
	 * @param currency the currency of this vehicle record
	 */
	public void setCurrency(String currency);

	/**
	 * Returns the remarks of this vehicle record.
	 *
	 * @return the remarks of this vehicle record
	 */
	@AutoEscape
	public String getRemarks();

	/**
	 * Sets the remarks of this vehicle record.
	 *
	 * @param remarks the remarks of this vehicle record
	 */
	public void setRemarks(String remarks);

	/**
	 * Returns the confirmed inspection ID of this vehicle record.
	 *
	 * @return the confirmed inspection ID of this vehicle record
	 */
	public long getConfirmedInspectionId();

	/**
	 * Sets the confirmed inspection ID of this vehicle record.
	 *
	 * @param confirmedInspectionId the confirmed inspection ID of this vehicle record
	 */
	public void setConfirmedInspectionId(long confirmedInspectionId);

	/**
	 * Returns the inspection record ID of this vehicle record.
	 *
	 * @return the inspection record ID of this vehicle record
	 */
	public long getInspectionRecordId();

	/**
	 * Sets the inspection record ID of this vehicle record.
	 *
	 * @param inspectionRecordId the inspection record ID of this vehicle record
	 */
	public void setInspectionRecordId(long inspectionRecordId);

	/**
	 * Returns the draft certificate ID of this vehicle record.
	 *
	 * @return the draft certificate ID of this vehicle record
	 */
	public long getDraftCertificateId();

	/**
	 * Sets the draft certificate ID of this vehicle record.
	 *
	 * @param draftCertificateId the draft certificate ID of this vehicle record
	 */
	public void setDraftCertificateId(long draftCertificateId);

	/**
	 * Returns the certificate record ID of this vehicle record.
	 *
	 * @return the certificate record ID of this vehicle record
	 */
	public long getCertificateRecordId();

	/**
	 * Sets the certificate record ID of this vehicle record.
	 *
	 * @param certificateRecordId the certificate record ID of this vehicle record
	 */
	public void setCertificateRecordId(long certificateRecordId);

	/**
	 * Returns the mark up status of this vehicle record.
	 *
	 * @return the mark up status of this vehicle record
	 */
	public long getMarkUpStatus();

	/**
	 * Sets the mark up status of this vehicle record.
	 *
	 * @param markUpStatus the mark up status of this vehicle record
	 */
	public void setMarkUpStatus(long markUpStatus);

	/**
	 * Returns the safe test requirement ID of this vehicle record.
	 *
	 * @return the safe test requirement ID of this vehicle record
	 */
	public long getSafeTestRequirementId();

	/**
	 * Sets the safe test requirement ID of this vehicle record.
	 *
	 * @param safeTestRequirementId the safe test requirement ID of this vehicle record
	 */
	public void setSafeTestRequirementId(long safeTestRequirementId);

	/**
	 * Returns the emission test requirement ID of this vehicle record.
	 *
	 * @return the emission test requirement ID of this vehicle record
	 */
	public long getEmissionTestRequirementId();

	/**
	 * Sets the emission test requirement ID of this vehicle record.
	 *
	 * @param emissionTestRequirementId the emission test requirement ID of this vehicle record
	 */
	public void setEmissionTestRequirementId(long emissionTestRequirementId);

	/**
	 * Returns the control requirement ID of this vehicle record.
	 *
	 * @return the control requirement ID of this vehicle record
	 */
	public long getControlRequirementId();

	/**
	 * Sets the control requirement ID of this vehicle record.
	 *
	 * @param controlRequirementId the control requirement ID of this vehicle record
	 */
	public void setControlRequirementId(long controlRequirementId);

	/**
	 * Returns the mark as sample of this vehicle record.
	 *
	 * @return the mark as sample of this vehicle record
	 */
	public int getMarkAsSample();

	/**
	 * Sets the mark as sample of this vehicle record.
	 *
	 * @param markAsSample the mark as sample of this vehicle record
	 */
	public void setMarkAsSample(int markAsSample);

	/**
	 * Returns the synch date of this vehicle record.
	 *
	 * @return the synch date of this vehicle record
	 */
	public Date getSynchDate();

	/**
	 * Sets the synch date of this vehicle record.
	 *
	 * @param SynchDate the synch date of this vehicle record
	 */
	public void setSynchDate(Date SynchDate);

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
	public int compareTo(VehicleRecord vehicleRecord);

	@Override
	public int hashCode();

	@Override
	public CacheModel<VehicleRecord> toCacheModel();

	@Override
	public VehicleRecord toEscapedModel();

	@Override
	public VehicleRecord toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}