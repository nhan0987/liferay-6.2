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
import vn.dtt.gt.dk.dao.common.service.TthcKeHoachChuyenDichLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class TthcKeHoachChuyenDichClp extends BaseModelImpl<TthcKeHoachChuyenDich>
	implements TthcKeHoachChuyenDich {
	public TthcKeHoachChuyenDichClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TthcKeHoachChuyenDich.class;
	}

	@Override
	public String getModelClassName() {
		return TthcKeHoachChuyenDich.class.getName();
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
		attributes.put("messageId", getMessageId());
		attributes.put("messageStatus", getMessageStatus());
		attributes.put("trangThaiNguonId", getTrangThaiNguonId());
		attributes.put("dieuKienChuyenDich", getDieuKienChuyenDich());
		attributes.put("trangThaiDichId", getTrangThaiDichId());
		attributes.put("phanNhomHoSoId", getPhanNhomHoSoId());
		attributes.put("nhomPhieuXuLy", getNhomPhieuXuLy());
		attributes.put("hoanTat", getHoanTat());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("thoiDiemCapNhat", getThoiDiemCapNhat());

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

		String messageId = (String)attributes.get("messageId");

		if (messageId != null) {
			setMessageId(messageId);
		}

		String messageStatus = (String)attributes.get("messageStatus");

		if (messageStatus != null) {
			setMessageStatus(messageStatus);
		}

		Long trangThaiNguonId = (Long)attributes.get("trangThaiNguonId");

		if (trangThaiNguonId != null) {
			setTrangThaiNguonId(trangThaiNguonId);
		}

		String dieuKienChuyenDich = (String)attributes.get("dieuKienChuyenDich");

		if (dieuKienChuyenDich != null) {
			setDieuKienChuyenDich(dieuKienChuyenDich);
		}

		Long trangThaiDichId = (Long)attributes.get("trangThaiDichId");

		if (trangThaiDichId != null) {
			setTrangThaiDichId(trangThaiDichId);
		}

		Long phanNhomHoSoId = (Long)attributes.get("phanNhomHoSoId");

		if (phanNhomHoSoId != null) {
			setPhanNhomHoSoId(phanNhomHoSoId);
		}

		Long nhomPhieuXuLy = (Long)attributes.get("nhomPhieuXuLy");

		if (nhomPhieuXuLy != null) {
			setNhomPhieuXuLy(nhomPhieuXuLy);
		}

		String hoanTat = (String)attributes.get("hoanTat");

		if (hoanTat != null) {
			setHoanTat(hoanTat);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		Date thoiDiemCapNhat = (Date)attributes.get("thoiDiemCapNhat");

		if (thoiDiemCapNhat != null) {
			setThoiDiemCapNhat(thoiDiemCapNhat);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tthcKeHoachChuyenDichRemoteModel != null) {
			try {
				Class<?> clazz = _tthcKeHoachChuyenDichRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tthcKeHoachChuyenDichRemoteModel, id);
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

		if (_tthcKeHoachChuyenDichRemoteModel != null) {
			try {
				Class<?> clazz = _tthcKeHoachChuyenDichRemoteModel.getClass();

				Method method = clazz.getMethod("setPhieuXuLyChinhId",
						long.class);

				method.invoke(_tthcKeHoachChuyenDichRemoteModel,
					phieuXuLyChinhId);
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

		if (_tthcKeHoachChuyenDichRemoteModel != null) {
			try {
				Class<?> clazz = _tthcKeHoachChuyenDichRemoteModel.getClass();

				Method method = clazz.getMethod("setPhieuXuLyPhuId", long.class);

				method.invoke(_tthcKeHoachChuyenDichRemoteModel, phieuXuLyPhuId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMessageId() {
		return _messageId;
	}

	@Override
	public void setMessageId(String messageId) {
		_messageId = messageId;

		if (_tthcKeHoachChuyenDichRemoteModel != null) {
			try {
				Class<?> clazz = _tthcKeHoachChuyenDichRemoteModel.getClass();

				Method method = clazz.getMethod("setMessageId", String.class);

				method.invoke(_tthcKeHoachChuyenDichRemoteModel, messageId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMessageStatus() {
		return _messageStatus;
	}

	@Override
	public void setMessageStatus(String messageStatus) {
		_messageStatus = messageStatus;

		if (_tthcKeHoachChuyenDichRemoteModel != null) {
			try {
				Class<?> clazz = _tthcKeHoachChuyenDichRemoteModel.getClass();

				Method method = clazz.getMethod("setMessageStatus", String.class);

				method.invoke(_tthcKeHoachChuyenDichRemoteModel, messageStatus);
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

		if (_tthcKeHoachChuyenDichRemoteModel != null) {
			try {
				Class<?> clazz = _tthcKeHoachChuyenDichRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThaiNguonId",
						long.class);

				method.invoke(_tthcKeHoachChuyenDichRemoteModel,
					trangThaiNguonId);
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

		if (_tthcKeHoachChuyenDichRemoteModel != null) {
			try {
				Class<?> clazz = _tthcKeHoachChuyenDichRemoteModel.getClass();

				Method method = clazz.getMethod("setDieuKienChuyenDich",
						String.class);

				method.invoke(_tthcKeHoachChuyenDichRemoteModel,
					dieuKienChuyenDich);
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

		if (_tthcKeHoachChuyenDichRemoteModel != null) {
			try {
				Class<?> clazz = _tthcKeHoachChuyenDichRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThaiDichId", long.class);

				method.invoke(_tthcKeHoachChuyenDichRemoteModel, trangThaiDichId);
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

		if (_tthcKeHoachChuyenDichRemoteModel != null) {
			try {
				Class<?> clazz = _tthcKeHoachChuyenDichRemoteModel.getClass();

				Method method = clazz.getMethod("setPhanNhomHoSoId", long.class);

				method.invoke(_tthcKeHoachChuyenDichRemoteModel, phanNhomHoSoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNhomPhieuXuLy() {
		return _nhomPhieuXuLy;
	}

	@Override
	public void setNhomPhieuXuLy(long nhomPhieuXuLy) {
		_nhomPhieuXuLy = nhomPhieuXuLy;

		if (_tthcKeHoachChuyenDichRemoteModel != null) {
			try {
				Class<?> clazz = _tthcKeHoachChuyenDichRemoteModel.getClass();

				Method method = clazz.getMethod("setNhomPhieuXuLy", long.class);

				method.invoke(_tthcKeHoachChuyenDichRemoteModel, nhomPhieuXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getHoanTat() {
		return _hoanTat;
	}

	@Override
	public void setHoanTat(String hoanTat) {
		_hoanTat = hoanTat;

		if (_tthcKeHoachChuyenDichRemoteModel != null) {
			try {
				Class<?> clazz = _tthcKeHoachChuyenDichRemoteModel.getClass();

				Method method = clazz.getMethod("setHoanTat", String.class);

				method.invoke(_tthcKeHoachChuyenDichRemoteModel, hoanTat);
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

		if (_tthcKeHoachChuyenDichRemoteModel != null) {
			try {
				Class<?> clazz = _tthcKeHoachChuyenDichRemoteModel.getClass();

				Method method = clazz.getMethod("setGhiChu", String.class);

				method.invoke(_tthcKeHoachChuyenDichRemoteModel, ghiChu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getThoiDiemCapNhat() {
		return _thoiDiemCapNhat;
	}

	@Override
	public void setThoiDiemCapNhat(Date thoiDiemCapNhat) {
		_thoiDiemCapNhat = thoiDiemCapNhat;

		if (_tthcKeHoachChuyenDichRemoteModel != null) {
			try {
				Class<?> clazz = _tthcKeHoachChuyenDichRemoteModel.getClass();

				Method method = clazz.getMethod("setThoiDiemCapNhat", Date.class);

				method.invoke(_tthcKeHoachChuyenDichRemoteModel, thoiDiemCapNhat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTthcKeHoachChuyenDichRemoteModel() {
		return _tthcKeHoachChuyenDichRemoteModel;
	}

	public void setTthcKeHoachChuyenDichRemoteModel(
		BaseModel<?> tthcKeHoachChuyenDichRemoteModel) {
		_tthcKeHoachChuyenDichRemoteModel = tthcKeHoachChuyenDichRemoteModel;
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

		Class<?> remoteModelClass = _tthcKeHoachChuyenDichRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tthcKeHoachChuyenDichRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TthcKeHoachChuyenDichLocalServiceUtil.addTthcKeHoachChuyenDich(this);
		}
		else {
			TthcKeHoachChuyenDichLocalServiceUtil.updateTthcKeHoachChuyenDich(this);
		}
	}

	@Override
	public TthcKeHoachChuyenDich toEscapedModel() {
		return (TthcKeHoachChuyenDich)ProxyUtil.newProxyInstance(TthcKeHoachChuyenDich.class.getClassLoader(),
			new Class[] { TthcKeHoachChuyenDich.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TthcKeHoachChuyenDichClp clone = new TthcKeHoachChuyenDichClp();

		clone.setId(getId());
		clone.setPhieuXuLyChinhId(getPhieuXuLyChinhId());
		clone.setPhieuXuLyPhuId(getPhieuXuLyPhuId());
		clone.setMessageId(getMessageId());
		clone.setMessageStatus(getMessageStatus());
		clone.setTrangThaiNguonId(getTrangThaiNguonId());
		clone.setDieuKienChuyenDich(getDieuKienChuyenDich());
		clone.setTrangThaiDichId(getTrangThaiDichId());
		clone.setPhanNhomHoSoId(getPhanNhomHoSoId());
		clone.setNhomPhieuXuLy(getNhomPhieuXuLy());
		clone.setHoanTat(getHoanTat());
		clone.setGhiChu(getGhiChu());
		clone.setThoiDiemCapNhat(getThoiDiemCapNhat());

		return clone;
	}

	@Override
	public int compareTo(TthcKeHoachChuyenDich tthcKeHoachChuyenDich) {
		int value = 0;

		if (getId() < tthcKeHoachChuyenDich.getId()) {
			value = -1;
		}
		else if (getId() > tthcKeHoachChuyenDich.getId()) {
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

		if (!(obj instanceof TthcKeHoachChuyenDichClp)) {
			return false;
		}

		TthcKeHoachChuyenDichClp tthcKeHoachChuyenDich = (TthcKeHoachChuyenDichClp)obj;

		long primaryKey = tthcKeHoachChuyenDich.getPrimaryKey();

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
		StringBundler sb = new StringBundler(27);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", phieuXuLyChinhId=");
		sb.append(getPhieuXuLyChinhId());
		sb.append(", phieuXuLyPhuId=");
		sb.append(getPhieuXuLyPhuId());
		sb.append(", messageId=");
		sb.append(getMessageId());
		sb.append(", messageStatus=");
		sb.append(getMessageStatus());
		sb.append(", trangThaiNguonId=");
		sb.append(getTrangThaiNguonId());
		sb.append(", dieuKienChuyenDich=");
		sb.append(getDieuKienChuyenDich());
		sb.append(", trangThaiDichId=");
		sb.append(getTrangThaiDichId());
		sb.append(", phanNhomHoSoId=");
		sb.append(getPhanNhomHoSoId());
		sb.append(", nhomPhieuXuLy=");
		sb.append(getNhomPhieuXuLy());
		sb.append(", hoanTat=");
		sb.append(getHoanTat());
		sb.append(", ghiChu=");
		sb.append(getGhiChu());
		sb.append(", thoiDiemCapNhat=");
		sb.append(getThoiDiemCapNhat());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich");
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
			"<column><column-name>messageId</column-name><column-value><![CDATA[");
		sb.append(getMessageId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>messageStatus</column-name><column-value><![CDATA[");
		sb.append(getMessageStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThaiNguonId</column-name><column-value><![CDATA[");
		sb.append(getTrangThaiNguonId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dieuKienChuyenDich</column-name><column-value><![CDATA[");
		sb.append(getDieuKienChuyenDich());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThaiDichId</column-name><column-value><![CDATA[");
		sb.append(getTrangThaiDichId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phanNhomHoSoId</column-name><column-value><![CDATA[");
		sb.append(getPhanNhomHoSoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nhomPhieuXuLy</column-name><column-value><![CDATA[");
		sb.append(getNhomPhieuXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoanTat</column-name><column-value><![CDATA[");
		sb.append(getHoanTat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ghiChu</column-name><column-value><![CDATA[");
		sb.append(getGhiChu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thoiDiemCapNhat</column-name><column-value><![CDATA[");
		sb.append(getThoiDiemCapNhat());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _phieuXuLyChinhId;
	private long _phieuXuLyPhuId;
	private String _messageId;
	private String _messageStatus;
	private long _trangThaiNguonId;
	private String _dieuKienChuyenDich;
	private long _trangThaiDichId;
	private long _phanNhomHoSoId;
	private long _nhomPhieuXuLy;
	private String _hoanTat;
	private String _ghiChu;
	private Date _thoiDiemCapNhat;
	private BaseModel<?> _tthcKeHoachChuyenDichRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.gt.dk.dao.common.service.ClpSerializer.class;
}