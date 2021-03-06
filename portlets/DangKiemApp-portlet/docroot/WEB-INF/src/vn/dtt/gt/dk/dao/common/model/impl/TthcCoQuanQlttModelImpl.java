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

import vn.dtt.gt.dk.dao.common.model.TthcCoQuanQltt;
import vn.dtt.gt.dk.dao.common.model.TthcCoQuanQlttModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the TthcCoQuanQltt service. Represents a row in the &quot;tthc_coquanqltt&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.gt.dk.dao.common.model.TthcCoQuanQlttModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TthcCoQuanQlttImpl}.
 * </p>
 *
 * @author win_64
 * @see TthcCoQuanQlttImpl
 * @see vn.dtt.gt.dk.dao.common.model.TthcCoQuanQltt
 * @see vn.dtt.gt.dk.dao.common.model.TthcCoQuanQlttModel
 * @generated
 */
public class TthcCoQuanQlttModelImpl extends BaseModelImpl<TthcCoQuanQltt>
	implements TthcCoQuanQlttModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tthc co quan qltt model instance should use the {@link vn.dtt.gt.dk.dao.common.model.TthcCoQuanQltt} interface instead.
	 */
	public static final String TABLE_NAME = "tthc_coquanqltt";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "tencoquanqltt", Types.VARCHAR },
			{ "tentienganh", Types.VARCHAR },
			{ "idcha", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table tthc_coquanqltt (id LONG not null primary key,tencoquanqltt VARCHAR(75) null,tentienganh VARCHAR(75) null,idcha LONG)";
	public static final String TABLE_SQL_DROP = "drop table tthc_coquanqltt";
	public static final String ORDER_BY_JPQL = " ORDER BY tthcCoQuanQltt.Id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY tthc_coquanqltt.id ASC";
	public static final String DATA_SOURCE = "tthcDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.gt.dk.dao.common.model.TthcCoQuanQltt"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.gt.dk.dao.common.model.TthcCoQuanQltt"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.gt.dk.dao.common.model.TthcCoQuanQltt"));

	public TthcCoQuanQlttModelImpl() {
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
		return TthcCoQuanQltt.class;
	}

	@Override
	public String getModelClassName() {
		return TthcCoQuanQltt.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("TenCoQuanQltt", getTenCoQuanQltt());
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

		String TenCoQuanQltt = (String)attributes.get("TenCoQuanQltt");

		if (TenCoQuanQltt != null) {
			setTenCoQuanQltt(TenCoQuanQltt);
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
	public String getTenCoQuanQltt() {
		if (_TenCoQuanQltt == null) {
			return StringPool.BLANK;
		}
		else {
			return _TenCoQuanQltt;
		}
	}

	@Override
	public void setTenCoQuanQltt(String TenCoQuanQltt) {
		_TenCoQuanQltt = TenCoQuanQltt;
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
			TthcCoQuanQltt.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TthcCoQuanQltt toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TthcCoQuanQltt)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TthcCoQuanQlttImpl tthcCoQuanQlttImpl = new TthcCoQuanQlttImpl();

		tthcCoQuanQlttImpl.setId(getId());
		tthcCoQuanQlttImpl.setTenCoQuanQltt(getTenCoQuanQltt());
		tthcCoQuanQlttImpl.setTenTiengAnh(getTenTiengAnh());
		tthcCoQuanQlttImpl.setIdCha(getIdCha());

		tthcCoQuanQlttImpl.resetOriginalValues();

		return tthcCoQuanQlttImpl;
	}

	@Override
	public int compareTo(TthcCoQuanQltt tthcCoQuanQltt) {
		int value = 0;

		if (getId() < tthcCoQuanQltt.getId()) {
			value = -1;
		}
		else if (getId() > tthcCoQuanQltt.getId()) {
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

		if (!(obj instanceof TthcCoQuanQltt)) {
			return false;
		}

		TthcCoQuanQltt tthcCoQuanQltt = (TthcCoQuanQltt)obj;

		long primaryKey = tthcCoQuanQltt.getPrimaryKey();

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
	public CacheModel<TthcCoQuanQltt> toCacheModel() {
		TthcCoQuanQlttCacheModel tthcCoQuanQlttCacheModel = new TthcCoQuanQlttCacheModel();

		tthcCoQuanQlttCacheModel.Id = getId();

		tthcCoQuanQlttCacheModel.TenCoQuanQltt = getTenCoQuanQltt();

		String TenCoQuanQltt = tthcCoQuanQlttCacheModel.TenCoQuanQltt;

		if ((TenCoQuanQltt != null) && (TenCoQuanQltt.length() == 0)) {
			tthcCoQuanQlttCacheModel.TenCoQuanQltt = null;
		}

		tthcCoQuanQlttCacheModel.TenTiengAnh = getTenTiengAnh();

		String TenTiengAnh = tthcCoQuanQlttCacheModel.TenTiengAnh;

		if ((TenTiengAnh != null) && (TenTiengAnh.length() == 0)) {
			tthcCoQuanQlttCacheModel.TenTiengAnh = null;
		}

		tthcCoQuanQlttCacheModel.IdCha = getIdCha();

		return tthcCoQuanQlttCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{Id=");
		sb.append(getId());
		sb.append(", TenCoQuanQltt=");
		sb.append(getTenCoQuanQltt());
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
		sb.append("vn.dtt.gt.dk.dao.common.model.TthcCoQuanQltt");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenCoQuanQltt</column-name><column-value><![CDATA[");
		sb.append(getTenCoQuanQltt());
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

	private static ClassLoader _classLoader = TthcCoQuanQltt.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			TthcCoQuanQltt.class
		};
	private long _Id;
	private String _TenCoQuanQltt;
	private String _TenTiengAnh;
	private long _IdCha;
	private TthcCoQuanQltt _escapedModel;
}