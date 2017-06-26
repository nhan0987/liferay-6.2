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
 * This class is a wrapper for {@link TthcHoSoThuTuc}.
 * </p>
 *
 * @author huymq
 * @see TthcHoSoThuTuc
 * @generated
 */
public class TthcHoSoThuTucWrapper implements TthcHoSoThuTuc,
	ModelWrapper<TthcHoSoThuTuc> {
	public TthcHoSoThuTucWrapper(TthcHoSoThuTuc tthcHoSoThuTuc) {
		_tthcHoSoThuTuc = tthcHoSoThuTuc;
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
		attributes.put("synchdate", getSynchdate());

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

		Date synchdate = (Date)attributes.get("synchdate");

		if (synchdate != null) {
			setSynchdate(synchdate);
		}
	}

	/**
	* Returns the primary key of this tthc ho so thu tuc.
	*
	* @return the primary key of this tthc ho so thu tuc
	*/
	@Override
	public long getPrimaryKey() {
		return _tthcHoSoThuTuc.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tthc ho so thu tuc.
	*
	* @param primaryKey the primary key of this tthc ho so thu tuc
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tthcHoSoThuTuc.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tthc ho so thu tuc.
	*
	* @return the ID of this tthc ho so thu tuc
	*/
	@Override
	public long getId() {
		return _tthcHoSoThuTuc.getId();
	}

	/**
	* Sets the ID of this tthc ho so thu tuc.
	*
	* @param Id the ID of this tthc ho so thu tuc
	*/
	@Override
	public void setId(long Id) {
		_tthcHoSoThuTuc.setId(Id);
	}

	/**
	* Returns the ma so ho so of this tthc ho so thu tuc.
	*
	* @return the ma so ho so of this tthc ho so thu tuc
	*/
	@Override
	public java.lang.String getMaSoHoSo() {
		return _tthcHoSoThuTuc.getMaSoHoSo();
	}

	/**
	* Sets the ma so ho so of this tthc ho so thu tuc.
	*
	* @param MaSoHoSo the ma so ho so of this tthc ho so thu tuc
	*/
	@Override
	public void setMaSoHoSo(java.lang.String MaSoHoSo) {
		_tthcHoSoThuTuc.setMaSoHoSo(MaSoHoSo);
	}

	/**
	* Returns the ma bien nhan of this tthc ho so thu tuc.
	*
	* @return the ma bien nhan of this tthc ho so thu tuc
	*/
	@Override
	public java.lang.String getMaBienNhan() {
		return _tthcHoSoThuTuc.getMaBienNhan();
	}

	/**
	* Sets the ma bien nhan of this tthc ho so thu tuc.
	*
	* @param MaBienNhan the ma bien nhan of this tthc ho so thu tuc
	*/
	@Override
	public void setMaBienNhan(java.lang.String MaBienNhan) {
		_tthcHoSoThuTuc.setMaBienNhan(MaBienNhan);
	}

	/**
	* Returns the thu tuc hanh chinh ID of this tthc ho so thu tuc.
	*
	* @return the thu tuc hanh chinh ID of this tthc ho so thu tuc
	*/
	@Override
	public long getThuTucHanhChinhId() {
		return _tthcHoSoThuTuc.getThuTucHanhChinhId();
	}

	/**
	* Sets the thu tuc hanh chinh ID of this tthc ho so thu tuc.
	*
	* @param ThuTucHanhChinhId the thu tuc hanh chinh ID of this tthc ho so thu tuc
	*/
	@Override
	public void setThuTucHanhChinhId(long ThuTucHanhChinhId) {
		_tthcHoSoThuTuc.setThuTucHanhChinhId(ThuTucHanhChinhId);
	}

	/**
	* Returns the loai chu ho so of this tthc ho so thu tuc.
	*
	* @return the loai chu ho so of this tthc ho so thu tuc
	*/
	@Override
	public long getLoaiChuHoSo() {
		return _tthcHoSoThuTuc.getLoaiChuHoSo();
	}

	/**
	* Sets the loai chu ho so of this tthc ho so thu tuc.
	*
	* @param LoaiChuHoSo the loai chu ho so of this tthc ho so thu tuc
	*/
	@Override
	public void setLoaiChuHoSo(long LoaiChuHoSo) {
		_tthcHoSoThuTuc.setLoaiChuHoSo(LoaiChuHoSo);
	}

	/**
	* Returns the ma so chu ho so of this tthc ho so thu tuc.
	*
	* @return the ma so chu ho so of this tthc ho so thu tuc
	*/
	@Override
	public java.lang.String getMaSoChuHoSo() {
		return _tthcHoSoThuTuc.getMaSoChuHoSo();
	}

	/**
	* Sets the ma so chu ho so of this tthc ho so thu tuc.
	*
	* @param MaSoChuHoSo the ma so chu ho so of this tthc ho so thu tuc
	*/
	@Override
	public void setMaSoChuHoSo(java.lang.String MaSoChuHoSo) {
		_tthcHoSoThuTuc.setMaSoChuHoSo(MaSoChuHoSo);
	}

	/**
	* Returns the ten chu ho so of this tthc ho so thu tuc.
	*
	* @return the ten chu ho so of this tthc ho so thu tuc
	*/
	@Override
	public java.lang.String getTenChuHoSo() {
		return _tthcHoSoThuTuc.getTenChuHoSo();
	}

	/**
	* Sets the ten chu ho so of this tthc ho so thu tuc.
	*
	* @param TenChuHoSo the ten chu ho so of this tthc ho so thu tuc
	*/
	@Override
	public void setTenChuHoSo(java.lang.String TenChuHoSo) {
		_tthcHoSoThuTuc.setTenChuHoSo(TenChuHoSo);
	}

	/**
	* Returns the dia chi chu ho so of this tthc ho so thu tuc.
	*
	* @return the dia chi chu ho so of this tthc ho so thu tuc
	*/
	@Override
	public java.lang.String getDiaChiChuHoSo() {
		return _tthcHoSoThuTuc.getDiaChiChuHoSo();
	}

	/**
	* Sets the dia chi chu ho so of this tthc ho so thu tuc.
	*
	* @param DiaChiChuHoSo the dia chi chu ho so of this tthc ho so thu tuc
	*/
	@Override
	public void setDiaChiChuHoSo(java.lang.String DiaChiChuHoSo) {
		_tthcHoSoThuTuc.setDiaChiChuHoSo(DiaChiChuHoSo);
	}

	/**
	* Returns the trich yeu noi dung of this tthc ho so thu tuc.
	*
	* @return the trich yeu noi dung of this tthc ho so thu tuc
	*/
	@Override
	public java.lang.String getTrichYeuNoiDung() {
		return _tthcHoSoThuTuc.getTrichYeuNoiDung();
	}

	/**
	* Sets the trich yeu noi dung of this tthc ho so thu tuc.
	*
	* @param TrichYeuNoiDung the trich yeu noi dung of this tthc ho so thu tuc
	*/
	@Override
	public void setTrichYeuNoiDung(java.lang.String TrichYeuNoiDung) {
		_tthcHoSoThuTuc.setTrichYeuNoiDung(TrichYeuNoiDung);
	}

	/**
	* Returns the ngay gui ho so of this tthc ho so thu tuc.
	*
	* @return the ngay gui ho so of this tthc ho so thu tuc
	*/
	@Override
	public java.util.Date getNgayGuiHoSo() {
		return _tthcHoSoThuTuc.getNgayGuiHoSo();
	}

	/**
	* Sets the ngay gui ho so of this tthc ho so thu tuc.
	*
	* @param NgayGuiHoSo the ngay gui ho so of this tthc ho so thu tuc
	*/
	@Override
	public void setNgayGuiHoSo(java.util.Date NgayGuiHoSo) {
		_tthcHoSoThuTuc.setNgayGuiHoSo(NgayGuiHoSo);
	}

	/**
	* Returns the ngay tiep nhan of this tthc ho so thu tuc.
	*
	* @return the ngay tiep nhan of this tthc ho so thu tuc
	*/
	@Override
	public java.util.Date getNgayTiepNhan() {
		return _tthcHoSoThuTuc.getNgayTiepNhan();
	}

	/**
	* Sets the ngay tiep nhan of this tthc ho so thu tuc.
	*
	* @param NgayTiepNhan the ngay tiep nhan of this tthc ho so thu tuc
	*/
	@Override
	public void setNgayTiepNhan(java.util.Date NgayTiepNhan) {
		_tthcHoSoThuTuc.setNgayTiepNhan(NgayTiepNhan);
	}

	/**
	* Returns the ngay bo sung of this tthc ho so thu tuc.
	*
	* @return the ngay bo sung of this tthc ho so thu tuc
	*/
	@Override
	public java.util.Date getNgayBoSung() {
		return _tthcHoSoThuTuc.getNgayBoSung();
	}

	/**
	* Sets the ngay bo sung of this tthc ho so thu tuc.
	*
	* @param NgayBoSung the ngay bo sung of this tthc ho so thu tuc
	*/
	@Override
	public void setNgayBoSung(java.util.Date NgayBoSung) {
		_tthcHoSoThuTuc.setNgayBoSung(NgayBoSung);
	}

	/**
	* Returns the ngay hen tra of this tthc ho so thu tuc.
	*
	* @return the ngay hen tra of this tthc ho so thu tuc
	*/
	@Override
	public java.util.Date getNgayHenTra() {
		return _tthcHoSoThuTuc.getNgayHenTra();
	}

	/**
	* Sets the ngay hen tra of this tthc ho so thu tuc.
	*
	* @param NgayHenTra the ngay hen tra of this tthc ho so thu tuc
	*/
	@Override
	public void setNgayHenTra(java.util.Date NgayHenTra) {
		_tthcHoSoThuTuc.setNgayHenTra(NgayHenTra);
	}

	/**
	* Returns the ngay tra ket qua of this tthc ho so thu tuc.
	*
	* @return the ngay tra ket qua of this tthc ho so thu tuc
	*/
	@Override
	public java.util.Date getNgayTraKetQua() {
		return _tthcHoSoThuTuc.getNgayTraKetQua();
	}

	/**
	* Sets the ngay tra ket qua of this tthc ho so thu tuc.
	*
	* @param NgayTraKetQua the ngay tra ket qua of this tthc ho so thu tuc
	*/
	@Override
	public void setNgayTraKetQua(java.util.Date NgayTraKetQua) {
		_tthcHoSoThuTuc.setNgayTraKetQua(NgayTraKetQua);
	}

	/**
	* Returns the ngay dong ho so of this tthc ho so thu tuc.
	*
	* @return the ngay dong ho so of this tthc ho so thu tuc
	*/
	@Override
	public java.util.Date getNgayDongHoSo() {
		return _tthcHoSoThuTuc.getNgayDongHoSo();
	}

	/**
	* Sets the ngay dong ho so of this tthc ho so thu tuc.
	*
	* @param NgayDongHoSo the ngay dong ho so of this tthc ho so thu tuc
	*/
	@Override
	public void setNgayDongHoSo(java.util.Date NgayDongHoSo) {
		_tthcHoSoThuTuc.setNgayDongHoSo(NgayDongHoSo);
	}

	/**
	* Returns the trang thai ho so of this tthc ho so thu tuc.
	*
	* @return the trang thai ho so of this tthc ho so thu tuc
	*/
	@Override
	public java.lang.String getTrangThaiHoSo() {
		return _tthcHoSoThuTuc.getTrangThaiHoSo();
	}

	/**
	* Sets the trang thai ho so of this tthc ho so thu tuc.
	*
	* @param TrangThaiHoSo the trang thai ho so of this tthc ho so thu tuc
	*/
	@Override
	public void setTrangThaiHoSo(java.lang.String TrangThaiHoSo) {
		_tthcHoSoThuTuc.setTrangThaiHoSo(TrangThaiHoSo);
	}

	/**
	* Returns the phan nhom ho so ID of this tthc ho so thu tuc.
	*
	* @return the phan nhom ho so ID of this tthc ho so thu tuc
	*/
	@Override
	public long getPhanNhomHoSoId() {
		return _tthcHoSoThuTuc.getPhanNhomHoSoId();
	}

	/**
	* Sets the phan nhom ho so ID of this tthc ho so thu tuc.
	*
	* @param PhanNhomHoSoId the phan nhom ho so ID of this tthc ho so thu tuc
	*/
	@Override
	public void setPhanNhomHoSoId(long PhanNhomHoSoId) {
		_tthcHoSoThuTuc.setPhanNhomHoSoId(PhanNhomHoSoId);
	}

	/**
	* Returns the ma don vi tiep nhan of this tthc ho so thu tuc.
	*
	* @return the ma don vi tiep nhan of this tthc ho so thu tuc
	*/
	@Override
	public java.lang.String getMaDonViTiepNhan() {
		return _tthcHoSoThuTuc.getMaDonViTiepNhan();
	}

	/**
	* Sets the ma don vi tiep nhan of this tthc ho so thu tuc.
	*
	* @param MaDonViTiepNhan the ma don vi tiep nhan of this tthc ho so thu tuc
	*/
	@Override
	public void setMaDonViTiepNhan(java.lang.String MaDonViTiepNhan) {
		_tthcHoSoThuTuc.setMaDonViTiepNhan(MaDonViTiepNhan);
	}

	/**
	* Returns the ten don vi tiep nhan of this tthc ho so thu tuc.
	*
	* @return the ten don vi tiep nhan of this tthc ho so thu tuc
	*/
	@Override
	public java.lang.String getTenDonViTiepNhan() {
		return _tthcHoSoThuTuc.getTenDonViTiepNhan();
	}

	/**
	* Sets the ten don vi tiep nhan of this tthc ho so thu tuc.
	*
	* @param TenDonViTiepNhan the ten don vi tiep nhan of this tthc ho so thu tuc
	*/
	@Override
	public void setTenDonViTiepNhan(java.lang.String TenDonViTiepNhan) {
		_tthcHoSoThuTuc.setTenDonViTiepNhan(TenDonViTiepNhan);
	}

	/**
	* Returns the to chuc quan ly of this tthc ho so thu tuc.
	*
	* @return the to chuc quan ly of this tthc ho so thu tuc
	*/
	@Override
	public long getToChucQuanLy() {
		return _tthcHoSoThuTuc.getToChucQuanLy();
	}

	/**
	* Sets the to chuc quan ly of this tthc ho so thu tuc.
	*
	* @param ToChucQuanLy the to chuc quan ly of this tthc ho so thu tuc
	*/
	@Override
	public void setToChucQuanLy(long ToChucQuanLy) {
		_tthcHoSoThuTuc.setToChucQuanLy(ToChucQuanLy);
	}

	/**
	* Returns the ngay tao of this tthc ho so thu tuc.
	*
	* @return the ngay tao of this tthc ho so thu tuc
	*/
	@Override
	public java.util.Date getNgayTao() {
		return _tthcHoSoThuTuc.getNgayTao();
	}

	/**
	* Sets the ngay tao of this tthc ho so thu tuc.
	*
	* @param NgayTao the ngay tao of this tthc ho so thu tuc
	*/
	@Override
	public void setNgayTao(java.util.Date NgayTao) {
		_tthcHoSoThuTuc.setNgayTao(NgayTao);
	}

	/**
	* Returns the nguoi tao of this tthc ho so thu tuc.
	*
	* @return the nguoi tao of this tthc ho so thu tuc
	*/
	@Override
	public long getNguoiTao() {
		return _tthcHoSoThuTuc.getNguoiTao();
	}

	/**
	* Sets the nguoi tao of this tthc ho so thu tuc.
	*
	* @param NguoiTao the nguoi tao of this tthc ho so thu tuc
	*/
	@Override
	public void setNguoiTao(long NguoiTao) {
		_tthcHoSoThuTuc.setNguoiTao(NguoiTao);
	}

	/**
	* Returns the ghi chu of this tthc ho so thu tuc.
	*
	* @return the ghi chu of this tthc ho so thu tuc
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _tthcHoSoThuTuc.getGhiChu();
	}

	/**
	* Sets the ghi chu of this tthc ho so thu tuc.
	*
	* @param ghiChu the ghi chu of this tthc ho so thu tuc
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_tthcHoSoThuTuc.setGhiChu(ghiChu);
	}

	/**
	* Returns the lan gui cuoi of this tthc ho so thu tuc.
	*
	* @return the lan gui cuoi of this tthc ho so thu tuc
	*/
	@Override
	public long getLanGuiCuoi() {
		return _tthcHoSoThuTuc.getLanGuiCuoi();
	}

	/**
	* Sets the lan gui cuoi of this tthc ho so thu tuc.
	*
	* @param lanGuiCuoi the lan gui cuoi of this tthc ho so thu tuc
	*/
	@Override
	public void setLanGuiCuoi(long lanGuiCuoi) {
		_tthcHoSoThuTuc.setLanGuiCuoi(lanGuiCuoi);
	}

	/**
	* Returns the synchdate of this tthc ho so thu tuc.
	*
	* @return the synchdate of this tthc ho so thu tuc
	*/
	@Override
	public java.util.Date getSynchdate() {
		return _tthcHoSoThuTuc.getSynchdate();
	}

	/**
	* Sets the synchdate of this tthc ho so thu tuc.
	*
	* @param synchdate the synchdate of this tthc ho so thu tuc
	*/
	@Override
	public void setSynchdate(java.util.Date synchdate) {
		_tthcHoSoThuTuc.setSynchdate(synchdate);
	}

	@Override
	public boolean isNew() {
		return _tthcHoSoThuTuc.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tthcHoSoThuTuc.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tthcHoSoThuTuc.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tthcHoSoThuTuc.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tthcHoSoThuTuc.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tthcHoSoThuTuc.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tthcHoSoThuTuc.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tthcHoSoThuTuc.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tthcHoSoThuTuc.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tthcHoSoThuTuc.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tthcHoSoThuTuc.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TthcHoSoThuTucWrapper((TthcHoSoThuTuc)_tthcHoSoThuTuc.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc tthcHoSoThuTuc) {
		return _tthcHoSoThuTuc.compareTo(tthcHoSoThuTuc);
	}

	@Override
	public int hashCode() {
		return _tthcHoSoThuTuc.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc> toCacheModel() {
		return _tthcHoSoThuTuc.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc toEscapedModel() {
		return new TthcHoSoThuTucWrapper(_tthcHoSoThuTuc.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc toUnescapedModel() {
		return new TthcHoSoThuTucWrapper(_tthcHoSoThuTuc.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tthcHoSoThuTuc.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tthcHoSoThuTuc.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tthcHoSoThuTuc.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TthcHoSoThuTucWrapper)) {
			return false;
		}

		TthcHoSoThuTucWrapper tthcHoSoThuTucWrapper = (TthcHoSoThuTucWrapper)obj;

		if (Validator.equals(_tthcHoSoThuTuc,
					tthcHoSoThuTucWrapper._tthcHoSoThuTuc)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TthcHoSoThuTuc getWrappedTthcHoSoThuTuc() {
		return _tthcHoSoThuTuc;
	}

	@Override
	public TthcHoSoThuTuc getWrappedModel() {
		return _tthcHoSoThuTuc;
	}

	@Override
	public void resetOriginalValues() {
		_tthcHoSoThuTuc.resetOriginalValues();
	}

	private TthcHoSoThuTuc _tthcHoSoThuTuc;
}