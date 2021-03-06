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

import vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo;
import vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSoModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the TthcBieuMauHoSo service. Represents a row in the &quot;tthc_bieumauhoso&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSoModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TthcBieuMauHoSoImpl}.
 * </p>
 *
 * @author win_64
 * @see TthcBieuMauHoSoImpl
 * @see vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo
 * @see vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSoModel
 * @generated
 */
public class TthcBieuMauHoSoModelImpl extends BaseModelImpl<TthcBieuMauHoSo>
	implements TthcBieuMauHoSoModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tthc bieu mau ho so model instance should use the {@link vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo} interface instead.
	 */
	public static final String TABLE_NAME = "tthc_bieumauhoso";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "mabieumau", Types.VARCHAR },
			{ "tenbieumau", Types.VARCHAR },
			{ "tentienganh", Types.VARCHAR },
			{ "tailieumau", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table tthc_bieumauhoso (id LONG not null primary key,mabieumau VARCHAR(75) null,tenbieumau VARCHAR(75) null,tentienganh VARCHAR(75) null,tailieumau LONG)";
	public static final String TABLE_SQL_DROP = "drop table tthc_bieumauhoso";
	public static final String ORDER_BY_JPQL = " ORDER BY tthcBieuMauHoSo.Id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY tthc_bieumauhoso.id ASC";
	public static final String DATA_SOURCE = "tthcDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo"));

	public TthcBieuMauHoSoModelImpl() {
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
		return TthcBieuMauHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return TthcBieuMauHoSo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("MaBieuMau", getMaBieuMau());
		attributes.put("TenBieuMau", getTenBieuMau());
		attributes.put("TenTiengAnh", getTenTiengAnh());
		attributes.put("TaiLieuMau", getTaiLieuMau());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String MaBieuMau = (String)attributes.get("MaBieuMau");

		if (MaBieuMau != null) {
			setMaBieuMau(MaBieuMau);
		}

		String TenBieuMau = (String)attributes.get("TenBieuMau");

		if (TenBieuMau != null) {
			setTenBieuMau(TenBieuMau);
		}

		String TenTiengAnh = (String)attributes.get("TenTiengAnh");

		if (TenTiengAnh != null) {
			setTenTiengAnh(TenTiengAnh);
		}

		Long TaiLieuMau = (Long)attributes.get("TaiLieuMau");

		if (TaiLieuMau != null) {
			setTaiLieuMau(TaiLieuMau);
		}
	}

	@Override
	public long getId() {
		return _Id;
	}

	@Override
	public void setId(long Id) {
		_Id = Id;
	}

	@Override
	public String getMaBieuMau() {
		if (_MaBieuMau == null) {
			return StringPool.BLANK;
		}
		else {
			return _MaBieuMau;
		}
	}

	@Override
	public void setMaBieuMau(String MaBieuMau) {
		_MaBieuMau = MaBieuMau;
	}

	@Override
	public String getTenBieuMau() {
		if (_TenBieuMau == null) {
			return StringPool.BLANK;
		}
		else {
			return _TenBieuMau;
		}
	}

	@Override
	public void setTenBieuMau(String TenBieuMau) {
		_TenBieuMau = TenBieuMau;
	}

	@Override
	public String getTenTiengAnh() {
		if (_TenTiengAnh == null) {
			return StringPool.BLANK;
		}
		else {
			return _TenTiengAnh;
		}
	}

	@Override
	public void setTenTiengAnh(String TenTiengAnh) {
		_TenTiengAnh = TenTiengAnh;
	}

	@Override
	public long getTaiLieuMau() {
		return _TaiLieuMau;
	}

	@Override
	public void setTaiLieuMau(long TaiLieuMau) {
		_TaiLieuMau = TaiLieuMau;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			TthcBieuMauHoSo.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TthcBieuMauHoSo toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TthcBieuMauHoSo)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TthcBieuMauHoSoImpl tthcBieuMauHoSoImpl = new TthcBieuMauHoSoImpl();

		tthcBieuMauHoSoImpl.setId(getId());
		tthcBieuMauHoSoImpl.setMaBieuMau(getMaBieuMau());
		tthcBieuMauHoSoImpl.setTenBieuMau(getTenBieuMau());
		tthcBieuMauHoSoImpl.setTenTiengAnh(getTenTiengAnh());
		tthcBieuMauHoSoImpl.setTaiLieuMau(getTaiLieuMau());

		tthcBieuMauHoSoImpl.resetOriginalValues();

		return tthcBieuMauHoSoImpl;
	}

	@Override
	public int compareTo(TthcBieuMauHoSo tthcBieuMauHoSo) {
		int value = 0;

		if (getId() < tthcBieuMauHoSo.getId()) {
			value = -1;
		}
		else if (getId() > tthcBieuMauHoSo.getId()) {
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

		if (!(obj instanceof TthcBieuMauHoSo)) {
			return false;
		}

		TthcBieuMauHoSo tthcBieuMauHoSo = (TthcBieuMauHoSo)obj;

		long primaryKey = tthcBieuMauHoSo.getPrimaryKey();

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
	}

	@Override
	public CacheModel<TthcBieuMauHoSo> toCacheModel() {
		TthcBieuMauHoSoCacheModel tthcBieuMauHoSoCacheModel = new TthcBieuMauHoSoCacheModel();

		tthcBieuMauHoSoCacheModel.Id = getId();

		tthcBieuMauHoSoCacheModel.MaBieuMau = getMaBieuMau();

		String MaBieuMau = tthcBieuMauHoSoCacheModel.MaBieuMau;

		if ((MaBieuMau != null) && (MaBieuMau.length() == 0)) {
			tthcBieuMauHoSoCacheModel.MaBieuMau = null;
		}

		tthcBieuMauHoSoCacheModel.TenBieuMau = getTenBieuMau();

		String TenBieuMau = tthcBieuMauHoSoCacheModel.TenBieuMau;

		if ((TenBieuMau != null) && (TenBieuMau.length() == 0)) {
			tthcBieuMauHoSoCacheModel.TenBieuMau = null;
		}

		tthcBieuMauHoSoCacheModel.TenTiengAnh = getTenTiengAnh();

		String TenTiengAnh = tthcBieuMauHoSoCacheModel.TenTiengAnh;

		if ((TenTiengAnh != null) && (TenTiengAnh.length() == 0)) {
			tthcBieuMauHoSoCacheModel.TenTiengAnh = null;
		}

		tthcBieuMauHoSoCacheModel.TaiLieuMau = getTaiLieuMau();

		return tthcBieuMauHoSoCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{Id=");
		sb.append(getId());
		sb.append(", MaBieuMau=");
		sb.append(getMaBieuMau());
		sb.append(", TenBieuMau=");
		sb.append(getTenBieuMau());
		sb.append(", TenTiengAnh=");
		sb.append(getTenTiengAnh());
		sb.append(", TaiLieuMau=");
		sb.append(getTaiLieuMau());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MaBieuMau</column-name><column-value><![CDATA[");
		sb.append(getMaBieuMau());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenBieuMau</column-name><column-value><![CDATA[");
		sb.append(getTenBieuMau());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenTiengAnh</column-name><column-value><![CDATA[");
		sb.append(getTenTiengAnh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TaiLieuMau</column-name><column-value><![CDATA[");
		sb.append(getTaiLieuMau());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = TthcBieuMauHoSo.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			TthcBieuMauHoSo.class
		};
	private long _Id;
	private String _MaBieuMau;
	private String _TenBieuMau;
	private String _TenTiengAnh;
	private long _TaiLieuMau;
	private TthcBieuMauHoSo _escapedModel;
}