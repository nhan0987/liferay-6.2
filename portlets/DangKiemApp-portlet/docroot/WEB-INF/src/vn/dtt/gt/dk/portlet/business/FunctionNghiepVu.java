package vn.dtt.gt.dk.portlet.business;

import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.PortletSession;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich;
import vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcKeHoachChuyenDichLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyChinhLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyPhuLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec;
import vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote;
import vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordImpl;
import vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordSpecLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteDetailsLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.NewExchangeRateLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialLocalServiceUtil;
import vn.dtt.gt.dk.message.MessageType;
import vn.dtt.gt.dk.nsw.Header;
import vn.dtt.gt.dk.utils.config.DKConfigurationManager;
import vn.dtt.gt.dk.utils.format.Constants;
import vn.dtt.gt.dk.utils.format.ConvertUtil;
import vn.dtt.gt.dk.utils.format.FormatData;

public class FunctionNghiepVu {

	public String getTransactionId() {
		return (new Date()).getTime() + "";
	}

	public  String getRamdomMessage() {
		return (new Date()).getTime() + "";
	}

	public String sinhSoChungChi() {
		return (new Date()).getTime() + "";
	}

	public double getExchangeRate(String originalCurrency, String basicCurrency) {
		double kq = 1.0;
		if(originalCurrency.equals(basicCurrency)){
			 return kq;
		}
		//List<ExchangeRate> exchangeRate = ExchangeRateLocalServiceUtil.findLastByOriginalCurrencyAndBasicCurrency(originalCurrency, basicCurrency, new Date());
		List<NewExchangeRate> exchangeRate = NewExchangeRateLocalServiceUtil.findByOriginalCurrencyBasicCurrency(originalCurrency, basicCurrency);
		if(exchangeRate==null||exchangeRate.size()==0){
			 return 0.0;
		}
		
		kq = exchangeRate.get(0).getExchangeRate();
		return kq;
	}
	public double getCharges(String vehicleType,String issueType, long certificateRecordId) {
		double kq=0.0;
		if(issueType.equals(Constants.CAP_MOI)){
			kq=DKConfigurationManager.getDoubleProp("LP_CM", 50000.00);
		}else if(issueType.equals(Constants.CAP_LAI)){
			kq=DKConfigurationManager.getDoubleProp("LP_CM", 50000.00)*DKConfigurationManager.getDoubleProp("LP_CM_50", 0.5);
		}else if(issueType.equals(Constants.CAP_TAM_THOI)){
			kq=DKConfigurationManager.getDoubleProp("LP_CM", 50000.00)*DKConfigurationManager.getDoubleProp("LP_CM_70", 0.7);
		}
		
		if(vehicleType.startsWith("XCG03")){
			// Tim so nguoi cho phep cho doi voi xe co gio
			long soNguoiChoPhepCho =0;
			CertificateRecordSpec certificateRecordSpec = CertificateRecordSpecLocalServiceUtil.findByCertificateRecordIdAndSpecificationCode(certificateRecordId, "XCG1047");
			if(certificateRecordSpec!=null&&certificateRecordSpec.getSpecificationValue()!=null&&certificateRecordSpec.getSpecificationValue().length()>0){
				soNguoiChoPhepCho =FormatData.convertToLong(certificateRecordSpec.getSpecificationValue());
			}
			if(soNguoiChoPhepCho<10){
				if(issueType.equals(Constants.CAP_MOI)){
					kq=DKConfigurationManager.getDoubleProp("LP_CM_t", 100000.00);
				}else if(issueType.equals(Constants.CAP_LAI)){
					kq=DKConfigurationManager.getDoubleProp("LP_CM_t", 100000.00)*DKConfigurationManager.getDoubleProp("LP_CM_t_50", 0.5);
				}else if(issueType.equals(Constants.CAP_TAM_THOI)){
					kq=DKConfigurationManager.getDoubleProp("LP_CM_t", 100000.00)*DKConfigurationManager.getDoubleProp("LP_CM_t_70", 0.7);
				}	
			}
		}
		return kq;
	}

