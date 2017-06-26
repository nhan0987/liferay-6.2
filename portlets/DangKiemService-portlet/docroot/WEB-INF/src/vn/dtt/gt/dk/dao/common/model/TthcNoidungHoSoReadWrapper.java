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
 * This class is a wrapper for {@link TthcNoidungHoSoRead}.
 * </p>
 *
 * @author huymq
 * @see TthcNoidungHoSoRead
 * @generated
 */
public class TthcNoidungHoSoReadWrapper implements TthcNoidungHoSoRead,
	ModelWrapper<TthcNoidungHoSoRead> {
	public TthcNoidungHoSoReadWrapper(TthcNoidungHoSoRead tthcNoidungHoSoRead) {
		_tthcNoidungHoSoRead = tthcNoidungHoSoRead;
	}

	@Override
	public Class<?> getModelClass() {
		return TthcNoidungHoSoRead.class;
	}

	@Override
	public String getModelClassName() {
		return TthcNoidungHoSoRead.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("MaTuSinh", getMaTuSinh());
		attributes.put("HoSoThuTucId", getHoSoThuTucId());
		attributes.put("TenTaiLieu", getTenTaiLieu());
		attributes.put("TaiLieuDinhKem", getTaiLieuDinhKem());
		attributes.put("noiDungFile", getNoiDungFile());
		attributes.put("BieuMauHoSoId", getBieuMauHoSoId());
		attributes.put("NgayGuiNhan", getNgayGuiNhan());
		attributes.put("LoaiTaiLieu", getLoaiTaiLieu());
		attributes.put("NgayTao", getNgayTao());
		attributes.put("NguoiTao", getNguoiTao());
		attributes.put("daCapNhat", getDaCapNhat());
		attributes.put("lanGuiCuoi", getLanGuiCuoi());
		attributes.put("vehicleRecordId", getVehicleRecordId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String MaTuSinh = (String)attributes.get("MaTuSinh");

		if (MaTuSinh != null) {
			setMaTuSinh(MaTuSinh);
		}

		Long HoSoThuTucId = (Long)attributes.get("HoSoThuTucId");

		if (HoSoThuTucId != null) {
			setHoSoThuTucId(HoSoThuTucId);
		}

		String TenTaiLieu = (String)attributes.get("TenTaiLieu");

		if (TenTaiLieu != null) {
			setTenTaiLieu(TenTaiLieu);
		}

		Long TaiLieuDinhKem = (Long)attributes.get("TaiLieuDinhKem");

		if (TaiLieuDinhKem != null) {
			setTaiLieuDinhKem(TaiLieuDinhKem);
		}

		String noiDungFile = (String)attributes.get("noiDungFile");

		if (noiDungFile != null) {
			setNoiDungFile(noiDungFile);
		}

		Long BieuMauHoSoId = (Long)attributes.get("BieuMauHoSoId");

		if (BieuMauHoSoId != null) {
			setBieuMauHoSoId(BieuMauHoSoId);
		}

		Date NgayGuiNhan = (Date)attributes.get("NgayGuiNhan");

		if (NgayGuiNhan != null) {
			setNgayGuiNhan(NgayGuiNhan);
		}

		Long LoaiTaiLieu = (Long)attributes.get("LoaiTaiLieu");

		if (LoaiTaiLieu != null) {
			setLoaiTaiLieu(LoaiTaiLieu);
		}

		Date NgayTao = (Date)attributes.get("NgayTao");

		if (NgayTao != null) {
			setNgayTao(NgayTao);
		}

		Long NguoiTao = (Long)attributes.get("NguoiTao");

		if (NguoiTao != null) {
			setNguoiTao(NguoiTao);
		}

		Long daCapNhat = (Long)attributes.get("daCapNhat");

		if (daCapNhat != null) {
			setDaCapNhat(daCapNhat);
		}

		Long lanGuiCuoi = (Long)attributes.get("lanGuiCuoi");

		if (lanGuiCuoi != null) {
			setLanGuiCuoi(lanGuiCuoi);
		}

		Long vehicleRecordId = (Long)attributes.get("vehicleRecordId");

		if (vehicleRecordId != null) {
			setVehicleRecordId(vehicleRecordId);
		}
	}

	/**
	* Returns the primary key of this tthc noidung ho so read.
	*
	* @return the primary key of this tthc noidung ho so read
	*/
	@Override
	public long getPrimaryKey() {
		return _tthcNoidungHoSoRead.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tthc noidung ho so read.
	*
	* @param primaryKey the primary key of this tthc noidung ho so read
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tthcNoidungHoSoRead.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tthc noidung ho so read.
	*
	* @return the ID of this tthc noidung ho so read
	*/
	@Override
	public long getId() {
		return _tthcNoidungHoSoRead.getId();
	}

	/**
	* Sets the ID of this tthc noidung ho so read.
	*
	* @param Id the ID of this tthc noidung ho so read
	*/
	@Override
	public void setId(long Id) {
		_tthcNoidungHoSoRead.setId(Id);
	}

	/**
	* Returns the ma tu sinh of this tthc noidung ho so read.
	*
	* @return the ma tu sinh of this tthc noidung ho so read
	*/
	@Override
	public java.lang.String getMaTuSinh() {
		return _tthcNoidungHoSoRead.getMaTuSinh();
	}

	/**
	* Sets the ma tu sinh of this tthc noidung ho so read.
	*
	* @param MaTuSinh the ma tu sinh of this tthc noidung ho so read
	*/
	@Override
	public void setMaTuSinh(java.lang.String MaTuSinh) {
		_tthcNoidungHoSoRead.setMaTuSinh(MaTuSinh);
	}

	/**
	* Returns the ho so thu tuc ID of this tthc noidung ho so read.
	*
	* @return the ho so thu tuc ID of this tthc noidung ho so read
	*/
	@Override
	public long getHoSoThuTucId() {
		return _tthcNoidungHoSoRead.getHoSoThuTucId();
	}

	/**
	* Sets the ho so thu tuc ID of this tthc noidung ho so read.
	*
	* @param HoSoThuTucId the ho so thu tuc ID of this tthc noidung ho so read
	*/
	@Override
	public void setHoSoThuTucId(long HoSoThuTucId) {
		_tthcNoidungHoSoRead.setHoSoThuTucId(HoSoThuTucId);
	}

	/**
	* Returns the ten tai lieu of this tthc noidung ho so read.
	*
	* @return the ten tai lieu of this tthc noidung ho so read
	*/
	@Override
	public java.lang.String getTenTaiLieu() {
		return _tthcNoidungHoSoRead.getTenTaiLieu();
	}

	/**
	* Sets the ten tai lieu of this tthc noidung ho so read.
	*
	* @param TenTaiLieu the ten tai lieu of this tthc noidung ho so read
	*/
	@Override
	public void setTenTaiLieu(java.lang.String TenTaiLieu) {
		_tthcNoidungHoSoRead.setTenTaiLieu(TenTaiLieu);
	}

	/**
	* Returns the tai lieu dinh kem of this tthc noidung ho so read.
	*
	* @return the tai lieu dinh kem of this tthc noidung ho so read
	*/
	@Override
	public long getTaiLieuDinhKem() {
		return _tthcNoidungHoSoRead.getTaiLieuDinhKem();
	}

	/**
	* Sets the tai lieu dinh kem of this tthc noidung ho so read.
	*
	* @param TaiLieuDinhKem the tai lieu dinh kem of this tthc noidung ho so read
	*/
	@Override
	public void setTaiLieuDinhKem(long TaiLieuDinhKem) {
		_tthcNoidungHoSoRead.setTaiLieuDinhKem(TaiLieuDinhKem);
	}

	/**
	* Returns the noi dung file of this tthc noidung ho so read.
	*
	* @return the noi dung file of this tthc noidung ho so read
	*/
	@Override
	public java.lang.String getNoiDungFile() {
		return _tthcNoidungHoSoRead.getNoiDungFile();
	}

	/**
	* Sets the noi dung file of this tthc noidung ho so read.
	*
	* @param noiDungFile the noi dung file of this tthc noidung ho so read
	*/
	@Override
	public void setNoiDungFile(java.lang.String noiDungFile) {
		_tthcNoidungHoSoRead.setNoiDungFile(noiDungFile);
	}

	/**
	* Returns the bieu mau ho so ID of this tthc noidung ho so read.
	*
	* @return the bieu mau ho so ID of this tthc noidung ho so read
	*/
	@Override
	public long getBieuMauHoSoId() {
		return _tthcNoidungHoSoRead.getBieuMauHoSoId();
	}

	/**
	* Sets the bieu mau ho so ID of this tthc noidung ho so read.
	*
	* @param BieuMauHoSoId the bieu mau ho so ID of this tthc noidung ho so read
	*/
	@Override
	public void setBieuMauHoSoId(long BieuMauHoSoId) {
		_tthcNoidungHoSoRead.setBieuMauHoSoId(BieuMauHoSoId);
	}

	/**
	* Returns the ngay gui nhan of this tthc noidung ho so read.
	*
	* @return the ngay gui nhan of this tthc noidung ho so read
	*/
	@Override
	public java.util.Date getNgayGuiNhan() {
		return _tthcNoidungHoSoRead.getNgayGuiNhan();
	}

	/**
	* Sets the ngay gui nhan of this tthc noidung ho so read.
	*
	* @param NgayGuiNhan the ngay gui nhan of this tthc noidung ho so read
	*/
	@Override
	public void setNgayGuiNhan(java.util.Date NgayGuiNhan) {
		_tthcNoidungHoSoRead.setNgayGuiNhan(NgayGuiNhan);
	}

	/**
	* Returns the loai tai lieu of this tthc noidung ho so read.
	*
	* @return the loai tai lieu of this tthc noidung ho so read
	*/
	@Override
	public long getLoaiTaiLieu() {
		return _tthcNoidungHoSoRead.getLoaiTaiLieu();
	}

	/**
	* Sets the loai tai lieu of this tthc noidung ho so read.
	*
	* @param LoaiTaiLieu the loai tai lieu of this tthc noidung ho so read
	*/
	@Override
	public void setLoaiTaiLieu(long LoaiTaiLieu) {
		_tthcNoidungHoSoRead.setLoaiTaiLieu(LoaiTaiLieu);
	}

	/**
	* Returns the ngay tao of this tthc noidung ho so read.
	*
	* @return the ngay tao of this tthc noidung ho so read
	*/
	@Override
	public java.util.Date getNgayTao() {
		return _tthcNoidungHoSoRead.getNgayTao();
	}

	/**
	* Sets the ngay tao of this tthc noidung ho so read.
	*
	* @param NgayTao the ngay tao of this tthc noidung ho so read
	*/
	@Override
	public void setNgayTao(java.util.Date NgayTao) {
		_tthcNoidungHoSoRead.setNgayTao(NgayTao);
	}

	/**
	* Returns the nguoi tao of this tthc noidung ho so read.
	*
	* @return the nguoi tao of this tthc noidung ho so read
	*/
	@Override
	public long getNguoiTao() {
		return _tthcNoidungHoSoRead.getNguoiTao();
	}

	/**
	* Sets the nguoi tao of this tthc noidung ho so read.
	*
	* @param NguoiTao the nguoi tao of this tthc noidung ho so read
	*/
	@Override
	public void setNguoiTao(long NguoiTao) {
		_tthcNoidungHoSoRead.setNguoiTao(NguoiTao);
	}

	/**
	* Returns the da cap nhat of this tthc noidung ho so read.
	*
	* @return the da cap nhat of this tthc noidung ho so read
	*/
	@Override
	public long getDaCapNhat() {
		return _tthcNoidungHoSoRead.getDaCapNhat();
	}

	/**
	* Sets the da cap nhat of this tthc noidung ho so read.
	*
	* @param daCapNhat the da cap nhat of this tthc noidung ho so read
	*/
	@Override
	public void setDaCapNhat(long daCapNhat) {
		_tthcNoidungHoSoRead.setDaCapNhat(daCapNhat);
	}

	/**
	* Returns the lan gui cuoi of this tthc noidung ho so read.
	*
	* @return the lan gui cuoi of this tthc noidung ho so read
	*/
	@Override
	public long getLanGuiCuoi() {
		return _tthcNoidungHoSoRead.getLanGuiCuoi();
	}

	/**
	* Sets the lan gui cuoi of this tthc noidung ho so read.
	*
	* @param lanGuiCuoi the lan gui cuoi of this tthc noidung ho so read
	*/
	@Override
	public void setLanGuiCuoi(long lanGuiCuoi) {
		_tthcNoidungHoSoRead.setLanGuiCuoi(lanGuiCuoi);
	}

	/**
	* Returns the vehicle record ID of this tthc noidung ho so read.
	*
	* @return the vehicle record ID of this tthc noidung ho so read
	*/
	@Override
	public long getVehicleRecordId() {
		return _tthcNoidungHoSoRead.getVehicleRecordId();
	}

	/**
	* Sets the vehicle record ID of this tthc noidung ho so read.
	*
	* @param vehicleRecordId the vehicle record ID of this tthc noidung ho so read
	*/
	@Override
	public void setVehicleRecordId(long vehicleRecordId) {
		_tthcNoidungHoSoRead.setVehicleRecordId(vehicleRecordId);
	}

	@Override
	public boolean isNew() {
		return _tthcNoidungHoSoRead.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tthcNoidungHoSoRead.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tthcNoidungHoSoRead.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tthcNoidungHoSoRead.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tthcNoidungHoSoRead.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tthcNoidungHoSoRead.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tthcNoidungHoSoRead.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tthcNoidungHoSoRead.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tthcNoidungHoSoRead.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tthcNoidungHoSoRead.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tthcNoidungHoSoRead.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TthcNoidungHoSoReadWrapper((TthcNoidungHoSoRead)_tthcNoidungHoSoRead.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSoRead tthcNoidungHoSoRead) {
		return _tthcNoidungHoSoRead.compareTo(tthcNoidungHoSoRead);
	}

	@Override
	public int hashCode() {
		return _tthcNoidungHoSoRead.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSoRead> toCacheModel() {
		return _tthcNoidungHoSoRead.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSoRead toEscapedModel() {
		return new TthcNoidungHoSoReadWrapper(_tthcNoidungHoSoRead.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSoRead toUnescapedModel() {
		return new TthcNoidungHoSoReadWrapper(_tthcNoidungHoSoRead.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tthcNoidungHoSoRead.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tthcNoidungHoSoRead.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tthcNoidungHoSoRead.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TthcNoidungHoSoReadWrapper)) {
			return false;
		}

		TthcNoidungHoSoReadWrapper tthcNoidungHoSoReadWrapper = (TthcNoidungHoSoReadWrapper)obj;

		if (Validator.equals(_tthcNoidungHoSoRead,
					tthcNoidungHoSoReadWrapper._tthcNoidungHoSoRead)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TthcNoidungHoSoRead getWrappedTthcNoidungHoSoRead() {
		return _tthcNoidungHoSoRead;
	}

	@Override
	public TthcNoidungHoSoRead getWrappedModel() {
		return _tthcNoidungHoSoRead;
	}

	@Override
	public void resetOriginalValues() {
		_tthcNoidungHoSoRead.resetOriginalValues();
	}

	private TthcNoidungHoSoRead _tthcNoidungHoSoRead;
}