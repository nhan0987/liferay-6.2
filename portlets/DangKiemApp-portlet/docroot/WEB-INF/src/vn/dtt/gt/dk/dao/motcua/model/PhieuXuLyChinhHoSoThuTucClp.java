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

package vn.dtt.gt.dk.dao.motcua.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.gt.dk.dao.motcua.service.ClpSerializer;
import vn.dtt.gt.dk.dao.motcua.service.PhieuXuLyChinhHoSoThuTucLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class PhieuXuLyChinhHoSoThuTucClp extends BaseModelImpl<PhieuXuLyChinhHoSoThuTuc>
	implements PhieuXuLyChinhHoSoThuTuc {
	public PhieuXuLyChinhHoSoThuTucClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return PhieuXuLyChinhHoSoThuTuc.class;
	}

	@Override
	public String getModelClassName() {
		return PhieuXuLyChinhHoSoThuTuc.class.getName();
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
		attributes.put("hoSoThuTucId", getHoSoThuTucId());
		attributes.put("quyTrinhThuTucId", getQuyTrinhThuTucId());
		attributes.put("tenNguoiNop", getTenNguoiNop());
		attributes.put("cmndNguoiNop", getCmndNguoiNop());
		attributes.put("diaChiNguoiNop", getDiaChiNguoiNop());
		attributes.put("soDtddNguoiNop", getSoDtddNguoiNop());
		attributes.put("emailNguoiNop", getEmailNguoiNop());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("trangThaiHienTaiId", getTrangThaiHienTaiId());
		attributes.put("hetHoSoCon", getHetHoSoCon());
		attributes.put("chiemQuyenXuLy", getChiemQuyenXuLy());
		attributes.put("ngayTaoPhieu", getNgayTaoPhieu());
		attributes.put("nguoiTaoPhieu", getNguoiTaoPhieu());
		attributes.put("soDtcdNguoiNop", getSoDtcdNguoiNop());
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

		Long hoSoThuTucId = (Long)attributes.get("hoSoThuTucId");

		if (hoSoThuTucId != null) {
			setHoSoThuTucId(hoSoThuTucId);
		}

		Long quyTrinhThuTucId = (Long)attributes.get("quyTrinhThuTucId");

		if (quyTrinhThuTucId != null) {
			setQuyTrinhThuTucId(quyTrinhThuTucId);
		}

		String tenNguoiNop = (String)attributes.get("tenNguoiNop");

		if (tenNguoiNop != null) {
			setTenNguoiNop(tenNguoiNop);
		}

		String cmndNguoiNop = (String)attributes.get("cmndNguoiNop");

		if (cmndNguoiNop != null) {
			setCmndNguoiNop(cmndNguoiNop);
		}

		String diaChiNguoiNop = (String)attributes.get("diaChiNguoiNop");

		if (diaChiNguoiNop != null) {
			setDiaChiNguoiNop(diaChiNguoiNop);
		}

		String soDtddNguoiNop = (String)attributes.get("soDtddNguoiNop");

		if (soDtddNguoiNop != null) {
			setSoDtddNguoiNop(soDtddNguoiNop);
		}

		String emailNguoiNop = (String)attributes.get("emailNguoiNop");

		if (emailNguoiNop != null) {
			setEmailNguoiNop(emailNguoiNop);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		Long trangThaiHienTaiId = (Long)attributes.get("trangThaiHienTaiId");

		if (trangThaiHienTaiId != null) {
			setTrangThaiHienTaiId(trangThaiHienTaiId);
		}

		Long hetHoSoCon = (Long)attributes.get("hetHoSoCon");

		if (hetHoSoCon != null) {
			setHetHoSoCon(hetHoSoCon);
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

		String soDtcdNguoiNop = (String)attributes.get("soDtcdNguoiNop");

		if (soDtcdNguoiNop != null) {
			setSoDtcdNguoiNop(soDtcdNguoiNop);
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

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_phieuXuLyChinhHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _phieuXuLyChinhHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_phieuXuLyChinhHoSoThuTucRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getHoSoThuTucId() {
		return _hoSoThuTucId;
	}

	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_hoSoThuTucId = hoSoThuTucId;

		if (_phieuXuLyChinhHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _phieuXuLyChinhHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setHoSoThuTucId", long.class);

				method.invoke(_phieuXuLyChinhHoSoThuTucRemoteModel, hoSoThuTucId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getQuyTrinhThuTucId() {
		return _quyTrinhThuTucId;
	}

	@Override
	public void setQuyTrinhThuTucId(long quyTrinhThuTucId) {
		_quyTrinhThuTucId = quyTrinhThuTucId;

		if (_phieuXuLyChinhHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _phieuXuLyChinhHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setQuyTrinhThuTucId",
						long.class);

				method.invoke(_phieuXuLyChinhHoSoThuTucRemoteModel,
					quyTrinhThuTucId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenNguoiNop() {
		return _tenNguoiNop;
	}

	@Override
	public void setTenNguoiNop(String tenNguoiNop) {
		_tenNguoiNop = tenNguoiNop;

		if (_phieuXuLyChinhHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _phieuXuLyChinhHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setTenNguoiNop", String.class);

				method.invoke(_phieuXuLyChinhHoSoThuTucRemoteModel, tenNguoiNop);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCmndNguoiNop() {
		return _cmndNguoiNop;
	}

	@Override
	public void setCmndNguoiNop(String cmndNguoiNop) {
		_cmndNguoiNop = cmndNguoiNop;

		if (_phieuXuLyChinhHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _phieuXuLyChinhHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setCmndNguoiNop", String.class);

				method.invoke(_phieuXuLyChinhHoSoThuTucRemoteModel, cmndNguoiNop);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDiaChiNguoiNop() {
		return _diaChiNguoiNop;
	}

	@Override
	public void setDiaChiNguoiNop(String diaChiNguoiNop) {
		_diaChiNguoiNop = diaChiNguoiNop;

		if (_phieuXuLyChinhHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _phieuXuLyChinhHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChiNguoiNop",
						String.class);

				method.invoke(_phieuXuLyChinhHoSoThuTucRemoteModel,
					diaChiNguoiNop);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoDtddNguoiNop() {
		return _soDtddNguoiNop;
	}

	@Override
	public void setSoDtddNguoiNop(String soDtddNguoiNop) {
		_soDtddNguoiNop = soDtddNguoiNop;

		if (_phieuXuLyChinhHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _phieuXuLyChinhHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setSoDtddNguoiNop",
						String.class);

				method.invoke(_phieuXuLyChinhHoSoThuTucRemoteModel,
					soDtddNguoiNop);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmailNguoiNop() {
		return _emailNguoiNop;
	}

	@Override
	public void setEmailNguoiNop(String emailNguoiNop) {
		_emailNguoiNop = emailNguoiNop;

		if (_phieuXuLyChinhHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _phieuXuLyChinhHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setEmailNguoiNop", String.class);

				method.invoke(_phieuXuLyChinhHoSoThuTucRemoteModel,
					emailNguoiNop);
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

		if (_phieuXuLyChinhHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _phieuXuLyChinhHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setGhiChu", String.class);

				method.invoke(_phieuXuLyChinhHoSoThuTucRemoteModel, ghiChu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTrangThaiHienTaiId() {
		return _trangThaiHienTaiId;
	}

	@Override
	public void setTrangThaiHienTaiId(long trangThaiHienTaiId) {
		_trangThaiHienTaiId = trangThaiHienTaiId;

		if (_phieuXuLyChinhHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _phieuXuLyChinhHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThaiHienTaiId",
						long.class);

				method.invoke(_phieuXuLyChinhHoSoThuTucRemoteModel,
					trangThaiHienTaiId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getHetHoSoCon() {
		return _hetHoSoCon;
	}

	@Override
	public void setHetHoSoCon(long hetHoSoCon) {
		_hetHoSoCon = hetHoSoCon;

		if (_phieuXuLyChinhHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _phieuXuLyChinhHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setHetHoSoCon", long.class);

				method.invoke(_phieuXuLyChinhHoSoThuTucRemoteModel, hetHoSoCon);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getChiemQuyenXuLy() {
		return _chiemQuyenXuLy;
	}

	@Override
	public void setChiemQuyenXuLy(long chiemQuyenXuLy) {
		_chiemQuyenXuLy = chiemQuyenXuLy;

		if (_phieuXuLyChinhHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _phieuXuLyChinhHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setChiemQuyenXuLy", long.class);

				method.invoke(_phieuXuLyChinhHoSoThuTucRemoteModel,
					chiemQuyenXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayTaoPhieu() {
		return _ngayTaoPhieu;
	}

	@Override
	public void setNgayTaoPhieu(Date ngayTaoPhieu) {
		_ngayTaoPhieu = ngayTaoPhieu;

		if (_phieuXuLyChinhHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _phieuXuLyChinhHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTaoPhieu", Date.class);

				method.invoke(_phieuXuLyChinhHoSoThuTucRemoteModel, ngayTaoPhieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNguoiTaoPhieu() {
		return _nguoiTaoPhieu;
	}

	@Override
	public void setNguoiTaoPhieu(long nguoiTaoPhieu) {
		_nguoiTaoPhieu = nguoiTaoPhieu;

		if (_phieuXuLyChinhHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _phieuXuLyChinhHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiTaoPhieu", long.class);

				method.invoke(_phieuXuLyChinhHoSoThuTucRemoteModel,
					nguoiTaoPhieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoDtcdNguoiNop() {
		return _soDtcdNguoiNop;
	}

	@Override
	public void setSoDtcdNguoiNop(String soDtcdNguoiNop) {
		_soDtcdNguoiNop = soDtcdNguoiNop;

		if (_phieuXuLyChinhHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _phieuXuLyChinhHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setSoDtcdNguoiNop",
						String.class);

				method.invoke(_phieuXuLyChinhHoSoThuTucRemoteModel,
					soDtcdNguoiNop);
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

		if (_phieuXuLyChinhHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _phieuXuLyChinhHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setMaSoHoSo", String.class);

				method.invoke(_phieuXuLyChinhHoSoThuTucRemoteModel, maSoHoSo);
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

		if (_phieuXuLyChinhHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _phieuXuLyChinhHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setMaBienNhan", String.class);

				method.invoke(_phieuXuLyChinhHoSoThuTucRemoteModel, maBienNhan);
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

		if (_phieuXuLyChinhHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _phieuXuLyChinhHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setThuTucHanhChinhId",
						long.class);

				method.invoke(_phieuXuLyChinhHoSoThuTucRemoteModel,
					thuTucHanhChinhId);
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

		if (_phieuXuLyChinhHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _phieuXuLyChinhHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setTenChuHoSo", String.class);

				method.invoke(_phieuXuLyChinhHoSoThuTucRemoteModel, tenChuHoSo);
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

		if (_phieuXuLyChinhHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _phieuXuLyChinhHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayGuiHoSo", Date.class);

				method.invoke(_phieuXuLyChinhHoSoThuTucRemoteModel, ngayGuiHoSo);
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

		if (_phieuXuLyChinhHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _phieuXuLyChinhHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setTenDonViTiepNhan",
						String.class);

				method.invoke(_phieuXuLyChinhHoSoThuTucRemoteModel,
					tenDonViTiepNhan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPhieuXuLyChinhHoSoThuTucRemoteModel() {
		return _phieuXuLyChinhHoSoThuTucRemoteModel;
	}

	public void setPhieuXuLyChinhHoSoThuTucRemoteModel(
		BaseModel<?> phieuXuLyChinhHoSoThuTucRemoteModel) {
		_phieuXuLyChinhHoSoThuTucRemoteModel = phieuXuLyChinhHoSoThuTucRemoteModel;
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

		Class<?> remoteModelClass = _phieuXuLyChinhHoSoThuTucRemoteModel.getClass();

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

		Object returnValue = method.invoke(_phieuXuLyChinhHoSoThuTucRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PhieuXuLyChinhHoSoThuTucLocalServiceUtil.addPhieuXuLyChinhHoSoThuTuc(this);
		}
		else {
			PhieuXuLyChinhHoSoThuTucLocalServiceUtil.updatePhieuXuLyChinhHoSoThuTuc(this);
		}
	}

	@Override
	public PhieuXuLyChinhHoSoThuTuc toEscapedModel() {
		return (PhieuXuLyChinhHoSoThuTuc)ProxyUtil.newProxyInstance(PhieuXuLyChinhHoSoThuTuc.class.getClassLoader(),
			new Class[] { PhieuXuLyChinhHoSoThuTuc.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PhieuXuLyChinhHoSoThuTucClp clone = new PhieuXuLyChinhHoSoThuTucClp();

		clone.setId(getId());
		clone.setHoSoThuTucId(getHoSoThuTucId());
		clone.setQuyTrinhThuTucId(getQuyTrinhThuTucId());
		clone.setTenNguoiNop(getTenNguoiNop());
		clone.setCmndNguoiNop(getCmndNguoiNop());
		clone.setDiaChiNguoiNop(getDiaChiNguoiNop());
		clone.setSoDtddNguoiNop(getSoDtddNguoiNop());
		clone.setEmailNguoiNop(getEmailNguoiNop());
		clone.setGhiChu(getGhiChu());
		clone.setTrangThaiHienTaiId(getTrangThaiHienTaiId());
		clone.setHetHoSoCon(getHetHoSoCon());
		clone.setChiemQuyenXuLy(getChiemQuyenXuLy());
		clone.setNgayTaoPhieu(getNgayTaoPhieu());
		clone.setNguoiTaoPhieu(getNguoiTaoPhieu());
		clone.setSoDtcdNguoiNop(getSoDtcdNguoiNop());
		clone.setMaSoHoSo(getMaSoHoSo());
		clone.setMaBienNhan(getMaBienNhan());
		clone.setThuTucHanhChinhId(getThuTucHanhChinhId());
		clone.setTenChuHoSo(getTenChuHoSo());
		clone.setNgayGuiHoSo(getNgayGuiHoSo());
		clone.setTenDonViTiepNhan(getTenDonViTiepNhan());

		return clone;
	}

	@Override
	public int compareTo(PhieuXuLyChinhHoSoThuTuc phieuXuLyChinhHoSoThuTuc) {
		int value = 0;

		if (getId() < phieuXuLyChinhHoSoThuTuc.getId()) {
			value = -1;
		}
		else if (getId() > phieuXuLyChinhHoSoThuTuc.getId()) {
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

		if (!(obj instanceof PhieuXuLyChinhHoSoThuTucClp)) {
			return false;
		}

		PhieuXuLyChinhHoSoThuTucClp phieuXuLyChinhHoSoThuTuc = (PhieuXuLyChinhHoSoThuTucClp)obj;

		long primaryKey = phieuXuLyChinhHoSoThuTuc.getPrimaryKey();

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
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", hoSoThuTucId=");
		sb.append(getHoSoThuTucId());
		sb.append(", quyTrinhThuTucId=");
		sb.append(getQuyTrinhThuTucId());
		sb.append(", tenNguoiNop=");
		sb.append(getTenNguoiNop());
		sb.append(", cmndNguoiNop=");
		sb.append(getCmndNguoiNop());
		sb.append(", diaChiNguoiNop=");
		sb.append(getDiaChiNguoiNop());
		sb.append(", soDtddNguoiNop=");
		sb.append(getSoDtddNguoiNop());
		sb.append(", emailNguoiNop=");
		sb.append(getEmailNguoiNop());
		sb.append(", ghiChu=");
		sb.append(getGhiChu());
		sb.append(", trangThaiHienTaiId=");
		sb.append(getTrangThaiHienTaiId());
		sb.append(", hetHoSoCon=");
		sb.append(getHetHoSoCon());
		sb.append(", chiemQuyenXuLy=");
		sb.append(getChiemQuyenXuLy());
		sb.append(", ngayTaoPhieu=");
		sb.append(getNgayTaoPhieu());
		sb.append(", nguoiTaoPhieu=");
		sb.append(getNguoiTaoPhieu());
		sb.append(", soDtcdNguoiNop=");
		sb.append(getSoDtcdNguoiNop());
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
		StringBundler sb = new StringBundler(67);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.motcua.model.PhieuXuLyChinhHoSoThuTuc");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoSoThuTucId</column-name><column-value><![CDATA[");
		sb.append(getHoSoThuTucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>quyTrinhThuTucId</column-name><column-value><![CDATA[");
		sb.append(getQuyTrinhThuTucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenNguoiNop</column-name><column-value><![CDATA[");
		sb.append(getTenNguoiNop());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cmndNguoiNop</column-name><column-value><![CDATA[");
		sb.append(getCmndNguoiNop());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>diaChiNguoiNop</column-name><column-value><![CDATA[");
		sb.append(getDiaChiNguoiNop());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soDtddNguoiNop</column-name><column-value><![CDATA[");
		sb.append(getSoDtddNguoiNop());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emailNguoiNop</column-name><column-value><![CDATA[");
		sb.append(getEmailNguoiNop());
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
			"<column><column-name>hetHoSoCon</column-name><column-value><![CDATA[");
		sb.append(getHetHoSoCon());
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
			"<column><column-name>soDtcdNguoiNop</column-name><column-value><![CDATA[");
		sb.append(getSoDtcdNguoiNop());
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

	private long _id;
	private long _hoSoThuTucId;
	private long _quyTrinhThuTucId;
	private String _tenNguoiNop;
	private String _cmndNguoiNop;
	private String _diaChiNguoiNop;
	private String _soDtddNguoiNop;
	private String _emailNguoiNop;
	private String _ghiChu;
	private long _trangThaiHienTaiId;
	private long _hetHoSoCon;
	private long _chiemQuyenXuLy;
	private Date _ngayTaoPhieu;
	private long _nguoiTaoPhieu;
	private String _soDtcdNguoiNop;
	private String _maSoHoSo;
	private String _maBienNhan;
	private long _thuTucHanhChinhId;
	private String _tenChuHoSo;
	private Date _ngayGuiHoSo;
	private String _tenDonViTiepNhan;
	private BaseModel<?> _phieuXuLyChinhHoSoThuTucRemoteModel;
}