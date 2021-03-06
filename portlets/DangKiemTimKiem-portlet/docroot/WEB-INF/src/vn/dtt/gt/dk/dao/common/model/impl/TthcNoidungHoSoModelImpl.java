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

package vn.dtt.gt.dk.dao.common.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo;
import vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSoModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the TthcNoidungHoSo service. Represents a row in the &quot;tthc_noidunghoso&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSoModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TthcNoidungHoSoImpl}.
 * </p>
 *
 * @author win_64
 * @see TthcNoidungHoSoImpl
 * @see vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo
 * @see vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSoModel
 * @generated
 */
public class TthcNoidungHoSoModelImpl extends BaseModelImpl<TthcNoidungHoSo>
	implements TthcNoidungHoSoModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tthc noidung ho so model instance should use the {@link vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo} interface instead.
	 */
	public static final String TABLE_NAME = "tthc_noidunghoso";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "matusinh", Types.VARCHAR },
			{ "hosothutucid", Types.BIGINT },
			{ "tentailieu", Types.VARCHAR },
			{ "tailieudinhkem", Types.BIGINT },
			{ "noidungxml", Types.VARCHAR },
			{ "noidungfile", Types.VARCHAR },
			{ "bieumauhosoid", Types.BIGINT },
			{ "ngayguinhan", Types.TIMESTAMP },
			{ "loaitailieu", Types.BIGINT },
			{ "ngaytao", Types.TIMESTAMP },
			{ "nguoitao", Types.BIGINT },
			{ "dacapnhat", Types.BIGINT },
			{ "languicuoi", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table tthc_noidunghoso (id LONG not null primary key,matusinh VARCHAR(75) null,hosothutucid LONG,tentailieu VARCHAR(75) null,tailieudinhkem LONG,noidungxml VARCHAR(75) null,noidungfile VARCHAR(75) null,bieumauhosoid LONG,ngayguinhan DATE null,loaitailieu LONG,ngaytao DATE null,nguoitao LONG,dacapnhat LONG,languicuoi LONG)";
	public static final String TABLE_SQL_DROP = "drop table tthc_noidunghoso";
	public static final String ORDER_BY_JPQL = " ORDER BY tthcNoidungHoSo.Id DESC";
	public static final String ORDER_BY_SQL = " ORDER BY tthc_noidunghoso.id DESC";
	public static final String DATA_SOURCE = "tthcDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo"),
			true);
	public static long BIEUMAUHOSOID_COLUMN_BITMASK = 1L;
	public static long HOSOTHUTUCID_COLUMN_BITMASK = 2L;
	public static long MATUSINH_COLUMN_BITMASK = 4L;
	public static long ID_COLUMN_BITMASK = 8L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo"));

	public TthcNoidungHoSoModelImpl() {
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
	public Class<?> getModelClass() {
		return TthcNoidungHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return TthcNoidungHoSo.class.getName();
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
		_columnBitmask = -1L;

		_Id = Id;
	}

	@Override
	public String getMaTuSinh() {
		if (_MaTuSinh == null) {
			return StringPool.BLANK;
		}
		else {
			return _MaTuSinh;
		}
	}

	@Override
	public void setMaTuSinh(String MaTuSinh) {
		_columnBitmask |= MATUSINH_COLUMN_BITMASK;

		if (_originalMaTuSinh == null) {
			_originalMaTuSinh = _MaTuSinh;
		}

		_MaTuSinh = MaTuSinh;
	}

	public String getOriginalMaTuSinh() {
		return GetterUtil.getString(_originalMaTuSinh);
	}

	@Override
	public long getHoSoThuTucId() {
		return _HoSoThuTucId;
	}

	@Override
	public void setHoSoThuTucId(long HoSoThuTucId) {
		_columnBitmask |= HOSOTHUTUCID_COLUMN_BITMASK;

		if (!_setOriginalHoSoThuTucId) {
			_setOriginalHoSoThuTucId = true;

			_originalHoSoThuTucId = _HoSoThuTucId;
		}

		_HoSoThuTucId = HoSoThuTucId;
	}

	public long getOriginalHoSoThuTucId() {
		return _originalHoSoThuTucId;
	}

	@Override
	public String getTenTaiLieu() {
		if (_TenTaiLieu == null) {
			return StringPool.BLANK;
		}
		else {
			return _TenTaiLieu;
		}
	}

	@Override
	public void setTenTaiLieu(String TenTaiLieu) {
		_TenTaiLieu = TenTaiLieu;
	}

	@Override
	public long getTaiLieuDinhKem() {
		return _TaiLieuDinhKem;
	}

	@Override
	public void setTaiLieuDinhKem(long TaiLieuDinhKem) {
		_TaiLieuDinhKem = TaiLieuDinhKem;
	}

	@Override
	public String getNoiDungXml() {
		if (_NoiDungXml == null) {
			return StringPool.BLANK;
		}
		else {
			return _NoiDungXml;
		}
	}

	@Override
	public void setNoiDungXml(String NoiDungXml) {
		_NoiDungXml = NoiDungXml;
	}

	@Override
	public String getNoiDungFile() {
		if (_noiDungFile == null) {
			return StringPool.BLANK;
		}
		else {
			return _noiDungFile;
		}
	}

	@Override
	public void setNoiDungFile(String noiDungFile) {
		_noiDungFile = noiDungFile;
	}

	@Override
	public long getBieuMauHoSoId() {
		return _BieuMauHoSoId;
	}

	@Override
	public void setBieuMauHoSoId(long BieuMauHoSoId) {
		_columnBitmask |= BIEUMAUHOSOID_COLUMN_BITMASK;

		if (!_setOriginalBieuMauHoSoId) {
			_setOriginalBieuMauHoSoId = true;

			_originalBieuMauHoSoId = _BieuMauHoSoId;
		}

		_BieuMauHoSoId = BieuMauHoSoId;
	}

	public long getOriginalBieuMauHoSoId() {
		return _originalBieuMauHoSoId;
	}

	@Override
	public Date getNgayGuiNhan() {
		return _NgayGuiNhan;
	}

	@Override
	public void setNgayGuiNhan(Date NgayGuiNhan) {
		_NgayGuiNhan = NgayGuiNhan;
	}

	@Override
	public long getLoaiTaiLieu() {
		return _LoaiTaiLieu;
	}

	@Override
	public void setLoaiTaiLieu(long LoaiTaiLieu) {
		_LoaiTaiLieu = LoaiTaiLieu;
	}

	@Override
	public Date getNgayTao() {
		return _NgayTao;
	}

	@Override
	public void setNgayTao(Date NgayTao) {
		_NgayTao = NgayTao;
	}

	@Override
	public long getNguoiTao() {
		return _NguoiTao;
	}

	@Override
	public void setNguoiTao(long NguoiTao) {
		_NguoiTao = NguoiTao;
	}

	@Override
	public long getDaCapNhat() {
		return _daCapNhat;
	}

	@Override
	public void setDaCapNhat(long daCapNhat) {
		_daCapNhat = daCapNhat;
	}

	@Override
	public long getLanGuiCuoi() {
		return _lanGuiCuoi;
	}

	@Override
	public void setLanGuiCuoi(long lanGuiCuoi) {
		_lanGuiCuoi = lanGuiCuoi;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			TthcNoidungHoSo.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TthcNoidungHoSo toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TthcNoidungHoSo)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TthcNoidungHoSoImpl tthcNoidungHoSoImpl = new TthcNoidungHoSoImpl();

		tthcNoidungHoSoImpl.setId(getId());
		tthcNoidungHoSoImpl.setMaTuSinh(getMaTuSinh());
		tthcNoidungHoSoImpl.setHoSoThuTucId(getHoSoThuTucId());
		tthcNoidungHoSoImpl.setTenTaiLieu(getTenTaiLieu());
		tthcNoidungHoSoImpl.setTaiLieuDinhKem(getTaiLieuDinhKem());
		tthcNoidungHoSoImpl.setNoiDungXml(getNoiDungXml());
		tthcNoidungHoSoImpl.setNoiDungFile(getNoiDungFile());
		tthcNoidungHoSoImpl.setBieuMauHoSoId(getBieuMauHoSoId());
		tthcNoidungHoSoImpl.setNgayGuiNhan(getNgayGuiNhan());
		tthcNoidungHoSoImpl.setLoaiTaiLieu(getLoaiTaiLieu());
		tthcNoidungHoSoImpl.setNgayTao(getNgayTao());
		tthcNoidungHoSoImpl.setNguoiTao(getNguoiTao());
		tthcNoidungHoSoImpl.setDaCapNhat(getDaCapNhat());
		tthcNoidungHoSoImpl.setLanGuiCuoi(getLanGuiCuoi());

		tthcNoidungHoSoImpl.resetOriginalValues();

		return tthcNoidungHoSoImpl;
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

		if (!(obj instanceof TthcNoidungHoSo)) {
			return false;
		}

		TthcNoidungHoSo tthcNoidungHoSo = (TthcNoidungHoSo)obj;

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
	public void resetOriginalValues() {
		TthcNoidungHoSoModelImpl tthcNoidungHoSoModelImpl = this;

		tthcNoidungHoSoModelImpl._originalMaTuSinh = tthcNoidungHoSoModelImpl._MaTuSinh;

		tthcNoidungHoSoModelImpl._originalHoSoThuTucId = tthcNoidungHoSoModelImpl._HoSoThuTucId;

		tthcNoidungHoSoModelImpl._setOriginalHoSoThuTucId = false;

		tthcNoidungHoSoModelImpl._originalBieuMauHoSoId = tthcNoidungHoSoModelImpl._BieuMauHoSoId;

		tthcNoidungHoSoModelImpl._setOriginalBieuMauHoSoId = false;

		tthcNoidungHoSoModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<TthcNoidungHoSo> toCacheModel() {
		TthcNoidungHoSoCacheModel tthcNoidungHoSoCacheModel = new TthcNoidungHoSoCacheModel();

		tthcNoidungHoSoCacheModel.Id = getId();

		tthcNoidungHoSoCacheModel.MaTuSinh = getMaTuSinh();

		String MaTuSinh = tthcNoidungHoSoCacheModel.MaTuSinh;

		if ((MaTuSinh != null) && (MaTuSinh.length() == 0)) {
			tthcNoidungHoSoCacheModel.MaTuSinh = null;
		}

		tthcNoidungHoSoCacheModel.HoSoThuTucId = getHoSoThuTucId();

		tthcNoidungHoSoCacheModel.TenTaiLieu = getTenTaiLieu();

		String TenTaiLieu = tthcNoidungHoSoCacheModel.TenTaiLieu;

		if ((TenTaiLieu != null) && (TenTaiLieu.length() == 0)) {
			tthcNoidungHoSoCacheModel.TenTaiLieu = null;
		}

		tthcNoidungHoSoCacheModel.TaiLieuDinhKem = getTaiLieuDinhKem();

		tthcNoidungHoSoCacheModel.NoiDungXml = getNoiDungXml();

		String NoiDungXml = tthcNoidungHoSoCacheModel.NoiDungXml;

		if ((NoiDungXml != null) && (NoiDungXml.length() == 0)) {
			tthcNoidungHoSoCacheModel.NoiDungXml = null;
		}

		tthcNoidungHoSoCacheModel.noiDungFile = getNoiDungFile();

		String noiDungFile = tthcNoidungHoSoCacheModel.noiDungFile;

		if ((noiDungFile != null) && (noiDungFile.length() == 0)) {
			tthcNoidungHoSoCacheModel.noiDungFile = null;
		}

		tthcNoidungHoSoCacheModel.BieuMauHoSoId = getBieuMauHoSoId();

		Date NgayGuiNhan = getNgayGuiNhan();

		if (NgayGuiNhan != null) {
			tthcNoidungHoSoCacheModel.NgayGuiNhan = NgayGuiNhan.getTime();
		}
		else {
			tthcNoidungHoSoCacheModel.NgayGuiNhan = Long.MIN_VALUE;
		}

		tthcNoidungHoSoCacheModel.LoaiTaiLieu = getLoaiTaiLieu();

		Date NgayTao = getNgayTao();

		if (NgayTao != null) {
			tthcNoidungHoSoCacheModel.NgayTao = NgayTao.getTime();
		}
		else {
			tthcNoidungHoSoCacheModel.NgayTao = Long.MIN_VALUE;
		}

		tthcNoidungHoSoCacheModel.NguoiTao = getNguoiTao();

		tthcNoidungHoSoCacheModel.daCapNhat = getDaCapNhat();

		tthcNoidungHoSoCacheModel.lanGuiCuoi = getLanGuiCuoi();

		return tthcNoidungHoSoCacheModel;
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

	private static ClassLoader _classLoader = TthcNoidungHoSo.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			TthcNoidungHoSo.class
		};
	private long _Id;
	private String _MaTuSinh;
	private String _originalMaTuSinh;
	private long _HoSoThuTucId;
	private long _originalHoSoThuTucId;
	private boolean _setOriginalHoSoThuTucId;
	private String _TenTaiLieu;
	private long _TaiLieuDinhKem;
	private String _NoiDungXml;
	private String _noiDungFile;
	private long _BieuMauHoSoId;
	private long _originalBieuMauHoSoId;
	private boolean _setOriginalBieuMauHoSoId;
	private Date _NgayGuiNhan;
	private long _LoaiTaiLieu;
	private Date _NgayTao;
	private long _NguoiTao;
	private long _daCapNhat;
	private long _lanGuiCuoi;
	private long _columnBitmask;
	private TthcNoidungHoSo _escapedModel;
}