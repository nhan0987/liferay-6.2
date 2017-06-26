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
import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEDAPDIENLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class THONGSOCHUNGCHIXEDAPDIENClp extends BaseModelImpl<THONGSOCHUNGCHIXEDAPDIEN>
	implements THONGSOCHUNGCHIXEDAPDIEN {
	public THONGSOCHUNGCHIXEDAPDIENClp() {
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

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, id);
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

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setHoSoThuTucId", long.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, hoSoThuTucId);
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

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateRecordId",
						long.class);

				method.invoke(_thongsochungchixedapdienRemoteModel,
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

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setVehicleGroupId", long.class);

				method.invoke(_thongsochungchixedapdienRemoteModel,
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

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setSynchDate", Date.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, SynchDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD0008() {
		return _XDD0008;
	}

	@Override
	public void setXDD0008(String XDD0008) {
		_XDD0008 = XDD0008;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD0008", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD0008);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD0009() {
		return _XDD0009;
	}

	@Override
	public void setXDD0009(String XDD0009) {
		_XDD0009 = XDD0009;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD0009", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD0009);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD0010() {
		return _XDD0010;
	}

	@Override
	public void setXDD0010(String XDD0010) {
		_XDD0010 = XDD0010;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD0010", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD0010);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD0011() {
		return _XDD0011;
	}

	@Override
	public void setXDD0011(String XDD0011) {
		_XDD0011 = XDD0011;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD0011", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD0011);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD0012() {
		return _XDD0012;
	}

	@Override
	public void setXDD0012(String XDD0012) {
		_XDD0012 = XDD0012;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD0012", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD0012);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD0013() {
		return _XDD0013;
	}

	@Override
	public void setXDD0013(String XDD0013) {
		_XDD0013 = XDD0013;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD0013", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD0013);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD0014() {
		return _XDD0014;
	}

	@Override
	public void setXDD0014(String XDD0014) {
		_XDD0014 = XDD0014;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD0014", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD0014);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD0015() {
		return _XDD0015;
	}

	@Override
	public void setXDD0015(String XDD0015) {
		_XDD0015 = XDD0015;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD0015", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD0015);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD0016() {
		return _XDD0016;
	}

	@Override
	public void setXDD0016(String XDD0016) {
		_XDD0016 = XDD0016;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD0016", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD0016);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD0017() {
		return _XDD0017;
	}

	@Override
	public void setXDD0017(String XDD0017) {
		_XDD0017 = XDD0017;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD0017", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD0017);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD0018() {
		return _XDD0018;
	}

	@Override
	public void setXDD0018(String XDD0018) {
		_XDD0018 = XDD0018;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD0018", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD0018);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD0019() {
		return _XDD0019;
	}

	@Override
	public void setXDD0019(String XDD0019) {
		_XDD0019 = XDD0019;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD0019", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD0019);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD0020() {
		return _XDD0020;
	}

	@Override
	public void setXDD0020(String XDD0020) {
		_XDD0020 = XDD0020;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD0020", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD0020);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD0021() {
		return _XDD0021;
	}

	@Override
	public void setXDD0021(String XDD0021) {
		_XDD0021 = XDD0021;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD0021", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD0021);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD0022() {
		return _XDD0022;
	}

	@Override
	public void setXDD0022(String XDD0022) {
		_XDD0022 = XDD0022;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD0022", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD0022);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD0023() {
		return _XDD0023;
	}

	@Override
	public void setXDD0023(String XDD0023) {
		_XDD0023 = XDD0023;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD0023", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD0023);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD0024() {
		return _XDD0024;
	}

	@Override
	public void setXDD0024(String XDD0024) {
		_XDD0024 = XDD0024;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD0024", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD0024);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD0025() {
		return _XDD0025;
	}

	@Override
	public void setXDD0025(String XDD0025) {
		_XDD0025 = XDD0025;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD0025", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD0025);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD0026() {
		return _XDD0026;
	}

	@Override
	public void setXDD0026(String XDD0026) {
		_XDD0026 = XDD0026;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD0026", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD0026);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD0027() {
		return _XDD0027;
	}

	@Override
	public void setXDD0027(String XDD0027) {
		_XDD0027 = XDD0027;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD0027", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD0027);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD1027() {
		return _XDD1027;
	}

	@Override
	public void setXDD1027(String XDD1027) {
		_XDD1027 = XDD1027;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD1027", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD1027);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD0028() {
		return _XDD0028;
	}

	@Override
	public void setXDD0028(String XDD0028) {
		_XDD0028 = XDD0028;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD0028", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD0028);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD1028() {
		return _XDD1028;
	}

	@Override
	public void setXDD1028(String XDD1028) {
		_XDD1028 = XDD1028;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD1028", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD1028);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD1128() {
		return _XDD1128;
	}

	@Override
	public void setXDD1128(String XDD1128) {
		_XDD1128 = XDD1128;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD1128", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD1128);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD0029() {
		return _XDD0029;
	}

	@Override
	public void setXDD0029(String XDD0029) {
		_XDD0029 = XDD0029;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD0029", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD0029);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD1029() {
		return _XDD1029;
	}

	@Override
	public void setXDD1029(String XDD1029) {
		_XDD1029 = XDD1029;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD1029", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD1029);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD1129() {
		return _XDD1129;
	}

	@Override
	public void setXDD1129(String XDD1129) {
		_XDD1129 = XDD1129;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD1129", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD1129);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD0030() {
		return _XDD0030;
	}

	@Override
	public void setXDD0030(String XDD0030) {
		_XDD0030 = XDD0030;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD0030", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD0030);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD0031() {
		return _XDD0031;
	}

	@Override
	public void setXDD0031(String XDD0031) {
		_XDD0031 = XDD0031;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD0031", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD0031);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD0032() {
		return _XDD0032;
	}

	@Override
	public void setXDD0032(String XDD0032) {
		_XDD0032 = XDD0032;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD0032", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD0032);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD0033() {
		return _XDD0033;
	}

	@Override
	public void setXDD0033(String XDD0033) {
		_XDD0033 = XDD0033;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD0033", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD0033);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD0034() {
		return _XDD0034;
	}

	@Override
	public void setXDD0034(String XDD0034) {
		_XDD0034 = XDD0034;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD0034", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD0034);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD1034() {
		return _XDD1034;
	}

	@Override
	public void setXDD1034(String XDD1034) {
		_XDD1034 = XDD1034;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD1034", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD1034);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD0035() {
		return _XDD0035;
	}

	@Override
	public void setXDD0035(String XDD0035) {
		_XDD0035 = XDD0035;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD0035", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD0035);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD1035() {
		return _XDD1035;
	}

	@Override
	public void setXDD1035(String XDD1035) {
		_XDD1035 = XDD1035;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD1035", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD1035);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD0036() {
		return _XDD0036;
	}

	@Override
	public void setXDD0036(String XDD0036) {
		_XDD0036 = XDD0036;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD0036", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD0036);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD0037() {
		return _XDD0037;
	}

	@Override
	public void setXDD0037(String XDD0037) {
		_XDD0037 = XDD0037;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD0037", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD0037);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXDD0038() {
		return _XDD0038;
	}

	@Override
	public void setXDD0038(String XDD0038) {
		_XDD0038 = XDD0038;

		if (_thongsochungchixedapdienRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixedapdienRemoteModel.getClass();

				Method method = clazz.getMethod("setXDD0038", String.class);

				method.invoke(_thongsochungchixedapdienRemoteModel, XDD0038);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTHONGSOCHUNGCHIXEDAPDIENRemoteModel() {
		return _thongsochungchixedapdienRemoteModel;
	}

	public void setTHONGSOCHUNGCHIXEDAPDIENRemoteModel(
		BaseModel<?> thongsochungchixedapdienRemoteModel) {
		_thongsochungchixedapdienRemoteModel = thongsochungchixedapdienRemoteModel;
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

		Class<?> remoteModelClass = _thongsochungchixedapdienRemoteModel.getClass();

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

		Object returnValue = method.invoke(_thongsochungchixedapdienRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			THONGSOCHUNGCHIXEDAPDIENLocalServiceUtil.addTHONGSOCHUNGCHIXEDAPDIEN(this);
		}
		else {
			THONGSOCHUNGCHIXEDAPDIENLocalServiceUtil.updateTHONGSOCHUNGCHIXEDAPDIEN(this);
		}
	}

	@Override
	public THONGSOCHUNGCHIXEDAPDIEN toEscapedModel() {
		return (THONGSOCHUNGCHIXEDAPDIEN)ProxyUtil.newProxyInstance(THONGSOCHUNGCHIXEDAPDIEN.class.getClassLoader(),
			new Class[] { THONGSOCHUNGCHIXEDAPDIEN.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		THONGSOCHUNGCHIXEDAPDIENClp clone = new THONGSOCHUNGCHIXEDAPDIENClp();

		clone.setId(getId());
		clone.setHoSoThuTucId(getHoSoThuTucId());
		clone.setCertificateRecordId(getCertificateRecordId());
		clone.setVehicleGroupId(getVehicleGroupId());
		clone.setSynchDate(getSynchDate());
		clone.setXDD0008(getXDD0008());
		clone.setXDD0009(getXDD0009());
		clone.setXDD0010(getXDD0010());
		clone.setXDD0011(getXDD0011());
		clone.setXDD0012(getXDD0012());
		clone.setXDD0013(getXDD0013());
		clone.setXDD0014(getXDD0014());
		clone.setXDD0015(getXDD0015());
		clone.setXDD0016(getXDD0016());
		clone.setXDD0017(getXDD0017());
		clone.setXDD0018(getXDD0018());
		clone.setXDD0019(getXDD0019());
		clone.setXDD0020(getXDD0020());
		clone.setXDD0021(getXDD0021());
		clone.setXDD0022(getXDD0022());
		clone.setXDD0023(getXDD0023());
		clone.setXDD0024(getXDD0024());
		clone.setXDD0025(getXDD0025());
		clone.setXDD0026(getXDD0026());
		clone.setXDD0027(getXDD0027());
		clone.setXDD1027(getXDD1027());
		clone.setXDD0028(getXDD0028());
		clone.setXDD1028(getXDD1028());
		clone.setXDD1128(getXDD1128());
		clone.setXDD0029(getXDD0029());
		clone.setXDD1029(getXDD1029());
		clone.setXDD1129(getXDD1129());
		clone.setXDD0030(getXDD0030());
		clone.setXDD0031(getXDD0031());
		clone.setXDD0032(getXDD0032());
		clone.setXDD0033(getXDD0033());
		clone.setXDD0034(getXDD0034());
		clone.setXDD1034(getXDD1034());
		clone.setXDD0035(getXDD0035());
		clone.setXDD1035(getXDD1035());
		clone.setXDD0036(getXDD0036());
		clone.setXDD0037(getXDD0037());
		clone.setXDD0038(getXDD0038());

		return clone;
	}

	@Override
	public int compareTo(THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien) {
		int value = 0;

		if (getId() < thongsochungchixedapdien.getId()) {
			value = -1;
		}
		else if (getId() > thongsochungchixedapdien.getId()) {
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

		if (!(obj instanceof THONGSOCHUNGCHIXEDAPDIENClp)) {
			return false;
		}

		THONGSOCHUNGCHIXEDAPDIENClp thongsochungchixedapdien = (THONGSOCHUNGCHIXEDAPDIENClp)obj;

		long primaryKey = thongsochungchixedapdien.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(87);

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
		sb.append(", XDD0008=");
		sb.append(getXDD0008());
		sb.append(", XDD0009=");
		sb.append(getXDD0009());
		sb.append(", XDD0010=");
		sb.append(getXDD0010());
		sb.append(", XDD0011=");
		sb.append(getXDD0011());
		sb.append(", XDD0012=");
		sb.append(getXDD0012());
		sb.append(", XDD0013=");
		sb.append(getXDD0013());
		sb.append(", XDD0014=");
		sb.append(getXDD0014());
		sb.append(", XDD0015=");
		sb.append(getXDD0015());
		sb.append(", XDD0016=");
		sb.append(getXDD0016());
		sb.append(", XDD0017=");
		sb.append(getXDD0017());
		sb.append(", XDD0018=");
		sb.append(getXDD0018());
		sb.append(", XDD0019=");
		sb.append(getXDD0019());
		sb.append(", XDD0020=");
		sb.append(getXDD0020());
		sb.append(", XDD0021=");
		sb.append(getXDD0021());
		sb.append(", XDD0022=");
		sb.append(getXDD0022());
		sb.append(", XDD0023=");
		sb.append(getXDD0023());
		sb.append(", XDD0024=");
		sb.append(getXDD0024());
		sb.append(", XDD0025=");
		sb.append(getXDD0025());
		sb.append(", XDD0026=");
		sb.append(getXDD0026());
		sb.append(", XDD0027=");
		sb.append(getXDD0027());
		sb.append(", XDD1027=");
		sb.append(getXDD1027());
		sb.append(", XDD0028=");
		sb.append(getXDD0028());
		sb.append(", XDD1028=");
		sb.append(getXDD1028());
		sb.append(", XDD1128=");
		sb.append(getXDD1128());
		sb.append(", XDD0029=");
		sb.append(getXDD0029());
		sb.append(", XDD1029=");
		sb.append(getXDD1029());
		sb.append(", XDD1129=");
		sb.append(getXDD1129());
		sb.append(", XDD0030=");
		sb.append(getXDD0030());
		sb.append(", XDD0031=");
		sb.append(getXDD0031());
		sb.append(", XDD0032=");
		sb.append(getXDD0032());
		sb.append(", XDD0033=");
		sb.append(getXDD0033());
		sb.append(", XDD0034=");
		sb.append(getXDD0034());
		sb.append(", XDD1034=");
		sb.append(getXDD1034());
		sb.append(", XDD0035=");
		sb.append(getXDD0035());
		sb.append(", XDD1035=");
		sb.append(getXDD1035());
		sb.append(", XDD0036=");
		sb.append(getXDD0036());
		sb.append(", XDD0037=");
		sb.append(getXDD0037());
		sb.append(", XDD0038=");
		sb.append(getXDD0038());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(133);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEDAPDIEN");
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
			"<column><column-name>XDD0008</column-name><column-value><![CDATA[");
		sb.append(getXDD0008());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD0009</column-name><column-value><![CDATA[");
		sb.append(getXDD0009());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD0010</column-name><column-value><![CDATA[");
		sb.append(getXDD0010());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD0011</column-name><column-value><![CDATA[");
		sb.append(getXDD0011());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD0012</column-name><column-value><![CDATA[");
		sb.append(getXDD0012());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD0013</column-name><column-value><![CDATA[");
		sb.append(getXDD0013());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD0014</column-name><column-value><![CDATA[");
		sb.append(getXDD0014());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD0015</column-name><column-value><![CDATA[");
		sb.append(getXDD0015());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD0016</column-name><column-value><![CDATA[");
		sb.append(getXDD0016());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD0017</column-name><column-value><![CDATA[");
		sb.append(getXDD0017());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD0018</column-name><column-value><![CDATA[");
		sb.append(getXDD0018());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD0019</column-name><column-value><![CDATA[");
		sb.append(getXDD0019());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD0020</column-name><column-value><![CDATA[");
		sb.append(getXDD0020());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD0021</column-name><column-value><![CDATA[");
		sb.append(getXDD0021());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD0022</column-name><column-value><![CDATA[");
		sb.append(getXDD0022());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD0023</column-name><column-value><![CDATA[");
		sb.append(getXDD0023());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD0024</column-name><column-value><![CDATA[");
		sb.append(getXDD0024());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD0025</column-name><column-value><![CDATA[");
		sb.append(getXDD0025());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD0026</column-name><column-value><![CDATA[");
		sb.append(getXDD0026());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD0027</column-name><column-value><![CDATA[");
		sb.append(getXDD0027());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD1027</column-name><column-value><![CDATA[");
		sb.append(getXDD1027());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD0028</column-name><column-value><![CDATA[");
		sb.append(getXDD0028());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD1028</column-name><column-value><![CDATA[");
		sb.append(getXDD1028());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD1128</column-name><column-value><![CDATA[");
		sb.append(getXDD1128());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD0029</column-name><column-value><![CDATA[");
		sb.append(getXDD0029());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD1029</column-name><column-value><![CDATA[");
		sb.append(getXDD1029());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD1129</column-name><column-value><![CDATA[");
		sb.append(getXDD1129());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD0030</column-name><column-value><![CDATA[");
		sb.append(getXDD0030());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD0031</column-name><column-value><![CDATA[");
		sb.append(getXDD0031());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD0032</column-name><column-value><![CDATA[");
		sb.append(getXDD0032());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD0033</column-name><column-value><![CDATA[");
		sb.append(getXDD0033());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD0034</column-name><column-value><![CDATA[");
		sb.append(getXDD0034());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD1034</column-name><column-value><![CDATA[");
		sb.append(getXDD1034());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD0035</column-name><column-value><![CDATA[");
		sb.append(getXDD0035());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD1035</column-name><column-value><![CDATA[");
		sb.append(getXDD1035());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD0036</column-name><column-value><![CDATA[");
		sb.append(getXDD0036());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD0037</column-name><column-value><![CDATA[");
		sb.append(getXDD0037());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XDD0038</column-name><column-value><![CDATA[");
		sb.append(getXDD0038());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _hoSoThuTucId;
	private long _certificateRecordId;
	private long _vehicleGroupId;
	private Date _SynchDate;
	private String _XDD0008;
	private String _XDD0009;
	private String _XDD0010;
	private String _XDD0011;
	private String _XDD0012;
	private String _XDD0013;
	private String _XDD0014;
	private String _XDD0015;
	private String _XDD0016;
	private String _XDD0017;
	private String _XDD0018;
	private String _XDD0019;
	private String _XDD0020;
	private String _XDD0021;
	private String _XDD0022;
	private String _XDD0023;
	private String _XDD0024;
	private String _XDD0025;
	private String _XDD0026;
	private String _XDD0027;
	private String _XDD1027;
	private String _XDD0028;
	private String _XDD1028;
	private String _XDD1128;
	private String _XDD0029;
	private String _XDD1029;
	private String _XDD1129;
	private String _XDD0030;
	private String _XDD0031;
	private String _XDD0032;
	private String _XDD0033;
	private String _XDD0034;
	private String _XDD1034;
	private String _XDD0035;
	private String _XDD1035;
	private String _XDD0036;
	private String _XDD0037;
	private String _XDD0038;
	private BaseModel<?> _thongsochungchixedapdienRemoteModel;
}