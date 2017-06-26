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

package vn.dtt.gt.dk.dao.nghiepvu.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the ImportedXCD service. Represents a row in the &quot;vr_importedxcd&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDImpl}.
 * </p>
 *
 * @author win_64
 * @see ImportedXCD
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl
 * @generated
 */
public interface ImportedXCDModel extends BaseModel<ImportedXCD> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a imported x c d model instance should use the {@link ImportedXCD} interface instead.
	 */

	/**
	 * Returns the primary key of this imported x c d.
	 *
	 * @return the primary key of this imported x c d
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this imported x c d.
	 *
	 * @param primaryKey the primary key of this imported x c d
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this imported x c d.
	 *
	 * @return the ID of this imported x c d
	 */
	public long getId();

	/**
	 * Sets the ID of this imported x c d.
	 *
	 * @param id the ID of this imported x c d
	 */
	public void setId(long id);

	/**
	 * Returns the trangthai of this imported x c d.
	 *
	 * @return the trangthai of this imported x c d
	 */
	public long getTrangthai();

	/**
	 * Sets the trangthai of this imported x c d.
	 *
	 * @param trangthai the trangthai of this imported x c d
	 */
	public void setTrangthai(long trangthai);

	/**
	 * Returns the i d g c n of this imported x c d.
	 *
	 * @return the i d g c n of this imported x c d
	 */
	@AutoEscape
	public String getIDGCN();

	/**
	 * Sets the i d g c n of this imported x c d.
	 *
	 * @param IDGCN the i d g c n of this imported x c d
	 */
	public void setIDGCN(String IDGCN);

	/**
	 * Returns the so to khai of this imported x c d.
	 *
	 * @return the so to khai of this imported x c d
	 */
	@AutoEscape
	public String getSoToKhai();

	/**
	 * Sets the so to khai of this imported x c d.
	 *
	 * @param SoToKhai the so to khai of this imported x c d
	 */
	public void setSoToKhai(String SoToKhai);

	/**
	 * Returns the so dang ky of this imported x c d.
	 *
	 * @return the so dang ky of this imported x c d
	 */
	@AutoEscape
	public String getSoDangKy();

	/**
	 * Sets the so dang ky of this imported x c d.
	 *
	 * @param SoDangKy the so dang ky of this imported x c d
	 */
	public void setSoDangKy(String SoDangKy);

	/**
	 * Returns the so bien ban of this imported x c d.
	 *
	 * @return the so bien ban of this imported x c d
	 */
	@AutoEscape
	public String getSoBienBan();

	/**
	 * Sets the so bien ban of this imported x c d.
	 *
	 * @param SoBienBan the so bien ban of this imported x c d
	 */
	public void setSoBienBan(String SoBienBan);

	/**
	 * Returns the nguoi k t of this imported x c d.
	 *
	 * @return the nguoi k t of this imported x c d
	 */
	@AutoEscape
	public String getNguoiKT();

	/**
	 * Sets the nguoi k t of this imported x c d.
	 *
	 * @param NguoiKT the nguoi k t of this imported x c d
	 */
	public void setNguoiKT(String NguoiKT);

	/**
	 * Returns the ngay kiem tra of this imported x c d.
	 *
	 * @return the ngay kiem tra of this imported x c d
	 */
	@AutoEscape
	public String getNgayKiemTra();

	/**
	 * Sets the ngay kiem tra of this imported x c d.
	 *
	 * @param NgayKiemTra the ngay kiem tra of this imported x c d
	 */
	public void setNgayKiemTra(String NgayKiemTra);

	/**
	 * Returns the noi kiem tra of this imported x c d.
	 *
	 * @return the noi kiem tra of this imported x c d
	 */
	@AutoEscape
	public String getNoiKiemTra();

	/**
	 * Sets the noi kiem tra of this imported x c d.
	 *
	 * @param NoiKiemTra the noi kiem tra of this imported x c d
	 */
	public void setNoiKiemTra(String NoiKiemTra);

	/**
	 * Returns the ma chu of this imported x c d.
	 *
	 * @return the ma chu of this imported x c d
	 */
	@AutoEscape
	public String getMaChu();

	/**
	 * Sets the ma chu of this imported x c d.
	 *
	 * @param MaChu the ma chu of this imported x c d
	 */
	public void setMaChu(String MaChu);

	/**
	 * Returns the ten chu of this imported x c d.
	 *
	 * @return the ten chu of this imported x c d
	 */
	@AutoEscape
	public String getTenChu();

	/**
	 * Sets the ten chu of this imported x c d.
	 *
	 * @param TenChu the ten chu of this imported x c d
	 */
	public void setTenChu(String TenChu);

	/**
	 * Returns the dia chi of this imported x c d.
	 *
	 * @return the dia chi of this imported x c d
	 */
	@AutoEscape
	public String getDiaChi();

	/**
	 * Sets the dia chi of this imported x c d.
	 *
	 * @param DiaChi the dia chi of this imported x c d
	 */
	public void setDiaChi(String DiaChi);

	/**
	 * Returns the dien thoai of this imported x c d.
	 *
	 * @return the dien thoai of this imported x c d
	 */
	@AutoEscape
	public String getDienThoai();

	/**
	 * Sets the dien thoai of this imported x c d.
	 *
	 * @param DienThoai the dien thoai of this imported x c d
	 */
	public void setDienThoai(String DienThoai);

	/**
	 * Returns the so f a x of this imported x c d.
	 *
	 * @return the so f a x of this imported x c d
	 */
	@AutoEscape
	public String getSoFAX();

	/**
	 * Sets the so f a x of this imported x c d.
	 *
	 * @param SoFAX the so f a x of this imported x c d
	 */
	public void setSoFAX(String SoFAX);

	/**
	 * Returns the ma chung loai of this imported x c d.
	 *
	 * @return the ma chung loai of this imported x c d
	 */
	@AutoEscape
	public String getMaChungLoai();

	/**
	 * Sets the ma chung loai of this imported x c d.
	 *
	 * @param MaChungLoai the ma chung loai of this imported x c d
	 */
	public void setMaChungLoai(String MaChungLoai);

	/**
	 * Returns the ma ten xe of this imported x c d.
	 *
	 * @return the ma ten xe of this imported x c d
	 */
	@AutoEscape
	public String getMaTenXe();

	/**
	 * Sets the ma ten xe of this imported x c d.
	 *
	 * @param MaTenXe the ma ten xe of this imported x c d
	 */
	public void setMaTenXe(String MaTenXe);

	/**
	 * Returns the nhan hieu of this imported x c d.
	 *
	 * @return the nhan hieu of this imported x c d
	 */
	@AutoEscape
	public String getNhanHieu();

	/**
	 * Sets the nhan hieu of this imported x c d.
	 *
	 * @param NhanHieu the nhan hieu of this imported x c d
	 */
	public void setNhanHieu(String NhanHieu);

	/**
	 * Returns the so loai of this imported x c d.
	 *
	 * @return the so loai of this imported x c d
	 */
	@AutoEscape
	public String getSoLoai();

	/**
	 * Sets the so loai of this imported x c d.
	 *
	 * @param SoLoai the so loai of this imported x c d
	 */
	public void setSoLoai(String SoLoai);

	/**
	 * Returns the ten thuong mai of this imported x c d.
	 *
	 * @return the ten thuong mai of this imported x c d
	 */
	@AutoEscape
	public String getTenThuongMai();

	/**
	 * Sets the ten thuong mai of this imported x c d.
	 *
	 * @param TenThuongMai the ten thuong mai of this imported x c d
	 */
	public void setTenThuongMai(String TenThuongMai);

	/**
	 * Returns the so dong co of this imported x c d.
	 *
	 * @return the so dong co of this imported x c d
	 */
	@AutoEscape
	public String getSoDongCo();

	/**
	 * Sets the so dong co of this imported x c d.
	 *
	 * @param SoDongCo the so dong co of this imported x c d
	 */
	public void setSoDongCo(String SoDongCo);

	/**
	 * Returns the so khung of this imported x c d.
	 *
	 * @return the so khung of this imported x c d
	 */
	@AutoEscape
	public String getSoKhung();

	/**
	 * Sets the so khung of this imported x c d.
	 *
	 * @param SoKhung the so khung of this imported x c d
	 */
	public void setSoKhung(String SoKhung);

	/**
	 * Returns the nam sx of this imported x c d.
	 *
	 * @return the nam sx of this imported x c d
	 */
	@AutoEscape
	public String getNamSx();

	/**
	 * Sets the nam sx of this imported x c d.
	 *
	 * @param NamSx the nam sx of this imported x c d
	 */
	public void setNamSx(String NamSx);

	/**
	 * Returns the noi sx of this imported x c d.
	 *
	 * @return the noi sx of this imported x c d
	 */
	@AutoEscape
	public String getNoiSx();

	/**
	 * Sets the noi sx of this imported x c d.
	 *
	 * @param NoiSx the noi sx of this imported x c d
	 */
	public void setNoiSx(String NoiSx);

	/**
	 * Returns the ngay den han of this imported x c d.
	 *
	 * @return the ngay den han of this imported x c d
	 */
	@AutoEscape
	public String getNgayDenHan();

	/**
	 * Sets the ngay den han of this imported x c d.
	 *
	 * @param NgayDenHan the ngay den han of this imported x c d
	 */
	public void setNgayDenHan(String NgayDenHan);

	/**
	 * Returns the ngay cap g c n of this imported x c d.
	 *
	 * @return the ngay cap g c n of this imported x c d
	 */
	@AutoEscape
	public String getNgayCapGCN();

	/**
	 * Sets the ngay cap g c n of this imported x c d.
	 *
	 * @param NgayCapGCN the ngay cap g c n of this imported x c d
	 */
	public void setNgayCapGCN(String NgayCapGCN);

	/**
	 * Returns the ngay nhap of this imported x c d.
	 *
	 * @return the ngay nhap of this imported x c d
	 */
	@AutoEscape
	public String getNgayNhap();

	/**
	 * Sets the ngay nhap of this imported x c d.
	 *
	 * @param NgayNhap the ngay nhap of this imported x c d
	 */
	public void setNgayNhap(String NgayNhap);

	/**
	 * Returns the note of this imported x c d.
	 *
	 * @return the note of this imported x c d
	 */
	@AutoEscape
	public String getNote();

	/**
	 * Sets the note of this imported x c d.
	 *
	 * @param Note the note of this imported x c d
	 */
	public void setNote(String Note);

	/**
	 * Returns the login name of this imported x c d.
	 *
	 * @return the login name of this imported x c d
	 */
	@AutoEscape
	public String getLoginName();

	/**
	 * Sets the login name of this imported x c d.
	 *
	 * @param LoginName the login name of this imported x c d
	 */
	public void setLoginName(String LoginName);

	/**
	 * Returns the m a d v of this imported x c d.
	 *
	 * @return the m a d v of this imported x c d
	 */
	@AutoEscape
	public String getMADV();

	/**
	 * Sets the m a d v of this imported x c d.
	 *
	 * @param MADV the m a d v of this imported x c d
	 */
	public void setMADV(String MADV);

	/**
	 * Returns the tinh trang of this imported x c d.
	 *
	 * @return the tinh trang of this imported x c d
	 */
	@AutoEscape
	public String getTinhTrang();

	/**
	 * Sets the tinh trang of this imported x c d.
	 *
	 * @param TinhTrang the tinh trang of this imported x c d
	 */
	public void setTinhTrang(String TinhTrang);

	/**
	 * Returns the ghi chu of this imported x c d.
	 *
	 * @return the ghi chu of this imported x c d
	 */
	@AutoEscape
	public String getGhiChu();

	/**
	 * Sets the ghi chu of this imported x c d.
	 *
	 * @param GhiChu the ghi chu of this imported x c d
	 */
	public void setGhiChu(String GhiChu);

	/**
	 * Returns the nguoi soat of this imported x c d.
	 *
	 * @return the nguoi soat of this imported x c d
	 */
	@AutoEscape
	public String getNguoiSoat();

	/**
	 * Sets the nguoi soat of this imported x c d.
	 *
	 * @param NguoiSoat the nguoi soat of this imported x c d
	 */
	public void setNguoiSoat(String NguoiSoat);

	/**
	 * Returns the ngay soat of this imported x c d.
	 *
	 * @return the ngay soat of this imported x c d
	 */
	@AutoEscape
	public String getNgaySoat();

	/**
	 * Sets the ngay soat of this imported x c d.
	 *
	 * @param NgaySoat the ngay soat of this imported x c d
	 */
	public void setNgaySoat(String NgaySoat);

	/**
	 * Returns the ket qua of this imported x c d.
	 *
	 * @return the ket qua of this imported x c d
	 */
	@AutoEscape
	public String getKetQua();

	/**
	 * Sets the ket qua of this imported x c d.
	 *
	 * @param KetQua the ket qua of this imported x c d
	 */
	public void setKetQua(String KetQua);

	/**
	 * Returns the s t t of this imported x c d.
	 *
	 * @return the s t t of this imported x c d
	 */
	public long getSTT();

	/**
	 * Sets the s t t of this imported x c d.
	 *
	 * @param STT the s t t of this imported x c d
	 */
	public void setSTT(long STT);

	/**
	 * Returns the ten xe of this imported x c d.
	 *
	 * @return the ten xe of this imported x c d
	 */
	@AutoEscape
	public String getTenXe();

	/**
	 * Sets the ten xe of this imported x c d.
	 *
	 * @param TenXe the ten xe of this imported x c d
	 */
	public void setTenXe(String TenXe);

	/**
	 * Returns the ten chung loai of this imported x c d.
	 *
	 * @return the ten chung loai of this imported x c d
	 */
	@AutoEscape
	public String getTenChungLoai();

	/**
	 * Sets the ten chung loai of this imported x c d.
	 *
	 * @param TenChungLoai the ten chung loai of this imported x c d
	 */
	public void setTenChungLoai(String TenChungLoai);

	/**
	 * Returns the ma t s k t of this imported x c d.
	 *
	 * @return the ma t s k t of this imported x c d
	 */
	@AutoEscape
	public String getMaTSKT();

	/**
	 * Sets the ma t s k t of this imported x c d.
	 *
	 * @param MaTSKT the ma t s k t of this imported x c d
	 */
	public void setMaTSKT(String MaTSKT);

	/**
	 * Returns the ten dac tinh v of this imported x c d.
	 *
	 * @return the ten dac tinh v of this imported x c d
	 */
	@AutoEscape
	public String getTenDacTinhV();

	/**
	 * Sets the ten dac tinh v of this imported x c d.
	 *
	 * @param TenDacTinhV the ten dac tinh v of this imported x c d
	 */
	public void setTenDacTinhV(String TenDacTinhV);

	/**
	 * Returns the ten dac tinh a of this imported x c d.
	 *
	 * @return the ten dac tinh a of this imported x c d
	 */
	@AutoEscape
	public String getTenDacTinhA();

	/**
	 * Sets the ten dac tinh a of this imported x c d.
	 *
	 * @param TenDacTinhA the ten dac tinh a of this imported x c d
	 */
	public void setTenDacTinhA(String TenDacTinhA);

	/**
	 * Returns the ma nhom dac tinh of this imported x c d.
	 *
	 * @return the ma nhom dac tinh of this imported x c d
	 */
	@AutoEscape
	public String getMaNhomDacTinh();

	/**
	 * Sets the ma nhom dac tinh of this imported x c d.
	 *
	 * @param MaNhomDacTinh the ma nhom dac tinh of this imported x c d
	 */
	public void setMaNhomDacTinh(String MaNhomDacTinh);

	/**
	 * Returns the thu nguyen of this imported x c d.
	 *
	 * @return the thu nguyen of this imported x c d
	 */
	@AutoEscape
	public String getThuNguyen();

	/**
	 * Sets the thu nguyen of this imported x c d.
	 *
	 * @param ThuNguyen the thu nguyen of this imported x c d
	 */
	public void setThuNguyen(String ThuNguyen);

	/**
	 * Returns the gia tri of this imported x c d.
	 *
	 * @return the gia tri of this imported x c d
	 */
	@AutoEscape
	public String getGiaTri();

	/**
	 * Sets the gia tri of this imported x c d.
	 *
	 * @param GiaTri the gia tri of this imported x c d
	 */
	public void setGiaTri(String GiaTri);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(ImportedXCD importedXCD);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ImportedXCD> toCacheModel();

	@Override
	public ImportedXCD toEscapedModel();

	@Override
	public ImportedXCD toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}