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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.ImportedXCDServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.ImportedXCDServiceSoap
 * @generated
 */
public class ImportedXCDSoap implements Serializable {
	public static ImportedXCDSoap toSoapModel(ImportedXCD model) {
		ImportedXCDSoap soapModel = new ImportedXCDSoap();

		soapModel.setId(model.getId());
		soapModel.setTrangthai(model.getTrangthai());
		soapModel.setIDGCN(model.getIDGCN());
		soapModel.setSoToKhai(model.getSoToKhai());
		soapModel.setSoDangKy(model.getSoDangKy());
		soapModel.setSoBienBan(model.getSoBienBan());
		soapModel.setNguoiKT(model.getNguoiKT());
		soapModel.setNgayKiemTra(model.getNgayKiemTra());
		soapModel.setNoiKiemTra(model.getNoiKiemTra());
		soapModel.setMaChu(model.getMaChu());
		soapModel.setTenChu(model.getTenChu());
		soapModel.setDiaChi(model.getDiaChi());
		soapModel.setDienThoai(model.getDienThoai());
		soapModel.setSoFAX(model.getSoFAX());
		soapModel.setMaChungLoai(model.getMaChungLoai());
		soapModel.setMaTenXe(model.getMaTenXe());
		soapModel.setNhanHieu(model.getNhanHieu());
		soapModel.setSoLoai(model.getSoLoai());
		soapModel.setTenThuongMai(model.getTenThuongMai());
		soapModel.setSoDongCo(model.getSoDongCo());
		soapModel.setSoKhung(model.getSoKhung());
		soapModel.setNamSx(model.getNamSx());
		soapModel.setNoiSx(model.getNoiSx());
		soapModel.setNgayDenHan(model.getNgayDenHan());
		soapModel.setNgayCapGCN(model.getNgayCapGCN());
		soapModel.setNgayNhap(model.getNgayNhap());
		soapModel.setNote(model.getNote());
		soapModel.setLoginName(model.getLoginName());
		soapModel.setMADV(model.getMADV());
		soapModel.setTinhTrang(model.getTinhTrang());
		soapModel.setGhiChu(model.getGhiChu());
		soapModel.setNguoiSoat(model.getNguoiSoat());
		soapModel.setNgaySoat(model.getNgaySoat());
		soapModel.setKetQua(model.getKetQua());
		soapModel.setSTT(model.getSTT());
		soapModel.setTenXe(model.getTenXe());
		soapModel.setTenChungLoai(model.getTenChungLoai());
		soapModel.setMaTSKT(model.getMaTSKT());
		soapModel.setTenDacTinhV(model.getTenDacTinhV());
		soapModel.setTenDacTinhA(model.getTenDacTinhA());
		soapModel.setMaNhomDacTinh(model.getMaNhomDacTinh());
		soapModel.setThuNguyen(model.getThuNguyen());
		soapModel.setGiaTri(model.getGiaTri());

		return soapModel;
	}