	public double getInspectionFee(long certificateType, String vehicleClass, double unitPriceVnd) {
		double kq = 0;
		String xeDapDien = "XDD";
		String dongCo = "DCX";
		String xeGanMay = "XMY";
		String xeCoGioi = "XCG";
		String xeChuyenDung = "XCD";
		String xeBonBanh = "XBB";
		if (certificateType == Constants.CERTIFICATE_TYPE_GCN || certificateType == Constants.CERTIFICATE_TYPE_TBKD ||
				 certificateType == Constants.CERTIFICATE_TYPE_TBXNTT || certificateType == Constants.CERTIFICATE_TYPE_TBVP) {

			kq = DKConfigurationManager.getDoubleProp("PKT_CC_XCG", 0.001) * unitPriceVnd;
			if (xeDapDien.equals(vehicleClass)) {
				kq = DKConfigurationManager.getDoubleProp("PKT_CC_XDD", 30000.00);
			} else if (xeGanMay.equals(vehicleClass)) {
				if (kq < DKConfigurationManager.getDoubleProp("PKT_CC_XM_TT", 50000.00)) {
					kq = DKConfigurationManager.getDoubleProp("PKT_CC_XM_TT", 50000.00);
				}
			} else if (dongCo.equals(vehicleClass)) {
				if (kq < DKConfigurationManager.getDoubleProp("PKT_CC_DC_TT", 10000.00)) {
					kq = DKConfigurationManager.getDoubleProp("PKT_CC_DC_TT", 10000.00);
				}
			}else if (xeCoGioi.equals(vehicleClass)||xeChuyenDung.equals(vehicleClass)||xeBonBanh.equals(vehicleClass)) {
				if (kq < DKConfigurationManager.getDoubleProp("PKT_CC_XCG_TT", 300000.00)) {
					kq = DKConfigurationManager.getDoubleProp("PKT_CC_XCG_TT", 300000.00);
				}
			}
		}else{
			kq = DKConfigurationManager.getDoubleProp("PKT_TB_XCG", 0.0005) * unitPriceVnd;
			if (xeDapDien.equals(vehicleClass)) {
				kq = DKConfigurationManager.getDoubleProp("PKT_CC_XDD", 30000.00);
			} else if (xeGanMay.equals(vehicleClass)) {
				if (kq < DKConfigurationManager.getDoubleProp("PKT_TB_XM_TT", 25000.00)) {
					kq = DKConfigurationManager.getDoubleProp("PKT_TB_XM_TT", 25000.00);
				}
			} else if (dongCo.equals(vehicleClass)) {
				if (kq < DKConfigurationManager.getDoubleProp("PKT_TB_DC_TT", 5000.00)) {
					kq = DKConfigurationManager.getDoubleProp("PKT_TB_DC_TT", 5000.00);
				}
			}else if (xeCoGioi.equals(vehicleClass)||xeChuyenDung.equals(vehicleClass)||xeBonBanh.equals(vehicleClass)) {
				if (kq < DKConfigurationManager.getDoubleProp("PKT_TB_XCG_TT", 150000.00)) {
					kq = DKConfigurationManager.getDoubleProp("PKT_TB_XCG_TT", 150000.00);
				}
			}
		}
		
		
		
		return kq;
	}

	public double getOtherCosts(VehicleRecord vehicleRecord) {
		double kq = 0;
		try{
//			_log.info("getOtherCosts");
			InspectionRecord inspectionRecord = InspectionRecordLocalServiceUtil.fetchInspectionRecord(vehicleRecord.getInspectionRecordId());
//			_log.info("getOtherCosts  "+inspectionRecord.getMarkupPaid());
			if(inspectionRecord!=null&&inspectionRecord.getMarkupPaid()==0){
				kq = inspectionRecord.getOtherCosts();
				inspectionRecord.setMarkupPaid(1);
				InspectionRecordLocalServiceUtil.updateInspectionRecord(inspectionRecord);
			}
		}catch (Exception e) {
			_log.error(e);
		}
		return kq;
	}

