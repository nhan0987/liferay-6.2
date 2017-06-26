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
import vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyPhuLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author huymq
 */
public class MotCuaPhieuXuLyPhuClp extends BaseModelImpl<MotCuaPhieuXuLyPhu>
	implements MotCuaPhieuXuLyPhu {
	public MotCuaPhieuXuLyPhuClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return MotCuaPhieuXuLyPhu.class;
	}

	@Override
	public String getModelClassName() {
		return MotCuaPhieuXuLyPhu.class.getName();
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
		attributes.put("phieuXuLyChinhId", getPhieuXuLyChinhId());
		attributes.put("trichYeuNoiDung", getTrichYeuNoiDung());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("trangThaiHienTaiId", getTrangThaiHienTaiId());
		attributes.put("noiDungHoSoId", getNoiDungHoSoId());
		attributes.put("chiemQuyenXuLy", getChiemQuyenXuLy());
		attributes.put("ngayTaoPhieu", getNgayTaoPhieu());
		attributes.put("nguoiTaoPhieu", getNguoiTaoPhieu());
		attributes.put("nhomPhieuXuLy", getNhomPhieuXuLy());
		attributes.put("phanNhomHoSoId", getPhanNhomHoSoId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long phieuXuLyChinhId = (Long)attributes.get("phieuXuLyChinhId");

		if (phieuXuLyChinhId != null) {
			setPhieuXuLyChinhId(phieuXuLyChinhId);
		}

		String trichYeuNoiDung = (String)attributes.get("trichYeuNoiDung");

		if (trichYeuNoiDung != null) {
			setTrichYeuNoiDung(trichYeuNoiDung);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		Long trangThaiHienTaiId = (Long)attributes.get("trangThaiHienTaiId");

		if (trangThaiHienTaiId != null) {
			setTrangThaiHienTaiId(trangThaiHienTaiId);
		}

		Long noiDungHoSoId = (Long)attributes.get("noiDungHoSoId");

		if (noiDungHoSoId != null) {
			setNoiDungHoSoId(noiDungHoSoId);
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

		String nhomPhieuXuLy = (String)attributes.get("nhomPhieuXuLy");

		if (nhomPhieuXuLy != null) {
			setNhomPhieuXuLy(nhomPhieuXuLy);
		}

		Long phanNhomHoSoId = (Long)attributes.get("phanNhomHoSoId");

		if (phanNhomHoSoId != null) {
			setPhanNhomHoSoId(phanNhomHoSoId);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_motCuaPhieuXuLyPhuRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyPhuRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_motCuaPhieuXuLyPhuRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPhieuXuLyChinhId() {
		return _phieuXuLyChinhId;
	}

	@Override
	public void setPhieuXuLyChinhId(long phieuXuLyChinhId) {
		_phieuXuLyChinhId = phieuXuLyChinhId;

		if (_motCuaPhieuXuLyPhuRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyPhuRemoteModel.getClass();

				Method method = clazz.getMethod("setPhieuXuLyChinhId",
						long.class);

				method.invoke(_motCuaPhieuXuLyPhuRemoteModel, phieuXuLyChinhId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTrichYeuNoiDung() {
		return _trichYeuNoiDung;
	}

	@Override
	public void setTrichYeuNoiDung(String trichYeuNoiDung) {
		_trichYeuNoiDung = trichYeuNoiDung;

		if (_motCuaPhieuXuLyPhuRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyPhuRemoteModel.getClass();

				Method method = clazz.getMethod("setTrichYeuNoiDung",
						String.class);

				method.invoke(_motCuaPhieuXuLyPhuRemoteModel, trichYeuNoiDung);
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

		if (_motCuaPhieuXuLyPhuRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyPhuRemoteModel.getClass();

				Method method = clazz.getMethod("setGhiChu", String.class);

				method.invoke(_motCuaPhieuXuLyPhuRemoteModel, ghiChu);
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

		if (_motCuaPhieuXuLyPhuRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyPhuRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThaiHienTaiId",
						long.class);

				method.invoke(_motCuaPhieuXuLyPhuRemoteModel, trangThaiHienTaiId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNoiDungHoSoId() {
		return _noiDungHoSoId;
	}

	@Override
	public void setNoiDungHoSoId(long noiDungHoSoId) {
		_noiDungHoSoId = noiDungHoSoId;

		if (_motCuaPhieuXuLyPhuRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyPhuRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiDungHoSoId", long.class);

				method.invoke(_motCuaPhieuXuLyPhuRemoteModel, noiDungHoSoId);
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

		if (_motCuaPhieuXuLyPhuRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyPhuRemoteModel.getClass();

				Method method = clazz.getMethod("setChiemQuyenXuLy", long.class);

				method.invoke(_motCuaPhieuXuLyPhuRemoteModel, chiemQuyenXuLy);
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

		if (_motCuaPhieuXuLyPhuRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyPhuRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTaoPhieu", Date.class);

				method.invoke(_motCuaPhieuXuLyPhuRemoteModel, ngayTaoPhieu);
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

		if (_motCuaPhieuXuLyPhuRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyPhuRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiTaoPhieu", long.class);

				method.invoke(_motCuaPhieuXuLyPhuRemoteModel, nguoiTaoPhieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNhomPhieuXuLy() {
		return _nhomPhieuXuLy;
	}

	@Override
	public void setNhomPhieuXuLy(String nhomPhieuXuLy) {
		_nhomPhieuXuLy = nhomPhieuXuLy;

		if (_motCuaPhieuXuLyPhuRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyPhuRemoteModel.getClass();

				Method method = clazz.getMethod("setNhomPhieuXuLy", String.class);

				method.invoke(_motCuaPhieuXuLyPhuRemoteModel, nhomPhieuXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPhanNhomHoSoId() {
		return _phanNhomHoSoId;
	}

	@Override
	public void setPhanNhomHoSoId(long phanNhomHoSoId) {
		_phanNhomHoSoId = phanNhomHoSoId;

		if (_motCuaPhieuXuLyPhuRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaPhieuXuLyPhuRemoteModel.getClass();

				Method method = clazz.getMethod("setPhanNhomHoSoId", long.class);

				method.invoke(_motCuaPhieuXuLyPhuRemoteModel, phanNhomHoSoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getMotCuaPhieuXuLyPhuRemoteModel() {
		return _motCuaPhieuXuLyPhuRemoteModel;
	}

	public void setMotCuaPhieuXuLyPhuRemoteModel(
		BaseModel<?> motCuaPhieuXuLyPhuRemoteModel) {
		_motCuaPhieuXuLyPhuRemoteModel = motCuaPhieuXuLyPhuRemoteModel;
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

		Class<?> remoteModelClass = _motCuaPhieuXuLyPhuRemoteModel.getClass();

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

		Object returnValue = method.invoke(_motCuaPhieuXuLyPhuRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			MotCuaPhieuXuLyPhuLocalServiceUtil.addMotCuaPhieuXuLyPhu(this);
		}
		else {
			MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(this);
		}
	}

	@Override
	public MotCuaPhieuXuLyPhu toEscapedModel() {
		return (MotCuaPhieuXuLyPhu)ProxyUtil.newProxyInstance(MotCuaPhieuXuLyPhu.class.getClassLoader(),
			new Class[] { MotCuaPhieuXuLyPhu.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		MotCuaPhieuXuLyPhuClp clone = new MotCuaPhieuXuLyPhuClp();

		clone.setId(getId());
		clone.setPhieuXuLyChinhId(getPhieuXuLyChinhId());
		clone.setTrichYeuNoiDung(getTrichYeuNoiDung());
		clone.setGhiChu(getGhiChu());
		clone.setTrangThaiHienTaiId(getTrangThaiHienTaiId());
		clone.setNoiDungHoSoId(getNoiDungHoSoId());
		clone.setChiemQuyenXuLy(getChiemQuyenXuLy());
		clone.setNgayTaoPhieu(getNgayTaoPhieu());
		clone.setNguoiTaoPhieu(getNguoiTaoPhieu());
		clone.setNhomPhieuXuLy(getNhomPhieuXuLy());
		clone.setPhanNhomHoSoId(getPhanNhomHoSoId());

		return clone;
	}

	@Override
	public int compareTo(MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu) {
		int value = 0;

		if (getId() < motCuaPhieuXuLyPhu.getId()) {
			value = -1;
		}
		else if (getId() > motCuaPhieuXuLyPhu.getId()) {
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

		if (!(obj instanceof MotCuaPhieuXuLyPhuClp)) {
			return false;
		}

		MotCuaPhieuXuLyPhuClp motCuaPhieuXuLyPhu = (MotCuaPhieuXuLyPhuClp)obj;

		long primaryKey = motCuaPhieuXuLyPhu.getPrimaryKey();

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
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", phieuXuLyChinhId=");
		sb.append(getPhieuXuLyChinhId());
		sb.append(", trichYeuNoiDung=");
		sb.append(getTrichYeuNoiDung());
		sb.append(", ghiChu=");
		sb.append(getGhiChu());
		sb.append(", trangThaiHienTaiId=");
		sb.append(getTrangThaiHienTaiId());
		sb.append(", noiDungHoSoId=");
		sb.append(getNoiDungHoSoId());
		sb.append(", chiemQuyenXuLy=");
		sb.append(getChiemQuyenXuLy());
		sb.append(", ngayTaoPhieu=");
		sb.append(getNgayTaoPhieu());
		sb.append(", nguoiTaoPhieu=");
		sb.append(getNguoiTaoPhieu());
		sb.append(", nhomPhieuXuLy=");
		sb.append(getNhomPhieuXuLy());
		sb.append(", phanNhomHoSoId=");
		sb.append(getPhanNhomHoSoId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phieuXuLyChinhId</column-name><column-value><![CDATA[");
		sb.append(getPhieuXuLyChinhId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trichYeuNoiDung</column-name><column-value><![CDATA[");
		sb.append(getTrichYeuNoiDung());
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
			"<column><column-name>noiDungHoSoId</column-name><column-value><![CDATA[");
		sb.append(getNoiDungHoSoId());
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
			"<column><column-name>nhomPhieuXuLy</column-name><column-value><![CDATA[");
		sb.append(getNhomPhieuXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phanNhomHoSoId</column-name><column-value><![CDATA[");
		sb.append(getPhanNhomHoSoId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _phieuXuLyChinhId;
	private String _trichYeuNoiDung;
	private String _ghiChu;
	private long _trangThaiHienTaiId;
	private long _noiDungHoSoId;
	private long _chiemQuyenXuLy;
	private Date _ngayTaoPhieu;
	private long _nguoiTaoPhieu;
	private String _nhomPhieuXuLy;
	private long _phanNhomHoSoId;
	private BaseModel<?> _motCuaPhieuXuLyPhuRemoteModel;
}