	public static ImportedXCDSoap[] toSoapModels(ImportedXCD[] models) {
		ImportedXCDSoap[] soapModels = new ImportedXCDSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ImportedXCDSoap[][] toSoapModels(ImportedXCD[][] models) {
		ImportedXCDSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ImportedXCDSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ImportedXCDSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ImportedXCDSoap[] toSoapModels(List<ImportedXCD> models) {
		List<ImportedXCDSoap> soapModels = new ArrayList<ImportedXCDSoap>(models.size());

		for (ImportedXCD model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ImportedXCDSoap[soapModels.size()]);
	}

	public ImportedXCDSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getTrangthai() {
		return _trangthai;
	}

	public void setTrangthai(long trangthai) {
		_trangthai = trangthai;
	}

	public String getIDGCN() {
		return _IDGCN;
	}

	public void setIDGCN(String IDGCN) {
		_IDGCN = IDGCN;
	}

	public String getSoToKhai() {
		return _SoToKhai;
	}

	public void setSoToKhai(String SoToKhai) {
		_SoToKhai = SoToKhai;
	}

	public String getSoDangKy() {
		return _SoDangKy;
	}

	public void setSoDangKy(String SoDangKy) {
		_SoDangKy = SoDangKy;
	}

	public String getSoBienBan() {
		return _SoBienBan;
	}

	public void setSoBienBan(String SoBienBan) {
		_SoBienBan = SoBienBan;
	}

	public String getNguoiKT() {
		return _NguoiKT;
	}

	public void setNguoiKT(String NguoiKT) {
		_NguoiKT = NguoiKT;
	}

	public String getNgayKiemTra() {
		return _NgayKiemTra;
	}

	public void setNgayKiemTra(String NgayKiemTra) {
		_NgayKiemTra = NgayKiemTra;
	}

	public String getNoiKiemTra() {
		return _NoiKiemTra;
	}

	public void setNoiKiemTra(String NoiKiemTra) {
		_NoiKiemTra = NoiKiemTra;
	}

	public String getMaChu() {
		return _MaChu;
	}

	public void setMaChu(String MaChu) {
		_MaChu = MaChu;
	}

	public String getTenChu() {
		return _TenChu;
	}

	public void setTenChu(String TenChu) {
		_TenChu = TenChu;
	}

	public String getDiaChi() {
		return _DiaChi;
	}

	public void setDiaChi(String DiaChi) {
		_DiaChi = DiaChi;
	}

	public String getDienThoai() {
		return _DienThoai;
	}

	public void setDienThoai(String DienThoai) {
		_DienThoai = DienThoai;
	}

	public String getSoFAX() {
		return _SoFAX;
	}

	public void setSoFAX(String SoFAX) {
		_SoFAX = SoFAX;
	}

	public String getMaChungLoai() {
		return _MaChungLoai;
	}

	public void setMaChungLoai(String MaChungLoai) {
		_MaChungLoai = MaChungLoai;
	}

	public String getMaTenXe() {
		return _MaTenXe;
	}

	public void setMaTenXe(String MaTenXe) {
		_MaTenXe = MaTenXe;
	}

	public String getNhanHieu() {
		return _NhanHieu;
	}

	public void setNhanHieu(String NhanHieu) {
		_NhanHieu = NhanHieu;
	}

	public String getSoLoai() {
		return _SoLoai;
	}

	public void setSoLoai(String SoLoai) {
		_SoLoai = SoLoai;
	}

	public String getTenThuongMai() {
		return _TenThuongMai;
	}

	public void setTenThuongMai(String TenThuongMai) {
		_TenThuongMai = TenThuongMai;
	}

	public String getSoDongCo() {
		return _SoDongCo;
	}

	public void setSoDongCo(String SoDongCo) {
		_SoDongCo = SoDongCo;
	}

	public String getSoKhung() {
		return _SoKhung;
	}

	public void setSoKhung(String SoKhung) {
		_SoKhung = SoKhung;
	}

	public String getNamSx() {
		return _NamSx;
	}

	public void setNamSx(String NamSx) {
		_NamSx = NamSx;
	}

	public String getNoiSx() {
		return _NoiSx;
	}

	public void setNoiSx(String NoiSx) {
		_NoiSx = NoiSx;
	}

	public String getNgayDenHan() {
		return _NgayDenHan;
	}

	public void setNgayDenHan(String NgayDenHan) {
		_NgayDenHan = NgayDenHan;
	}

	public String getNgayCapGCN() {
		return _NgayCapGCN;
	}

	public void setNgayCapGCN(String NgayCapGCN) {
		_NgayCapGCN = NgayCapGCN;
	}

	public String getNgayNhap() {
		return _NgayNhap;
	}

	public void setNgayNhap(String NgayNhap) {
		_NgayNhap = NgayNhap;
	}

	public String getNote() {
		return _Note;
	}

	public void setNote(String Note) {
		_Note = Note;
	}

	public String getLoginName() {
		return _LoginName;
	}

	public void setLoginName(String LoginName) {
		_LoginName = LoginName;
	}

	public String getMADV() {
		return _MADV;
	}

	public void setMADV(String MADV) {
		_MADV = MADV;
	}

	public String getTinhTrang() {
		return _TinhTrang;
	}

	public void setTinhTrang(String TinhTrang) {
		_TinhTrang = TinhTrang;
	}

	public String getGhiChu() {
		return _GhiChu;
	}

	public void setGhiChu(String GhiChu) {
		_GhiChu = GhiChu;
	}

	public String getNguoiSoat() {
		return _NguoiSoat;
	}

	public void setNguoiSoat(String NguoiSoat) {
		_NguoiSoat = NguoiSoat;
	}

	public String getNgaySoat() {
		return _NgaySoat;
	}

	public void setNgaySoat(String NgaySoat) {
		_NgaySoat = NgaySoat;
	}

	public String getKetQua() {
		return _KetQua;
	}

	public void setKetQua(String KetQua) {
		_KetQua = KetQua;
	}

	public long getSTT() {
		return _STT;
	}

	public void setSTT(long STT) {
		_STT = STT;
	}

	public String getTenXe() {
		return _TenXe;
	}

	public void setTenXe(String TenXe) {
		_TenXe = TenXe;
	}

	public String getTenChungLoai() {
		return _TenChungLoai;
	}

	public void setTenChungLoai(String TenChungLoai) {
		_TenChungLoai = TenChungLoai;
	}

	public String getMaTSKT() {
		return _MaTSKT;
	}

	public void setMaTSKT(String MaTSKT) {
		_MaTSKT = MaTSKT;
	}

	public String getTenDacTinhV() {
		return _TenDacTinhV;
	}

	public void setTenDacTinhV(String TenDacTinhV) {
		_TenDacTinhV = TenDacTinhV;
	}

	public String getTenDacTinhA() {
		return _TenDacTinhA;
	}

	public void setTenDacTinhA(String TenDacTinhA) {
		_TenDacTinhA = TenDacTinhA;
	}

	public String getMaNhomDacTinh() {
		return _MaNhomDacTinh;
	}

	public void setMaNhomDacTinh(String MaNhomDacTinh) {
		_MaNhomDacTinh = MaNhomDacTinh;
	}

	public String getThuNguyen() {
		return _ThuNguyen;
	}

	public void setThuNguyen(String ThuNguyen) {
		_ThuNguyen = ThuNguyen;
	}

	public String getGiaTri() {
		return _GiaTri;
	}

	public void setGiaTri(String GiaTri) {
		_GiaTri = GiaTri;
	}

	private long _id;
	private long _trangthai;
	private String _IDGCN;
	private String _SoToKhai;
	private String _SoDangKy;
	private String _SoBienBan;
	private String _NguoiKT;
	private String _NgayKiemTra;
	private String _NoiKiemTra;
	private String _MaChu;
	private String _TenChu;
	private String _DiaChi;
	private String _DienThoai;
	private String _SoFAX;
	private String _MaChungLoai;
	private String _MaTenXe;
	private String _NhanHieu;
	private String _SoLoai;
	private String _TenThuongMai;
	private String _SoDongCo;
	private String _SoKhung;
	private String _NamSx;
	private String _NoiSx;
	private String _NgayDenHan;
	private String _NgayCapGCN;
	private String _NgayNhap;
	private String _Note;
	private String _LoginName;
	private String _MADV;
	private String _TinhTrang;
	private String _GhiChu;
	private String _NguoiSoat;
	private String _NgaySoat;
	private String _KetQua;
	private long _STT;
	private String _TenXe;
	private String _TenChungLoai;
	private String _MaTSKT;
	private String _TenDacTinhV;
	private String _TenDacTinhA;
	private String _MaNhomDacTinh;
	private String _ThuNguyen;
	private String _GiaTri;
}