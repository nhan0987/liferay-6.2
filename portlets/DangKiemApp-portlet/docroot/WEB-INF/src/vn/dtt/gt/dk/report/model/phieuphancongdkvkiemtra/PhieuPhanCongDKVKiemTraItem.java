package vn.dtt.gt.dk.report.model.phieuphancongdkvkiemtra;

import java.util.List;

public class PhieuPhanCongDKVKiemTraItem {
	private String TenDoi;
	private String NgayKiemTra;
	private String DangKiemVienKiemTra;
	private List<PhieuPhanCongDKVKiemTraDSHoSo> phieuPhanCongDKVKiemTraDSHoSos;
	private String DoiTruong;
	public String getTenDoi() {
		return TenDoi;
	}
	public void setTenDoi(String tenDoi) {
		TenDoi = tenDoi;
	}
	public String getNgayKiemTra() {
		return NgayKiemTra;
	}
	public void setNgayKiemTra(String ngayKiemTra) {
		NgayKiemTra = ngayKiemTra;
	}
	public String getDangKiemVienKiemTra() {
		return DangKiemVienKiemTra;
	}
	public void setDangKiemVienKiemTra(String dangKiemVienKiemTra) {
		DangKiemVienKiemTra = dangKiemVienKiemTra;
	}
	public List<PhieuPhanCongDKVKiemTraDSHoSo> getPhieuPhanCongDKVKiemTraDSHoSos() {
		return phieuPhanCongDKVKiemTraDSHoSos;
	}
	public void setPhieuPhanCongDKVKiemTraDSHoSos(
			List<PhieuPhanCongDKVKiemTraDSHoSo> phieuPhanCongDKVKiemTraDSHoSos) {
		this.phieuPhanCongDKVKiemTraDSHoSos = phieuPhanCongDKVKiemTraDSHoSos;
	}
	public String getDoiTruong() {
		return DoiTruong;
	}
	public void setDoiTruong(String doiTruong) {
		DoiTruong = doiTruong;
	}
	
	
	
}