	public double getTotalCostsAndFee() {
		return 0;
	}

	public double getTax() {
		return 0;
	}

	
	public double getTotalRealDebit() {
		return 0;
	}

	public double getTotalDebit() {
		return 0;
	}
	
	public static boolean checkFromDate(ActionRequest actionRequest, String fromDate) {
		  String FROM_DATE = "FROM_DATE";
		  if (fromDate != null && fromDate.trim().length() > 0) {
		   PortletSession portletSession = actionRequest.getPortletSession();
		   Object oldFromDate = portletSession.getAttribute("FROM_DATE") ;
		   if (oldFromDate != null) {
		    if (fromDate.trim().compareToIgnoreCase(oldFromDate.toString().trim()) == 0) {
		     return true;
		    }
		   }
		   portletSession.setAttribute(FROM_DATE, fromDate.trim());
		  }

		  return false;
		 }
	

	public String roleBack(Header header, String function) throws SystemException {
		String xmlResult = "";
		try{
		//_log.info("header.getReference().getMessageId()  "+header.getReference().getMessageId());
		List<TthcKeHoachChuyenDich> tthcKeHoachChuyenDichs = TthcKeHoachChuyenDichLocalServiceUtil.findByMessageId(header.getReference().getMessageId());
		if(tthcKeHoachChuyenDichs !=null&&tthcKeHoachChuyenDichs.size()>0){
			long tthcKeHoachChuyenDichSize = tthcKeHoachChuyenDichs.size();
			for(int j=0;j<tthcKeHoachChuyenDichSize;j++){
				TthcKeHoachChuyenDich keHoachChuyenDich= tthcKeHoachChuyenDichs.get(j);
				if(keHoachChuyenDich.getDebitnoteNumber()!=null && keHoachChuyenDich.getDebitnoteNumber().length()>0){				
					keHoachChuyenDichDebinote(keHoachChuyenDich);
					
				}else	if(keHoachChuyenDich.getPhieuXuLyPhuId()>0){
					keHoachChuyenDichPhieuXuLyPhu(keHoachChuyenDich);
					
				}else{
					keHoachChuyenDichPhieuXuLyChinh(keHoachChuyenDich);
	
				}
				
				TthcKeHoachChuyenDichLocalServiceUtil.deleteTthcKeHoachChuyenDich(keHoachChuyenDich.getId());
			}
		}
		
		}catch (Exception e) {
			_log.error(e);
		}
		return xmlResult;
	}

