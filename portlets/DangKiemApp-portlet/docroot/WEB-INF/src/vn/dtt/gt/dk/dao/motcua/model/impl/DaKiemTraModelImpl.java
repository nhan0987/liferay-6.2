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

import vn.dtt.gt.dk.dao.motcua.model.DaKiemTra;
import vn.dtt.gt.dk.dao.motcua.model.DaKiemTraModel;
import vn.dtt.gt.dk.dao.motcua.model.DaKiemTraSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the DaKiemTra service. Represents a row in the &quot;view_dakiemtra&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.gt.dk.dao.motcua.model.DaKiemTraModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DaKiemTraImpl}.
 * </p>
 *
 * @author win_64
 * @see DaKiemTraImpl
 * @see vn.dtt.gt.dk.dao.motcua.model.DaKiemTra
 * @see vn.dtt.gt.dk.dao.motcua.model.DaKiemTraModel
 * @generated
 */
@JSON(strict = true)
public class DaKiemTraModelImpl extends BaseModelImpl<DaKiemTra>
	implements DaKiemTraModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a da kiem tra model instance should use the {@link vn.dtt.gt.dk.dao.motcua.model.DaKiemTra} interface instead.
	 */
	public static final String TABLE_NAME = "view_dakiemtra";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "phieuxulychinhid", Types.BIGINT },
			{ "trichyeunoidung", Types.VARCHAR },
			{ "ghichu", Types.VARCHAR },
			{ "trangthaihientaiid", Types.BIGINT },
			{ "noidunghosoid", Types.BIGINT },
			{ "chiemquyenxuly", Types.BIGINT },
			{ "ngaytaophieu", Types.TIMESTAMP },
			{ "nguoitaophieu", Types.BIGINT },
			{ "nhomphieuxuly", Types.VARCHAR },
			{ "phannhomhosoid", Types.BIGINT },
			{ "masohoso", Types.VARCHAR },
			{ "mabiennhan", Types.VARCHAR },
			{ "thutuchanhchinhid", Types.BIGINT },
			{ "tenchuhoso", Types.VARCHAR },
			{ "ngayguihoso", Types.TIMESTAMP },
			{ "tendonvitiepnhan", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table view_dakiemtra (id LONG not null primary key,phieuxulychinhid LONG,trichyeunoidung VARCHAR(75) null,ghichu VARCHAR(75) null,trangthaihientaiid LONG,noidunghosoid LONG,chiemquyenxuly LONG,ngaytaophieu DATE null,nguoitaophieu LONG,nhomphieuxuly VARCHAR(75) null,phannhomhosoid LONG,masohoso VARCHAR(75) null,mabiennhan VARCHAR(75) null,thutuchanhchinhid LONG,tenchuhoso VARCHAR(75) null,ngayguihoso DATE null,tendonvitiepnhan VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table view_dakiemtra";
	public static final String ORDER_BY_JPQL = " ORDER BY daKiemTra.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY view_dakiemtra.id ASC";
	public static final String DATA_SOURCE = "tthcDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.gt.dk.dao.motcua.model.DaKiemTra"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.gt.dk.dao.motcua.model.DaKiemTra"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static DaKiemTra toModel(DaKiemTraSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		DaKiemTra model = new DaKiemTraImpl();

		model.setId(soapModel.getId());
		model.setPhieuXuLyChinhId(soapModel.getPhieuXuLyChinhId());
		model.setTrichYeuNoiDung(soapModel.getTrichYeuNoiDung());
		model.setGhiChu(soapModel.getGhiChu());
		model.setTrangThaiHienTaiId(soapModel.getTrangThaiHienTaiId());
		model.setNoiDungHoSoId(soapModel.getNoiDungHoSoId());
		model.setChiemQuyenXuLy(soapModel.getChiemQuyenXuLy());
		model.setNgayTaoPhieu(soapModel.getNgayTaoPhieu());
		model.setNguoiTaoPhieu(soapModel.getNguoiTaoPhieu());
		model.setNhomPhieuXuLy(soapModel.getNhomPhieuXuLy());
		model.setPhanNhomHoSoId(soapModel.getPhanNhomHoSoId());
		model.setMaSoHoSo(soapModel.getMaSoHoSo());
		model.setMaBienNhan(soapModel.getMaBienNhan());
		model.setThuTucHanhChinhId(soapModel.getThuTucHanhChinhId());
		model.setTenChuHoSo(soapModel.getTenChuHoSo());
		model.setNgayGuiHoSo(soapModel.getNgayGuiHoSo());
		model.setTenDonViTiepNhan(soapModel.getTenDonViTiepNhan());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<DaKiemTra> toModels(DaKiemTraSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<DaKiemTra> models = new ArrayList<DaKiemTra>(soapModels.length);

		for (DaKiemTraSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.gt.dk.dao.motcua.model.DaKiemTra"));

	public DaKiemTraModelImpl() {
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
		return DaKiemTra.class;
	}

	@Override
	public String getModelClassName() {
		return DaKiemTra.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("phieuXuLyChinhId", getPhieuXuLyChinhId());
		attributes.put("trichYeuNoiDung", getTrichYeuNoiDung());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("trangThaiHienTaiId", getTrangThaiHienTaiId());
		attributes.put("noiDungHoSoId", getNoiDungHoSoId());
		attributes.put("chiemQuyenXuLy", getChiemQuyenXuLy());
		attributes.put("ngayTaoPhieu", getNgayTaoPhieu());
		attributes.put("nguoiTaoPhieu", getNguoiTaoPhieu());
		attributes.put("nhomPhieuXuLy", getNhomPhieuXuLy());
		attributes.put("phanNhomHoSoId", getPhanNhomHoSoId());
		attributes.put("maSoHoSo", getMaSoHoSo());
		attributes.put("maBienNhan", getMaBienNhan());
		attributes.put("thuTucHanhChinhId", getThuTucHanhChinhId());
		attributes.put("tenChuHoSo", getTenChuHoSo());
		attributes.put("ngayGuiHoSo", getNgayGuiHoSo());
		attributes.put("tenDonViTiepNhan", getTenDonViTiepNhan());

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

		String trichYeuNoiDung = (String)attributes.get("trichYeuNoiDung");

		if (trichYeuNoiDung != null) {
			setTrichYeuNoiDung(trichYeuNoiDung);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		Long trangThaiHienTaiId = (Long)attributes.get("trangThaiHienTaiId");

		if (trangThaiHienTaiId != null) {
			setTrangThaiHienTaiId(trangThaiHienTaiId);
		}

		Long noiDungHoSoId = (Long)attributes.get("noiDungHoSoId");

		if (noiDungHoSoId != null) {
			setNoiDungHoSoId(noiDungHoSoId);
		}

		Long chiemQuyenXuLy = (Long)attributes.get("chiemQuyenXuLy");

		if (chiemQuyenXuLy != null) {
			setChiemQuyenXuLy(chiemQuyenXuLy);
		}

		Date ngayTaoPhieu = (Date)attributes.get("ngayTaoPhieu");

		if (ngayTaoPhieu != null) {
			setNgayTaoPhieu(ngayTaoPhieu);
		}

		Long nguoiTaoPhieu = (Long)attributes.get("nguoiTaoPhieu");

		if (nguoiTaoPhieu != null) {
			setNguoiTaoPhieu(nguoiTaoPhieu);
		}

		String nhomPhieuXuLy = (String)attributes.get("nhomPhieuXuLy");

		if (nhomPhieuXuLy != null) {
			setNhomPhieuXuLy(nhomPhieuXuLy);
		}

		Long phanNhomHoSoId = (Long)attributes.get("phanNhomHoSoId");

		if (phanNhomHoSoId != null) {
			setPhanNhomHoSoId(phanNhomHoSoId);
		}

		String maSoHoSo = (String)attributes.get("maSoHoSo");

		if (maSoHoSo != null) {
			setMaSoHoSo(maSoHoSo);
		}

		String maBienNhan = (String)attributes.get("maBienNhan");

		if (maBienNhan != null) {
			setMaBienNhan(maBienNhan);
		}

		Long thuTucHanhChinhId = (Long)attributes.get("thuTucHanhChinhId");

		if (thuTucHanhChinhId != null) {
			setThuTucHanhChinhId(thuTucHanhChinhId);
		}

		String tenChuHoSo = (String)attributes.get("tenChuHoSo");

		if (tenChuHoSo != null) {
			setTenChuHoSo(tenChuHoSo);
		}

		Date ngayGuiHoSo = (Date)attributes.get("ngayGuiHoSo");

		if (ngayGuiHoSo != null) {
			setNgayGuiHoSo(ngayGuiHoSo);
		}

		String tenDonViTiepNhan = (String)attributes.get("tenDonViTiepNhan");

		if (tenDonViTiepNhan != null) {
			setTenDonViTiepNhan(tenDonViTiepNhan);
		}
	}

	@JSON
	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;
	}

	@JSON
	@Override
	public long getPhieuXuLyChinhId() {
		return _phieuXuLyChinhId;
	}

	@Override
	public void setPhieuXuLyChinhId(long phieuXuLyChinhId) {
		_phieuXuLyChinhId = phieuXuLyChinhId;
	}

	@JSON
	@Override
	public String getTrichYeuNoiDung() {
		if (_trichYeuNoiDung == null) {
			return StringPool.BLANK;
		}
		else {
			return _trichYeuNoiDung;
		}
	}

	@Override
	public void setTrichYeuNoiDung(String trichYeuNoiDung) {
		_trichYeuNoiDung = trichYeuNoiDung;
	}

	@JSON
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
		_ghiChu = ghiChu;
	}

	@JSON
	@Override
	public long getTrangThaiHienTaiId() {
		return _trangThaiHienTaiId;
	}

	@Override
	public void setTrangThaiHienTaiId(long trangThaiHienTaiId) {
		_trangThaiHienTaiId = trangThaiHienTaiId;
	}

	@JSON
	@Override
	public long getNoiDungHoSoId() {
		return _noiDungHoSoId;
	}

	@Override
	public void setNoiDungHoSoId(long noiDungHoSoId) {
		_noiDungHoSoId = noiDungHoSoId;
	}

	@JSON
	@Override
	public long getChiemQuyenXuLy() {
		return _chiemQuyenXuLy;
	}

	@Override
	public void setChiemQuyenXuLy(long chiemQuyenXuLy) {
		_chiemQuyenXuLy = chiemQuyenXuLy;
	}

	@JSON
	@Override
	public Date getNgayTaoPhieu() {
		return _ngayTaoPhieu;
	}

	@Override
	public void setNgayTaoPhieu(Date ngayTaoPhieu) {
		_ngayTaoPhieu = ngayTaoPhieu;
	}

	@JSON
	@Override
	public long getNguoiTaoPhieu() {
		return _nguoiTaoPhieu;
	}

	@Override
	public void setNguoiTaoPhieu(long nguoiTaoPhieu) {
		_nguoiTaoPhieu = nguoiTaoPhieu;
	}

	@JSON
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

	@JSON
	@Override
	public long getPhanNhomHoSoId() {
		return _phanNhomHoSoId;
	}

	@Override
	public void setPhanNhomHoSoId(long phanNhomHoSoId) {
		_phanNhomHoSoId = phanNhomHoSoId;
	}

	@JSON
	@Override
	public String getMaSoHoSo() {
		if (_maSoHoSo == null) {
			return StringPool.BLANK;
		}
		else {
			return _maSoHoSo;
		}
	}

	@Override
	public void setMaSoHoSo(String maSoHoSo) {
		_maSoHoSo = maSoHoSo;
	}

	@JSON
	@Override
	public String getMaBienNhan() {
		if (_maBienNhan == null) {
			return StringPool.BLANK;
		}
		else {
			return _maBienNhan;
		}
	}

	@Override
	public void setMaBienNhan(String maBienNhan) {
		_maBienNhan = maBienNhan;
	}

	@JSON
	@Override
	public long getThuTucHanhChinhId() {
		return _thuTucHanhChinhId;
	}

	@Override
	public void setThuTucHanhChinhId(long thuTucHanhChinhId) {
		_thuTucHanhChinhId = thuTucHanhChinhId;
	}

	@JSON
	@Override
	public String getTenChuHoSo() {
		if (_tenChuHoSo == null) {
			return StringPool.BLANK;
		}
		else {
			return _tenChuHoSo;
		}
	}

	@Override
	public void setTenChuHoSo(String tenChuHoSo) {
		_tenChuHoSo = tenChuHoSo;
	}

	@JSON
	@Override
	public Date getNgayGuiHoSo() {
		return _ngayGuiHoSo;
	}

	@Override
	public void setNgayGuiHoSo(Date ngayGuiHoSo) {
		_ngayGuiHoSo = ngayGuiHoSo;
	}

	@JSON
	@Override
	public String getTenDonViTiepNhan() {
		if (_tenDonViTiepNhan == null) {
			return StringPool.BLANK;
		}
		else {
			return _tenDonViTiepNhan;
		}
	}

	@Override
	public void setTenDonViTiepNhan(String tenDonViTiepNhan) {
		_tenDonViTiepNhan = tenDonViTiepNhan;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			DaKiemTra.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public DaKiemTra toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DaKiemTra)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DaKiemTraImpl daKiemTraImpl = new DaKiemTraImpl();

		daKiemTraImpl.setId(getId());
		daKiemTraImpl.setPhieuXuLyChinhId(getPhieuXuLyChinhId());
		daKiemTraImpl.setTrichYeuNoiDung(getTrichYeuNoiDung());
		daKiemTraImpl.setGhiChu(getGhiChu());
		daKiemTraImpl.setTrangThaiHienTaiId(getTrangThaiHienTaiId());
		daKiemTraImpl.setNoiDungHoSoId(getNoiDungHoSoId());
		daKiemTraImpl.setChiemQuyenXuLy(getChiemQuyenXuLy());
		daKiemTraImpl.setNgayTaoPhieu(getNgayTaoPhieu());
		daKiemTraImpl.setNguoiTaoPhieu(getNguoiTaoPhieu());
		daKiemTraImpl.setNhomPhieuXuLy(getNhomPhieuXuLy());
		daKiemTraImpl.setPhanNhomHoSoId(getPhanNhomHoSoId());
		daKiemTraImpl.setMaSoHoSo(getMaSoHoSo());
		daKiemTraImpl.setMaBienNhan(getMaBienNhan());
		daKiemTraImpl.setThuTucHanhChinhId(getThuTucHanhChinhId());
		daKiemTraImpl.setTenChuHoSo(getTenChuHoSo());
		daKiemTraImpl.setNgayGuiHoSo(getNgayGuiHoSo());
		daKiemTraImpl.setTenDonViTiepNhan(getTenDonViTiepNhan());

		daKiemTraImpl.resetOriginalValues();

		return daKiemTraImpl;
	}

	@Override
	public int compareTo(DaKiemTra daKiemTra) {
		int value = 0;

		if (getId() < daKiemTra.getId()) {
			value = -1;
		}
		else if (getId() > daKiemTra.getId()) {
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

		if (!(obj instanceof DaKiemTra)) {
			return false;
		}

		DaKiemTra daKiemTra = (DaKiemTra)obj;

		long primaryKey = daKiemTra.getPrimaryKey();

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
	public CacheModel<DaKiemTra> toCacheModel() {
		DaKiemTraCacheModel daKiemTraCacheModel = new DaKiemTraCacheModel();

		daKiemTraCacheModel.id = getId();

		daKiemTraCacheModel.phieuXuLyChinhId = getPhieuXuLyChinhId();

		daKiemTraCacheModel.trichYeuNoiDung = getTrichYeuNoiDung();

		String trichYeuNoiDung = daKiemTraCacheModel.trichYeuNoiDung;

		if ((trichYeuNoiDung != null) && (trichYeuNoiDung.length() == 0)) {
			daKiemTraCacheModel.trichYeuNoiDung = null;
		}

		daKiemTraCacheModel.ghiChu = getGhiChu();

		String ghiChu = daKiemTraCacheModel.ghiChu;

		if ((ghiChu != null) && (ghiChu.length() == 0)) {
			daKiemTraCacheModel.ghiChu = null;
		}

		daKiemTraCacheModel.trangThaiHienTaiId = getTrangThaiHienTaiId();

		daKiemTraCacheModel.noiDungHoSoId = getNoiDungHoSoId();

		daKiemTraCacheModel.chiemQuyenXuLy = getChiemQuyenXuLy();

		Date ngayTaoPhieu = getNgayTaoPhieu();

		if (ngayTaoPhieu != null) {
			daKiemTraCacheModel.ngayTaoPhieu = ngayTaoPhieu.getTime();
		}
		else {
			daKiemTraCacheModel.ngayTaoPhieu = Long.MIN_VALUE;
		}

		daKiemTraCacheModel.nguoiTaoPhieu = getNguoiTaoPhieu();

		daKiemTraCacheModel.nhomPhieuXuLy = getNhomPhieuXuLy();

		String nhomPhieuXuLy = daKiemTraCacheModel.nhomPhieuXuLy;

		if ((nhomPhieuXuLy != null) && (nhomPhieuXuLy.length() == 0)) {
			daKiemTraCacheModel.nhomPhieuXuLy = null;
		}

		daKiemTraCacheModel.phanNhomHoSoId = getPhanNhomHoSoId();

		daKiemTraCacheModel.maSoHoSo = getMaSoHoSo();

		String maSoHoSo = daKiemTraCacheModel.maSoHoSo;

		if ((maSoHoSo != null) && (maSoHoSo.length() == 0)) {
			daKiemTraCacheModel.maSoHoSo = null;
		}

		daKiemTraCacheModel.maBienNhan = getMaBienNhan();

		String maBienNhan = daKiemTraCacheModel.maBienNhan;

		if ((maBienNhan != null) && (maBienNhan.length() == 0)) {
			daKiemTraCacheModel.maBienNhan = null;
		}

		daKiemTraCacheModel.thuTucHanhChinhId = getThuTucHanhChinhId();

		daKiemTraCacheModel.tenChuHoSo = getTenChuHoSo();

		String tenChuHoSo = daKiemTraCacheModel.tenChuHoSo;

		if ((tenChuHoSo != null) && (tenChuHoSo.length() == 0)) {
			daKiemTraCacheModel.tenChuHoSo = null;
		}

		Date ngayGuiHoSo = getNgayGuiHoSo();

		if (ngayGuiHoSo != null) {
			daKiemTraCacheModel.ngayGuiHoSo = ngayGuiHoSo.getTime();
		}
		else {
			daKiemTraCacheModel.ngayGuiHoSo = Long.MIN_VALUE;
		}

		daKiemTraCacheModel.tenDonViTiepNhan = getTenDonViTiepNhan();

		String tenDonViTiepNhan = daKiemTraCacheModel.tenDonViTiepNhan;

		if ((tenDonViTiepNhan != null) && (tenDonViTiepNhan.length() == 0)) {
			daKiemTraCacheModel.tenDonViTiepNhan = null;
		}

		return daKiemTraCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", phieuXuLyChinhId=");
		sb.append(getPhieuXuLyChinhId());
		sb.append(", trichYeuNoiDung=");
		sb.append(getTrichYeuNoiDung());
		sb.append(", ghiChu=");
		sb.append(getGhiChu());
		sb.append(", trangThaiHienTaiId=");
		sb.append(getTrangThaiHienTaiId());
		sb.append(", noiDungHoSoId=");
		sb.append(getNoiDungHoSoId());
		sb.append(", chiemQuyenXuLy=");
		sb.append(getChiemQuyenXuLy());
		sb.append(", ngayTaoPhieu=");
		sb.append(getNgayTaoPhieu());
		sb.append(", nguoiTaoPhieu=");
		sb.append(getNguoiTaoPhieu());
		sb.append(", nhomPhieuXuLy=");
		sb.append(getNhomPhieuXuLy());
		sb.append(", phanNhomHoSoId=");
		sb.append(getPhanNhomHoSoId());
		sb.append(", maSoHoSo=");
		sb.append(getMaSoHoSo());
		sb.append(", maBienNhan=");
		sb.append(getMaBienNhan());
		sb.append(", thuTucHanhChinhId=");
		sb.append(getThuTucHanhChinhId());
		sb.append(", tenChuHoSo=");
		sb.append(getTenChuHoSo());
		sb.append(", ngayGuiHoSo=");
		sb.append(getNgayGuiHoSo());
		sb.append(", tenDonViTiepNhan=");
		sb.append(getTenDonViTiepNhan());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.motcua.model.DaKiemTra");
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
			"<column><column-name>trichYeuNoiDung</column-name><column-value><![CDATA[");
		sb.append(getTrichYeuNoiDung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ghiChu</column-name><column-value><![CDATA[");
		sb.append(getGhiChu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThaiHienTaiId</column-name><column-value><![CDATA[");
		sb.append(getTrangThaiHienTaiId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>noiDungHoSoId</column-name><column-value><![CDATA[");
		sb.append(getNoiDungHoSoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chiemQuyenXuLy</column-name><column-value><![CDATA[");
		sb.append(getChiemQuyenXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayTaoPhieu</column-name><column-value><![CDATA[");
		sb.append(getNgayTaoPhieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiTaoPhieu</column-name><column-value><![CDATA[");
		sb.append(getNguoiTaoPhieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nhomPhieuXuLy</column-name><column-value><![CDATA[");
		sb.append(getNhomPhieuXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phanNhomHoSoId</column-name><column-value><![CDATA[");
		sb.append(getPhanNhomHoSoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maSoHoSo</column-name><column-value><![CDATA[");
		sb.append(getMaSoHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maBienNhan</column-name><column-value><![CDATA[");
		sb.append(getMaBienNhan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thuTucHanhChinhId</column-name><column-value><![CDATA[");
		sb.append(getThuTucHanhChinhId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenChuHoSo</column-name><column-value><![CDATA[");
		sb.append(getTenChuHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayGuiHoSo</column-name><column-value><![CDATA[");
		sb.append(getNgayGuiHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenDonViTiepNhan</column-name><column-value><![CDATA[");
		sb.append(getTenDonViTiepNhan());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = DaKiemTra.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DaKiemTra.class
		};
	private long _id;
	private long _phieuXuLyChinhId;
	private String _trichYeuNoiDung;
	private String _ghiChu;
	private long _trangThaiHienTaiId;
	private long _noiDungHoSoId;
	private long _chiemQuyenXuLy;
	private Date _ngayTaoPhieu;
	private long _nguoiTaoPhieu;
	private String _nhomPhieuXuLy;
	private long _phanNhomHoSoId;
	private String _maSoHoSo;
	private String _maBienNhan;
	private long _thuTucHanhChinhId;
	private String _tenChuHoSo;
	private Date _ngayGuiHoSo;
	private String _tenDonViTiepNhan;
	private DaKiemTra _escapedModel;
}