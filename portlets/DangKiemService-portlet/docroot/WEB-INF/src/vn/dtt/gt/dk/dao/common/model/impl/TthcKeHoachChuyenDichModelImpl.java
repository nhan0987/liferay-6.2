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

import vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich;
import vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDichModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the TthcKeHoachChuyenDich service. Represents a row in the &quot;tthc_kehoachchuyendich&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDichModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TthcKeHoachChuyenDichImpl}.
 * </p>
 *
 * @author huymq
 * @see TthcKeHoachChuyenDichImpl
 * @see vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich
 * @see vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDichModel
 * @generated
 */
public class TthcKeHoachChuyenDichModelImpl extends BaseModelImpl<TthcKeHoachChuyenDich>
	implements TthcKeHoachChuyenDichModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tthc ke hoach chuyen dich model instance should use the {@link vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich} interface instead.
	 */
	public static final String TABLE_NAME = "tthc_kehoachchuyendich";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "phieuxulychinhid", Types.BIGINT },
			{ "phieuxulyphuid", Types.BIGINT },
			{ "messageid", Types.VARCHAR },
			{ "messagestatus", Types.VARCHAR },
			{ "trangthainguonid", Types.BIGINT },
			{ "dieukienchuyendich", Types.VARCHAR },
			{ "trangthaidichid", Types.BIGINT },
			{ "phannhomhosoid", Types.BIGINT },
			{ "nhomphieuxuly", Types.VARCHAR },
			{ "hoantat", Types.VARCHAR },
			{ "ghichu", Types.VARCHAR },
			{ "debitnotenumber", Types.VARCHAR },
			{ "messagefunction", Types.VARCHAR },
			{ "messagetype", Types.VARCHAR },
			{ "thoidiemcapnhat", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table tthc_kehoachchuyendich (id LONG not null primary key,phieuxulychinhid LONG,phieuxulyphuid LONG,messageid VARCHAR(75) null,messagestatus VARCHAR(75) null,trangthainguonid LONG,dieukienchuyendich VARCHAR(75) null,trangthaidichid LONG,phannhomhosoid LONG,nhomphieuxuly VARCHAR(75) null,hoantat VARCHAR(75) null,ghichu VARCHAR(75) null,debitnotenumber VARCHAR(75) null,messagefunction VARCHAR(75) null,messagetype VARCHAR(75) null,thoidiemcapnhat DATE null)";
	public static final String TABLE_SQL_DROP = "drop table tthc_kehoachchuyendich";
	public static final String ORDER_BY_JPQL = " ORDER BY tthcKeHoachChuyenDich.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY tthc_kehoachchuyendich.id ASC";
	public static final String DATA_SOURCE = "tthcDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich"),
			true);
	public static long DEBITNOTENUMBER_COLUMN_BITMASK = 1L;
	public static long GHICHU_COLUMN_BITMASK = 2L;
	public static long MESSAGEID_COLUMN_BITMASK = 4L;
	public static long PHIEUXULYCHINHID_COLUMN_BITMASK = 8L;
	public static long PHIEUXULYPHUID_COLUMN_BITMASK = 16L;
	public static long ID_COLUMN_BITMASK = 32L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich"));

	public TthcKeHoachChuyenDichModelImpl() {
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
		return TthcKeHoachChuyenDich.class;
	}

	@Override
	public String getModelClassName() {
		return TthcKeHoachChuyenDich.class.getName();
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
		attributes.put("debitnoteNumber", getDebitnoteNumber());
		attributes.put("messageFunction", getMessageFunction());
		attributes.put("messageType", getMessageType());
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

		String nhomPhieuXuLy = (String)attributes.get("nhomPhieuXuLy");

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

		String debitnoteNumber = (String)attributes.get("debitnoteNumber");

		if (debitnoteNumber != null) {
			setDebitnoteNumber(debitnoteNumber);
		}

		String messageFunction = (String)attributes.get("messageFunction");

		if (messageFunction != null) {
			setMessageFunction(messageFunction);
		}

		String messageType = (String)attributes.get("messageType");

		if (messageType != null) {
			setMessageType(messageType);
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
		_columnBitmask = -1L;

		_id = id;
	}

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

	@Override
	public long getPhieuXuLyPhuId() {
		return _phieuXuLyPhuId;
	}

	@Override
	public void setPhieuXuLyPhuId(long phieuXuLyPhuId) {
		_columnBitmask |= PHIEUXULYPHUID_COLUMN_BITMASK;

		if (!_setOriginalPhieuXuLyPhuId) {
			_setOriginalPhieuXuLyPhuId = true;

			_originalPhieuXuLyPhuId = _phieuXuLyPhuId;
		}

		_phieuXuLyPhuId = phieuXuLyPhuId;
	}

	public long getOriginalPhieuXuLyPhuId() {
		return _originalPhieuXuLyPhuId;
	}

	@Override
	public String getMessageId() {
		if (_messageId == null) {
			return StringPool.BLANK;
		}
		else {
			return _messageId;
		}
	}

	@Override
	public void setMessageId(String messageId) {
		_columnBitmask |= MESSAGEID_COLUMN_BITMASK;

		if (_originalMessageId == null) {
			_originalMessageId = _messageId;
		}

		_messageId = messageId;
	}

	public String getOriginalMessageId() {
		return GetterUtil.getString(_originalMessageId);
	}

	@Override
	public String getMessageStatus() {
		if (_messageStatus == null) {
			return StringPool.BLANK;
		}
		else {
			return _messageStatus;
		}
	}

	@Override
	public void setMessageStatus(String messageStatus) {
		_messageStatus = messageStatus;
	}

	@Override
	public long getTrangThaiNguonId() {
		return _trangThaiNguonId;
	}

	@Override
	public void setTrangThaiNguonId(long trangThaiNguonId) {
		_trangThaiNguonId = trangThaiNguonId;
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
		_dieuKienChuyenDich = dieuKienChuyenDich;
	}

	@Override
	public long getTrangThaiDichId() {
		return _trangThaiDichId;
	}

	@Override
	public void setTrangThaiDichId(long trangThaiDichId) {
		_trangThaiDichId = trangThaiDichId;
	}

	@Override
	public long getPhanNhomHoSoId() {
		return _phanNhomHoSoId;
	}

	@Override
	public void setPhanNhomHoSoId(long phanNhomHoSoId) {
		_phanNhomHoSoId = phanNhomHoSoId;
	}

	@Override
	public String getNhomPhieuXuLy() {
		if (_nhomPhieuXuLy == null) {
			return StringPool.BLANK;
		}
		else {
			return _nhomPhieuXuLy;
		}
	}

	@Override
	public void setNhomPhieuXuLy(String nhomPhieuXuLy) {
		_nhomPhieuXuLy = nhomPhieuXuLy;
	}

	@Override
	public String getHoanTat() {
		if (_hoanTat == null) {
			return StringPool.BLANK;
		}
		else {
			return _hoanTat;
		}
	}

	@Override
	public void setHoanTat(String hoanTat) {
		_hoanTat = hoanTat;
	}

	@Override
	public String getGhiChu() {
		if (_ghiChu == null) {
			return StringPool.BLANK;
		}
		else {
			return _ghiChu;
		}
	}

	@Override
	public void setGhiChu(String ghiChu) {
		_columnBitmask |= GHICHU_COLUMN_BITMASK;

		if (_originalGhiChu == null) {
			_originalGhiChu = _ghiChu;
		}

		_ghiChu = ghiChu;
	}

	public String getOriginalGhiChu() {
		return GetterUtil.getString(_originalGhiChu);
	}

	@Override
	public String getDebitnoteNumber() {
		if (_debitnoteNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _debitnoteNumber;
		}
	}

	@Override
	public void setDebitnoteNumber(String debitnoteNumber) {
		_columnBitmask |= DEBITNOTENUMBER_COLUMN_BITMASK;

		if (_originalDebitnoteNumber == null) {
			_originalDebitnoteNumber = _debitnoteNumber;
		}

		_debitnoteNumber = debitnoteNumber;
	}

	public String getOriginalDebitnoteNumber() {
		return GetterUtil.getString(_originalDebitnoteNumber);
	}

	@Override
	public String getMessageFunction() {
		if (_messageFunction == null) {
			return StringPool.BLANK;
		}
		else {
			return _messageFunction;
		}
	}

	@Override
	public void setMessageFunction(String messageFunction) {
		_messageFunction = messageFunction;
	}

	@Override
	public String getMessageType() {
		if (_messageType == null) {
			return StringPool.BLANK;
		}
		else {
			return _messageType;
		}
	}

	@Override
	public void setMessageType(String messageType) {
		_messageType = messageType;
	}

	@Override
	public Date getThoiDiemCapNhat() {
		return _thoiDiemCapNhat;
	}

	@Override
	public void setThoiDiemCapNhat(Date thoiDiemCapNhat) {
		_thoiDiemCapNhat = thoiDiemCapNhat;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			TthcKeHoachChuyenDich.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TthcKeHoachChuyenDich toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TthcKeHoachChuyenDich)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TthcKeHoachChuyenDichImpl tthcKeHoachChuyenDichImpl = new TthcKeHoachChuyenDichImpl();

		tthcKeHoachChuyenDichImpl.setId(getId());
		tthcKeHoachChuyenDichImpl.setPhieuXuLyChinhId(getPhieuXuLyChinhId());
		tthcKeHoachChuyenDichImpl.setPhieuXuLyPhuId(getPhieuXuLyPhuId());
		tthcKeHoachChuyenDichImpl.setMessageId(getMessageId());
		tthcKeHoachChuyenDichImpl.setMessageStatus(getMessageStatus());
		tthcKeHoachChuyenDichImpl.setTrangThaiNguonId(getTrangThaiNguonId());
		tthcKeHoachChuyenDichImpl.setDieuKienChuyenDich(getDieuKienChuyenDich());
		tthcKeHoachChuyenDichImpl.setTrangThaiDichId(getTrangThaiDichId());
		tthcKeHoachChuyenDichImpl.setPhanNhomHoSoId(getPhanNhomHoSoId());
		tthcKeHoachChuyenDichImpl.setNhomPhieuXuLy(getNhomPhieuXuLy());
		tthcKeHoachChuyenDichImpl.setHoanTat(getHoanTat());
		tthcKeHoachChuyenDichImpl.setGhiChu(getGhiChu());
		tthcKeHoachChuyenDichImpl.setDebitnoteNumber(getDebitnoteNumber());
		tthcKeHoachChuyenDichImpl.setMessageFunction(getMessageFunction());
		tthcKeHoachChuyenDichImpl.setMessageType(getMessageType());
		tthcKeHoachChuyenDichImpl.setThoiDiemCapNhat(getThoiDiemCapNhat());

		tthcKeHoachChuyenDichImpl.resetOriginalValues();

		return tthcKeHoachChuyenDichImpl;
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

		if (!(obj instanceof TthcKeHoachChuyenDich)) {
			return false;
		}

		TthcKeHoachChuyenDich tthcKeHoachChuyenDich = (TthcKeHoachChuyenDich)obj;

		long primaryKey = tthcKeHoachChuyenDich.getPrimaryKey();

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
		TthcKeHoachChuyenDichModelImpl tthcKeHoachChuyenDichModelImpl = this;

		tthcKeHoachChuyenDichModelImpl._originalPhieuXuLyChinhId = tthcKeHoachChuyenDichModelImpl._phieuXuLyChinhId;

		tthcKeHoachChuyenDichModelImpl._setOriginalPhieuXuLyChinhId = false;

		tthcKeHoachChuyenDichModelImpl._originalPhieuXuLyPhuId = tthcKeHoachChuyenDichModelImpl._phieuXuLyPhuId;

		tthcKeHoachChuyenDichModelImpl._setOriginalPhieuXuLyPhuId = false;

		tthcKeHoachChuyenDichModelImpl._originalMessageId = tthcKeHoachChuyenDichModelImpl._messageId;

		tthcKeHoachChuyenDichModelImpl._originalGhiChu = tthcKeHoachChuyenDichModelImpl._ghiChu;

		tthcKeHoachChuyenDichModelImpl._originalDebitnoteNumber = tthcKeHoachChuyenDichModelImpl._debitnoteNumber;

		tthcKeHoachChuyenDichModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<TthcKeHoachChuyenDich> toCacheModel() {
		TthcKeHoachChuyenDichCacheModel tthcKeHoachChuyenDichCacheModel = new TthcKeHoachChuyenDichCacheModel();

		tthcKeHoachChuyenDichCacheModel.id = getId();

		tthcKeHoachChuyenDichCacheModel.phieuXuLyChinhId = getPhieuXuLyChinhId();

		tthcKeHoachChuyenDichCacheModel.phieuXuLyPhuId = getPhieuXuLyPhuId();

		tthcKeHoachChuyenDichCacheModel.messageId = getMessageId();

		String messageId = tthcKeHoachChuyenDichCacheModel.messageId;

		if ((messageId != null) && (messageId.length() == 0)) {
			tthcKeHoachChuyenDichCacheModel.messageId = null;
		}

		tthcKeHoachChuyenDichCacheModel.messageStatus = getMessageStatus();

		String messageStatus = tthcKeHoachChuyenDichCacheModel.messageStatus;

		if ((messageStatus != null) && (messageStatus.length() == 0)) {
			tthcKeHoachChuyenDichCacheModel.messageStatus = null;
		}

		tthcKeHoachChuyenDichCacheModel.trangThaiNguonId = getTrangThaiNguonId();

		tthcKeHoachChuyenDichCacheModel.dieuKienChuyenDich = getDieuKienChuyenDich();

		String dieuKienChuyenDich = tthcKeHoachChuyenDichCacheModel.dieuKienChuyenDich;

		if ((dieuKienChuyenDich != null) && (dieuKienChuyenDich.length() == 0)) {
			tthcKeHoachChuyenDichCacheModel.dieuKienChuyenDich = null;
		}

		tthcKeHoachChuyenDichCacheModel.trangThaiDichId = getTrangThaiDichId();

		tthcKeHoachChuyenDichCacheModel.phanNhomHoSoId = getPhanNhomHoSoId();

		tthcKeHoachChuyenDichCacheModel.nhomPhieuXuLy = getNhomPhieuXuLy();

		String nhomPhieuXuLy = tthcKeHoachChuyenDichCacheModel.nhomPhieuXuLy;

		if ((nhomPhieuXuLy != null) && (nhomPhieuXuLy.length() == 0)) {
			tthcKeHoachChuyenDichCacheModel.nhomPhieuXuLy = null;
		}

		tthcKeHoachChuyenDichCacheModel.hoanTat = getHoanTat();

		String hoanTat = tthcKeHoachChuyenDichCacheModel.hoanTat;

		if ((hoanTat != null) && (hoanTat.length() == 0)) {
			tthcKeHoachChuyenDichCacheModel.hoanTat = null;
		}

		tthcKeHoachChuyenDichCacheModel.ghiChu = getGhiChu();

		String ghiChu = tthcKeHoachChuyenDichCacheModel.ghiChu;

		if ((ghiChu != null) && (ghiChu.length() == 0)) {
			tthcKeHoachChuyenDichCacheModel.ghiChu = null;
		}

		tthcKeHoachChuyenDichCacheModel.debitnoteNumber = getDebitnoteNumber();

		String debitnoteNumber = tthcKeHoachChuyenDichCacheModel.debitnoteNumber;

		if ((debitnoteNumber != null) && (debitnoteNumber.length() == 0)) {
			tthcKeHoachChuyenDichCacheModel.debitnoteNumber = null;
		}

		tthcKeHoachChuyenDichCacheModel.messageFunction = getMessageFunction();

		String messageFunction = tthcKeHoachChuyenDichCacheModel.messageFunction;

		if ((messageFunction != null) && (messageFunction.length() == 0)) {
			tthcKeHoachChuyenDichCacheModel.messageFunction = null;
		}

		tthcKeHoachChuyenDichCacheModel.messageType = getMessageType();

		String messageType = tthcKeHoachChuyenDichCacheModel.messageType;

		if ((messageType != null) && (messageType.length() == 0)) {
			tthcKeHoachChuyenDichCacheModel.messageType = null;
		}

		Date thoiDiemCapNhat = getThoiDiemCapNhat();

		if (thoiDiemCapNhat != null) {
			tthcKeHoachChuyenDichCacheModel.thoiDiemCapNhat = thoiDiemCapNhat.getTime();
		}
		else {
			tthcKeHoachChuyenDichCacheModel.thoiDiemCapNhat = Long.MIN_VALUE;
		}

		return tthcKeHoachChuyenDichCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

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
		sb.append(", debitnoteNumber=");
		sb.append(getDebitnoteNumber());
		sb.append(", messageFunction=");
		sb.append(getMessageFunction());
		sb.append(", messageType=");
		sb.append(getMessageType());
		sb.append(", thoiDiemCapNhat=");
		sb.append(getThoiDiemCapNhat());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(52);

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
			"<column><column-name>debitnoteNumber</column-name><column-value><![CDATA[");
		sb.append(getDebitnoteNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>messageFunction</column-name><column-value><![CDATA[");
		sb.append(getMessageFunction());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>messageType</column-name><column-value><![CDATA[");
		sb.append(getMessageType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thoiDiemCapNhat</column-name><column-value><![CDATA[");
		sb.append(getThoiDiemCapNhat());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = TthcKeHoachChuyenDich.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			TthcKeHoachChuyenDich.class
		};
	private long _id;
	private long _phieuXuLyChinhId;
	private long _originalPhieuXuLyChinhId;
	private boolean _setOriginalPhieuXuLyChinhId;
	private long _phieuXuLyPhuId;
	private long _originalPhieuXuLyPhuId;
	private boolean _setOriginalPhieuXuLyPhuId;
	private String _messageId;
	private String _originalMessageId;
	private String _messageStatus;
	private long _trangThaiNguonId;
	private String _dieuKienChuyenDich;
	private long _trangThaiDichId;
	private long _phanNhomHoSoId;
	private String _nhomPhieuXuLy;
	private String _hoanTat;
	private String _ghiChu;
	private String _originalGhiChu;
	private String _debitnoteNumber;
	private String _originalDebitnoteNumber;
	private String _messageFunction;
	private String _messageType;
	private Date _thoiDiemCapNhat;
	private long _columnBitmask;
	private TthcKeHoachChuyenDich _escapedModel;
}