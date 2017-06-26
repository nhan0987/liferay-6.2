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
import vn.dtt.gt.dk.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class TthcThanhPhanHoSoClp extends BaseModelImpl<TthcThanhPhanHoSo>
	implements TthcThanhPhanHoSo {
	public TthcThanhPhanHoSoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TthcThanhPhanHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return TthcThanhPhanHoSo.class.getName();
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
		attributes.put("ThuTucHanhChinhId", getThuTucHanhChinhId());
		attributes.put("BieuMauHoSoId", getBieuMauHoSoId());
		attributes.put("ThuTuHienThi", getThuTuHienThi());
		attributes.put("LoaiThanhPhan", getLoaiThanhPhan());
		attributes.put("MauTrucTuyen", getMauTrucTuyen());
		attributes.put("SoTaiLieuDinhKem", getSoTaiLieuDinhKem());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		Long ThuTucHanhChinhId = (Long)attributes.get("ThuTucHanhChinhId");

		if (ThuTucHanhChinhId != null) {
			setThuTucHanhChinhId(ThuTucHanhChinhId);
		}

		Long BieuMauHoSoId = (Long)attributes.get("BieuMauHoSoId");

		if (BieuMauHoSoId != null) {
			setBieuMauHoSoId(BieuMauHoSoId);
		}

		Long ThuTuHienThi = (Long)attributes.get("ThuTuHienThi");

		if (ThuTuHienThi != null) {
			setThuTuHienThi(ThuTuHienThi);
		}

		Long LoaiThanhPhan = (Long)attributes.get("LoaiThanhPhan");

		if (LoaiThanhPhan != null) {
			setLoaiThanhPhan(LoaiThanhPhan);
		}

		String MauTrucTuyen = (String)attributes.get("MauTrucTuyen");

		if (MauTrucTuyen != null) {
			setMauTrucTuyen(MauTrucTuyen);
		}

		Long SoTaiLieuDinhKem = (Long)attributes.get("SoTaiLieuDinhKem");

		if (SoTaiLieuDinhKem != null) {
			setSoTaiLieuDinhKem(SoTaiLieuDinhKem);
		}
	}

	@Override
	public long getId() {
		return _Id;
	}

	@Override
	public void setId(long Id) {
		_Id = Id;

		if (_tthcThanhPhanHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThanhPhanHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tthcThanhPhanHoSoRemoteModel, Id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getThuTucHanhChinhId() {
		return _ThuTucHanhChinhId;
	}

	@Override
	public void setThuTucHanhChinhId(long ThuTucHanhChinhId) {
		_ThuTucHanhChinhId = ThuTucHanhChinhId;

		if (_tthcThanhPhanHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThanhPhanHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setThuTucHanhChinhId",
						long.class);

				method.invoke(_tthcThanhPhanHoSoRemoteModel, ThuTucHanhChinhId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getBieuMauHoSoId() {
		return _BieuMauHoSoId;
	}

	@Override
	public void setBieuMauHoSoId(long BieuMauHoSoId) {
		_BieuMauHoSoId = BieuMauHoSoId;

		if (_tthcThanhPhanHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThanhPhanHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setBieuMauHoSoId", long.class);

				method.invoke(_tthcThanhPhanHoSoRemoteModel, BieuMauHoSoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getThuTuHienThi() {
		return _ThuTuHienThi;
	}

	@Override
	public void setThuTuHienThi(long ThuTuHienThi) {
		_ThuTuHienThi = ThuTuHienThi;

		if (_tthcThanhPhanHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThanhPhanHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setThuTuHienThi", long.class);

				method.invoke(_tthcThanhPhanHoSoRemoteModel, ThuTuHienThi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getLoaiThanhPhan() {
		return _LoaiThanhPhan;
	}

	@Override
	public void setLoaiThanhPhan(long LoaiThanhPhan) {
		_LoaiThanhPhan = LoaiThanhPhan;

		if (_tthcThanhPhanHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThanhPhanHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiThanhPhan", long.class);

				method.invoke(_tthcThanhPhanHoSoRemoteModel, LoaiThanhPhan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMauTrucTuyen() {
		return _MauTrucTuyen;
	}

	@Override
	public void setMauTrucTuyen(String MauTrucTuyen) {
		_MauTrucTuyen = MauTrucTuyen;

		if (_tthcThanhPhanHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThanhPhanHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setMauTrucTuyen", String.class);

				method.invoke(_tthcThanhPhanHoSoRemoteModel, MauTrucTuyen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSoTaiLieuDinhKem() {
		return _SoTaiLieuDinhKem;
	}

	@Override
	public void setSoTaiLieuDinhKem(long SoTaiLieuDinhKem) {
		_SoTaiLieuDinhKem = SoTaiLieuDinhKem;

		if (_tthcThanhPhanHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThanhPhanHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setSoTaiLieuDinhKem",
						long.class);

				method.invoke(_tthcThanhPhanHoSoRemoteModel, SoTaiLieuDinhKem);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTthcThanhPhanHoSoRemoteModel() {
		return _tthcThanhPhanHoSoRemoteModel;
	}

	public void setTthcThanhPhanHoSoRemoteModel(
		BaseModel<?> tthcThanhPhanHoSoRemoteModel) {
		_tthcThanhPhanHoSoRemoteModel = tthcThanhPhanHoSoRemoteModel;
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

		Class<?> remoteModelClass = _tthcThanhPhanHoSoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tthcThanhPhanHoSoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TthcThanhPhanHoSoLocalServiceUtil.addTthcThanhPhanHoSo(this);
		}
		else {
			TthcThanhPhanHoSoLocalServiceUtil.updateTthcThanhPhanHoSo(this);
		}
	}

	@Override
	public TthcThanhPhanHoSo toEscapedModel() {
		return (TthcThanhPhanHoSo)ProxyUtil.newProxyInstance(TthcThanhPhanHoSo.class.getClassLoader(),
			new Class[] { TthcThanhPhanHoSo.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TthcThanhPhanHoSoClp clone = new TthcThanhPhanHoSoClp();

		clone.setId(getId());
		clone.setThuTucHanhChinhId(getThuTucHanhChinhId());
		clone.setBieuMauHoSoId(getBieuMauHoSoId());
		clone.setThuTuHienThi(getThuTuHienThi());
		clone.setLoaiThanhPhan(getLoaiThanhPhan());
		clone.setMauTrucTuyen(getMauTrucTuyen());
		clone.setSoTaiLieuDinhKem(getSoTaiLieuDinhKem());

		return clone;
	}

	@Override
	public int compareTo(TthcThanhPhanHoSo tthcThanhPhanHoSo) {
		int value = 0;

		if (getId() < tthcThanhPhanHoSo.getId()) {
			value = -1;
		}
		else if (getId() > tthcThanhPhanHoSo.getId()) {
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

		if (!(obj instanceof TthcThanhPhanHoSoClp)) {
			return false;
		}

		TthcThanhPhanHoSoClp tthcThanhPhanHoSo = (TthcThanhPhanHoSoClp)obj;

		long primaryKey = tthcThanhPhanHoSo.getPrimaryKey();

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
		sb.append(", ThuTucHanhChinhId=");
		sb.append(getThuTucHanhChinhId());
		sb.append(", BieuMauHoSoId=");
		sb.append(getBieuMauHoSoId());
		sb.append(", ThuTuHienThi=");
		sb.append(getThuTuHienThi());
		sb.append(", LoaiThanhPhan=");
		sb.append(getLoaiThanhPhan());
		sb.append(", MauTrucTuyen=");
		sb.append(getMauTrucTuyen());
		sb.append(", SoTaiLieuDinhKem=");
		sb.append(getSoTaiLieuDinhKem());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ThuTucHanhChinhId</column-name><column-value><![CDATA[");
		sb.append(getThuTucHanhChinhId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BieuMauHoSoId</column-name><column-value><![CDATA[");
		sb.append(getBieuMauHoSoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ThuTuHienThi</column-name><column-value><![CDATA[");
		sb.append(getThuTuHienThi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LoaiThanhPhan</column-name><column-value><![CDATA[");
		sb.append(getLoaiThanhPhan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MauTrucTuyen</column-name><column-value><![CDATA[");
		sb.append(getMauTrucTuyen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SoTaiLieuDinhKem</column-name><column-value><![CDATA[");
		sb.append(getSoTaiLieuDinhKem());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _Id;
	private long _ThuTucHanhChinhId;
	private long _BieuMauHoSoId;
	private long _ThuTuHienThi;
	private long _LoaiThanhPhan;
	private String _MauTrucTuyen;
	private long _SoTaiLieuDinhKem;
	private BaseModel<?> _tthcThanhPhanHoSoRemoteModel;
}