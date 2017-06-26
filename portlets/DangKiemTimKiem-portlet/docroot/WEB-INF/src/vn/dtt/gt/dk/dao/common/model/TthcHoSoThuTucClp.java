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
import vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class TthcHoSoThuTucClp extends BaseModelImpl<TthcHoSoThuTuc>
	implements TthcHoSoThuTuc {
	public TthcHoSoThuTucClp() {
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
	}

	@Override
	public long getId() {
		return _Id;
	}

	@Override
	public void setId(long Id) {
		_Id = Id;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, Id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaSoHoSo() {
		return _MaSoHoSo;
	}

	@Override
	public void setMaSoHoSo(String MaSoHoSo) {
		_MaSoHoSo = MaSoHoSo;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setMaSoHoSo", String.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, MaSoHoSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaBienNhan() {
		return _MaBienNhan;
	}

	@Override
	public void setMaBienNhan(String MaBienNhan) {
		_MaBienNhan = MaBienNhan;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setMaBienNhan", String.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, MaBienNhan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getThuTucHanhChinhId() {
		return _ThuTucHanhChinhId;
	}

	@Override
	public void setThuTucHanhChinhId(long ThuTucHanhChinhId) {
		_ThuTucHanhChinhId = ThuTucHanhChinhId;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setThuTucHanhChinhId",
						long.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, ThuTucHanhChinhId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getLoaiChuHoSo() {
		return _LoaiChuHoSo;
	}

	@Override
	public void setLoaiChuHoSo(long LoaiChuHoSo) {
		_LoaiChuHoSo = LoaiChuHoSo;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiChuHoSo", long.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, LoaiChuHoSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaSoChuHoSo() {
		return _MaSoChuHoSo;
	}

	@Override
	public void setMaSoChuHoSo(String MaSoChuHoSo) {
		_MaSoChuHoSo = MaSoChuHoSo;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setMaSoChuHoSo", String.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, MaSoChuHoSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenChuHoSo() {
		return _TenChuHoSo;
	}

	@Override
	public void setTenChuHoSo(String TenChuHoSo) {
		_TenChuHoSo = TenChuHoSo;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setTenChuHoSo", String.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, TenChuHoSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDiaChiChuHoSo() {
		return _DiaChiChuHoSo;
	}

	@Override
	public void setDiaChiChuHoSo(String DiaChiChuHoSo) {
		_DiaChiChuHoSo = DiaChiChuHoSo;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChiChuHoSo", String.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, DiaChiChuHoSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTrichYeuNoiDung() {
		return _TrichYeuNoiDung;
	}

	@Override
	public void setTrichYeuNoiDung(String TrichYeuNoiDung) {
		_TrichYeuNoiDung = TrichYeuNoiDung;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setTrichYeuNoiDung",
						String.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, TrichYeuNoiDung);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayGuiHoSo() {
		return _NgayGuiHoSo;
	}

	@Override
	public void setNgayGuiHoSo(Date NgayGuiHoSo) {
		_NgayGuiHoSo = NgayGuiHoSo;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayGuiHoSo", Date.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, NgayGuiHoSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayTiepNhan() {
		return _NgayTiepNhan;
	}

	@Override
	public void setNgayTiepNhan(Date NgayTiepNhan) {
		_NgayTiepNhan = NgayTiepNhan;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTiepNhan", Date.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, NgayTiepNhan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayBoSung() {
		return _NgayBoSung;
	}

	@Override
	public void setNgayBoSung(Date NgayBoSung) {
		_NgayBoSung = NgayBoSung;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayBoSung", Date.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, NgayBoSung);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayHenTra() {
		return _NgayHenTra;
	}

	@Override
	public void setNgayHenTra(Date NgayHenTra) {
		_NgayHenTra = NgayHenTra;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayHenTra", Date.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, NgayHenTra);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayTraKetQua() {
		return _NgayTraKetQua;
	}

	@Override
	public void setNgayTraKetQua(Date NgayTraKetQua) {
		_NgayTraKetQua = NgayTraKetQua;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTraKetQua", Date.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, NgayTraKetQua);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayDongHoSo() {
		return _NgayDongHoSo;
	}

	@Override
	public void setNgayDongHoSo(Date NgayDongHoSo) {
		_NgayDongHoSo = NgayDongHoSo;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayDongHoSo", Date.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, NgayDongHoSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTrangThaiHoSo() {
		return _TrangThaiHoSo;
	}

	@Override
	public void setTrangThaiHoSo(String TrangThaiHoSo) {
		_TrangThaiHoSo = TrangThaiHoSo;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThaiHoSo", String.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, TrangThaiHoSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPhanNhomHoSoId() {
		return _PhanNhomHoSoId;
	}

	@Override
	public void setPhanNhomHoSoId(long PhanNhomHoSoId) {
		_PhanNhomHoSoId = PhanNhomHoSoId;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setPhanNhomHoSoId", long.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, PhanNhomHoSoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaDonViTiepNhan() {
		return _MaDonViTiepNhan;
	}

	@Override
	public void setMaDonViTiepNhan(String MaDonViTiepNhan) {
		_MaDonViTiepNhan = MaDonViTiepNhan;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setMaDonViTiepNhan",
						String.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, MaDonViTiepNhan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenDonViTiepNhan() {
		return _TenDonViTiepNhan;
	}

	@Override
	public void setTenDonViTiepNhan(String TenDonViTiepNhan) {
		_TenDonViTiepNhan = TenDonViTiepNhan;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setTenDonViTiepNhan",
						String.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, TenDonViTiepNhan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getToChucQuanLy() {
		return _ToChucQuanLy;
	}

	@Override
	public void setToChucQuanLy(long ToChucQuanLy) {
		_ToChucQuanLy = ToChucQuanLy;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setToChucQuanLy", long.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, ToChucQuanLy);
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

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTao", Date.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, NgayTao);
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

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiTao", long.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, NguoiTao);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGhiChu() {
		return _ghiChu;
	}

	@Override
	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setGhiChu", String.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, ghiChu);
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

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setLanGuiCuoi", long.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, lanGuiCuoi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTthcHoSoThuTucRemoteModel() {
		return _tthcHoSoThuTucRemoteModel;
	}

	public void setTthcHoSoThuTucRemoteModel(
		BaseModel<?> tthcHoSoThuTucRemoteModel) {
		_tthcHoSoThuTucRemoteModel = tthcHoSoThuTucRemoteModel;
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

		Class<?> remoteModelClass = _tthcHoSoThuTucRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tthcHoSoThuTucRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TthcHoSoThuTucLocalServiceUtil.addTthcHoSoThuTuc(this);
		}
		else {
			TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(this);
		}
	}

	@Override
	public TthcHoSoThuTuc toEscapedModel() {
		return (TthcHoSoThuTuc)ProxyUtil.newProxyInstance(TthcHoSoThuTuc.class.getClassLoader(),
			new Class[] { TthcHoSoThuTuc.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TthcHoSoThuTucClp clone = new TthcHoSoThuTucClp();

		clone.setId(getId());
		clone.setMaSoHoSo(getMaSoHoSo());
		clone.setMaBienNhan(getMaBienNhan());
		clone.setThuTucHanhChinhId(getThuTucHanhChinhId());
		clone.setLoaiChuHoSo(getLoaiChuHoSo());
		clone.setMaSoChuHoSo(getMaSoChuHoSo());
		clone.setTenChuHoSo(getTenChuHoSo());
		clone.setDiaChiChuHoSo(getDiaChiChuHoSo());
		clone.setTrichYeuNoiDung(getTrichYeuNoiDung());
		clone.setNgayGuiHoSo(getNgayGuiHoSo());
		clone.setNgayTiepNhan(getNgayTiepNhan());
		clone.setNgayBoSung(getNgayBoSung());
		clone.setNgayHenTra(getNgayHenTra());
		clone.setNgayTraKetQua(getNgayTraKetQua());
		clone.setNgayDongHoSo(getNgayDongHoSo());
		clone.setTrangThaiHoSo(getTrangThaiHoSo());
		clone.setPhanNhomHoSoId(getPhanNhomHoSoId());
		clone.setMaDonViTiepNhan(getMaDonViTiepNhan());
		clone.setTenDonViTiepNhan(getTenDonViTiepNhan());
		clone.setToChucQuanLy(getToChucQuanLy());
		clone.setNgayTao(getNgayTao());
		clone.setNguoiTao(getNguoiTao());
		clone.setGhiChu(getGhiChu());
		clone.setLanGuiCuoi(getLanGuiCuoi());

		return clone;
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

		if (!(obj instanceof TthcHoSoThuTucClp)) {
			return false;
		}

		TthcHoSoThuTucClp tthcHoSoThuTuc = (TthcHoSoThuTucClp)obj;

		long primaryKey = tthcHoSoThuTuc.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(76);

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

		sb.append("</model>");

		return sb.toString();
	}

	private long _Id;
	private String _MaSoHoSo;
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
	private BaseModel<?> _tthcHoSoThuTucRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.gt.dk.dao.common.service.ClpSerializer.class;
}