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

public class ThongBaoPhiLePhi2 {
	private static Log _log = LogFactoryUtil.getLog(ThongBaoPhiLePhi2.class);
	private DebitNote debitNote;
	private RegisteredInspection registeredInspection;
	private List<ThongTinDetailLePhi2> allThongTinLePhiDetail2;
	
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
	
	public List<ThongTinDetailLePhi2> getAllThongTinLePhiDetail2() {
		return allThongTinLePhiDetail2;
	}
	public void setAllThongTinLePhiDetail2(List<ThongTinDetailLePhi2> allThongTinLePhiDetail2) {
		this.allThongTinLePhiDetail2 = allThongTinLePhiDetail2;
	}
	
	public static ThongBaoPhiLePhi2 getModelByDebitNoteId(long debitNoteId) {
//		_log.info("---------vao getModelByDebitNoteId--------");
		ThongBaoPhiLePhi2 result = new ThongBaoPhiLePhi2();
		try {
			DebitNote debitNote;
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
				
				allThongTinDetailLePhi = new ArrayList<ThongTinDetailLePhi>();
				for (DebitNoteDetails debitNoteDetail : listbitNoteDetails) {
					_log.info("---------debitNoteDetail--------:" + debitNoteDetail.getVehicleRecordId());
					thongTinDetailLePhi = new ThongTinDetailLePhi();
					if(listVehicleRecords != null && listVehicleRecords.size() > 0){
						for (int i = 0; i < listVehicleRecords.size(); i++) {
							vehicleRecord = listVehicleRecords.get(i);
							if(vehicleRecord.getId() == debitNoteDetail.getVehicleRecordId()){
								break;
							}
							
						}
					}
					// set thong tin phi					//(new Double()).longValue()
					thongTinDetailLePhi.setPhiKtTruocThue((new Double(debitNoteDetail.getInspectionFee())).longValue());
					thongTinDetailLePhi.setPhiPsTruocThue((new Double(debitNoteDetail.getOtherCosts())).longValue());
					thongTinDetailLePhi.setThue((new Double(debitNoteDetail.getTax())).longValue());
					thongTinDetailLePhi.setLePhiCapCc((new Double(debitNoteDetail.getCharges())).longValue());
					thongTinDetailLePhi.setTongTien((new Double(debitNoteDetail.getTotalDebit())).longValue());
					
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
				for (ThongTinDetailLePhi abc : allThongTinDetailLePhi) {
					_log.info("---------so dang ky--------:" + abc.getSoDangKy());
				}
			}
			// Chuan bi list thong tin chung
			String soDangKy = "";
			String nhanHieuSoLoai = "";
			long soLuongXe = 0;
			double phiKtTruocThue = 0;
			double phiPsTruocThue = 0;
			double thue = 0;
			double lePhiCapCc = 0;
			double tongTien = 0;
			boolean isNew = true;
			if(allThongTinDetailLePhi != null && allThongTinDetailLePhi.size() > 0){
				ThongTinDetailLePhi thongTinDetailLePhiNew = null;
				List<ThongTinDetailLePhi2> allThongTinDetailLePhi2 = new ArrayList<ThongTinDetailLePhi2>();
				ThongTinDetailLePhi2 thongTinDetailLePhi2 = null;
				for (int i = 0; i < allThongTinDetailLePhi.size(); i++) {
					thongTinDetailLePhi = allThongTinDetailLePhi.get(i);
					_log.info("---------thongTinDetailLePhi--------:"+i+": " + thongTinDetailLePhi.getSoKhung());
					if(isNew){
						thongTinDetailLePhi2 = new ThongTinDetailLePhi2();
						soDangKy = thongTinDetailLePhi.getSoDangKy();
						nhanHieuSoLoai = thongTinDetailLePhi.getNhanHieuSoLoai();
						thongTinDetailLePhi2.setSoDangKy(soDangKy);
						thongTinDetailLePhi2.setNhanHieuSoLoai(nhanHieuSoLoai);
						soLuongXe = soLuongXe + 1;
						phiKtTruocThue = phiKtTruocThue +  thongTinDetailLePhi.getPhiKtTruocThue();
						phiPsTruocThue = phiPsTruocThue +  thongTinDetailLePhi.getPhiPsTruocThue();
						thue = thue +  thongTinDetailLePhi.getThue();
						lePhiCapCc = lePhiCapCc +  thongTinDetailLePhi.getLePhiCapCc();
						tongTien = tongTien +  thongTinDetailLePhi.getTongTien();
						isNew = false;
					} else{
							soLuongXe = soLuongXe + 1;
							phiKtTruocThue = phiKtTruocThue +  thongTinDetailLePhi.getPhiKtTruocThue();
							phiPsTruocThue = phiPsTruocThue +  thongTinDetailLePhi.getPhiPsTruocThue();
							thue = thue +  thongTinDetailLePhi.getThue();
							lePhiCapCc = lePhiCapCc +  thongTinDetailLePhi.getLePhiCapCc();
							tongTien = tongTien +  thongTinDetailLePhi.getTongTien();
					}		
					if((i+1) == allThongTinDetailLePhi.size()){
						thongTinDetailLePhi2.setLePhiCapCc((new Double(lePhiCapCc)).longValue());
						thongTinDetailLePhi2.setPhiKtTruocThue((new Double(phiKtTruocThue)).longValue());
						thongTinDetailLePhi2.setPhiPsTruocThue((new Double(phiPsTruocThue)).longValue());
						thongTinDetailLePhi2.setSoLuong(soLuongXe);
						thongTinDetailLePhi2.setThue((new Double(thue)).longValue());
						thongTinDetailLePhi2.setTongTien((new Double(tongTien)).longValue());
						allThongTinDetailLePhi2.add(thongTinDetailLePhi2);
					} else{
						thongTinDetailLePhiNew = allThongTinDetailLePhi.get(i + 1);
						if((!soDangKy.trim().equalsIgnoreCase(thongTinDetailLePhiNew.getSoDangKy())) || (!nhanHieuSoLoai.trim().equalsIgnoreCase(thongTinDetailLePhiNew.getNhanHieuSoLoai()))){
							thongTinDetailLePhi2.setLePhiCapCc((new Double(lePhiCapCc)).longValue());
							thongTinDetailLePhi2.setPhiKtTruocThue((new Double(phiKtTruocThue)).longValue());
							thongTinDetailLePhi2.setPhiPsTruocThue((new Double(phiPsTruocThue)).longValue());
							thongTinDetailLePhi2.setSoLuong(soLuongXe);
							thongTinDetailLePhi2.setThue((new Double(thue)).longValue());
							thongTinDetailLePhi2.setTongTien((new Double(tongTien)).longValue());
							allThongTinDetailLePhi2.add(thongTinDetailLePhi2);
							
							isNew = true;
							soLuongXe = 0;
							phiKtTruocThue = 0;
							phiPsTruocThue = 0;
							thue = 0;
							lePhiCapCc = 0;
							tongTien = 0;
						}
					}
					
				}
				_log.info("---------so ban ghi trong TTChungLephi--------" + allThongTinDetailLePhi2.size());
				for (ThongTinDetailLePhi2 abc : allThongTinDetailLePhi2) {
					_log.info("sodangKy:" + abc.getSoDangKy() + "| nhanhieusoloai: " + abc.getNhanHieuSoLoai());
				}
				result.setAllThongTinLePhiDetail2(allThongTinDetailLePhi2);
			}

		} catch (SystemException e) {
			_log.error(e);
		}
		return result;
	}
}
