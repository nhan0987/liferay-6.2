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

import vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTucModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the TthcHoSoThuTuc service. Represents a row in the &quot;tthc_hosothutuc&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTucModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TthcHoSoThuTucImpl}.
 * </p>
 *
 * @author win_64
 * @see TthcHoSoThuTucImpl
 * @see vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc
 * @see vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTucModel
 * @generated
 */
public class TthcHoSoThuTucModelImpl extends BaseModelImpl<TthcHoSoThuTuc>
	implements TthcHoSoThuTucModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tthc ho so thu tuc model instance should use the {@link vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc} interface instead.
	 */
	public static final String TABLE_NAME = "tthc_hosothutuc";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "masohoso", Types.VARCHAR },
			{ "mabiennhan", Types.VARCHAR },
			{ "thutuchanhchinhid", Types.BIGINT },
			{ "loaichuhoso", Types.BIGINT },
			{ "masochuhoso", Types.VARCHAR },
			{ "tenchuhoso", Types.VARCHAR },
			{ "diachichuhoso", Types.VARCHAR },
			{ "trichyeunoidung", Types.VARCHAR },
			{ "ngayguihoso", Types.TIMESTAMP },
			{ "ngaytiepnhan", Types.TIMESTAMP },
			{ "ngaybosung", Types.TIMESTAMP },
			{ "ngayhentra", Types.TIMESTAMP },
			{ "ngaytraketqua", Types.TIMESTAMP },
			{ "ngaydonghoso", Types.TIMESTAMP },
			{ "trangthaihoso", Types.VARCHAR },
			{ "phannhomhosoid", Types.BIGINT },
			{ "madonvitiepnhan", Types.VARCHAR },
			{ "tendonvitiepnhan", Types.VARCHAR },
			{ "tochucquanly", Types.BIGINT },
			{ "ngaytao", Types.TIMESTAMP },
			{ "nguoitao", Types.BIGINT },
			{ "GHICHU", Types.VARCHAR },
			{ "languicuoi", Types.BIGINT },
			{ "synchdate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table tthc_hosothutuc (id LONG not null primary key,masohoso VARCHAR(75) null,mabiennhan VARCHAR(75) null,thutuchanhchinhid LONG,loaichuhoso LONG,masochuhoso VARCHAR(75) null,tenchuhoso VARCHAR(75) null,diachichuhoso VARCHAR(75) null,trichyeunoidung VARCHAR(75) null,ngayguihoso DATE null,ngaytiepnhan DATE null,ngaybosung DATE null,ngayhentra DATE null,ngaytraketqua DATE null,ngaydonghoso DATE null,trangthaihoso VARCHAR(75) null,phannhomhosoid LONG,madonvitiepnhan VARCHAR(75) null,tendonvitiepnhan VARCHAR(75) null,tochucquanly LONG,ngaytao DATE null,nguoitao LONG,GHICHU VARCHAR(75) null,languicuoi LONG,synchdate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table tthc_hosothutuc";
	public static final String ORDER_BY_JPQL = " ORDER BY tthcHoSoThuTuc.Id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY tthc_hosothutuc.id ASC";
	public static final String DATA_SOURCE = "tthcDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc"),
			true);
	public static long MASOHOSO_COLUMN_BITMASK = 1L;
	public static long ID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc"));

	public TthcHoSoThuTucModelImpl() {
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
		return TthcHoSoThuTuc.class;
	}

	@Override
	public String getModelClassName() {
		return TthcHoSoThuTuc.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("MaSoHoSo", getMaSoHoSo());
		attributes.put("MaBienNhan", getMaBienNhan());
		attributes.put("ThuTucHanhChinhId", getThuTucHanhChinhId());
		attributes.put("LoaiChuHoSo", getLoaiChuHoSo());
		attributes.put("MaSoChuHoSo", getMaSoChuHoSo());
		attributes.put("TenChuHoSo", getTenChuHoSo());
		attributes.put("DiaChiChuHoSo", getDiaChiChuHoSo());
		attributes.put("TrichYeuNoiDung", getTrichYeuNoiDung());
		attributes.put("NgayGuiHoSo", getNgayGuiHoSo());
		attributes.put("NgayTiepNhan", getNgayTiepNhan());
		attributes.put("NgayBoSung", getNgayBoSung());
		attributes.put("NgayHenTra", getNgayHenTra());
		attributes.put("NgayTraKetQua", getNgayTraKetQua());
		attributes.put("NgayDongHoSo", getNgayDongHoSo());
		attributes.put("TrangThaiHoSo", getTrangThaiHoSo());
		attributes.put("PhanNhomHoSoId", getPhanNhomHoSoId());
		attributes.put("MaDonViTiepNhan", getMaDonViTiepNhan());
		attributes.put("TenDonViTiepNhan", getTenDonViTiepNhan());
		attributes.put("ToChucQuanLy", getToChucQuanLy());
		attributes.put("NgayTao", getNgayTao());
		attributes.put("NguoiTao", getNguoiTao());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("lanGuiCuoi", getLanGuiCuoi());
		attributes.put("SynchDate", getSynchDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String MaSoHoSo = (String)attributes.get("MaSoHoSo");

		if (MaSoHoSo != null) {
			setMaSoHoSo(MaSoHoSo);
		}

		String MaBienNhan = (String)attributes.get("MaBienNhan");

		if (MaBienNhan != null) {
			setMaBienNhan(MaBienNhan);
		}

		Long ThuTucHanhChinhId = (Long)attributes.get("ThuTucHanhChinhId");

		if (ThuTucHanhChinhId != null) {
			setThuTucHanhChinhId(ThuTucHanhChinhId);
		}

		Long LoaiChuHoSo = (Long)attributes.get("LoaiChuHoSo");

		if (LoaiChuHoSo != null) {
			setLoaiChuHoSo(LoaiChuHoSo);
		}

		String MaSoChuHoSo = (String)attributes.get("MaSoChuHoSo");

		if (MaSoChuHoSo != null) {
			setMaSoChuHoSo(MaSoChuHoSo);
		}

		String TenChuHoSo = (String)attributes.get("TenChuHoSo");

		if (TenChuHoSo != null) {
			setTenChuHoSo(TenChuHoSo);
		}

		String DiaChiChuHoSo = (String)attributes.get("DiaChiChuHoSo");

		if (DiaChiChuHoSo != null) {
			setDiaChiChuHoSo(DiaChiChuHoSo);
		}

		String TrichYeuNoiDung = (String)attributes.get("TrichYeuNoiDung");

		if (TrichYeuNoiDung != null) {
			setTrichYeuNoiDung(TrichYeuNoiDung);
		}

		Date NgayGuiHoSo = (Date)attributes.get("NgayGuiHoSo");

		if (NgayGuiHoSo != null) {
			setNgayGuiHoSo(NgayGuiHoSo);
		}

		Date NgayTiepNhan = (Date)attributes.get("NgayTiepNhan");

		if (NgayTiepNhan != null) {
			setNgayTiepNhan(NgayTiepNhan);
		}

		Date NgayBoSung = (Date)attributes.get("NgayBoSung");

		if (NgayBoSung != null) {
			setNgayBoSung(NgayBoSung);
		}

		Date NgayHenTra = (Date)attributes.get("NgayHenTra");

		if (NgayHenTra != null) {
			setNgayHenTra(NgayHenTra);
		}

		Date NgayTraKetQua = (Date)attributes.get("NgayTraKetQua");

		if (NgayTraKetQua != null) {
			setNgayTraKetQua(NgayTraKetQua);
		}

		Date NgayDongHoSo = (Date)attributes.get("NgayDongHoSo");

		if (NgayDongHoSo != null) {
			setNgayDongHoSo(NgayDongHoSo);
		}

		String TrangThaiHoSo = (String)attributes.get("TrangThaiHoSo");

		if (TrangThaiHoSo != null) {
			setTrangThaiHoSo(TrangThaiHoSo);
		}

		Long PhanNhomHoSoId = (Long)attributes.get("PhanNhomHoSoId");

		if (PhanNhomHoSoId != null) {
			setPhanNhomHoSoId(PhanNhomHoSoId);
		}

		String MaDonViTiepNhan = (String)attributes.get("MaDonViTiepNhan");

		if (MaDonViTiepNhan != null) {
			setMaDonViTiepNhan(MaDonViTiepNhan);
		}

		String TenDonViTiepNhan = (String)attributes.get("TenDonViTiepNhan");

		if (TenDonViTiepNhan != null) {
			setTenDonViTiepNhan(TenDonViTiepNhan);
		}

		Long ToChucQuanLy = (Long)attributes.get("ToChucQuanLy");

		if (ToChucQuanLy != null) {
			setToChucQuanLy(ToChucQuanLy);
		}

		Date NgayTao = (Date)attributes.get("NgayTao");

		if (NgayTao != null) {
			setNgayTao(NgayTao);
		}

		Long NguoiTao = (Long)attributes.get("NguoiTao");

		if (NguoiTao != null) {
			setNguoiTao(NguoiTao);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		Long lanGuiCuoi = (Long)attributes.get("lanGuiCuoi");

		if (lanGuiCuoi != null) {
			setLanGuiCuoi(lanGuiCuoi);
		}

		Date SynchDate = (Date)attributes.get("SynchDate");

		if (SynchDate != null) {
			setSynchDate(SynchDate);
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
	public String getMaSoHoSo() {
		if (_MaSoHoSo == null) {
			return StringPool.BLANK;
		}
		else {
			return _MaSoHoSo;
		}
	}

	@Override
	public void setMaSoHoSo(String MaSoHoSo) {
		_columnBitmask |= MASOHOSO_COLUMN_BITMASK;

		if (_originalMaSoHoSo == null) {
			_originalMaSoHoSo = _MaSoHoSo;
		}

		_MaSoHoSo = MaSoHoSo;
	}

	public String getOriginalMaSoHoSo() {
		return GetterUtil.getString(_originalMaSoHoSo);
	}

	@Override
	public String getMaBienNhan() {
		if (_MaBienNhan == null) {
			return StringPool.BLANK;
		}
		else {
			return _MaBienNhan;
		}
	}

	@Override
	public void setMaBienNhan(String MaBienNhan) {
		_MaBienNhan = MaBienNhan;
	}

	@Override
	public long getThuTucHanhChinhId() {
		return _ThuTucHanhChinhId;
	}

	@Override
	public void setThuTucHanhChinhId(long ThuTucHanhChinhId) {
		_ThuTucHanhChinhId = ThuTucHanhChinhId;
	}

	@Override
	public long getLoaiChuHoSo() {
		return _LoaiChuHoSo;
	}

	@Override
	public void setLoaiChuHoSo(long LoaiChuHoSo) {
		_LoaiChuHoSo = LoaiChuHoSo;
	}

	@Override
	public String getMaSoChuHoSo() {
		if (_MaSoChuHoSo == null) {
			return StringPool.BLANK;
		}
		else {
			return _MaSoChuHoSo;
		}
	}

	@Override
	public void setMaSoChuHoSo(String MaSoChuHoSo) {
		_MaSoChuHoSo = MaSoChuHoSo;
	}

	@Override
	public String getTenChuHoSo() {
		if (_TenChuHoSo == null) {
			return StringPool.BLANK;
		}
		else {
			return _TenChuHoSo;
		}
	}

	@Override
	public void setTenChuHoSo(String TenChuHoSo) {
		_TenChuHoSo = TenChuHoSo;
	}

	@Override
	public String getDiaChiChuHoSo() {
		if (_DiaChiChuHoSo == null) {
			return StringPool.BLANK;
		}
		else {
			return _DiaChiChuHoSo;
		}
	}

	@Override
	public void setDiaChiChuHoSo(String DiaChiChuHoSo) {
		_DiaChiChuHoSo = DiaChiChuHoSo;
	}

	@Override
	public String getTrichYeuNoiDung() {
		if (_TrichYeuNoiDung == null) {
			return StringPool.BLANK;
		}
		else {
			return _TrichYeuNoiDung;
		}
	}

	@Override
	public void setTrichYeuNoiDung(String TrichYeuNoiDung) {
		_TrichYeuNoiDung = TrichYeuNoiDung;
	}

	@Override
	public Date getNgayGuiHoSo() {
		return _NgayGuiHoSo;
	}

	@Override
	public void setNgayGuiHoSo(Date NgayGuiHoSo) {
		_NgayGuiHoSo = NgayGuiHoSo;
	}

	@Override
	public Date getNgayTiepNhan() {
		return _NgayTiepNhan;
	}

	@Override
	public void setNgayTiepNhan(Date NgayTiepNhan) {
		_NgayTiepNhan = NgayTiepNhan;
	}

	@Override
	public Date getNgayBoSung() {
		return _NgayBoSung;
	}

	@Override
	public void setNgayBoSung(Date NgayBoSung) {
		_NgayBoSung = NgayBoSung;
	}

	@Override
	public Date getNgayHenTra() {
		return _NgayHenTra;
	}

	@Override
	public void setNgayHenTra(Date NgayHenTra) {
		_NgayHenTra = NgayHenTra;
	}

	@Override
	public Date getNgayTraKetQua() {
		return _NgayTraKetQua;
	}

	@Override
	public void setNgayTraKetQua(Date NgayTraKetQua) {
		_NgayTraKetQua = NgayTraKetQua;
	}

	@Override
	public Date getNgayDongHoSo() {
		return _NgayDongHoSo;
	}

	@Override
	public void setNgayDongHoSo(Date NgayDongHoSo) {
		_NgayDongHoSo = NgayDongHoSo;
	}

	@Override
	public String getTrangThaiHoSo() {
		if (_TrangThaiHoSo == null) {
			return StringPool.BLANK;
		}
		else {
			return _TrangThaiHoSo;
		}
	}

	@Override
	public void setTrangThaiHoSo(String TrangThaiHoSo) {
		_TrangThaiHoSo = TrangThaiHoSo;
	}

	@Override
	public long getPhanNhomHoSoId() {
		return _PhanNhomHoSoId;
	}

	@Override
	public void setPhanNhomHoSoId(long PhanNhomHoSoId) {
		_PhanNhomHoSoId = PhanNhomHoSoId;
	}

	@Override
	public String getMaDonViTiepNhan() {
		if (_MaDonViTiepNhan == null) {
			return StringPool.BLANK;
		}
		else {
			return _MaDonViTiepNhan;
		}
	}

	@Override
	public void setMaDonViTiepNhan(String MaDonViTiepNhan) {
		_MaDonViTiepNhan = MaDonViTiepNhan;
	}

	@Override
	public String getTenDonViTiepNhan() {
		if (_TenDonViTiepNhan == null) {
			return StringPool.BLANK;
		}
		else {
			return _TenDonViTiepNhan;
		}
	}

	@Override
	public void setTenDonViTiepNhan(String TenDonViTiepNhan) {
		_TenDonViTiepNhan = TenDonViTiepNhan;
	}

	@Override
	public long getToChucQuanLy() {
		return _ToChucQuanLy;
	}

	@Override
	public void setToChucQuanLy(long ToChucQuanLy) {
		_ToChucQuanLy = ToChucQuanLy;
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

	@Override
	public long getLanGuiCuoi() {
		return _lanGuiCuoi;
	}

	@Override
	public void setLanGuiCuoi(long lanGuiCuoi) {
		_lanGuiCuoi = lanGuiCuoi;
	}

	@Override
	public Date getSynchDate() {
		return _SynchDate;
	}

	@Override
	public void setSynchDate(Date SynchDate) {
		_SynchDate = SynchDate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			TthcHoSoThuTuc.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TthcHoSoThuTuc toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TthcHoSoThuTuc)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TthcHoSoThuTucImpl tthcHoSoThuTucImpl = new TthcHoSoThuTucImpl();

		tthcHoSoThuTucImpl.setId(getId());
		tthcHoSoThuTucImpl.setMaSoHoSo(getMaSoHoSo());
		tthcHoSoThuTucImpl.setMaBienNhan(getMaBienNhan());
		tthcHoSoThuTucImpl.setThuTucHanhChinhId(getThuTucHanhChinhId());
		tthcHoSoThuTucImpl.setLoaiChuHoSo(getLoaiChuHoSo());
		tthcHoSoThuTucImpl.setMaSoChuHoSo(getMaSoChuHoSo());
		tthcHoSoThuTucImpl.setTenChuHoSo(getTenChuHoSo());
		tthcHoSoThuTucImpl.setDiaChiChuHoSo(getDiaChiChuHoSo());
		tthcHoSoThuTucImpl.setTrichYeuNoiDung(getTrichYeuNoiDung());
		tthcHoSoThuTucImpl.setNgayGuiHoSo(getNgayGuiHoSo());
		tthcHoSoThuTucImpl.setNgayTiepNhan(getNgayTiepNhan());
		tthcHoSoThuTucImpl.setNgayBoSung(getNgayBoSung());
		tthcHoSoThuTucImpl.setNgayHenTra(getNgayHenTra());
		tthcHoSoThuTucImpl.setNgayTraKetQua(getNgayTraKetQua());
		tthcHoSoThuTucImpl.setNgayDongHoSo(getNgayDongHoSo());
		tthcHoSoThuTucImpl.setTrangThaiHoSo(getTrangThaiHoSo());
		tthcHoSoThuTucImpl.setPhanNhomHoSoId(getPhanNhomHoSoId());
		tthcHoSoThuTucImpl.setMaDonViTiepNhan(getMaDonViTiepNhan());
		tthcHoSoThuTucImpl.setTenDonViTiepNhan(getTenDonViTiepNhan());
		tthcHoSoThuTucImpl.setToChucQuanLy(getToChucQuanLy());
		tthcHoSoThuTucImpl.setNgayTao(getNgayTao());
		tthcHoSoThuTucImpl.setNguoiTao(getNguoiTao());
		tthcHoSoThuTucImpl.setGhiChu(getGhiChu());
		tthcHoSoThuTucImpl.setLanGuiCuoi(getLanGuiCuoi());
		tthcHoSoThuTucImpl.setSynchDate(getSynchDate());

		tthcHoSoThuTucImpl.resetOriginalValues();

		return tthcHoSoThuTucImpl;
	}

	@Override
	public int compareTo(TthcHoSoThuTuc tthcHoSoThuTuc) {
		int value = 0;

		if (getId() < tthcHoSoThuTuc.getId()) {
			value = -1;
		}
		else if (getId() > tthcHoSoThuTuc.getId()) {
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

		if (!(obj instanceof TthcHoSoThuTuc)) {
			return false;
		}

		TthcHoSoThuTuc tthcHoSoThuTuc = (TthcHoSoThuTuc)obj;

		long primaryKey = tthcHoSoThuTuc.getPrimaryKey();

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
		TthcHoSoThuTucModelImpl tthcHoSoThuTucModelImpl = this;

		tthcHoSoThuTucModelImpl._originalMaSoHoSo = tthcHoSoThuTucModelImpl._MaSoHoSo;

		tthcHoSoThuTucModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<TthcHoSoThuTuc> toCacheModel() {
		TthcHoSoThuTucCacheModel tthcHoSoThuTucCacheModel = new TthcHoSoThuTucCacheModel();

		tthcHoSoThuTucCacheModel.Id = getId();

		tthcHoSoThuTucCacheModel.MaSoHoSo = getMaSoHoSo();

		String MaSoHoSo = tthcHoSoThuTucCacheModel.MaSoHoSo;

		if ((MaSoHoSo != null) && (MaSoHoSo.length() == 0)) {
			tthcHoSoThuTucCacheModel.MaSoHoSo = null;
		}

		tthcHoSoThuTucCacheModel.MaBienNhan = getMaBienNhan();

		String MaBienNhan = tthcHoSoThuTucCacheModel.MaBienNhan;

		if ((MaBienNhan != null) && (MaBienNhan.length() == 0)) {
			tthcHoSoThuTucCacheModel.MaBienNhan = null;
		}

		tthcHoSoThuTucCacheModel.ThuTucHanhChinhId = getThuTucHanhChinhId();

		tthcHoSoThuTucCacheModel.LoaiChuHoSo = getLoaiChuHoSo();

		tthcHoSoThuTucCacheModel.MaSoChuHoSo = getMaSoChuHoSo();

		String MaSoChuHoSo = tthcHoSoThuTucCacheModel.MaSoChuHoSo;

		if ((MaSoChuHoSo != null) && (MaSoChuHoSo.length() == 0)) {
			tthcHoSoThuTucCacheModel.MaSoChuHoSo = null;
		}

		tthcHoSoThuTucCacheModel.TenChuHoSo = getTenChuHoSo();

		String TenChuHoSo = tthcHoSoThuTucCacheModel.TenChuHoSo;

		if ((TenChuHoSo != null) && (TenChuHoSo.length() == 0)) {
			tthcHoSoThuTucCacheModel.TenChuHoSo = null;
		}

		tthcHoSoThuTucCacheModel.DiaChiChuHoSo = getDiaChiChuHoSo();

		String DiaChiChuHoSo = tthcHoSoThuTucCacheModel.DiaChiChuHoSo;

		if ((DiaChiChuHoSo != null) && (DiaChiChuHoSo.length() == 0)) {
			tthcHoSoThuTucCacheModel.DiaChiChuHoSo = null;
		}

		tthcHoSoThuTucCacheModel.TrichYeuNoiDung = getTrichYeuNoiDung();

		String TrichYeuNoiDung = tthcHoSoThuTucCacheModel.TrichYeuNoiDung;

		if ((TrichYeuNoiDung != null) && (TrichYeuNoiDung.length() == 0)) {
			tthcHoSoThuTucCacheModel.TrichYeuNoiDung = null;
		}

		Date NgayGuiHoSo = getNgayGuiHoSo();

		if (NgayGuiHoSo != null) {
			tthcHoSoThuTucCacheModel.NgayGuiHoSo = NgayGuiHoSo.getTime();
		}
		else {
			tthcHoSoThuTucCacheModel.NgayGuiHoSo = Long.MIN_VALUE;
		}

		Date NgayTiepNhan = getNgayTiepNhan();

		if (NgayTiepNhan != null) {
			tthcHoSoThuTucCacheModel.NgayTiepNhan = NgayTiepNhan.getTime();
		}
		else {
			tthcHoSoThuTucCacheModel.NgayTiepNhan = Long.MIN_VALUE;
		}

		Date NgayBoSung = getNgayBoSung();

		if (NgayBoSung != null) {
			tthcHoSoThuTucCacheModel.NgayBoSung = NgayBoSung.getTime();
		}
		else {
			tthcHoSoThuTucCacheModel.NgayBoSung = Long.MIN_VALUE;
		}

		Date NgayHenTra = getNgayHenTra();

		if (NgayHenTra != null) {
			tthcHoSoThuTucCacheModel.NgayHenTra = NgayHenTra.getTime();
		}
		else {
			tthcHoSoThuTucCacheModel.NgayHenTra = Long.MIN_VALUE;
		}

		Date NgayTraKetQua = getNgayTraKetQua();

		if (NgayTraKetQua != null) {
			tthcHoSoThuTucCacheModel.NgayTraKetQua = NgayTraKetQua.getTime();
		}
		else {
			tthcHoSoThuTucCacheModel.NgayTraKetQua = Long.MIN_VALUE;
		}

		Date NgayDongHoSo = getNgayDongHoSo();

		if (NgayDongHoSo != null) {
			tthcHoSoThuTucCacheModel.NgayDongHoSo = NgayDongHoSo.getTime();
		}
		else {
			tthcHoSoThuTucCacheModel.NgayDongHoSo = Long.MIN_VALUE;
		}

		tthcHoSoThuTucCacheModel.TrangThaiHoSo = getTrangThaiHoSo();

		String TrangThaiHoSo = tthcHoSoThuTucCacheModel.TrangThaiHoSo;

		if ((TrangThaiHoSo != null) && (TrangThaiHoSo.length() == 0)) {
			tthcHoSoThuTucCacheModel.TrangThaiHoSo = null;
		}

		tthcHoSoThuTucCacheModel.PhanNhomHoSoId = getPhanNhomHoSoId();

		tthcHoSoThuTucCacheModel.MaDonViTiepNhan = getMaDonViTiepNhan();

		String MaDonViTiepNhan = tthcHoSoThuTucCacheModel.MaDonViTiepNhan;

		if ((MaDonViTiepNhan != null) && (MaDonViTiepNhan.length() == 0)) {
			tthcHoSoThuTucCacheModel.MaDonViTiepNhan = null;
		}

		tthcHoSoThuTucCacheModel.TenDonViTiepNhan = getTenDonViTiepNhan();

		String TenDonViTiepNhan = tthcHoSoThuTucCacheModel.TenDonViTiepNhan;

		if ((TenDonViTiepNhan != null) && (TenDonViTiepNhan.length() == 0)) {
			tthcHoSoThuTucCacheModel.TenDonViTiepNhan = null;
		}

		tthcHoSoThuTucCacheModel.ToChucQuanLy = getToChucQuanLy();

		Date NgayTao = getNgayTao();

		if (NgayTao != null) {
			tthcHoSoThuTucCacheModel.NgayTao = NgayTao.getTime();
		}
		else {
			tthcHoSoThuTucCacheModel.NgayTao = Long.MIN_VALUE;
		}

		tthcHoSoThuTucCacheModel.NguoiTao = getNguoiTao();

		tthcHoSoThuTucCacheModel.ghiChu = getGhiChu();

		String ghiChu = tthcHoSoThuTucCacheModel.ghiChu;

		if ((ghiChu != null) && (ghiChu.length() == 0)) {
			tthcHoSoThuTucCacheModel.ghiChu = null;
		}

		tthcHoSoThuTucCacheModel.lanGuiCuoi = getLanGuiCuoi();

		Date SynchDate = getSynchDate();

		if (SynchDate != null) {
			tthcHoSoThuTucCacheModel.SynchDate = SynchDate.getTime();
		}
		else {
			tthcHoSoThuTucCacheModel.SynchDate = Long.MIN_VALUE;
		}

		return tthcHoSoThuTucCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(51);

		sb.append("{Id=");
		sb.append(getId());
		sb.append(", MaSoHoSo=");
		sb.append(getMaSoHoSo());
		sb.append(", MaBienNhan=");
		sb.append(getMaBienNhan());
		sb.append(", ThuTucHanhChinhId=");
		sb.append(getThuTucHanhChinhId());
		sb.append(", LoaiChuHoSo=");
		sb.append(getLoaiChuHoSo());
		sb.append(", MaSoChuHoSo=");
		sb.append(getMaSoChuHoSo());
		sb.append(", TenChuHoSo=");
		sb.append(getTenChuHoSo());
		sb.append(", DiaChiChuHoSo=");
		sb.append(getDiaChiChuHoSo());
		sb.append(", TrichYeuNoiDung=");
		sb.append(getTrichYeuNoiDung());
		sb.append(", NgayGuiHoSo=");
		sb.append(getNgayGuiHoSo());
		sb.append(", NgayTiepNhan=");
		sb.append(getNgayTiepNhan());
		sb.append(", NgayBoSung=");
		sb.append(getNgayBoSung());
		sb.append(", NgayHenTra=");
		sb.append(getNgayHenTra());
		sb.append(", NgayTraKetQua=");
		sb.append(getNgayTraKetQua());
		sb.append(", NgayDongHoSo=");
		sb.append(getNgayDongHoSo());
		sb.append(", TrangThaiHoSo=");
		sb.append(getTrangThaiHoSo());
		sb.append(", PhanNhomHoSoId=");
		sb.append(getPhanNhomHoSoId());
		sb.append(", MaDonViTiepNhan=");
		sb.append(getMaDonViTiepNhan());
		sb.append(", TenDonViTiepNhan=");
		sb.append(getTenDonViTiepNhan());
		sb.append(", ToChucQuanLy=");
		sb.append(getToChucQuanLy());
		sb.append(", NgayTao=");
		sb.append(getNgayTao());
		sb.append(", NguoiTao=");
		sb.append(getNguoiTao());
		sb.append(", ghiChu=");
		sb.append(getGhiChu());
		sb.append(", lanGuiCuoi=");
		sb.append(getLanGuiCuoi());
		sb.append(", SynchDate=");
		sb.append(getSynchDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(79);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MaSoHoSo</column-name><column-value><![CDATA[");
		sb.append(getMaSoHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MaBienNhan</column-name><column-value><![CDATA[");
		sb.append(getMaBienNhan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ThuTucHanhChinhId</column-name><column-value><![CDATA[");
		sb.append(getThuTucHanhChinhId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LoaiChuHoSo</column-name><column-value><![CDATA[");
		sb.append(getLoaiChuHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MaSoChuHoSo</column-name><column-value><![CDATA[");
		sb.append(getMaSoChuHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenChuHoSo</column-name><column-value><![CDATA[");
		sb.append(getTenChuHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DiaChiChuHoSo</column-name><column-value><![CDATA[");
		sb.append(getDiaChiChuHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TrichYeuNoiDung</column-name><column-value><![CDATA[");
		sb.append(getTrichYeuNoiDung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NgayGuiHoSo</column-name><column-value><![CDATA[");
		sb.append(getNgayGuiHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NgayTiepNhan</column-name><column-value><![CDATA[");
		sb.append(getNgayTiepNhan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NgayBoSung</column-name><column-value><![CDATA[");
		sb.append(getNgayBoSung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NgayHenTra</column-name><column-value><![CDATA[");
		sb.append(getNgayHenTra());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NgayTraKetQua</column-name><column-value><![CDATA[");
		sb.append(getNgayTraKetQua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NgayDongHoSo</column-name><column-value><![CDATA[");
		sb.append(getNgayDongHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TrangThaiHoSo</column-name><column-value><![CDATA[");
		sb.append(getTrangThaiHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PhanNhomHoSoId</column-name><column-value><![CDATA[");
		sb.append(getPhanNhomHoSoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MaDonViTiepNhan</column-name><column-value><![CDATA[");
		sb.append(getMaDonViTiepNhan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenDonViTiepNhan</column-name><column-value><![CDATA[");
		sb.append(getTenDonViTiepNhan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ToChucQuanLy</column-name><column-value><![CDATA[");
		sb.append(getToChucQuanLy());
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
			"<column><column-name>ghiChu</column-name><column-value><![CDATA[");
		sb.append(getGhiChu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lanGuiCuoi</column-name><column-value><![CDATA[");
		sb.append(getLanGuiCuoi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SynchDate</column-name><column-value><![CDATA[");
		sb.append(getSynchDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = TthcHoSoThuTuc.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			TthcHoSoThuTuc.class
		};
	private long _Id;
	private String _MaSoHoSo;
	private String _originalMaSoHoSo;
	private String _MaBienNhan;
	private long _ThuTucHanhChinhId;
	private long _LoaiChuHoSo;
	private String _MaSoChuHoSo;
	private String _TenChuHoSo;
	private String _DiaChiChuHoSo;
	private String _TrichYeuNoiDung;
	private Date _NgayGuiHoSo;
	private Date _NgayTiepNhan;
	private Date _NgayBoSung;
	private Date _NgayHenTra;
	private Date _NgayTraKetQua;
	private Date _NgayDongHoSo;
	private String _TrangThaiHoSo;
	private long _PhanNhomHoSoId;
	private String _MaDonViTiepNhan;
	private String _TenDonViTiepNhan;
	private long _ToChucQuanLy;
	private Date _NgayTao;
	private long _NguoiTao;
	private String _ghiChu;
	private long _lanGuiCuoi;
	private Date _SynchDate;
	private long _columnBitmask;
	private TthcHoSoThuTuc _escapedModel;
}