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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link THONGSOCHUNGCHIDONGCO}.
 * </p>
 *
 * @author win_64
 * @see THONGSOCHUNGCHIDONGCO
 * @generated
 */
public class THONGSOCHUNGCHIDONGCOWrapper implements THONGSOCHUNGCHIDONGCO,
	ModelWrapper<THONGSOCHUNGCHIDONGCO> {
	public THONGSOCHUNGCHIDONGCOWrapper(
		THONGSOCHUNGCHIDONGCO thongsochungchidongco) {
		_thongsochungchidongco = thongsochungchidongco;
	}

	@Override
	public Class<?> getModelClass() {
		return THONGSOCHUNGCHIDONGCO.class;
	}

	@Override
	public String getModelClassName() {
		return THONGSOCHUNGCHIDONGCO.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("hoSoThuTucId", getHoSoThuTucId());
		attributes.put("certificateRecordId", getCertificateRecordId());
		attributes.put("vehicleGroupId", getVehicleGroupId());
		attributes.put("SynchDate", getSynchDate());
		attributes.put("DCX0007", getDCX0007());
		attributes.put("DCX0008", getDCX0008());
		attributes.put("DCX0010", getDCX0010());
		attributes.put("DCX0011", getDCX0011());
		attributes.put("DCX0012", getDCX0012());
		attributes.put("DCX1012", getDCX1012());
		attributes.put("DCX0013", getDCX0013());
		attributes.put("DCX1013", getDCX1013());
		attributes.put("DCX0014", getDCX0014());
		attributes.put("DCX0015", getDCX0015());
		attributes.put("DCX0016", getDCX0016());
		attributes.put("DCX0017", getDCX0017());
		attributes.put("DCX0018", getDCX0018());
		attributes.put("DCX0019", getDCX0019());
		attributes.put("DCX0021", getDCX0021());
		attributes.put("DCX0022", getDCX0022());
		attributes.put("DCX0023", getDCX0023());
		attributes.put("DCX0024", getDCX0024());
		attributes.put("DCX0006", getDCX0006());
		attributes.put("DCX0025", getDCX0025());
		attributes.put("DCX0026", getDCX0026());
		attributes.put("DCX0027", getDCX0027());
		attributes.put("DCX0028", getDCX0028());
		attributes.put("DCX0029", getDCX0029());
		attributes.put("DCX0030", getDCX0030());
		attributes.put("DCX0031", getDCX0031());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long hoSoThuTucId = (Long)attributes.get("hoSoThuTucId");

		if (hoSoThuTucId != null) {
			setHoSoThuTucId(hoSoThuTucId);
		}

		Long certificateRecordId = (Long)attributes.get("certificateRecordId");

		if (certificateRecordId != null) {
			setCertificateRecordId(certificateRecordId);
		}

		Long vehicleGroupId = (Long)attributes.get("vehicleGroupId");

		if (vehicleGroupId != null) {
			setVehicleGroupId(vehicleGroupId);
		}

		Date SynchDate = (Date)attributes.get("SynchDate");

		if (SynchDate != null) {
			setSynchDate(SynchDate);
		}

		String DCX0007 = (String)attributes.get("DCX0007");

		if (DCX0007 != null) {
			setDCX0007(DCX0007);
		}

		String DCX0008 = (String)attributes.get("DCX0008");

		if (DCX0008 != null) {
			setDCX0008(DCX0008);
		}

		String DCX0010 = (String)attributes.get("DCX0010");

		if (DCX0010 != null) {
			setDCX0010(DCX0010);
		}

		String DCX0011 = (String)attributes.get("DCX0011");

		if (DCX0011 != null) {
			setDCX0011(DCX0011);
		}

		String DCX0012 = (String)attributes.get("DCX0012");

		if (DCX0012 != null) {
			setDCX0012(DCX0012);
		}

		String DCX1012 = (String)attributes.get("DCX1012");

		if (DCX1012 != null) {
			setDCX1012(DCX1012);
		}

		String DCX0013 = (String)attributes.get("DCX0013");

		if (DCX0013 != null) {
			setDCX0013(DCX0013);
		}

		String DCX1013 = (String)attributes.get("DCX1013");

		if (DCX1013 != null) {
			setDCX1013(DCX1013);
		}

		String DCX0014 = (String)attributes.get("DCX0014");

		if (DCX0014 != null) {
			setDCX0014(DCX0014);
		}

		String DCX0015 = (String)attributes.get("DCX0015");

		if (DCX0015 != null) {
			setDCX0015(DCX0015);
		}

		String DCX0016 = (String)attributes.get("DCX0016");

		if (DCX0016 != null) {
			setDCX0016(DCX0016);
		}

		String DCX0017 = (String)attributes.get("DCX0017");

		if (DCX0017 != null) {
			setDCX0017(DCX0017);
		}

		String DCX0018 = (String)attributes.get("DCX0018");

		if (DCX0018 != null) {
			setDCX0018(DCX0018);
		}

		String DCX0019 = (String)attributes.get("DCX0019");

		if (DCX0019 != null) {
			setDCX0019(DCX0019);
		}

		String DCX0021 = (String)attributes.get("DCX0021");

		if (DCX0021 != null) {
			setDCX0021(DCX0021);
		}

		String DCX0022 = (String)attributes.get("DCX0022");

		if (DCX0022 != null) {
			setDCX0022(DCX0022);
		}

		String DCX0023 = (String)attributes.get("DCX0023");

		if (DCX0023 != null) {
			setDCX0023(DCX0023);
		}

		String DCX0024 = (String)attributes.get("DCX0024");

		if (DCX0024 != null) {
			setDCX0024(DCX0024);
		}

		String DCX0006 = (String)attributes.get("DCX0006");

		if (DCX0006 != null) {
			setDCX0006(DCX0006);
		}

		String DCX0025 = (String)attributes.get("DCX0025");

		if (DCX0025 != null) {
			setDCX0025(DCX0025);
		}

		String DCX0026 = (String)attributes.get("DCX0026");

		if (DCX0026 != null) {
			setDCX0026(DCX0026);
		}

		String DCX0027 = (String)attributes.get("DCX0027");

		if (DCX0027 != null) {
			setDCX0027(DCX0027);
		}

		String DCX0028 = (String)attributes.get("DCX0028");

		if (DCX0028 != null) {
			setDCX0028(DCX0028);
		}

		String DCX0029 = (String)attributes.get("DCX0029");

		if (DCX0029 != null) {
			setDCX0029(DCX0029);
		}

		String DCX0030 = (String)attributes.get("DCX0030");

		if (DCX0030 != null) {
			setDCX0030(DCX0030);
		}

		String DCX0031 = (String)attributes.get("DCX0031");

		if (DCX0031 != null) {
			setDCX0031(DCX0031);
		}
	}

	/**
	* Returns the primary key of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @return the primary key of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public long getPrimaryKey() {
		return _thongsochungchidongco.getPrimaryKey();
	}

	/**
	* Sets the primary key of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @param primaryKey the primary key of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_thongsochungchidongco.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @return the ID of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public long getId() {
		return _thongsochungchidongco.getId();
	}

	/**
	* Sets the ID of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @param id the ID of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public void setId(long id) {
		_thongsochungchidongco.setId(id);
	}

	/**
	* Returns the ho so thu tuc ID of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @return the ho so thu tuc ID of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public long getHoSoThuTucId() {
		return _thongsochungchidongco.getHoSoThuTucId();
	}

	/**
	* Sets the ho so thu tuc ID of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @param hoSoThuTucId the ho so thu tuc ID of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_thongsochungchidongco.setHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the certificate record ID of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @return the certificate record ID of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public long getCertificateRecordId() {
		return _thongsochungchidongco.getCertificateRecordId();
	}

	/**
	* Sets the certificate record ID of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @param certificateRecordId the certificate record ID of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public void setCertificateRecordId(long certificateRecordId) {
		_thongsochungchidongco.setCertificateRecordId(certificateRecordId);
	}

	/**
	* Returns the vehicle group ID of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @return the vehicle group ID of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public long getVehicleGroupId() {
		return _thongsochungchidongco.getVehicleGroupId();
	}

	/**
	* Sets the vehicle group ID of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @param vehicleGroupId the vehicle group ID of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public void setVehicleGroupId(long vehicleGroupId) {
		_thongsochungchidongco.setVehicleGroupId(vehicleGroupId);
	}

	/**
	* Returns the synch date of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @return the synch date of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public java.util.Date getSynchDate() {
		return _thongsochungchidongco.getSynchDate();
	}

	/**
	* Sets the synch date of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @param SynchDate the synch date of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public void setSynchDate(java.util.Date SynchDate) {
		_thongsochungchidongco.setSynchDate(SynchDate);
	}

	/**
	* Returns the d c x0007 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @return the d c x0007 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public java.lang.String getDCX0007() {
		return _thongsochungchidongco.getDCX0007();
	}

	/**
	* Sets the d c x0007 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @param DCX0007 the d c x0007 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public void setDCX0007(java.lang.String DCX0007) {
		_thongsochungchidongco.setDCX0007(DCX0007);
	}

	/**
	* Returns the d c x0008 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @return the d c x0008 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public java.lang.String getDCX0008() {
		return _thongsochungchidongco.getDCX0008();
	}

	/**
	* Sets the d c x0008 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @param DCX0008 the d c x0008 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public void setDCX0008(java.lang.String DCX0008) {
		_thongsochungchidongco.setDCX0008(DCX0008);
	}

	/**
	* Returns the d c x0010 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @return the d c x0010 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public java.lang.String getDCX0010() {
		return _thongsochungchidongco.getDCX0010();
	}

	/**
	* Sets the d c x0010 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @param DCX0010 the d c x0010 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public void setDCX0010(java.lang.String DCX0010) {
		_thongsochungchidongco.setDCX0010(DCX0010);
	}

	/**
	* Returns the d c x0011 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @return the d c x0011 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public java.lang.String getDCX0011() {
		return _thongsochungchidongco.getDCX0011();
	}

	/**
	* Sets the d c x0011 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @param DCX0011 the d c x0011 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public void setDCX0011(java.lang.String DCX0011) {
		_thongsochungchidongco.setDCX0011(DCX0011);
	}

	/**
	* Returns the d c x0012 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @return the d c x0012 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public java.lang.String getDCX0012() {
		return _thongsochungchidongco.getDCX0012();
	}

	/**
	* Sets the d c x0012 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @param DCX0012 the d c x0012 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public void setDCX0012(java.lang.String DCX0012) {
		_thongsochungchidongco.setDCX0012(DCX0012);
	}

	/**
	* Returns the d c x1012 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @return the d c x1012 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public java.lang.String getDCX1012() {
		return _thongsochungchidongco.getDCX1012();
	}

	/**
	* Sets the d c x1012 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @param DCX1012 the d c x1012 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public void setDCX1012(java.lang.String DCX1012) {
		_thongsochungchidongco.setDCX1012(DCX1012);
	}

	/**
	* Returns the d c x0013 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @return the d c x0013 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public java.lang.String getDCX0013() {
		return _thongsochungchidongco.getDCX0013();
	}

	/**
	* Sets the d c x0013 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @param DCX0013 the d c x0013 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public void setDCX0013(java.lang.String DCX0013) {
		_thongsochungchidongco.setDCX0013(DCX0013);
	}

	/**
	* Returns the d c x1013 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @return the d c x1013 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public java.lang.String getDCX1013() {
		return _thongsochungchidongco.getDCX1013();
	}

	/**
	* Sets the d c x1013 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @param DCX1013 the d c x1013 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public void setDCX1013(java.lang.String DCX1013) {
		_thongsochungchidongco.setDCX1013(DCX1013);
	}

	/**
	* Returns the d c x0014 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @return the d c x0014 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public java.lang.String getDCX0014() {
		return _thongsochungchidongco.getDCX0014();
	}

	/**
	* Sets the d c x0014 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @param DCX0014 the d c x0014 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public void setDCX0014(java.lang.String DCX0014) {
		_thongsochungchidongco.setDCX0014(DCX0014);
	}

	/**
	* Returns the d c x0015 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @return the d c x0015 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public java.lang.String getDCX0015() {
		return _thongsochungchidongco.getDCX0015();
	}

	/**
	* Sets the d c x0015 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @param DCX0015 the d c x0015 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public void setDCX0015(java.lang.String DCX0015) {
		_thongsochungchidongco.setDCX0015(DCX0015);
	}

	/**
	* Returns the d c x0016 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @return the d c x0016 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public java.lang.String getDCX0016() {
		return _thongsochungchidongco.getDCX0016();
	}

	/**
	* Sets the d c x0016 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @param DCX0016 the d c x0016 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public void setDCX0016(java.lang.String DCX0016) {
		_thongsochungchidongco.setDCX0016(DCX0016);
	}

	/**
	* Returns the d c x0017 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @return the d c x0017 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public java.lang.String getDCX0017() {
		return _thongsochungchidongco.getDCX0017();
	}

	/**
	* Sets the d c x0017 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @param DCX0017 the d c x0017 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public void setDCX0017(java.lang.String DCX0017) {
		_thongsochungchidongco.setDCX0017(DCX0017);
	}

	/**
	* Returns the d c x0018 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @return the d c x0018 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public java.lang.String getDCX0018() {
		return _thongsochungchidongco.getDCX0018();
	}

	/**
	* Sets the d c x0018 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @param DCX0018 the d c x0018 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public void setDCX0018(java.lang.String DCX0018) {
		_thongsochungchidongco.setDCX0018(DCX0018);
	}

	/**
	* Returns the d c x0019 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @return the d c x0019 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public java.lang.String getDCX0019() {
		return _thongsochungchidongco.getDCX0019();
	}

	/**
	* Sets the d c x0019 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @param DCX0019 the d c x0019 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public void setDCX0019(java.lang.String DCX0019) {
		_thongsochungchidongco.setDCX0019(DCX0019);
	}

	/**
	* Returns the d c x0021 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @return the d c x0021 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public java.lang.String getDCX0021() {
		return _thongsochungchidongco.getDCX0021();
	}

	/**
	* Sets the d c x0021 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @param DCX0021 the d c x0021 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public void setDCX0021(java.lang.String DCX0021) {
		_thongsochungchidongco.setDCX0021(DCX0021);
	}

	/**
	* Returns the d c x0022 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @return the d c x0022 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public java.lang.String getDCX0022() {
		return _thongsochungchidongco.getDCX0022();
	}

	/**
	* Sets the d c x0022 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @param DCX0022 the d c x0022 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public void setDCX0022(java.lang.String DCX0022) {
		_thongsochungchidongco.setDCX0022(DCX0022);
	}

	/**
	* Returns the d c x0023 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @return the d c x0023 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public java.lang.String getDCX0023() {
		return _thongsochungchidongco.getDCX0023();
	}

	/**
	* Sets the d c x0023 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @param DCX0023 the d c x0023 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public void setDCX0023(java.lang.String DCX0023) {
		_thongsochungchidongco.setDCX0023(DCX0023);
	}

	/**
	* Returns the d c x0024 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @return the d c x0024 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public java.lang.String getDCX0024() {
		return _thongsochungchidongco.getDCX0024();
	}

	/**
	* Sets the d c x0024 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @param DCX0024 the d c x0024 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public void setDCX0024(java.lang.String DCX0024) {
		_thongsochungchidongco.setDCX0024(DCX0024);
	}

	/**
	* Returns the d c x0006 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @return the d c x0006 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public java.lang.String getDCX0006() {
		return _thongsochungchidongco.getDCX0006();
	}

	/**
	* Sets the d c x0006 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @param DCX0006 the d c x0006 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public void setDCX0006(java.lang.String DCX0006) {
		_thongsochungchidongco.setDCX0006(DCX0006);
	}

	/**
	* Returns the d c x0025 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @return the d c x0025 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public java.lang.String getDCX0025() {
		return _thongsochungchidongco.getDCX0025();
	}

	/**
	* Sets the d c x0025 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @param DCX0025 the d c x0025 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public void setDCX0025(java.lang.String DCX0025) {
		_thongsochungchidongco.setDCX0025(DCX0025);
	}

	/**
	* Returns the d c x0026 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @return the d c x0026 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public java.lang.String getDCX0026() {
		return _thongsochungchidongco.getDCX0026();
	}

	/**
	* Sets the d c x0026 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @param DCX0026 the d c x0026 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public void setDCX0026(java.lang.String DCX0026) {
		_thongsochungchidongco.setDCX0026(DCX0026);
	}

	/**
	* Returns the d c x0027 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @return the d c x0027 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public java.lang.String getDCX0027() {
		return _thongsochungchidongco.getDCX0027();
	}

	/**
	* Sets the d c x0027 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @param DCX0027 the d c x0027 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public void setDCX0027(java.lang.String DCX0027) {
		_thongsochungchidongco.setDCX0027(DCX0027);
	}

	/**
	* Returns the d c x0028 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @return the d c x0028 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public java.lang.String getDCX0028() {
		return _thongsochungchidongco.getDCX0028();
	}

	/**
	* Sets the d c x0028 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @param DCX0028 the d c x0028 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public void setDCX0028(java.lang.String DCX0028) {
		_thongsochungchidongco.setDCX0028(DCX0028);
	}

	/**
	* Returns the d c x0029 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @return the d c x0029 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public java.lang.String getDCX0029() {
		return _thongsochungchidongco.getDCX0029();
	}

	/**
	* Sets the d c x0029 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @param DCX0029 the d c x0029 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public void setDCX0029(java.lang.String DCX0029) {
		_thongsochungchidongco.setDCX0029(DCX0029);
	}

	/**
	* Returns the d c x0030 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @return the d c x0030 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public java.lang.String getDCX0030() {
		return _thongsochungchidongco.getDCX0030();
	}

	/**
	* Sets the d c x0030 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @param DCX0030 the d c x0030 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public void setDCX0030(java.lang.String DCX0030) {
		_thongsochungchidongco.setDCX0030(DCX0030);
	}

	/**
	* Returns the d c x0031 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @return the d c x0031 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public java.lang.String getDCX0031() {
		return _thongsochungchidongco.getDCX0031();
	}

	/**
	* Sets the d c x0031 of this t h o n g s o c h u n g c h i d o n g c o.
	*
	* @param DCX0031 the d c x0031 of this t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public void setDCX0031(java.lang.String DCX0031) {
		_thongsochungchidongco.setDCX0031(DCX0031);
	}

	@Override
	public boolean isNew() {
		return _thongsochungchidongco.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_thongsochungchidongco.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _thongsochungchidongco.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_thongsochungchidongco.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _thongsochungchidongco.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _thongsochungchidongco.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_thongsochungchidongco.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _thongsochungchidongco.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_thongsochungchidongco.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_thongsochungchidongco.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_thongsochungchidongco.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new THONGSOCHUNGCHIDONGCOWrapper((THONGSOCHUNGCHIDONGCO)_thongsochungchidongco.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIDONGCO thongsochungchidongco) {
		return _thongsochungchidongco.compareTo(thongsochungchidongco);
	}

	@Override
	public int hashCode() {
		return _thongsochungchidongco.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIDONGCO> toCacheModel() {
		return _thongsochungchidongco.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIDONGCO toEscapedModel() {
		return new THONGSOCHUNGCHIDONGCOWrapper(_thongsochungchidongco.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIDONGCO toUnescapedModel() {
		return new THONGSOCHUNGCHIDONGCOWrapper(_thongsochungchidongco.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _thongsochungchidongco.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _thongsochungchidongco.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_thongsochungchidongco.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof THONGSOCHUNGCHIDONGCOWrapper)) {
			return false;
		}

		THONGSOCHUNGCHIDONGCOWrapper thongsochungchidongcoWrapper = (THONGSOCHUNGCHIDONGCOWrapper)obj;

		if (Validator.equals(_thongsochungchidongco,
					thongsochungchidongcoWrapper._thongsochungchidongco)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public THONGSOCHUNGCHIDONGCO getWrappedTHONGSOCHUNGCHIDONGCO() {
		return _thongsochungchidongco;
	}

	@Override
	public THONGSOCHUNGCHIDONGCO getWrappedModel() {
		return _thongsochungchidongco;
	}

	@Override
	public void resetOriginalValues() {
		_thongsochungchidongco.resetOriginalValues();
	}

	private THONGSOCHUNGCHIDONGCO _thongsochungchidongco;
}