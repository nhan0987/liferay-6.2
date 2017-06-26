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
 * This class is a wrapper for {@link MotCuaPhieuXuLyChinh}.
 * </p>
 *
 * @author win_64
 * @see MotCuaPhieuXuLyChinh
 * @generated
 */
public class MotCuaPhieuXuLyChinhWrapper implements MotCuaPhieuXuLyChinh,
	ModelWrapper<MotCuaPhieuXuLyChinh> {
	public MotCuaPhieuXuLyChinhWrapper(
		MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh) {
		_motCuaPhieuXuLyChinh = motCuaPhieuXuLyChinh;
	}

	@Override
	public Class<?> getModelClass() {
		return MotCuaPhieuXuLyChinh.class;
	}

	@Override
	public String getModelClassName() {
		return MotCuaPhieuXuLyChinh.class.getName();
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
	}

	/**
	* Returns the primary key of this mot cua phieu xu ly chinh.
	*
	* @return the primary key of this mot cua phieu xu ly chinh
	*/
	@Override
	public long getPrimaryKey() {
		return _motCuaPhieuXuLyChinh.getPrimaryKey();
	}

	/**
	* Sets the primary key of this mot cua phieu xu ly chinh.
	*
	* @param primaryKey the primary key of this mot cua phieu xu ly chinh
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_motCuaPhieuXuLyChinh.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this mot cua phieu xu ly chinh.
	*
	* @return the ID of this mot cua phieu xu ly chinh
	*/
	@Override
	public long getId() {
		return _motCuaPhieuXuLyChinh.getId();
	}

	/**
	* Sets the ID of this mot cua phieu xu ly chinh.
	*
	* @param id the ID of this mot cua phieu xu ly chinh
	*/
	@Override
	public void setId(long id) {
		_motCuaPhieuXuLyChinh.setId(id);
	}

	/**
	* Returns the ho so thu tuc ID of this mot cua phieu xu ly chinh.
	*
	* @return the ho so thu tuc ID of this mot cua phieu xu ly chinh
	*/
	@Override
	public long getHoSoThuTucId() {
		return _motCuaPhieuXuLyChinh.getHoSoThuTucId();
	}

	/**
	* Sets the ho so thu tuc ID of this mot cua phieu xu ly chinh.
	*
	* @param hoSoThuTucId the ho so thu tuc ID of this mot cua phieu xu ly chinh
	*/
	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_motCuaPhieuXuLyChinh.setHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the quy trinh thu tuc ID of this mot cua phieu xu ly chinh.
	*
	* @return the quy trinh thu tuc ID of this mot cua phieu xu ly chinh
	*/
	@Override
	public long getQuyTrinhThuTucId() {
		return _motCuaPhieuXuLyChinh.getQuyTrinhThuTucId();
	}

	/**
	* Sets the quy trinh thu tuc ID of this mot cua phieu xu ly chinh.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID of this mot cua phieu xu ly chinh
	*/
	@Override
	public void setQuyTrinhThuTucId(long quyTrinhThuTucId) {
		_motCuaPhieuXuLyChinh.setQuyTrinhThuTucId(quyTrinhThuTucId);
	}

	/**
	* Returns the ten nguoi nop of this mot cua phieu xu ly chinh.
	*
	* @return the ten nguoi nop of this mot cua phieu xu ly chinh
	*/
	@Override
	public java.lang.String getTenNguoiNop() {
		return _motCuaPhieuXuLyChinh.getTenNguoiNop();
	}

	/**
	* Sets the ten nguoi nop of this mot cua phieu xu ly chinh.
	*
	* @param tenNguoiNop the ten nguoi nop of this mot cua phieu xu ly chinh
	*/
	@Override
	public void setTenNguoiNop(java.lang.String tenNguoiNop) {
		_motCuaPhieuXuLyChinh.setTenNguoiNop(tenNguoiNop);
	}

	/**
	* Returns the cmnd nguoi nop of this mot cua phieu xu ly chinh.
	*
	* @return the cmnd nguoi nop of this mot cua phieu xu ly chinh
	*/
	@Override
	public java.lang.String getCmndNguoiNop() {
		return _motCuaPhieuXuLyChinh.getCmndNguoiNop();
	}

	/**
	* Sets the cmnd nguoi nop of this mot cua phieu xu ly chinh.
	*
	* @param cmndNguoiNop the cmnd nguoi nop of this mot cua phieu xu ly chinh
	*/
	@Override
	public void setCmndNguoiNop(java.lang.String cmndNguoiNop) {
		_motCuaPhieuXuLyChinh.setCmndNguoiNop(cmndNguoiNop);
	}

	/**
	* Returns the dia chi nguoi nop of this mot cua phieu xu ly chinh.
	*
	* @return the dia chi nguoi nop of this mot cua phieu xu ly chinh
	*/
	@Override
	public java.lang.String getDiaChiNguoiNop() {
		return _motCuaPhieuXuLyChinh.getDiaChiNguoiNop();
	}

	/**
	* Sets the dia chi nguoi nop of this mot cua phieu xu ly chinh.
	*
	* @param diaChiNguoiNop the dia chi nguoi nop of this mot cua phieu xu ly chinh
	*/
	@Override
	public void setDiaChiNguoiNop(java.lang.String diaChiNguoiNop) {
		_motCuaPhieuXuLyChinh.setDiaChiNguoiNop(diaChiNguoiNop);
	}

	/**
	* Returns the so dtdd nguoi nop of this mot cua phieu xu ly chinh.
	*
	* @return the so dtdd nguoi nop of this mot cua phieu xu ly chinh
	*/
	@Override
	public java.lang.String getSoDtddNguoiNop() {
		return _motCuaPhieuXuLyChinh.getSoDtddNguoiNop();
	}

	/**
	* Sets the so dtdd nguoi nop of this mot cua phieu xu ly chinh.
	*
	* @param soDtddNguoiNop the so dtdd nguoi nop of this mot cua phieu xu ly chinh
	*/
	@Override
	public void setSoDtddNguoiNop(java.lang.String soDtddNguoiNop) {
		_motCuaPhieuXuLyChinh.setSoDtddNguoiNop(soDtddNguoiNop);
	}

	/**
	* Returns the email nguoi nop of this mot cua phieu xu ly chinh.
	*
	* @return the email nguoi nop of this mot cua phieu xu ly chinh
	*/
	@Override
	public java.lang.String getEmailNguoiNop() {
		return _motCuaPhieuXuLyChinh.getEmailNguoiNop();
	}

	/**
	* Sets the email nguoi nop of this mot cua phieu xu ly chinh.
	*
	* @param emailNguoiNop the email nguoi nop of this mot cua phieu xu ly chinh
	*/
	@Override
	public void setEmailNguoiNop(java.lang.String emailNguoiNop) {
		_motCuaPhieuXuLyChinh.setEmailNguoiNop(emailNguoiNop);
	}

	/**
	* Returns the ghi chu of this mot cua phieu xu ly chinh.
	*
	* @return the ghi chu of this mot cua phieu xu ly chinh
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _motCuaPhieuXuLyChinh.getGhiChu();
	}

	/**
	* Sets the ghi chu of this mot cua phieu xu ly chinh.
	*
	* @param ghiChu the ghi chu of this mot cua phieu xu ly chinh
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_motCuaPhieuXuLyChinh.setGhiChu(ghiChu);
	}

	/**
	* Returns the trang thai hien tai ID of this mot cua phieu xu ly chinh.
	*
	* @return the trang thai hien tai ID of this mot cua phieu xu ly chinh
	*/
	@Override
	public long getTrangThaiHienTaiId() {
		return _motCuaPhieuXuLyChinh.getTrangThaiHienTaiId();
	}

	/**
	* Sets the trang thai hien tai ID of this mot cua phieu xu ly chinh.
	*
	* @param trangThaiHienTaiId the trang thai hien tai ID of this mot cua phieu xu ly chinh
	*/
	@Override
	public void setTrangThaiHienTaiId(long trangThaiHienTaiId) {
		_motCuaPhieuXuLyChinh.setTrangThaiHienTaiId(trangThaiHienTaiId);
	}

	/**
	* Returns the het ho so con of this mot cua phieu xu ly chinh.
	*
	* @return the het ho so con of this mot cua phieu xu ly chinh
	*/
	@Override
	public long getHetHoSoCon() {
		return _motCuaPhieuXuLyChinh.getHetHoSoCon();
	}

	/**
	* Sets the het ho so con of this mot cua phieu xu ly chinh.
	*
	* @param hetHoSoCon the het ho so con of this mot cua phieu xu ly chinh
	*/
	@Override
	public void setHetHoSoCon(long hetHoSoCon) {
		_motCuaPhieuXuLyChinh.setHetHoSoCon(hetHoSoCon);
	}

	/**
	* Returns the chiem quyen xu ly of this mot cua phieu xu ly chinh.
	*
	* @return the chiem quyen xu ly of this mot cua phieu xu ly chinh
	*/
	@Override
	public long getChiemQuyenXuLy() {
		return _motCuaPhieuXuLyChinh.getChiemQuyenXuLy();
	}

	/**
	* Sets the chiem quyen xu ly of this mot cua phieu xu ly chinh.
	*
	* @param chiemQuyenXuLy the chiem quyen xu ly of this mot cua phieu xu ly chinh
	*/
	@Override
	public void setChiemQuyenXuLy(long chiemQuyenXuLy) {
		_motCuaPhieuXuLyChinh.setChiemQuyenXuLy(chiemQuyenXuLy);
	}

	/**
	* Returns the ngay tao phieu of this mot cua phieu xu ly chinh.
	*
	* @return the ngay tao phieu of this mot cua phieu xu ly chinh
	*/
	@Override
	public java.util.Date getNgayTaoPhieu() {
		return _motCuaPhieuXuLyChinh.getNgayTaoPhieu();
	}

	/**
	* Sets the ngay tao phieu of this mot cua phieu xu ly chinh.
	*
	* @param ngayTaoPhieu the ngay tao phieu of this mot cua phieu xu ly chinh
	*/
	@Override
	public void setNgayTaoPhieu(java.util.Date ngayTaoPhieu) {
		_motCuaPhieuXuLyChinh.setNgayTaoPhieu(ngayTaoPhieu);
	}

	/**
	* Returns the nguoi tao phieu of this mot cua phieu xu ly chinh.
	*
	* @return the nguoi tao phieu of this mot cua phieu xu ly chinh
	*/
	@Override
	public long getNguoiTaoPhieu() {
		return _motCuaPhieuXuLyChinh.getNguoiTaoPhieu();
	}

	/**
	* Sets the nguoi tao phieu of this mot cua phieu xu ly chinh.
	*
	* @param nguoiTaoPhieu the nguoi tao phieu of this mot cua phieu xu ly chinh
	*/
	@Override
	public void setNguoiTaoPhieu(long nguoiTaoPhieu) {
		_motCuaPhieuXuLyChinh.setNguoiTaoPhieu(nguoiTaoPhieu);
	}

	/**
	* Returns the so dtcd nguoi nop of this mot cua phieu xu ly chinh.
	*
	* @return the so dtcd nguoi nop of this mot cua phieu xu ly chinh
	*/
	@Override
	public java.lang.String getSoDtcdNguoiNop() {
		return _motCuaPhieuXuLyChinh.getSoDtcdNguoiNop();
	}

	/**
	* Sets the so dtcd nguoi nop of this mot cua phieu xu ly chinh.
	*
	* @param soDtcdNguoiNop the so dtcd nguoi nop of this mot cua phieu xu ly chinh
	*/
	@Override
	public void setSoDtcdNguoiNop(java.lang.String soDtcdNguoiNop) {
		_motCuaPhieuXuLyChinh.setSoDtcdNguoiNop(soDtcdNguoiNop);
	}

	@Override
	public boolean isNew() {
		return _motCuaPhieuXuLyChinh.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_motCuaPhieuXuLyChinh.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _motCuaPhieuXuLyChinh.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_motCuaPhieuXuLyChinh.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _motCuaPhieuXuLyChinh.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _motCuaPhieuXuLyChinh.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_motCuaPhieuXuLyChinh.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _motCuaPhieuXuLyChinh.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_motCuaPhieuXuLyChinh.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_motCuaPhieuXuLyChinh.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_motCuaPhieuXuLyChinh.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MotCuaPhieuXuLyChinhWrapper((MotCuaPhieuXuLyChinh)_motCuaPhieuXuLyChinh.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh) {
		return _motCuaPhieuXuLyChinh.compareTo(motCuaPhieuXuLyChinh);
	}

	@Override
	public int hashCode() {
		return _motCuaPhieuXuLyChinh.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh> toCacheModel() {
		return _motCuaPhieuXuLyChinh.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh toEscapedModel() {
		return new MotCuaPhieuXuLyChinhWrapper(_motCuaPhieuXuLyChinh.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh toUnescapedModel() {
		return new MotCuaPhieuXuLyChinhWrapper(_motCuaPhieuXuLyChinh.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _motCuaPhieuXuLyChinh.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _motCuaPhieuXuLyChinh.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_motCuaPhieuXuLyChinh.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MotCuaPhieuXuLyChinhWrapper)) {
			return false;
		}

		MotCuaPhieuXuLyChinhWrapper motCuaPhieuXuLyChinhWrapper = (MotCuaPhieuXuLyChinhWrapper)obj;

		if (Validator.equals(_motCuaPhieuXuLyChinh,
					motCuaPhieuXuLyChinhWrapper._motCuaPhieuXuLyChinh)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public MotCuaPhieuXuLyChinh getWrappedMotCuaPhieuXuLyChinh() {
		return _motCuaPhieuXuLyChinh;
	}

	@Override
	public MotCuaPhieuXuLyChinh getWrappedModel() {
		return _motCuaPhieuXuLyChinh;
	}

	@Override
	public void resetOriginalValues() {
		_motCuaPhieuXuLyChinh.resetOriginalValues();
	}

	private MotCuaPhieuXuLyChinh _motCuaPhieuXuLyChinh;
}