	private void keHoachChuyenDichPhieuXuLyPhu(
			TthcKeHoachChuyenDich keHoachChuyenDich) throws SystemException {
		MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.fetchMotCuaPhieuXuLyPhu(keHoachChuyenDich.getPhieuXuLyPhuId());
		String ghiChu =motCuaPhieuXuLyPhu.getGhiChu() ;
		String replace ="<br>" +DKConfigurationManager.getStrProp("dangxuly", "Dang cho xu ly....") ;
		ghiChu = ghiChu.replace(replace,
				"");
		motCuaPhieuXuLyPhu.setGhiChu(ghiChu);
		motCuaPhieuXuLyPhu.setNhomPhieuXuLy(keHoachChuyenDich.getNhomPhieuXuLy());
		motCuaPhieuXuLyPhu.setTrangThaiHienTaiId(keHoachChuyenDich.getTrangThaiNguonId());
		motCuaPhieuXuLyPhu.setPhanNhomHoSoId(keHoachChuyenDich.getPhanNhomHoSoId());
		MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(motCuaPhieuXuLyPhu);
		if(keHoachChuyenDich.getMessageType().equals(String.valueOf(MessageType.XAC_NHAN_HOAN_KIEM_TRA))){
			ConfirmedInspection confirmedInspection= ConfirmedInspectionLocalServiceUtil.findByPhieuXuLyPhuId(motCuaPhieuXuLyPhu.getId());
			if(confirmedInspection!=null&&keHoachChuyenDich.getGhiChu()!=null&&keHoachChuyenDich.getGhiChu().length()>0){
				String listVehicleRecordId = keHoachChuyenDich.getGhiChu();
				if(listVehicleRecordId!=null&&listVehicleRecordId.length()>0){
					String[] list = listVehicleRecordId.trim().split(",");
					for (String item : list) {
						if (item != null && item.trim().length() > 0) {
							VehicleRecord vehicleRecord = VehicleRecordLocalServiceUtil.fetchVehicleRecord(ConvertUtil.convertToLong(item));
							if(vehicleRecord!=null){
								vehicleRecord.setConfirmedInspectionId(confirmedInspection.getId());
								vehicleRecord.setSynchDate(new Date());
								VehicleRecordLocalServiceUtil.updateVehicleRecord(vehicleRecord);
							}
						}
					}
				}
			}
		}else if(keHoachChuyenDich.getMessageType().equals(String.valueOf(MessageType.XAC_NHAN_LOAI_BO_PHUONG_TIEN))){
			String listVehicleRecordId = keHoachChuyenDich.getGhiChu();
			if(listVehicleRecordId!=null&&listVehicleRecordId.length()>0){
				String[] list = listVehicleRecordId.trim().split(",");
				for (String item : list) {
					if (item != null && item.trim().length() > 0) {
						VehiclerecordInitial vehicleRecordInitial = VehiclerecordInitialLocalServiceUtil.fetchVehiclerecordInitial(ConvertUtil.convertToLong(item));
						if(vehicleRecordInitial!=null){
							
							VehicleRecord vehicleRecord = new VehicleRecordImpl();
							vehicleRecord.setId(vehicleRecordInitial.getId());
							vehicleRecord.setSequenceNo(vehicleRecordInitial
									.getSequenceNo() );							
							vehicleRecord.setCodeNumber(vehicleRecordInitial
									.getCodeNumber());							
							vehicleRecord.setChassisNumber(vehicleRecordInitial
									.getChassisNumber());							
							vehicleRecord.setEngineNumber(vehicleRecordInitial
									.getEngineNumber());						
							vehicleRecord.setProductionYear(vehicleRecordInitial
									.getProductionYear());
							vehicleRecord.setVehicleEngineStatus(vehicleRecordInitial
									.getVehicleEngineStatus() + "");							
							vehicleRecord.setUnitPrice(vehicleRecordInitial.getUnitPrice());							
							vehicleRecord.setCurrency(vehicleRecordInitial
									.getCurrency());							
							vehicleRecord.setVehicleGroupId(vehicleRecordInitial.getVehicleGroupId());							
							vehicleRecord.setVehicleColor(vehicleRecordInitial
									.getVehicleColor());							
							VehicleRecordLocalServiceUtil.addVehicleRecord(vehicleRecord);
							
						}
					}
				}
			}
		}
//		else if(keHoachChuyenDich.getMessageType().equals(String.valueOf(MessageType.XN_HUY_GCN))){
//			CertificateRecord certificateRecord = CertificateRecordLocalServiceUtil.fetchCertificateRecord(ConvertUtil.convertToLong(keHoachChuyenDich.getGhiChu()));
//			if(certificateRecord!=null){
//				certificateRecord
//			}
//		}
	}


