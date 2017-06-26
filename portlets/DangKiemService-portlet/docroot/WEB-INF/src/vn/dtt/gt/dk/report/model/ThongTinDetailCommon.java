package vn.dtt.gt.dk.report.model;

import java.util.List;

public class ThongTinDetailCommon {
	
	private double totalPhiPsTruocThue;
	private double totalThue;
	private double totalLePhiCapCc;
	private double totalTongTien;
	private List<ThongTinDetailLePhi> allThongTinDetailLePhi;
	
	public double getTotalPhiPsTruocThue() {
		return totalPhiPsTruocThue;
	}
	public void setTotalPhiPsTruocThue(double totalPhiPsTruocThue) {
		this.totalPhiPsTruocThue = totalPhiPsTruocThue;
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
	public List<ThongTinDetailLePhi> getAllThongTinDetailLePhi() {
		return allThongTinDetailLePhi;
	}
	public void setAllThongTinDetailLePhi(List<ThongTinDetailLePhi> allThongTinDetailLePhi) {
		this.allThongTinDetailLePhi = allThongTinDetailLePhi;
	}
}
