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
 * This class is a wrapper for {@link TthcThuTucHanhChinh}.
 * </p>
 *
 * @author huymq
 * @see TthcThuTucHanhChinh
 * @generated
 */
public class TthcThuTucHanhChinhWrapper implements TthcThuTucHanhChinh,
	ModelWrapper<TthcThuTucHanhChinh> {
	public TthcThuTucHanhChinhWrapper(TthcThuTucHanhChinh tthcThuTucHanhChinh) {
		_tthcThuTucHanhChinh = tthcThuTucHanhChinh;
	}

	@Override
	public Class<?> getModelClass() {
		return TthcThuTucHanhChinh.class;
	}

	@Override
	public String getModelClassName() {
		return TthcThuTucHanhChinh.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("maThuTuc", getMaThuTuc());
		attributes.put("tenThuTuc", getTenThuTuc());
		attributes.put("trinhTuThucHien", getTrinhTuThucHien());
		attributes.put("cachThucThucHien", getCachThucThucHien());
		attributes.put("thanhPhanHoSo", getThanhPhanHoSo());
		attributes.put("dieuKienThucHien", getDieuKienThucHien());
		attributes.put("thoiHanGiaiQuyet", getThoiHanGiaiQuyet());
		attributes.put("doiTuongThucHien", getDoiTuongThucHien());
		attributes.put("ketQuaXuLy", getKetQuaXuLy());
		attributes.put("canCuPhapLy", getCanCuPhapLy());
		attributes.put("lePhi", getLePhi());
		attributes.put("coQuanQlttId", getCoQuanQlttId());
		attributes.put("linhVucThuTucId", getLinhVucThuTucId());
		attributes.put("ngayCoHieuLuc", getNgayCoHieuLuc());
		attributes.put("ngayHetHieuLuc", getNgayHetHieuLuc());
		attributes.put("huongDanThucHien", getHuongDanThucHien());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String maThuTuc = (String)attributes.get("maThuTuc");

		if (maThuTuc != null) {
			setMaThuTuc(maThuTuc);
		}

		String tenThuTuc = (String)attributes.get("tenThuTuc");

		if (tenThuTuc != null) {
			setTenThuTuc(tenThuTuc);
		}

		String trinhTuThucHien = (String)attributes.get("trinhTuThucHien");

		if (trinhTuThucHien != null) {
			setTrinhTuThucHien(trinhTuThucHien);
		}

		String cachThucThucHien = (String)attributes.get("cachThucThucHien");

		if (cachThucThucHien != null) {
			setCachThucThucHien(cachThucThucHien);
		}

		String thanhPhanHoSo = (String)attributes.get("thanhPhanHoSo");

		if (thanhPhanHoSo != null) {
			setThanhPhanHoSo(thanhPhanHoSo);
		}

		String dieuKienThucHien = (String)attributes.get("dieuKienThucHien");

		if (dieuKienThucHien != null) {
			setDieuKienThucHien(dieuKienThucHien);
		}

		String thoiHanGiaiQuyet = (String)attributes.get("thoiHanGiaiQuyet");

		if (thoiHanGiaiQuyet != null) {
			setThoiHanGiaiQuyet(thoiHanGiaiQuyet);
		}

		String doiTuongThucHien = (String)attributes.get("doiTuongThucHien");

		if (doiTuongThucHien != null) {
			setDoiTuongThucHien(doiTuongThucHien);
		}

		String ketQuaXuLy = (String)attributes.get("ketQuaXuLy");

		if (ketQuaXuLy != null) {
			setKetQuaXuLy(ketQuaXuLy);
		}

		String canCuPhapLy = (String)attributes.get("canCuPhapLy");

		if (canCuPhapLy != null) {
			setCanCuPhapLy(canCuPhapLy);
		}

		String lePhi = (String)attributes.get("lePhi");

		if (lePhi != null) {
			setLePhi(lePhi);
		}

		Long coQuanQlttId = (Long)attributes.get("coQuanQlttId");

		if (coQuanQlttId != null) {
			setCoQuanQlttId(coQuanQlttId);
		}

		Long linhVucThuTucId = (Long)attributes.get("linhVucThuTucId");

		if (linhVucThuTucId != null) {
			setLinhVucThuTucId(linhVucThuTucId);
		}

		Date ngayCoHieuLuc = (Date)attributes.get("ngayCoHieuLuc");

		if (ngayCoHieuLuc != null) {
			setNgayCoHieuLuc(ngayCoHieuLuc);
		}

		Date ngayHetHieuLuc = (Date)attributes.get("ngayHetHieuLuc");

		if (ngayHetHieuLuc != null) {
			setNgayHetHieuLuc(ngayHetHieuLuc);
		}

		String huongDanThucHien = (String)attributes.get("huongDanThucHien");

		if (huongDanThucHien != null) {
			setHuongDanThucHien(huongDanThucHien);
		}
	}

	/**
	* Returns the primary key of this tthc thu tuc hanh chinh.
	*
	* @return the primary key of this tthc thu tuc hanh chinh
	*/
	@Override
	public long getPrimaryKey() {
		return _tthcThuTucHanhChinh.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tthc thu tuc hanh chinh.
	*
	* @param primaryKey the primary key of this tthc thu tuc hanh chinh
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tthcThuTucHanhChinh.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tthc thu tuc hanh chinh.
	*
	* @return the ID of this tthc thu tuc hanh chinh
	*/
	@Override
	public long getId() {
		return _tthcThuTucHanhChinh.getId();
	}

	/**
	* Sets the ID of this tthc thu tuc hanh chinh.
	*
	* @param Id the ID of this tthc thu tuc hanh chinh
	*/
	@Override
	public void setId(long Id) {
		_tthcThuTucHanhChinh.setId(Id);
	}

	/**
	* Returns the ma thu tuc of this tthc thu tuc hanh chinh.
	*
	* @return the ma thu tuc of this tthc thu tuc hanh chinh
	*/
	@Override
	public java.lang.String getMaThuTuc() {
		return _tthcThuTucHanhChinh.getMaThuTuc();
	}

	/**
	* Sets the ma thu tuc of this tthc thu tuc hanh chinh.
	*
	* @param maThuTuc the ma thu tuc of this tthc thu tuc hanh chinh
	*/
	@Override
	public void setMaThuTuc(java.lang.String maThuTuc) {
		_tthcThuTucHanhChinh.setMaThuTuc(maThuTuc);
	}

	/**
	* Returns the ten thu tuc of this tthc thu tuc hanh chinh.
	*
	* @return the ten thu tuc of this tthc thu tuc hanh chinh
	*/
	@Override
	public java.lang.String getTenThuTuc() {
		return _tthcThuTucHanhChinh.getTenThuTuc();
	}

	/**
	* Sets the ten thu tuc of this tthc thu tuc hanh chinh.
	*
	* @param tenThuTuc the ten thu tuc of this tthc thu tuc hanh chinh
	*/
	@Override
	public void setTenThuTuc(java.lang.String tenThuTuc) {
		_tthcThuTucHanhChinh.setTenThuTuc(tenThuTuc);
	}

	/**
	* Returns the trinh tu thuc hien of this tthc thu tuc hanh chinh.
	*
	* @return the trinh tu thuc hien of this tthc thu tuc hanh chinh
	*/
	@Override
	public java.lang.String getTrinhTuThucHien() {
		return _tthcThuTucHanhChinh.getTrinhTuThucHien();
	}

	/**
	* Sets the trinh tu thuc hien of this tthc thu tuc hanh chinh.
	*
	* @param trinhTuThucHien the trinh tu thuc hien of this tthc thu tuc hanh chinh
	*/
	@Override
	public void setTrinhTuThucHien(java.lang.String trinhTuThucHien) {
		_tthcThuTucHanhChinh.setTrinhTuThucHien(trinhTuThucHien);
	}

	/**
	* Returns the cach thuc thuc hien of this tthc thu tuc hanh chinh.
	*
	* @return the cach thuc thuc hien of this tthc thu tuc hanh chinh
	*/
	@Override
	public java.lang.String getCachThucThucHien() {
		return _tthcThuTucHanhChinh.getCachThucThucHien();
	}

	/**
	* Sets the cach thuc thuc hien of this tthc thu tuc hanh chinh.
	*
	* @param cachThucThucHien the cach thuc thuc hien of this tthc thu tuc hanh chinh
	*/
	@Override
	public void setCachThucThucHien(java.lang.String cachThucThucHien) {
		_tthcThuTucHanhChinh.setCachThucThucHien(cachThucThucHien);
	}

	/**
	* Returns the thanh phan ho so of this tthc thu tuc hanh chinh.
	*
	* @return the thanh phan ho so of this tthc thu tuc hanh chinh
	*/
	@Override
	public java.lang.String getThanhPhanHoSo() {
		return _tthcThuTucHanhChinh.getThanhPhanHoSo();
	}

	/**
	* Sets the thanh phan ho so of this tthc thu tuc hanh chinh.
	*
	* @param thanhPhanHoSo the thanh phan ho so of this tthc thu tuc hanh chinh
	*/
	@Override
	public void setThanhPhanHoSo(java.lang.String thanhPhanHoSo) {
		_tthcThuTucHanhChinh.setThanhPhanHoSo(thanhPhanHoSo);
	}

	/**
	* Returns the dieu kien thuc hien of this tthc thu tuc hanh chinh.
	*
	* @return the dieu kien thuc hien of this tthc thu tuc hanh chinh
	*/
	@Override
	public java.lang.String getDieuKienThucHien() {
		return _tthcThuTucHanhChinh.getDieuKienThucHien();
	}

	/**
	* Sets the dieu kien thuc hien of this tthc thu tuc hanh chinh.
	*
	* @param dieuKienThucHien the dieu kien thuc hien of this tthc thu tuc hanh chinh
	*/
	@Override
	public void setDieuKienThucHien(java.lang.String dieuKienThucHien) {
		_tthcThuTucHanhChinh.setDieuKienThucHien(dieuKienThucHien);
	}

	/**
	* Returns the thoi han giai quyet of this tthc thu tuc hanh chinh.
	*
	* @return the thoi han giai quyet of this tthc thu tuc hanh chinh
	*/
	@Override
	public java.lang.String getThoiHanGiaiQuyet() {
		return _tthcThuTucHanhChinh.getThoiHanGiaiQuyet();
	}

	/**
	* Sets the thoi han giai quyet of this tthc thu tuc hanh chinh.
	*
	* @param thoiHanGiaiQuyet the thoi han giai quyet of this tthc thu tuc hanh chinh
	*/
	@Override
	public void setThoiHanGiaiQuyet(java.lang.String thoiHanGiaiQuyet) {
		_tthcThuTucHanhChinh.setThoiHanGiaiQuyet(thoiHanGiaiQuyet);
	}

	/**
	* Returns the doi tuong thuc hien of this tthc thu tuc hanh chinh.
	*
	* @return the doi tuong thuc hien of this tthc thu tuc hanh chinh
	*/
	@Override
	public java.lang.String getDoiTuongThucHien() {
		return _tthcThuTucHanhChinh.getDoiTuongThucHien();
	}

	/**
	* Sets the doi tuong thuc hien of this tthc thu tuc hanh chinh.
	*
	* @param doiTuongThucHien the doi tuong thuc hien of this tthc thu tuc hanh chinh
	*/
	@Override
	public void setDoiTuongThucHien(java.lang.String doiTuongThucHien) {
		_tthcThuTucHanhChinh.setDoiTuongThucHien(doiTuongThucHien);
	}

	/**
	* Returns the ket qua xu ly of this tthc thu tuc hanh chinh.
	*
	* @return the ket qua xu ly of this tthc thu tuc hanh chinh
	*/
	@Override
	public java.lang.String getKetQuaXuLy() {
		return _tthcThuTucHanhChinh.getKetQuaXuLy();
	}

	/**
	* Sets the ket qua xu ly of this tthc thu tuc hanh chinh.
	*
	* @param ketQuaXuLy the ket qua xu ly of this tthc thu tuc hanh chinh
	*/
	@Override
	public void setKetQuaXuLy(java.lang.String ketQuaXuLy) {
		_tthcThuTucHanhChinh.setKetQuaXuLy(ketQuaXuLy);
	}

	/**
	* Returns the can cu phap ly of this tthc thu tuc hanh chinh.
	*
	* @return the can cu phap ly of this tthc thu tuc hanh chinh
	*/
	@Override
	public java.lang.String getCanCuPhapLy() {
		return _tthcThuTucHanhChinh.getCanCuPhapLy();
	}

	/**
	* Sets the can cu phap ly of this tthc thu tuc hanh chinh.
	*
	* @param canCuPhapLy the can cu phap ly of this tthc thu tuc hanh chinh
	*/
	@Override
	public void setCanCuPhapLy(java.lang.String canCuPhapLy) {
		_tthcThuTucHanhChinh.setCanCuPhapLy(canCuPhapLy);
	}

	/**
	* Returns the le phi of this tthc thu tuc hanh chinh.
	*
	* @return the le phi of this tthc thu tuc hanh chinh
	*/
	@Override
	public java.lang.String getLePhi() {
		return _tthcThuTucHanhChinh.getLePhi();
	}

	/**
	* Sets the le phi of this tthc thu tuc hanh chinh.
	*
	* @param lePhi the le phi of this tthc thu tuc hanh chinh
	*/
	@Override
	public void setLePhi(java.lang.String lePhi) {
		_tthcThuTucHanhChinh.setLePhi(lePhi);
	}

	/**
	* Returns the co quan qltt ID of this tthc thu tuc hanh chinh.
	*
	* @return the co quan qltt ID of this tthc thu tuc hanh chinh
	*/
	@Override
	public long getCoQuanQlttId() {
		return _tthcThuTucHanhChinh.getCoQuanQlttId();
	}

	/**
	* Sets the co quan qltt ID of this tthc thu tuc hanh chinh.
	*
	* @param coQuanQlttId the co quan qltt ID of this tthc thu tuc hanh chinh
	*/
	@Override
	public void setCoQuanQlttId(long coQuanQlttId) {
		_tthcThuTucHanhChinh.setCoQuanQlttId(coQuanQlttId);
	}

	/**
	* Returns the linh vuc thu tuc ID of this tthc thu tuc hanh chinh.
	*
	* @return the linh vuc thu tuc ID of this tthc thu tuc hanh chinh
	*/
	@Override
	public long getLinhVucThuTucId() {
		return _tthcThuTucHanhChinh.getLinhVucThuTucId();
	}

	/**
	* Sets the linh vuc thu tuc ID of this tthc thu tuc hanh chinh.
	*
	* @param linhVucThuTucId the linh vuc thu tuc ID of this tthc thu tuc hanh chinh
	*/
	@Override
	public void setLinhVucThuTucId(long linhVucThuTucId) {
		_tthcThuTucHanhChinh.setLinhVucThuTucId(linhVucThuTucId);
	}

	/**
	* Returns the ngay co hieu luc of this tthc thu tuc hanh chinh.
	*
	* @return the ngay co hieu luc of this tthc thu tuc hanh chinh
	*/
	@Override
	public java.util.Date getNgayCoHieuLuc() {
		return _tthcThuTucHanhChinh.getNgayCoHieuLuc();
	}

	/**
	* Sets the ngay co hieu luc of this tthc thu tuc hanh chinh.
	*
	* @param ngayCoHieuLuc the ngay co hieu luc of this tthc thu tuc hanh chinh
	*/
	@Override
	public void setNgayCoHieuLuc(java.util.Date ngayCoHieuLuc) {
		_tthcThuTucHanhChinh.setNgayCoHieuLuc(ngayCoHieuLuc);
	}

	/**
	* Returns the ngay het hieu luc of this tthc thu tuc hanh chinh.
	*
	* @return the ngay het hieu luc of this tthc thu tuc hanh chinh
	*/
	@Override
	public java.util.Date getNgayHetHieuLuc() {
		return _tthcThuTucHanhChinh.getNgayHetHieuLuc();
	}

	/**
	* Sets the ngay het hieu luc of this tthc thu tuc hanh chinh.
	*
	* @param ngayHetHieuLuc the ngay het hieu luc of this tthc thu tuc hanh chinh
	*/
	@Override
	public void setNgayHetHieuLuc(java.util.Date ngayHetHieuLuc) {
		_tthcThuTucHanhChinh.setNgayHetHieuLuc(ngayHetHieuLuc);
	}

	/**
	* Returns the huong dan thuc hien of this tthc thu tuc hanh chinh.
	*
	* @return the huong dan thuc hien of this tthc thu tuc hanh chinh
	*/
	@Override
	public java.lang.String getHuongDanThucHien() {
		return _tthcThuTucHanhChinh.getHuongDanThucHien();
	}

	/**
	* Sets the huong dan thuc hien of this tthc thu tuc hanh chinh.
	*
	* @param huongDanThucHien the huong dan thuc hien of this tthc thu tuc hanh chinh
	*/
	@Override
	public void setHuongDanThucHien(java.lang.String huongDanThucHien) {
		_tthcThuTucHanhChinh.setHuongDanThucHien(huongDanThucHien);
	}

	@Override
	public boolean isNew() {
		return _tthcThuTucHanhChinh.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tthcThuTucHanhChinh.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tthcThuTucHanhChinh.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tthcThuTucHanhChinh.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tthcThuTucHanhChinh.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tthcThuTucHanhChinh.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tthcThuTucHanhChinh.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tthcThuTucHanhChinh.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tthcThuTucHanhChinh.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tthcThuTucHanhChinh.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tthcThuTucHanhChinh.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TthcThuTucHanhChinhWrapper((TthcThuTucHanhChinh)_tthcThuTucHanhChinh.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh tthcThuTucHanhChinh) {
		return _tthcThuTucHanhChinh.compareTo(tthcThuTucHanhChinh);
	}

	@Override
	public int hashCode() {
		return _tthcThuTucHanhChinh.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh> toCacheModel() {
		return _tthcThuTucHanhChinh.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh toEscapedModel() {
		return new TthcThuTucHanhChinhWrapper(_tthcThuTucHanhChinh.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh toUnescapedModel() {
		return new TthcThuTucHanhChinhWrapper(_tthcThuTucHanhChinh.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tthcThuTucHanhChinh.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tthcThuTucHanhChinh.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tthcThuTucHanhChinh.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TthcThuTucHanhChinhWrapper)) {
			return false;
		}

		TthcThuTucHanhChinhWrapper tthcThuTucHanhChinhWrapper = (TthcThuTucHanhChinhWrapper)obj;

		if (Validator.equals(_tthcThuTucHanhChinh,
					tthcThuTucHanhChinhWrapper._tthcThuTucHanhChinh)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TthcThuTucHanhChinh getWrappedTthcThuTucHanhChinh() {
		return _tthcThuTucHanhChinh;
	}

	@Override
	public TthcThuTucHanhChinh getWrappedModel() {
		return _tthcThuTucHanhChinh;
	}

	@Override
	public void resetOriginalValues() {
		_tthcThuTucHanhChinh.resetOriginalValues();
	}

	private TthcThuTucHanhChinh _tthcThuTucHanhChinh;
}