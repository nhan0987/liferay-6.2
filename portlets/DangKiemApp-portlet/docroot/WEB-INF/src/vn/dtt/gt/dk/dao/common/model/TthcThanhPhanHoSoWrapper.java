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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TthcThanhPhanHoSo}.
 * </p>
 *
 * @author win_64
 * @see TthcThanhPhanHoSo
 * @generated
 */
public class TthcThanhPhanHoSoWrapper implements TthcThanhPhanHoSo,
	ModelWrapper<TthcThanhPhanHoSo> {
	public TthcThanhPhanHoSoWrapper(TthcThanhPhanHoSo tthcThanhPhanHoSo) {
		_tthcThanhPhanHoSo = tthcThanhPhanHoSo;
	}

	@Override
	public Class<?> getModelClass() {
		return TthcThanhPhanHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return TthcThanhPhanHoSo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("ThuTucHanhChinhId", getThuTucHanhChinhId());
		attributes.put("BieuMauHoSoId", getBieuMauHoSoId());
		attributes.put("ThuTuHienThi", getThuTuHienThi());
		attributes.put("LoaiThanhPhan", getLoaiThanhPhan());
		attributes.put("MauTrucTuyen", getMauTrucTuyen());
		attributes.put("SoTaiLieuDinhKem", getSoTaiLieuDinhKem());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		Long ThuTucHanhChinhId = (Long)attributes.get("ThuTucHanhChinhId");

		if (ThuTucHanhChinhId != null) {
			setThuTucHanhChinhId(ThuTucHanhChinhId);
		}

		Long BieuMauHoSoId = (Long)attributes.get("BieuMauHoSoId");

		if (BieuMauHoSoId != null) {
			setBieuMauHoSoId(BieuMauHoSoId);
		}

		Long ThuTuHienThi = (Long)attributes.get("ThuTuHienThi");

		if (ThuTuHienThi != null) {
			setThuTuHienThi(ThuTuHienThi);
		}

		Long LoaiThanhPhan = (Long)attributes.get("LoaiThanhPhan");

		if (LoaiThanhPhan != null) {
			setLoaiThanhPhan(LoaiThanhPhan);
		}

		String MauTrucTuyen = (String)attributes.get("MauTrucTuyen");

		if (MauTrucTuyen != null) {
			setMauTrucTuyen(MauTrucTuyen);
		}

		Long SoTaiLieuDinhKem = (Long)attributes.get("SoTaiLieuDinhKem");

		if (SoTaiLieuDinhKem != null) {
			setSoTaiLieuDinhKem(SoTaiLieuDinhKem);
		}
	}

	/**
	* Returns the primary key of this tthc thanh phan ho so.
	*
	* @return the primary key of this tthc thanh phan ho so
	*/
	@Override
	public long getPrimaryKey() {
		return _tthcThanhPhanHoSo.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tthc thanh phan ho so.
	*
	* @param primaryKey the primary key of this tthc thanh phan ho so
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tthcThanhPhanHoSo.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tthc thanh phan ho so.
	*
	* @return the ID of this tthc thanh phan ho so
	*/
	@Override
	public long getId() {
		return _tthcThanhPhanHoSo.getId();
	}

	/**
	* Sets the ID of this tthc thanh phan ho so.
	*
	* @param Id the ID of this tthc thanh phan ho so
	*/
	@Override
	public void setId(long Id) {
		_tthcThanhPhanHoSo.setId(Id);
	}

	/**
	* Returns the thu tuc hanh chinh ID of this tthc thanh phan ho so.
	*
	* @return the thu tuc hanh chinh ID of this tthc thanh phan ho so
	*/
	@Override
	public long getThuTucHanhChinhId() {
		return _tthcThanhPhanHoSo.getThuTucHanhChinhId();
	}

	/**
	* Sets the thu tuc hanh chinh ID of this tthc thanh phan ho so.
	*
	* @param ThuTucHanhChinhId the thu tuc hanh chinh ID of this tthc thanh phan ho so
	*/
	@Override
	public void setThuTucHanhChinhId(long ThuTucHanhChinhId) {
		_tthcThanhPhanHoSo.setThuTucHanhChinhId(ThuTucHanhChinhId);
	}

	/**
	* Returns the bieu mau ho so ID of this tthc thanh phan ho so.
	*
	* @return the bieu mau ho so ID of this tthc thanh phan ho so
	*/
	@Override
	public long getBieuMauHoSoId() {
		return _tthcThanhPhanHoSo.getBieuMauHoSoId();
	}

	/**
	* Sets the bieu mau ho so ID of this tthc thanh phan ho so.
	*
	* @param BieuMauHoSoId the bieu mau ho so ID of this tthc thanh phan ho so
	*/
	@Override
	public void setBieuMauHoSoId(long BieuMauHoSoId) {
		_tthcThanhPhanHoSo.setBieuMauHoSoId(BieuMauHoSoId);
	}

	/**
	* Returns the thu tu hien thi of this tthc thanh phan ho so.
	*
	* @return the thu tu hien thi of this tthc thanh phan ho so
	*/
	@Override
	public long getThuTuHienThi() {
		return _tthcThanhPhanHoSo.getThuTuHienThi();
	}

	/**
	* Sets the thu tu hien thi of this tthc thanh phan ho so.
	*
	* @param ThuTuHienThi the thu tu hien thi of this tthc thanh phan ho so
	*/
	@Override
	public void setThuTuHienThi(long ThuTuHienThi) {
		_tthcThanhPhanHoSo.setThuTuHienThi(ThuTuHienThi);
	}

	/**
	* Returns the loai thanh phan of this tthc thanh phan ho so.
	*
	* @return the loai thanh phan of this tthc thanh phan ho so
	*/
	@Override
	public long getLoaiThanhPhan() {
		return _tthcThanhPhanHoSo.getLoaiThanhPhan();
	}

	/**
	* Sets the loai thanh phan of this tthc thanh phan ho so.
	*
	* @param LoaiThanhPhan the loai thanh phan of this tthc thanh phan ho so
	*/
	@Override
	public void setLoaiThanhPhan(long LoaiThanhPhan) {
		_tthcThanhPhanHoSo.setLoaiThanhPhan(LoaiThanhPhan);
	}

	/**
	* Returns the mau truc tuyen of this tthc thanh phan ho so.
	*
	* @return the mau truc tuyen of this tthc thanh phan ho so
	*/
	@Override
	public java.lang.String getMauTrucTuyen() {
		return _tthcThanhPhanHoSo.getMauTrucTuyen();
	}

	/**
	* Sets the mau truc tuyen of this tthc thanh phan ho so.
	*
	* @param MauTrucTuyen the mau truc tuyen of this tthc thanh phan ho so
	*/
	@Override
	public void setMauTrucTuyen(java.lang.String MauTrucTuyen) {
		_tthcThanhPhanHoSo.setMauTrucTuyen(MauTrucTuyen);
	}

	/**
	* Returns the so tai lieu dinh kem of this tthc thanh phan ho so.
	*
	* @return the so tai lieu dinh kem of this tthc thanh phan ho so
	*/
	@Override
	public long getSoTaiLieuDinhKem() {
		return _tthcThanhPhanHoSo.getSoTaiLieuDinhKem();
	}

	/**
	* Sets the so tai lieu dinh kem of this tthc thanh phan ho so.
	*
	* @param SoTaiLieuDinhKem the so tai lieu dinh kem of this tthc thanh phan ho so
	*/
	@Override
	public void setSoTaiLieuDinhKem(long SoTaiLieuDinhKem) {
		_tthcThanhPhanHoSo.setSoTaiLieuDinhKem(SoTaiLieuDinhKem);
	}

	@Override
	public boolean isNew() {
		return _tthcThanhPhanHoSo.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tthcThanhPhanHoSo.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tthcThanhPhanHoSo.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tthcThanhPhanHoSo.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tthcThanhPhanHoSo.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tthcThanhPhanHoSo.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tthcThanhPhanHoSo.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tthcThanhPhanHoSo.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tthcThanhPhanHoSo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tthcThanhPhanHoSo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tthcThanhPhanHoSo.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TthcThanhPhanHoSoWrapper((TthcThanhPhanHoSo)_tthcThanhPhanHoSo.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo tthcThanhPhanHoSo) {
		return _tthcThanhPhanHoSo.compareTo(tthcThanhPhanHoSo);
	}

	@Override
	public int hashCode() {
		return _tthcThanhPhanHoSo.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo> toCacheModel() {
		return _tthcThanhPhanHoSo.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo toEscapedModel() {
		return new TthcThanhPhanHoSoWrapper(_tthcThanhPhanHoSo.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo toUnescapedModel() {
		return new TthcThanhPhanHoSoWrapper(_tthcThanhPhanHoSo.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tthcThanhPhanHoSo.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tthcThanhPhanHoSo.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tthcThanhPhanHoSo.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TthcThanhPhanHoSoWrapper)) {
			return false;
		}

		TthcThanhPhanHoSoWrapper tthcThanhPhanHoSoWrapper = (TthcThanhPhanHoSoWrapper)obj;

		if (Validator.equals(_tthcThanhPhanHoSo,
					tthcThanhPhanHoSoWrapper._tthcThanhPhanHoSo)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TthcThanhPhanHoSo getWrappedTthcThanhPhanHoSo() {
		return _tthcThanhPhanHoSo;
	}

	@Override
	public TthcThanhPhanHoSo getWrappedModel() {
		return _tthcThanhPhanHoSo;
	}

	@Override
	public void resetOriginalValues() {
		_tthcThanhPhanHoSo.resetOriginalValues();
	}

	private TthcThanhPhanHoSo _tthcThanhPhanHoSo;
}