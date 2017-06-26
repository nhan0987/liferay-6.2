package vn.dtt.gt.dk.report.model.thongbaotrungsokhungsodongco;

import java.util.List;

import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord;


public class ThongBaoTrungSoKhungSoDongCo {
	private String soHoSo;
	private String soDKKT;
	private String nguoiNhapKhau;
	private String nguoiLienHe;
	private String soDienThoai;
	private long soKhungSoDongCoBiTrung;
	private List<VehicleRecord> lstVehicleRecords;
	
	public String getSoHoSo() {
		return soHoSo;
	}
	public void setSoHoSo(String soHoSo) {
		this.soHoSo = soHoSo;
	}
	public String getSoDKKT() {
		return soDKKT;
	}
	public void setSoDKKT(String soDKKT) {
		this.soDKKT = soDKKT;
	}
	public String getNguoiLienHe() {
		return nguoiLienHe;
	}
	public void setNguoiLienHe(String nguoiLienHe) {
		this.nguoiLienHe = nguoiLienHe;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public long getSoKhungSoDongCoBiTrung() {
		return soKhungSoDongCoBiTrung;
	}
	public void setSoKhungSoDongCoBiTrung(long soKhungSoDongCoBiTrung) {
		this.soKhungSoDongCoBiTrung = soKhungSoDongCoBiTrung;
	}
	public List<VehicleRecord> getLstVehicleRecords() {
		return lstVehicleRecords;
	}
	public void setLstVehicleRecords(List<VehicleRecord> lstVehicleRecords) {
		this.lstVehicleRecords = lstVehicleRecords;
	}
	public String getNguoiNhapKhau() {
		return nguoiNhapKhau;
	}
	public void setNguoiNhapKhau(String nguoiNhapKhau) {
		this.nguoiNhapKhau = nguoiNhapKhau;
	}
	
}
