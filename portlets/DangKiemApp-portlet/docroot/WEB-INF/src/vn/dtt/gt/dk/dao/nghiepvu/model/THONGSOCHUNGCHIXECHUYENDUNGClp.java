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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer;
import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECHUYENDUNGLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class THONGSOCHUNGCHIXECHUYENDUNGClp extends BaseModelImpl<THONGSOCHUNGCHIXECHUYENDUNG>
	implements THONGSOCHUNGCHIXECHUYENDUNG {
	public THONGSOCHUNGCHIXECHUYENDUNGClp() {
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
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getHoSoThuTucId() {
		return _hoSoThuTucId;
	}

	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_hoSoThuTucId = hoSoThuTucId;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setHoSoThuTucId", long.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					hoSoThuTucId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCertificateRecordId() {
		return _certificateRecordId;
	}

	@Override
	public void setCertificateRecordId(long certificateRecordId) {
		_certificateRecordId = certificateRecordId;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateRecordId",
						long.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					certificateRecordId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getVehicleGroupId() {
		return _vehicleGroupId;
	}

	@Override
	public void setVehicleGroupId(long vehicleGroupId) {
		_vehicleGroupId = vehicleGroupId;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setVehicleGroupId", long.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					vehicleGroupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSynchDate() {
		return _SynchDate;
	}

	@Override
	public void setSynchDate(Date SynchDate) {
		_SynchDate = SynchDate;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setSynchDate", Date.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel, SynchDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCD0009() {
		return _XCD0009;
	}

	@Override
	public void setXCD0009(String XCD0009) {
		_XCD0009 = XCD0009;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCD0009", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel, XCD0009);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCD0010() {
		return _XCD0010;
	}

	@Override
	public void setXCD0010(String XCD0010) {
		_XCD0010 = XCD0010;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCD0010", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel, XCD0010);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCD0011() {
		return _XCD0011;
	}

	@Override
	public void setXCD0011(String XCD0011) {
		_XCD0011 = XCD0011;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCD0011", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel, XCD0011);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCD0012() {
		return _XCD0012;
	}

	@Override
	public void setXCD0012(String XCD0012) {
		_XCD0012 = XCD0012;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCD0012", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel, XCD0012);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCD0013() {
		return _XCD0013;
	}

	@Override
	public void setXCD0013(String XCD0013) {
		_XCD0013 = XCD0013;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCD0013", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel, XCD0013);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCD0014() {
		return _XCD0014;
	}

	@Override
	public void setXCD0014(String XCD0014) {
		_XCD0014 = XCD0014;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCD0014", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel, XCD0014);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCD0015() {
		return _XCD0015;
	}

	@Override
	public void setXCD0015(String XCD0015) {
		_XCD0015 = XCD0015;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCD0015", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel, XCD0015);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCD0016() {
		return _XCD0016;
	}

	@Override
	public void setXCD0016(String XCD0016) {
		_XCD0016 = XCD0016;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCD0016", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel, XCD0016);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCD0017() {
		return _XCD0017;
	}

	@Override
	public void setXCD0017(String XCD0017) {
		_XCD0017 = XCD0017;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCD0017", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel, XCD0017);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCD1017() {
		return _XCD1017;
	}

	@Override
	public void setXCD1017(String XCD1017) {
		_XCD1017 = XCD1017;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCD1017", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel, XCD1017);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCD0018() {
		return _XCD0018;
	}

	@Override
	public void setXCD0018(String XCD0018) {
		_XCD0018 = XCD0018;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCD0018", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel, XCD0018);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCD0019() {
		return _XCD0019;
	}

	@Override
	public void setXCD0019(String XCD0019) {
		_XCD0019 = XCD0019;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCD0019", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel, XCD0019);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCD0020() {
		return _XCD0020;
	}

	@Override
	public void setXCD0020(String XCD0020) {
		_XCD0020 = XCD0020;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCD0020", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel, XCD0020);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCD0021() {
		return _XCD0021;
	}

	@Override
	public void setXCD0021(String XCD0021) {
		_XCD0021 = XCD0021;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCD0021", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel, XCD0021);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCD0022() {
		return _XCD0022;
	}

	@Override
	public void setXCD0022(String XCD0022) {
		_XCD0022 = XCD0022;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCD0022", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel, XCD0022);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCD0023() {
		return _XCD0023;
	}

	@Override
	public void setXCD0023(String XCD0023) {
		_XCD0023 = XCD0023;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCD0023", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel, XCD0023);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCD1023() {
		return _XCD1023;
	}

	@Override
	public void setXCD1023(String XCD1023) {
		_XCD1023 = XCD1023;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCD1023", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel, XCD1023);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCD0024() {
		return _XCD0024;
	}

	@Override
	public void setXCD0024(String XCD0024) {
		_XCD0024 = XCD0024;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCD0024", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel, XCD0024);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDCODE001() {
		return _XCDCODE001;
	}

	@Override
	public void setXCDCODE001(String XCDCODE001) {
		_XCDCODE001 = XCDCODE001;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDCODE001", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDCODE001);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDNAME001() {
		return _XCDNAME001;
	}

	@Override
	public void setXCDNAME001(String XCDNAME001) {
		_XCDNAME001 = XCDNAME001;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDNAME001", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDNAME001);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDVALU001() {
		return _XCDVALU001;
	}

	@Override
	public void setXCDVALU001(String XCDVALU001) {
		_XCDVALU001 = XCDVALU001;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDVALU001", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDVALU001);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDCODE002() {
		return _XCDCODE002;
	}

	@Override
	public void setXCDCODE002(String XCDCODE002) {
		_XCDCODE002 = XCDCODE002;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDCODE002", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDCODE002);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDNAME002() {
		return _XCDNAME002;
	}

	@Override
	public void setXCDNAME002(String XCDNAME002) {
		_XCDNAME002 = XCDNAME002;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDNAME002", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDNAME002);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDVALU002() {
		return _XCDVALU002;
	}

	@Override
	public void setXCDVALU002(String XCDVALU002) {
		_XCDVALU002 = XCDVALU002;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDVALU002", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDVALU002);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDCODE003() {
		return _XCDCODE003;
	}

	@Override
	public void setXCDCODE003(String XCDCODE003) {
		_XCDCODE003 = XCDCODE003;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDCODE003", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDCODE003);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDNAME003() {
		return _XCDNAME003;
	}

	@Override
	public void setXCDNAME003(String XCDNAME003) {
		_XCDNAME003 = XCDNAME003;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDNAME003", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDNAME003);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDVALU003() {
		return _XCDVALU003;
	}

	@Override
	public void setXCDVALU003(String XCDVALU003) {
		_XCDVALU003 = XCDVALU003;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDVALU003", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDVALU003);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDCODE004() {
		return _XCDCODE004;
	}

	@Override
	public void setXCDCODE004(String XCDCODE004) {
		_XCDCODE004 = XCDCODE004;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDCODE004", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDCODE004);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDNAME004() {
		return _XCDNAME004;
	}

	@Override
	public void setXCDNAME004(String XCDNAME004) {
		_XCDNAME004 = XCDNAME004;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDNAME004", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDNAME004);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDVALU004() {
		return _XCDVALU004;
	}

	@Override
	public void setXCDVALU004(String XCDVALU004) {
		_XCDVALU004 = XCDVALU004;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDVALU004", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDVALU004);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDCODE005() {
		return _XCDCODE005;
	}

	@Override
	public void setXCDCODE005(String XCDCODE005) {
		_XCDCODE005 = XCDCODE005;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDCODE005", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDCODE005);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDNAME005() {
		return _XCDNAME005;
	}

	@Override
	public void setXCDNAME005(String XCDNAME005) {
		_XCDNAME005 = XCDNAME005;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDNAME005", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDNAME005);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDVALU005() {
		return _XCDVALU005;
	}

	@Override
	public void setXCDVALU005(String XCDVALU005) {
		_XCDVALU005 = XCDVALU005;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDVALU005", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDVALU005);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDCODE006() {
		return _XCDCODE006;
	}

	@Override
	public void setXCDCODE006(String XCDCODE006) {
		_XCDCODE006 = XCDCODE006;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDCODE006", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDCODE006);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDNAME006() {
		return _XCDNAME006;
	}

	@Override
	public void setXCDNAME006(String XCDNAME006) {
		_XCDNAME006 = XCDNAME006;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDNAME006", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDNAME006);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDVALU006() {
		return _XCDVALU006;
	}

	@Override
	public void setXCDVALU006(String XCDVALU006) {
		_XCDVALU006 = XCDVALU006;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDVALU006", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDVALU006);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDCODE007() {
		return _XCDCODE007;
	}

	@Override
	public void setXCDCODE007(String XCDCODE007) {
		_XCDCODE007 = XCDCODE007;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDCODE007", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDCODE007);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDNAME007() {
		return _XCDNAME007;
	}

	@Override
	public void setXCDNAME007(String XCDNAME007) {
		_XCDNAME007 = XCDNAME007;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDNAME007", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDNAME007);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDVALU007() {
		return _XCDVALU007;
	}

	@Override
	public void setXCDVALU007(String XCDVALU007) {
		_XCDVALU007 = XCDVALU007;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDVALU007", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDVALU007);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDCODE008() {
		return _XCDCODE008;
	}

	@Override
	public void setXCDCODE008(String XCDCODE008) {
		_XCDCODE008 = XCDCODE008;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDCODE008", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDCODE008);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDNAME008() {
		return _XCDNAME008;
	}

	@Override
	public void setXCDNAME008(String XCDNAME008) {
		_XCDNAME008 = XCDNAME008;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDNAME008", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDNAME008);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDVALU008() {
		return _XCDVALU008;
	}

	@Override
	public void setXCDVALU008(String XCDVALU008) {
		_XCDVALU008 = XCDVALU008;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDVALU008", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDVALU008);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDCODE009() {
		return _XCDCODE009;
	}

	@Override
	public void setXCDCODE009(String XCDCODE009) {
		_XCDCODE009 = XCDCODE009;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDCODE009", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDCODE009);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDNAME009() {
		return _XCDNAME009;
	}

	@Override
	public void setXCDNAME009(String XCDNAME009) {
		_XCDNAME009 = XCDNAME009;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDNAME009", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDNAME009);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDVALU009() {
		return _XCDVALU009;
	}

	@Override
	public void setXCDVALU009(String XCDVALU009) {
		_XCDVALU009 = XCDVALU009;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDVALU009", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDVALU009);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDCODE010() {
		return _XCDCODE010;
	}

	@Override
	public void setXCDCODE010(String XCDCODE010) {
		_XCDCODE010 = XCDCODE010;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDCODE010", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDCODE010);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDNAME010() {
		return _XCDNAME010;
	}

	@Override
	public void setXCDNAME010(String XCDNAME010) {
		_XCDNAME010 = XCDNAME010;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDNAME010", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDNAME010);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDVALU010() {
		return _XCDVALU010;
	}

	@Override
	public void setXCDVALU010(String XCDVALU010) {
		_XCDVALU010 = XCDVALU010;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDVALU010", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDVALU010);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDCODE011() {
		return _XCDCODE011;
	}

	@Override
	public void setXCDCODE011(String XCDCODE011) {
		_XCDCODE011 = XCDCODE011;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDCODE011", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDCODE011);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDNAME011() {
		return _XCDNAME011;
	}

	@Override
	public void setXCDNAME011(String XCDNAME011) {
		_XCDNAME011 = XCDNAME011;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDNAME011", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDNAME011);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDVALU011() {
		return _XCDVALU011;
	}

	@Override
	public void setXCDVALU011(String XCDVALU011) {
		_XCDVALU011 = XCDVALU011;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDVALU011", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDVALU011);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDCODE012() {
		return _XCDCODE012;
	}

	@Override
	public void setXCDCODE012(String XCDCODE012) {
		_XCDCODE012 = XCDCODE012;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDCODE012", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDCODE012);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDNAME012() {
		return _XCDNAME012;
	}

	@Override
	public void setXCDNAME012(String XCDNAME012) {
		_XCDNAME012 = XCDNAME012;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDNAME012", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDNAME012);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCDVALU012() {
		return _XCDVALU012;
	}

	@Override
	public void setXCDVALU012(String XCDVALU012) {
		_XCDVALU012 = XCDVALU012;

		if (_thongsochungchixechuyendungRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixechuyendungRemoteModel.getClass();

				Method method = clazz.getMethod("setXCDVALU012", String.class);

				method.invoke(_thongsochungchixechuyendungRemoteModel,
					XCDVALU012);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTHONGSOCHUNGCHIXECHUYENDUNGRemoteModel() {
		return _thongsochungchixechuyendungRemoteModel;
	}

	public void setTHONGSOCHUNGCHIXECHUYENDUNGRemoteModel(
		BaseModel<?> thongsochungchixechuyendungRemoteModel) {
		_thongsochungchixechuyendungRemoteModel = thongsochungchixechuyendungRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _thongsochungchixechuyendungRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_thongsochungchixechuyendungRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			THONGSOCHUNGCHIXECHUYENDUNGLocalServiceUtil.addTHONGSOCHUNGCHIXECHUYENDUNG(this);
		}
		else {
			THONGSOCHUNGCHIXECHUYENDUNGLocalServiceUtil.updateTHONGSOCHUNGCHIXECHUYENDUNG(this);
		}
	}

	@Override
	public THONGSOCHUNGCHIXECHUYENDUNG toEscapedModel() {
		return (THONGSOCHUNGCHIXECHUYENDUNG)ProxyUtil.newProxyInstance(THONGSOCHUNGCHIXECHUYENDUNG.class.getClassLoader(),
			new Class[] { THONGSOCHUNGCHIXECHUYENDUNG.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		THONGSOCHUNGCHIXECHUYENDUNGClp clone = new THONGSOCHUNGCHIXECHUYENDUNGClp();

		clone.setId(getId());
		clone.setHoSoThuTucId(getHoSoThuTucId());
		clone.setCertificateRecordId(getCertificateRecordId());
		clone.setVehicleGroupId(getVehicleGroupId());
		clone.setSynchDate(getSynchDate());
		clone.setXCD0009(getXCD0009());
		clone.setXCD0010(getXCD0010());
		clone.setXCD0011(getXCD0011());
		clone.setXCD0012(getXCD0012());
		clone.setXCD0013(getXCD0013());
		clone.setXCD0014(getXCD0014());
		clone.setXCD0015(getXCD0015());
		clone.setXCD0016(getXCD0016());
		clone.setXCD0017(getXCD0017());
		clone.setXCD1017(getXCD1017());
		clone.setXCD0018(getXCD0018());
		clone.setXCD0019(getXCD0019());
		clone.setXCD0020(getXCD0020());
		clone.setXCD0021(getXCD0021());
		clone.setXCD0022(getXCD0022());
		clone.setXCD0023(getXCD0023());
		clone.setXCD1023(getXCD1023());
		clone.setXCD0024(getXCD0024());
		clone.setXCDCODE001(getXCDCODE001());
		clone.setXCDNAME001(getXCDNAME001());
		clone.setXCDVALU001(getXCDVALU001());
		clone.setXCDCODE002(getXCDCODE002());
		clone.setXCDNAME002(getXCDNAME002());
		clone.setXCDVALU002(getXCDVALU002());
		clone.setXCDCODE003(getXCDCODE003());
		clone.setXCDNAME003(getXCDNAME003());
		clone.setXCDVALU003(getXCDVALU003());
		clone.setXCDCODE004(getXCDCODE004());
		clone.setXCDNAME004(getXCDNAME004());
		clone.setXCDVALU004(getXCDVALU004());
		clone.setXCDCODE005(getXCDCODE005());
		clone.setXCDNAME005(getXCDNAME005());
		clone.setXCDVALU005(getXCDVALU005());
		clone.setXCDCODE006(getXCDCODE006());
		clone.setXCDNAME006(getXCDNAME006());
		clone.setXCDVALU006(getXCDVALU006());
		clone.setXCDCODE007(getXCDCODE007());
		clone.setXCDNAME007(getXCDNAME007());
		clone.setXCDVALU007(getXCDVALU007());
		clone.setXCDCODE008(getXCDCODE008());
		clone.setXCDNAME008(getXCDNAME008());
		clone.setXCDVALU008(getXCDVALU008());
		clone.setXCDCODE009(getXCDCODE009());
		clone.setXCDNAME009(getXCDNAME009());
		clone.setXCDVALU009(getXCDVALU009());
		clone.setXCDCODE010(getXCDCODE010());
		clone.setXCDNAME010(getXCDNAME010());
		clone.setXCDVALU010(getXCDVALU010());
		clone.setXCDCODE011(getXCDCODE011());
		clone.setXCDNAME011(getXCDNAME011());
		clone.setXCDVALU011(getXCDVALU011());
		clone.setXCDCODE012(getXCDCODE012());
		clone.setXCDNAME012(getXCDNAME012());
		clone.setXCDVALU012(getXCDVALU012());

		return clone;
	}

	@Override
	public int compareTo(
		THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung) {
		int value = 0;

		if (getId() < thongsochungchixechuyendung.getId()) {
			value = -1;
		}
		else if (getId() > thongsochungchixechuyendung.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof THONGSOCHUNGCHIXECHUYENDUNGClp)) {
			return false;
		}

		THONGSOCHUNGCHIXECHUYENDUNGClp thongsochungchixechuyendung = (THONGSOCHUNGCHIXECHUYENDUNGClp)obj;

		long primaryKey = thongsochungchixechuyendung.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(119);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", hoSoThuTucId=");
		sb.append(getHoSoThuTucId());
		sb.append(", certificateRecordId=");
		sb.append(getCertificateRecordId());
		sb.append(", vehicleGroupId=");
		sb.append(getVehicleGroupId());
		sb.append(", SynchDate=");
		sb.append(getSynchDate());
		sb.append(", XCD0009=");
		sb.append(getXCD0009());
		sb.append(", XCD0010=");
		sb.append(getXCD0010());
		sb.append(", XCD0011=");
		sb.append(getXCD0011());
		sb.append(", XCD0012=");
		sb.append(getXCD0012());
		sb.append(", XCD0013=");
		sb.append(getXCD0013());
		sb.append(", XCD0014=");
		sb.append(getXCD0014());
		sb.append(", XCD0015=");
		sb.append(getXCD0015());
		sb.append(", XCD0016=");
		sb.append(getXCD0016());
		sb.append(", XCD0017=");
		sb.append(getXCD0017());
		sb.append(", XCD1017=");
		sb.append(getXCD1017());
		sb.append(", XCD0018=");
		sb.append(getXCD0018());
		sb.append(", XCD0019=");
		sb.append(getXCD0019());
		sb.append(", XCD0020=");
		sb.append(getXCD0020());
		sb.append(", XCD0021=");
		sb.append(getXCD0021());
		sb.append(", XCD0022=");
		sb.append(getXCD0022());
		sb.append(", XCD0023=");
		sb.append(getXCD0023());
		sb.append(", XCD1023=");
		sb.append(getXCD1023());
		sb.append(", XCD0024=");
		sb.append(getXCD0024());
		sb.append(", XCDCODE001=");
		sb.append(getXCDCODE001());
		sb.append(", XCDNAME001=");
		sb.append(getXCDNAME001());
		sb.append(", XCDVALU001=");
		sb.append(getXCDVALU001());
		sb.append(", XCDCODE002=");
		sb.append(getXCDCODE002());
		sb.append(", XCDNAME002=");
		sb.append(getXCDNAME002());
		sb.append(", XCDVALU002=");
		sb.append(getXCDVALU002());
		sb.append(", XCDCODE003=");
		sb.append(getXCDCODE003());
		sb.append(", XCDNAME003=");
		sb.append(getXCDNAME003());
		sb.append(", XCDVALU003=");
		sb.append(getXCDVALU003());
		sb.append(", XCDCODE004=");
		sb.append(getXCDCODE004());
		sb.append(", XCDNAME004=");
		sb.append(getXCDNAME004());
		sb.append(", XCDVALU004=");
		sb.append(getXCDVALU004());
		sb.append(", XCDCODE005=");
		sb.append(getXCDCODE005());
		sb.append(", XCDNAME005=");
		sb.append(getXCDNAME005());
		sb.append(", XCDVALU005=");
		sb.append(getXCDVALU005());
		sb.append(", XCDCODE006=");
		sb.append(getXCDCODE006());
		sb.append(", XCDNAME006=");
		sb.append(getXCDNAME006());
		sb.append(", XCDVALU006=");
		sb.append(getXCDVALU006());
		sb.append(", XCDCODE007=");
		sb.append(getXCDCODE007());
		sb.append(", XCDNAME007=");
		sb.append(getXCDNAME007());
		sb.append(", XCDVALU007=");
		sb.append(getXCDVALU007());
		sb.append(", XCDCODE008=");
		sb.append(getXCDCODE008());
		sb.append(", XCDNAME008=");
		sb.append(getXCDNAME008());
		sb.append(", XCDVALU008=");
		sb.append(getXCDVALU008());
		sb.append(", XCDCODE009=");
		sb.append(getXCDCODE009());
		sb.append(", XCDNAME009=");
		sb.append(getXCDNAME009());
		sb.append(", XCDVALU009=");
		sb.append(getXCDVALU009());
		sb.append(", XCDCODE010=");
		sb.append(getXCDCODE010());
		sb.append(", XCDNAME010=");
		sb.append(getXCDNAME010());
		sb.append(", XCDVALU010=");
		sb.append(getXCDVALU010());
		sb.append(", XCDCODE011=");
		sb.append(getXCDCODE011());
		sb.append(", XCDNAME011=");
		sb.append(getXCDNAME011());
		sb.append(", XCDVALU011=");
		sb.append(getXCDVALU011());
		sb.append(", XCDCODE012=");
		sb.append(getXCDCODE012());
		sb.append(", XCDNAME012=");
		sb.append(getXCDNAME012());
		sb.append(", XCDVALU012=");
		sb.append(getXCDVALU012());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(181);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoSoThuTucId</column-name><column-value><![CDATA[");
		sb.append(getHoSoThuTucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateRecordId</column-name><column-value><![CDATA[");
		sb.append(getCertificateRecordId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicleGroupId</column-name><column-value><![CDATA[");
		sb.append(getVehicleGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SynchDate</column-name><column-value><![CDATA[");
		sb.append(getSynchDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCD0009</column-name><column-value><![CDATA[");
		sb.append(getXCD0009());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCD0010</column-name><column-value><![CDATA[");
		sb.append(getXCD0010());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCD0011</column-name><column-value><![CDATA[");
		sb.append(getXCD0011());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCD0012</column-name><column-value><![CDATA[");
		sb.append(getXCD0012());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCD0013</column-name><column-value><![CDATA[");
		sb.append(getXCD0013());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCD0014</column-name><column-value><![CDATA[");
		sb.append(getXCD0014());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCD0015</column-name><column-value><![CDATA[");
		sb.append(getXCD0015());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCD0016</column-name><column-value><![CDATA[");
		sb.append(getXCD0016());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCD0017</column-name><column-value><![CDATA[");
		sb.append(getXCD0017());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCD1017</column-name><column-value><![CDATA[");
		sb.append(getXCD1017());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCD0018</column-name><column-value><![CDATA[");
		sb.append(getXCD0018());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCD0019</column-name><column-value><![CDATA[");
		sb.append(getXCD0019());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCD0020</column-name><column-value><![CDATA[");
		sb.append(getXCD0020());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCD0021</column-name><column-value><![CDATA[");
		sb.append(getXCD0021());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCD0022</column-name><column-value><![CDATA[");
		sb.append(getXCD0022());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCD0023</column-name><column-value><![CDATA[");
		sb.append(getXCD0023());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCD1023</column-name><column-value><![CDATA[");
		sb.append(getXCD1023());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCD0024</column-name><column-value><![CDATA[");
		sb.append(getXCD0024());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDCODE001</column-name><column-value><![CDATA[");
		sb.append(getXCDCODE001());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDNAME001</column-name><column-value><![CDATA[");
		sb.append(getXCDNAME001());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDVALU001</column-name><column-value><![CDATA[");
		sb.append(getXCDVALU001());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDCODE002</column-name><column-value><![CDATA[");
		sb.append(getXCDCODE002());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDNAME002</column-name><column-value><![CDATA[");
		sb.append(getXCDNAME002());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDVALU002</column-name><column-value><![CDATA[");
		sb.append(getXCDVALU002());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDCODE003</column-name><column-value><![CDATA[");
		sb.append(getXCDCODE003());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDNAME003</column-name><column-value><![CDATA[");
		sb.append(getXCDNAME003());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDVALU003</column-name><column-value><![CDATA[");
		sb.append(getXCDVALU003());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDCODE004</column-name><column-value><![CDATA[");
		sb.append(getXCDCODE004());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDNAME004</column-name><column-value><![CDATA[");
		sb.append(getXCDNAME004());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDVALU004</column-name><column-value><![CDATA[");
		sb.append(getXCDVALU004());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDCODE005</column-name><column-value><![CDATA[");
		sb.append(getXCDCODE005());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDNAME005</column-name><column-value><![CDATA[");
		sb.append(getXCDNAME005());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDVALU005</column-name><column-value><![CDATA[");
		sb.append(getXCDVALU005());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDCODE006</column-name><column-value><![CDATA[");
		sb.append(getXCDCODE006());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDNAME006</column-name><column-value><![CDATA[");
		sb.append(getXCDNAME006());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDVALU006</column-name><column-value><![CDATA[");
		sb.append(getXCDVALU006());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDCODE007</column-name><column-value><![CDATA[");
		sb.append(getXCDCODE007());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDNAME007</column-name><column-value><![CDATA[");
		sb.append(getXCDNAME007());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDVALU007</column-name><column-value><![CDATA[");
		sb.append(getXCDVALU007());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDCODE008</column-name><column-value><![CDATA[");
		sb.append(getXCDCODE008());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDNAME008</column-name><column-value><![CDATA[");
		sb.append(getXCDNAME008());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDVALU008</column-name><column-value><![CDATA[");
		sb.append(getXCDVALU008());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDCODE009</column-name><column-value><![CDATA[");
		sb.append(getXCDCODE009());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDNAME009</column-name><column-value><![CDATA[");
		sb.append(getXCDNAME009());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDVALU009</column-name><column-value><![CDATA[");
		sb.append(getXCDVALU009());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDCODE010</column-name><column-value><![CDATA[");
		sb.append(getXCDCODE010());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDNAME010</column-name><column-value><![CDATA[");
		sb.append(getXCDNAME010());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDVALU010</column-name><column-value><![CDATA[");
		sb.append(getXCDVALU010());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDCODE011</column-name><column-value><![CDATA[");
		sb.append(getXCDCODE011());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDNAME011</column-name><column-value><![CDATA[");
		sb.append(getXCDNAME011());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDVALU011</column-name><column-value><![CDATA[");
		sb.append(getXCDVALU011());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDCODE012</column-name><column-value><![CDATA[");
		sb.append(getXCDCODE012());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDNAME012</column-name><column-value><![CDATA[");
		sb.append(getXCDNAME012());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCDVALU012</column-name><column-value><![CDATA[");
		sb.append(getXCDVALU012());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _hoSoThuTucId;
	private long _certificateRecordId;
	private long _vehicleGroupId;
	private Date _SynchDate;
	private String _XCD0009;
	private String _XCD0010;
	private String _XCD0011;
	private String _XCD0012;
	private String _XCD0013;
	private String _XCD0014;
	private String _XCD0015;
	private String _XCD0016;
	private String _XCD0017;
	private String _XCD1017;
	private String _XCD0018;
	private String _XCD0019;
	private String _XCD0020;
	private String _XCD0021;
	private String _XCD0022;
	private String _XCD0023;
	private String _XCD1023;
	private String _XCD0024;
	private String _XCDCODE001;
	private String _XCDNAME001;
	private String _XCDVALU001;
	private String _XCDCODE002;
	private String _XCDNAME002;
	private String _XCDVALU002;
	private String _XCDCODE003;
	private String _XCDNAME003;
	private String _XCDVALU003;
	private String _XCDCODE004;
	private String _XCDNAME004;
	private String _XCDVALU004;
	private String _XCDCODE005;
	private String _XCDNAME005;
	private String _XCDVALU005;
	private String _XCDCODE006;
	private String _XCDNAME006;
	private String _XCDVALU006;
	private String _XCDCODE007;
	private String _XCDNAME007;
	private String _XCDVALU007;
	private String _XCDCODE008;
	private String _XCDNAME008;
	private String _XCDVALU008;
	private String _XCDCODE009;
	private String _XCDNAME009;
	private String _XCDVALU009;
	private String _XCDCODE010;
	private String _XCDNAME010;
	private String _XCDVALU010;
	private String _XCDCODE011;
	private String _XCDNAME011;
	private String _XCDVALU011;
	private String _XCDCODE012;
	private String _XCDNAME012;
	private String _XCDVALU012;
	private BaseModel<?> _thongsochungchixechuyendungRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.class;
}