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
import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIDONGCOLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class THONGSOCHUNGCHIDONGCOClp extends BaseModelImpl<THONGSOCHUNGCHIDONGCO>
	implements THONGSOCHUNGCHIDONGCO {
	public THONGSOCHUNGCHIDONGCOClp() {
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

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_thongsochungchidongcoRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchidongcoRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_thongsochungchidongcoRemoteModel, id);
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

		if (_thongsochungchidongcoRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchidongcoRemoteModel.getClass();

				Method method = clazz.getMethod("setHoSoThuTucId", long.class);

				method.invoke(_thongsochungchidongcoRemoteModel, hoSoThuTucId);
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

		if (_thongsochungchidongcoRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchidongcoRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateRecordId",
						long.class);

				method.invoke(_thongsochungchidongcoRemoteModel,
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

		if (_thongsochungchidongcoRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchidongcoRemoteModel.getClass();

				Method method = clazz.getMethod("setVehicleGroupId", long.class);

				method.invoke(_thongsochungchidongcoRemoteModel, vehicleGroupId);
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

		if (_thongsochungchidongcoRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchidongcoRemoteModel.getClass();

				Method method = clazz.getMethod("setSynchDate", Date.class);

				method.invoke(_thongsochungchidongcoRemoteModel, SynchDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDCX0007() {
		return _DCX0007;
	}

	@Override
	public void setDCX0007(String DCX0007) {
		_DCX0007 = DCX0007;

		if (_thongsochungchidongcoRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchidongcoRemoteModel.getClass();

				Method method = clazz.getMethod("setDCX0007", String.class);

				method.invoke(_thongsochungchidongcoRemoteModel, DCX0007);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDCX0008() {
		return _DCX0008;
	}

	@Override
	public void setDCX0008(String DCX0008) {
		_DCX0008 = DCX0008;

		if (_thongsochungchidongcoRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchidongcoRemoteModel.getClass();

				Method method = clazz.getMethod("setDCX0008", String.class);

				method.invoke(_thongsochungchidongcoRemoteModel, DCX0008);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDCX0010() {
		return _DCX0010;
	}

	@Override
	public void setDCX0010(String DCX0010) {
		_DCX0010 = DCX0010;

		if (_thongsochungchidongcoRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchidongcoRemoteModel.getClass();

				Method method = clazz.getMethod("setDCX0010", String.class);

				method.invoke(_thongsochungchidongcoRemoteModel, DCX0010);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDCX0011() {
		return _DCX0011;
	}

	@Override
	public void setDCX0011(String DCX0011) {
		_DCX0011 = DCX0011;

		if (_thongsochungchidongcoRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchidongcoRemoteModel.getClass();

				Method method = clazz.getMethod("setDCX0011", String.class);

				method.invoke(_thongsochungchidongcoRemoteModel, DCX0011);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDCX0012() {
		return _DCX0012;
	}

	@Override
	public void setDCX0012(String DCX0012) {
		_DCX0012 = DCX0012;

		if (_thongsochungchidongcoRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchidongcoRemoteModel.getClass();

				Method method = clazz.getMethod("setDCX0012", String.class);

				method.invoke(_thongsochungchidongcoRemoteModel, DCX0012);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDCX1012() {
		return _DCX1012;
	}

	@Override
	public void setDCX1012(String DCX1012) {
		_DCX1012 = DCX1012;

		if (_thongsochungchidongcoRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchidongcoRemoteModel.getClass();

				Method method = clazz.getMethod("setDCX1012", String.class);

				method.invoke(_thongsochungchidongcoRemoteModel, DCX1012);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDCX0013() {
		return _DCX0013;
	}

	@Override
	public void setDCX0013(String DCX0013) {
		_DCX0013 = DCX0013;

		if (_thongsochungchidongcoRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchidongcoRemoteModel.getClass();

				Method method = clazz.getMethod("setDCX0013", String.class);

				method.invoke(_thongsochungchidongcoRemoteModel, DCX0013);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDCX1013() {
		return _DCX1013;
	}

	@Override
	public void setDCX1013(String DCX1013) {
		_DCX1013 = DCX1013;

		if (_thongsochungchidongcoRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchidongcoRemoteModel.getClass();

				Method method = clazz.getMethod("setDCX1013", String.class);

				method.invoke(_thongsochungchidongcoRemoteModel, DCX1013);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDCX0014() {
		return _DCX0014;
	}

	@Override
	public void setDCX0014(String DCX0014) {
		_DCX0014 = DCX0014;

		if (_thongsochungchidongcoRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchidongcoRemoteModel.getClass();

				Method method = clazz.getMethod("setDCX0014", String.class);

				method.invoke(_thongsochungchidongcoRemoteModel, DCX0014);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDCX0015() {
		return _DCX0015;
	}

	@Override
	public void setDCX0015(String DCX0015) {
		_DCX0015 = DCX0015;

		if (_thongsochungchidongcoRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchidongcoRemoteModel.getClass();

				Method method = clazz.getMethod("setDCX0015", String.class);

				method.invoke(_thongsochungchidongcoRemoteModel, DCX0015);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDCX0016() {
		return _DCX0016;
	}

	@Override
	public void setDCX0016(String DCX0016) {
		_DCX0016 = DCX0016;

		if (_thongsochungchidongcoRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchidongcoRemoteModel.getClass();

				Method method = clazz.getMethod("setDCX0016", String.class);

				method.invoke(_thongsochungchidongcoRemoteModel, DCX0016);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDCX0017() {
		return _DCX0017;
	}

	@Override
	public void setDCX0017(String DCX0017) {
		_DCX0017 = DCX0017;

		if (_thongsochungchidongcoRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchidongcoRemoteModel.getClass();

				Method method = clazz.getMethod("setDCX0017", String.class);

				method.invoke(_thongsochungchidongcoRemoteModel, DCX0017);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDCX0018() {
		return _DCX0018;
	}

	@Override
	public void setDCX0018(String DCX0018) {
		_DCX0018 = DCX0018;

		if (_thongsochungchidongcoRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchidongcoRemoteModel.getClass();

				Method method = clazz.getMethod("setDCX0018", String.class);

				method.invoke(_thongsochungchidongcoRemoteModel, DCX0018);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDCX0019() {
		return _DCX0019;
	}

	@Override
	public void setDCX0019(String DCX0019) {
		_DCX0019 = DCX0019;

		if (_thongsochungchidongcoRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchidongcoRemoteModel.getClass();

				Method method = clazz.getMethod("setDCX0019", String.class);

				method.invoke(_thongsochungchidongcoRemoteModel, DCX0019);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDCX0021() {
		return _DCX0021;
	}

	@Override
	public void setDCX0021(String DCX0021) {
		_DCX0021 = DCX0021;

		if (_thongsochungchidongcoRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchidongcoRemoteModel.getClass();

				Method method = clazz.getMethod("setDCX0021", String.class);

				method.invoke(_thongsochungchidongcoRemoteModel, DCX0021);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDCX0022() {
		return _DCX0022;
	}

	@Override
	public void setDCX0022(String DCX0022) {
		_DCX0022 = DCX0022;

		if (_thongsochungchidongcoRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchidongcoRemoteModel.getClass();

				Method method = clazz.getMethod("setDCX0022", String.class);

				method.invoke(_thongsochungchidongcoRemoteModel, DCX0022);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDCX0023() {
		return _DCX0023;
	}

	@Override
	public void setDCX0023(String DCX0023) {
		_DCX0023 = DCX0023;

		if (_thongsochungchidongcoRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchidongcoRemoteModel.getClass();

				Method method = clazz.getMethod("setDCX0023", String.class);

				method.invoke(_thongsochungchidongcoRemoteModel, DCX0023);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDCX0024() {
		return _DCX0024;
	}

	@Override
	public void setDCX0024(String DCX0024) {
		_DCX0024 = DCX0024;

		if (_thongsochungchidongcoRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchidongcoRemoteModel.getClass();

				Method method = clazz.getMethod("setDCX0024", String.class);

				method.invoke(_thongsochungchidongcoRemoteModel, DCX0024);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDCX0006() {
		return _DCX0006;
	}

	@Override
	public void setDCX0006(String DCX0006) {
		_DCX0006 = DCX0006;

		if (_thongsochungchidongcoRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchidongcoRemoteModel.getClass();

				Method method = clazz.getMethod("setDCX0006", String.class);

				method.invoke(_thongsochungchidongcoRemoteModel, DCX0006);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDCX0025() {
		return _DCX0025;
	}

	@Override
	public void setDCX0025(String DCX0025) {
		_DCX0025 = DCX0025;

		if (_thongsochungchidongcoRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchidongcoRemoteModel.getClass();

				Method method = clazz.getMethod("setDCX0025", String.class);

				method.invoke(_thongsochungchidongcoRemoteModel, DCX0025);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDCX0026() {
		return _DCX0026;
	}

	@Override
	public void setDCX0026(String DCX0026) {
		_DCX0026 = DCX0026;

		if (_thongsochungchidongcoRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchidongcoRemoteModel.getClass();

				Method method = clazz.getMethod("setDCX0026", String.class);

				method.invoke(_thongsochungchidongcoRemoteModel, DCX0026);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDCX0027() {
		return _DCX0027;
	}

	@Override
	public void setDCX0027(String DCX0027) {
		_DCX0027 = DCX0027;

		if (_thongsochungchidongcoRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchidongcoRemoteModel.getClass();

				Method method = clazz.getMethod("setDCX0027", String.class);

				method.invoke(_thongsochungchidongcoRemoteModel, DCX0027);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDCX0028() {
		return _DCX0028;
	}

	@Override
	public void setDCX0028(String DCX0028) {
		_DCX0028 = DCX0028;

		if (_thongsochungchidongcoRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchidongcoRemoteModel.getClass();

				Method method = clazz.getMethod("setDCX0028", String.class);

				method.invoke(_thongsochungchidongcoRemoteModel, DCX0028);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDCX0029() {
		return _DCX0029;
	}

	@Override
	public void setDCX0029(String DCX0029) {
		_DCX0029 = DCX0029;

		if (_thongsochungchidongcoRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchidongcoRemoteModel.getClass();

				Method method = clazz.getMethod("setDCX0029", String.class);

				method.invoke(_thongsochungchidongcoRemoteModel, DCX0029);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDCX0030() {
		return _DCX0030;
	}

	@Override
	public void setDCX0030(String DCX0030) {
		_DCX0030 = DCX0030;

		if (_thongsochungchidongcoRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchidongcoRemoteModel.getClass();

				Method method = clazz.getMethod("setDCX0030", String.class);

				method.invoke(_thongsochungchidongcoRemoteModel, DCX0030);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDCX0031() {
		return _DCX0031;
	}

	@Override
	public void setDCX0031(String DCX0031) {
		_DCX0031 = DCX0031;

		if (_thongsochungchidongcoRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchidongcoRemoteModel.getClass();

				Method method = clazz.getMethod("setDCX0031", String.class);

				method.invoke(_thongsochungchidongcoRemoteModel, DCX0031);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTHONGSOCHUNGCHIDONGCORemoteModel() {
		return _thongsochungchidongcoRemoteModel;
	}

	public void setTHONGSOCHUNGCHIDONGCORemoteModel(
		BaseModel<?> thongsochungchidongcoRemoteModel) {
		_thongsochungchidongcoRemoteModel = thongsochungchidongcoRemoteModel;
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

		Class<?> remoteModelClass = _thongsochungchidongcoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_thongsochungchidongcoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			THONGSOCHUNGCHIDONGCOLocalServiceUtil.addTHONGSOCHUNGCHIDONGCO(this);
		}
		else {
			THONGSOCHUNGCHIDONGCOLocalServiceUtil.updateTHONGSOCHUNGCHIDONGCO(this);
		}
	}

	@Override
	public THONGSOCHUNGCHIDONGCO toEscapedModel() {
		return (THONGSOCHUNGCHIDONGCO)ProxyUtil.newProxyInstance(THONGSOCHUNGCHIDONGCO.class.getClassLoader(),
			new Class[] { THONGSOCHUNGCHIDONGCO.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		THONGSOCHUNGCHIDONGCOClp clone = new THONGSOCHUNGCHIDONGCOClp();

		clone.setId(getId());
		clone.setHoSoThuTucId(getHoSoThuTucId());
		clone.setCertificateRecordId(getCertificateRecordId());
		clone.setVehicleGroupId(getVehicleGroupId());
		clone.setSynchDate(getSynchDate());
		clone.setDCX0007(getDCX0007());
		clone.setDCX0008(getDCX0008());
		clone.setDCX0010(getDCX0010());
		clone.setDCX0011(getDCX0011());
		clone.setDCX0012(getDCX0012());
		clone.setDCX1012(getDCX1012());
		clone.setDCX0013(getDCX0013());
		clone.setDCX1013(getDCX1013());
		clone.setDCX0014(getDCX0014());
		clone.setDCX0015(getDCX0015());
		clone.setDCX0016(getDCX0016());
		clone.setDCX0017(getDCX0017());
		clone.setDCX0018(getDCX0018());
		clone.setDCX0019(getDCX0019());
		clone.setDCX0021(getDCX0021());
		clone.setDCX0022(getDCX0022());
		clone.setDCX0023(getDCX0023());
		clone.setDCX0024(getDCX0024());
		clone.setDCX0006(getDCX0006());
		clone.setDCX0025(getDCX0025());
		clone.setDCX0026(getDCX0026());
		clone.setDCX0027(getDCX0027());
		clone.setDCX0028(getDCX0028());
		clone.setDCX0029(getDCX0029());
		clone.setDCX0030(getDCX0030());
		clone.setDCX0031(getDCX0031());

		return clone;
	}

	@Override
	public int compareTo(THONGSOCHUNGCHIDONGCO thongsochungchidongco) {
		int value = 0;

		if (getId() < thongsochungchidongco.getId()) {
			value = -1;
		}
		else if (getId() > thongsochungchidongco.getId()) {
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

		if (!(obj instanceof THONGSOCHUNGCHIDONGCOClp)) {
			return false;
		}

		THONGSOCHUNGCHIDONGCOClp thongsochungchidongco = (THONGSOCHUNGCHIDONGCOClp)obj;

		long primaryKey = thongsochungchidongco.getPrimaryKey();

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
		StringBundler sb = new StringBundler(63);

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
		sb.append(", DCX0007=");
		sb.append(getDCX0007());
		sb.append(", DCX0008=");
		sb.append(getDCX0008());
		sb.append(", DCX0010=");
		sb.append(getDCX0010());
		sb.append(", DCX0011=");
		sb.append(getDCX0011());
		sb.append(", DCX0012=");
		sb.append(getDCX0012());
		sb.append(", DCX1012=");
		sb.append(getDCX1012());
		sb.append(", DCX0013=");
		sb.append(getDCX0013());
		sb.append(", DCX1013=");
		sb.append(getDCX1013());
		sb.append(", DCX0014=");
		sb.append(getDCX0014());
		sb.append(", DCX0015=");
		sb.append(getDCX0015());
		sb.append(", DCX0016=");
		sb.append(getDCX0016());
		sb.append(", DCX0017=");
		sb.append(getDCX0017());
		sb.append(", DCX0018=");
		sb.append(getDCX0018());
		sb.append(", DCX0019=");
		sb.append(getDCX0019());
		sb.append(", DCX0021=");
		sb.append(getDCX0021());
		sb.append(", DCX0022=");
		sb.append(getDCX0022());
		sb.append(", DCX0023=");
		sb.append(getDCX0023());
		sb.append(", DCX0024=");
		sb.append(getDCX0024());
		sb.append(", DCX0006=");
		sb.append(getDCX0006());
		sb.append(", DCX0025=");
		sb.append(getDCX0025());
		sb.append(", DCX0026=");
		sb.append(getDCX0026());
		sb.append(", DCX0027=");
		sb.append(getDCX0027());
		sb.append(", DCX0028=");
		sb.append(getDCX0028());
		sb.append(", DCX0029=");
		sb.append(getDCX0029());
		sb.append(", DCX0030=");
		sb.append(getDCX0030());
		sb.append(", DCX0031=");
		sb.append(getDCX0031());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(97);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIDONGCO");
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
			"<column><column-name>DCX0007</column-name><column-value><![CDATA[");
		sb.append(getDCX0007());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DCX0008</column-name><column-value><![CDATA[");
		sb.append(getDCX0008());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DCX0010</column-name><column-value><![CDATA[");
		sb.append(getDCX0010());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DCX0011</column-name><column-value><![CDATA[");
		sb.append(getDCX0011());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DCX0012</column-name><column-value><![CDATA[");
		sb.append(getDCX0012());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DCX1012</column-name><column-value><![CDATA[");
		sb.append(getDCX1012());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DCX0013</column-name><column-value><![CDATA[");
		sb.append(getDCX0013());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DCX1013</column-name><column-value><![CDATA[");
		sb.append(getDCX1013());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DCX0014</column-name><column-value><![CDATA[");
		sb.append(getDCX0014());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DCX0015</column-name><column-value><![CDATA[");
		sb.append(getDCX0015());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DCX0016</column-name><column-value><![CDATA[");
		sb.append(getDCX0016());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DCX0017</column-name><column-value><![CDATA[");
		sb.append(getDCX0017());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DCX0018</column-name><column-value><![CDATA[");
		sb.append(getDCX0018());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DCX0019</column-name><column-value><![CDATA[");
		sb.append(getDCX0019());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DCX0021</column-name><column-value><![CDATA[");
		sb.append(getDCX0021());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DCX0022</column-name><column-value><![CDATA[");
		sb.append(getDCX0022());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DCX0023</column-name><column-value><![CDATA[");
		sb.append(getDCX0023());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DCX0024</column-name><column-value><![CDATA[");
		sb.append(getDCX0024());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DCX0006</column-name><column-value><![CDATA[");
		sb.append(getDCX0006());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DCX0025</column-name><column-value><![CDATA[");
		sb.append(getDCX0025());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DCX0026</column-name><column-value><![CDATA[");
		sb.append(getDCX0026());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DCX0027</column-name><column-value><![CDATA[");
		sb.append(getDCX0027());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DCX0028</column-name><column-value><![CDATA[");
		sb.append(getDCX0028());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DCX0029</column-name><column-value><![CDATA[");
		sb.append(getDCX0029());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DCX0030</column-name><column-value><![CDATA[");
		sb.append(getDCX0030());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DCX0031</column-name><column-value><![CDATA[");
		sb.append(getDCX0031());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _hoSoThuTucId;
	private long _certificateRecordId;
	private long _vehicleGroupId;
	private Date _SynchDate;
	private String _DCX0007;
	private String _DCX0008;
	private String _DCX0010;
	private String _DCX0011;
	private String _DCX0012;
	private String _DCX1012;
	private String _DCX0013;
	private String _DCX1013;
	private String _DCX0014;
	private String _DCX0015;
	private String _DCX0016;
	private String _DCX0017;
	private String _DCX0018;
	private String _DCX0019;
	private String _DCX0021;
	private String _DCX0022;
	private String _DCX0023;
	private String _DCX0024;
	private String _DCX0006;
	private String _DCX0025;
	private String _DCX0026;
	private String _DCX0027;
	private String _DCX0028;
	private String _DCX0029;
	private String _DCX0030;
	private String _DCX0031;
	private BaseModel<?> _thongsochungchidongcoRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.class;
}