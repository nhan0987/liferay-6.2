package vn.dtt.gt.dk.report.model;

import java.util.List;

public class ThongTinChungCommon {
	private long totalSoLuongXe;
	private double totalPhiKtTruocThue;
	private double totalPhiPsTruocThue;
	private double totalCongPhi;
	private double totalThue;
	private double totalLePhiCapCc;
	private double totalTongTien;
	
	public long getTotalSoLuongXe() {
		return totalSoLuongXe;
	}

	public void setTotalSoLuongXe(long totalSoLuongXe) {
		this.totalSoLuongXe = totalSoLuongXe;
	}

	public double getTotalPhiKtTruocThue() {
		return totalPhiKtTruocThue;
	}

	public void setTotalPhiKtTruocThue(double totalPhiKtTruocThue) {
		this.totalPhiKtTruocThue = totalPhiKtTruocThue;
	}

	public double getTotalPhiPsTruocThue() {
		return totalPhiPsTruocThue;
	}

	public void setTotalPhiPsTruocThue(double totalPhiPsTruocThue) {
		this.totalPhiPsTruocThue = totalPhiPsTruocThue;
	}

	public double getTotalCongPhi() {
		return totalCongPhi;
	}

	public void setTotalCongPhi(double totalCongPhi) {
		this.totalCongPhi = totalCongPhi;
	}

	public double getTotalThue() {
		return totalThue;
	}

	public void setTotalThue(double totalThue) {
		this.totalThue = totalThue;
	}

	public double getTotalLePhiCapCc() {
		return totalLePhiCapCc;
	}

	public void setTotalLePhiCapCc(double totalLePhiCapCc) {
		this.totalLePhiCapCc = totalLePhiCapCc;
	}

	public double getTotalTongTien() {
		return totalTongTien;
	}

	public void setTotalTongTien(double totalTongTien) {
		this.totalTongTien = totalTongTien;
	}

	public List<ThongTinChungLePhi> getAllThongTinChungLePhi() {
		return allThongTinChungLePhi;
	}

	public void setAllThongTinChungLePhi(List<ThongTinChungLePhi> allThongTinChungLePhi) {
		this.allThongTinChungLePhi = allThongTinChungLePhi;
	}

	private List<ThongTinChungLePhi> allThongTinChungLePhi;
	
}
