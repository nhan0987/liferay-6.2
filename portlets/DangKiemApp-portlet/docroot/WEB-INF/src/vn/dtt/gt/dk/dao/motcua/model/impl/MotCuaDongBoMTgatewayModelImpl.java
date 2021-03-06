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
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgatewayModel;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgatewaySoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the MotCuaDongBoMTgateway service. Represents a row in the &quot;motcua_dongbomtgateway&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgatewayModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MotCuaDongBoMTgatewayImpl}.
 * </p>
 *
 * @author win_64
 * @see MotCuaDongBoMTgatewayImpl
 * @see vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway
 * @see vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgatewayModel
 * @generated
 */
@JSON(strict = true)
public class MotCuaDongBoMTgatewayModelImpl extends BaseModelImpl<MotCuaDongBoMTgateway>
	implements MotCuaDongBoMTgatewayModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a mot cua dong bo m tgateway model instance should use the {@link vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway} interface instead.
	 */
	public static final String TABLE_NAME = "motcua_dongbomtgateway";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "dienbienhosoid", Types.BIGINT },
			{ "phieuxulychinhid", Types.BIGINT },
			{ "modifydate", Types.TIMESTAMP },
			{ "trangthai", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table motcua_dongbomtgateway (id LONG not null primary key,dienbienhosoid LONG,phieuxulychinhid LONG,modifydate DATE null,trangthai VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table motcua_dongbomtgateway";
	public static final String ORDER_BY_JPQL = " ORDER BY motCuaDongBoMTgateway.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY motcua_dongbomtgateway.id ASC";
	public static final String DATA_SOURCE = "tthcDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway"),
			true);
	public static long DIENBIENHOSOID_COLUMN_BITMASK = 1L;
	public static long PHIEUXULYCHINHID_COLUMN_BITMASK = 2L;
	public static long ID_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static MotCuaDongBoMTgateway toModel(
		MotCuaDongBoMTgatewaySoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		MotCuaDongBoMTgateway model = new MotCuaDongBoMTgatewayImpl();

		model.setId(soapModel.getId());
		model.setDienBienHoSoId(soapModel.getDienBienHoSoId());
		model.setPhieuXuLyChinhId(soapModel.getPhieuXuLyChinhId());
		model.setModifyDate(soapModel.getModifyDate());
		model.setTrangThai(soapModel.getTrangThai());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<MotCuaDongBoMTgateway> toModels(
		MotCuaDongBoMTgatewaySoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<MotCuaDongBoMTgateway> models = new ArrayList<MotCuaDongBoMTgateway>(soapModels.length);

		for (MotCuaDongBoMTgatewaySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway"));

	public MotCuaDongBoMTgatewayModelImpl() {
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
		return MotCuaDongBoMTgateway.class;
	}

	@Override
	public String getModelClassName() {
		return MotCuaDongBoMTgateway.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("dienBienHoSoId", getDienBienHoSoId());
		attributes.put("phieuXuLyChinhId", getPhieuXuLyChinhId());
		attributes.put("modifyDate", getModifyDate());
		attributes.put("trangThai", getTrangThai());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long dienBienHoSoId = (Long)attributes.get("dienBienHoSoId");

		if (dienBienHoSoId != null) {
			setDienBienHoSoId(dienBienHoSoId);
		}

		Long phieuXuLyChinhId = (Long)attributes.get("phieuXuLyChinhId");

		if (phieuXuLyChinhId != null) {
			setPhieuXuLyChinhId(phieuXuLyChinhId);
		}

		Date modifyDate = (Date)attributes.get("modifyDate");

		if (modifyDate != null) {
			setModifyDate(modifyDate);
		}

		String trangThai = (String)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}
	}

	@JSON
	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_columnBitmask = -1L;

		_id = id;
	}

	@JSON
	@Override
	public long getDienBienHoSoId() {
		return _dienBienHoSoId;
	}

	@Override
	public void setDienBienHoSoId(long dienBienHoSoId) {
		_columnBitmask |= DIENBIENHOSOID_COLUMN_BITMASK;

		if (!_setOriginalDienBienHoSoId) {
			_setOriginalDienBienHoSoId = true;

			_originalDienBienHoSoId = _dienBienHoSoId;
		}

		_dienBienHoSoId = dienBienHoSoId;
	}

	public long getOriginalDienBienHoSoId() {
		return _originalDienBienHoSoId;
	}

	@JSON
	@Override
	public long getPhieuXuLyChinhId() {
		return _phieuXuLyChinhId;
	}

	@Override
	public void setPhieuXuLyChinhId(long phieuXuLyChinhId) {
		_columnBitmask |= PHIEUXULYCHINHID_COLUMN_BITMASK;

		if (!_setOriginalPhieuXuLyChinhId) {
			_setOriginalPhieuXuLyChinhId = true;

			_originalPhieuXuLyChinhId = _phieuXuLyChinhId;
		}

		_phieuXuLyChinhId = phieuXuLyChinhId;
	}

	public long getOriginalPhieuXuLyChinhId() {
		return _originalPhieuXuLyChinhId;
	}

	@JSON
	@Override
	public Date getModifyDate() {
		return _modifyDate;
	}

	@Override
	public void setModifyDate(Date modifyDate) {
		_modifyDate = modifyDate;
	}

	@JSON
	@Override
	public String getTrangThai() {
		if (_trangThai == null) {
			return StringPool.BLANK;
		}
		else {
			return _trangThai;
		}
	}

	@Override
	public void setTrangThai(String trangThai) {
		_trangThai = trangThai;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			MotCuaDongBoMTgateway.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public MotCuaDongBoMTgateway toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (MotCuaDongBoMTgateway)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		MotCuaDongBoMTgatewayImpl motCuaDongBoMTgatewayImpl = new MotCuaDongBoMTgatewayImpl();

		motCuaDongBoMTgatewayImpl.setId(getId());
		motCuaDongBoMTgatewayImpl.setDienBienHoSoId(getDienBienHoSoId());
		motCuaDongBoMTgatewayImpl.setPhieuXuLyChinhId(getPhieuXuLyChinhId());
		motCuaDongBoMTgatewayImpl.setModifyDate(getModifyDate());
		motCuaDongBoMTgatewayImpl.setTrangThai(getTrangThai());

		motCuaDongBoMTgatewayImpl.resetOriginalValues();

		return motCuaDongBoMTgatewayImpl;
	}

	@Override
	public int compareTo(MotCuaDongBoMTgateway motCuaDongBoMTgateway) {
		int value = 0;

		if (getId() < motCuaDongBoMTgateway.getId()) {
			value = -1;
		}
		else if (getId() > motCuaDongBoMTgateway.getId()) {
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

		if (!(obj instanceof MotCuaDongBoMTgateway)) {
			return false;
		}

		MotCuaDongBoMTgateway motCuaDongBoMTgateway = (MotCuaDongBoMTgateway)obj;

		long primaryKey = motCuaDongBoMTgateway.getPrimaryKey();

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
		MotCuaDongBoMTgatewayModelImpl motCuaDongBoMTgatewayModelImpl = this;

		motCuaDongBoMTgatewayModelImpl._originalDienBienHoSoId = motCuaDongBoMTgatewayModelImpl._dienBienHoSoId;

		motCuaDongBoMTgatewayModelImpl._setOriginalDienBienHoSoId = false;

		motCuaDongBoMTgatewayModelImpl._originalPhieuXuLyChinhId = motCuaDongBoMTgatewayModelImpl._phieuXuLyChinhId;

		motCuaDongBoMTgatewayModelImpl._setOriginalPhieuXuLyChinhId = false;

		motCuaDongBoMTgatewayModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<MotCuaDongBoMTgateway> toCacheModel() {
		MotCuaDongBoMTgatewayCacheModel motCuaDongBoMTgatewayCacheModel = new MotCuaDongBoMTgatewayCacheModel();

		motCuaDongBoMTgatewayCacheModel.id = getId();

		motCuaDongBoMTgatewayCacheModel.dienBienHoSoId = getDienBienHoSoId();

		motCuaDongBoMTgatewayCacheModel.phieuXuLyChinhId = getPhieuXuLyChinhId();

		Date modifyDate = getModifyDate();

		if (modifyDate != null) {
			motCuaDongBoMTgatewayCacheModel.modifyDate = modifyDate.getTime();
		}
		else {
			motCuaDongBoMTgatewayCacheModel.modifyDate = Long.MIN_VALUE;
		}

		motCuaDongBoMTgatewayCacheModel.trangThai = getTrangThai();

		String trangThai = motCuaDongBoMTgatewayCacheModel.trangThai;

		if ((trangThai != null) && (trangThai.length() == 0)) {
			motCuaDongBoMTgatewayCacheModel.trangThai = null;
		}

		return motCuaDongBoMTgatewayCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", dienBienHoSoId=");
		sb.append(getDienBienHoSoId());
		sb.append(", phieuXuLyChinhId=");
		sb.append(getPhieuXuLyChinhId());
		sb.append(", modifyDate=");
		sb.append(getModifyDate());
		sb.append(", trangThai=");
		sb.append(getTrangThai());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dienBienHoSoId</column-name><column-value><![CDATA[");
		sb.append(getDienBienHoSoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phieuXuLyChinhId</column-name><column-value><![CDATA[");
		sb.append(getPhieuXuLyChinhId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifyDate</column-name><column-value><![CDATA[");
		sb.append(getModifyDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThai</column-name><column-value><![CDATA[");
		sb.append(getTrangThai());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = MotCuaDongBoMTgateway.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			MotCuaDongBoMTgateway.class
		};
	private long _id;
	private long _dienBienHoSoId;
	private long _originalDienBienHoSoId;
	private boolean _setOriginalDienBienHoSoId;
	private long _phieuXuLyChinhId;
	private long _originalPhieuXuLyChinhId;
	private boolean _setOriginalPhieuXuLyChinhId;
	private Date _modifyDate;
	private String _trangThai;
	private long _columnBitmask;
	private MotCuaDongBoMTgateway _escapedModel;
}