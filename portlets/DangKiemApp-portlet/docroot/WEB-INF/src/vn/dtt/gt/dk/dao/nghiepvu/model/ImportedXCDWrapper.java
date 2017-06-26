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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ImportedXCD}.
 * </p>
 *
 * @author win_64
 * @see ImportedXCD
 * @generated
 */
public class ImportedXCDWrapper implements ImportedXCD,
	ModelWrapper<ImportedXCD> {
	public ImportedXCDWrapper(ImportedXCD importedXCD) {
		_importedXCD = importedXCD;
	}

	@Override
	public Class<?> getModelClass() {
		return ImportedXCD.class;
	}

	@Override
	public String getModelClassName() {
		return ImportedXCD.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("trangthai", getTrangthai());
		attributes.put("IDGCN", getIDGCN());
		attributes.put("SoToKhai", getSoToKhai());
		attributes.put("SoDangKy", getSoDangKy());
		attributes.put("SoBienBan", getSoBienBan());
		attributes.put("NguoiKT", getNguoiKT());
		attributes.put("NgayKiemTra", getNgayKiemTra());
		attributes.put("NoiKiemTra", getNoiKiemTra());
		attributes.put("MaChu", getMaChu());
		attributes.put("TenChu", getTenChu());
		attributes.put("DiaChi", getDiaChi());
		attributes.put("DienThoai", getDienThoai());
		attributes.put("SoFAX", getSoFAX());
		attributes.put("MaChungLoai", getMaChungLoai());
		attributes.put("MaTenXe", getMaTenXe());
		attributes.put("NhanHieu", getNhanHieu());
		attributes.put("SoLoai", getSoLoai());
		attributes.put("TenThuongMai", getTenThuongMai());
		attributes.put("SoDongCo", getSoDongCo());
		attributes.put("SoKhung", getSoKhung());
		attributes.put("NamSx", getNamSx());
		attributes.put("NoiSx", getNoiSx());
		attributes.put("NgayDenHan", getNgayDenHan());
		attributes.put("NgayCapGCN", getNgayCapGCN());
		attributes.put("NgayNhap", getNgayNhap());
		attributes.put("Note", getNote());
		attributes.put("LoginName", getLoginName());
		attributes.put("MADV", getMADV());
		attributes.put("TinhTrang", getTinhTrang());
		attributes.put("GhiChu", getGhiChu());
		attributes.put("NguoiSoat", getNguoiSoat());
		attributes.put("NgaySoat", getNgaySoat());
		attributes.put("KetQua", getKetQua());
		attributes.put("STT", getSTT());
		attributes.put("TenXe", getTenXe());
		attributes.put("TenChungLoai", getTenChungLoai());
		attributes.put("MaTSKT", getMaTSKT());
		attributes.put("TenDacTinhV", getTenDacTinhV());
		attributes.put("TenDacTinhA", getTenDacTinhA());
		attributes.put("MaNhomDacTinh", getMaNhomDacTinh());
		attributes.put("ThuNguyen", getThuNguyen());
		attributes.put("GiaTri", getGiaTri());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long trangthai = (Long)attributes.get("trangthai");

		if (trangthai != null) {
			setTrangthai(trangthai);
		}

		String IDGCN = (String)attributes.get("IDGCN");

		if (IDGCN != null) {
			setIDGCN(IDGCN);
		}

		String SoToKhai = (String)attributes.get("SoToKhai");

		if (SoToKhai != null) {
			setSoToKhai(SoToKhai);
		}

		String SoDangKy = (String)attributes.get("SoDangKy");

		if (SoDangKy != null) {
			setSoDangKy(SoDangKy);
		}

		String SoBienBan = (String)attributes.get("SoBienBan");

		if (SoBienBan != null) {
			setSoBienBan(SoBienBan);
		}

		String NguoiKT = (String)attributes.get("NguoiKT");

		if (NguoiKT != null) {
			setNguoiKT(NguoiKT);
		}

		String NgayKiemTra = (String)attributes.get("NgayKiemTra");

		if (NgayKiemTra != null) {
			setNgayKiemTra(NgayKiemTra);
		}

		String NoiKiemTra = (String)attributes.get("NoiKiemTra");

		if (NoiKiemTra != null) {
			setNoiKiemTra(NoiKiemTra);
		}

		String MaChu = (String)attributes.get("MaChu");

		if (MaChu != null) {
			setMaChu(MaChu);
		}

		String TenChu = (String)attributes.get("TenChu");

		if (TenChu != null) {
			setTenChu(TenChu);
		}

		String DiaChi = (String)attributes.get("DiaChi");

		if (DiaChi != null) {
			setDiaChi(DiaChi);
		}

		String DienThoai = (String)attributes.get("DienThoai");

		if (DienThoai != null) {
			setDienThoai(DienThoai);
		}

		String SoFAX = (String)attributes.get("SoFAX");

		if (SoFAX != null) {
			setSoFAX(SoFAX);
		}

		String MaChungLoai = (String)attributes.get("MaChungLoai");

		if (MaChungLoai != null) {
			setMaChungLoai(MaChungLoai);
		}

		String MaTenXe = (String)attributes.get("MaTenXe");

		if (MaTenXe != null) {
			setMaTenXe(MaTenXe);
		}

		String NhanHieu = (String)attributes.get("NhanHieu");

		if (NhanHieu != null) {
			setNhanHieu(NhanHieu);
		}

		String SoLoai = (String)attributes.get("SoLoai");

		if (SoLoai != null) {
			setSoLoai(SoLoai);
		}

		String TenThuongMai = (String)attributes.get("TenThuongMai");

		if (TenThuongMai != null) {
			setTenThuongMai(TenThuongMai);
		}

		String SoDongCo = (String)attributes.get("SoDongCo");

		if (SoDongCo != null) {
			setSoDongCo(SoDongCo);
		}

		String SoKhung = (String)attributes.get("SoKhung");

		if (SoKhung != null) {
			setSoKhung(SoKhung);
		}

		String NamSx = (String)attributes.get("NamSx");

		if (NamSx != null) {
			setNamSx(NamSx);
		}

		String NoiSx = (String)attributes.get("NoiSx");

		if (NoiSx != null) {
			setNoiSx(NoiSx);
		}

		String NgayDenHan = (String)attributes.get("NgayDenHan");

		if (NgayDenHan != null) {
			setNgayDenHan(NgayDenHan);
		}

		String NgayCapGCN = (String)attributes.get("NgayCapGCN");

		if (NgayCapGCN != null) {
			setNgayCapGCN(NgayCapGCN);
		}

		String NgayNhap = (String)attributes.get("NgayNhap");

		if (NgayNhap != null) {
			setNgayNhap(NgayNhap);
		}

		String Note = (String)attributes.get("Note");

		if (Note != null) {
			setNote(Note);
		}

		String LoginName = (String)attributes.get("LoginName");

		if (LoginName != null) {
			setLoginName(LoginName);
		}

		String MADV = (String)attributes.get("MADV");

		if (MADV != null) {
			setMADV(MADV);
		}

		String TinhTrang = (String)attributes.get("TinhTrang");

		if (TinhTrang != null) {
			setTinhTrang(TinhTrang);
		}

		String GhiChu = (String)attributes.get("GhiChu");

		if (GhiChu != null) {
			setGhiChu(GhiChu);
		}

		String NguoiSoat = (String)attributes.get("NguoiSoat");

		if (NguoiSoat != null) {
			setNguoiSoat(NguoiSoat);
		}

		String NgaySoat = (String)attributes.get("NgaySoat");

		if (NgaySoat != null) {
			setNgaySoat(NgaySoat);
		}

		String KetQua = (String)attributes.get("KetQua");

		if (KetQua != null) {
			setKetQua(KetQua);
		}

		Long STT = (Long)attributes.get("STT");

		if (STT != null) {
			setSTT(STT);
		}

		String TenXe = (String)attributes.get("TenXe");

		if (TenXe != null) {
			setTenXe(TenXe);
		}

		String TenChungLoai = (String)attributes.get("TenChungLoai");

		if (TenChungLoai != null) {
			setTenChungLoai(TenChungLoai);
		}

		String MaTSKT = (String)attributes.get("MaTSKT");

		if (MaTSKT != null) {
			setMaTSKT(MaTSKT);
		}

		String TenDacTinhV = (String)attributes.get("TenDacTinhV");

		if (TenDacTinhV != null) {
			setTenDacTinhV(TenDacTinhV);
		}

		String TenDacTinhA = (String)attributes.get("TenDacTinhA");

		if (TenDacTinhA != null) {
			setTenDacTinhA(TenDacTinhA);
		}

		String MaNhomDacTinh = (String)attributes.get("MaNhomDacTinh");

		if (MaNhomDacTinh != null) {
			setMaNhomDacTinh(MaNhomDacTinh);
		}

		String ThuNguyen = (String)attributes.get("ThuNguyen");

		if (ThuNguyen != null) {
			setThuNguyen(ThuNguyen);
		}

		String GiaTri = (String)attributes.get("GiaTri");

		if (GiaTri != null) {
			setGiaTri(GiaTri);
		}
	}

	/**
	* Returns the primary key of this imported x c d.
	*
	* @return the primary key of this imported x c d
	*/
	@Override
	public long getPrimaryKey() {
		return _importedXCD.getPrimaryKey();
	}

	/**
	* Sets the primary key of this imported x c d.
	*
	* @param primaryKey the primary key of this imported x c d
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_importedXCD.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this imported x c d.
	*
	* @return the ID of this imported x c d
	*/
	@Override
	public long getId() {
		return _importedXCD.getId();
	}

	/**
	* Sets the ID of this imported x c d.
	*
	* @param id the ID of this imported x c d
	*/
	@Override
	public void setId(long id) {
		_importedXCD.setId(id);
	}

	/**
	* Returns the trangthai of this imported x c d.
	*
	* @return the trangthai of this imported x c d
	*/
	@Override
	public long getTrangthai() {
		return _importedXCD.getTrangthai();
	}

	/**
	* Sets the trangthai of this imported x c d.
	*
	* @param trangthai the trangthai of this imported x c d
	*/
	@Override
	public void setTrangthai(long trangthai) {
		_importedXCD.setTrangthai(trangthai);
	}

	/**
	* Returns the i d g c n of this imported x c d.
	*
	* @return the i d g c n of this imported x c d
	*/
	@Override
	public java.lang.String getIDGCN() {
		return _importedXCD.getIDGCN();
	}

	/**
	* Sets the i d g c n of this imported x c d.
	*
	* @param IDGCN the i d g c n of this imported x c d
	*/
	@Override
	public void setIDGCN(java.lang.String IDGCN) {
		_importedXCD.setIDGCN(IDGCN);
	}

	/**
	* Returns the so to khai of this imported x c d.
	*
	* @return the so to khai of this imported x c d
	*/
	@Override
	public java.lang.String getSoToKhai() {
		return _importedXCD.getSoToKhai();
	}

	/**
	* Sets the so to khai of this imported x c d.
	*
	* @param SoToKhai the so to khai of this imported x c d
	*/
	@Override
	public void setSoToKhai(java.lang.String SoToKhai) {
		_importedXCD.setSoToKhai(SoToKhai);
	}

	/**
	* Returns the so dang ky of this imported x c d.
	*
	* @return the so dang ky of this imported x c d
	*/
	@Override
	public java.lang.String getSoDangKy() {
		return _importedXCD.getSoDangKy();
	}

	/**
	* Sets the so dang ky of this imported x c d.
	*
	* @param SoDangKy the so dang ky of this imported x c d
	*/
	@Override
	public void setSoDangKy(java.lang.String SoDangKy) {
		_importedXCD.setSoDangKy(SoDangKy);
	}

	/**
	* Returns the so bien ban of this imported x c d.
	*
	* @return the so bien ban of this imported x c d
	*/
	@Override
	public java.lang.String getSoBienBan() {
		return _importedXCD.getSoBienBan();
	}

	/**
	* Sets the so bien ban of this imported x c d.
	*
	* @param SoBienBan the so bien ban of this imported x c d
	*/
	@Override
	public void setSoBienBan(java.lang.String SoBienBan) {
		_importedXCD.setSoBienBan(SoBienBan);
	}

	/**
	* Returns the nguoi k t of this imported x c d.
	*
	* @return the nguoi k t of this imported x c d
	*/
	@Override
	public java.lang.String getNguoiKT() {
		return _importedXCD.getNguoiKT();
	}

	/**
	* Sets the nguoi k t of this imported x c d.
	*
	* @param NguoiKT the nguoi k t of this imported x c d
	*/
	@Override
	public void setNguoiKT(java.lang.String NguoiKT) {
		_importedXCD.setNguoiKT(NguoiKT);
	}

	/**
	* Returns the ngay kiem tra of this imported x c d.
	*
	* @return the ngay kiem tra of this imported x c d
	*/
	@Override
	public java.lang.String getNgayKiemTra() {
		return _importedXCD.getNgayKiemTra();
	}

	/**
	* Sets the ngay kiem tra of this imported x c d.
	*
	* @param NgayKiemTra the ngay kiem tra of this imported x c d
	*/
	@Override
	public void setNgayKiemTra(java.lang.String NgayKiemTra) {
		_importedXCD.setNgayKiemTra(NgayKiemTra);
	}

	/**
	* Returns the noi kiem tra of this imported x c d.
	*
	* @return the noi kiem tra of this imported x c d
	*/
	@Override
	public java.lang.String getNoiKiemTra() {
		return _importedXCD.getNoiKiemTra();
	}

	/**
	* Sets the noi kiem tra of this imported x c d.
	*
	* @param NoiKiemTra the noi kiem tra of this imported x c d
	*/
	@Override
	public void setNoiKiemTra(java.lang.String NoiKiemTra) {
		_importedXCD.setNoiKiemTra(NoiKiemTra);
	}

	/**
	* Returns the ma chu of this imported x c d.
	*
	* @return the ma chu of this imported x c d
	*/
	@Override
	public java.lang.String getMaChu() {
		return _importedXCD.getMaChu();
	}

	/**
	* Sets the ma chu of this imported x c d.
	*
	* @param MaChu the ma chu of this imported x c d
	*/
	@Override
	public void setMaChu(java.lang.String MaChu) {
		_importedXCD.setMaChu(MaChu);
	}

	/**
	* Returns the ten chu of this imported x c d.
	*
	* @return the ten chu of this imported x c d
	*/
	@Override
	public java.lang.String getTenChu() {
		return _importedXCD.getTenChu();
	}

	/**
	* Sets the ten chu of this imported x c d.
	*
	* @param TenChu the ten chu of this imported x c d
	*/
	@Override
	public void setTenChu(java.lang.String TenChu) {
		_importedXCD.setTenChu(TenChu);
	}

	/**
	* Returns the dia chi of this imported x c d.
	*
	* @return the dia chi of this imported x c d
	*/
	@Override
	public java.lang.String getDiaChi() {
		return _importedXCD.getDiaChi();
	}

	/**
	* Sets the dia chi of this imported x c d.
	*
	* @param DiaChi the dia chi of this imported x c d
	*/
	@Override
	public void setDiaChi(java.lang.String DiaChi) {
		_importedXCD.setDiaChi(DiaChi);
	}

	/**
	* Returns the dien thoai of this imported x c d.
	*
	* @return the dien thoai of this imported x c d
	*/
	@Override
	public java.lang.String getDienThoai() {
		return _importedXCD.getDienThoai();
	}

	/**
	* Sets the dien thoai of this imported x c d.
	*
	* @param DienThoai the dien thoai of this imported x c d
	*/
	@Override
	public void setDienThoai(java.lang.String DienThoai) {
		_importedXCD.setDienThoai(DienThoai);
	}

	/**
	* Returns the so f a x of this imported x c d.
	*
	* @return the so f a x of this imported x c d
	*/
	@Override
	public java.lang.String getSoFAX() {
		return _importedXCD.getSoFAX();
	}

	/**
	* Sets the so f a x of this imported x c d.
	*
	* @param SoFAX the so f a x of this imported x c d
	*/
	@Override
	public void setSoFAX(java.lang.String SoFAX) {
		_importedXCD.setSoFAX(SoFAX);
	}

	/**
	* Returns the ma chung loai of this imported x c d.
	*
	* @return the ma chung loai of this imported x c d
	*/
	@Override
	public java.lang.String getMaChungLoai() {
		return _importedXCD.getMaChungLoai();
	}

	/**
	* Sets the ma chung loai of this imported x c d.
	*
	* @param MaChungLoai the ma chung loai of this imported x c d
	*/
	@Override
	public void setMaChungLoai(java.lang.String MaChungLoai) {
		_importedXCD.setMaChungLoai(MaChungLoai);
	}

	/**
	* Returns the ma ten xe of this imported x c d.
	*
	* @return the ma ten xe of this imported x c d
	*/
	@Override
	public java.lang.String getMaTenXe() {
		return _importedXCD.getMaTenXe();
	}

	/**
	* Sets the ma ten xe of this imported x c d.
	*
	* @param MaTenXe the ma ten xe of this imported x c d
	*/
	@Override
	public void setMaTenXe(java.lang.String MaTenXe) {
		_importedXCD.setMaTenXe(MaTenXe);
	}

	/**
	* Returns the nhan hieu of this imported x c d.
	*
	* @return the nhan hieu of this imported x c d
	*/
	@Override
	public java.lang.String getNhanHieu() {
		return _importedXCD.getNhanHieu();
	}

	/**
	* Sets the nhan hieu of this imported x c d.
	*
	* @param NhanHieu the nhan hieu of this imported x c d
	*/
	@Override
	public void setNhanHieu(java.lang.String NhanHieu) {
		_importedXCD.setNhanHieu(NhanHieu);
	}

	/**
	* Returns the so loai of this imported x c d.
	*
	* @return the so loai of this imported x c d
	*/
	@Override
	public java.lang.String getSoLoai() {
		return _importedXCD.getSoLoai();
	}

	/**
	* Sets the so loai of this imported x c d.
	*
	* @param SoLoai the so loai of this imported x c d
	*/
	@Override
	public void setSoLoai(java.lang.String SoLoai) {
		_importedXCD.setSoLoai(SoLoai);
	}

	/**
	* Returns the ten thuong mai of this imported x c d.
	*
	* @return the ten thuong mai of this imported x c d
	*/
	@Override
	public java.lang.String getTenThuongMai() {
		return _importedXCD.getTenThuongMai();
	}

	/**
	* Sets the ten thuong mai of this imported x c d.
	*
	* @param TenThuongMai the ten thuong mai of this imported x c d
	*/
	@Override
	public void setTenThuongMai(java.lang.String TenThuongMai) {
		_importedXCD.setTenThuongMai(TenThuongMai);
	}

	/**
	* Returns the so dong co of this imported x c d.
	*
	* @return the so dong co of this imported x c d
	*/
	@Override
	public java.lang.String getSoDongCo() {
		return _importedXCD.getSoDongCo();
	}

	/**
	* Sets the so dong co of this imported x c d.
	*
	* @param SoDongCo the so dong co of this imported x c d
	*/
	@Override
	public void setSoDongCo(java.lang.String SoDongCo) {
		_importedXCD.setSoDongCo(SoDongCo);
	}

	/**
	* Returns the so khung of this imported x c d.
	*
	* @return the so khung of this imported x c d
	*/
	@Override
	public java.lang.String getSoKhung() {
		return _importedXCD.getSoKhung();
	}

	/**
	* Sets the so khung of this imported x c d.
	*
	* @param SoKhung the so khung of this imported x c d
	*/
	@Override
	public void setSoKhung(java.lang.String SoKhung) {
		_importedXCD.setSoKhung(SoKhung);
	}

	/**
	* Returns the nam sx of this imported x c d.
	*
	* @return the nam sx of this imported x c d
	*/
	@Override
	public java.lang.String getNamSx() {
		return _importedXCD.getNamSx();
	}

	/**
	* Sets the nam sx of this imported x c d.
	*
	* @param NamSx the nam sx of this imported x c d
	*/
	@Override
	public void setNamSx(java.lang.String NamSx) {
		_importedXCD.setNamSx(NamSx);
	}

	/**
	* Returns the noi sx of this imported x c d.
	*
	* @return the noi sx of this imported x c d
	*/
	@Override
	public java.lang.String getNoiSx() {
		return _importedXCD.getNoiSx();
	}

	/**
	* Sets the noi sx of this imported x c d.
	*
	* @param NoiSx the noi sx of this imported x c d
	*/
	@Override
	public void setNoiSx(java.lang.String NoiSx) {
		_importedXCD.setNoiSx(NoiSx);
	}

	/**
	* Returns the ngay den han of this imported x c d.
	*
	* @return the ngay den han of this imported x c d
	*/
	@Override
	public java.lang.String getNgayDenHan() {
		return _importedXCD.getNgayDenHan();
	}

	/**
	* Sets the ngay den han of this imported x c d.
	*
	* @param NgayDenHan the ngay den han of this imported x c d
	*/
	@Override
	public void setNgayDenHan(java.lang.String NgayDenHan) {
		_importedXCD.setNgayDenHan(NgayDenHan);
	}

	/**
	* Returns the ngay cap g c n of this imported x c d.
	*
	* @return the ngay cap g c n of this imported x c d
	*/
	@Override
	public java.lang.String getNgayCapGCN() {
		return _importedXCD.getNgayCapGCN();
	}

	/**
	* Sets the ngay cap g c n of this imported x c d.
	*
	* @param NgayCapGCN the ngay cap g c n of this imported x c d
	*/
	@Override
	public void setNgayCapGCN(java.lang.String NgayCapGCN) {
		_importedXCD.setNgayCapGCN(NgayCapGCN);
	}

	/**
	* Returns the ngay nhap of this imported x c d.
	*
	* @return the ngay nhap of this imported x c d
	*/
	@Override
	public java.lang.String getNgayNhap() {
		return _importedXCD.getNgayNhap();
	}

	/**
	* Sets the ngay nhap of this imported x c d.
	*
	* @param NgayNhap the ngay nhap of this imported x c d
	*/
	@Override
	public void setNgayNhap(java.lang.String NgayNhap) {
		_importedXCD.setNgayNhap(NgayNhap);
	}

	/**
	* Returns the note of this imported x c d.
	*
	* @return the note of this imported x c d
	*/
	@Override
	public java.lang.String getNote() {
		return _importedXCD.getNote();
	}

	/**
	* Sets the note of this imported x c d.
	*
	* @param Note the note of this imported x c d
	*/
	@Override
	public void setNote(java.lang.String Note) {
		_importedXCD.setNote(Note);
	}

	/**
	* Returns the login name of this imported x c d.
	*
	* @return the login name of this imported x c d
	*/
	@Override
	public java.lang.String getLoginName() {
		return _importedXCD.getLoginName();
	}

	/**
	* Sets the login name of this imported x c d.
	*
	* @param LoginName the login name of this imported x c d
	*/
	@Override
	public void setLoginName(java.lang.String LoginName) {
		_importedXCD.setLoginName(LoginName);
	}

	/**
	* Returns the m a d v of this imported x c d.
	*
	* @return the m a d v of this imported x c d
	*/
	@Override
	public java.lang.String getMADV() {
		return _importedXCD.getMADV();
	}

	/**
	* Sets the m a d v of this imported x c d.
	*
	* @param MADV the m a d v of this imported x c d
	*/
	@Override
	public void setMADV(java.lang.String MADV) {
		_importedXCD.setMADV(MADV);
	}

	/**
	* Returns the tinh trang of this imported x c d.
	*
	* @return the tinh trang of this imported x c d
	*/
	@Override
	public java.lang.String getTinhTrang() {
		return _importedXCD.getTinhTrang();
	}

	/**
	* Sets the tinh trang of this imported x c d.
	*
	* @param TinhTrang the tinh trang of this imported x c d
	*/
	@Override
	public void setTinhTrang(java.lang.String TinhTrang) {
		_importedXCD.setTinhTrang(TinhTrang);
	}

	/**
	* Returns the ghi chu of this imported x c d.
	*
	* @return the ghi chu of this imported x c d
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _importedXCD.getGhiChu();
	}

	/**
	* Sets the ghi chu of this imported x c d.
	*
	* @param GhiChu the ghi chu of this imported x c d
	*/
	@Override
	public void setGhiChu(java.lang.String GhiChu) {
		_importedXCD.setGhiChu(GhiChu);
	}

	/**
	* Returns the nguoi soat of this imported x c d.
	*
	* @return the nguoi soat of this imported x c d
	*/
	@Override
	public java.lang.String getNguoiSoat() {
		return _importedXCD.getNguoiSoat();
	}

	/**
	* Sets the nguoi soat of this imported x c d.
	*
	* @param NguoiSoat the nguoi soat of this imported x c d
	*/
	@Override
	public void setNguoiSoat(java.lang.String NguoiSoat) {
		_importedXCD.setNguoiSoat(NguoiSoat);
	}

	/**
	* Returns the ngay soat of this imported x c d.
	*
	* @return the ngay soat of this imported x c d
	*/
	@Override
	public java.lang.String getNgaySoat() {
		return _importedXCD.getNgaySoat();
	}

	/**
	* Sets the ngay soat of this imported x c d.
	*
	* @param NgaySoat the ngay soat of this imported x c d
	*/
	@Override
	public void setNgaySoat(java.lang.String NgaySoat) {
		_importedXCD.setNgaySoat(NgaySoat);
	}

	/**
	* Returns the ket qua of this imported x c d.
	*
	* @return the ket qua of this imported x c d
	*/
	@Override
	public java.lang.String getKetQua() {
		return _importedXCD.getKetQua();
	}

	/**
	* Sets the ket qua of this imported x c d.
	*
	* @param KetQua the ket qua of this imported x c d
	*/
	@Override
	public void setKetQua(java.lang.String KetQua) {
		_importedXCD.setKetQua(KetQua);
	}

	/**
	* Returns the s t t of this imported x c d.
	*
	* @return the s t t of this imported x c d
	*/
	@Override
	public long getSTT() {
		return _importedXCD.getSTT();
	}

	/**
	* Sets the s t t of this imported x c d.
	*
	* @param STT the s t t of this imported x c d
	*/
	@Override
	public void setSTT(long STT) {
		_importedXCD.setSTT(STT);
	}

	/**
	* Returns the ten xe of this imported x c d.
	*
	* @return the ten xe of this imported x c d
	*/
	@Override
	public java.lang.String getTenXe() {
		return _importedXCD.getTenXe();
	}

	/**
	* Sets the ten xe of this imported x c d.
	*
	* @param TenXe the ten xe of this imported x c d
	*/
	@Override
	public void setTenXe(java.lang.String TenXe) {
		_importedXCD.setTenXe(TenXe);
	}

	/**
	* Returns the ten chung loai of this imported x c d.
	*
	* @return the ten chung loai of this imported x c d
	*/
	@Override
	public java.lang.String getTenChungLoai() {
		return _importedXCD.getTenChungLoai();
	}

	/**
	* Sets the ten chung loai of this imported x c d.
	*
	* @param TenChungLoai the ten chung loai of this imported x c d
	*/
	@Override
	public void setTenChungLoai(java.lang.String TenChungLoai) {
		_importedXCD.setTenChungLoai(TenChungLoai);
	}

	/**
	* Returns the ma t s k t of this imported x c d.
	*
	* @return the ma t s k t of this imported x c d
	*/
	@Override
	public java.lang.String getMaTSKT() {
		return _importedXCD.getMaTSKT();
	}

	/**
	* Sets the ma t s k t of this imported x c d.
	*
	* @param MaTSKT the ma t s k t of this imported x c d
	*/
	@Override
	public void setMaTSKT(java.lang.String MaTSKT) {
		_importedXCD.setMaTSKT(MaTSKT);
	}

	/**
	* Returns the ten dac tinh v of this imported x c d.
	*
	* @return the ten dac tinh v of this imported x c d
	*/
	@Override
	public java.lang.String getTenDacTinhV() {
		return _importedXCD.getTenDacTinhV();
	}

	/**
	* Sets the ten dac tinh v of this imported x c d.
	*
	* @param TenDacTinhV the ten dac tinh v of this imported x c d
	*/
	@Override
	public void setTenDacTinhV(java.lang.String TenDacTinhV) {
		_importedXCD.setTenDacTinhV(TenDacTinhV);
	}

	/**
	* Returns the ten dac tinh a of this imported x c d.
	*
	* @return the ten dac tinh a of this imported x c d
	*/
	@Override
	public java.lang.String getTenDacTinhA() {
		return _importedXCD.getTenDacTinhA();
	}

	/**
	* Sets the ten dac tinh a of this imported x c d.
	*
	* @param TenDacTinhA the ten dac tinh a of this imported x c d
	*/
	@Override
	public void setTenDacTinhA(java.lang.String TenDacTinhA) {
		_importedXCD.setTenDacTinhA(TenDacTinhA);
	}

	/**
	* Returns the ma nhom dac tinh of this imported x c d.
	*
	* @return the ma nhom dac tinh of this imported x c d
	*/
	@Override
	public java.lang.String getMaNhomDacTinh() {
		return _importedXCD.getMaNhomDacTinh();
	}

	/**
	* Sets the ma nhom dac tinh of this imported x c d.
	*
	* @param MaNhomDacTinh the ma nhom dac tinh of this imported x c d
	*/
	@Override
	public void setMaNhomDacTinh(java.lang.String MaNhomDacTinh) {
		_importedXCD.setMaNhomDacTinh(MaNhomDacTinh);
	}

	/**
	* Returns the thu nguyen of this imported x c d.
	*
	* @return the thu nguyen of this imported x c d
	*/
	@Override
	public java.lang.String getThuNguyen() {
		return _importedXCD.getThuNguyen();
	}

	/**
	* Sets the thu nguyen of this imported x c d.
	*
	* @param ThuNguyen the thu nguyen of this imported x c d
	*/
	@Override
	public void setThuNguyen(java.lang.String ThuNguyen) {
		_importedXCD.setThuNguyen(ThuNguyen);
	}

	/**
	* Returns the gia tri of this imported x c d.
	*
	* @return the gia tri of this imported x c d
	*/
	@Override
	public java.lang.String getGiaTri() {
		return _importedXCD.getGiaTri();
	}

	/**
	* Sets the gia tri of this imported x c d.
	*
	* @param GiaTri the gia tri of this imported x c d
	*/
	@Override
	public void setGiaTri(java.lang.String GiaTri) {
		_importedXCD.setGiaTri(GiaTri);
	}

	@Override
	public boolean isNew() {
		return _importedXCD.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_importedXCD.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _importedXCD.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_importedXCD.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _importedXCD.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _importedXCD.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_importedXCD.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _importedXCD.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_importedXCD.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_importedXCD.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_importedXCD.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ImportedXCDWrapper((ImportedXCD)_importedXCD.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD importedXCD) {
		return _importedXCD.compareTo(importedXCD);
	}

	@Override
	public int hashCode() {
		return _importedXCD.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> toCacheModel() {
		return _importedXCD.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD toEscapedModel() {
		return new ImportedXCDWrapper(_importedXCD.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD toUnescapedModel() {
		return new ImportedXCDWrapper(_importedXCD.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _importedXCD.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _importedXCD.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_importedXCD.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ImportedXCDWrapper)) {
			return false;
		}

		ImportedXCDWrapper importedXCDWrapper = (ImportedXCDWrapper)obj;

		if (Validator.equals(_importedXCD, importedXCDWrapper._importedXCD)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ImportedXCD getWrappedImportedXCD() {
		return _importedXCD;
	}

	@Override
	public ImportedXCD getWrappedModel() {
		return _importedXCD;
	}

	@Override
	public void resetOriginalValues() {
		_importedXCD.resetOriginalValues();
	}

	private ImportedXCD _importedXCD;
}