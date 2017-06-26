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
import vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class TthcNoidungHoSoClp extends BaseModelImpl<TthcNoidungHoSo>
	implements TthcNoidungHoSo {
	public TthcNoidungHoSoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TthcNoidungHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return TthcNoidungHoSo.class.getName();
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
		attributes.put("MaTuSinh", getMaTuSinh());
		attributes.put("HoSoThuTucId", getHoSoThuTucId());
		attributes.put("TenTaiLieu", getTenTaiLieu());
		attributes.put("TaiLieuDinhKem", getTaiLieuDinhKem());
		attributes.put("NoiDungXml", getNoiDungXml());
		attributes.put("noiDungFile", getNoiDungFile());
		attributes.put("BieuMauHoSoId", getBieuMauHoSoId());
		attributes.put("NgayGuiNhan", getNgayGuiNhan());
		attributes.put("LoaiTaiLieu", getLoaiTaiLieu());
		attributes.put("NgayTao", getNgayTao());
		attributes.put("NguoiTao", getNguoiTao());
		attributes.put("daCapNhat", getDaCapNhat());
		attributes.put("lanGuiCuoi", getLanGuiCuoi());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String MaTuSinh = (String)attributes.get("MaTuSinh");

		if (MaTuSinh != null) {
			setMaTuSinh(MaTuSinh);
		}

		Long HoSoThuTucId = (Long)attributes.get("HoSoThuTucId");

		if (HoSoThuTucId != null) {
			setHoSoThuTucId(HoSoThuTucId);
		}

		String TenTaiLieu = (String)attributes.get("TenTaiLieu");

		if (TenTaiLieu != null) {
			setTenTaiLieu(TenTaiLieu);
		}

		Long TaiLieuDinhKem = (Long)attributes.get("TaiLieuDinhKem");

		if (TaiLieuDinhKem != null) {
			setTaiLieuDinhKem(TaiLieuDinhKem);
		}

		String NoiDungXml = (String)attributes.get("NoiDungXml");

		if (NoiDungXml != null) {
			setNoiDungXml(NoiDungXml);
		}

		String noiDungFile = (String)attributes.get("noiDungFile");

		if (noiDungFile != null) {
			setNoiDungFile(noiDungFile);
		}

		Long BieuMauHoSoId = (Long)attributes.get("BieuMauHoSoId");

		if (BieuMauHoSoId != null) {
			setBieuMauHoSoId(BieuMauHoSoId);
		}

		Date NgayGuiNhan = (Date)attributes.get("NgayGuiNhan");

		if (NgayGuiNhan != null) {
			setNgayGuiNhan(NgayGuiNhan);
		}

		Long LoaiTaiLieu = (Long)attributes.get("LoaiTaiLieu");

		if (LoaiTaiLieu != null) {
			setLoaiTaiLieu(LoaiTaiLieu);
		}

		Date NgayTao = (Date)attributes.get("NgayTao");

		if (NgayTao != null) {
			setNgayTao(NgayTao);
		}

		Long NguoiTao = (Long)attributes.get("NguoiTao");

		if (NguoiTao != null) {
			setNguoiTao(NguoiTao);
		}

		Long daCapNhat = (Long)attributes.get("daCapNhat");

		if (daCapNhat != null) {
			setDaCapNhat(daCapNhat);
		}

		Long lanGuiCuoi = (Long)attributes.get("lanGuiCuoi");

		if (lanGuiCuoi != null) {
			setLanGuiCuoi(lanGuiCuoi);
		}
	}

	@Override
	public long getId() {
		return _Id;
	}

	@Override
	public void setId(long Id) {
		_Id = Id;

		if (_tthcNoidungHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcNoidungHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tthcNoidungHoSoRemoteModel, Id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaTuSinh() {
		return _MaTuSinh;
	}

	@Override
	public void setMaTuSinh(String MaTuSinh) {
		_MaTuSinh = MaTuSinh;

		if (_tthcNoidungHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcNoidungHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTuSinh", String.class);

				method.invoke(_tthcNoidungHoSoRemoteModel, MaTuSinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getHoSoThuTucId() {
		return _HoSoThuTucId;
	}

	@Override
	public void setHoSoThuTucId(long HoSoThuTucId) {
		_HoSoThuTucId = HoSoThuTucId;

		if (_tthcNoidungHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcNoidungHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setHoSoThuTucId", long.class);

				method.invoke(_tthcNoidungHoSoRemoteModel, HoSoThuTucId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenTaiLieu() {
		return _TenTaiLieu;
	}

	@Override
	public void setTenTaiLieu(String TenTaiLieu) {
		_TenTaiLieu = TenTaiLieu;

		if (_tthcNoidungHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcNoidungHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setTenTaiLieu", String.class);

				method.invoke(_tthcNoidungHoSoRemoteModel, TenTaiLieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTaiLieuDinhKem() {
		return _TaiLieuDinhKem;
	}

	@Override
	public void setTaiLieuDinhKem(long TaiLieuDinhKem) {
		_TaiLieuDinhKem = TaiLieuDinhKem;

		if (_tthcNoidungHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcNoidungHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setTaiLieuDinhKem", long.class);

				method.invoke(_tthcNoidungHoSoRemoteModel, TaiLieuDinhKem);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNoiDungXml() {
		return _NoiDungXml;
	}

	@Override
	public void setNoiDungXml(String NoiDungXml) {
		_NoiDungXml = NoiDungXml;

		if (_tthcNoidungHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcNoidungHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiDungXml", String.class);

				method.invoke(_tthcNoidungHoSoRemoteModel, NoiDungXml);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNoiDungFile() {
		return _noiDungFile;
	}

	@Override
	public void setNoiDungFile(String noiDungFile) {
		_noiDungFile = noiDungFile;

		if (_tthcNoidungHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcNoidungHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiDungFile", String.class);

				method.invoke(_tthcNoidungHoSoRemoteModel, noiDungFile);
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

		if (_tthcNoidungHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcNoidungHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setBieuMauHoSoId", long.class);

				method.invoke(_tthcNoidungHoSoRemoteModel, BieuMauHoSoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayGuiNhan() {
		return _NgayGuiNhan;
	}

	@Override
	public void setNgayGuiNhan(Date NgayGuiNhan) {
		_NgayGuiNhan = NgayGuiNhan;

		if (_tthcNoidungHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcNoidungHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayGuiNhan", Date.class);

				method.invoke(_tthcNoidungHoSoRemoteModel, NgayGuiNhan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getLoaiTaiLieu() {
		return _LoaiTaiLieu;
	}

	@Override
	public void setLoaiTaiLieu(long LoaiTaiLieu) {
		_LoaiTaiLieu = LoaiTaiLieu;

		if (_tthcNoidungHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcNoidungHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiTaiLieu", long.class);

				method.invoke(_tthcNoidungHoSoRemoteModel, LoaiTaiLieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayTao() {
		return _NgayTao;
	}

	@Override
	public void setNgayTao(Date NgayTao) {
		_NgayTao = NgayTao;

		if (_tthcNoidungHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcNoidungHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTao", Date.class);

				method.invoke(_tthcNoidungHoSoRemoteModel, NgayTao);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNguoiTao() {
		return _NguoiTao;
	}

	@Override
	public void setNguoiTao(long NguoiTao) {
		_NguoiTao = NguoiTao;

		if (_tthcNoidungHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcNoidungHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiTao", long.class);

				method.invoke(_tthcNoidungHoSoRemoteModel, NguoiTao);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDaCapNhat() {
		return _daCapNhat;
	}

	@Override
	public void setDaCapNhat(long daCapNhat) {
		_daCapNhat = daCapNhat;

		if (_tthcNoidungHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcNoidungHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setDaCapNhat", long.class);

				method.invoke(_tthcNoidungHoSoRemoteModel, daCapNhat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getLanGuiCuoi() {
		return _lanGuiCuoi;
	}

	@Override
	public void setLanGuiCuoi(long lanGuiCuoi) {
		_lanGuiCuoi = lanGuiCuoi;

		if (_tthcNoidungHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcNoidungHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setLanGuiCuoi", long.class);

				method.invoke(_tthcNoidungHoSoRemoteModel, lanGuiCuoi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTthcNoidungHoSoRemoteModel() {
		return _tthcNoidungHoSoRemoteModel;
	}

	public void setTthcNoidungHoSoRemoteModel(
		BaseModel<?> tthcNoidungHoSoRemoteModel) {
		_tthcNoidungHoSoRemoteModel = tthcNoidungHoSoRemoteModel;
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

		Class<?> remoteModelClass = _tthcNoidungHoSoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tthcNoidungHoSoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TthcNoidungHoSoLocalServiceUtil.addTthcNoidungHoSo(this);
		}
		else {
			TthcNoidungHoSoLocalServiceUtil.updateTthcNoidungHoSo(this);
		}
	}

	@Override
	public TthcNoidungHoSo toEscapedModel() {
		return (TthcNoidungHoSo)ProxyUtil.newProxyInstance(TthcNoidungHoSo.class.getClassLoader(),
			new Class[] { TthcNoidungHoSo.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TthcNoidungHoSoClp clone = new TthcNoidungHoSoClp();

		clone.setId(getId());
		clone.setMaTuSinh(getMaTuSinh());
		clone.setHoSoThuTucId(getHoSoThuTucId());
		clone.setTenTaiLieu(getTenTaiLieu());
		clone.setTaiLieuDinhKem(getTaiLieuDinhKem());
		clone.setNoiDungXml(getNoiDungXml());
		clone.setNoiDungFile(getNoiDungFile());
		clone.setBieuMauHoSoId(getBieuMauHoSoId());
		clone.setNgayGuiNhan(getNgayGuiNhan());
		clone.setLoaiTaiLieu(getLoaiTaiLieu());
		clone.setNgayTao(getNgayTao());
		clone.setNguoiTao(getNguoiTao());
		clone.setDaCapNhat(getDaCapNhat());
		clone.setLanGuiCuoi(getLanGuiCuoi());

		return clone;
	}

	@Override
	public int compareTo(TthcNoidungHoSo tthcNoidungHoSo) {
		int value = 0;

		if (getId() < tthcNoidungHoSo.getId()) {
			value = -1;
		}
		else if (getId() > tthcNoidungHoSo.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

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

		if (!(obj instanceof TthcNoidungHoSoClp)) {
			return false;
		}

		TthcNoidungHoSoClp tthcNoidungHoSo = (TthcNoidungHoSoClp)obj;

		long primaryKey = tthcNoidungHoSo.getPrimaryKey();

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
		StringBundler sb = new StringBundler(29);

		sb.append("{Id=");
		sb.append(getId());
		sb.append(", MaTuSinh=");
		sb.append(getMaTuSinh());
		sb.append(", HoSoThuTucId=");
		sb.append(getHoSoThuTucId());
		sb.append(", TenTaiLieu=");
		sb.append(getTenTaiLieu());
		sb.append(", TaiLieuDinhKem=");
		sb.append(getTaiLieuDinhKem());
		sb.append(", NoiDungXml=");
		sb.append(getNoiDungXml());
		sb.append(", noiDungFile=");
		sb.append(getNoiDungFile());
		sb.append(", BieuMauHoSoId=");
		sb.append(getBieuMauHoSoId());
		sb.append(", NgayGuiNhan=");
		sb.append(getNgayGuiNhan());
		sb.append(", LoaiTaiLieu=");
		sb.append(getLoaiTaiLieu());
		sb.append(", NgayTao=");
		sb.append(getNgayTao());
		sb.append(", NguoiTao=");
		sb.append(getNguoiTao());
		sb.append(", daCapNhat=");
		sb.append(getDaCapNhat());
		sb.append(", lanGuiCuoi=");
		sb.append(getLanGuiCuoi());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MaTuSinh</column-name><column-value><![CDATA[");
		sb.append(getMaTuSinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>HoSoThuTucId</column-name><column-value><![CDATA[");
		sb.append(getHoSoThuTucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenTaiLieu</column-name><column-value><![CDATA[");
		sb.append(getTenTaiLieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TaiLieuDinhKem</column-name><column-value><![CDATA[");
		sb.append(getTaiLieuDinhKem());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NoiDungXml</column-name><column-value><![CDATA[");
		sb.append(getNoiDungXml());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>noiDungFile</column-name><column-value><![CDATA[");
		sb.append(getNoiDungFile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BieuMauHoSoId</column-name><column-value><![CDATA[");
		sb.append(getBieuMauHoSoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NgayGuiNhan</column-name><column-value><![CDATA[");
		sb.append(getNgayGuiNhan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LoaiTaiLieu</column-name><column-value><![CDATA[");
		sb.append(getLoaiTaiLieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NgayTao</column-name><column-value><![CDATA[");
		sb.append(getNgayTao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NguoiTao</column-name><column-value><![CDATA[");
		sb.append(getNguoiTao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>daCapNhat</column-name><column-value><![CDATA[");
		sb.append(getDaCapNhat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lanGuiCuoi</column-name><column-value><![CDATA[");
		sb.append(getLanGuiCuoi());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _Id;
	private String _MaTuSinh;
	private long _HoSoThuTucId;
	private String _TenTaiLieu;
	private long _TaiLieuDinhKem;
	private String _NoiDungXml;
	private String _noiDungFile;
	private long _BieuMauHoSoId;
	private Date _NgayGuiNhan;
	private long _LoaiTaiLieu;
	private Date _NgayTao;
	private long _NguoiTao;
	private long _daCapNhat;
	private long _lanGuiCuoi;
	private BaseModel<?> _tthcNoidungHoSoRemoteModel;
}