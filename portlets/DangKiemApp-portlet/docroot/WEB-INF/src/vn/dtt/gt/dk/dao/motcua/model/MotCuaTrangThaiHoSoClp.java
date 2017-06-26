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
import vn.dtt.gt.dk.dao.motcua.service.MotCuaTrangThaiHoSoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class MotCuaTrangThaiHoSoClp extends BaseModelImpl<MotCuaTrangThaiHoSo>
	implements MotCuaTrangThaiHoSo {
	public MotCuaTrangThaiHoSoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return MotCuaTrangThaiHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return MotCuaTrangThaiHoSo.class.getName();
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
		attributes.put("quyTrinhThuTucId", getQuyTrinhThuTucId());
		attributes.put("tenTrangThai", getTenTrangThai());
		attributes.put("kieuTrangThai", getKieuTrangThai());
		attributes.put("moTaTrangThai", getMoTaTrangThai());
		attributes.put("vaiTroXuLy1", getVaiTroXuLy1());
		attributes.put("vaiTroXuLy2", getVaiTroXuLy2());
		attributes.put("vaiTroXuLy3", getVaiTroXuLy3());
		attributes.put("formXuLy", getFormXuLy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long quyTrinhThuTucId = (Long)attributes.get("quyTrinhThuTucId");

		if (quyTrinhThuTucId != null) {
			setQuyTrinhThuTucId(quyTrinhThuTucId);
		}

		String tenTrangThai = (String)attributes.get("tenTrangThai");

		if (tenTrangThai != null) {
			setTenTrangThai(tenTrangThai);
		}

		Long kieuTrangThai = (Long)attributes.get("kieuTrangThai");

		if (kieuTrangThai != null) {
			setKieuTrangThai(kieuTrangThai);
		}

		String moTaTrangThai = (String)attributes.get("moTaTrangThai");

		if (moTaTrangThai != null) {
			setMoTaTrangThai(moTaTrangThai);
		}

		Long vaiTroXuLy1 = (Long)attributes.get("vaiTroXuLy1");

		if (vaiTroXuLy1 != null) {
			setVaiTroXuLy1(vaiTroXuLy1);
		}

		Long vaiTroXuLy2 = (Long)attributes.get("vaiTroXuLy2");

		if (vaiTroXuLy2 != null) {
			setVaiTroXuLy2(vaiTroXuLy2);
		}

		Long vaiTroXuLy3 = (Long)attributes.get("vaiTroXuLy3");

		if (vaiTroXuLy3 != null) {
			setVaiTroXuLy3(vaiTroXuLy3);
		}

		String formXuLy = (String)attributes.get("formXuLy");

		if (formXuLy != null) {
			setFormXuLy(formXuLy);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_motCuaTrangThaiHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaTrangThaiHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_motCuaTrangThaiHoSoRemoteModel, id);
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

		if (_motCuaTrangThaiHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaTrangThaiHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setQuyTrinhThuTucId",
						long.class);

				method.invoke(_motCuaTrangThaiHoSoRemoteModel, quyTrinhThuTucId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenTrangThai() {
		return _tenTrangThai;
	}

	@Override
	public void setTenTrangThai(String tenTrangThai) {
		_tenTrangThai = tenTrangThai;

		if (_motCuaTrangThaiHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaTrangThaiHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setTenTrangThai", String.class);

				method.invoke(_motCuaTrangThaiHoSoRemoteModel, tenTrangThai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getKieuTrangThai() {
		return _kieuTrangThai;
	}

	@Override
	public void setKieuTrangThai(long kieuTrangThai) {
		_kieuTrangThai = kieuTrangThai;

		if (_motCuaTrangThaiHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaTrangThaiHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setKieuTrangThai", long.class);

				method.invoke(_motCuaTrangThaiHoSoRemoteModel, kieuTrangThai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMoTaTrangThai() {
		return _moTaTrangThai;
	}

	@Override
	public void setMoTaTrangThai(String moTaTrangThai) {
		_moTaTrangThai = moTaTrangThai;

		if (_motCuaTrangThaiHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaTrangThaiHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setMoTaTrangThai", String.class);

				method.invoke(_motCuaTrangThaiHoSoRemoteModel, moTaTrangThai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getVaiTroXuLy1() {
		return _vaiTroXuLy1;
	}

	@Override
	public void setVaiTroXuLy1(long vaiTroXuLy1) {
		_vaiTroXuLy1 = vaiTroXuLy1;

		if (_motCuaTrangThaiHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaTrangThaiHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setVaiTroXuLy1", long.class);

				method.invoke(_motCuaTrangThaiHoSoRemoteModel, vaiTroXuLy1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getVaiTroXuLy2() {
		return _vaiTroXuLy2;
	}

	@Override
	public void setVaiTroXuLy2(long vaiTroXuLy2) {
		_vaiTroXuLy2 = vaiTroXuLy2;

		if (_motCuaTrangThaiHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaTrangThaiHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setVaiTroXuLy2", long.class);

				method.invoke(_motCuaTrangThaiHoSoRemoteModel, vaiTroXuLy2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getVaiTroXuLy3() {
		return _vaiTroXuLy3;
	}

	@Override
	public void setVaiTroXuLy3(long vaiTroXuLy3) {
		_vaiTroXuLy3 = vaiTroXuLy3;

		if (_motCuaTrangThaiHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaTrangThaiHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setVaiTroXuLy3", long.class);

				method.invoke(_motCuaTrangThaiHoSoRemoteModel, vaiTroXuLy3);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFormXuLy() {
		return _formXuLy;
	}

	@Override
	public void setFormXuLy(String formXuLy) {
		_formXuLy = formXuLy;

		if (_motCuaTrangThaiHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaTrangThaiHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setFormXuLy", String.class);

				method.invoke(_motCuaTrangThaiHoSoRemoteModel, formXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getMotCuaTrangThaiHoSoRemoteModel() {
		return _motCuaTrangThaiHoSoRemoteModel;
	}

	public void setMotCuaTrangThaiHoSoRemoteModel(
		BaseModel<?> motCuaTrangThaiHoSoRemoteModel) {
		_motCuaTrangThaiHoSoRemoteModel = motCuaTrangThaiHoSoRemoteModel;
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

		Class<?> remoteModelClass = _motCuaTrangThaiHoSoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_motCuaTrangThaiHoSoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			MotCuaTrangThaiHoSoLocalServiceUtil.addMotCuaTrangThaiHoSo(this);
		}
		else {
			MotCuaTrangThaiHoSoLocalServiceUtil.updateMotCuaTrangThaiHoSo(this);
		}
	}

	@Override
	public MotCuaTrangThaiHoSo toEscapedModel() {
		return (MotCuaTrangThaiHoSo)ProxyUtil.newProxyInstance(MotCuaTrangThaiHoSo.class.getClassLoader(),
			new Class[] { MotCuaTrangThaiHoSo.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		MotCuaTrangThaiHoSoClp clone = new MotCuaTrangThaiHoSoClp();

		clone.setId(getId());
		clone.setQuyTrinhThuTucId(getQuyTrinhThuTucId());
		clone.setTenTrangThai(getTenTrangThai());
		clone.setKieuTrangThai(getKieuTrangThai());
		clone.setMoTaTrangThai(getMoTaTrangThai());
		clone.setVaiTroXuLy1(getVaiTroXuLy1());
		clone.setVaiTroXuLy2(getVaiTroXuLy2());
		clone.setVaiTroXuLy3(getVaiTroXuLy3());
		clone.setFormXuLy(getFormXuLy());

		return clone;
	}

	@Override
	public int compareTo(MotCuaTrangThaiHoSo motCuaTrangThaiHoSo) {
		int value = 0;

		if (getId() < motCuaTrangThaiHoSo.getId()) {
			value = -1;
		}
		else if (getId() > motCuaTrangThaiHoSo.getId()) {
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

		if (!(obj instanceof MotCuaTrangThaiHoSoClp)) {
			return false;
		}

		MotCuaTrangThaiHoSoClp motCuaTrangThaiHoSo = (MotCuaTrangThaiHoSoClp)obj;

		long primaryKey = motCuaTrangThaiHoSo.getPrimaryKey();

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
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", quyTrinhThuTucId=");
		sb.append(getQuyTrinhThuTucId());
		sb.append(", tenTrangThai=");
		sb.append(getTenTrangThai());
		sb.append(", kieuTrangThai=");
		sb.append(getKieuTrangThai());
		sb.append(", moTaTrangThai=");
		sb.append(getMoTaTrangThai());
		sb.append(", vaiTroXuLy1=");
		sb.append(getVaiTroXuLy1());
		sb.append(", vaiTroXuLy2=");
		sb.append(getVaiTroXuLy2());
		sb.append(", vaiTroXuLy3=");
		sb.append(getVaiTroXuLy3());
		sb.append(", formXuLy=");
		sb.append(getFormXuLy());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>quyTrinhThuTucId</column-name><column-value><![CDATA[");
		sb.append(getQuyTrinhThuTucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenTrangThai</column-name><column-value><![CDATA[");
		sb.append(getTenTrangThai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kieuTrangThai</column-name><column-value><![CDATA[");
		sb.append(getKieuTrangThai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>moTaTrangThai</column-name><column-value><![CDATA[");
		sb.append(getMoTaTrangThai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vaiTroXuLy1</column-name><column-value><![CDATA[");
		sb.append(getVaiTroXuLy1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vaiTroXuLy2</column-name><column-value><![CDATA[");
		sb.append(getVaiTroXuLy2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vaiTroXuLy3</column-name><column-value><![CDATA[");
		sb.append(getVaiTroXuLy3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>formXuLy</column-name><column-value><![CDATA[");
		sb.append(getFormXuLy());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _quyTrinhThuTucId;
	private String _tenTrangThai;
	private long _kieuTrangThai;
	private String _moTaTrangThai;
	private long _vaiTroXuLy1;
	private long _vaiTroXuLy2;
	private long _vaiTroXuLy3;
	private String _formXuLy;
	private BaseModel<?> _motCuaTrangThaiHoSoRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.gt.dk.dao.motcua.service.ClpSerializer.class;
}