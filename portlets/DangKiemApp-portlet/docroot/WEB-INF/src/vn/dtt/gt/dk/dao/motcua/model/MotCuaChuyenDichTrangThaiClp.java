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
import vn.dtt.gt.dk.dao.motcua.service.MotCuaChuyenDichTrangThaiLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class MotCuaChuyenDichTrangThaiClp extends BaseModelImpl<MotCuaChuyenDichTrangThai>
	implements MotCuaChuyenDichTrangThai {
	public MotCuaChuyenDichTrangThaiClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return MotCuaChuyenDichTrangThai.class;
	}

	@Override
	public String getModelClassName() {
		return MotCuaChuyenDichTrangThai.class.getName();
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
		attributes.put("trangThaiNguonId", getTrangThaiNguonId());
		attributes.put("trangThaiDichId", getTrangThaiDichId());
		attributes.put("dieuKienChuyenDich", getDieuKienChuyenDich());
		attributes.put("hanhDongXuLy", getHanhDongXuLy());
		attributes.put("soNgayXuLy", getSoNgayXuLy());
		attributes.put("phanNhomHoSoId", getPhanNhomHoSoId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long trangThaiNguonId = (Long)attributes.get("trangThaiNguonId");

		if (trangThaiNguonId != null) {
			setTrangThaiNguonId(trangThaiNguonId);
		}

		Long trangThaiDichId = (Long)attributes.get("trangThaiDichId");

		if (trangThaiDichId != null) {
			setTrangThaiDichId(trangThaiDichId);
		}

		String dieuKienChuyenDich = (String)attributes.get("dieuKienChuyenDich");

		if (dieuKienChuyenDich != null) {
			setDieuKienChuyenDich(dieuKienChuyenDich);
		}

		String hanhDongXuLy = (String)attributes.get("hanhDongXuLy");

		if (hanhDongXuLy != null) {
			setHanhDongXuLy(hanhDongXuLy);
		}

		Integer soNgayXuLy = (Integer)attributes.get("soNgayXuLy");

		if (soNgayXuLy != null) {
			setSoNgayXuLy(soNgayXuLy);
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

		if (_motCuaChuyenDichTrangThaiRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaChuyenDichTrangThaiRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_motCuaChuyenDichTrangThaiRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTrangThaiNguonId() {
		return _trangThaiNguonId;
	}

	@Override
	public void setTrangThaiNguonId(long trangThaiNguonId) {
		_trangThaiNguonId = trangThaiNguonId;

		if (_motCuaChuyenDichTrangThaiRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaChuyenDichTrangThaiRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThaiNguonId",
						long.class);

				method.invoke(_motCuaChuyenDichTrangThaiRemoteModel,
					trangThaiNguonId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTrangThaiDichId() {
		return _trangThaiDichId;
	}

	@Override
	public void setTrangThaiDichId(long trangThaiDichId) {
		_trangThaiDichId = trangThaiDichId;

		if (_motCuaChuyenDichTrangThaiRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaChuyenDichTrangThaiRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThaiDichId", long.class);

				method.invoke(_motCuaChuyenDichTrangThaiRemoteModel,
					trangThaiDichId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDieuKienChuyenDich() {
		return _dieuKienChuyenDich;
	}

	@Override
	public void setDieuKienChuyenDich(String dieuKienChuyenDich) {
		_dieuKienChuyenDich = dieuKienChuyenDich;

		if (_motCuaChuyenDichTrangThaiRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaChuyenDichTrangThaiRemoteModel.getClass();

				Method method = clazz.getMethod("setDieuKienChuyenDich",
						String.class);

				method.invoke(_motCuaChuyenDichTrangThaiRemoteModel,
					dieuKienChuyenDich);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getHanhDongXuLy() {
		return _hanhDongXuLy;
	}

	@Override
	public void setHanhDongXuLy(String hanhDongXuLy) {
		_hanhDongXuLy = hanhDongXuLy;

		if (_motCuaChuyenDichTrangThaiRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaChuyenDichTrangThaiRemoteModel.getClass();

				Method method = clazz.getMethod("setHanhDongXuLy", String.class);

				method.invoke(_motCuaChuyenDichTrangThaiRemoteModel,
					hanhDongXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoNgayXuLy() {
		return _soNgayXuLy;
	}

	@Override
	public void setSoNgayXuLy(int soNgayXuLy) {
		_soNgayXuLy = soNgayXuLy;

		if (_motCuaChuyenDichTrangThaiRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaChuyenDichTrangThaiRemoteModel.getClass();

				Method method = clazz.getMethod("setSoNgayXuLy", int.class);

				method.invoke(_motCuaChuyenDichTrangThaiRemoteModel, soNgayXuLy);
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

		if (_motCuaChuyenDichTrangThaiRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaChuyenDichTrangThaiRemoteModel.getClass();

				Method method = clazz.getMethod("setPhanNhomHoSoId", long.class);

				method.invoke(_motCuaChuyenDichTrangThaiRemoteModel,
					phanNhomHoSoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getMotCuaChuyenDichTrangThaiRemoteModel() {
		return _motCuaChuyenDichTrangThaiRemoteModel;
	}

	public void setMotCuaChuyenDichTrangThaiRemoteModel(
		BaseModel<?> motCuaChuyenDichTrangThaiRemoteModel) {
		_motCuaChuyenDichTrangThaiRemoteModel = motCuaChuyenDichTrangThaiRemoteModel;
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

		Class<?> remoteModelClass = _motCuaChuyenDichTrangThaiRemoteModel.getClass();

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

		Object returnValue = method.invoke(_motCuaChuyenDichTrangThaiRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			MotCuaChuyenDichTrangThaiLocalServiceUtil.addMotCuaChuyenDichTrangThai(this);
		}
		else {
			MotCuaChuyenDichTrangThaiLocalServiceUtil.updateMotCuaChuyenDichTrangThai(this);
		}
	}

	@Override
	public MotCuaChuyenDichTrangThai toEscapedModel() {
		return (MotCuaChuyenDichTrangThai)ProxyUtil.newProxyInstance(MotCuaChuyenDichTrangThai.class.getClassLoader(),
			new Class[] { MotCuaChuyenDichTrangThai.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		MotCuaChuyenDichTrangThaiClp clone = new MotCuaChuyenDichTrangThaiClp();

		clone.setId(getId());
		clone.setTrangThaiNguonId(getTrangThaiNguonId());
		clone.setTrangThaiDichId(getTrangThaiDichId());
		clone.setDieuKienChuyenDich(getDieuKienChuyenDich());
		clone.setHanhDongXuLy(getHanhDongXuLy());
		clone.setSoNgayXuLy(getSoNgayXuLy());
		clone.setPhanNhomHoSoId(getPhanNhomHoSoId());

		return clone;
	}

	@Override
	public int compareTo(MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai) {
		int value = 0;

		if (getId() < motCuaChuyenDichTrangThai.getId()) {
			value = -1;
		}
		else if (getId() > motCuaChuyenDichTrangThai.getId()) {
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

		if (!(obj instanceof MotCuaChuyenDichTrangThaiClp)) {
			return false;
		}

		MotCuaChuyenDichTrangThaiClp motCuaChuyenDichTrangThai = (MotCuaChuyenDichTrangThaiClp)obj;

		long primaryKey = motCuaChuyenDichTrangThai.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", trangThaiNguonId=");
		sb.append(getTrangThaiNguonId());
		sb.append(", trangThaiDichId=");
		sb.append(getTrangThaiDichId());
		sb.append(", dieuKienChuyenDich=");
		sb.append(getDieuKienChuyenDich());
		sb.append(", hanhDongXuLy=");
		sb.append(getHanhDongXuLy());
		sb.append(", soNgayXuLy=");
		sb.append(getSoNgayXuLy());
		sb.append(", phanNhomHoSoId=");
		sb.append(getPhanNhomHoSoId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThaiNguonId</column-name><column-value><![CDATA[");
		sb.append(getTrangThaiNguonId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThaiDichId</column-name><column-value><![CDATA[");
		sb.append(getTrangThaiDichId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dieuKienChuyenDich</column-name><column-value><![CDATA[");
		sb.append(getDieuKienChuyenDich());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hanhDongXuLy</column-name><column-value><![CDATA[");
		sb.append(getHanhDongXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soNgayXuLy</column-name><column-value><![CDATA[");
		sb.append(getSoNgayXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phanNhomHoSoId</column-name><column-value><![CDATA[");
		sb.append(getPhanNhomHoSoId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _trangThaiNguonId;
	private long _trangThaiDichId;
	private String _dieuKienChuyenDich;
	private String _hanhDongXuLy;
	private int _soNgayXuLy;
	private long _phanNhomHoSoId;
	private BaseModel<?> _motCuaChuyenDichTrangThaiRemoteModel;
}