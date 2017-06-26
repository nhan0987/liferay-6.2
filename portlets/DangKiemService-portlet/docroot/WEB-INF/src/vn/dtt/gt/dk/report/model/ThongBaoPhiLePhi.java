package vn.dtt.gt.dk.report.model;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote;
import vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails;
import vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord;
import vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteDetailsLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceUtil;
import vn.dtt.gt.dk.report.ReportUtils;

public class ThongBaoPhiLePhi {
	private static Log _log = LogFactoryUtil.getLog(ThongBaoPhiLePhi.class);
	private DebitNote debitNote;
	private List<ThongTinChungCommon> allThongTinChungCommon;
	private List<ThongTinDetailCommon> allThongTinDetailCommon;
	private RegisteredInspection registeredInspection;
	
	public DebitNote getDebitNote() {
		return debitNote;
	}
	public void setDebitNote(DebitNote debitNote) {
		this.debitNote = debitNote;
	}
	
	public RegisteredInspection getRegisteredInspection() {
		return registeredInspection;
	}
	public void setRegisteredInspection(RegisteredInspection registeredInspection) {
		this.registeredInspection = registeredInspection;
	}
	public List<ThongTinChungCommon> getAllThongTinChungCommon() {
		return allThongTinChungCommon;
	}
	public void setAllThongTinChungCommon(List<ThongTinChungCommon> allThongTinChungCommon) {
		this.allThongTinChungCommon = allThongTinChungCommon;
	}
	public List<ThongTinDetailCommon> getAllThongTinDetailCommon() {
		return allThongTinDetailCommon;
	}
	public void setAllThongTinDetailCommon(List<ThongTinDetailCommon> allThongTinDetailCommon) {
		this.allThongTinDetailCommon = allThongTinDetailCommon;
	}
	
