package vn.dtt.gt.dk.api.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "soChungChi",
    "maNhomPhuongTien",
    "tenNhomPhuongTien",
    "maLoaiPhuongTien",
    "tenLoaiPhuongTien",
    "maNuocSanXuat",
    "tenNuocSanXuat",
    "maNhanHieu",
    "tenNhanHieu",
    "tenThuongMai",
    "namSanXuat",
    "theTichLamViec",
    "soChoNgoi",
    "soKhung",
    "soMay",
    "tinhTrangPhuongTien",
    "fileChungChi",
})
@XmlRootElement(name = "CertificateXMY")
public class CertificateXMY {
	
	@XmlElement(name = "SoChungChi", required = true)
	protected String soChungChi;
	
	@XmlElement(name = "MaNhomPhuongTien", required = true)
	protected String maNhomPhuongTien;
	
	@XmlElement(name = "TenNhomPhuongTien", required = true)
	protected String tenNhomPhuongTien;
	
	@XmlElement(name = "MaLoaiPhuongTien", required = true)
	protected String maLoaiPhuongTien;
	
	@XmlElement(name = "TenLoaiPhuongTien", required = true)
	protected String tenLoaiPhuongTien;
	
	@XmlElement(name = "MaNuocSanXuat", required = true)
	protected String maNuocSanXuat;
	
	@XmlElement(name = "TenNuocSanXuat", required = true)
	protected String tenNuocSanXuat;
	
	@XmlElement(name = "MaNhanHieu", required = true)
	protected String maNhanHieu;
	
	@XmlElement(name = "TenNhanHieu", required = true)
	protected String tenNhanHieu;
	
	@XmlElement(name = "TenThuongMai", required = true)
	protected String tenThuongMai;
	
	@XmlElement(name = "NamSanXuat", required = true)
	protected String namSanXuat;
	
	@XmlElement(name = "TheTichLamViec", required = true)
	protected String theTichLamViec;
	
	@XmlElement(name = "SoChoNgoi", required = true)
	protected String soChoNgoi;
	
	@XmlElement(name = "SoKhung", required = true)
	protected String soKhung;
	
	@XmlElement(name = "SoMay", required = true)
	protected String soMay;
	
	@XmlElement(name = "TinhTrangPhuongTien", required = true)
	protected String tinhTrangPhuongTien;
	
	@XmlElement(name = "FileChungChi", required = true)
	protected String fileChungChi;
	
	public String getSoChungChi() {
		return soChungChi;
	}

	public void setSoChungChi(String soChungChi) {
		this.soChungChi = soChungChi;
	}

	public String getMaNhomPhuongTien() {
		return maNhomPhuongTien;
	}

	public void setMaNhomPhuongTien(String maNhomPhuongTien) {
		this.maNhomPhuongTien = maNhomPhuongTien;
	}

	public String getTenNhomPhuongTien() {
		return tenNhomPhuongTien;
	}

	public void setTenNhomPhuongTien(String tenNhomPhuongTien) {
		this.tenNhomPhuongTien = tenNhomPhuongTien;
	}

	public String getMaLoaiPhuongTien() {
		return maLoaiPhuongTien;
	}

	public void setMaLoaiPhuongTien(String maLoaiPhuongTien) {
		this.maLoaiPhuongTien = maLoaiPhuongTien;
	}

	public String getTenLoaiPhuongTien() {
		return tenLoaiPhuongTien;
	}

	public void setTenLoaiPhuongTien(String tenLoaiPhuongTien) {
		this.tenLoaiPhuongTien = tenLoaiPhuongTien;
	}

	public String getMaNuocSanXuat() {
		return maNuocSanXuat;
	}

	public void setMaNuocSanXuat(String maNuocSanXuat) {
		this.maNuocSanXuat = maNuocSanXuat;
	}

	public String getTenNuocSanXuat() {
		return tenNuocSanXuat;
	}

	public void setTenNuocSanXuat(String tenNuocSanXuat) {
		this.tenNuocSanXuat = tenNuocSanXuat;
	}

	public String getMaNhanHieu() {
		return maNhanHieu;
	}

	public void setMaNhanHieu(String maNhanHieu) {
		this.maNhanHieu = maNhanHieu;
	}

	public String getTenNhanHieu() {
		return tenNhanHieu;
	}

	public void setTenNhanHieu(String tenNhanHieu) {
		this.tenNhanHieu = tenNhanHieu;
	}

	public String getTenThuongMai() {
		return tenThuongMai;
	}

	public void setTenThuongMai(String tenThuongMai) {
		this.tenThuongMai = tenThuongMai;
	}

	public String getNamSanXuat() {
		return namSanXuat;
	}

	public void setNamSanXuat(String namSanXuat) {
		this.namSanXuat = namSanXuat;
	}

	public String getTheTichLamViec() {
		return theTichLamViec;
	}

	public void setTheTichLamViec(String theTichLamViec) {
		this.theTichLamViec = theTichLamViec;
	}

	public String getSoChoNgoi() {
		return soChoNgoi;
	}

	public void setSoChoNgoi(String soChoNgoi) {
		this.soChoNgoi = soChoNgoi;
	}
	
	public String getSoKhung() {
		return soKhung;
	}

	public void setSoKhung(String soKhung) {
		this.soKhung = soKhung;
	}

	public String getSoMay() {
		return soMay;
	}

	public void setSoMay(String soMay) {
		this.soMay = soMay;
	}

	public String getTinhTrangPhuongTien() {
		return tinhTrangPhuongTien;
	}

	public void setTinhTrangPhuongTien(String tinhTrangPhuongTien) {
		this.tinhTrangPhuongTien = tinhTrangPhuongTien;
	}
	
	public String getFileChungChi() {
		return fileChungChi;
	}

	public void setFileChungChi(String fileChungChi) {
		this.fileChungChi = fileChungChi;
	}
}
