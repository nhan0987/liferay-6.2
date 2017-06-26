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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TimKiemHoSo}.
 * </p>
 *
 * @author win_64
 * @see TimKiemHoSo
 * @generated
 */
public class TimKiemHoSoWrapper implements TimKiemHoSo,
	ModelWrapper<TimKiemHoSo> {
	public TimKiemHoSoWrapper(TimKiemHoSo timKiemHoSo) {
		_timKiemHoSo = timKiemHoSo;
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

	/**
	* Returns the primary key of this tim kiem ho so.
	*
	* @return the primary key of this tim kiem ho so
	*/
	@Override
	public long getPrimaryKey() {
		return _timKiemHoSo.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tim kiem ho so.
	*
	* @param primaryKey the primary key of this tim kiem ho so
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_timKiemHoSo.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tim kiem ho so.
	*
	* @return the ID of this tim kiem ho so
	*/
	@Override
	public long getId() {
		return _timKiemHoSo.getId();
	}

	/**
	* Sets the ID of this tim kiem ho so.
	*
	* @param id the ID of this tim kiem ho so
	*/
	@Override
	public void setId(long id) {
		_timKiemHoSo.setId(id);
	}

	/**
	* Returns the ma so ho so of this tim kiem ho so.
	*
	* @return the ma so ho so of this tim kiem ho so
	*/
	@Override
	public java.lang.String getMaSoHoSo() {
		return _timKiemHoSo.getMaSoHoSo();
	}

	/**
	* Sets the ma so ho so of this tim kiem ho so.
	*
	* @param maSoHoSo the ma so ho so of this tim kiem ho so
	*/
	@Override
	public void setMaSoHoSo(java.lang.String maSoHoSo) {
		_timKiemHoSo.setMaSoHoSo(maSoHoSo);
	}

	/**
	* Returns the ma bien nhan of this tim kiem ho so.
	*
	* @return the ma bien nhan of this tim kiem ho so
	*/
	@Override
	public java.lang.String getMaBienNhan() {
		return _timKiemHoSo.getMaBienNhan();
	}

	/**
	* Sets the ma bien nhan of this tim kiem ho so.
	*
	* @param maBienNhan the ma bien nhan of this tim kiem ho so
	*/
	@Override
	public void setMaBienNhan(java.lang.String maBienNhan) {
		_timKiemHoSo.setMaBienNhan(maBienNhan);
	}

	/**
	* Returns the thu tuc hanh chinh ID of this tim kiem ho so.
	*
	* @return the thu tuc hanh chinh ID of this tim kiem ho so
	*/
	@Override
	public long getThuTucHanhChinhId() {
		return _timKiemHoSo.getThuTucHanhChinhId();
	}

	/**
	* Sets the thu tuc hanh chinh ID of this tim kiem ho so.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID of this tim kiem ho so
	*/
	@Override
	public void setThuTucHanhChinhId(long thuTucHanhChinhId) {
		_timKiemHoSo.setThuTucHanhChinhId(thuTucHanhChinhId);
	}

	/**
	* Returns the loai chu ho so of this tim kiem ho so.
	*
	* @return the loai chu ho so of this tim kiem ho so
	*/
	@Override
	public long getLoaiChuHoSo() {
		return _timKiemHoSo.getLoaiChuHoSo();
	}

	/**
	* Sets the loai chu ho so of this tim kiem ho so.
	*
	* @param loaiChuHoSo the loai chu ho so of this tim kiem ho so
	*/
	@Override
	public void setLoaiChuHoSo(long loaiChuHoSo) {
		_timKiemHoSo.setLoaiChuHoSo(loaiChuHoSo);
	}

	/**
	* Returns the ma so chu ho so of this tim kiem ho so.
	*
	* @return the ma so chu ho so of this tim kiem ho so
	*/
	@Override
	public java.lang.String getMaSoChuHoSo() {
		return _timKiemHoSo.getMaSoChuHoSo();
	}

	/**
	* Sets the ma so chu ho so of this tim kiem ho so.
	*
	* @param maSoChuHoSo the ma so chu ho so of this tim kiem ho so
	*/
	@Override
	public void setMaSoChuHoSo(java.lang.String maSoChuHoSo) {
		_timKiemHoSo.setMaSoChuHoSo(maSoChuHoSo);
	}

	/**
	* Returns the ten chu ho so of this tim kiem ho so.
	*
	* @return the ten chu ho so of this tim kiem ho so
	*/
	@Override
	public java.lang.String getTenChuHoSo() {
		return _timKiemHoSo.getTenChuHoSo();
	}

	/**
	* Sets the ten chu ho so of this tim kiem ho so.
	*
	* @param tenChuHoSo the ten chu ho so of this tim kiem ho so
	*/
	@Override
	public void setTenChuHoSo(java.lang.String tenChuHoSo) {
		_timKiemHoSo.setTenChuHoSo(tenChuHoSo);
	}

	/**
	* Returns the dia chi chu ho so of this tim kiem ho so.
	*
	* @return the dia chi chu ho so of this tim kiem ho so
	*/
	@Override
	public java.lang.String getDiaChiChuHoSo() {
		return _timKiemHoSo.getDiaChiChuHoSo();
	}

	/**
	* Sets the dia chi chu ho so of this tim kiem ho so.
	*
	* @param diaChiChuHoSo the dia chi chu ho so of this tim kiem ho so
	*/
	@Override
	public void setDiaChiChuHoSo(java.lang.String diaChiChuHoSo) {
		_timKiemHoSo.setDiaChiChuHoSo(diaChiChuHoSo);
	}

	/**
	* Returns the trich yeu noi dung of this tim kiem ho so.
	*
	* @return the trich yeu noi dung of this tim kiem ho so
	*/
	@Override
	public java.lang.String getTrichYeuNoiDung() {
		return _timKiemHoSo.getTrichYeuNoiDung();
	}

	/**
	* Sets the trich yeu noi dung of this tim kiem ho so.
	*
	* @param trichYeuNoiDung the trich yeu noi dung of this tim kiem ho so
	*/
	@Override
	public void setTrichYeuNoiDung(java.lang.String trichYeuNoiDung) {
		_timKiemHoSo.setTrichYeuNoiDung(trichYeuNoiDung);
	}

	/**
	* Returns the ngay gui ho so of this tim kiem ho so.
	*
	* @return the ngay gui ho so of this tim kiem ho so
	*/
	@Override
	public java.util.Date getNgayGuiHoSo() {
		return _timKiemHoSo.getNgayGuiHoSo();
	}

	/**
	* Sets the ngay gui ho so of this tim kiem ho so.
	*
	* @param ngayGuiHoSo the ngay gui ho so of this tim kiem ho so
	*/
	@Override
	public void setNgayGuiHoSo(java.util.Date ngayGuiHoSo) {
		_timKiemHoSo.setNgayGuiHoSo(ngayGuiHoSo);
	}

	/**
	* Returns the ngay tiep nhan of this tim kiem ho so.
	*
	* @return the ngay tiep nhan of this tim kiem ho so
	*/
	@Override
	public java.util.Date getNgayTiepNhan() {
		return _timKiemHoSo.getNgayTiepNhan();
	}

	/**
	* Sets the ngay tiep nhan of this tim kiem ho so.
	*
	* @param ngayTiepNhan the ngay tiep nhan of this tim kiem ho so
	*/
	@Override
	public void setNgayTiepNhan(java.util.Date ngayTiepNhan) {
		_timKiemHoSo.setNgayTiepNhan(ngayTiepNhan);
	}

	/**
	* Returns the ngay bo sung of this tim kiem ho so.
	*
	* @return the ngay bo sung of this tim kiem ho so
	*/
	@Override
	public java.util.Date getNgayBoSung() {
		return _timKiemHoSo.getNgayBoSung();
	}

	/**
	* Sets the ngay bo sung of this tim kiem ho so.
	*
	* @param ngayBoSung the ngay bo sung of this tim kiem ho so
	*/
	@Override
	public void setNgayBoSung(java.util.Date ngayBoSung) {
		_timKiemHoSo.setNgayBoSung(ngayBoSung);
	}

	/**
	* Returns the ngay hen tra of this tim kiem ho so.
	*
	* @return the ngay hen tra of this tim kiem ho so
	*/
	@Override
	public java.util.Date getNgayHenTra() {
		return _timKiemHoSo.getNgayHenTra();
	}

	/**
	* Sets the ngay hen tra of this tim kiem ho so.
	*
	* @param ngayHenTra the ngay hen tra of this tim kiem ho so
	*/
	@Override
	public void setNgayHenTra(java.util.Date ngayHenTra) {
		_timKiemHoSo.setNgayHenTra(ngayHenTra);
	}

	/**
	* Returns the ngay tra ket qua of this tim kiem ho so.
	*
	* @return the ngay tra ket qua of this tim kiem ho so
	*/
	@Override
	public java.util.Date getNgayTraKetQua() {
		return _timKiemHoSo.getNgayTraKetQua();
	}

	/**
	* Sets the ngay tra ket qua of this tim kiem ho so.
	*
	* @param ngayTraKetQua the ngay tra ket qua of this tim kiem ho so
	*/
	@Override
	public void setNgayTraKetQua(java.util.Date ngayTraKetQua) {
		_timKiemHoSo.setNgayTraKetQua(ngayTraKetQua);
	}

	/**
	* Returns the ngay dong ho so of this tim kiem ho so.
	*
	* @return the ngay dong ho so of this tim kiem ho so
	*/
	@Override
	public java.util.Date getNgayDongHoSo() {
		return _timKiemHoSo.getNgayDongHoSo();
	}

	/**
	* Sets the ngay dong ho so of this tim kiem ho so.
	*
	* @param ngayDongHoSo the ngay dong ho so of this tim kiem ho so
	*/
	@Override
	public void setNgayDongHoSo(java.util.Date ngayDongHoSo) {
		_timKiemHoSo.setNgayDongHoSo(ngayDongHoSo);
	}

	/**
	* Returns the trang thai ho so of this tim kiem ho so.
	*
	* @return the trang thai ho so of this tim kiem ho so
	*/
	@Override
	public java.lang.String getTrangThaiHoSo() {
		return _timKiemHoSo.getTrangThaiHoSo();
	}

	/**
	* Sets the trang thai ho so of this tim kiem ho so.
	*
	* @param trangThaiHoSo the trang thai ho so of this tim kiem ho so
	*/
	@Override
	public void setTrangThaiHoSo(java.lang.String trangThaiHoSo) {
		_timKiemHoSo.setTrangThaiHoSo(trangThaiHoSo);
	}

	/**
	* Returns the phan nhom ho so ID of this tim kiem ho so.
	*
	* @return the phan nhom ho so ID of this tim kiem ho so
	*/
	@Override
	public long getPhanNhomHoSoId() {
		return _timKiemHoSo.getPhanNhomHoSoId();
	}

	/**
	* Sets the phan nhom ho so ID of this tim kiem ho so.
	*
	* @param phanNhomHoSoId the phan nhom ho so ID of this tim kiem ho so
	*/
	@Override
	public void setPhanNhomHoSoId(long phanNhomHoSoId) {
		_timKiemHoSo.setPhanNhomHoSoId(phanNhomHoSoId);
	}

	/**
	* Returns the ma don vi tiep nhan of this tim kiem ho so.
	*
	* @return the ma don vi tiep nhan of this tim kiem ho so
	*/
	@Override
	public java.lang.String getMaDonViTiepNhan() {
		return _timKiemHoSo.getMaDonViTiepNhan();
	}

	/**
	* Sets the ma don vi tiep nhan of this tim kiem ho so.
	*
	* @param maDonViTiepNhan the ma don vi tiep nhan of this tim kiem ho so
	*/
	@Override
	public void setMaDonViTiepNhan(java.lang.String maDonViTiepNhan) {
		_timKiemHoSo.setMaDonViTiepNhan(maDonViTiepNhan);
	}

	/**
	* Returns the ten don vi tiep nhan of this tim kiem ho so.
	*
	* @return the ten don vi tiep nhan of this tim kiem ho so
	*/
	@Override
	public java.lang.String getTenDonViTiepNhan() {
		return _timKiemHoSo.getTenDonViTiepNhan();
	}

	/**
	* Sets the ten don vi tiep nhan of this tim kiem ho so.
	*
	* @param tenDonViTiepNhan the ten don vi tiep nhan of this tim kiem ho so
	*/
	@Override
	public void setTenDonViTiepNhan(java.lang.String tenDonViTiepNhan) {
		_timKiemHoSo.setTenDonViTiepNhan(tenDonViTiepNhan);
	}

	/**
	* Returns the to chuc quan ly of this tim kiem ho so.
	*
	* @return the to chuc quan ly of this tim kiem ho so
	*/
	@Override
	public long getToChucQuanLy() {
		return _timKiemHoSo.getToChucQuanLy();
	}

	/**
	* Sets the to chuc quan ly of this tim kiem ho so.
	*
	* @param toChucQuanLy the to chuc quan ly of this tim kiem ho so
	*/
	@Override
	public void setToChucQuanLy(long toChucQuanLy) {
		_timKiemHoSo.setToChucQuanLy(toChucQuanLy);
	}

	/**
	* Returns the ngay tao of this tim kiem ho so.
	*
	* @return the ngay tao of this tim kiem ho so
	*/
	@Override
	public java.util.Date getNgayTao() {
		return _timKiemHoSo.getNgayTao();
	}

	/**
	* Sets the ngay tao of this tim kiem ho so.
	*
	* @param ngayTao the ngay tao of this tim kiem ho so
	*/
	@Override
	public void setNgayTao(java.util.Date ngayTao) {
		_timKiemHoSo.setNgayTao(ngayTao);
	}

	/**
	* Returns the nguoi tao of this tim kiem ho so.
	*
	* @return the nguoi tao of this tim kiem ho so
	*/
	@Override
	public long getNguoiTao() {
		return _timKiemHoSo.getNguoiTao();
	}

	/**
	* Sets the nguoi tao of this tim kiem ho so.
	*
	* @param nguoiTao the nguoi tao of this tim kiem ho so
	*/
	@Override
	public void setNguoiTao(long nguoiTao) {
		_timKiemHoSo.setNguoiTao(nguoiTao);
	}

	/**
	* Returns the ghi chu of this tim kiem ho so.
	*
	* @return the ghi chu of this tim kiem ho so
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _timKiemHoSo.getGhiChu();
	}

	/**
	* Sets the ghi chu of this tim kiem ho so.
	*
	* @param ghiChu the ghi chu of this tim kiem ho so
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_timKiemHoSo.setGhiChu(ghiChu);
	}

	/**
	* Returns the lan gui cuoi of this tim kiem ho so.
	*
	* @return the lan gui cuoi of this tim kiem ho so
	*/
	@Override
	public long getLanGuiCuoi() {
		return _timKiemHoSo.getLanGuiCuoi();
	}

	/**
	* Sets the lan gui cuoi of this tim kiem ho so.
	*
	* @param lanGuiCuoi the lan gui cuoi of this tim kiem ho so
	*/
	@Override
	public void setLanGuiCuoi(long lanGuiCuoi) {
		_timKiemHoSo.setLanGuiCuoi(lanGuiCuoi);
	}

	@Override
	public boolean isNew() {
		return _timKiemHoSo.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_timKiemHoSo.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _timKiemHoSo.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_timKiemHoSo.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _timKiemHoSo.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _timKiemHoSo.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_timKiemHoSo.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _timKiemHoSo.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_timKiemHoSo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_timKiemHoSo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_timKiemHoSo.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TimKiemHoSoWrapper((TimKiemHoSo)_timKiemHoSo.clone());
	}

	@Override
	public int compareTo(vn.dtt.gt.dk.dao.common.model.TimKiemHoSo timKiemHoSo) {
		return _timKiemHoSo.compareTo(timKiemHoSo);
	}

	@Override
	public int hashCode() {
		return _timKiemHoSo.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.common.model.TimKiemHoSo> toCacheModel() {
		return _timKiemHoSo.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TimKiemHoSo toEscapedModel() {
		return new TimKiemHoSoWrapper(_timKiemHoSo.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TimKiemHoSo toUnescapedModel() {
		return new TimKiemHoSoWrapper(_timKiemHoSo.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _timKiemHoSo.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _timKiemHoSo.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_timKiemHoSo.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TimKiemHoSoWrapper)) {
			return false;
		}

		TimKiemHoSoWrapper timKiemHoSoWrapper = (TimKiemHoSoWrapper)obj;

		if (Validator.equals(_timKiemHoSo, timKiemHoSoWrapper._timKiemHoSo)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TimKiemHoSo getWrappedTimKiemHoSo() {
		return _timKiemHoSo;
	}

	@Override
	public TimKiemHoSo getWrappedModel() {
		return _timKiemHoSo;
	}

	@Override
	public void resetOriginalValues() {
		_timKiemHoSo.resetOriginalValues();
	}

	private TimKiemHoSo _timKiemHoSo;
}