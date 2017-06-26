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
 * This class is a wrapper for {@link THONGSOCHUNGCHIXECHUYENDUNG}.
 * </p>
 *
 * @author win_64
 * @see THONGSOCHUNGCHIXECHUYENDUNG
 * @generated
 */
public class THONGSOCHUNGCHIXECHUYENDUNGWrapper
	implements THONGSOCHUNGCHIXECHUYENDUNG,
		ModelWrapper<THONGSOCHUNGCHIXECHUYENDUNG> {
	public THONGSOCHUNGCHIXECHUYENDUNGWrapper(
		THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung) {
		_thongsochungchixechuyendung = thongsochungchixechuyendung;
	}

	@Override
	public Class<?> getModelClass() {
		return THONGSOCHUNGCHIXECHUYENDUNG.class;
	}

	@Override
	public String getModelClassName() {
		return THONGSOCHUNGCHIXECHUYENDUNG.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("hoSoThuTucId", getHoSoThuTucId());
		attributes.put("certificateRecordId", getCertificateRecordId());
		attributes.put("vehicleGroupId", getVehicleGroupId());
		attributes.put("SynchDate", getSynchDate());
		attributes.put("XCD0009", getXCD0009());
		attributes.put("XCD0010", getXCD0010());
		attributes.put("XCD0011", getXCD0011());
		attributes.put("XCD0012", getXCD0012());
		attributes.put("XCD0013", getXCD0013());
		attributes.put("XCD0014", getXCD0014());
		attributes.put("XCD0015", getXCD0015());
		attributes.put("XCD0016", getXCD0016());
		attributes.put("XCD0017", getXCD0017());
		attributes.put("XCD1017", getXCD1017());
		attributes.put("XCD0018", getXCD0018());
		attributes.put("XCD0019", getXCD0019());
		attributes.put("XCD0020", getXCD0020());
		attributes.put("XCD0021", getXCD0021());
		attributes.put("XCD0022", getXCD0022());
		attributes.put("XCD0023", getXCD0023());
		attributes.put("XCD1023", getXCD1023());
		attributes.put("XCD0024", getXCD0024());
		attributes.put("XCDCODE001", getXCDCODE001());
		attributes.put("XCDNAME001", getXCDNAME001());
		attributes.put("XCDVALU001", getXCDVALU001());
		attributes.put("XCDCODE002", getXCDCODE002());
		attributes.put("XCDNAME002", getXCDNAME002());
		attributes.put("XCDVALU002", getXCDVALU002());
		attributes.put("XCDCODE003", getXCDCODE003());
		attributes.put("XCDNAME003", getXCDNAME003());
		attributes.put("XCDVALU003", getXCDVALU003());
		attributes.put("XCDCODE004", getXCDCODE004());
		attributes.put("XCDNAME004", getXCDNAME004());
		attributes.put("XCDVALU004", getXCDVALU004());
		attributes.put("XCDCODE005", getXCDCODE005());
		attributes.put("XCDNAME005", getXCDNAME005());
		attributes.put("XCDVALU005", getXCDVALU005());
		attributes.put("XCDCODE006", getXCDCODE006());
		attributes.put("XCDNAME006", getXCDNAME006());
		attributes.put("XCDVALU006", getXCDVALU006());
		attributes.put("XCDCODE007", getXCDCODE007());
		attributes.put("XCDNAME007", getXCDNAME007());
		attributes.put("XCDVALU007", getXCDVALU007());
		attributes.put("XCDCODE008", getXCDCODE008());
		attributes.put("XCDNAME008", getXCDNAME008());
		attributes.put("XCDVALU008", getXCDVALU008());
		attributes.put("XCDCODE009", getXCDCODE009());
		attributes.put("XCDNAME009", getXCDNAME009());
		attributes.put("XCDVALU009", getXCDVALU009());
		attributes.put("XCDCODE010", getXCDCODE010());
		attributes.put("XCDNAME010", getXCDNAME010());
		attributes.put("XCDVALU010", getXCDVALU010());
		attributes.put("XCDCODE011", getXCDCODE011());
		attributes.put("XCDNAME011", getXCDNAME011());
		attributes.put("XCDVALU011", getXCDVALU011());
		attributes.put("XCDCODE012", getXCDCODE012());
		attributes.put("XCDNAME012", getXCDNAME012());
		attributes.put("XCDVALU012", getXCDVALU012());

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

		String XCD0009 = (String)attributes.get("XCD0009");

		if (XCD0009 != null) {
			setXCD0009(XCD0009);
		}

		String XCD0010 = (String)attributes.get("XCD0010");

		if (XCD0010 != null) {
			setXCD0010(XCD0010);
		}

		String XCD0011 = (String)attributes.get("XCD0011");

		if (XCD0011 != null) {
			setXCD0011(XCD0011);
		}

		String XCD0012 = (String)attributes.get("XCD0012");

		if (XCD0012 != null) {
			setXCD0012(XCD0012);
		}

		String XCD0013 = (String)attributes.get("XCD0013");

		if (XCD0013 != null) {
			setXCD0013(XCD0013);
		}

		String XCD0014 = (String)attributes.get("XCD0014");

		if (XCD0014 != null) {
			setXCD0014(XCD0014);
		}

		String XCD0015 = (String)attributes.get("XCD0015");

		if (XCD0015 != null) {
			setXCD0015(XCD0015);
		}

		String XCD0016 = (String)attributes.get("XCD0016");

		if (XCD0016 != null) {
			setXCD0016(XCD0016);
		}

		String XCD0017 = (String)attributes.get("XCD0017");

		if (XCD0017 != null) {
			setXCD0017(XCD0017);
		}

		String XCD1017 = (String)attributes.get("XCD1017");

		if (XCD1017 != null) {
			setXCD1017(XCD1017);
		}

		String XCD0018 = (String)attributes.get("XCD0018");

		if (XCD0018 != null) {
			setXCD0018(XCD0018);
		}

		String XCD0019 = (String)attributes.get("XCD0019");

		if (XCD0019 != null) {
			setXCD0019(XCD0019);
		}

		String XCD0020 = (String)attributes.get("XCD0020");

		if (XCD0020 != null) {
			setXCD0020(XCD0020);
		}

		String XCD0021 = (String)attributes.get("XCD0021");

		if (XCD0021 != null) {
			setXCD0021(XCD0021);
		}

		String XCD0022 = (String)attributes.get("XCD0022");

		if (XCD0022 != null) {
			setXCD0022(XCD0022);
		}

		String XCD0023 = (String)attributes.get("XCD0023");

		if (XCD0023 != null) {
			setXCD0023(XCD0023);
		}

		String XCD1023 = (String)attributes.get("XCD1023");

		if (XCD1023 != null) {
			setXCD1023(XCD1023);
		}

		String XCD0024 = (String)attributes.get("XCD0024");

		if (XCD0024 != null) {
			setXCD0024(XCD0024);
		}

		String XCDCODE001 = (String)attributes.get("XCDCODE001");

		if (XCDCODE001 != null) {
			setXCDCODE001(XCDCODE001);
		}

		String XCDNAME001 = (String)attributes.get("XCDNAME001");

		if (XCDNAME001 != null) {
			setXCDNAME001(XCDNAME001);
		}

		String XCDVALU001 = (String)attributes.get("XCDVALU001");

		if (XCDVALU001 != null) {
			setXCDVALU001(XCDVALU001);
		}

		String XCDCODE002 = (String)attributes.get("XCDCODE002");

		if (XCDCODE002 != null) {
			setXCDCODE002(XCDCODE002);
		}

		String XCDNAME002 = (String)attributes.get("XCDNAME002");

		if (XCDNAME002 != null) {
			setXCDNAME002(XCDNAME002);
		}

		String XCDVALU002 = (String)attributes.get("XCDVALU002");

		if (XCDVALU002 != null) {
			setXCDVALU002(XCDVALU002);
		}

		String XCDCODE003 = (String)attributes.get("XCDCODE003");

		if (XCDCODE003 != null) {
			setXCDCODE003(XCDCODE003);
		}

		String XCDNAME003 = (String)attributes.get("XCDNAME003");

		if (XCDNAME003 != null) {
			setXCDNAME003(XCDNAME003);
		}

		String XCDVALU003 = (String)attributes.get("XCDVALU003");

		if (XCDVALU003 != null) {
			setXCDVALU003(XCDVALU003);
		}

		String XCDCODE004 = (String)attributes.get("XCDCODE004");

		if (XCDCODE004 != null) {
			setXCDCODE004(XCDCODE004);
		}

		String XCDNAME004 = (String)attributes.get("XCDNAME004");

		if (XCDNAME004 != null) {
			setXCDNAME004(XCDNAME004);
		}

		String XCDVALU004 = (String)attributes.get("XCDVALU004");

		if (XCDVALU004 != null) {
			setXCDVALU004(XCDVALU004);
		}

		String XCDCODE005 = (String)attributes.get("XCDCODE005");

		if (XCDCODE005 != null) {
			setXCDCODE005(XCDCODE005);
		}

		String XCDNAME005 = (String)attributes.get("XCDNAME005");

		if (XCDNAME005 != null) {
			setXCDNAME005(XCDNAME005);
		}

		String XCDVALU005 = (String)attributes.get("XCDVALU005");

		if (XCDVALU005 != null) {
			setXCDVALU005(XCDVALU005);
		}

		String XCDCODE006 = (String)attributes.get("XCDCODE006");

		if (XCDCODE006 != null) {
			setXCDCODE006(XCDCODE006);
		}

		String XCDNAME006 = (String)attributes.get("XCDNAME006");

		if (XCDNAME006 != null) {
			setXCDNAME006(XCDNAME006);
		}

		String XCDVALU006 = (String)attributes.get("XCDVALU006");

		if (XCDVALU006 != null) {
			setXCDVALU006(XCDVALU006);
		}

		String XCDCODE007 = (String)attributes.get("XCDCODE007");

		if (XCDCODE007 != null) {
			setXCDCODE007(XCDCODE007);
		}

		String XCDNAME007 = (String)attributes.get("XCDNAME007");

		if (XCDNAME007 != null) {
			setXCDNAME007(XCDNAME007);
		}

		String XCDVALU007 = (String)attributes.get("XCDVALU007");

		if (XCDVALU007 != null) {
			setXCDVALU007(XCDVALU007);
		}

		String XCDCODE008 = (String)attributes.get("XCDCODE008");

		if (XCDCODE008 != null) {
			setXCDCODE008(XCDCODE008);
		}

		String XCDNAME008 = (String)attributes.get("XCDNAME008");

		if (XCDNAME008 != null) {
			setXCDNAME008(XCDNAME008);
		}

		String XCDVALU008 = (String)attributes.get("XCDVALU008");

		if (XCDVALU008 != null) {
			setXCDVALU008(XCDVALU008);
		}

		String XCDCODE009 = (String)attributes.get("XCDCODE009");

		if (XCDCODE009 != null) {
			setXCDCODE009(XCDCODE009);
		}

		String XCDNAME009 = (String)attributes.get("XCDNAME009");

		if (XCDNAME009 != null) {
			setXCDNAME009(XCDNAME009);
		}

		String XCDVALU009 = (String)attributes.get("XCDVALU009");

		if (XCDVALU009 != null) {
			setXCDVALU009(XCDVALU009);
		}

		String XCDCODE010 = (String)attributes.get("XCDCODE010");

		if (XCDCODE010 != null) {
			setXCDCODE010(XCDCODE010);
		}

		String XCDNAME010 = (String)attributes.get("XCDNAME010");

		if (XCDNAME010 != null) {
			setXCDNAME010(XCDNAME010);
		}

		String XCDVALU010 = (String)attributes.get("XCDVALU010");

		if (XCDVALU010 != null) {
			setXCDVALU010(XCDVALU010);
		}

		String XCDCODE011 = (String)attributes.get("XCDCODE011");

		if (XCDCODE011 != null) {
			setXCDCODE011(XCDCODE011);
		}

		String XCDNAME011 = (String)attributes.get("XCDNAME011");

		if (XCDNAME011 != null) {
			setXCDNAME011(XCDNAME011);
		}

		String XCDVALU011 = (String)attributes.get("XCDVALU011");

		if (XCDVALU011 != null) {
			setXCDVALU011(XCDVALU011);
		}

		String XCDCODE012 = (String)attributes.get("XCDCODE012");

		if (XCDCODE012 != null) {
			setXCDCODE012(XCDCODE012);
		}

		String XCDNAME012 = (String)attributes.get("XCDNAME012");

		if (XCDNAME012 != null) {
			setXCDNAME012(XCDNAME012);
		}

		String XCDVALU012 = (String)attributes.get("XCDVALU012");

		if (XCDVALU012 != null) {
			setXCDVALU012(XCDVALU012);
		}
	}

	/**
	* Returns the primary key of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the primary key of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public long getPrimaryKey() {
		return _thongsochungchixechuyendung.getPrimaryKey();
	}

	/**
	* Sets the primary key of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param primaryKey the primary key of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_thongsochungchixechuyendung.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the ID of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public long getId() {
		return _thongsochungchixechuyendung.getId();
	}

	/**
	* Sets the ID of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param id the ID of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setId(long id) {
		_thongsochungchixechuyendung.setId(id);
	}

	/**
	* Returns the ho so thu tuc ID of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the ho so thu tuc ID of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public long getHoSoThuTucId() {
		return _thongsochungchixechuyendung.getHoSoThuTucId();
	}

	/**
	* Sets the ho so thu tuc ID of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param hoSoThuTucId the ho so thu tuc ID of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_thongsochungchixechuyendung.setHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the certificate record ID of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the certificate record ID of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public long getCertificateRecordId() {
		return _thongsochungchixechuyendung.getCertificateRecordId();
	}

	/**
	* Sets the certificate record ID of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param certificateRecordId the certificate record ID of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setCertificateRecordId(long certificateRecordId) {
		_thongsochungchixechuyendung.setCertificateRecordId(certificateRecordId);
	}

	/**
	* Returns the vehicle group ID of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the vehicle group ID of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public long getVehicleGroupId() {
		return _thongsochungchixechuyendung.getVehicleGroupId();
	}

	/**
	* Sets the vehicle group ID of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param vehicleGroupId the vehicle group ID of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setVehicleGroupId(long vehicleGroupId) {
		_thongsochungchixechuyendung.setVehicleGroupId(vehicleGroupId);
	}

	/**
	* Returns the synch date of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the synch date of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.util.Date getSynchDate() {
		return _thongsochungchixechuyendung.getSynchDate();
	}

	/**
	* Sets the synch date of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param SynchDate the synch date of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setSynchDate(java.util.Date SynchDate) {
		_thongsochungchixechuyendung.setSynchDate(SynchDate);
	}

	/**
	* Returns the x c d0009 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d0009 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCD0009() {
		return _thongsochungchixechuyendung.getXCD0009();
	}

	/**
	* Sets the x c d0009 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCD0009 the x c d0009 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCD0009(java.lang.String XCD0009) {
		_thongsochungchixechuyendung.setXCD0009(XCD0009);
	}

	/**
	* Returns the x c d0010 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d0010 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCD0010() {
		return _thongsochungchixechuyendung.getXCD0010();
	}

	/**
	* Sets the x c d0010 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCD0010 the x c d0010 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCD0010(java.lang.String XCD0010) {
		_thongsochungchixechuyendung.setXCD0010(XCD0010);
	}

	/**
	* Returns the x c d0011 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d0011 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCD0011() {
		return _thongsochungchixechuyendung.getXCD0011();
	}

	/**
	* Sets the x c d0011 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCD0011 the x c d0011 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCD0011(java.lang.String XCD0011) {
		_thongsochungchixechuyendung.setXCD0011(XCD0011);
	}

	/**
	* Returns the x c d0012 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d0012 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCD0012() {
		return _thongsochungchixechuyendung.getXCD0012();
	}

	/**
	* Sets the x c d0012 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCD0012 the x c d0012 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCD0012(java.lang.String XCD0012) {
		_thongsochungchixechuyendung.setXCD0012(XCD0012);
	}

	/**
	* Returns the x c d0013 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d0013 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCD0013() {
		return _thongsochungchixechuyendung.getXCD0013();
	}

	/**
	* Sets the x c d0013 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCD0013 the x c d0013 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCD0013(java.lang.String XCD0013) {
		_thongsochungchixechuyendung.setXCD0013(XCD0013);
	}

	/**
	* Returns the x c d0014 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d0014 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCD0014() {
		return _thongsochungchixechuyendung.getXCD0014();
	}

	/**
	* Sets the x c d0014 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCD0014 the x c d0014 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCD0014(java.lang.String XCD0014) {
		_thongsochungchixechuyendung.setXCD0014(XCD0014);
	}

	/**
	* Returns the x c d0015 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d0015 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCD0015() {
		return _thongsochungchixechuyendung.getXCD0015();
	}

	/**
	* Sets the x c d0015 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCD0015 the x c d0015 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCD0015(java.lang.String XCD0015) {
		_thongsochungchixechuyendung.setXCD0015(XCD0015);
	}

	/**
	* Returns the x c d0016 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d0016 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCD0016() {
		return _thongsochungchixechuyendung.getXCD0016();
	}

	/**
	* Sets the x c d0016 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCD0016 the x c d0016 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCD0016(java.lang.String XCD0016) {
		_thongsochungchixechuyendung.setXCD0016(XCD0016);
	}

	/**
	* Returns the x c d0017 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d0017 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCD0017() {
		return _thongsochungchixechuyendung.getXCD0017();
	}

	/**
	* Sets the x c d0017 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCD0017 the x c d0017 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCD0017(java.lang.String XCD0017) {
		_thongsochungchixechuyendung.setXCD0017(XCD0017);
	}

	/**
	* Returns the x c d1017 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d1017 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCD1017() {
		return _thongsochungchixechuyendung.getXCD1017();
	}

	/**
	* Sets the x c d1017 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCD1017 the x c d1017 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCD1017(java.lang.String XCD1017) {
		_thongsochungchixechuyendung.setXCD1017(XCD1017);
	}

	/**
	* Returns the x c d0018 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d0018 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCD0018() {
		return _thongsochungchixechuyendung.getXCD0018();
	}

	/**
	* Sets the x c d0018 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCD0018 the x c d0018 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCD0018(java.lang.String XCD0018) {
		_thongsochungchixechuyendung.setXCD0018(XCD0018);
	}

	/**
	* Returns the x c d0019 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d0019 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCD0019() {
		return _thongsochungchixechuyendung.getXCD0019();
	}

	/**
	* Sets the x c d0019 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCD0019 the x c d0019 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCD0019(java.lang.String XCD0019) {
		_thongsochungchixechuyendung.setXCD0019(XCD0019);
	}

	/**
	* Returns the x c d0020 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d0020 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCD0020() {
		return _thongsochungchixechuyendung.getXCD0020();
	}

	/**
	* Sets the x c d0020 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCD0020 the x c d0020 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCD0020(java.lang.String XCD0020) {
		_thongsochungchixechuyendung.setXCD0020(XCD0020);
	}

	/**
	* Returns the x c d0021 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d0021 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCD0021() {
		return _thongsochungchixechuyendung.getXCD0021();
	}

	/**
	* Sets the x c d0021 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCD0021 the x c d0021 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCD0021(java.lang.String XCD0021) {
		_thongsochungchixechuyendung.setXCD0021(XCD0021);
	}

	/**
	* Returns the x c d0022 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d0022 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCD0022() {
		return _thongsochungchixechuyendung.getXCD0022();
	}

	/**
	* Sets the x c d0022 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCD0022 the x c d0022 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCD0022(java.lang.String XCD0022) {
		_thongsochungchixechuyendung.setXCD0022(XCD0022);
	}

	/**
	* Returns the x c d0023 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d0023 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCD0023() {
		return _thongsochungchixechuyendung.getXCD0023();
	}

	/**
	* Sets the x c d0023 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCD0023 the x c d0023 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCD0023(java.lang.String XCD0023) {
		_thongsochungchixechuyendung.setXCD0023(XCD0023);
	}

	/**
	* Returns the x c d1023 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d1023 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCD1023() {
		return _thongsochungchixechuyendung.getXCD1023();
	}

	/**
	* Sets the x c d1023 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCD1023 the x c d1023 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCD1023(java.lang.String XCD1023) {
		_thongsochungchixechuyendung.setXCD1023(XCD1023);
	}

	/**
	* Returns the x c d0024 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d0024 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCD0024() {
		return _thongsochungchixechuyendung.getXCD0024();
	}

	/**
	* Sets the x c d0024 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCD0024 the x c d0024 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCD0024(java.lang.String XCD0024) {
		_thongsochungchixechuyendung.setXCD0024(XCD0024);
	}

	/**
	* Returns the x c d c o d e001 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d c o d e001 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDCODE001() {
		return _thongsochungchixechuyendung.getXCDCODE001();
	}

	/**
	* Sets the x c d c o d e001 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDCODE001 the x c d c o d e001 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDCODE001(java.lang.String XCDCODE001) {
		_thongsochungchixechuyendung.setXCDCODE001(XCDCODE001);
	}

	/**
	* Returns the x c d n a m e001 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d n a m e001 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDNAME001() {
		return _thongsochungchixechuyendung.getXCDNAME001();
	}

	/**
	* Sets the x c d n a m e001 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDNAME001 the x c d n a m e001 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDNAME001(java.lang.String XCDNAME001) {
		_thongsochungchixechuyendung.setXCDNAME001(XCDNAME001);
	}

	/**
	* Returns the x c d v a l u001 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d v a l u001 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDVALU001() {
		return _thongsochungchixechuyendung.getXCDVALU001();
	}

	/**
	* Sets the x c d v a l u001 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDVALU001 the x c d v a l u001 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDVALU001(java.lang.String XCDVALU001) {
		_thongsochungchixechuyendung.setXCDVALU001(XCDVALU001);
	}

	/**
	* Returns the x c d c o d e002 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d c o d e002 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDCODE002() {
		return _thongsochungchixechuyendung.getXCDCODE002();
	}

	/**
	* Sets the x c d c o d e002 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDCODE002 the x c d c o d e002 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDCODE002(java.lang.String XCDCODE002) {
		_thongsochungchixechuyendung.setXCDCODE002(XCDCODE002);
	}

	/**
	* Returns the x c d n a m e002 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d n a m e002 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDNAME002() {
		return _thongsochungchixechuyendung.getXCDNAME002();
	}

	/**
	* Sets the x c d n a m e002 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDNAME002 the x c d n a m e002 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDNAME002(java.lang.String XCDNAME002) {
		_thongsochungchixechuyendung.setXCDNAME002(XCDNAME002);
	}

	/**
	* Returns the x c d v a l u002 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d v a l u002 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDVALU002() {
		return _thongsochungchixechuyendung.getXCDVALU002();
	}

	/**
	* Sets the x c d v a l u002 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDVALU002 the x c d v a l u002 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDVALU002(java.lang.String XCDVALU002) {
		_thongsochungchixechuyendung.setXCDVALU002(XCDVALU002);
	}

	/**
	* Returns the x c d c o d e003 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d c o d e003 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDCODE003() {
		return _thongsochungchixechuyendung.getXCDCODE003();
	}

	/**
	* Sets the x c d c o d e003 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDCODE003 the x c d c o d e003 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDCODE003(java.lang.String XCDCODE003) {
		_thongsochungchixechuyendung.setXCDCODE003(XCDCODE003);
	}

	/**
	* Returns the x c d n a m e003 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d n a m e003 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDNAME003() {
		return _thongsochungchixechuyendung.getXCDNAME003();
	}

	/**
	* Sets the x c d n a m e003 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDNAME003 the x c d n a m e003 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDNAME003(java.lang.String XCDNAME003) {
		_thongsochungchixechuyendung.setXCDNAME003(XCDNAME003);
	}

	/**
	* Returns the x c d v a l u003 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d v a l u003 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDVALU003() {
		return _thongsochungchixechuyendung.getXCDVALU003();
	}

	/**
	* Sets the x c d v a l u003 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDVALU003 the x c d v a l u003 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDVALU003(java.lang.String XCDVALU003) {
		_thongsochungchixechuyendung.setXCDVALU003(XCDVALU003);
	}

	/**
	* Returns the x c d c o d e004 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d c o d e004 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDCODE004() {
		return _thongsochungchixechuyendung.getXCDCODE004();
	}

	/**
	* Sets the x c d c o d e004 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDCODE004 the x c d c o d e004 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDCODE004(java.lang.String XCDCODE004) {
		_thongsochungchixechuyendung.setXCDCODE004(XCDCODE004);
	}

	/**
	* Returns the x c d n a m e004 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d n a m e004 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDNAME004() {
		return _thongsochungchixechuyendung.getXCDNAME004();
	}

	/**
	* Sets the x c d n a m e004 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDNAME004 the x c d n a m e004 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDNAME004(java.lang.String XCDNAME004) {
		_thongsochungchixechuyendung.setXCDNAME004(XCDNAME004);
	}

	/**
	* Returns the x c d v a l u004 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d v a l u004 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDVALU004() {
		return _thongsochungchixechuyendung.getXCDVALU004();
	}

	/**
	* Sets the x c d v a l u004 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDVALU004 the x c d v a l u004 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDVALU004(java.lang.String XCDVALU004) {
		_thongsochungchixechuyendung.setXCDVALU004(XCDVALU004);
	}

	/**
	* Returns the x c d c o d e005 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d c o d e005 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDCODE005() {
		return _thongsochungchixechuyendung.getXCDCODE005();
	}

	/**
	* Sets the x c d c o d e005 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDCODE005 the x c d c o d e005 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDCODE005(java.lang.String XCDCODE005) {
		_thongsochungchixechuyendung.setXCDCODE005(XCDCODE005);
	}

	/**
	* Returns the x c d n a m e005 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d n a m e005 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDNAME005() {
		return _thongsochungchixechuyendung.getXCDNAME005();
	}

	/**
	* Sets the x c d n a m e005 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDNAME005 the x c d n a m e005 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDNAME005(java.lang.String XCDNAME005) {
		_thongsochungchixechuyendung.setXCDNAME005(XCDNAME005);
	}

	/**
	* Returns the x c d v a l u005 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d v a l u005 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDVALU005() {
		return _thongsochungchixechuyendung.getXCDVALU005();
	}

	/**
	* Sets the x c d v a l u005 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDVALU005 the x c d v a l u005 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDVALU005(java.lang.String XCDVALU005) {
		_thongsochungchixechuyendung.setXCDVALU005(XCDVALU005);
	}

	/**
	* Returns the x c d c o d e006 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d c o d e006 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDCODE006() {
		return _thongsochungchixechuyendung.getXCDCODE006();
	}

	/**
	* Sets the x c d c o d e006 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDCODE006 the x c d c o d e006 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDCODE006(java.lang.String XCDCODE006) {
		_thongsochungchixechuyendung.setXCDCODE006(XCDCODE006);
	}

	/**
	* Returns the x c d n a m e006 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d n a m e006 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDNAME006() {
		return _thongsochungchixechuyendung.getXCDNAME006();
	}

	/**
	* Sets the x c d n a m e006 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDNAME006 the x c d n a m e006 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDNAME006(java.lang.String XCDNAME006) {
		_thongsochungchixechuyendung.setXCDNAME006(XCDNAME006);
	}

	/**
	* Returns the x c d v a l u006 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d v a l u006 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDVALU006() {
		return _thongsochungchixechuyendung.getXCDVALU006();
	}

	/**
	* Sets the x c d v a l u006 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDVALU006 the x c d v a l u006 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDVALU006(java.lang.String XCDVALU006) {
		_thongsochungchixechuyendung.setXCDVALU006(XCDVALU006);
	}

	/**
	* Returns the x c d c o d e007 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d c o d e007 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDCODE007() {
		return _thongsochungchixechuyendung.getXCDCODE007();
	}

	/**
	* Sets the x c d c o d e007 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDCODE007 the x c d c o d e007 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDCODE007(java.lang.String XCDCODE007) {
		_thongsochungchixechuyendung.setXCDCODE007(XCDCODE007);
	}

	/**
	* Returns the x c d n a m e007 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d n a m e007 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDNAME007() {
		return _thongsochungchixechuyendung.getXCDNAME007();
	}

	/**
	* Sets the x c d n a m e007 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDNAME007 the x c d n a m e007 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDNAME007(java.lang.String XCDNAME007) {
		_thongsochungchixechuyendung.setXCDNAME007(XCDNAME007);
	}

	/**
	* Returns the x c d v a l u007 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d v a l u007 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDVALU007() {
		return _thongsochungchixechuyendung.getXCDVALU007();
	}

	/**
	* Sets the x c d v a l u007 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDVALU007 the x c d v a l u007 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDVALU007(java.lang.String XCDVALU007) {
		_thongsochungchixechuyendung.setXCDVALU007(XCDVALU007);
	}

	/**
	* Returns the x c d c o d e008 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d c o d e008 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDCODE008() {
		return _thongsochungchixechuyendung.getXCDCODE008();
	}

	/**
	* Sets the x c d c o d e008 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDCODE008 the x c d c o d e008 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDCODE008(java.lang.String XCDCODE008) {
		_thongsochungchixechuyendung.setXCDCODE008(XCDCODE008);
	}

	/**
	* Returns the x c d n a m e008 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d n a m e008 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDNAME008() {
		return _thongsochungchixechuyendung.getXCDNAME008();
	}

	/**
	* Sets the x c d n a m e008 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDNAME008 the x c d n a m e008 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDNAME008(java.lang.String XCDNAME008) {
		_thongsochungchixechuyendung.setXCDNAME008(XCDNAME008);
	}

	/**
	* Returns the x c d v a l u008 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d v a l u008 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDVALU008() {
		return _thongsochungchixechuyendung.getXCDVALU008();
	}

	/**
	* Sets the x c d v a l u008 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDVALU008 the x c d v a l u008 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDVALU008(java.lang.String XCDVALU008) {
		_thongsochungchixechuyendung.setXCDVALU008(XCDVALU008);
	}

	/**
	* Returns the x c d c o d e009 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d c o d e009 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDCODE009() {
		return _thongsochungchixechuyendung.getXCDCODE009();
	}

	/**
	* Sets the x c d c o d e009 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDCODE009 the x c d c o d e009 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDCODE009(java.lang.String XCDCODE009) {
		_thongsochungchixechuyendung.setXCDCODE009(XCDCODE009);
	}

	/**
	* Returns the x c d n a m e009 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d n a m e009 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDNAME009() {
		return _thongsochungchixechuyendung.getXCDNAME009();
	}

	/**
	* Sets the x c d n a m e009 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDNAME009 the x c d n a m e009 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDNAME009(java.lang.String XCDNAME009) {
		_thongsochungchixechuyendung.setXCDNAME009(XCDNAME009);
	}

	/**
	* Returns the x c d v a l u009 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d v a l u009 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDVALU009() {
		return _thongsochungchixechuyendung.getXCDVALU009();
	}

	/**
	* Sets the x c d v a l u009 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDVALU009 the x c d v a l u009 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDVALU009(java.lang.String XCDVALU009) {
		_thongsochungchixechuyendung.setXCDVALU009(XCDVALU009);
	}

	/**
	* Returns the x c d c o d e010 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d c o d e010 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDCODE010() {
		return _thongsochungchixechuyendung.getXCDCODE010();
	}

	/**
	* Sets the x c d c o d e010 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDCODE010 the x c d c o d e010 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDCODE010(java.lang.String XCDCODE010) {
		_thongsochungchixechuyendung.setXCDCODE010(XCDCODE010);
	}

	/**
	* Returns the x c d n a m e010 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d n a m e010 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDNAME010() {
		return _thongsochungchixechuyendung.getXCDNAME010();
	}

	/**
	* Sets the x c d n a m e010 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDNAME010 the x c d n a m e010 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDNAME010(java.lang.String XCDNAME010) {
		_thongsochungchixechuyendung.setXCDNAME010(XCDNAME010);
	}

	/**
	* Returns the x c d v a l u010 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d v a l u010 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDVALU010() {
		return _thongsochungchixechuyendung.getXCDVALU010();
	}

	/**
	* Sets the x c d v a l u010 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDVALU010 the x c d v a l u010 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDVALU010(java.lang.String XCDVALU010) {
		_thongsochungchixechuyendung.setXCDVALU010(XCDVALU010);
	}

	/**
	* Returns the x c d c o d e011 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d c o d e011 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDCODE011() {
		return _thongsochungchixechuyendung.getXCDCODE011();
	}

	/**
	* Sets the x c d c o d e011 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDCODE011 the x c d c o d e011 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDCODE011(java.lang.String XCDCODE011) {
		_thongsochungchixechuyendung.setXCDCODE011(XCDCODE011);
	}

	/**
	* Returns the x c d n a m e011 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d n a m e011 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDNAME011() {
		return _thongsochungchixechuyendung.getXCDNAME011();
	}

	/**
	* Sets the x c d n a m e011 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDNAME011 the x c d n a m e011 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDNAME011(java.lang.String XCDNAME011) {
		_thongsochungchixechuyendung.setXCDNAME011(XCDNAME011);
	}

	/**
	* Returns the x c d v a l u011 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d v a l u011 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDVALU011() {
		return _thongsochungchixechuyendung.getXCDVALU011();
	}

	/**
	* Sets the x c d v a l u011 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDVALU011 the x c d v a l u011 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDVALU011(java.lang.String XCDVALU011) {
		_thongsochungchixechuyendung.setXCDVALU011(XCDVALU011);
	}

	/**
	* Returns the x c d c o d e012 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d c o d e012 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDCODE012() {
		return _thongsochungchixechuyendung.getXCDCODE012();
	}

	/**
	* Sets the x c d c o d e012 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDCODE012 the x c d c o d e012 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDCODE012(java.lang.String XCDCODE012) {
		_thongsochungchixechuyendung.setXCDCODE012(XCDCODE012);
	}

	/**
	* Returns the x c d n a m e012 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d n a m e012 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDNAME012() {
		return _thongsochungchixechuyendung.getXCDNAME012();
	}

	/**
	* Sets the x c d n a m e012 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDNAME012 the x c d n a m e012 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDNAME012(java.lang.String XCDNAME012) {
		_thongsochungchixechuyendung.setXCDNAME012(XCDNAME012);
	}

	/**
	* Returns the x c d v a l u012 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @return the x c d v a l u012 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public java.lang.String getXCDVALU012() {
		return _thongsochungchixechuyendung.getXCDVALU012();
	}

	/**
	* Sets the x c d v a l u012 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	*
	* @param XCDVALU012 the x c d v a l u012 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	@Override
	public void setXCDVALU012(java.lang.String XCDVALU012) {
		_thongsochungchixechuyendung.setXCDVALU012(XCDVALU012);
	}

	@Override
	public boolean isNew() {
		return _thongsochungchixechuyendung.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_thongsochungchixechuyendung.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _thongsochungchixechuyendung.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_thongsochungchixechuyendung.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _thongsochungchixechuyendung.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _thongsochungchixechuyendung.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_thongsochungchixechuyendung.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _thongsochungchixechuyendung.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_thongsochungchixechuyendung.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_thongsochungchixechuyendung.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_thongsochungchixechuyendung.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new THONGSOCHUNGCHIXECHUYENDUNGWrapper((THONGSOCHUNGCHIXECHUYENDUNG)_thongsochungchixechuyendung.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung) {
		return _thongsochungchixechuyendung.compareTo(thongsochungchixechuyendung);
	}

	@Override
	public int hashCode() {
		return _thongsochungchixechuyendung.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> toCacheModel() {
		return _thongsochungchixechuyendung.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG toEscapedModel() {
		return new THONGSOCHUNGCHIXECHUYENDUNGWrapper(_thongsochungchixechuyendung.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG toUnescapedModel() {
		return new THONGSOCHUNGCHIXECHUYENDUNGWrapper(_thongsochungchixechuyendung.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _thongsochungchixechuyendung.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _thongsochungchixechuyendung.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_thongsochungchixechuyendung.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof THONGSOCHUNGCHIXECHUYENDUNGWrapper)) {
			return false;
		}

		THONGSOCHUNGCHIXECHUYENDUNGWrapper thongsochungchixechuyendungWrapper = (THONGSOCHUNGCHIXECHUYENDUNGWrapper)obj;

		if (Validator.equals(_thongsochungchixechuyendung,
					thongsochungchixechuyendungWrapper._thongsochungchixechuyendung)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public THONGSOCHUNGCHIXECHUYENDUNG getWrappedTHONGSOCHUNGCHIXECHUYENDUNG() {
		return _thongsochungchixechuyendung;
	}

	@Override
	public THONGSOCHUNGCHIXECHUYENDUNG getWrappedModel() {
		return _thongsochungchixechuyendung;
	}

	@Override
	public void resetOriginalValues() {
		_thongsochungchixechuyendung.resetOriginalValues();
	}

	private THONGSOCHUNGCHIXECHUYENDUNG _thongsochungchixechuyendung;
}