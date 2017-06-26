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

package vn.dtt.gt.dk.dao.common.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.gt.dk.dao.common.service.ClpSerializer;
import vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class TthcPhanNhomHoSoClp extends BaseModelImpl<TthcPhanNhomHoSo>
	implements TthcPhanNhomHoSo {
	public TthcPhanNhomHoSoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TthcPhanNhomHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return TthcPhanNhomHoSo.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _Id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _Id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("MaPhanNhom", getMaPhanNhom());
		attributes.put("TenPhanNhom", getTenPhanNhom());
		attributes.put("TenTiengAnh", getTenTiengAnh());
		attributes.put("loaiPhieuXuLy", getLoaiPhieuXuLy());
		attributes.put("SoThuTu", getSoThuTu());
		attributes.put("SynchDate", getSynchDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String MaPhanNhom = (String)attributes.get("MaPhanNhom");

		if (MaPhanNhom != null) {
			setMaPhanNhom(MaPhanNhom);
		}

		String TenPhanNhom = (String)attributes.get("TenPhanNhom");

		if (TenPhanNhom != null) {
			setTenPhanNhom(TenPhanNhom);
		}

		String TenTiengAnh = (String)attributes.get("TenTiengAnh");

		if (TenTiengAnh != null) {
			setTenTiengAnh(TenTiengAnh);
		}

		Integer loaiPhieuXuLy = (Integer)attributes.get("loaiPhieuXuLy");

		if (loaiPhieuXuLy != null) {
			setLoaiPhieuXuLy(loaiPhieuXuLy);
		}

		Integer SoThuTu = (Integer)attributes.get("SoThuTu");

		if (SoThuTu != null) {
			setSoThuTu(SoThuTu);
		}

		Date SynchDate = (Date)attributes.get("SynchDate");

		if (SynchDate != null) {
			setSynchDate(SynchDate);
		}
	}

	@Override
	public long getId() {
		return _Id;
	}

	@Override
	public void setId(long Id) {
		_Id = Id;

		if (_tthcPhanNhomHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcPhanNhomHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tthcPhanNhomHoSoRemoteModel, Id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaPhanNhom() {
		return _MaPhanNhom;
	}

	@Override
	public void setMaPhanNhom(String MaPhanNhom) {
		_MaPhanNhom = MaPhanNhom;

		if (_tthcPhanNhomHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcPhanNhomHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setMaPhanNhom", String.class);

				method.invoke(_tthcPhanNhomHoSoRemoteModel, MaPhanNhom);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenPhanNhom() {
		return _TenPhanNhom;
	}

	@Override
	public void setTenPhanNhom(String TenPhanNhom) {
		_TenPhanNhom = TenPhanNhom;

		if (_tthcPhanNhomHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcPhanNhomHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setTenPhanNhom", String.class);

				method.invoke(_tthcPhanNhomHoSoRemoteModel, TenPhanNhom);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenTiengAnh() {
		return _TenTiengAnh;
	}

	@Override
	public void setTenTiengAnh(String TenTiengAnh) {
		_TenTiengAnh = TenTiengAnh;

		if (_tthcPhanNhomHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcPhanNhomHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setTenTiengAnh", String.class);

				method.invoke(_tthcPhanNhomHoSoRemoteModel, TenTiengAnh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLoaiPhieuXuLy() {
		return _loaiPhieuXuLy;
	}

	@Override
	public void setLoaiPhieuXuLy(int loaiPhieuXuLy) {
		_loaiPhieuXuLy = loaiPhieuXuLy;

		if (_tthcPhanNhomHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcPhanNhomHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiPhieuXuLy", int.class);

				method.invoke(_tthcPhanNhomHoSoRemoteModel, loaiPhieuXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoThuTu() {
		return _SoThuTu;
	}

	@Override
	public void setSoThuTu(int SoThuTu) {
		_SoThuTu = SoThuTu;

		if (_tthcPhanNhomHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcPhanNhomHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setSoThuTu", int.class);

				method.invoke(_tthcPhanNhomHoSoRemoteModel, SoThuTu);
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

		if (_tthcPhanNhomHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcPhanNhomHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setSynchDate", Date.class);

				method.invoke(_tthcPhanNhomHoSoRemoteModel, SynchDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTthcPhanNhomHoSoRemoteModel() {
		return _tthcPhanNhomHoSoRemoteModel;
	}

	public void setTthcPhanNhomHoSoRemoteModel(
		BaseModel<?> tthcPhanNhomHoSoRemoteModel) {
		_tthcPhanNhomHoSoRemoteModel = tthcPhanNhomHoSoRemoteModel;
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

		Class<?> remoteModelClass = _tthcPhanNhomHoSoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tthcPhanNhomHoSoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TthcPhanNhomHoSoLocalServiceUtil.addTthcPhanNhomHoSo(this);
		}
		else {
			TthcPhanNhomHoSoLocalServiceUtil.updateTthcPhanNhomHoSo(this);
		}
	}

	@Override
	public TthcPhanNhomHoSo toEscapedModel() {
		return (TthcPhanNhomHoSo)ProxyUtil.newProxyInstance(TthcPhanNhomHoSo.class.getClassLoader(),
			new Class[] { TthcPhanNhomHoSo.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TthcPhanNhomHoSoClp clone = new TthcPhanNhomHoSoClp();

		clone.setId(getId());
		clone.setMaPhanNhom(getMaPhanNhom());
		clone.setTenPhanNhom(getTenPhanNhom());
		clone.setTenTiengAnh(getTenTiengAnh());
		clone.setLoaiPhieuXuLy(getLoaiPhieuXuLy());
		clone.setSoThuTu(getSoThuTu());
		clone.setSynchDate(getSynchDate());

		return clone;
	}

	@Override
	public int compareTo(TthcPhanNhomHoSo tthcPhanNhomHoSo) {
		int value = 0;

		if (getId() < tthcPhanNhomHoSo.getId()) {
			value = -1;
		}
		else if (getId() > tthcPhanNhomHoSo.getId()) {
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

		if (!(obj instanceof TthcPhanNhomHoSoClp)) {
			return false;
		}

		TthcPhanNhomHoSoClp tthcPhanNhomHoSo = (TthcPhanNhomHoSoClp)obj;

		long primaryKey = tthcPhanNhomHoSo.getPrimaryKey();

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

		sb.append("{Id=");
		sb.append(getId());
		sb.append(", MaPhanNhom=");
		sb.append(getMaPhanNhom());
		sb.append(", TenPhanNhom=");
		sb.append(getTenPhanNhom());
		sb.append(", TenTiengAnh=");
		sb.append(getTenTiengAnh());
		sb.append(", loaiPhieuXuLy=");
		sb.append(getLoaiPhieuXuLy());
		sb.append(", SoThuTu=");
		sb.append(getSoThuTu());
		sb.append(", SynchDate=");
		sb.append(getSynchDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MaPhanNhom</column-name><column-value><![CDATA[");
		sb.append(getMaPhanNhom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenPhanNhom</column-name><column-value><![CDATA[");
		sb.append(getTenPhanNhom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenTiengAnh</column-name><column-value><![CDATA[");
		sb.append(getTenTiengAnh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiPhieuXuLy</column-name><column-value><![CDATA[");
		sb.append(getLoaiPhieuXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SoThuTu</column-name><column-value><![CDATA[");
		sb.append(getSoThuTu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SynchDate</column-name><column-value><![CDATA[");
		sb.append(getSynchDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _Id;
	private String _MaPhanNhom;
	private String _TenPhanNhom;
	private String _TenTiengAnh;
	private int _loaiPhieuXuLy;
	private int _SoThuTu;
	private Date _SynchDate;
	private BaseModel<?> _tthcPhanNhomHoSoRemoteModel;
}