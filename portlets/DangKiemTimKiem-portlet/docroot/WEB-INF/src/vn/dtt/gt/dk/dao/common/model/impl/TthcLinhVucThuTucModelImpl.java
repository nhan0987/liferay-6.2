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

import vn.dtt.gt.dk.dao.common.model.TthcLinhVucThuTuc;
import vn.dtt.gt.dk.dao.common.model.TthcLinhVucThuTucModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the TthcLinhVucThuTuc service. Represents a row in the &quot;tthc_linhvucthutuc&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.gt.dk.dao.common.model.TthcLinhVucThuTucModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TthcLinhVucThuTucImpl}.
 * </p>
 *
 * @author win_64
 * @see TthcLinhVucThuTucImpl
 * @see vn.dtt.gt.dk.dao.common.model.TthcLinhVucThuTuc
 * @see vn.dtt.gt.dk.dao.common.model.TthcLinhVucThuTucModel
 * @generated
 */
public class TthcLinhVucThuTucModelImpl extends BaseModelImpl<TthcLinhVucThuTuc>
	implements TthcLinhVucThuTucModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tthc linh vuc thu tuc model instance should use the {@link vn.dtt.gt.dk.dao.common.model.TthcLinhVucThuTuc} interface instead.
	 */
	public static final String TABLE_NAME = "tthc_linhvucthutuc";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "tenlinhvuc", Types.VARCHAR },
			{ "tentienganh", Types.VARCHAR },
			{ "idcha", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table tthc_linhvucthutuc (id LONG not null primary key,tenlinhvuc VARCHAR(75) null,tentienganh VARCHAR(75) null,idcha LONG)";
	public static final String TABLE_SQL_DROP = "drop table tthc_linhvucthutuc";
	public static final String ORDER_BY_JPQL = " ORDER BY tthcLinhVucThuTuc.Id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY tthc_linhvucthutuc.id ASC";
	public static final String DATA_SOURCE = "tthcDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.gt.dk.dao.common.model.TthcLinhVucThuTuc"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.gt.dk.dao.common.model.TthcLinhVucThuTuc"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.gt.dk.dao.common.model.TthcLinhVucThuTuc"));

	public TthcLinhVucThuTucModelImpl() {
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
		return TthcLinhVucThuTuc.class;
	}

	@Override
	public String getModelClassName() {
		return TthcLinhVucThuTuc.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("TenLinhVuc", getTenLinhVuc());
		attributes.put("TenTiengAnh", getTenTiengAnh());
		attributes.put("IdCha", getIdCha());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String TenLinhVuc = (String)attributes.get("TenLinhVuc");

		if (TenLinhVuc != null) {
			setTenLinhVuc(TenLinhVuc);
		}

		String TenTiengAnh = (String)attributes.get("TenTiengAnh");

		if (TenTiengAnh != null) {
			setTenTiengAnh(TenTiengAnh);
		}

		Long IdCha = (Long)attributes.get("IdCha");

		if (IdCha != null) {
			setIdCha(IdCha);
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
	public String getTenLinhVuc() {
		if (_TenLinhVuc == null) {
			return StringPool.BLANK;
		}
		else {
			return _TenLinhVuc;
		}
	}

	@Override
	public void setTenLinhVuc(String TenLinhVuc) {
		_TenLinhVuc = TenLinhVuc;
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
	public long getIdCha() {
		return _IdCha;
	}

	@Override
	public void setIdCha(long IdCha) {
		_IdCha = IdCha;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			TthcLinhVucThuTuc.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TthcLinhVucThuTuc toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TthcLinhVucThuTuc)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TthcLinhVucThuTucImpl tthcLinhVucThuTucImpl = new TthcLinhVucThuTucImpl();

		tthcLinhVucThuTucImpl.setId(getId());
		tthcLinhVucThuTucImpl.setTenLinhVuc(getTenLinhVuc());
		tthcLinhVucThuTucImpl.setTenTiengAnh(getTenTiengAnh());
		tthcLinhVucThuTucImpl.setIdCha(getIdCha());

		tthcLinhVucThuTucImpl.resetOriginalValues();

		return tthcLinhVucThuTucImpl;
	}

	@Override
	public int compareTo(TthcLinhVucThuTuc tthcLinhVucThuTuc) {
		int value = 0;

		if (getId() < tthcLinhVucThuTuc.getId()) {
			value = -1;
		}
		else if (getId() > tthcLinhVucThuTuc.getId()) {
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

		if (!(obj instanceof TthcLinhVucThuTuc)) {
			return false;
		}

		TthcLinhVucThuTuc tthcLinhVucThuTuc = (TthcLinhVucThuTuc)obj;

		long primaryKey = tthcLinhVucThuTuc.getPrimaryKey();

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
	public CacheModel<TthcLinhVucThuTuc> toCacheModel() {
		TthcLinhVucThuTucCacheModel tthcLinhVucThuTucCacheModel = new TthcLinhVucThuTucCacheModel();

		tthcLinhVucThuTucCacheModel.Id = getId();

		tthcLinhVucThuTucCacheModel.TenLinhVuc = getTenLinhVuc();

		String TenLinhVuc = tthcLinhVucThuTucCacheModel.TenLinhVuc;

		if ((TenLinhVuc != null) && (TenLinhVuc.length() == 0)) {
			tthcLinhVucThuTucCacheModel.TenLinhVuc = null;
		}

		tthcLinhVucThuTucCacheModel.TenTiengAnh = getTenTiengAnh();

		String TenTiengAnh = tthcLinhVucThuTucCacheModel.TenTiengAnh;

		if ((TenTiengAnh != null) && (TenTiengAnh.length() == 0)) {
			tthcLinhVucThuTucCacheModel.TenTiengAnh = null;
		}

		tthcLinhVucThuTucCacheModel.IdCha = getIdCha();

		return tthcLinhVucThuTucCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{Id=");
		sb.append(getId());
		sb.append(", TenLinhVuc=");
		sb.append(getTenLinhVuc());
		sb.append(", TenTiengAnh=");
		sb.append(getTenTiengAnh());
		sb.append(", IdCha=");
		sb.append(getIdCha());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.common.model.TthcLinhVucThuTuc");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenLinhVuc</column-name><column-value><![CDATA[");
		sb.append(getTenLinhVuc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenTiengAnh</column-name><column-value><![CDATA[");
		sb.append(getTenTiengAnh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>IdCha</column-name><column-value><![CDATA[");
		sb.append(getIdCha());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = TthcLinhVucThuTuc.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			TthcLinhVucThuTuc.class
		};
	private long _Id;
	private String _TenLinhVuc;
	private String _TenTiengAnh;
	private long _IdCha;
	private TthcLinhVucThuTuc _escapedModel;
}