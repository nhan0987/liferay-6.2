package vn.dtt.gt.dk.report.model.lichdenghikiemtra;

import java.util.List;

import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord;

public class LichDeNghiKiemTraItem {
	private String TenDoi;
	private String NgayDeNghiKiemTra;
	private String SoHoSoKiemTra;
	private String SoHQ;
	private String NgayTKHQ;
	private String MaChiCucHQ;
	private String NguoiLienHe;
	private String SoDienThoaiNguoiLienHe;
	private String DiaDiem;
	private String DiaDiemQuan;
	private String DiaDiemThanhPho;
	private String GhiChu;
	private List<LichDeNghiKiemTraChiTietPhuongTien> DanhSachChiTietPhuongTien;
//	private List<VehicleRecord> allVehicleRecords;
//	
//	
//	public List<VehicleRecord> getAllVehicleRecords() {
//		return allVehicleRecords;
//	}
//	public void setAllVehicleRecords(List<VehicleRecord> allVehicleRecords) {
//		this.allVehicleRecords = allVehicleRecords;
//	}
	
	public String getTenDoi() {
		return TenDoi;
	}
	public void setTenDoi(String tenDoi) {
		TenDoi = tenDoi;
	}
	public String getNgayDeNghiKiemTra() {
		return NgayDeNghiKiemTra;
	}
	public void setNgayDeNghiKiemTra(String ngayDeNghiKiemTra) {
		NgayDeNghiKiemTra = ngayDeNghiKiemTra;
	}
	public String getSoHoSoKiemTra() {
		return SoHoSoKiemTra;
	}
	public void setSoHoSoKiemTra(String soHoSoKiemTra) {
		SoHoSoKiemTra = soHoSoKiemTra;
	}
	public String getSoHQ() {
		return SoHQ;
	}
	public void setSoHQ(String soHQ) {
		SoHQ = soHQ;
	}
	public String getNgayTKHQ() {
		return NgayTKHQ;
	}
	public void setNgayTKHQ(String ngayTKHQ) {
		NgayTKHQ = ngayTKHQ;
	}
	public String getMaChiCucHQ() {
		return MaChiCucHQ;
	}
	public void setMaChiCucHQ(String maChiCucHQ) {
		MaChiCucHQ = maChiCucHQ;
	}
	public String getNguoiLienHe() {
		return NguoiLienHe;
	}
	public void setNguoiLienHe(String nguoiLienHe) {
		NguoiLienHe = nguoiLienHe;
	}
	public String getSoDienThoaiNguoiLienHe() {
		return SoDienThoaiNguoiLienHe;
	}
	public void setSoDienThoaiNguoiLienHe(String soDienThoaiNguoiLienHe) {
		SoDienThoaiNguoiLienHe = soDienThoaiNguoiLienHe;
	}
	public String getDiaDiem() {
		return DiaDiem;
	}
	public void setDiaDiem(String diaDiem) {
		DiaDiem = diaDiem;
	}
	public String getDiaDiemQuan() {
		return DiaDiemQuan;
	}
	public void setDiaDiemQuan(String diaDiemQuan) {
		DiaDiemQuan = diaDiemQuan;
	}
	public String getDiaDiemThanhPho() {
		return DiaDiemThanhPho;
	}
	public void setDiaDiemThanhPho(String diaDiemThanhPho) {
		DiaDiemThanhPho = diaDiemThanhPho;
	}
	public String getGhiChu() {
		return GhiChu;
	}
	public void setGhiChu(String ghiChu) {
		GhiChu = ghiChu;
	}
	public List<LichDeNghiKiemTraChiTietPhuongTien> getDanhSachChiTietPhuongTien() {
		return DanhSachChiTietPhuongTien;
	}
	public void setDanhSachChiTietPhuongTien(
			List<LichDeNghiKiemTraChiTietPhuongTien> danhSachChiTietPhuongTien) {
		DanhSachChiTietPhuongTien = danhSachChiTietPhuongTien;
	}
	
}
