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
import vn.dtt.gt.dk.dao.motcua.service.PhanCongDonViKiemTraLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class PhanCongDonViKiemTraClp extends BaseModelImpl<PhanCongDonViKiemTra>
	implements PhanCongDonViKiemTra {
	public PhanCongDonViKiemTraClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return PhanCongDonViKiemTra.class;
	}

	@Override
	public String getModelClassName() {
		return PhanCongDonViKiemTra.class.getName();
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
		attributes.put("confirmedinspectionId", getConfirmedinspectionId());
		attributes.put("maSoHoSo", getMaSoHoSo());
		attributes.put("maBienNhan", getMaBienNhan());
		attributes.put("thuTucHanhChinhId", getThuTucHanhChinhId());
		attributes.put("tenChuHoSo", getTenChuHoSo());
		attributes.put("ngayGuiHoSo", getNgayGuiHoSo());
		attributes.put("tenDonViTiepNhan", getTenDonViTiepNhan());
		attributes.put("attachedFile", getAttachedFile());
		attributes.put("inspectionDistrictCode", getInspectionDistrictCode());
		attributes.put("inspectionProvincecode", getInspectionProvincecode());

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

		Long confirmedinspectionId = (Long)attributes.get(
				"confirmedinspectionId");

		if (confirmedinspectionId != null) {
			setConfirmedinspectionId(confirmedinspectionId);
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

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}

		String inspectionDistrictCode = (String)attributes.get(
				"inspectionDistrictCode");

		if (inspectionDistrictCode != null) {
			setInspectionDistrictCode(inspectionDistrictCode);
		}

		String inspectionProvincecode = (String)attributes.get(
				"inspectionProvincecode");

		if (inspectionProvincecode != null) {
			setInspectionProvincecode(inspectionProvincecode);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_phanCongDonViKiemTraRemoteModel != null) {
			try {
				Class<?> clazz = _phanCongDonViKiemTraRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_phanCongDonViKiemTraRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPhieuXuLyChinhId() {
		return _phieuXuLyChinhId;
	}

	@Override
	public void setPhieuXuLyChinhId(long phieuXuLyChinhId) {
		_phieuXuLyChinhId = phieuXuLyChinhId;

		if (_phanCongDonViKiemTraRemoteModel != null) {
			try {
				Class<?> clazz = _phanCongDonViKiemTraRemoteModel.getClass();

				Method method = clazz.getMethod("setPhieuXuLyChinhId",
						long.class);

				method.invoke(_phanCongDonViKiemTraRemoteModel, phieuXuLyChinhId);
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

		if (_phanCongDonViKiemTraRemoteModel != null) {
			try {
				Class<?> clazz = _phanCongDonViKiemTraRemoteModel.getClass();

				Method method = clazz.getMethod("setTrichYeuNoiDung",
						String.class);

				method.invoke(_phanCongDonViKiemTraRemoteModel, trichYeuNoiDung);
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

		if (_phanCongDonViKiemTraRemoteModel != null) {
			try {
				Class<?> clazz = _phanCongDonViKiemTraRemoteModel.getClass();

				Method method = clazz.getMethod("setGhiChu", String.class);

				method.invoke(_phanCongDonViKiemTraRemoteModel, ghiChu);
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

		if (_phanCongDonViKiemTraRemoteModel != null) {
			try {
				Class<?> clazz = _phanCongDonViKiemTraRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThaiHienTaiId",
						long.class);

				method.invoke(_phanCongDonViKiemTraRemoteModel,
					trangThaiHienTaiId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNoiDungHoSoId() {
		return _noiDungHoSoId;
	}

	@Override
	public void setNoiDungHoSoId(long noiDungHoSoId) {
		_noiDungHoSoId = noiDungHoSoId;

		if (_phanCongDonViKiemTraRemoteModel != null) {
			try {
				Class<?> clazz = _phanCongDonViKiemTraRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiDungHoSoId", long.class);

				method.invoke(_phanCongDonViKiemTraRemoteModel, noiDungHoSoId);
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

		if (_phanCongDonViKiemTraRemoteModel != null) {
			try {
				Class<?> clazz = _phanCongDonViKiemTraRemoteModel.getClass();

				Method method = clazz.getMethod("setChiemQuyenXuLy", long.class);

				method.invoke(_phanCongDonViKiemTraRemoteModel, chiemQuyenXuLy);
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

		if (_phanCongDonViKiemTraRemoteModel != null) {
			try {
				Class<?> clazz = _phanCongDonViKiemTraRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTaoPhieu", Date.class);

				method.invoke(_phanCongDonViKiemTraRemoteModel, ngayTaoPhieu);
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

		if (_phanCongDonViKiemTraRemoteModel != null) {
			try {
				Class<?> clazz = _phanCongDonViKiemTraRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiTaoPhieu", long.class);

				method.invoke(_phanCongDonViKiemTraRemoteModel, nguoiTaoPhieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNhomPhieuXuLy() {
		return _nhomPhieuXuLy;
	}

	@Override
	public void setNhomPhieuXuLy(String nhomPhieuXuLy) {
		_nhomPhieuXuLy = nhomPhieuXuLy;

		if (_phanCongDonViKiemTraRemoteModel != null) {
			try {
				Class<?> clazz = _phanCongDonViKiemTraRemoteModel.getClass();

				Method method = clazz.getMethod("setNhomPhieuXuLy", String.class);

				method.invoke(_phanCongDonViKiemTraRemoteModel, nhomPhieuXuLy);
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

		if (_phanCongDonViKiemTraRemoteModel != null) {
			try {
				Class<?> clazz = _phanCongDonViKiemTraRemoteModel.getClass();

				Method method = clazz.getMethod("setPhanNhomHoSoId", long.class);

				method.invoke(_phanCongDonViKiemTraRemoteModel, phanNhomHoSoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getConfirmedinspectionId() {
		return _confirmedinspectionId;
	}

	@Override
	public void setConfirmedinspectionId(long confirmedinspectionId) {
		_confirmedinspectionId = confirmedinspectionId;

		if (_phanCongDonViKiemTraRemoteModel != null) {
			try {
				Class<?> clazz = _phanCongDonViKiemTraRemoteModel.getClass();

				Method method = clazz.getMethod("setConfirmedinspectionId",
						long.class);

				method.invoke(_phanCongDonViKiemTraRemoteModel,
					confirmedinspectionId);
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

		if (_phanCongDonViKiemTraRemoteModel != null) {
			try {
				Class<?> clazz = _phanCongDonViKiemTraRemoteModel.getClass();

				Method method = clazz.getMethod("setMaSoHoSo", String.class);

				method.invoke(_phanCongDonViKiemTraRemoteModel, maSoHoSo);
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

		if (_phanCongDonViKiemTraRemoteModel != null) {
			try {
				Class<?> clazz = _phanCongDonViKiemTraRemoteModel.getClass();

				Method method = clazz.getMethod("setMaBienNhan", String.class);

				method.invoke(_phanCongDonViKiemTraRemoteModel, maBienNhan);
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

		if (_phanCongDonViKiemTraRemoteModel != null) {
			try {
				Class<?> clazz = _phanCongDonViKiemTraRemoteModel.getClass();

				Method method = clazz.getMethod("setThuTucHanhChinhId",
						long.class);

				method.invoke(_phanCongDonViKiemTraRemoteModel,
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

		if (_phanCongDonViKiemTraRemoteModel != null) {
			try {
				Class<?> clazz = _phanCongDonViKiemTraRemoteModel.getClass();

				Method method = clazz.getMethod("setTenChuHoSo", String.class);

				method.invoke(_phanCongDonViKiemTraRemoteModel, tenChuHoSo);
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

		if (_phanCongDonViKiemTraRemoteModel != null) {
			try {
				Class<?> clazz = _phanCongDonViKiemTraRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayGuiHoSo", Date.class);

				method.invoke(_phanCongDonViKiemTraRemoteModel, ngayGuiHoSo);
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

		if (_phanCongDonViKiemTraRemoteModel != null) {
			try {
				Class<?> clazz = _phanCongDonViKiemTraRemoteModel.getClass();

				Method method = clazz.getMethod("setTenDonViTiepNhan",
						String.class);

				method.invoke(_phanCongDonViKiemTraRemoteModel, tenDonViTiepNhan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAttachedFile() {
		return _attachedFile;
	}

	@Override
	public void setAttachedFile(long attachedFile) {
		_attachedFile = attachedFile;

		if (_phanCongDonViKiemTraRemoteModel != null) {
			try {
				Class<?> clazz = _phanCongDonViKiemTraRemoteModel.getClass();

				Method method = clazz.getMethod("setAttachedFile", long.class);

				method.invoke(_phanCongDonViKiemTraRemoteModel, attachedFile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectionDistrictCode() {
		return _inspectionDistrictCode;
	}

	@Override
	public void setInspectionDistrictCode(String inspectionDistrictCode) {
		_inspectionDistrictCode = inspectionDistrictCode;

		if (_phanCongDonViKiemTraRemoteModel != null) {
			try {
				Class<?> clazz = _phanCongDonViKiemTraRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionDistrictCode",
						String.class);

				method.invoke(_phanCongDonViKiemTraRemoteModel,
					inspectionDistrictCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectionProvincecode() {
		return _inspectionProvincecode;
	}

	@Override
	public void setInspectionProvincecode(String inspectionProvincecode) {
		_inspectionProvincecode = inspectionProvincecode;

		if (_phanCongDonViKiemTraRemoteModel != null) {
			try {
				Class<?> clazz = _phanCongDonViKiemTraRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionProvincecode",
						String.class);

				method.invoke(_phanCongDonViKiemTraRemoteModel,
					inspectionProvincecode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPhanCongDonViKiemTraRemoteModel() {
		return _phanCongDonViKiemTraRemoteModel;
	}

	public void setPhanCongDonViKiemTraRemoteModel(
		BaseModel<?> phanCongDonViKiemTraRemoteModel) {
		_phanCongDonViKiemTraRemoteModel = phanCongDonViKiemTraRemoteModel;
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

		Class<?> remoteModelClass = _phanCongDonViKiemTraRemoteModel.getClass();

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

		Object returnValue = method.invoke(_phanCongDonViKiemTraRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PhanCongDonViKiemTraLocalServiceUtil.addPhanCongDonViKiemTra(this);
		}
		else {
			PhanCongDonViKiemTraLocalServiceUtil.updatePhanCongDonViKiemTra(this);
		}
	}

	@Override
	public PhanCongDonViKiemTra toEscapedModel() {
		return (PhanCongDonViKiemTra)ProxyUtil.newProxyInstance(PhanCongDonViKiemTra.class.getClassLoader(),
			new Class[] { PhanCongDonViKiemTra.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PhanCongDonViKiemTraClp clone = new PhanCongDonViKiemTraClp();

		clone.setId(getId());
		clone.setPhieuXuLyChinhId(getPhieuXuLyChinhId());
		clone.setTrichYeuNoiDung(getTrichYeuNoiDung());
		clone.setGhiChu(getGhiChu());
		clone.setTrangThaiHienTaiId(getTrangThaiHienTaiId());
		clone.setNoiDungHoSoId(getNoiDungHoSoId());
		clone.setChiemQuyenXuLy(getChiemQuyenXuLy());
		clone.setNgayTaoPhieu(getNgayTaoPhieu());
		clone.setNguoiTaoPhieu(getNguoiTaoPhieu());
		clone.setNhomPhieuXuLy(getNhomPhieuXuLy());
		clone.setPhanNhomHoSoId(getPhanNhomHoSoId());
		clone.setConfirmedinspectionId(getConfirmedinspectionId());
		clone.setMaSoHoSo(getMaSoHoSo());
		clone.setMaBienNhan(getMaBienNhan());
		clone.setThuTucHanhChinhId(getThuTucHanhChinhId());
		clone.setTenChuHoSo(getTenChuHoSo());
		clone.setNgayGuiHoSo(getNgayGuiHoSo());
		clone.setTenDonViTiepNhan(getTenDonViTiepNhan());
		clone.setAttachedFile(getAttachedFile());
		clone.setInspectionDistrictCode(getInspectionDistrictCode());
		clone.setInspectionProvincecode(getInspectionProvincecode());

		return clone;
	}

	@Override
	public int compareTo(PhanCongDonViKiemTra phanCongDonViKiemTra) {
		int value = 0;

		if (getId() < phanCongDonViKiemTra.getId()) {
			value = -1;
		}
		else if (getId() > phanCongDonViKiemTra.getId()) {
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

		if (!(obj instanceof PhanCongDonViKiemTraClp)) {
			return false;
		}

		PhanCongDonViKiemTraClp phanCongDonViKiemTra = (PhanCongDonViKiemTraClp)obj;

		long primaryKey = phanCongDonViKiemTra.getPrimaryKey();

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
		StringBundler sb = new StringBundler(43);

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
		sb.append(", confirmedinspectionId=");
		sb.append(getConfirmedinspectionId());
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
		sb.append(", attachedFile=");
		sb.append(getAttachedFile());
		sb.append(", inspectionDistrictCode=");
		sb.append(getInspectionDistrictCode());
		sb.append(", inspectionProvincecode=");
		sb.append(getInspectionProvincecode());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(67);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra");
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
			"<column><column-name>confirmedinspectionId</column-name><column-value><![CDATA[");
		sb.append(getConfirmedinspectionId());
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
		sb.append(
			"<column><column-name>attachedFile</column-name><column-value><![CDATA[");
		sb.append(getAttachedFile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionDistrictCode</column-name><column-value><![CDATA[");
		sb.append(getInspectionDistrictCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionProvincecode</column-name><column-value><![CDATA[");
		sb.append(getInspectionProvincecode());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

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
	private long _confirmedinspectionId;
	private String _maSoHoSo;
	private String _maBienNhan;
	private long _thuTucHanhChinhId;
	private String _tenChuHoSo;
	private Date _ngayGuiHoSo;
	private String _tenDonViTiepNhan;
	private long _attachedFile;
	private String _inspectionDistrictCode;
	private String _inspectionProvincecode;
	private BaseModel<?> _phanCongDonViKiemTraRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.gt.dk.dao.motcua.service.ClpSerializer.class;
}