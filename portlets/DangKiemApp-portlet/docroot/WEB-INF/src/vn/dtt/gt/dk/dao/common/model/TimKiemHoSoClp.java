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
import vn.dtt.gt.dk.dao.common.service.TimKiemHoSoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class TimKiemHoSoClp extends BaseModelImpl<TimKiemHoSo>
	implements TimKiemHoSo {
	public TimKiemHoSoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TimKiemHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return TimKiemHoSo.class.getName();
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
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("maSoHoSo", getMaSoHoSo());
		attributes.put("maBienNhan", getMaBienNhan());
		attributes.put("thuTucHanhChinhId", getThuTucHanhChinhId());
		attributes.put("loaiChuHoSo", getLoaiChuHoSo());
		attributes.put("maSoChuHoSo", getMaSoChuHoSo());
		attributes.put("tenChuHoSo", getTenChuHoSo());
		attributes.put("diaChiChuHoSo", getDiaChiChuHoSo());
		attributes.put("trichYeuNoiDung", getTrichYeuNoiDung());
		attributes.put("ngayGuiHoSo", getNgayGuiHoSo());
		attributes.put("ngayTiepNhan", getNgayTiepNhan());
		attributes.put("ngayBoSung", getNgayBoSung());
		attributes.put("ngayHenTra", getNgayHenTra());
		attributes.put("ngayTraKetQua", getNgayTraKetQua());
		attributes.put("ngayDongHoSo", getNgayDongHoSo());
		attributes.put("trangThaiHoSo", getTrangThaiHoSo());
		attributes.put("phanNhomHoSoId", getPhanNhomHoSoId());
		attributes.put("maDonViTiepNhan", getMaDonViTiepNhan());
		attributes.put("tenDonViTiepNhan", getTenDonViTiepNhan());
		attributes.put("toChucQuanLy", getToChucQuanLy());
		attributes.put("ngayTao", getNgayTao());
		attributes.put("nguoiTao", getNguoiTao());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("lanGuiCuoi", getLanGuiCuoi());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
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

		Long loaiChuHoSo = (Long)attributes.get("loaiChuHoSo");

		if (loaiChuHoSo != null) {
			setLoaiChuHoSo(loaiChuHoSo);
		}

		String maSoChuHoSo = (String)attributes.get("maSoChuHoSo");

		if (maSoChuHoSo != null) {
			setMaSoChuHoSo(maSoChuHoSo);
		}

		String tenChuHoSo = (String)attributes.get("tenChuHoSo");

		if (tenChuHoSo != null) {
			setTenChuHoSo(tenChuHoSo);
		}

		String diaChiChuHoSo = (String)attributes.get("diaChiChuHoSo");

		if (diaChiChuHoSo != null) {
			setDiaChiChuHoSo(diaChiChuHoSo);
		}

		String trichYeuNoiDung = (String)attributes.get("trichYeuNoiDung");

		if (trichYeuNoiDung != null) {
			setTrichYeuNoiDung(trichYeuNoiDung);
		}

		Date ngayGuiHoSo = (Date)attributes.get("ngayGuiHoSo");

		if (ngayGuiHoSo != null) {
			setNgayGuiHoSo(ngayGuiHoSo);
		}

		Date ngayTiepNhan = (Date)attributes.get("ngayTiepNhan");

		if (ngayTiepNhan != null) {
			setNgayTiepNhan(ngayTiepNhan);
		}

		Date ngayBoSung = (Date)attributes.get("ngayBoSung");

		if (ngayBoSung != null) {
			setNgayBoSung(ngayBoSung);
		}

		Date ngayHenTra = (Date)attributes.get("ngayHenTra");

		if (ngayHenTra != null) {
			setNgayHenTra(ngayHenTra);
		}

		Date ngayTraKetQua = (Date)attributes.get("ngayTraKetQua");

		if (ngayTraKetQua != null) {
			setNgayTraKetQua(ngayTraKetQua);
		}

		Date ngayDongHoSo = (Date)attributes.get("ngayDongHoSo");

		if (ngayDongHoSo != null) {
			setNgayDongHoSo(ngayDongHoSo);
		}

		String trangThaiHoSo = (String)attributes.get("trangThaiHoSo");

		if (trangThaiHoSo != null) {
			setTrangThaiHoSo(trangThaiHoSo);
		}

		Long phanNhomHoSoId = (Long)attributes.get("phanNhomHoSoId");

		if (phanNhomHoSoId != null) {
			setPhanNhomHoSoId(phanNhomHoSoId);
		}

		String maDonViTiepNhan = (String)attributes.get("maDonViTiepNhan");

		if (maDonViTiepNhan != null) {
			setMaDonViTiepNhan(maDonViTiepNhan);
		}

		String tenDonViTiepNhan = (String)attributes.get("tenDonViTiepNhan");

		if (tenDonViTiepNhan != null) {
			setTenDonViTiepNhan(tenDonViTiepNhan);
		}

		Long toChucQuanLy = (Long)attributes.get("toChucQuanLy");

		if (toChucQuanLy != null) {
			setToChucQuanLy(toChucQuanLy);
		}

		Date ngayTao = (Date)attributes.get("ngayTao");

		if (ngayTao != null) {
			setNgayTao(ngayTao);
		}

		Long nguoiTao = (Long)attributes.get("nguoiTao");

		if (nguoiTao != null) {
			setNguoiTao(nguoiTao);
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
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_timKiemHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _timKiemHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_timKiemHoSoRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaSoHoSo() {
		return _maSoHoSo;
	}

	@Override
	public void setMaSoHoSo(String maSoHoSo) {
		_maSoHoSo = maSoHoSo;

		if (_timKiemHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _timKiemHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setMaSoHoSo", String.class);

				method.invoke(_timKiemHoSoRemoteModel, maSoHoSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaBienNhan() {
		return _maBienNhan;
	}

	@Override
	public void setMaBienNhan(String maBienNhan) {
		_maBienNhan = maBienNhan;

		if (_timKiemHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _timKiemHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setMaBienNhan", String.class);

				method.invoke(_timKiemHoSoRemoteModel, maBienNhan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getThuTucHanhChinhId() {
		return _thuTucHanhChinhId;
	}

	@Override
	public void setThuTucHanhChinhId(long thuTucHanhChinhId) {
		_thuTucHanhChinhId = thuTucHanhChinhId;

		if (_timKiemHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _timKiemHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setThuTucHanhChinhId",
						long.class);

				method.invoke(_timKiemHoSoRemoteModel, thuTucHanhChinhId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getLoaiChuHoSo() {
		return _loaiChuHoSo;
	}

	@Override
	public void setLoaiChuHoSo(long loaiChuHoSo) {
		_loaiChuHoSo = loaiChuHoSo;

		if (_timKiemHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _timKiemHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiChuHoSo", long.class);

				method.invoke(_timKiemHoSoRemoteModel, loaiChuHoSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaSoChuHoSo() {
		return _maSoChuHoSo;
	}

	@Override
	public void setMaSoChuHoSo(String maSoChuHoSo) {
		_maSoChuHoSo = maSoChuHoSo;

		if (_timKiemHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _timKiemHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setMaSoChuHoSo", String.class);

				method.invoke(_timKiemHoSoRemoteModel, maSoChuHoSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenChuHoSo() {
		return _tenChuHoSo;
	}

	@Override
	public void setTenChuHoSo(String tenChuHoSo) {
		_tenChuHoSo = tenChuHoSo;

		if (_timKiemHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _timKiemHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setTenChuHoSo", String.class);

				method.invoke(_timKiemHoSoRemoteModel, tenChuHoSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDiaChiChuHoSo() {
		return _diaChiChuHoSo;
	}

	@Override
	public void setDiaChiChuHoSo(String diaChiChuHoSo) {
		_diaChiChuHoSo = diaChiChuHoSo;

		if (_timKiemHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _timKiemHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChiChuHoSo", String.class);

				method.invoke(_timKiemHoSoRemoteModel, diaChiChuHoSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTrichYeuNoiDung() {
		return _trichYeuNoiDung;
	}

	@Override
	public void setTrichYeuNoiDung(String trichYeuNoiDung) {
		_trichYeuNoiDung = trichYeuNoiDung;

		if (_timKiemHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _timKiemHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setTrichYeuNoiDung",
						String.class);

				method.invoke(_timKiemHoSoRemoteModel, trichYeuNoiDung);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayGuiHoSo() {
		return _ngayGuiHoSo;
	}

	@Override
	public void setNgayGuiHoSo(Date ngayGuiHoSo) {
		_ngayGuiHoSo = ngayGuiHoSo;

		if (_timKiemHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _timKiemHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayGuiHoSo", Date.class);

				method.invoke(_timKiemHoSoRemoteModel, ngayGuiHoSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayTiepNhan() {
		return _ngayTiepNhan;
	}

	@Override
	public void setNgayTiepNhan(Date ngayTiepNhan) {
		_ngayTiepNhan = ngayTiepNhan;

		if (_timKiemHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _timKiemHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTiepNhan", Date.class);

				method.invoke(_timKiemHoSoRemoteModel, ngayTiepNhan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayBoSung() {
		return _ngayBoSung;
	}

	@Override
	public void setNgayBoSung(Date ngayBoSung) {
		_ngayBoSung = ngayBoSung;

		if (_timKiemHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _timKiemHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayBoSung", Date.class);

				method.invoke(_timKiemHoSoRemoteModel, ngayBoSung);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayHenTra() {
		return _ngayHenTra;
	}

	@Override
	public void setNgayHenTra(Date ngayHenTra) {
		_ngayHenTra = ngayHenTra;

		if (_timKiemHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _timKiemHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayHenTra", Date.class);

				method.invoke(_timKiemHoSoRemoteModel, ngayHenTra);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayTraKetQua() {
		return _ngayTraKetQua;
	}

	@Override
	public void setNgayTraKetQua(Date ngayTraKetQua) {
		_ngayTraKetQua = ngayTraKetQua;

		if (_timKiemHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _timKiemHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTraKetQua", Date.class);

				method.invoke(_timKiemHoSoRemoteModel, ngayTraKetQua);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayDongHoSo() {
		return _ngayDongHoSo;
	}

	@Override
	public void setNgayDongHoSo(Date ngayDongHoSo) {
		_ngayDongHoSo = ngayDongHoSo;

		if (_timKiemHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _timKiemHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayDongHoSo", Date.class);

				method.invoke(_timKiemHoSoRemoteModel, ngayDongHoSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTrangThaiHoSo() {
		return _trangThaiHoSo;
	}

	@Override
	public void setTrangThaiHoSo(String trangThaiHoSo) {
		_trangThaiHoSo = trangThaiHoSo;

		if (_timKiemHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _timKiemHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThaiHoSo", String.class);

				method.invoke(_timKiemHoSoRemoteModel, trangThaiHoSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPhanNhomHoSoId() {
		return _phanNhomHoSoId;
	}

	@Override
	public void setPhanNhomHoSoId(long phanNhomHoSoId) {
		_phanNhomHoSoId = phanNhomHoSoId;

		if (_timKiemHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _timKiemHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setPhanNhomHoSoId", long.class);

				method.invoke(_timKiemHoSoRemoteModel, phanNhomHoSoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaDonViTiepNhan() {
		return _maDonViTiepNhan;
	}

	@Override
	public void setMaDonViTiepNhan(String maDonViTiepNhan) {
		_maDonViTiepNhan = maDonViTiepNhan;

		if (_timKiemHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _timKiemHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setMaDonViTiepNhan",
						String.class);

				method.invoke(_timKiemHoSoRemoteModel, maDonViTiepNhan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenDonViTiepNhan() {
		return _tenDonViTiepNhan;
	}

	@Override
	public void setTenDonViTiepNhan(String tenDonViTiepNhan) {
		_tenDonViTiepNhan = tenDonViTiepNhan;

		if (_timKiemHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _timKiemHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setTenDonViTiepNhan",
						String.class);

				method.invoke(_timKiemHoSoRemoteModel, tenDonViTiepNhan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getToChucQuanLy() {
		return _toChucQuanLy;
	}

	@Override
	public void setToChucQuanLy(long toChucQuanLy) {
		_toChucQuanLy = toChucQuanLy;

		if (_timKiemHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _timKiemHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setToChucQuanLy", long.class);

				method.invoke(_timKiemHoSoRemoteModel, toChucQuanLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayTao() {
		return _ngayTao;
	}

	@Override
	public void setNgayTao(Date ngayTao) {
		_ngayTao = ngayTao;

		if (_timKiemHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _timKiemHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTao", Date.class);

				method.invoke(_timKiemHoSoRemoteModel, ngayTao);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNguoiTao() {
		return _nguoiTao;
	}

	@Override
	public void setNguoiTao(long nguoiTao) {
		_nguoiTao = nguoiTao;

		if (_timKiemHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _timKiemHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiTao", long.class);

				method.invoke(_timKiemHoSoRemoteModel, nguoiTao);
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

		if (_timKiemHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _timKiemHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setGhiChu", String.class);

				method.invoke(_timKiemHoSoRemoteModel, ghiChu);
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

		if (_timKiemHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _timKiemHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setLanGuiCuoi", long.class);

				method.invoke(_timKiemHoSoRemoteModel, lanGuiCuoi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTimKiemHoSoRemoteModel() {
		return _timKiemHoSoRemoteModel;
	}

	public void setTimKiemHoSoRemoteModel(BaseModel<?> timKiemHoSoRemoteModel) {
		_timKiemHoSoRemoteModel = timKiemHoSoRemoteModel;
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

		Class<?> remoteModelClass = _timKiemHoSoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_timKiemHoSoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TimKiemHoSoLocalServiceUtil.addTimKiemHoSo(this);
		}
		else {
			TimKiemHoSoLocalServiceUtil.updateTimKiemHoSo(this);
		}
	}

	@Override
	public TimKiemHoSo toEscapedModel() {
		return (TimKiemHoSo)ProxyUtil.newProxyInstance(TimKiemHoSo.class.getClassLoader(),
			new Class[] { TimKiemHoSo.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TimKiemHoSoClp clone = new TimKiemHoSoClp();

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
	public int compareTo(TimKiemHoSo timKiemHoSo) {
		int value = 0;

		if (getId() < timKiemHoSo.getId()) {
			value = -1;
		}
		else if (getId() > timKiemHoSo.getId()) {
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

		if (!(obj instanceof TimKiemHoSoClp)) {
			return false;
		}

		TimKiemHoSoClp timKiemHoSo = (TimKiemHoSoClp)obj;

		long primaryKey = timKiemHoSo.getPrimaryKey();

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

		sb.append("{id=");
		sb.append(getId());
		sb.append(", maSoHoSo=");
		sb.append(getMaSoHoSo());
		sb.append(", maBienNhan=");
		sb.append(getMaBienNhan());
		sb.append(", thuTucHanhChinhId=");
		sb.append(getThuTucHanhChinhId());
		sb.append(", loaiChuHoSo=");
		sb.append(getLoaiChuHoSo());
		sb.append(", maSoChuHoSo=");
		sb.append(getMaSoChuHoSo());
		sb.append(", tenChuHoSo=");
		sb.append(getTenChuHoSo());
		sb.append(", diaChiChuHoSo=");
		sb.append(getDiaChiChuHoSo());
		sb.append(", trichYeuNoiDung=");
		sb.append(getTrichYeuNoiDung());
		sb.append(", ngayGuiHoSo=");
		sb.append(getNgayGuiHoSo());
		sb.append(", ngayTiepNhan=");
		sb.append(getNgayTiepNhan());
		sb.append(", ngayBoSung=");
		sb.append(getNgayBoSung());
		sb.append(", ngayHenTra=");
		sb.append(getNgayHenTra());
		sb.append(", ngayTraKetQua=");
		sb.append(getNgayTraKetQua());
		sb.append(", ngayDongHoSo=");
		sb.append(getNgayDongHoSo());
		sb.append(", trangThaiHoSo=");
		sb.append(getTrangThaiHoSo());
		sb.append(", phanNhomHoSoId=");
		sb.append(getPhanNhomHoSoId());
		sb.append(", maDonViTiepNhan=");
		sb.append(getMaDonViTiepNhan());
		sb.append(", tenDonViTiepNhan=");
		sb.append(getTenDonViTiepNhan());
		sb.append(", toChucQuanLy=");
		sb.append(getToChucQuanLy());
		sb.append(", ngayTao=");
		sb.append(getNgayTao());
		sb.append(", nguoiTao=");
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
		sb.append("vn.dtt.gt.dk.dao.common.model.TimKiemHoSo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
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
			"<column><column-name>loaiChuHoSo</column-name><column-value><![CDATA[");
		sb.append(getLoaiChuHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maSoChuHoSo</column-name><column-value><![CDATA[");
		sb.append(getMaSoChuHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenChuHoSo</column-name><column-value><![CDATA[");
		sb.append(getTenChuHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>diaChiChuHoSo</column-name><column-value><![CDATA[");
		sb.append(getDiaChiChuHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trichYeuNoiDung</column-name><column-value><![CDATA[");
		sb.append(getTrichYeuNoiDung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayGuiHoSo</column-name><column-value><![CDATA[");
		sb.append(getNgayGuiHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayTiepNhan</column-name><column-value><![CDATA[");
		sb.append(getNgayTiepNhan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayBoSung</column-name><column-value><![CDATA[");
		sb.append(getNgayBoSung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayHenTra</column-name><column-value><![CDATA[");
		sb.append(getNgayHenTra());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayTraKetQua</column-name><column-value><![CDATA[");
		sb.append(getNgayTraKetQua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayDongHoSo</column-name><column-value><![CDATA[");
		sb.append(getNgayDongHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThaiHoSo</column-name><column-value><![CDATA[");
		sb.append(getTrangThaiHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phanNhomHoSoId</column-name><column-value><![CDATA[");
		sb.append(getPhanNhomHoSoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maDonViTiepNhan</column-name><column-value><![CDATA[");
		sb.append(getMaDonViTiepNhan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenDonViTiepNhan</column-name><column-value><![CDATA[");
		sb.append(getTenDonViTiepNhan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toChucQuanLy</column-name><column-value><![CDATA[");
		sb.append(getToChucQuanLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayTao</column-name><column-value><![CDATA[");
		sb.append(getNgayTao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiTao</column-name><column-value><![CDATA[");
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

	private long _id;
	private String _maSoHoSo;
	private String _maBienNhan;
	private long _thuTucHanhChinhId;
	private long _loaiChuHoSo;
	private String _maSoChuHoSo;
	private String _tenChuHoSo;
	private String _diaChiChuHoSo;
	private String _trichYeuNoiDung;
	private Date _ngayGuiHoSo;
	private Date _ngayTiepNhan;
	private Date _ngayBoSung;
	private Date _ngayHenTra;
	private Date _ngayTraKetQua;
	private Date _ngayDongHoSo;
	private String _trangThaiHoSo;
	private long _phanNhomHoSoId;
	private String _maDonViTiepNhan;
	private String _tenDonViTiepNhan;
	private long _toChucQuanLy;
	private Date _ngayTao;
	private long _nguoiTao;
	private String _ghiChu;
	private long _lanGuiCuoi;
	private BaseModel<?> _timKiemHoSoRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.gt.dk.dao.common.service.ClpSerializer.class;
}