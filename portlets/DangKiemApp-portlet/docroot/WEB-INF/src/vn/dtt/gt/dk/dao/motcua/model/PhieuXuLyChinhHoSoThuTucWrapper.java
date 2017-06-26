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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PhieuXuLyChinhHoSoThuTuc}.
 * </p>
 *
 * @author win_64
 * @see PhieuXuLyChinhHoSoThuTuc
 * @generated
 */
public class PhieuXuLyChinhHoSoThuTucWrapper implements PhieuXuLyChinhHoSoThuTuc,
	ModelWrapper<PhieuXuLyChinhHoSoThuTuc> {
	public PhieuXuLyChinhHoSoThuTucWrapper(
		PhieuXuLyChinhHoSoThuTuc phieuXuLyChinhHoSoThuTuc) {
		_phieuXuLyChinhHoSoThuTuc = phieuXuLyChinhHoSoThuTuc;
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

	/**
	* Returns the primary key of this phieu xu ly chinh ho so thu tuc.
	*
	* @return the primary key of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public long getPrimaryKey() {
		return _phieuXuLyChinhHoSoThuTuc.getPrimaryKey();
	}

	/**
	* Sets the primary key of this phieu xu ly chinh ho so thu tuc.
	*
	* @param primaryKey the primary key of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_phieuXuLyChinhHoSoThuTuc.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this phieu xu ly chinh ho so thu tuc.
	*
	* @return the ID of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public long getId() {
		return _phieuXuLyChinhHoSoThuTuc.getId();
	}

	/**
	* Sets the ID of this phieu xu ly chinh ho so thu tuc.
	*
	* @param id the ID of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public void setId(long id) {
		_phieuXuLyChinhHoSoThuTuc.setId(id);
	}

	/**
	* Returns the ho so thu tuc ID of this phieu xu ly chinh ho so thu tuc.
	*
	* @return the ho so thu tuc ID of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public long getHoSoThuTucId() {
		return _phieuXuLyChinhHoSoThuTuc.getHoSoThuTucId();
	}

	/**
	* Sets the ho so thu tuc ID of this phieu xu ly chinh ho so thu tuc.
	*
	* @param hoSoThuTucId the ho so thu tuc ID of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_phieuXuLyChinhHoSoThuTuc.setHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the quy trinh thu tuc ID of this phieu xu ly chinh ho so thu tuc.
	*
	* @return the quy trinh thu tuc ID of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public long getQuyTrinhThuTucId() {
		return _phieuXuLyChinhHoSoThuTuc.getQuyTrinhThuTucId();
	}

	/**
	* Sets the quy trinh thu tuc ID of this phieu xu ly chinh ho so thu tuc.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public void setQuyTrinhThuTucId(long quyTrinhThuTucId) {
		_phieuXuLyChinhHoSoThuTuc.setQuyTrinhThuTucId(quyTrinhThuTucId);
	}

	/**
	* Returns the ten nguoi nop of this phieu xu ly chinh ho so thu tuc.
	*
	* @return the ten nguoi nop of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public java.lang.String getTenNguoiNop() {
		return _phieuXuLyChinhHoSoThuTuc.getTenNguoiNop();
	}

	/**
	* Sets the ten nguoi nop of this phieu xu ly chinh ho so thu tuc.
	*
	* @param tenNguoiNop the ten nguoi nop of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public void setTenNguoiNop(java.lang.String tenNguoiNop) {
		_phieuXuLyChinhHoSoThuTuc.setTenNguoiNop(tenNguoiNop);
	}

	/**
	* Returns the cmnd nguoi nop of this phieu xu ly chinh ho so thu tuc.
	*
	* @return the cmnd nguoi nop of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public java.lang.String getCmndNguoiNop() {
		return _phieuXuLyChinhHoSoThuTuc.getCmndNguoiNop();
	}

	/**
	* Sets the cmnd nguoi nop of this phieu xu ly chinh ho so thu tuc.
	*
	* @param cmndNguoiNop the cmnd nguoi nop of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public void setCmndNguoiNop(java.lang.String cmndNguoiNop) {
		_phieuXuLyChinhHoSoThuTuc.setCmndNguoiNop(cmndNguoiNop);
	}

	/**
	* Returns the dia chi nguoi nop of this phieu xu ly chinh ho so thu tuc.
	*
	* @return the dia chi nguoi nop of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public java.lang.String getDiaChiNguoiNop() {
		return _phieuXuLyChinhHoSoThuTuc.getDiaChiNguoiNop();
	}

	/**
	* Sets the dia chi nguoi nop of this phieu xu ly chinh ho so thu tuc.
	*
	* @param diaChiNguoiNop the dia chi nguoi nop of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public void setDiaChiNguoiNop(java.lang.String diaChiNguoiNop) {
		_phieuXuLyChinhHoSoThuTuc.setDiaChiNguoiNop(diaChiNguoiNop);
	}

	/**
	* Returns the so dtdd nguoi nop of this phieu xu ly chinh ho so thu tuc.
	*
	* @return the so dtdd nguoi nop of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public java.lang.String getSoDtddNguoiNop() {
		return _phieuXuLyChinhHoSoThuTuc.getSoDtddNguoiNop();
	}

	/**
	* Sets the so dtdd nguoi nop of this phieu xu ly chinh ho so thu tuc.
	*
	* @param soDtddNguoiNop the so dtdd nguoi nop of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public void setSoDtddNguoiNop(java.lang.String soDtddNguoiNop) {
		_phieuXuLyChinhHoSoThuTuc.setSoDtddNguoiNop(soDtddNguoiNop);
	}

	/**
	* Returns the email nguoi nop of this phieu xu ly chinh ho so thu tuc.
	*
	* @return the email nguoi nop of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public java.lang.String getEmailNguoiNop() {
		return _phieuXuLyChinhHoSoThuTuc.getEmailNguoiNop();
	}

	/**
	* Sets the email nguoi nop of this phieu xu ly chinh ho so thu tuc.
	*
	* @param emailNguoiNop the email nguoi nop of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public void setEmailNguoiNop(java.lang.String emailNguoiNop) {
		_phieuXuLyChinhHoSoThuTuc.setEmailNguoiNop(emailNguoiNop);
	}

	/**
	* Returns the ghi chu of this phieu xu ly chinh ho so thu tuc.
	*
	* @return the ghi chu of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _phieuXuLyChinhHoSoThuTuc.getGhiChu();
	}

	/**
	* Sets the ghi chu of this phieu xu ly chinh ho so thu tuc.
	*
	* @param ghiChu the ghi chu of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_phieuXuLyChinhHoSoThuTuc.setGhiChu(ghiChu);
	}

	/**
	* Returns the trang thai hien tai ID of this phieu xu ly chinh ho so thu tuc.
	*
	* @return the trang thai hien tai ID of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public long getTrangThaiHienTaiId() {
		return _phieuXuLyChinhHoSoThuTuc.getTrangThaiHienTaiId();
	}

	/**
	* Sets the trang thai hien tai ID of this phieu xu ly chinh ho so thu tuc.
	*
	* @param trangThaiHienTaiId the trang thai hien tai ID of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public void setTrangThaiHienTaiId(long trangThaiHienTaiId) {
		_phieuXuLyChinhHoSoThuTuc.setTrangThaiHienTaiId(trangThaiHienTaiId);
	}

	/**
	* Returns the het ho so con of this phieu xu ly chinh ho so thu tuc.
	*
	* @return the het ho so con of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public long getHetHoSoCon() {
		return _phieuXuLyChinhHoSoThuTuc.getHetHoSoCon();
	}

	/**
	* Sets the het ho so con of this phieu xu ly chinh ho so thu tuc.
	*
	* @param hetHoSoCon the het ho so con of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public void setHetHoSoCon(long hetHoSoCon) {
		_phieuXuLyChinhHoSoThuTuc.setHetHoSoCon(hetHoSoCon);
	}

	/**
	* Returns the chiem quyen xu ly of this phieu xu ly chinh ho so thu tuc.
	*
	* @return the chiem quyen xu ly of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public long getChiemQuyenXuLy() {
		return _phieuXuLyChinhHoSoThuTuc.getChiemQuyenXuLy();
	}

	/**
	* Sets the chiem quyen xu ly of this phieu xu ly chinh ho so thu tuc.
	*
	* @param chiemQuyenXuLy the chiem quyen xu ly of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public void setChiemQuyenXuLy(long chiemQuyenXuLy) {
		_phieuXuLyChinhHoSoThuTuc.setChiemQuyenXuLy(chiemQuyenXuLy);
	}

	/**
	* Returns the ngay tao phieu of this phieu xu ly chinh ho so thu tuc.
	*
	* @return the ngay tao phieu of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public java.util.Date getNgayTaoPhieu() {
		return _phieuXuLyChinhHoSoThuTuc.getNgayTaoPhieu();
	}

	/**
	* Sets the ngay tao phieu of this phieu xu ly chinh ho so thu tuc.
	*
	* @param ngayTaoPhieu the ngay tao phieu of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public void setNgayTaoPhieu(java.util.Date ngayTaoPhieu) {
		_phieuXuLyChinhHoSoThuTuc.setNgayTaoPhieu(ngayTaoPhieu);
	}

	/**
	* Returns the nguoi tao phieu of this phieu xu ly chinh ho so thu tuc.
	*
	* @return the nguoi tao phieu of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public long getNguoiTaoPhieu() {
		return _phieuXuLyChinhHoSoThuTuc.getNguoiTaoPhieu();
	}

	/**
	* Sets the nguoi tao phieu of this phieu xu ly chinh ho so thu tuc.
	*
	* @param nguoiTaoPhieu the nguoi tao phieu of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public void setNguoiTaoPhieu(long nguoiTaoPhieu) {
		_phieuXuLyChinhHoSoThuTuc.setNguoiTaoPhieu(nguoiTaoPhieu);
	}

	/**
	* Returns the so dtcd nguoi nop of this phieu xu ly chinh ho so thu tuc.
	*
	* @return the so dtcd nguoi nop of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public java.lang.String getSoDtcdNguoiNop() {
		return _phieuXuLyChinhHoSoThuTuc.getSoDtcdNguoiNop();
	}

	/**
	* Sets the so dtcd nguoi nop of this phieu xu ly chinh ho so thu tuc.
	*
	* @param soDtcdNguoiNop the so dtcd nguoi nop of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public void setSoDtcdNguoiNop(java.lang.String soDtcdNguoiNop) {
		_phieuXuLyChinhHoSoThuTuc.setSoDtcdNguoiNop(soDtcdNguoiNop);
	}

	/**
	* Returns the ma so ho so of this phieu xu ly chinh ho so thu tuc.
	*
	* @return the ma so ho so of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public java.lang.String getMaSoHoSo() {
		return _phieuXuLyChinhHoSoThuTuc.getMaSoHoSo();
	}

	/**
	* Sets the ma so ho so of this phieu xu ly chinh ho so thu tuc.
	*
	* @param maSoHoSo the ma so ho so of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public void setMaSoHoSo(java.lang.String maSoHoSo) {
		_phieuXuLyChinhHoSoThuTuc.setMaSoHoSo(maSoHoSo);
	}

	/**
	* Returns the ma bien nhan of this phieu xu ly chinh ho so thu tuc.
	*
	* @return the ma bien nhan of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public java.lang.String getMaBienNhan() {
		return _phieuXuLyChinhHoSoThuTuc.getMaBienNhan();
	}

	/**
	* Sets the ma bien nhan of this phieu xu ly chinh ho so thu tuc.
	*
	* @param maBienNhan the ma bien nhan of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public void setMaBienNhan(java.lang.String maBienNhan) {
		_phieuXuLyChinhHoSoThuTuc.setMaBienNhan(maBienNhan);
	}

	/**
	* Returns the thu tuc hanh chinh ID of this phieu xu ly chinh ho so thu tuc.
	*
	* @return the thu tuc hanh chinh ID of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public long getThuTucHanhChinhId() {
		return _phieuXuLyChinhHoSoThuTuc.getThuTucHanhChinhId();
	}

	/**
	* Sets the thu tuc hanh chinh ID of this phieu xu ly chinh ho so thu tuc.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public void setThuTucHanhChinhId(long thuTucHanhChinhId) {
		_phieuXuLyChinhHoSoThuTuc.setThuTucHanhChinhId(thuTucHanhChinhId);
	}

	/**
	* Returns the ten chu ho so of this phieu xu ly chinh ho so thu tuc.
	*
	* @return the ten chu ho so of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public java.lang.String getTenChuHoSo() {
		return _phieuXuLyChinhHoSoThuTuc.getTenChuHoSo();
	}

	/**
	* Sets the ten chu ho so of this phieu xu ly chinh ho so thu tuc.
	*
	* @param tenChuHoSo the ten chu ho so of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public void setTenChuHoSo(java.lang.String tenChuHoSo) {
		_phieuXuLyChinhHoSoThuTuc.setTenChuHoSo(tenChuHoSo);
	}

	/**
	* Returns the ngay gui ho so of this phieu xu ly chinh ho so thu tuc.
	*
	* @return the ngay gui ho so of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public java.util.Date getNgayGuiHoSo() {
		return _phieuXuLyChinhHoSoThuTuc.getNgayGuiHoSo();
	}

	/**
	* Sets the ngay gui ho so of this phieu xu ly chinh ho so thu tuc.
	*
	* @param ngayGuiHoSo the ngay gui ho so of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public void setNgayGuiHoSo(java.util.Date ngayGuiHoSo) {
		_phieuXuLyChinhHoSoThuTuc.setNgayGuiHoSo(ngayGuiHoSo);
	}

	/**
	* Returns the ten don vi tiep nhan of this phieu xu ly chinh ho so thu tuc.
	*
	* @return the ten don vi tiep nhan of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public java.lang.String getTenDonViTiepNhan() {
		return _phieuXuLyChinhHoSoThuTuc.getTenDonViTiepNhan();
	}

	/**
	* Sets the ten don vi tiep nhan of this phieu xu ly chinh ho so thu tuc.
	*
	* @param tenDonViTiepNhan the ten don vi tiep nhan of this phieu xu ly chinh ho so thu tuc
	*/
	@Override
	public void setTenDonViTiepNhan(java.lang.String tenDonViTiepNhan) {
		_phieuXuLyChinhHoSoThuTuc.setTenDonViTiepNhan(tenDonViTiepNhan);
	}

	@Override
	public boolean isNew() {
		return _phieuXuLyChinhHoSoThuTuc.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_phieuXuLyChinhHoSoThuTuc.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _phieuXuLyChinhHoSoThuTuc.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_phieuXuLyChinhHoSoThuTuc.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _phieuXuLyChinhHoSoThuTuc.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _phieuXuLyChinhHoSoThuTuc.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_phieuXuLyChinhHoSoThuTuc.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _phieuXuLyChinhHoSoThuTuc.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_phieuXuLyChinhHoSoThuTuc.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_phieuXuLyChinhHoSoThuTuc.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_phieuXuLyChinhHoSoThuTuc.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PhieuXuLyChinhHoSoThuTucWrapper((PhieuXuLyChinhHoSoThuTuc)_phieuXuLyChinhHoSoThuTuc.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.motcua.model.PhieuXuLyChinhHoSoThuTuc phieuXuLyChinhHoSoThuTuc) {
		return _phieuXuLyChinhHoSoThuTuc.compareTo(phieuXuLyChinhHoSoThuTuc);
	}

	@Override
	public int hashCode() {
		return _phieuXuLyChinhHoSoThuTuc.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.motcua.model.PhieuXuLyChinhHoSoThuTuc> toCacheModel() {
		return _phieuXuLyChinhHoSoThuTuc.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.PhieuXuLyChinhHoSoThuTuc toEscapedModel() {
		return new PhieuXuLyChinhHoSoThuTucWrapper(_phieuXuLyChinhHoSoThuTuc.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.PhieuXuLyChinhHoSoThuTuc toUnescapedModel() {
		return new PhieuXuLyChinhHoSoThuTucWrapper(_phieuXuLyChinhHoSoThuTuc.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _phieuXuLyChinhHoSoThuTuc.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _phieuXuLyChinhHoSoThuTuc.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_phieuXuLyChinhHoSoThuTuc.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PhieuXuLyChinhHoSoThuTucWrapper)) {
			return false;
		}

		PhieuXuLyChinhHoSoThuTucWrapper phieuXuLyChinhHoSoThuTucWrapper = (PhieuXuLyChinhHoSoThuTucWrapper)obj;

		if (Validator.equals(_phieuXuLyChinhHoSoThuTuc,
					phieuXuLyChinhHoSoThuTucWrapper._phieuXuLyChinhHoSoThuTuc)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PhieuXuLyChinhHoSoThuTuc getWrappedPhieuXuLyChinhHoSoThuTuc() {
		return _phieuXuLyChinhHoSoThuTuc;
	}

	@Override
	public PhieuXuLyChinhHoSoThuTuc getWrappedModel() {
		return _phieuXuLyChinhHoSoThuTuc;
	}

	@Override
	public void resetOriginalValues() {
		_phieuXuLyChinhHoSoThuTuc.resetOriginalValues();
	}

	private PhieuXuLyChinhHoSoThuTuc _phieuXuLyChinhHoSoThuTuc;
}