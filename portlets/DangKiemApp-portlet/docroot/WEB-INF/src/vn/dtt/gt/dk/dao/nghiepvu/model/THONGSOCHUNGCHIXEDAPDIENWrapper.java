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
 * This class is a wrapper for {@link THONGSOCHUNGCHIXEDAPDIEN}.
 * </p>
 *
 * @author win_64
 * @see THONGSOCHUNGCHIXEDAPDIEN
 * @generated
 */
public class THONGSOCHUNGCHIXEDAPDIENWrapper implements THONGSOCHUNGCHIXEDAPDIEN,
	ModelWrapper<THONGSOCHUNGCHIXEDAPDIEN> {
	public THONGSOCHUNGCHIXEDAPDIENWrapper(
		THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien) {
		_thongsochungchixedapdien = thongsochungchixedapdien;
	}

	@Override
	public Class<?> getModelClass() {
		return THONGSOCHUNGCHIXEDAPDIEN.class;
	}

	@Override
	public String getModelClassName() {
		return THONGSOCHUNGCHIXEDAPDIEN.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("hoSoThuTucId", getHoSoThuTucId());
		attributes.put("certificateRecordId", getCertificateRecordId());
		attributes.put("vehicleGroupId", getVehicleGroupId());
		attributes.put("SynchDate", getSynchDate());
		attributes.put("XDD0008", getXDD0008());
		attributes.put("XDD0009", getXDD0009());
		attributes.put("XDD0010", getXDD0010());
		attributes.put("XDD0011", getXDD0011());
		attributes.put("XDD0012", getXDD0012());
		attributes.put("XDD0013", getXDD0013());
		attributes.put("XDD0014", getXDD0014());
		attributes.put("XDD0015", getXDD0015());
		attributes.put("XDD0016", getXDD0016());
		attributes.put("XDD0017", getXDD0017());
		attributes.put("XDD0018", getXDD0018());
		attributes.put("XDD0019", getXDD0019());
		attributes.put("XDD0020", getXDD0020());
		attributes.put("XDD0021", getXDD0021());
		attributes.put("XDD0022", getXDD0022());
		attributes.put("XDD0023", getXDD0023());
		attributes.put("XDD0024", getXDD0024());
		attributes.put("XDD0025", getXDD0025());
		attributes.put("XDD0026", getXDD0026());
		attributes.put("XDD0027", getXDD0027());
		attributes.put("XDD1027", getXDD1027());
		attributes.put("XDD0028", getXDD0028());
		attributes.put("XDD1028", getXDD1028());
		attributes.put("XDD1128", getXDD1128());
		attributes.put("XDD0029", getXDD0029());
		attributes.put("XDD1029", getXDD1029());
		attributes.put("XDD1129", getXDD1129());
		attributes.put("XDD0030", getXDD0030());
		attributes.put("XDD0031", getXDD0031());
		attributes.put("XDD0032", getXDD0032());
		attributes.put("XDD0033", getXDD0033());
		attributes.put("XDD0034", getXDD0034());
		attributes.put("XDD1034", getXDD1034());
		attributes.put("XDD0035", getXDD0035());
		attributes.put("XDD1035", getXDD1035());
		attributes.put("XDD0036", getXDD0036());
		attributes.put("XDD0037", getXDD0037());
		attributes.put("XDD0038", getXDD0038());

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

		String XDD0008 = (String)attributes.get("XDD0008");

		if (XDD0008 != null) {
			setXDD0008(XDD0008);
		}

		String XDD0009 = (String)attributes.get("XDD0009");

		if (XDD0009 != null) {
			setXDD0009(XDD0009);
		}

		String XDD0010 = (String)attributes.get("XDD0010");

		if (XDD0010 != null) {
			setXDD0010(XDD0010);
		}

		String XDD0011 = (String)attributes.get("XDD0011");

		if (XDD0011 != null) {
			setXDD0011(XDD0011);
		}

		String XDD0012 = (String)attributes.get("XDD0012");

		if (XDD0012 != null) {
			setXDD0012(XDD0012);
		}

		String XDD0013 = (String)attributes.get("XDD0013");

		if (XDD0013 != null) {
			setXDD0013(XDD0013);
		}

		String XDD0014 = (String)attributes.get("XDD0014");

		if (XDD0014 != null) {
			setXDD0014(XDD0014);
		}

		String XDD0015 = (String)attributes.get("XDD0015");

		if (XDD0015 != null) {
			setXDD0015(XDD0015);
		}

		String XDD0016 = (String)attributes.get("XDD0016");

		if (XDD0016 != null) {
			setXDD0016(XDD0016);
		}

		String XDD0017 = (String)attributes.get("XDD0017");

		if (XDD0017 != null) {
			setXDD0017(XDD0017);
		}

		String XDD0018 = (String)attributes.get("XDD0018");

		if (XDD0018 != null) {
			setXDD0018(XDD0018);
		}

		String XDD0019 = (String)attributes.get("XDD0019");

		if (XDD0019 != null) {
			setXDD0019(XDD0019);
		}

		String XDD0020 = (String)attributes.get("XDD0020");

		if (XDD0020 != null) {
			setXDD0020(XDD0020);
		}

		String XDD0021 = (String)attributes.get("XDD0021");

		if (XDD0021 != null) {
			setXDD0021(XDD0021);
		}

		String XDD0022 = (String)attributes.get("XDD0022");

		if (XDD0022 != null) {
			setXDD0022(XDD0022);
		}

		String XDD0023 = (String)attributes.get("XDD0023");

		if (XDD0023 != null) {
			setXDD0023(XDD0023);
		}

		String XDD0024 = (String)attributes.get("XDD0024");

		if (XDD0024 != null) {
			setXDD0024(XDD0024);
		}

		String XDD0025 = (String)attributes.get("XDD0025");

		if (XDD0025 != null) {
			setXDD0025(XDD0025);
		}

		String XDD0026 = (String)attributes.get("XDD0026");

		if (XDD0026 != null) {
			setXDD0026(XDD0026);
		}

		String XDD0027 = (String)attributes.get("XDD0027");

		if (XDD0027 != null) {
			setXDD0027(XDD0027);
		}

		String XDD1027 = (String)attributes.get("XDD1027");

		if (XDD1027 != null) {
			setXDD1027(XDD1027);
		}

		String XDD0028 = (String)attributes.get("XDD0028");

		if (XDD0028 != null) {
			setXDD0028(XDD0028);
		}

		String XDD1028 = (String)attributes.get("XDD1028");

		if (XDD1028 != null) {
			setXDD1028(XDD1028);
		}

		String XDD1128 = (String)attributes.get("XDD1128");

		if (XDD1128 != null) {
			setXDD1128(XDD1128);
		}

		String XDD0029 = (String)attributes.get("XDD0029");

		if (XDD0029 != null) {
			setXDD0029(XDD0029);
		}

		String XDD1029 = (String)attributes.get("XDD1029");

		if (XDD1029 != null) {
			setXDD1029(XDD1029);
		}

		String XDD1129 = (String)attributes.get("XDD1129");

		if (XDD1129 != null) {
			setXDD1129(XDD1129);
		}

		String XDD0030 = (String)attributes.get("XDD0030");

		if (XDD0030 != null) {
			setXDD0030(XDD0030);
		}

		String XDD0031 = (String)attributes.get("XDD0031");

		if (XDD0031 != null) {
			setXDD0031(XDD0031);
		}

		String XDD0032 = (String)attributes.get("XDD0032");

		if (XDD0032 != null) {
			setXDD0032(XDD0032);
		}

		String XDD0033 = (String)attributes.get("XDD0033");

		if (XDD0033 != null) {
			setXDD0033(XDD0033);
		}

		String XDD0034 = (String)attributes.get("XDD0034");

		if (XDD0034 != null) {
			setXDD0034(XDD0034);
		}

		String XDD1034 = (String)attributes.get("XDD1034");

		if (XDD1034 != null) {
			setXDD1034(XDD1034);
		}

		String XDD0035 = (String)attributes.get("XDD0035");

		if (XDD0035 != null) {
			setXDD0035(XDD0035);
		}

		String XDD1035 = (String)attributes.get("XDD1035");

		if (XDD1035 != null) {
			setXDD1035(XDD1035);
		}

		String XDD0036 = (String)attributes.get("XDD0036");

		if (XDD0036 != null) {
			setXDD0036(XDD0036);
		}

		String XDD0037 = (String)attributes.get("XDD0037");

		if (XDD0037 != null) {
			setXDD0037(XDD0037);
		}

		String XDD0038 = (String)attributes.get("XDD0038");

		if (XDD0038 != null) {
			setXDD0038(XDD0038);
		}
	}

	/**
	* Returns the primary key of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the primary key of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public long getPrimaryKey() {
		return _thongsochungchixedapdien.getPrimaryKey();
	}

	/**
	* Sets the primary key of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param primaryKey the primary key of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_thongsochungchixedapdien.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the ID of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public long getId() {
		return _thongsochungchixedapdien.getId();
	}

	/**
	* Sets the ID of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param id the ID of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setId(long id) {
		_thongsochungchixedapdien.setId(id);
	}

	/**
	* Returns the ho so thu tuc ID of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the ho so thu tuc ID of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public long getHoSoThuTucId() {
		return _thongsochungchixedapdien.getHoSoThuTucId();
	}

	/**
	* Sets the ho so thu tuc ID of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param hoSoThuTucId the ho so thu tuc ID of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_thongsochungchixedapdien.setHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the certificate record ID of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the certificate record ID of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public long getCertificateRecordId() {
		return _thongsochungchixedapdien.getCertificateRecordId();
	}

	/**
	* Sets the certificate record ID of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param certificateRecordId the certificate record ID of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setCertificateRecordId(long certificateRecordId) {
		_thongsochungchixedapdien.setCertificateRecordId(certificateRecordId);
	}

	/**
	* Returns the vehicle group ID of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the vehicle group ID of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public long getVehicleGroupId() {
		return _thongsochungchixedapdien.getVehicleGroupId();
	}

	/**
	* Sets the vehicle group ID of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param vehicleGroupId the vehicle group ID of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setVehicleGroupId(long vehicleGroupId) {
		_thongsochungchixedapdien.setVehicleGroupId(vehicleGroupId);
	}

	/**
	* Returns the synch date of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the synch date of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.util.Date getSynchDate() {
		return _thongsochungchixedapdien.getSynchDate();
	}

	/**
	* Sets the synch date of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param SynchDate the synch date of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setSynchDate(java.util.Date SynchDate) {
		_thongsochungchixedapdien.setSynchDate(SynchDate);
	}

	/**
	* Returns the x d d0008 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d0008 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD0008() {
		return _thongsochungchixedapdien.getXDD0008();
	}

	/**
	* Sets the x d d0008 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD0008 the x d d0008 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD0008(java.lang.String XDD0008) {
		_thongsochungchixedapdien.setXDD0008(XDD0008);
	}

	/**
	* Returns the x d d0009 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d0009 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD0009() {
		return _thongsochungchixedapdien.getXDD0009();
	}

	/**
	* Sets the x d d0009 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD0009 the x d d0009 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD0009(java.lang.String XDD0009) {
		_thongsochungchixedapdien.setXDD0009(XDD0009);
	}

	/**
	* Returns the x d d0010 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d0010 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD0010() {
		return _thongsochungchixedapdien.getXDD0010();
	}

	/**
	* Sets the x d d0010 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD0010 the x d d0010 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD0010(java.lang.String XDD0010) {
		_thongsochungchixedapdien.setXDD0010(XDD0010);
	}

	/**
	* Returns the x d d0011 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d0011 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD0011() {
		return _thongsochungchixedapdien.getXDD0011();
	}

	/**
	* Sets the x d d0011 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD0011 the x d d0011 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD0011(java.lang.String XDD0011) {
		_thongsochungchixedapdien.setXDD0011(XDD0011);
	}

	/**
	* Returns the x d d0012 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d0012 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD0012() {
		return _thongsochungchixedapdien.getXDD0012();
	}

	/**
	* Sets the x d d0012 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD0012 the x d d0012 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD0012(java.lang.String XDD0012) {
		_thongsochungchixedapdien.setXDD0012(XDD0012);
	}

	/**
	* Returns the x d d0013 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d0013 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD0013() {
		return _thongsochungchixedapdien.getXDD0013();
	}

	/**
	* Sets the x d d0013 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD0013 the x d d0013 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD0013(java.lang.String XDD0013) {
		_thongsochungchixedapdien.setXDD0013(XDD0013);
	}

	/**
	* Returns the x d d0014 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d0014 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD0014() {
		return _thongsochungchixedapdien.getXDD0014();
	}

	/**
	* Sets the x d d0014 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD0014 the x d d0014 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD0014(java.lang.String XDD0014) {
		_thongsochungchixedapdien.setXDD0014(XDD0014);
	}

	/**
	* Returns the x d d0015 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d0015 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD0015() {
		return _thongsochungchixedapdien.getXDD0015();
	}

	/**
	* Sets the x d d0015 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD0015 the x d d0015 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD0015(java.lang.String XDD0015) {
		_thongsochungchixedapdien.setXDD0015(XDD0015);
	}

	/**
	* Returns the x d d0016 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d0016 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD0016() {
		return _thongsochungchixedapdien.getXDD0016();
	}

	/**
	* Sets the x d d0016 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD0016 the x d d0016 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD0016(java.lang.String XDD0016) {
		_thongsochungchixedapdien.setXDD0016(XDD0016);
	}

	/**
	* Returns the x d d0017 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d0017 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD0017() {
		return _thongsochungchixedapdien.getXDD0017();
	}

	/**
	* Sets the x d d0017 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD0017 the x d d0017 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD0017(java.lang.String XDD0017) {
		_thongsochungchixedapdien.setXDD0017(XDD0017);
	}

	/**
	* Returns the x d d0018 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d0018 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD0018() {
		return _thongsochungchixedapdien.getXDD0018();
	}

	/**
	* Sets the x d d0018 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD0018 the x d d0018 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD0018(java.lang.String XDD0018) {
		_thongsochungchixedapdien.setXDD0018(XDD0018);
	}

	/**
	* Returns the x d d0019 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d0019 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD0019() {
		return _thongsochungchixedapdien.getXDD0019();
	}

	/**
	* Sets the x d d0019 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD0019 the x d d0019 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD0019(java.lang.String XDD0019) {
		_thongsochungchixedapdien.setXDD0019(XDD0019);
	}

	/**
	* Returns the x d d0020 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d0020 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD0020() {
		return _thongsochungchixedapdien.getXDD0020();
	}

	/**
	* Sets the x d d0020 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD0020 the x d d0020 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD0020(java.lang.String XDD0020) {
		_thongsochungchixedapdien.setXDD0020(XDD0020);
	}

	/**
	* Returns the x d d0021 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d0021 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD0021() {
		return _thongsochungchixedapdien.getXDD0021();
	}

	/**
	* Sets the x d d0021 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD0021 the x d d0021 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD0021(java.lang.String XDD0021) {
		_thongsochungchixedapdien.setXDD0021(XDD0021);
	}

	/**
	* Returns the x d d0022 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d0022 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD0022() {
		return _thongsochungchixedapdien.getXDD0022();
	}

	/**
	* Sets the x d d0022 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD0022 the x d d0022 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD0022(java.lang.String XDD0022) {
		_thongsochungchixedapdien.setXDD0022(XDD0022);
	}

	/**
	* Returns the x d d0023 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d0023 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD0023() {
		return _thongsochungchixedapdien.getXDD0023();
	}

	/**
	* Sets the x d d0023 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD0023 the x d d0023 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD0023(java.lang.String XDD0023) {
		_thongsochungchixedapdien.setXDD0023(XDD0023);
	}

	/**
	* Returns the x d d0024 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d0024 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD0024() {
		return _thongsochungchixedapdien.getXDD0024();
	}

	/**
	* Sets the x d d0024 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD0024 the x d d0024 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD0024(java.lang.String XDD0024) {
		_thongsochungchixedapdien.setXDD0024(XDD0024);
	}

	/**
	* Returns the x d d0025 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d0025 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD0025() {
		return _thongsochungchixedapdien.getXDD0025();
	}

	/**
	* Sets the x d d0025 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD0025 the x d d0025 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD0025(java.lang.String XDD0025) {
		_thongsochungchixedapdien.setXDD0025(XDD0025);
	}

	/**
	* Returns the x d d0026 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d0026 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD0026() {
		return _thongsochungchixedapdien.getXDD0026();
	}

	/**
	* Sets the x d d0026 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD0026 the x d d0026 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD0026(java.lang.String XDD0026) {
		_thongsochungchixedapdien.setXDD0026(XDD0026);
	}

	/**
	* Returns the x d d0027 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d0027 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD0027() {
		return _thongsochungchixedapdien.getXDD0027();
	}

	/**
	* Sets the x d d0027 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD0027 the x d d0027 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD0027(java.lang.String XDD0027) {
		_thongsochungchixedapdien.setXDD0027(XDD0027);
	}

	/**
	* Returns the x d d1027 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d1027 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD1027() {
		return _thongsochungchixedapdien.getXDD1027();
	}

	/**
	* Sets the x d d1027 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD1027 the x d d1027 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD1027(java.lang.String XDD1027) {
		_thongsochungchixedapdien.setXDD1027(XDD1027);
	}

	/**
	* Returns the x d d0028 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d0028 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD0028() {
		return _thongsochungchixedapdien.getXDD0028();
	}

	/**
	* Sets the x d d0028 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD0028 the x d d0028 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD0028(java.lang.String XDD0028) {
		_thongsochungchixedapdien.setXDD0028(XDD0028);
	}

	/**
	* Returns the x d d1028 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d1028 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD1028() {
		return _thongsochungchixedapdien.getXDD1028();
	}

	/**
	* Sets the x d d1028 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD1028 the x d d1028 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD1028(java.lang.String XDD1028) {
		_thongsochungchixedapdien.setXDD1028(XDD1028);
	}

	/**
	* Returns the x d d1128 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d1128 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD1128() {
		return _thongsochungchixedapdien.getXDD1128();
	}

	/**
	* Sets the x d d1128 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD1128 the x d d1128 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD1128(java.lang.String XDD1128) {
		_thongsochungchixedapdien.setXDD1128(XDD1128);
	}

	/**
	* Returns the x d d0029 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d0029 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD0029() {
		return _thongsochungchixedapdien.getXDD0029();
	}

	/**
	* Sets the x d d0029 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD0029 the x d d0029 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD0029(java.lang.String XDD0029) {
		_thongsochungchixedapdien.setXDD0029(XDD0029);
	}

	/**
	* Returns the x d d1029 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d1029 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD1029() {
		return _thongsochungchixedapdien.getXDD1029();
	}

	/**
	* Sets the x d d1029 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD1029 the x d d1029 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD1029(java.lang.String XDD1029) {
		_thongsochungchixedapdien.setXDD1029(XDD1029);
	}

	/**
	* Returns the x d d1129 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d1129 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD1129() {
		return _thongsochungchixedapdien.getXDD1129();
	}

	/**
	* Sets the x d d1129 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD1129 the x d d1129 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD1129(java.lang.String XDD1129) {
		_thongsochungchixedapdien.setXDD1129(XDD1129);
	}

	/**
	* Returns the x d d0030 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d0030 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD0030() {
		return _thongsochungchixedapdien.getXDD0030();
	}

	/**
	* Sets the x d d0030 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD0030 the x d d0030 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD0030(java.lang.String XDD0030) {
		_thongsochungchixedapdien.setXDD0030(XDD0030);
	}

	/**
	* Returns the x d d0031 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d0031 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD0031() {
		return _thongsochungchixedapdien.getXDD0031();
	}

	/**
	* Sets the x d d0031 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD0031 the x d d0031 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD0031(java.lang.String XDD0031) {
		_thongsochungchixedapdien.setXDD0031(XDD0031);
	}

	/**
	* Returns the x d d0032 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d0032 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD0032() {
		return _thongsochungchixedapdien.getXDD0032();
	}

	/**
	* Sets the x d d0032 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD0032 the x d d0032 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD0032(java.lang.String XDD0032) {
		_thongsochungchixedapdien.setXDD0032(XDD0032);
	}

	/**
	* Returns the x d d0033 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d0033 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD0033() {
		return _thongsochungchixedapdien.getXDD0033();
	}

	/**
	* Sets the x d d0033 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD0033 the x d d0033 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD0033(java.lang.String XDD0033) {
		_thongsochungchixedapdien.setXDD0033(XDD0033);
	}

	/**
	* Returns the x d d0034 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d0034 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD0034() {
		return _thongsochungchixedapdien.getXDD0034();
	}

	/**
	* Sets the x d d0034 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD0034 the x d d0034 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD0034(java.lang.String XDD0034) {
		_thongsochungchixedapdien.setXDD0034(XDD0034);
	}

	/**
	* Returns the x d d1034 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d1034 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD1034() {
		return _thongsochungchixedapdien.getXDD1034();
	}

	/**
	* Sets the x d d1034 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD1034 the x d d1034 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD1034(java.lang.String XDD1034) {
		_thongsochungchixedapdien.setXDD1034(XDD1034);
	}

	/**
	* Returns the x d d0035 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d0035 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD0035() {
		return _thongsochungchixedapdien.getXDD0035();
	}

	/**
	* Sets the x d d0035 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD0035 the x d d0035 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD0035(java.lang.String XDD0035) {
		_thongsochungchixedapdien.setXDD0035(XDD0035);
	}

	/**
	* Returns the x d d1035 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d1035 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD1035() {
		return _thongsochungchixedapdien.getXDD1035();
	}

	/**
	* Sets the x d d1035 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD1035 the x d d1035 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD1035(java.lang.String XDD1035) {
		_thongsochungchixedapdien.setXDD1035(XDD1035);
	}

	/**
	* Returns the x d d0036 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d0036 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD0036() {
		return _thongsochungchixedapdien.getXDD0036();
	}

	/**
	* Sets the x d d0036 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD0036 the x d d0036 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD0036(java.lang.String XDD0036) {
		_thongsochungchixedapdien.setXDD0036(XDD0036);
	}

	/**
	* Returns the x d d0037 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d0037 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD0037() {
		return _thongsochungchixedapdien.getXDD0037();
	}

	/**
	* Sets the x d d0037 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD0037 the x d d0037 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD0037(java.lang.String XDD0037) {
		_thongsochungchixedapdien.setXDD0037(XDD0037);
	}

	/**
	* Returns the x d d0038 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @return the x d d0038 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public java.lang.String getXDD0038() {
		return _thongsochungchixedapdien.getXDD0038();
	}

	/**
	* Sets the x d d0038 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	*
	* @param XDD0038 the x d d0038 of this t h o n g s o c h u n g c h i x e d a p d i e n
	*/
	@Override
	public void setXDD0038(java.lang.String XDD0038) {
		_thongsochungchixedapdien.setXDD0038(XDD0038);
	}

	@Override
	public boolean isNew() {
		return _thongsochungchixedapdien.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_thongsochungchixedapdien.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _thongsochungchixedapdien.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_thongsochungchixedapdien.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _thongsochungchixedapdien.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _thongsochungchixedapdien.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_thongsochungchixedapdien.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _thongsochungchixedapdien.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_thongsochungchixedapdien.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_thongsochungchixedapdien.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_thongsochungchixedapdien.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new THONGSOCHUNGCHIXEDAPDIENWrapper((THONGSOCHUNGCHIXEDAPDIEN)_thongsochungchixedapdien.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien) {
		return _thongsochungchixedapdien.compareTo(thongsochungchixedapdien);
	}

	@Override
	public int hashCode() {
		return _thongsochungchixedapdien.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEDAPDIEN> toCacheModel() {
		return _thongsochungchixedapdien.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEDAPDIEN toEscapedModel() {
		return new THONGSOCHUNGCHIXEDAPDIENWrapper(_thongsochungchixedapdien.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEDAPDIEN toUnescapedModel() {
		return new THONGSOCHUNGCHIXEDAPDIENWrapper(_thongsochungchixedapdien.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _thongsochungchixedapdien.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _thongsochungchixedapdien.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_thongsochungchixedapdien.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof THONGSOCHUNGCHIXEDAPDIENWrapper)) {
			return false;
		}

		THONGSOCHUNGCHIXEDAPDIENWrapper thongsochungchixedapdienWrapper = (THONGSOCHUNGCHIXEDAPDIENWrapper)obj;

		if (Validator.equals(_thongsochungchixedapdien,
					thongsochungchixedapdienWrapper._thongsochungchixedapdien)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public THONGSOCHUNGCHIXEDAPDIEN getWrappedTHONGSOCHUNGCHIXEDAPDIEN() {
		return _thongsochungchixedapdien;
	}

	@Override
	public THONGSOCHUNGCHIXEDAPDIEN getWrappedModel() {
		return _thongsochungchixedapdien;
	}

	@Override
	public void resetOriginalValues() {
		_thongsochungchixedapdien.resetOriginalValues();
	}

	private THONGSOCHUNGCHIXEDAPDIEN _thongsochungchixedapdien;
}