	public static ThongBaoPhiLePhi getModelByDebitNoteId(long debitNoteId) {
		ThongBaoPhiLePhi result = new ThongBaoPhiLePhi();
		try {
			DebitNote debitNote;
			List<ThongTinChungCommon> allThongTinChungCommon = null;
			ThongTinChungCommon thongTinChungCommon = null;
			List<ThongTinChungLePhi> allThongTinChungLePhi = null;
			ThongTinChungLePhi thongTinChungLePhi = null;
			List<ThongTinDetailCommon> allThongTinDetailCommon = null;
			ThongTinDetailCommon thongTinDetailCommon = null;
			List<ThongTinDetailLePhi> allThongTinDetailLePhi = null;
			ThongTinDetailLePhi thongTinDetailLePhi = null;
			
			debitNote = DebitNoteLocalServiceUtil.fetchDebitNote(debitNoteId);
			result.setDebitNote(debitNote);
			List<DebitNoteDetails> listbitNoteDetails = DebitNoteDetailsLocalServiceUtil.findByDebitNoteId(debitNoteId);
			List<VehicleRecord> listVehicleRecords = VehicleRecordLocalServiceUtil.findByDebitNoteId(debitNoteId);
			VehicleRecord vehicleRecord = null;
			VehicleGroup vehicleGroup = null;
			CertificateRecord certificateRecord = null;
			RegisteredInspection registeredInspection = null;
			String tenToChucNK = "";
			
			if(listbitNoteDetails != null){
				thongTinDetailCommon = new ThongTinDetailCommon();
				double phiPsTruocThueCommon = 0;
				double thueCommon = 0;
				double lePhiCapCcCommon = 0;
				double tongTienCommon = 0;
				
				allThongTinDetailLePhi = new ArrayList<ThongTinDetailLePhi>();
				for (DebitNoteDetails debitNoteDetail : listbitNoteDetails) {
					thongTinDetailLePhi = new ThongTinDetailLePhi();
					vehicleRecord = VehicleRecordLocalServiceUtil.fetchVehicleRecord(debitNoteDetail.getVehicleRecordId());
					// set thong tin phi					
					thongTinDetailLePhi.setPhiKtTruocThue((new Double(debitNoteDetail.getInspectionFee())).longValue());
					thongTinDetailLePhi.setPhiPsTruocThue((new Double(debitNoteDetail.getOtherCosts())).longValue());
					thongTinDetailLePhi.setThue((new Double(debitNoteDetail.getTax())).longValue());
					thongTinDetailLePhi.setLePhiCapCc((new Double(debitNoteDetail.getCharges())).longValue());
					thongTinDetailLePhi.setTongTien((new Double(debitNoteDetail.getTotalDebit())).longValue());
					
					phiPsTruocThueCommon = phiPsTruocThueCommon + debitNoteDetail.getOtherCosts();
					thueCommon = thueCommon + debitNoteDetail.getTax();
					lePhiCapCcCommon = lePhiCapCcCommon + debitNoteDetail.getCharges();
					tongTienCommon = tongTienCommon + debitNoteDetail.getTotalDebit();
//					
					if(vehicleRecord != null){
						
						thongTinDetailLePhi.setSoKhung(String.valueOf(vehicleRecord.getChassisNumber()));
						certificateRecord = CertificateRecordLocalServiceUtil.fetchCertificateRecord(vehicleRecord.getCertificateRecordId());
						if(certificateRecord != null){
							thongTinDetailLePhi.setSoChungChi(certificateRecord.getCertificateNumber());
						}
						vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecord.getVehicleGroupId());
						if(vehicleGroup != null){
							thongTinDetailLePhi.setNhanHieuSoLoai(ReportUtils.getTenDmDataByCode2(vehicleGroup.getTradeMark()) + "/" + vehicleGroup.getCommercialName());
							registeredInspection = RegisteredInspectionLocalServiceUtil.fetchRegisteredInspection(vehicleGroup.getRegisteredInspectionId());
							if(registeredInspection != null){
								thongTinDetailLePhi.setSoDangKy(registeredInspection.getRegisteredNumber());
								result.setRegisteredInspection(registeredInspection);
							}
							
						}
					}
					allThongTinDetailLePhi.add(thongTinDetailLePhi);
					
				}
				
				_log.info("---------so ban ghi trong detelLephi--------" + allThongTinDetailLePhi.size());
//				for (ThongTinDetailLePhi abc : allThongTinDetailLePhi) {
//					_log.info("---------so dang ky--------:" + abc.getSoDangKy());
//				}
				thongTinDetailCommon.setTotalPhiPsTruocThue((new Double(phiPsTruocThueCommon)).longValue());
				thongTinDetailCommon.setTotalThue((new Double(thueCommon)).longValue());
				thongTinDetailCommon.setTotalLePhiCapCc((new Double(lePhiCapCcCommon)).longValue());
				thongTinDetailCommon.setTotalTongTien((new Double(tongTienCommon)).longValue());
				thongTinDetailCommon.setAllThongTinDetailLePhi(allThongTinDetailLePhi);
				allThongTinDetailCommon = new ArrayList<ThongTinDetailCommon>();
				allThongTinDetailCommon.add(thongTinDetailCommon);
				result.setAllThongTinDetailCommon(allThongTinDetailCommon);
				
			}
			// Chuan bi list thong tin chung
			String soDangKy = "";
			long soLuongXe = 0;
			double phiKtTruocThue = 0;
			double phiPsTruocThue = 0;
			double congPhi = 0;
			double thue = 0;
			double lePhiCapCc = 0;
			double tongTien = 0;
			boolean isNew = true;
			if(allThongTinDetailLePhi != null && allThongTinDetailLePhi.size() > 0){
				ThongTinDetailLePhi thongTinDetailLePhiNew = null;
				thongTinChungCommon = new ThongTinChungCommon();
				allThongTinChungLePhi = new ArrayList<ThongTinChungLePhi>();
				for (int i = 0; i < allThongTinDetailLePhi.size(); i++) {
					thongTinDetailLePhi = allThongTinDetailLePhi.get(i);
					if(isNew){
						thongTinChungLePhi = new ThongTinChungLePhi();
						soDangKy = thongTinDetailLePhi.getSoDangKy();
						thongTinChungLePhi.setSoDangKy(soDangKy);
						soLuongXe = soLuongXe + 1;
						phiKtTruocThue = phiKtTruocThue +  thongTinDetailLePhi.getPhiKtTruocThue();
						phiPsTruocThue = phiPsTruocThue +  thongTinDetailLePhi.getPhiPsTruocThue();
						//congPhi = congPhi + phiKtTruocThue + phiPsTruocThue;
						congPhi = phiKtTruocThue + phiPsTruocThue; //edit anh SonVH
						thue = thue +  thongTinDetailLePhi.getThue();
						lePhiCapCc = lePhiCapCc +  thongTinDetailLePhi.getLePhiCapCc();
						tongTien = tongTien +  thongTinDetailLePhi.getTongTien();
						
						isNew = false;
					} else{
							soLuongXe = soLuongXe + 1;
							phiKtTruocThue = phiKtTruocThue +  thongTinDetailLePhi.getPhiKtTruocThue();
							phiPsTruocThue = phiPsTruocThue +  thongTinDetailLePhi.getPhiPsTruocThue();
							congPhi = phiKtTruocThue + phiPsTruocThue; //edit SonVH
							thue = thue +  thongTinDetailLePhi.getThue();
							lePhiCapCc = lePhiCapCc +  thongTinDetailLePhi.getLePhiCapCc();
							tongTien = tongTien +  thongTinDetailLePhi.getTongTien();
					}
					if((i+1) == allThongTinDetailLePhi.size()){
						thongTinChungLePhi.setCongPhi((new Double(congPhi)).longValue());
						thongTinChungLePhi.setLePhiCapCc((new Double(lePhiCapCc)).longValue());
						thongTinChungLePhi.setPhiKtTruocThue((new Double(phiKtTruocThue)).longValue());
						thongTinChungLePhi.setPhiPsTruocThue((new Double(phiPsTruocThue)).longValue());
						thongTinChungLePhi.setSoLuongXe(soLuongXe);
						thongTinChungLePhi.setThue((new Double(thue)).longValue());
						thongTinChungLePhi.setTongTien((new Double(tongTien)).longValue());
						allThongTinChungLePhi.add(thongTinChungLePhi);
					} else{
						thongTinDetailLePhiNew = allThongTinDetailLePhi.get(i + 1);
						if(!soDangKy.trim().equalsIgnoreCase(thongTinDetailLePhiNew.getSoDangKy())){
							thongTinChungLePhi.setCongPhi((new Double(congPhi)).longValue());
							thongTinChungLePhi.setLePhiCapCc((new Double(lePhiCapCc)).longValue());
							thongTinChungLePhi.setPhiKtTruocThue((new Double(phiKtTruocThue)).longValue());
							thongTinChungLePhi.setPhiPsTruocThue((new Double(phiPsTruocThue)).longValue());
							thongTinChungLePhi.setSoLuongXe(soLuongXe);
							thongTinChungLePhi.setThue((new Double(thue)).longValue());
							thongTinChungLePhi.setTongTien((new Double(tongTien)).longValue());
							allThongTinChungLePhi.add(thongTinChungLePhi);
							
							isNew = true;
							soLuongXe = 0;
							phiKtTruocThue = 0;
							phiPsTruocThue = 0;
							congPhi = 0;
							thue = 0;
							lePhiCapCc = 0;
							tongTien = 0;
						}
					}
				}
				_log.info("---------so ban ghi trong TTChungLephi--------" + allThongTinChungLePhi.size());
//				for (ThongTinChungLePhi abc : allThongTinChungLePhi) {
//					_log.info("---------so dang ky thong tin chung--------:" + abc.getSoDangKy());
//				}
				
				thongTinChungCommon.setAllThongTinChungLePhi(allThongTinChungLePhi);
				
				if(allThongTinChungLePhi != null && allThongTinChungLePhi.size() > 0){
					long totalSoLuongXe = 0;
					double totalPhiKtTruocThue = 0;
					double totalPhiPsTruocThue = 0;
					double totalCongPhi = 0;
					double totalThue = 0;
					double totalLePhiCapCc = 0;
					double totalTongTien = 0;
					for (ThongTinChungLePhi ttcLePhi : allThongTinChungLePhi) {
						totalSoLuongXe = totalSoLuongXe + ttcLePhi.getSoLuongXe();
						totalPhiKtTruocThue = totalPhiKtTruocThue + ttcLePhi.getPhiKtTruocThue();
						totalPhiPsTruocThue = totalPhiPsTruocThue + ttcLePhi.getPhiPsTruocThue();
						totalCongPhi = totalCongPhi + ttcLePhi.getCongPhi();
						totalThue = totalThue + ttcLePhi.getThue();
						totalLePhiCapCc = totalLePhiCapCc + ttcLePhi.getLePhiCapCc();
						totalTongTien = totalTongTien + ttcLePhi.getTongTien();
					}
					thongTinChungCommon.setTotalSoLuongXe(totalSoLuongXe);
					thongTinChungCommon.setTotalPhiKtTruocThue((new Double(totalPhiKtTruocThue)).longValue());
					thongTinChungCommon.setTotalPhiPsTruocThue((new Double(totalPhiPsTruocThue)).longValue());
					thongTinChungCommon.setTotalCongPhi((new Double(totalCongPhi)).longValue());
					thongTinChungCommon.setTotalThue((new Double(totalThue)).longValue());
					thongTinChungCommon.setTotalLePhiCapCc((new Double(totalLePhiCapCc)).longValue());
					thongTinChungCommon.setTotalTongTien((new Double(totalTongTien)).longValue());
				}
				allThongTinChungCommon = new ArrayList<ThongTinChungCommon>();
				allThongTinChungCommon.add(thongTinChungCommon);
				
				result.setAllThongTinChungCommon(allThongTinChungCommon);
			}

		} catch (SystemException e) {
			_log.error(e);
		}
		return result;
	}
}
