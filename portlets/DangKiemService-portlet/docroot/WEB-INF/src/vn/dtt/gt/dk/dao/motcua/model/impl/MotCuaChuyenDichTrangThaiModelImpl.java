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

package vn.dtt.gt.dk.dao.motcua.model.impl;

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

import vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThaiModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the MotCuaChuyenDichTrangThai service. Represents a row in the &quot;motcua_chuyendichtrangthai&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThaiModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MotCuaChuyenDichTrangThaiImpl}.
 * </p>
 *
 * @author huymq
 * @see MotCuaChuyenDichTrangThaiImpl
 * @see vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai
 * @see vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThaiModel
 * @generated
 */
public class MotCuaChuyenDichTrangThaiModelImpl extends BaseModelImpl<MotCuaChuyenDichTrangThai>
	implements MotCuaChuyenDichTrangThaiModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a mot cua chuyen dich trang thai model instance should use the {@link vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai} interface instead.
	 */
	public static final String TABLE_NAME = "motcua_chuyendichtrangthai";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "trangthainguonid", Types.BIGINT },
			{ "trangthaidichid", Types.BIGINT },
			{ "dieukienchuyendich", Types.VARCHAR },
			{ "hanhdongxuly", Types.VARCHAR },
			{ "songayxuly", Types.INTEGER },
			{ "phannhomhosoid", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table motcua_chuyendichtrangthai (id LONG not null primary key,trangthainguonid LONG,trangthaidichid LONG,dieukienchuyendich VARCHAR(75) null,hanhdongxuly VARCHAR(75) null,songayxuly INTEGER,phannhomhosoid LONG)";
	public static final String TABLE_SQL_DROP = "drop table motcua_chuyendichtrangthai";
	public static final String ORDER_BY_JPQL = " ORDER BY motCuaChuyenDichTrangThai.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY motcua_chuyendichtrangthai.id ASC";
	public static final String DATA_SOURCE = "tthcDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai"),
			true);
	public static long DIEUKIENCHUYENDICH_COLUMN_BITMASK = 1L;
	public static long TRANGTHAIDICHID_COLUMN_BITMASK = 2L;
	public static long TRANGTHAINGUONID_COLUMN_BITMASK = 4L;
	public static long ID_COLUMN_BITMASK = 8L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai"));

	public MotCuaChuyenDichTrangThaiModelImpl() {
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
	public Class<?> getModelClass() {
		return MotCuaChuyenDichTrangThai.class;
	}

	@Override
	public String getModelClassName() {
		return MotCuaChuyenDichTrangThai.class.getName();
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
		_columnBitmask = -1L;

		_id = id;
	}

	@Override
	public long getTrangThaiNguonId() {
		return _trangThaiNguonId;
	}

	@Override
	public void setTrangThaiNguonId(long trangThaiNguonId) {
		_columnBitmask |= TRANGTHAINGUONID_COLUMN_BITMASK;

		if (!_setOriginalTrangThaiNguonId) {
			_setOriginalTrangThaiNguonId = true;

			_originalTrangThaiNguonId = _trangThaiNguonId;
		}

		_trangThaiNguonId = trangThaiNguonId;
	}

	public long getOriginalTrangThaiNguonId() {
		return _originalTrangThaiNguonId;
	}

	@Override
	public long getTrangThaiDichId() {
		return _trangThaiDichId;
	}

	@Override
	public void setTrangThaiDichId(long trangThaiDichId) {
		_columnBitmask |= TRANGTHAIDICHID_COLUMN_BITMASK;

		if (!_setOriginalTrangThaiDichId) {
			_setOriginalTrangThaiDichId = true;

			_originalTrangThaiDichId = _trangThaiDichId;
		}

		_trangThaiDichId = trangThaiDichId;
	}

	public long getOriginalTrangThaiDichId() {
		return _originalTrangThaiDichId;
	}

	@Override
	public String getDieuKienChuyenDich() {
		if (_dieuKienChuyenDich == null) {
			return StringPool.BLANK;
		}
		else {
			return _dieuKienChuyenDich;
		}
	}

	@Override
	public void setDieuKienChuyenDich(String dieuKienChuyenDich) {
		_columnBitmask |= DIEUKIENCHUYENDICH_COLUMN_BITMASK;

		if (_originalDieuKienChuyenDich == null) {
			_originalDieuKienChuyenDich = _dieuKienChuyenDich;
		}

		_dieuKienChuyenDich = dieuKienChuyenDich;
	}

	public String getOriginalDieuKienChuyenDich() {
		return GetterUtil.getString(_originalDieuKienChuyenDich);
	}

	@Override
	public String getHanhDongXuLy() {
		if (_hanhDongXuLy == null) {
			return StringPool.BLANK;
		}
		else {
			return _hanhDongXuLy;
		}
	}

	@Override
	public void setHanhDongXuLy(String hanhDongXuLy) {
		_hanhDongXuLy = hanhDongXuLy;
	}

	@Override
	public int getSoNgayXuLy() {
		return _soNgayXuLy;
	}

	@Override
	public void setSoNgayXuLy(int soNgayXuLy) {
		_soNgayXuLy = soNgayXuLy;
	}

	@Override
	public long getPhanNhomHoSoId() {
		return _phanNhomHoSoId;
	}

	@Override
	public void setPhanNhomHoSoId(long phanNhomHoSoId) {
		_phanNhomHoSoId = phanNhomHoSoId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			MotCuaChuyenDichTrangThai.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public MotCuaChuyenDichTrangThai toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (MotCuaChuyenDichTrangThai)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		MotCuaChuyenDichTrangThaiImpl motCuaChuyenDichTrangThaiImpl = new MotCuaChuyenDichTrangThaiImpl();

		motCuaChuyenDichTrangThaiImpl.setId(getId());
		motCuaChuyenDichTrangThaiImpl.setTrangThaiNguonId(getTrangThaiNguonId());
		motCuaChuyenDichTrangThaiImpl.setTrangThaiDichId(getTrangThaiDichId());
		motCuaChuyenDichTrangThaiImpl.setDieuKienChuyenDich(getDieuKienChuyenDich());
		motCuaChuyenDichTrangThaiImpl.setHanhDongXuLy(getHanhDongXuLy());
		motCuaChuyenDichTrangThaiImpl.setSoNgayXuLy(getSoNgayXuLy());
		motCuaChuyenDichTrangThaiImpl.setPhanNhomHoSoId(getPhanNhomHoSoId());

		motCuaChuyenDichTrangThaiImpl.resetOriginalValues();

		return motCuaChuyenDichTrangThaiImpl;
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

		if (!(obj instanceof MotCuaChuyenDichTrangThai)) {
			return false;
		}

		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = (MotCuaChuyenDichTrangThai)obj;

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
	public void resetOriginalValues() {
		MotCuaChuyenDichTrangThaiModelImpl motCuaChuyenDichTrangThaiModelImpl = this;

		motCuaChuyenDichTrangThaiModelImpl._originalTrangThaiNguonId = motCuaChuyenDichTrangThaiModelImpl._trangThaiNguonId;

		motCuaChuyenDichTrangThaiModelImpl._setOriginalTrangThaiNguonId = false;

		motCuaChuyenDichTrangThaiModelImpl._originalTrangThaiDichId = motCuaChuyenDichTrangThaiModelImpl._trangThaiDichId;

		motCuaChuyenDichTrangThaiModelImpl._setOriginalTrangThaiDichId = false;

		motCuaChuyenDichTrangThaiModelImpl._originalDieuKienChuyenDich = motCuaChuyenDichTrangThaiModelImpl._dieuKienChuyenDich;

		motCuaChuyenDichTrangThaiModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<MotCuaChuyenDichTrangThai> toCacheModel() {
		MotCuaChuyenDichTrangThaiCacheModel motCuaChuyenDichTrangThaiCacheModel = new MotCuaChuyenDichTrangThaiCacheModel();

		motCuaChuyenDichTrangThaiCacheModel.id = getId();

		motCuaChuyenDichTrangThaiCacheModel.trangThaiNguonId = getTrangThaiNguonId();

		motCuaChuyenDichTrangThaiCacheModel.trangThaiDichId = getTrangThaiDichId();

		motCuaChuyenDichTrangThaiCacheModel.dieuKienChuyenDich = getDieuKienChuyenDich();

		String dieuKienChuyenDich = motCuaChuyenDichTrangThaiCacheModel.dieuKienChuyenDich;

		if ((dieuKienChuyenDich != null) && (dieuKienChuyenDich.length() == 0)) {
			motCuaChuyenDichTrangThaiCacheModel.dieuKienChuyenDich = null;
		}

		motCuaChuyenDichTrangThaiCacheModel.hanhDongXuLy = getHanhDongXuLy();

		String hanhDongXuLy = motCuaChuyenDichTrangThaiCacheModel.hanhDongXuLy;

		if ((hanhDongXuLy != null) && (hanhDongXuLy.length() == 0)) {
			motCuaChuyenDichTrangThaiCacheModel.hanhDongXuLy = null;
		}

		motCuaChuyenDichTrangThaiCacheModel.soNgayXuLy = getSoNgayXuLy();

		motCuaChuyenDichTrangThaiCacheModel.phanNhomHoSoId = getPhanNhomHoSoId();

		return motCuaChuyenDichTrangThaiCacheModel;
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

	private static ClassLoader _classLoader = MotCuaChuyenDichTrangThai.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			MotCuaChuyenDichTrangThai.class
		};
	private long _id;
	private long _trangThaiNguonId;
	private long _originalTrangThaiNguonId;
	private boolean _setOriginalTrangThaiNguonId;
	private long _trangThaiDichId;
	private long _originalTrangThaiDichId;
	private boolean _setOriginalTrangThaiDichId;
	private String _dieuKienChuyenDich;
	private String _originalDieuKienChuyenDich;
	private String _hanhDongXuLy;
	private int _soNgayXuLy;
	private long _phanNhomHoSoId;
	private long _columnBitmask;
	private MotCuaChuyenDichTrangThai _escapedModel;
}