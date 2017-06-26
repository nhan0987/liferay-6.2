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
 * This class is a wrapper for {@link TthcNoidungHoSo}.
 * </p>
 *
 * @author win_64
 * @see TthcNoidungHoSo
 * @generated
 */
public class TthcNoidungHoSoWrapper implements TthcNoidungHoSo,
	ModelWrapper<TthcNoidungHoSo> {
	public TthcNoidungHoSoWrapper(TthcNoidungHoSo tthcNoidungHoSo) {
		_tthcNoidungHoSo = tthcNoidungHoSo;
	}

	@Override
	public Class<?> getModelClass() {
		return TthcNoidungHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return TthcNoidungHoSo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("MaTuSinh", getMaTuSinh());
		attributes.put("HoSoThuTucId", getHoSoThuTucId());
		attributes.put("TenTaiLieu", getTenTaiLieu());
		attributes.put("TaiLieuDinhKem", getTaiLieuDinhKem());
		attributes.put("NoiDungXml", getNoiDungXml());
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

		String NoiDungXml = (String)attributes.get("NoiDungXml");

		if (NoiDungXml != null) {
			setNoiDungXml(NoiDungXml);
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
	* Returns the primary key of this tthc noidung ho so.
	*
	* @return the primary key of this tthc noidung ho so
	*/
	@Override
	public long getPrimaryKey() {
		return _tthcNoidungHoSo.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tthc noidung ho so.
	*
	* @param primaryKey the primary key of this tthc noidung ho so
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tthcNoidungHoSo.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tthc noidung ho so.
	*
	* @return the ID of this tthc noidung ho so
	*/
	@Override
	public long getId() {
		return _tthcNoidungHoSo.getId();
	}

	/**
	* Sets the ID of this tthc noidung ho so.
	*
	* @param Id the ID of this tthc noidung ho so
	*/
	@Override
	public void setId(long Id) {
		_tthcNoidungHoSo.setId(Id);
	}

	/**
	* Returns the ma tu sinh of this tthc noidung ho so.
	*
	* @return the ma tu sinh of this tthc noidung ho so
	*/
	@Override
	public java.lang.String getMaTuSinh() {
		return _tthcNoidungHoSo.getMaTuSinh();
	}

	/**
	* Sets the ma tu sinh of this tthc noidung ho so.
	*
	* @param MaTuSinh the ma tu sinh of this tthc noidung ho so
	*/
	@Override
	public void setMaTuSinh(java.lang.String MaTuSinh) {
		_tthcNoidungHoSo.setMaTuSinh(MaTuSinh);
	}

	/**
	* Returns the ho so thu tuc ID of this tthc noidung ho so.
	*
	* @return the ho so thu tuc ID of this tthc noidung ho so
	*/
	@Override
	public long getHoSoThuTucId() {
		return _tthcNoidungHoSo.getHoSoThuTucId();
	}

	/**
	* Sets the ho so thu tuc ID of this tthc noidung ho so.
	*
	* @param HoSoThuTucId the ho so thu tuc ID of this tthc noidung ho so
	*/
	@Override
	public void setHoSoThuTucId(long HoSoThuTucId) {
		_tthcNoidungHoSo.setHoSoThuTucId(HoSoThuTucId);
	}

	/**
	* Returns the ten tai lieu of this tthc noidung ho so.
	*
	* @return the ten tai lieu of this tthc noidung ho so
	*/
	@Override
	public java.lang.String getTenTaiLieu() {
		return _tthcNoidungHoSo.getTenTaiLieu();
	}

	/**
	* Sets the ten tai lieu of this tthc noidung ho so.
	*
	* @param TenTaiLieu the ten tai lieu of this tthc noidung ho so
	*/
	@Override
	public void setTenTaiLieu(java.lang.String TenTaiLieu) {
		_tthcNoidungHoSo.setTenTaiLieu(TenTaiLieu);
	}

	/**
	* Returns the tai lieu dinh kem of this tthc noidung ho so.
	*
	* @return the tai lieu dinh kem of this tthc noidung ho so
	*/
	@Override
	public long getTaiLieuDinhKem() {
		return _tthcNoidungHoSo.getTaiLieuDinhKem();
	}

	/**
	* Sets the tai lieu dinh kem of this tthc noidung ho so.
	*
	* @param TaiLieuDinhKem the tai lieu dinh kem of this tthc noidung ho so
	*/
	@Override
	public void setTaiLieuDinhKem(long TaiLieuDinhKem) {
		_tthcNoidungHoSo.setTaiLieuDinhKem(TaiLieuDinhKem);
	}

	/**
	* Returns the noi dung xml of this tthc noidung ho so.
	*
	* @return the noi dung xml of this tthc noidung ho so
	*/
	@Override
	public java.lang.String getNoiDungXml() {
		return _tthcNoidungHoSo.getNoiDungXml();
	}

	/**
	* Sets the noi dung xml of this tthc noidung ho so.
	*
	* @param NoiDungXml the noi dung xml of this tthc noidung ho so
	*/
	@Override
	public void setNoiDungXml(java.lang.String NoiDungXml) {
		_tthcNoidungHoSo.setNoiDungXml(NoiDungXml);
	}

	/**
	* Returns the noi dung file of this tthc noidung ho so.
	*
	* @return the noi dung file of this tthc noidung ho so
	*/
	@Override
	public java.lang.String getNoiDungFile() {
		return _tthcNoidungHoSo.getNoiDungFile();
	}

	/**
	* Sets the noi dung file of this tthc noidung ho so.
	*
	* @param noiDungFile the noi dung file of this tthc noidung ho so
	*/
	@Override
	public void setNoiDungFile(java.lang.String noiDungFile) {
		_tthcNoidungHoSo.setNoiDungFile(noiDungFile);
	}

	/**
	* Returns the bieu mau ho so ID of this tthc noidung ho so.
	*
	* @return the bieu mau ho so ID of this tthc noidung ho so
	*/
	@Override
	public long getBieuMauHoSoId() {
		return _tthcNoidungHoSo.getBieuMauHoSoId();
	}

	/**
	* Sets the bieu mau ho so ID of this tthc noidung ho so.
	*
	* @param BieuMauHoSoId the bieu mau ho so ID of this tthc noidung ho so
	*/
	@Override
	public void setBieuMauHoSoId(long BieuMauHoSoId) {
		_tthcNoidungHoSo.setBieuMauHoSoId(BieuMauHoSoId);
	}

	/**
	* Returns the ngay gui nhan of this tthc noidung ho so.
	*
	* @return the ngay gui nhan of this tthc noidung ho so
	*/
	@Override
	public java.util.Date getNgayGuiNhan() {
		return _tthcNoidungHoSo.getNgayGuiNhan();
	}

	/**
	* Sets the ngay gui nhan of this tthc noidung ho so.
	*
	* @param NgayGuiNhan the ngay gui nhan of this tthc noidung ho so
	*/
	@Override
	public void setNgayGuiNhan(java.util.Date NgayGuiNhan) {
		_tthcNoidungHoSo.setNgayGuiNhan(NgayGuiNhan);
	}

	/**
	* Returns the loai tai lieu of this tthc noidung ho so.
	*
	* @return the loai tai lieu of this tthc noidung ho so
	*/
	@Override
	public long getLoaiTaiLieu() {
		return _tthcNoidungHoSo.getLoaiTaiLieu();
	}

	/**
	* Sets the loai tai lieu of this tthc noidung ho so.
	*
	* @param LoaiTaiLieu the loai tai lieu of this tthc noidung ho so
	*/
	@Override
	public void setLoaiTaiLieu(long LoaiTaiLieu) {
		_tthcNoidungHoSo.setLoaiTaiLieu(LoaiTaiLieu);
	}

	/**
	* Returns the ngay tao of this tthc noidung ho so.
	*
	* @return the ngay tao of this tthc noidung ho so
	*/
	@Override
	public java.util.Date getNgayTao() {
		return _tthcNoidungHoSo.getNgayTao();
	}

	/**
	* Sets the ngay tao of this tthc noidung ho so.
	*
	* @param NgayTao the ngay tao of this tthc noidung ho so
	*/
	@Override
	public void setNgayTao(java.util.Date NgayTao) {
		_tthcNoidungHoSo.setNgayTao(NgayTao);
	}

	/**
	* Returns the nguoi tao of this tthc noidung ho so.
	*
	* @return the nguoi tao of this tthc noidung ho so
	*/
	@Override
	public long getNguoiTao() {
		return _tthcNoidungHoSo.getNguoiTao();
	}

	/**
	* Sets the nguoi tao of this tthc noidung ho so.
	*
	* @param NguoiTao the nguoi tao of this tthc noidung ho so
	*/
	@Override
	public void setNguoiTao(long NguoiTao) {
		_tthcNoidungHoSo.setNguoiTao(NguoiTao);
	}

	/**
	* Returns the da cap nhat of this tthc noidung ho so.
	*
	* @return the da cap nhat of this tthc noidung ho so
	*/
	@Override
	public long getDaCapNhat() {
		return _tthcNoidungHoSo.getDaCapNhat();
	}

	/**
	* Sets the da cap nhat of this tthc noidung ho so.
	*
	* @param daCapNhat the da cap nhat of this tthc noidung ho so
	*/
	@Override
	public void setDaCapNhat(long daCapNhat) {
		_tthcNoidungHoSo.setDaCapNhat(daCapNhat);
	}

	/**
	* Returns the lan gui cuoi of this tthc noidung ho so.
	*
	* @return the lan gui cuoi of this tthc noidung ho so
	*/
	@Override
	public long getLanGuiCuoi() {
		return _tthcNoidungHoSo.getLanGuiCuoi();
	}

	/**
	* Sets the lan gui cuoi of this tthc noidung ho so.
	*
	* @param lanGuiCuoi the lan gui cuoi of this tthc noidung ho so
	*/
	@Override
	public void setLanGuiCuoi(long lanGuiCuoi) {
		_tthcNoidungHoSo.setLanGuiCuoi(lanGuiCuoi);
	}

	/**
	* Returns the vehicle record ID of this tthc noidung ho so.
	*
	* @return the vehicle record ID of this tthc noidung ho so
	*/
	@Override
	public long getVehicleRecordId() {
		return _tthcNoidungHoSo.getVehicleRecordId();
	}

	/**
	* Sets the vehicle record ID of this tthc noidung ho so.
	*
	* @param vehicleRecordId the vehicle record ID of this tthc noidung ho so
	*/
	@Override
	public void setVehicleRecordId(long vehicleRecordId) {
		_tthcNoidungHoSo.setVehicleRecordId(vehicleRecordId);
	}

	@Override
	public boolean isNew() {
		return _tthcNoidungHoSo.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tthcNoidungHoSo.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tthcNoidungHoSo.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tthcNoidungHoSo.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tthcNoidungHoSo.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tthcNoidungHoSo.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tthcNoidungHoSo.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tthcNoidungHoSo.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tthcNoidungHoSo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tthcNoidungHoSo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tthcNoidungHoSo.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TthcNoidungHoSoWrapper((TthcNoidungHoSo)_tthcNoidungHoSo.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo tthcNoidungHoSo) {
		return _tthcNoidungHoSo.compareTo(tthcNoidungHoSo);
	}

	@Override
	public int hashCode() {
		return _tthcNoidungHoSo.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> toCacheModel() {
		return _tthcNoidungHoSo.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo toEscapedModel() {
		return new TthcNoidungHoSoWrapper(_tthcNoidungHoSo.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo toUnescapedModel() {
		return new TthcNoidungHoSoWrapper(_tthcNoidungHoSo.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tthcNoidungHoSo.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tthcNoidungHoSo.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tthcNoidungHoSo.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TthcNoidungHoSoWrapper)) {
			return false;
		}

		TthcNoidungHoSoWrapper tthcNoidungHoSoWrapper = (TthcNoidungHoSoWrapper)obj;

		if (Validator.equals(_tthcNoidungHoSo,
					tthcNoidungHoSoWrapper._tthcNoidungHoSo)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TthcNoidungHoSo getWrappedTthcNoidungHoSo() {
		return _tthcNoidungHoSo;
	}

	@Override
	public TthcNoidungHoSo getWrappedModel() {
		return _tthcNoidungHoSo;
	}

	@Override
	public void resetOriginalValues() {
		_tthcNoidungHoSo.resetOriginalValues();
	}

	private TthcNoidungHoSo _tthcNoidungHoSo;
}