	private void keHoachChuyenDichDebinote(
			TthcKeHoachChuyenDich keHoachChuyenDich) throws SystemException,
			PortalException {
		DebitNote debitNote = DebitNoteLocalServiceUtil.findByDebitNoteNumber(keHoachChuyenDich.getDebitnoteNumber());
		if(debitNote!=null&&keHoachChuyenDich.getMessageType().equals(String.valueOf(MessageType.XN_HOAN_THANH_NGHIA_VU_NOP_PHI_LE_PHI))){
			debitNote.setMarkAsDeleted(0);
			DebitNoteLocalServiceUtil.updateDebitNote(debitNote);
		}else if(debitNote!=null&&keHoachChuyenDich.getMessageType().equals(String.valueOf(MessageType.TB_NOP_PHI_LE_PHI_DANG_KIEM))){
			List<DebitNoteDetails> debitNoteDetails=  DebitNoteDetailsLocalServiceUtil.findByDebitNoteId(debitNote.getId());
			if(debitNoteDetails!=null&&debitNoteDetails.size()>0){
				long size = debitNoteDetails.size();
				for (int i = 0; i < size; i++) {
					DebitNoteDetailsLocalServiceUtil.deleteDebitNoteDetails(debitNoteDetails.get(i).getId());
				}						
			}
			DebitNoteLocalServiceUtil.deleteDebitNote(debitNote.getId());
		}else if(debitNote!=null&&keHoachChuyenDich.getMessageType().equals(String.valueOf(MessageType.TB_NOP_PHI_LE_PHI_DC_XDD))){
			List<DebitNoteDetails> debitNoteDetails=  DebitNoteDetailsLocalServiceUtil.findByDebitNoteId(debitNote.getId());
			if(debitNoteDetails!=null&&debitNoteDetails.size()>0){
				long size = debitNoteDetails.size();
				for (int i = 0; i < size; i++) {
					DebitNoteDetailsLocalServiceUtil.deleteDebitNoteDetails(debitNoteDetails.get(i).getId());
				}						
			}
			DebitNoteLocalServiceUtil.deleteDebitNote(debitNote.getId());
		}else if(debitNote!=null&&keHoachChuyenDich.getMessageType().equals(String.valueOf(MessageType.XN_SUA_DOI_GCN))){
			if(keHoachChuyenDich.getGhiChu()!=null&&keHoachChuyenDich.getGhiChu().length()>0){
				CertificateRecord certificateRecord=  CertificateRecordLocalServiceUtil.fetchCertificateRecord(ConvertUtil.convertToLong(keHoachChuyenDich.getGhiChu()));
				if(certificateRecord!=null){
					certificateRecord.setDigitalIssued(Constants.CERTIFICATE_DIGITAL_ISSSUED_0);
					CertificateRecordLocalServiceUtil.updateCertificateRecord(certificateRecord);
				}
			}
		}else if(debitNote!=null){
			debitNote.setMarkAsDeleted(Constants.THANH_TOAN);
			DebitNoteLocalServiceUtil.updateDebitNote(debitNote);
			if(keHoachChuyenDich.getGhiChu()!=null&&keHoachChuyenDich.getGhiChu().length()>0){
				CertificateRecord certificateRecord=  CertificateRecordLocalServiceUtil.fetchCertificateRecord(ConvertUtil.convertToLong(keHoachChuyenDich.getGhiChu()));
				if(certificateRecord!=null){
					certificateRecord.setDigitalIssued(Constants.CERTIFICATE_DIGITAL_ISSSUED_0);
					CertificateRecordLocalServiceUtil.updateCertificateRecord(certificateRecord);
				}
			}
		}
	}

	private void keHoachChuyenDichPhieuXuLyChinh(
			TthcKeHoachChuyenDich keHoachChuyenDich) throws SystemException {
		MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh = MotCuaPhieuXuLyChinhLocalServiceUtil.fetchMotCuaPhieuXuLyChinh(keHoachChuyenDich.getPhieuXuLyChinhId());
		
		motCuaPhieuXuLyChinh.setTrangThaiHienTaiId(keHoachChuyenDich.getTrangThaiNguonId());
		
		MotCuaPhieuXuLyChinhLocalServiceUtil.updateMotCuaPhieuXuLyChinh(motCuaPhieuXuLyChinh);
		
		
		
		TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(keHoachChuyenDich.getPhieuXuLyChinhId());
		String ghiChu =tthcHoSoThuTuc.getGhiChu() ;
		String replace ="<br>" +DKConfigurationManager.getStrProp("dangxuly", "Dang cho xu ly....") ;
		ghiChu = ghiChu.replace(replace,
				"");
		tthcHoSoThuTuc.setPhanNhomHoSoId(keHoachChuyenDich.getPhanNhomHoSoId());
		tthcHoSoThuTuc.setSynchDate(new Date());
		TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(tthcHoSoThuTuc);
	}

	
	private static Log _log = LogFactoryUtil.getLog(FunctionNghiepVu.class);

}
