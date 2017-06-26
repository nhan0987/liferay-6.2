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
import vn.dtt.gt.dk.dao.motcua.service.MotCuaDienBienHoSoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class MotCuaDienBienHoSoClp extends BaseModelImpl<MotCuaDienBienHoSo>
	implements MotCuaDienBienHoSo {
	public MotCuaDienBienHoSoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return MotCuaDienBienHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return MotCuaDienBienHoSo.class.getName();
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
		attributes.put("phieuXuLyPhuId", getPhieuXuLyPhuId());
		attributes.put("soNgayQuaHan", getSoNgayQuaHan());
		attributes.put("trangThaiTruocId", getTrangThaiTruocId());
		attributes.put("trangThaiSauId", getTrangThaiSauId());
		attributes.put("ngayXuLy", getNgayXuLy());
		attributes.put("nguoiXuLy", getNguoiXuLy());
		attributes.put("hanhDongXuLy", getHanhDongXuLy());
		attributes.put("SynchDate", getSynchDate());

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

		Long phieuXuLyPhuId = (Long)attributes.get("phieuXuLyPhuId");

		if (phieuXuLyPhuId != null) {
			setPhieuXuLyPhuId(phieuXuLyPhuId);
		}

		Integer soNgayQuaHan = (Integer)attributes.get("soNgayQuaHan");

		if (soNgayQuaHan != null) {
			setSoNgayQuaHan(soNgayQuaHan);
		}

		Long trangThaiTruocId = (Long)attributes.get("trangThaiTruocId");

		if (trangThaiTruocId != null) {
			setTrangThaiTruocId(trangThaiTruocId);
		}

		Long trangThaiSauId = (Long)attributes.get("trangThaiSauId");

		if (trangThaiSauId != null) {
			setTrangThaiSauId(trangThaiSauId);
		}

		Date ngayXuLy = (Date)attributes.get("ngayXuLy");

		if (ngayXuLy != null) {
			setNgayXuLy(ngayXuLy);
		}

		Long nguoiXuLy = (Long)attributes.get("nguoiXuLy");

		if (nguoiXuLy != null) {
			setNguoiXuLy(nguoiXuLy);
		}

		String hanhDongXuLy = (String)attributes.get("hanhDongXuLy");

		if (hanhDongXuLy != null) {
			setHanhDongXuLy(hanhDongXuLy);
		}

		Date SynchDate = (Date)attributes.get("SynchDate");

		if (SynchDate != null) {
			setSynchDate(SynchDate);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_motCuaDienBienHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaDienBienHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_motCuaDienBienHoSoRemoteModel, id);
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

		if (_motCuaDienBienHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaDienBienHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setPhieuXuLyChinhId",
						long.class);

				method.invoke(_motCuaDienBienHoSoRemoteModel, phieuXuLyChinhId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPhieuXuLyPhuId() {
		return _phieuXuLyPhuId;
	}

	@Override
	public void setPhieuXuLyPhuId(long phieuXuLyPhuId) {
		_phieuXuLyPhuId = phieuXuLyPhuId;

		if (_motCuaDienBienHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaDienBienHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setPhieuXuLyPhuId", long.class);

				method.invoke(_motCuaDienBienHoSoRemoteModel, phieuXuLyPhuId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoNgayQuaHan() {
		return _soNgayQuaHan;
	}

	@Override
	public void setSoNgayQuaHan(int soNgayQuaHan) {
		_soNgayQuaHan = soNgayQuaHan;

		if (_motCuaDienBienHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaDienBienHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setSoNgayQuaHan", int.class);

				method.invoke(_motCuaDienBienHoSoRemoteModel, soNgayQuaHan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTrangThaiTruocId() {
		return _trangThaiTruocId;
	}

	@Override
	public void setTrangThaiTruocId(long trangThaiTruocId) {
		_trangThaiTruocId = trangThaiTruocId;

		if (_motCuaDienBienHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaDienBienHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThaiTruocId",
						long.class);

				method.invoke(_motCuaDienBienHoSoRemoteModel, trangThaiTruocId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTrangThaiSauId() {
		return _trangThaiSauId;
	}

	@Override
	public void setTrangThaiSauId(long trangThaiSauId) {
		_trangThaiSauId = trangThaiSauId;

		if (_motCuaDienBienHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaDienBienHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThaiSauId", long.class);

				method.invoke(_motCuaDienBienHoSoRemoteModel, trangThaiSauId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayXuLy() {
		return _ngayXuLy;
	}

	@Override
	public void setNgayXuLy(Date ngayXuLy) {
		_ngayXuLy = ngayXuLy;

		if (_motCuaDienBienHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaDienBienHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayXuLy", Date.class);

				method.invoke(_motCuaDienBienHoSoRemoteModel, ngayXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNguoiXuLy() {
		return _nguoiXuLy;
	}

	@Override
	public void setNguoiXuLy(long nguoiXuLy) {
		_nguoiXuLy = nguoiXuLy;

		if (_motCuaDienBienHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaDienBienHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiXuLy", long.class);

				method.invoke(_motCuaDienBienHoSoRemoteModel, nguoiXuLy);
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

		if (_motCuaDienBienHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaDienBienHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setHanhDongXuLy", String.class);

				method.invoke(_motCuaDienBienHoSoRemoteModel, hanhDongXuLy);
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

		if (_motCuaDienBienHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaDienBienHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setSynchDate", Date.class);

				method.invoke(_motCuaDienBienHoSoRemoteModel, SynchDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getMotCuaDienBienHoSoRemoteModel() {
		return _motCuaDienBienHoSoRemoteModel;
	}

	public void setMotCuaDienBienHoSoRemoteModel(
		BaseModel<?> motCuaDienBienHoSoRemoteModel) {
		_motCuaDienBienHoSoRemoteModel = motCuaDienBienHoSoRemoteModel;
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

		Class<?> remoteModelClass = _motCuaDienBienHoSoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_motCuaDienBienHoSoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			MotCuaDienBienHoSoLocalServiceUtil.addMotCuaDienBienHoSo(this);
		}
		else {
			MotCuaDienBienHoSoLocalServiceUtil.updateMotCuaDienBienHoSo(this);
		}
	}

	@Override
	public MotCuaDienBienHoSo toEscapedModel() {
		return (MotCuaDienBienHoSo)ProxyUtil.newProxyInstance(MotCuaDienBienHoSo.class.getClassLoader(),
			new Class[] { MotCuaDienBienHoSo.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		MotCuaDienBienHoSoClp clone = new MotCuaDienBienHoSoClp();

		clone.setId(getId());
		clone.setPhieuXuLyChinhId(getPhieuXuLyChinhId());
		clone.setPhieuXuLyPhuId(getPhieuXuLyPhuId());
		clone.setSoNgayQuaHan(getSoNgayQuaHan());
		clone.setTrangThaiTruocId(getTrangThaiTruocId());
		clone.setTrangThaiSauId(getTrangThaiSauId());
		clone.setNgayXuLy(getNgayXuLy());
		clone.setNguoiXuLy(getNguoiXuLy());
		clone.setHanhDongXuLy(getHanhDongXuLy());
		clone.setSynchDate(getSynchDate());

		return clone;
	}

	@Override
	public int compareTo(MotCuaDienBienHoSo motCuaDienBienHoSo) {
		int value = 0;

		if (getId() < motCuaDienBienHoSo.getId()) {
			value = -1;
		}
		else if (getId() > motCuaDienBienHoSo.getId()) {
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

		if (!(obj instanceof MotCuaDienBienHoSoClp)) {
			return false;
		}

		MotCuaDienBienHoSoClp motCuaDienBienHoSo = (MotCuaDienBienHoSoClp)obj;

		long primaryKey = motCuaDienBienHoSo.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", phieuXuLyChinhId=");
		sb.append(getPhieuXuLyChinhId());
		sb.append(", phieuXuLyPhuId=");
		sb.append(getPhieuXuLyPhuId());
		sb.append(", soNgayQuaHan=");
		sb.append(getSoNgayQuaHan());
		sb.append(", trangThaiTruocId=");
		sb.append(getTrangThaiTruocId());
		sb.append(", trangThaiSauId=");
		sb.append(getTrangThaiSauId());
		sb.append(", ngayXuLy=");
		sb.append(getNgayXuLy());
		sb.append(", nguoiXuLy=");
		sb.append(getNguoiXuLy());
		sb.append(", hanhDongXuLy=");
		sb.append(getHanhDongXuLy());
		sb.append(", SynchDate=");
		sb.append(getSynchDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo");
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
			"<column><column-name>phieuXuLyPhuId</column-name><column-value><![CDATA[");
		sb.append(getPhieuXuLyPhuId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soNgayQuaHan</column-name><column-value><![CDATA[");
		sb.append(getSoNgayQuaHan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThaiTruocId</column-name><column-value><![CDATA[");
		sb.append(getTrangThaiTruocId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThaiSauId</column-name><column-value><![CDATA[");
		sb.append(getTrangThaiSauId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayXuLy</column-name><column-value><![CDATA[");
		sb.append(getNgayXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiXuLy</column-name><column-value><![CDATA[");
		sb.append(getNguoiXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hanhDongXuLy</column-name><column-value><![CDATA[");
		sb.append(getHanhDongXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SynchDate</column-name><column-value><![CDATA[");
		sb.append(getSynchDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _phieuXuLyChinhId;
	private long _phieuXuLyPhuId;
	private int _soNgayQuaHan;
	private long _trangThaiTruocId;
	private long _trangThaiSauId;
	private Date _ngayXuLy;
	private long _nguoiXuLy;
	private String _hanhDongXuLy;
	private Date _SynchDate;
	private BaseModel<?> _motCuaDienBienHoSoRemoteModel;
}