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

package vn.dtt.gt.dk.dao.motcua.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.gt.dk.dao.motcua.service.ClpSerializer;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyChinhLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class MotCuaPhieuXuLyChinhClp extends BaseModelImpl<MotCuaPhieuXuLyChinh>
	implements MotCuaPhieuXuLyChinh {
	public MotCuaPhieuXuLyChinhClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return MotCuaPhieuXuLyChinh.class;
	}

	@Override
	public String getModelClassName() {
		return MotCuaPhieuXuLyChinh.class.getName();
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
		attributes.put("quyTrinhThuTucId", getQuyTrinhThuTucId());
		attributes.put("tenNguoiNop", getTenNguoiNop());
		attributes.put("cmndNguoiNop", getCmndNguoiNop());
		attributes.put("diaChiNguoiNop", getDiaChiNguoiNop());
		attributes.put("soDtddNguoiNop", getSoDtddNguoiNop());
		attributes.put("emailNguoiNop", getEmailNguoiNop());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("trangThaiHienTaiId", getTrangThaiHienTaiId());
		attributes.put("hetHoSoCon", getHetHoSoCon());
		attributes.put("chiemQuyenXuLy", getChiemQuyenXuLy());
		attributes.put("ngayTaoPhieu", getNgayTaoPhieu());
		attributes.put("nguoiTaoPhieu", getNguoiTaoPhieu());
		attributes.put("soDtcdNguoiNop", getSoDtcdNguoiNop());

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

		Long quyTrinhThuTucId = (Long)attributes.get("quyTrinhThuTucId");

		if (quyTrinhThuTucId != null) {
			setQuyTrinhThuTucId(quyTrinhThuTucId);
		}

		String tenNguoiNop = (String)attributes.get("tenNguoiNop");

		if (tenNguoiNop != null) {
			setTenNguoiNop(tenNguoiNop);
		}

		String cmndNguoiNop = (String)attributes.get("cmndNguoiNop");

		if (cmndNguoiNop != null) {
			setCmndNguoiNop(cmndNguoiNop);
		}

		String diaChiNguoiNop = (String)attributes.get("diaChiNguoiNop");

		if (diaChiNguoiNop != null) {
			setDiaChiNguoiNop(diaChiNguoiNop);
		}

		String soDtddNguoiNop = (String)attributes.get("soDtddNguoiNop");

		if (soDtddNguoiNop != null) {
			setSoDtddNguoiNop(soDtddNguoiNop);
		}

		String emailNguoiNop = (String)attributes.get("emailNguoiNop");

		if (emailNguoiNop != null) {
			setEmailNguoiNop(emailNguoiNop);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		Long trangThaiHienTaiId = (Long)attributes.get("trangThaiHienTaiId");

		if (trangThaiHienTaiId != null) {
			setTrangThaiHienTaiId(trangThaiHienTaiId);
		}

		Long hetHoSoCon = (Long)attributes.get("hetHoSoCon");

		if (hetHoSoCon != null) {
			setHetHoSoCon(hetHoSoCon);
		}

		Long chiemQuyenXuLy = (Long)attributes.get("chiemQuyenXuLy");

		if (chiemQuyenXuLy != null) {
			setChiemQuyenXuLy(chiemQuyenXuLy);
		}

		Date ngayTaoPhieu = (Date)attributes.get("ngayTaoPhieu");

		if (ngayTaoPhieu != null) {
			setNgayTaoPhieu(ngayTaoPhieu);
		}

		Long nguoiTaoPhieu = (Long)attributes.get("nguoiTaoPhieu");

		if (nguoiTaoPhieu != null) {
			setNguoiTaoPhieu(nguoiTaoPhieu);
		}

		String soDtcdNguoiNop = (String)attributes.get("soDtcdNguoiNop");

		if (soDtcdNguoiNop != null) {
			setSoDtcdNguoiNop(soDtcdNguoiNop);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_motCuaPhieuXuLyChinhRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyChinhRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_motCuaPhieuXuLyChinhRemoteModel, id);
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

		if (_motCuaPhieuXuLyChinhRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyChinhRemoteModel.getClass();

				Method method = clazz.getMethod("setHoSoThuTucId", long.class);

				method.invoke(_motCuaPhieuXuLyChinhRemoteModel, hoSoThuTucId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getQuyTrinhThuTucId() {
		return _quyTrinhThuTucId;
	}

	@Override
	public void setQuyTrinhThuTucId(long quyTrinhThuTucId) {
		_quyTrinhThuTucId = quyTrinhThuTucId;

		if (_motCuaPhieuXuLyChinhRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyChinhRemoteModel.getClass();

				Method method = clazz.getMethod("setQuyTrinhThuTucId",
						long.class);

				method.invoke(_motCuaPhieuXuLyChinhRemoteModel, quyTrinhThuTucId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenNguoiNop() {
		return _tenNguoiNop;
	}

	@Override
	public void setTenNguoiNop(String tenNguoiNop) {
		_tenNguoiNop = tenNguoiNop;

		if (_motCuaPhieuXuLyChinhRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyChinhRemoteModel.getClass();

				Method method = clazz.getMethod("setTenNguoiNop", String.class);

				method.invoke(_motCuaPhieuXuLyChinhRemoteModel, tenNguoiNop);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCmndNguoiNop() {
		return _cmndNguoiNop;
	}

	@Override
	public void setCmndNguoiNop(String cmndNguoiNop) {
		_cmndNguoiNop = cmndNguoiNop;

		if (_motCuaPhieuXuLyChinhRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyChinhRemoteModel.getClass();

				Method method = clazz.getMethod("setCmndNguoiNop", String.class);

				method.invoke(_motCuaPhieuXuLyChinhRemoteModel, cmndNguoiNop);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDiaChiNguoiNop() {
		return _diaChiNguoiNop;
	}

	@Override
	public void setDiaChiNguoiNop(String diaChiNguoiNop) {
		_diaChiNguoiNop = diaChiNguoiNop;

		if (_motCuaPhieuXuLyChinhRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyChinhRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChiNguoiNop",
						String.class);

				method.invoke(_motCuaPhieuXuLyChinhRemoteModel, diaChiNguoiNop);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoDtddNguoiNop() {
		return _soDtddNguoiNop;
	}

	@Override
	public void setSoDtddNguoiNop(String soDtddNguoiNop) {
		_soDtddNguoiNop = soDtddNguoiNop;

		if (_motCuaPhieuXuLyChinhRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyChinhRemoteModel.getClass();

				Method method = clazz.getMethod("setSoDtddNguoiNop",
						String.class);

				method.invoke(_motCuaPhieuXuLyChinhRemoteModel, soDtddNguoiNop);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmailNguoiNop() {
		return _emailNguoiNop;
	}

	@Override
	public void setEmailNguoiNop(String emailNguoiNop) {
		_emailNguoiNop = emailNguoiNop;

		if (_motCuaPhieuXuLyChinhRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyChinhRemoteModel.getClass();

				Method method = clazz.getMethod("setEmailNguoiNop", String.class);

				method.invoke(_motCuaPhieuXuLyChinhRemoteModel, emailNguoiNop);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGhiChu() {
		return _ghiChu;
	}

	@Override
	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;

		if (_motCuaPhieuXuLyChinhRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyChinhRemoteModel.getClass();

				Method method = clazz.getMethod("setGhiChu", String.class);

				method.invoke(_motCuaPhieuXuLyChinhRemoteModel, ghiChu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTrangThaiHienTaiId() {
		return _trangThaiHienTaiId;
	}

	@Override
	public void setTrangThaiHienTaiId(long trangThaiHienTaiId) {
		_trangThaiHienTaiId = trangThaiHienTaiId;

		if (_motCuaPhieuXuLyChinhRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyChinhRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThaiHienTaiId",
						long.class);

				method.invoke(_motCuaPhieuXuLyChinhRemoteModel,
					trangThaiHienTaiId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getHetHoSoCon() {
		return _hetHoSoCon;
	}

	@Override
	public void setHetHoSoCon(long hetHoSoCon) {
		_hetHoSoCon = hetHoSoCon;

		if (_motCuaPhieuXuLyChinhRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyChinhRemoteModel.getClass();

				Method method = clazz.getMethod("setHetHoSoCon", long.class);

				method.invoke(_motCuaPhieuXuLyChinhRemoteModel, hetHoSoCon);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getChiemQuyenXuLy() {
		return _chiemQuyenXuLy;
	}

	@Override
	public void setChiemQuyenXuLy(long chiemQuyenXuLy) {
		_chiemQuyenXuLy = chiemQuyenXuLy;

		if (_motCuaPhieuXuLyChinhRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyChinhRemoteModel.getClass();

				Method method = clazz.getMethod("setChiemQuyenXuLy", long.class);

				method.invoke(_motCuaPhieuXuLyChinhRemoteModel, chiemQuyenXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayTaoPhieu() {
		return _ngayTaoPhieu;
	}

	@Override
	public void setNgayTaoPhieu(Date ngayTaoPhieu) {
		_ngayTaoPhieu = ngayTaoPhieu;

		if (_motCuaPhieuXuLyChinhRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyChinhRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTaoPhieu", Date.class);

				method.invoke(_motCuaPhieuXuLyChinhRemoteModel, ngayTaoPhieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNguoiTaoPhieu() {
		return _nguoiTaoPhieu;
	}

	@Override
	public void setNguoiTaoPhieu(long nguoiTaoPhieu) {
		_nguoiTaoPhieu = nguoiTaoPhieu;

		if (_motCuaPhieuXuLyChinhRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyChinhRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiTaoPhieu", long.class);

				method.invoke(_motCuaPhieuXuLyChinhRemoteModel, nguoiTaoPhieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoDtcdNguoiNop() {
		return _soDtcdNguoiNop;
	}

	@Override
	public void setSoDtcdNguoiNop(String soDtcdNguoiNop) {
		_soDtcdNguoiNop = soDtcdNguoiNop;

		if (_motCuaPhieuXuLyChinhRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyChinhRemoteModel.getClass();

				Method method = clazz.getMethod("setSoDtcdNguoiNop",
						String.class);

				method.invoke(_motCuaPhieuXuLyChinhRemoteModel, soDtcdNguoiNop);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getMotCuaPhieuXuLyChinhRemoteModel() {
		return _motCuaPhieuXuLyChinhRemoteModel;
	}

	public void setMotCuaPhieuXuLyChinhRemoteModel(
		BaseModel<?> motCuaPhieuXuLyChinhRemoteModel) {
		_motCuaPhieuXuLyChinhRemoteModel = motCuaPhieuXuLyChinhRemoteModel;
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

		Class<?> remoteModelClass = _motCuaPhieuXuLyChinhRemoteModel.getClass();

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

		Object returnValue = method.invoke(_motCuaPhieuXuLyChinhRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			MotCuaPhieuXuLyChinhLocalServiceUtil.addMotCuaPhieuXuLyChinh(this);
		}
		else {
			MotCuaPhieuXuLyChinhLocalServiceUtil.updateMotCuaPhieuXuLyChinh(this);
		}
	}

	@Override
	public MotCuaPhieuXuLyChinh toEscapedModel() {
		return (MotCuaPhieuXuLyChinh)ProxyUtil.newProxyInstance(MotCuaPhieuXuLyChinh.class.getClassLoader(),
			new Class[] { MotCuaPhieuXuLyChinh.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		MotCuaPhieuXuLyChinhClp clone = new MotCuaPhieuXuLyChinhClp();

		clone.setId(getId());
		clone.setHoSoThuTucId(getHoSoThuTucId());
		clone.setQuyTrinhThuTucId(getQuyTrinhThuTucId());
		clone.setTenNguoiNop(getTenNguoiNop());
		clone.setCmndNguoiNop(getCmndNguoiNop());
		clone.setDiaChiNguoiNop(getDiaChiNguoiNop());
		clone.setSoDtddNguoiNop(getSoDtddNguoiNop());
		clone.setEmailNguoiNop(getEmailNguoiNop());
		clone.setGhiChu(getGhiChu());
		clone.setTrangThaiHienTaiId(getTrangThaiHienTaiId());
		clone.setHetHoSoCon(getHetHoSoCon());
		clone.setChiemQuyenXuLy(getChiemQuyenXuLy());
		clone.setNgayTaoPhieu(getNgayTaoPhieu());
		clone.setNguoiTaoPhieu(getNguoiTaoPhieu());
		clone.setSoDtcdNguoiNop(getSoDtcdNguoiNop());

		return clone;
	}

	@Override
	public int compareTo(MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh) {
		int value = 0;

		if (getId() < motCuaPhieuXuLyChinh.getId()) {
			value = -1;
		}
		else if (getId() > motCuaPhieuXuLyChinh.getId()) {
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

		if (!(obj instanceof MotCuaPhieuXuLyChinhClp)) {
			return false;
		}

		MotCuaPhieuXuLyChinhClp motCuaPhieuXuLyChinh = (MotCuaPhieuXuLyChinhClp)obj;

		long primaryKey = motCuaPhieuXuLyChinh.getPrimaryKey();

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
		StringBundler sb = new StringBundler(31);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", hoSoThuTucId=");
		sb.append(getHoSoThuTucId());
		sb.append(", quyTrinhThuTucId=");
		sb.append(getQuyTrinhThuTucId());
		sb.append(", tenNguoiNop=");
		sb.append(getTenNguoiNop());
		sb.append(", cmndNguoiNop=");
		sb.append(getCmndNguoiNop());
		sb.append(", diaChiNguoiNop=");
		sb.append(getDiaChiNguoiNop());
		sb.append(", soDtddNguoiNop=");
		sb.append(getSoDtddNguoiNop());
		sb.append(", emailNguoiNop=");
		sb.append(getEmailNguoiNop());
		sb.append(", ghiChu=");
		sb.append(getGhiChu());
		sb.append(", trangThaiHienTaiId=");
		sb.append(getTrangThaiHienTaiId());
		sb.append(", hetHoSoCon=");
		sb.append(getHetHoSoCon());
		sb.append(", chiemQuyenXuLy=");
		sb.append(getChiemQuyenXuLy());
		sb.append(", ngayTaoPhieu=");
		sb.append(getNgayTaoPhieu());
		sb.append(", nguoiTaoPhieu=");
		sb.append(getNguoiTaoPhieu());
		sb.append(", soDtcdNguoiNop=");
		sb.append(getSoDtcdNguoiNop());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh");
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
			"<column><column-name>quyTrinhThuTucId</column-name><column-value><![CDATA[");
		sb.append(getQuyTrinhThuTucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenNguoiNop</column-name><column-value><![CDATA[");
		sb.append(getTenNguoiNop());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cmndNguoiNop</column-name><column-value><![CDATA[");
		sb.append(getCmndNguoiNop());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>diaChiNguoiNop</column-name><column-value><![CDATA[");
		sb.append(getDiaChiNguoiNop());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soDtddNguoiNop</column-name><column-value><![CDATA[");
		sb.append(getSoDtddNguoiNop());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emailNguoiNop</column-name><column-value><![CDATA[");
		sb.append(getEmailNguoiNop());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ghiChu</column-name><column-value><![CDATA[");
		sb.append(getGhiChu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThaiHienTaiId</column-name><column-value><![CDATA[");
		sb.append(getTrangThaiHienTaiId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hetHoSoCon</column-name><column-value><![CDATA[");
		sb.append(getHetHoSoCon());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chiemQuyenXuLy</column-name><column-value><![CDATA[");
		sb.append(getChiemQuyenXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayTaoPhieu</column-name><column-value><![CDATA[");
		sb.append(getNgayTaoPhieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiTaoPhieu</column-name><column-value><![CDATA[");
		sb.append(getNguoiTaoPhieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soDtcdNguoiNop</column-name><column-value><![CDATA[");
		sb.append(getSoDtcdNguoiNop());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _hoSoThuTucId;
	private long _quyTrinhThuTucId;
	private String _tenNguoiNop;
	private String _cmndNguoiNop;
	private String _diaChiNguoiNop;
	private String _soDtddNguoiNop;
	private String _emailNguoiNop;
	private String _ghiChu;
	private long _trangThaiHienTaiId;
	private long _hetHoSoCon;
	private long _chiemQuyenXuLy;
	private Date _ngayTaoPhieu;
	private long _nguoiTaoPhieu;
	private String _soDtcdNguoiNop;
	private BaseModel<?> _motCuaPhieuXuLyChinhRemoteModel;
}