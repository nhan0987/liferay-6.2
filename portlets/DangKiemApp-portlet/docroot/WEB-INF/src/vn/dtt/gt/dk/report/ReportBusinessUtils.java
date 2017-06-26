
package vn.dtt.gt.dk.report;

import java.util.HashMap;
import java.util.List;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo;
import vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo;
import vn.dtt.gt.dk.dao.common.service.TthcBieuMauHoSoLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalServiceUtil;
import vn.dtt.gt.dk.nsw.message.xml.MessageFactory;
import vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity;
import vn.dtt.gt.dk.nsw.model.ConfirmationOfAssignment;
import vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity;
import vn.dtt.gt.dk.nsw.model.CurrentStatusOfImportedVehicleList;
import vn.dtt.gt.dk.nsw.model.Customers;
import vn.dtt.gt.dk.nsw.model.DebitNote;
import vn.dtt.gt.dk.nsw.model.ImportedVehicleList;
import vn.dtt.gt.dk.nsw.model.InspectorSign;
import vn.dtt.gt.dk.nsw.model.Invoices;
import vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection;
import vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity;
import vn.dtt.gt.dk.nsw.model.NoticeOfViolation;
import vn.dtt.gt.dk.nsw.model.RequestForChangingDateSite;
import vn.dtt.gt.dk.nsw.model.RequestForControl;
import vn.dtt.gt.dk.nsw.model.RequestForQualityInspection;
import vn.dtt.gt.dk.nsw.model.RequestOfEmissionTesting;
import vn.dtt.gt.dk.nsw.model.RequestOfSafeTesting;
import vn.dtt.gt.dk.nsw.model.ScheduleReport;
import vn.dtt.gt.dk.nsw.model.SelectedVehicleListForPayment;
import vn.dtt.gt.dk.nsw.model.TechnicalSpecification;
import vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord;
import vn.dtt.gt.dk.report.model.GcnChatLuongDongCoMotoXeMay;
import vn.dtt.gt.dk.report.model.ThongBaoPhiLePhi;
import vn.dtt.gt.dk.report.model.ThongBaoPhiLePhi2;
import vn.dtt.gt.dk.report.model.ThongTinChungLePhi;
import vn.dtt.gt.dk.report.model.ThongTinDetailLePhi2;
import vn.dtt.gt.dk.report.model.bienbanghinhanketquakiemtra.BienBanGhiNhanKetQuaKiemTraExport;
import vn.dtt.gt.dk.report.model.bienbanghinhanketquakiemtra.BienBanGhiNhanKetQuaKiemTraList;
import vn.dtt.gt.dk.report.model.lichdenghikiemtra.LichDeNghiKiemTra;
import vn.dtt.gt.dk.report.model.lichdenghikiemtra.LichDeNghiKiemTraExport;
import vn.dtt.gt.dk.report.model.phieuphancongdkvkiemtra.PhieuPhanCongDKVKiemTra;
import vn.dtt.gt.dk.report.model.phieuphancongdkvkiemtra.PhieuPhanCongDKVKiemTraExport;
import vn.dtt.gt.dk.report.model.thongbaotrungsokhungsodongco.ThongBaoTrungSoKhungSoDongCo;
import vn.dtt.gt.dk.report.model.thongbaotrungsokhungsodongco.ThongBaoTrungSoKhungSoDongCoExport;
import vn.dtt.gt.dk.utils.config.DKConfigurationManager;
import vn.dtt.gt.dk.utils.format.FormatData;
import vnpt.CallWebserviceClient;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringUtil;

public class ReportBusinessUtils {
	
	public ReportBusinessUtils() {
		
	}
	
	private static Log _log = LogFactoryUtil.getLog(ReportBusinessUtils.class);
	public static final String FILE_NAME_NULL = "file_name_null";
	private static HashMap<String, Object> parameters =  null;
	public static Customers exportCustomers = new Customers();
	public static Invoices exportInvoices = new Invoices();
//	public static String corporationName = null;
	//public static String FinancialAccountant = null;

	public static String builtFilePDF(String realPath, CertificateOfQuanlityConformity certificateOfQuanlityConformity,String maBieuMau,Long noiDungHoSoId ){
		String tenFile_Export = maBieuMau + "_" + noiDungHoSoId + ".pdf";
		String resultfileName = FILE_NAME_NULL;
		try{
			//TODO 211 CertificateOfQuanlityConformity
			
			_log.info("-CertificateOfQuanlityConformity--");
			JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( certificateOfQuanlityConformity);
			parameters =  new HashMap<String, Object>();
			return  ReportUtils.exportFunction(realPath, ReportUtils.CHUNGCHI_GCN, maBieuMau + ".jrxml",
					tenFile_Export, dataSource, parameters);
			
			
		}catch (Exception e) {
			_log.error(e);
		}
		return resultfileName;
		
	}
	
	public static String actionExport(String realPath, long noiDungHoSoId) throws Exception {
		TthcNoidungHoSo noidungHoSo = null;
		
		if(noiDungHoSoId > 0) {
			noidungHoSo = TthcNoidungHoSoLocalServiceUtil.getTthcNoidungHoSo(noiDungHoSoId);
		}
		
		return actionExport(realPath, noidungHoSo);
	}
	
	public static String actionExport(String realPath, TthcNoidungHoSo noidungHoSo)
		throws Exception {
		
		String resultfileName = FILE_NAME_NULL;
		
		_log.info("--------------vao actionExport----------------");
		if (noidungHoSo != null) {
			long noiDungHoSoId = noidungHoSo.getId();
			
			TthcBieuMauHoSo tthcBieuMauHoSo = TthcBieuMauHoSoLocalServiceUtil.getTthcBieuMauHoSo(noidungHoSo.getBieuMauHoSoId());
				
			String tenFile_Export = tthcBieuMauHoSo.getMaBieuMau() + "_" + noiDungHoSoId + ".pdf";
			_log.info("tenFile_Export::::::::::::::" + tenFile_Export);
			//long taiLieuDinhKem = tthcNoidungHoSo.getTaiLieuDinhKem();
			
			String noidungXml = noidungHoSo.getNoiDungXml();
			_log.info("--------------begin converXMLMessagesContentToObject----------------");
			List<Object> lstObject = MessageFactory.converXMLMessagesContentToObject(noidungXml);
//				_log.info("noidungXml::::::::::::::::"+  noidungXml);
			_log.info("--------------end converXMLMessagesContentToObject----------------");
			
			_log.info((lstObject != null) ? ("lstObject==size==" + lstObject.size()) : "lstObject==null===");
			_log.info("--------------vao actionExport----------------" + lstObject.size());
			
			for (Object object : lstObject) {
				_log.info("--------------vao for ReportBusiness----------------");
				
				if (object instanceof RequestForQualityInspection) {
					//100 RequestForQualityInspection
					JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(RequestForQualityInspection.class.cast(object));
					parameters =  new HashMap<String, Object>();
					return ReportUtils.exportFunction(realPath, ReportUtils.BAN_DK_KIEM_TRA, tthcBieuMauHoSo.getMaBieuMau() + ".jrxml", 
							tenFile_Export, dataSource, parameters);
					
				} else if (object instanceof TechnicalSpecification) {
					//TODO 101 TechnicalSpecification
					JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(TechnicalSpecification.class.cast(object));
					parameters =  new HashMap<String, Object>();
					
//						if(tthcBieuMauHoSo.getMaBieuMau().trim().equalsIgnoreCase("TT442012BM02") || 
//							tthcBieuMauHoSo.getMaBieuMau().trim().equalsIgnoreCase("TT412013BM02") || 
//							tthcBieuMauHoSo.getMaBieuMau().trim().equalsIgnoreCase("TT862014BM02") || 
//							tthcBieuMauHoSo.getMaBieuMau().trim().equalsIgnoreCase("TT552014BM02") || 
//							tthcBieuMauHoSo.getMaBieuMau().trim().equalsIgnoreCase("TT412011BM02"))
//						{
//							return  ReportUtils.exportFunction(realPath, ReportUtils.BAN_KE_CHI_TIET, tthcBieuMauHoSo.getMaBieuMau() + ".jrxml", 
//								tenFile_Export, dataSource, parameters);
//						} else {
						return ReportUtils.exportFunction(realPath, ReportUtils.BAN_THONG_TIN_NK, tthcBieuMauHoSo.getMaBieuMau() + ".jrxml", 
								tenFile_Export, dataSource, parameters);
//						}
					
				} else if (object instanceof ImportedVehicleList) {
					//102 ImportedVehicleList
					JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(ImportedVehicleList.class.cast(object));
					parameters =  new HashMap<String, Object>();
					return  ReportUtils.exportFunction(realPath, ReportUtils.BAN_KE_CHI_TIET, tthcBieuMauHoSo.getMaBieuMau() + ".jrxml",
							tenFile_Export, dataSource, parameters);
					
				} else if (object instanceof RequestForChangingDateSite) {
					//TODO 108 RequestForChangingDateSite
					JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( RequestForChangingDateSite.class.cast(object));
					parameters =  new HashMap<String, Object>();
					return  ReportUtils.exportFunction(realPath, ReportUtils.BAN_DK_THAYDOI_TGDD, tthcBieuMauHoSo.getMaBieuMau() + ".jrxml",
							tenFile_Export, dataSource, parameters);
					
				} else if (object instanceof InspectorSign) {
					//200 InspectorSign
					
				} else if (object instanceof ScheduleReport) {
					//201 ScheduleReport
					
				} else if (object instanceof RequestOfEmissionTesting) {
					//202 RequestOfEmissionTesting
					JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( RequestOfEmissionTesting.class.cast(object));
					parameters =  new HashMap<String, Object>();
					return  ReportUtils.exportFunction(realPath, ReportUtils.MAU_THEM_MOI, tthcBieuMauHoSo.getMaBieuMau() + ".jrxml",
							tenFile_Export, dataSource, parameters);
					
				} else if (object instanceof RequestOfSafeTesting) {
					//203 RequestOfSafeTesting
					JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( RequestOfSafeTesting.class.cast(object));
					parameters =  new HashMap<String, Object>();
					return  ReportUtils.exportFunction(realPath, ReportUtils.MAU_THEM_MOI, tthcBieuMauHoSo.getMaBieuMau() + ".jrxml",
							tenFile_Export, dataSource, parameters);
					
				} else if (object instanceof RequestForControl) {
					//204 RequestForControl
					JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( RequestForControl.class.cast(object));
					parameters =  new HashMap<String, Object>();
					return  ReportUtils.exportFunction(realPath, ReportUtils.MAU_THEM_MOI, tthcBieuMauHoSo.getMaBieuMau() + ".jrxml",
							tenFile_Export, dataSource, parameters);
					
				} else if (object instanceof CurrentStatusOfImportedVehicleList) {
					//205 CurrentStatusOfImportedVehicleList
					
				} else if (object instanceof ConfirmationOfAssignment) {
					//206 ConfirmationOfAssignment
					
				} else if (object instanceof SelectedVehicleListForPayment) {
					//207 SelectedVehicleListForPayment
					
					//TODO 208 PaymentConfirmation
					//TODO}else if (object instanceof PaymentConfirmation) {
					
					//209 DebitNote
				} else if (object instanceof DebitNote) {
					_log.debug("-----------DebitNote-----------");
					JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( DebitNote.class.cast(object));
					parameters =  new HashMap<String, Object>();
					return  ReportUtils.exportFunction(realPath, ReportUtils.THANH_TOAN, tthcBieuMauHoSo.getMaBieuMau() + ".jrxml",
							tenFile_Export, dataSource, parameters);
					//TODO 210 PaymentConfirmation
					
					//TODO					/215 NoticeCertificateEndorsement
					//TODO					217 CertificateOfQuanlityConformity
					//TODO					218 ConfirmCertificateCancellation
					//TODO					219 InquiryOfCertificateContent
					//TODO					220 InquiryImportedVehicleReference
					
				}else if (object instanceof NoticeOfExemptionFromInspection) {
					//TODO 212 NoticeOfExemptionFromInspection
					
					_log.info("-NoticeOfExemptionFromInspection--");
					JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( NoticeOfExemptionFromInspection.class.cast(object));
					parameters =  new HashMap<String, Object>();
					return  ReportUtils.exportFunction(realPath, ReportUtils.CHUNGCHI_TBM, tthcBieuMauHoSo.getMaBieuMau() + ".jrxml",
							tenFile_Export, dataSource, parameters);
					
				} else if (object instanceof CertificateOfQuanlityConformity) {
					//TODO 211 CertificateOfQuanlityConformity
					
					_log.info("-CertificateOfQuanlityConformity--");
					JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( CertificateOfQuanlityConformity.class.cast(object));
					parameters =  new HashMap<String, Object>();
					return  ReportUtils.exportFunction(realPath, ReportUtils.CHUNGCHI_GCN, tthcBieuMauHoSo.getMaBieuMau() + ".jrxml",
							tenFile_Export, dataSource, parameters);
					
				} else if (object instanceof NoticeOfNonConformity){
					 //TODO 213 NoticeOfNonConformity
					_log.info("-NoticeOfNonConformity--");
					JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( NoticeOfNonConformity.class.cast(object));
					parameters =  new HashMap<String, Object>();
					return  ReportUtils.exportFunction(realPath, ReportUtils.CHUNGCHI_TBKD, tthcBieuMauHoSo.getMaBieuMau() + ".jrxml",
							tenFile_Export, dataSource, parameters);
					
				} else if (object instanceof NoticeOfViolation){
					 //TODO 214 NoticeOfViolation
					_log.info("-NoticeOfViolation--");
					JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( NoticeOfViolation.class.cast(object));
					parameters =  new HashMap<String, Object>();
					return  ReportUtils.exportFunction(realPath, ReportUtils.CHUNGCHI_TBVP, tthcBieuMauHoSo.getMaBieuMau() + ".jrxml",
							tenFile_Export, dataSource, parameters);
					
				} else if (object instanceof ConfirmationStatusOfQuanlityConformity) {
					 //TODO 216 ConfirmationStatusOfQuanlityConformity
					_log.info("-ConfirmationStatusOfQuanlityConformity--");
					JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( ConfirmationStatusOfQuanlityConformity.class.cast(object));
					parameters =  new HashMap<String, Object>();
					return  ReportUtils.exportFunction(realPath, ReportUtils.CHUNGCHI_GCN, tthcBieuMauHoSo.getMaBieuMau() + ".jrxml",
							tenFile_Export, dataSource, parameters);
					
				} else if (object instanceof VehicleInspectionRecord){
					 //TODO 221 VehicleInspectionRecord
					
					_log.info("-VehicleInspectionRecord--");
					JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( VehicleInspectionRecord.class.cast(object));
					parameters =  new HashMap<String, Object>();
					return  ReportUtils.exportFunction(realPath, ReportUtils.BIEN_BAN_KIEM_TRA, tthcBieuMauHoSo.getMaBieuMau() + ".jrxml",
							tenFile_Export, dataSource, parameters);
				}
				
				_log.info("--------------tenFile_Export trong ReportBusiness----------------" + tenFile_Export);
				return tenFile_Export;
			}
		}	
		
		return resultfileName;
	}
	
	public static String actionExportThongTinBienBanKiemTraBanThaoChungChi(String realPath, long hoSoThuTucId, long inspectionRecordId)
		throws Exception {
		_log.info("inspectionRecordId==" + inspectionRecordId);
		
		GcnChatLuongDongCoMotoXeMay objectReport = GcnChatLuongDongCoMotoXeMay.getModelByInspectionRecordId(hoSoThuTucId, inspectionRecordId);
		JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
		parameters = new HashMap<String, Object>();
		ReportUtils.exportFunction(realPath, ReportUtils.CHUNGCHI_GCN, "TT442012BM09.jrxml", "TT442012BM09.pdf", dataSource, parameters);
		return StringUtil.valueOf("TT442012BM09");
	}
	
	public static String actionExportThongBaoLePhi(String realPath, long debitNoteId, String corporationName){
		String fileUrl = "";		
		_log.info("debitNoteId==" + debitNoteId);
		try {
			String tenFile_Export="TBP2015BM01_"+ debitNoteId + ".pdf";
			_log.info("Phi");
			ThongBaoPhiLePhi objectReport = ThongBaoPhiLePhi.getModelByDebitNoteId(debitNoteId);
			_log.info("Truoc");
			exportCustomersAndInvoicesToVNPT_Mode1(objectReport,corporationName);
			_log.info("Sau");
			JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
			parameters = new HashMap<String, Object>();
			fileUrl = ReportUtils.exportFunction(realPath, ReportUtils.THANH_TOAN, "TBP2015BM01.jrxml", tenFile_Export, dataSource, parameters);
		} catch (Exception e) {
			_log.error(e);
		} 
		return fileUrl;
	}
	
	public static String actionExportThongBaoLePhiMau2(String realPath, long debitNoteId,String corporationName ){
		_log.info("debitNoteId==" + debitNoteId);		
		String fileName = "";
		try {
			String tenFile_Export="TBP2015BM02_"+ debitNoteId + ".pdf";
			_log.info("Phi");
			ThongBaoPhiLePhi2 objectReport = ThongBaoPhiLePhi2.getModelByDebitNoteId(debitNoteId);
			_log.info("Truoc");
			exportCustomersAndInvoicesToVNPT_Mode2(objectReport,corporationName);
			_log.info("Sau");
			JRBeanCollectionDataSource dataSource;
			dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
			parameters = new HashMap<String, Object>();
			fileName = ReportUtils.exportFunction(realPath, ReportUtils.THANH_TOAN, "TBP2015BM02.jrxml", tenFile_Export, dataSource, parameters);
		} catch (Exception e) {
			_log.error(e);
		} 
		return fileName;
	}
	
	public static void exportCustomersAndInvoicesToVNPT_Mode1(ThongBaoPhiLePhi objectThongBaoPhiLePhi,String corporationName  ) {
		// 1. Tao du lieu khach hang --- for updateCus
		// 2. Tao du lieu hoa don --- for importAndPublishInv
		try {
			exportCustomers = null;
			exportInvoices = null;
			
			List<ThongTinChungLePhi> allThongTinChungLePhi = objectThongBaoPhiLePhi.getAllThongTinChungCommon().get(0).getAllThongTinChungLePhi();
			ThongTinChungLePhi thongTinChungLePhi = null;
			if ((objectThongBaoPhiLePhi != null) && (objectThongBaoPhiLePhi.getAllThongTinChungCommon().get(0) != null) 
					&&  (allThongTinChungLePhi != null) && (allThongTinChungLePhi.size()>0 ) )
			{	
			// Export here
			// Tao du lieu khach hang --- for updateCus
			  Customers customers = new Customers();
			  Customers.Customer customer = new Customers.Customer();
			  customer.setName(objectThongBaoPhiLePhi.getRegisteredInspection().getImporterName().toString());
			  customer.setCode(objectThongBaoPhiLePhi.getRegisteredInspection().getImporterCode().toString());
			  customer.setTaxCode(objectThongBaoPhiLePhi.getRegisteredInspection().getImporterCode().toString());
			  customer.setAddress(objectThongBaoPhiLePhi.getRegisteredInspection().getImporterAddress().toString());
			  customer.setBankAccountName("");
			  customer.setBankName("");
			  customer.setBankNumber("");
			  //anhnt sua 25/02/2016
			  customer.setEmail(objectThongBaoPhiLePhi.getRegisteredInspection().getContactEmail());   //("huongkma@gmail.com");//  objectThongBaoPhiLePhi.getRegisteredInspection().getEmail().toString()
			  //customer.setEmail("trungltvr@gmail22.com");
			  customer.setFax(objectThongBaoPhiLePhi.getRegisteredInspection().getFax().toString());
			  customer.setPhone(objectThongBaoPhiLePhi.getRegisteredInspection().getPhone().toString());
			  customer.setContactPerson(objectThongBaoPhiLePhi.getRegisteredInspection().getContactName().toString());
			  customer.setRepresentPerson(objectThongBaoPhiLePhi.getRegisteredInspection().getRepresentative().toString());
			  String sLoaiHinhDoanhNghiep = DKConfigurationManager.getStrProp("cong.ty","cong.ty");
			  
			//fixbug by liemnn  if (customer.getName().toUpperCase().contains(sLoaiHinhDoanhNghiep.toUpperCase()))
				  
			if(isCustomDoanhNghiep(customer.getName(),customer.getTaxCode())){
			
				  customer.setCusType("1");
			  } else
			  {
				  customer.setCusType("0");
			  }			 		  
			if (objectThongBaoPhiLePhi.getRegisteredInspection().getImporterCode().toString().trim().contains("2015080100001")
					  || objectThongBaoPhiLePhi.getRegisteredInspection().getImporterCode().toString().trim().contains("2015080100002") 
					  || objectThongBaoPhiLePhi.getRegisteredInspection().getImporterCode().toString().trim().contains("2015080100003")
					  || objectThongBaoPhiLePhi.getRegisteredInspection().getImporterCode().toString().trim().contains("2015080100004")
					  || objectThongBaoPhiLePhi.getRegisteredInspection().getImporterCode().toString().trim().contains("2015080100005")
					  || objectThongBaoPhiLePhi.getRegisteredInspection().getImporterCode().toString().trim().contains("2015080100006")
					  || objectThongBaoPhiLePhi.getRegisteredInspection().getImporterCode().toString().trim().contains("2015080100007")
					  ) {
				  customer.setCusType("0");
			  }
			  customers.getCustomer().add(customer);
			  _log.info("---------customers--------TaxCode:" + customer.getTaxCode());
					  
			// Tao du lieu hoa don --- for importAndPublishInv
			  Invoices invoices = new Invoices();
			  Invoices.Inv inv = new Invoices.Inv();
			  inv.setKey(objectThongBaoPhiLePhi.getDebitNote().getDebitNoteNumber().toString());
			  
			  Invoices.Inv.Invoice invoiceDetails = new Invoices.Inv.Invoice();
			  invoiceDetails.setCusCode(objectThongBaoPhiLePhi.getRegisteredInspection().getImporterCode().toString());
			  invoiceDetails.setCusName(objectThongBaoPhiLePhi.getRegisteredInspection().getImporterName().toString());
			  invoiceDetails.setCusAddress(objectThongBaoPhiLePhi.getRegisteredInspection().getImporterAddress().toString());
			  invoiceDetails.setCusPhone(objectThongBaoPhiLePhi.getRegisteredInspection().getContactPhone().toString());
			  
			  if(customer.getCusType().equals("1")){
				  //for cong ty
				  invoiceDetails.setCusTaxCode(objectThongBaoPhiLePhi.getRegisteredInspection().getImporterCode().toString());  
			  }else{
				  //for ca nhan
				  invoiceDetails.setCusTaxCode("");
			  }
			  
			  
			  invoiceDetails.setPaymentMethod(DKConfigurationManager.getStrProp("hinh.thuc.ck","hinh.thuc.ck"));
			  if (objectThongBaoPhiLePhi.getDebitNote().getPaymentType() > 1)
			  {
				  invoiceDetails.setPaymentMethod(DKConfigurationManager.getStrProp("hinh.thuc.tt","hinh.thuc.tt"));
			  }
			  invoiceDetails.setPaymentStatus("1");
			  invoiceDetails.setKindOfService(FormatData.getYear(objectThongBaoPhiLePhi.getDebitNote().getReportDate()) + FormatData.getMonth(objectThongBaoPhiLePhi.getDebitNote().getReportDate()));
			  // Chi tiet tung dong ghi tren hoa don
			  Invoices.Inv.Invoice.Products products = new Invoices.Inv.Invoice.Products();
			  
			  // Chuan bi list thong tin phi le phi
			  String soDangKy = "";
			  long soLuongXe = 0;				
			  long congPhiTruocThue = 0;			
								
			  for (int i = 0; i < allThongTinChungLePhi.size(); i++) {
				  thongTinChungLePhi = allThongTinChungLePhi.get(i);
				  soDangKy = thongTinChungLePhi.getSoDangKy();
				  soLuongXe = (new Long(thongTinChungLePhi.getSoLuongXe()).longValue());
				  congPhiTruocThue = (new Double(thongTinChungLePhi.getCongPhi()).longValue());
				  
				  // lan 1 
				  // lan n khong co text so dkkt  
				  Invoices.Inv.Invoice.Products.Product product = new Invoices.Inv.Invoice.Products.Product();				  
				  if (i == 0)
				  {
					  String tensanpham = DKConfigurationManager.getStrProp("ktcl.xe.nk","ktcl.xe.nk") + "(" + inv.getKey() + "): - "+ DKConfigurationManager.getStrProp("SO_DKKT","SO_DKKT");
					  product.setProdName(tensanpham + soDangKy +" (" + soLuongXe + "_xe)");
				  } 
				  else 
				  {product.setProdName(soDangKy +" (" + soLuongXe + "_xe)");}
				  
				  product.setProdUnit(DKConfigurationManager.getStrProp("don.vi.tinh","don.vi.tinh"));
				  product.setProdQuantity("1");
				  product.setProdPrice(String.valueOf(congPhiTruocThue));
				  product.setAmount(String.valueOf(congPhiTruocThue));
				  products.getProduct().add(product);
			  }
			  
			  
			  
			  long Total = 0;
			  long DiscountAmount = 0;
			  long VATRate = 10;
			  long VATAmount = 0;
			  long Extra = 0;
			  long TotalAmount = 0;
			  String AmountInWords = ".../";
			  Total = (new Double(objectThongBaoPhiLePhi.getAllThongTinChungCommon().get(0).getTotalCongPhi()).longValue());			  
			  VATAmount = (new Double(objectThongBaoPhiLePhi.getAllThongTinChungCommon().get(0).getTotalThue()).longValue());
			  Extra = (new Double(objectThongBaoPhiLePhi.getAllThongTinChungCommon().get(0).getTotalLePhiCapCc()).longValue());
			  AmountInWords = CallWebserviceClient.numberToString(new Double(objectThongBaoPhiLePhi.getAllThongTinChungCommon().get(0).getTotalTongTien()));
			  TotalAmount = (new Double( objectThongBaoPhiLePhi.getDebitNote().getTotalPayment())).longValue();
			  
			  invoiceDetails.setProducts(products);			  
			  invoiceDetails.setTotal(String.valueOf(Total));
			  invoiceDetails.setDiscountAmount(String.valueOf(DiscountAmount));
			  invoiceDetails.setVATRate(String.valueOf(VATRate));
			  invoiceDetails.setVATAmount(String.valueOf(VATAmount));
			  invoiceDetails.setExtra(String.valueOf(Extra)+";"+corporationName);
			  invoiceDetails.setAmount(String.valueOf(TotalAmount));
			  invoiceDetails.setAmountInWords(AmountInWords);
			  inv.getInvoice().add(invoiceDetails);
			  			  
			  invoices.getInv().add(inv);
			  _log.info("---------Mau1_invoices--------DebitNoteNumber:" + inv.getKey());
		
			
			exportCustomers = customers;
			exportInvoices = invoices;
			}
		} catch (Exception e) {
			_log.error(e);
			exportCustomers = null;
			exportInvoices = null;
		}		
	}
	
	public static void exportCustomersAndInvoicesToVNPT_Mode2(ThongBaoPhiLePhi2 objectThongBaoPhiLePhi,String corporationName ) {
		// 1. Tao du lieu khach hang --- for updateCus
		// 2. Tao du lieu hoa don --- for importAndPublishInv
		try {
			exportCustomers = null;
			exportInvoices = null;
			
			
			List<ThongTinDetailLePhi2> allThongTinChungLePhi = objectThongBaoPhiLePhi.getAllThongTinLePhiDetail2();
			ThongTinDetailLePhi2 thongTinChungLePhi = null;			
						
			if ((objectThongBaoPhiLePhi != null) && (objectThongBaoPhiLePhi.getAllThongTinLePhiDetail2() != null) 
					&&  (allThongTinChungLePhi != null) && (allThongTinChungLePhi.size()>0 ) )
			{	
			// Export here
			// Tao du lieu khach hang --- for updateCus
			  Customers customers = new Customers();
			  Customers.Customer customer = new Customers.Customer();
			  customer.setName(objectThongBaoPhiLePhi.getRegisteredInspection().getImporterName().toString());
			  customer.setCode(objectThongBaoPhiLePhi.getRegisteredInspection().getImporterCode().toString());
			  customer.setTaxCode(objectThongBaoPhiLePhi.getRegisteredInspection().getImporterCode().toString());
			  customer.setAddress(objectThongBaoPhiLePhi.getRegisteredInspection().getImporterAddress().toString());
			  customer.setBankAccountName("");
			  customer.setBankName("");
			  customer.setBankNumber("");
			  customer.setEmail(objectThongBaoPhiLePhi.getRegisteredInspection().getContactEmail()); //("huongkma@gmail.com");// objectThongBaoPhiLePhi.getRegisteredInspection().getEmail().toString()
			  //anhnt sua ngay 25/02/2016
			  //customer.setEmail("trungltvrd@gmail.com");
			  customer.setFax(objectThongBaoPhiLePhi.getRegisteredInspection().getFax().toString());
			  customer.setPhone(objectThongBaoPhiLePhi.getRegisteredInspection().getPhone().toString());
			  customer.setContactPerson(objectThongBaoPhiLePhi.getRegisteredInspection().getContactName().toString());
			  customer.setRepresentPerson(objectThongBaoPhiLePhi.getRegisteredInspection().getRepresentative().toString());
			  String sLoaiHinhDoanhNghiep = DKConfigurationManager.getStrProp("cong.ty","cong.ty");
			  
			  //fixbug by liemnn if (customer.getName().toUpperCase().contains(sLoaiHinhDoanhNghiep.toUpperCase()))
				  
			  if(isCustomDoanhNghiep(customer.getName(),customer.getTaxCode())){
				  customer.setCusType("1");
			  } else
			  {
				  customer.setCusType("0");
			  }
			  if (objectThongBaoPhiLePhi.getRegisteredInspection().getImporterCode().toString().trim().contains("2015080100001")
					  || objectThongBaoPhiLePhi.getRegisteredInspection().getImporterCode().toString().trim().contains("2015080100002") 
					  || objectThongBaoPhiLePhi.getRegisteredInspection().getImporterCode().toString().trim().contains("2015080100003")
					  || objectThongBaoPhiLePhi.getRegisteredInspection().getImporterCode().toString().trim().contains("2015080100004")
					  || objectThongBaoPhiLePhi.getRegisteredInspection().getImporterCode().toString().trim().contains("2015080100005")
					  || objectThongBaoPhiLePhi.getRegisteredInspection().getImporterCode().toString().trim().contains("2015080100006")
					  || objectThongBaoPhiLePhi.getRegisteredInspection().getImporterCode().toString().trim().contains("2015080100007")
					  ) {
				  customer.setCusType("0");
			  }
					  
			  customers.getCustomer().add(customer);
			  _log.info("---------customers--------TaxCode:" + customer.getTaxCode());
			  
			// Tao du lieu hoa don --- for importAndPublishInv
			  Invoices invoices = new Invoices();
			  Invoices.Inv inv = new Invoices.Inv();
			  inv.setKey(objectThongBaoPhiLePhi.getDebitNote().getDebitNoteNumber().toString());
			  
			  Invoices.Inv.Invoice invoiceDetails = new Invoices.Inv.Invoice();
			  invoiceDetails.setCusCode(objectThongBaoPhiLePhi.getRegisteredInspection().getImporterCode().toString());
			  invoiceDetails.setCusName(objectThongBaoPhiLePhi.getRegisteredInspection().getImporterName().toString());
			  invoiceDetails.setCusAddress(objectThongBaoPhiLePhi.getRegisteredInspection().getImporterAddress().toString());
			  invoiceDetails.setCusPhone(objectThongBaoPhiLePhi.getRegisteredInspection().getContactPhone().toString());
			  if(customer.getCusType().equals("1")){
				  //for cong ty
				  invoiceDetails.setCusTaxCode(objectThongBaoPhiLePhi.getRegisteredInspection().getImporterCode().toString());  
			  }else{
				  //for ca nhan
				  invoiceDetails.setCusTaxCode("");
			  }
			  
			  invoiceDetails.setPaymentMethod(DKConfigurationManager.getStrProp("hinh.thuc.ck","hinh.thuc.ck"));
			  if (objectThongBaoPhiLePhi.getDebitNote().getPaymentType() > 1)
			  {
				  invoiceDetails.setPaymentMethod(DKConfigurationManager.getStrProp("hinh.thuc.tt","hinh.thuc.tt"));
			  }
			  invoiceDetails.setPaymentStatus("1");
			  invoiceDetails.setKindOfService(FormatData.getYear(objectThongBaoPhiLePhi.getDebitNote().getReportDate()) + FormatData.getMonth(objectThongBaoPhiLePhi.getDebitNote().getReportDate()));
			  // Chi tiet tung dong ghi tren hoa don
			  Invoices.Inv.Invoice.Products products = new Invoices.Inv.Invoice.Products();
			  
			  // Chuan bi list thong tin phi le phi
			  String soDangKy = "";
			  long soLuongXe = 0;				
			  long congPhiTruocThue = 0;
			  long phiKtTruocThue = 0;
			  long phiPsTruocThue = 0;
			  
			  long Total = 0;
			  long DiscountAmount = 0;
			  long VATRate = 10;
			  long VATAmount = 0;
			  long Extra = 0;
			  long TotalAmount = 0;
			  double Tongtien = 0;
			  String AmountInWords = ".../";
								
			  for (int i = 0; i < allThongTinChungLePhi.size(); i++) {
				  
				  thongTinChungLePhi = allThongTinChungLePhi.get(i);
				  soDangKy = thongTinChungLePhi.getSoDangKy();
				  soLuongXe = (new Long(thongTinChungLePhi.getSoLuong()).longValue());
				  phiKtTruocThue = (new Double(thongTinChungLePhi.getPhiKtTruocThue()).longValue());
				  phiPsTruocThue = (new Double(thongTinChungLePhi.getPhiPsTruocThue()).longValue());
				  congPhiTruocThue = (new Long(phiKtTruocThue + phiPsTruocThue )).longValue();
				  

				  Total += (new Long(phiKtTruocThue + phiPsTruocThue )).longValue();
				  VATAmount += (new Double(thongTinChungLePhi.getThue()).longValue());
				  Extra += (new Double(thongTinChungLePhi.getLePhiCapCc()).longValue());
				  Tongtien += new Double(thongTinChungLePhi.getTongTien());
			  
				  // lan 1 
				  // lan n khong co text so dkkt  
				  Invoices.Inv.Invoice.Products.Product product = new Invoices.Inv.Invoice.Products.Product();				  
				  if (i == 0)
				  {
					  String tensanpham = DKConfigurationManager.getStrProp("ktcl.xe.nk","ktcl.xe.nk")  + "(" + inv.getKey() + "): - "+  DKConfigurationManager.getStrProp("SO_DKKT","SO_DKKT");
					  product.setProdName(tensanpham + soDangKy +" (" + soLuongXe + "_xe)");
				  } 
				  else 
				  {product.setProdName(soDangKy +" (" + soLuongXe + "_xe)");}
				  
				  product.setProdUnit(DKConfigurationManager.getStrProp("don.vi.tinh","don.vi.tinh"));
				  product.setProdQuantity("1");
				  product.setProdPrice(String.valueOf(congPhiTruocThue));
				  product.setAmount(String.valueOf(congPhiTruocThue));
				  products.getProduct().add(product);
				  
			  }
			  
			  
			  AmountInWords = CallWebserviceClient.numberToString(Tongtien);
			  TotalAmount = (new Double( objectThongBaoPhiLePhi.getDebitNote().getTotalPayment())).longValue();
			  
			  invoiceDetails.setProducts(products);			  
			  invoiceDetails.setTotal(String.valueOf(Total));
			  invoiceDetails.setDiscountAmount(String.valueOf(DiscountAmount));
			  invoiceDetails.setVATRate(String.valueOf(VATRate));
			  invoiceDetails.setVATAmount(String.valueOf(VATAmount));
			  invoiceDetails.setExtra(String.valueOf(Extra)+";"+corporationName);
			  invoiceDetails.setAmount(String.valueOf(TotalAmount));
			  invoiceDetails.setAmountInWords(AmountInWords);
			  inv.getInvoice().add(invoiceDetails);
			  
			  invoices.getInv().add(inv);
			  _log.info("---------Mau2_invoices--------DebitNoteNumber:" + inv.getKey());
		
			
			exportCustomers = customers;
			exportInvoices = invoices;
			}
		} catch (Exception e) {
			_log.error(e);
			exportCustomers = null;
			exportInvoices = null;
		}				
	}
	
	private static boolean  isCustomDoanhNghiep(String CustomerName,String taxCode){
		if(CustomerName == null ||CustomerName.trim().length()<=0){ 
			return false;
		}
		
		String sLoaiHinhDoanhNghiep = DKConfigurationManager.getStrProp("cong.ty","cong.ty");
		  
		
		CustomerName = CustomerName.toUpperCase();
		
		if (CustomerName.contains(sLoaiHinhDoanhNghiep.toUpperCase())){
			return true;
		}
		
		if((taxCode != null && taxCode.trim().length()==10) || (taxCode != null && taxCode.trim().length()==13)) {
			return true;
		}
		if(CustomerName.indexOf("TNHH") != -1 
				|| CustomerName.indexOf("TY") != -1){
			return true;
		}
		
			
			
		return false;
	}


	public static String actionExportThongBaoTrungSoKhungDongCo(String realPath,long idHoSoThuTuc){
		String fileUrl = "";
		try {
			String tenFile_Export = System.currentTimeMillis() + "_" + ReportConstant.THONG_BAO_TRUNG_SOKHUNG_SODONGCO_EXPORT;
			ThongBaoTrungSoKhungSoDongCo objectReport = ThongBaoTrungSoKhungSoDongCoExport.getModel(idHoSoThuTuc);
			JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
			parameters = new HashMap<String, Object>();
			fileUrl = ReportUtils.exportFunction(realPath, ReportUtils.MAU_THEM_MOI, ReportConstant.THONG_BAO_TRUNG_SOKHUNG_SODONGCO_TEMP, tenFile_Export, dataSource, parameters);
		} catch (Exception e) {
			_log.error(e);
		} 
		return fileUrl;
	}
	
	public static String actionExportLichDeNghiKiemTra(String realPath,String lstConfirmedInspectionId){
		String fileUrl = "";
		_log.info("--lstConfirmedInspectionId=="+lstConfirmedInspectionId);
		try {
			String tenFile_Export = System.currentTimeMillis() + "_" + ReportConstant.GIAY_LICH_DE_NGHI_KIEM_TRA_EXPORT;
			LichDeNghiKiemTra objectReport = LichDeNghiKiemTraExport.getModel(lstConfirmedInspectionId);
			JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
			parameters = new HashMap<String, Object>();
			fileUrl = ReportUtils.exportFunction(realPath, ReportUtils.MAU_THEM_MOI, ReportConstant.GIAY_LICH_DE_NGHI_KIEM_TRA_TEMP, tenFile_Export, dataSource, parameters);
		} catch (Exception e) {
			_log.error(e);
		} 
		return fileUrl;
	}
	
	public static String actionExportPhieuPhanCongDKVKiemTra(String realPath,long userId, String ngayKiemTra){
		String fileUrl = "";
		_log.info("--lstConfirmedInspectionId=="+userId +"--ngayKiemTra=="+ngayKiemTra);
		try {
			String tenFile_Export = System.currentTimeMillis() + "_" + ReportConstant.GIAY_PHIEU_PHAN_CONG_DKV_KIEM_TRA_EXPORT;
			PhieuPhanCongDKVKiemTra objectReport = PhieuPhanCongDKVKiemTraExport.getModel(userId,ngayKiemTra);
			JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
			parameters = new HashMap<String, Object>();
			fileUrl = ReportUtils.exportFunction(realPath, ReportUtils.MAU_THEM_MOI, ReportConstant.GIAY_PHIEU_PHAN_CONG_DKV_KIEM_TRA_TEMP, tenFile_Export, dataSource, parameters);
		} catch (Exception e) {
			_log.error(e);
		} 
		return fileUrl;
	}
	
	public static String actionExportBienBanGhiNhanKetQuaKiemTra(String realPath,long userId, String confirmedInspectionId, String lstVehicleGroupId){
		String fileUrl = "";
		_log.debug("===actionExportBienBanGhiNhanKetQuaKiemTra===");
		_log.debug("---userId==="+userId);
		_log.debug("---lstConfirmedInspectionId==="+confirmedInspectionId);
		_log.debug("---lstVehicleGroupId==="+lstVehicleGroupId);
		
		_log.info("===actionExportBienBanGhiNhanKetQuaKiemTra===");
		_log.info("---userId==="+userId);
		_log.info("---lstConfirmedInspectionId==="+confirmedInspectionId);
		_log.info("---lstVehicleGroupId==="+lstVehicleGroupId);
		
		try {
			String tenFile_Export = System.currentTimeMillis() + "_" + ReportConstant.GIAY_BIEN_BAN_GHI_NHAN_KQ_KIEM_TRA_EXPORT;
			BienBanGhiNhanKetQuaKiemTraList objectReport = BienBanGhiNhanKetQuaKiemTraExport.getModel(userId,confirmedInspectionId,lstVehicleGroupId);
			JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
			parameters = new HashMap<String, Object>();
			fileUrl = ReportUtils.exportFunction(realPath, ReportUtils.MAU_THEM_MOI, ReportConstant.GIAY_BIEN_BAN_GHI_NHAN_KQ_KIEM_TRA_TEMP, tenFile_Export, dataSource, parameters);
		} catch (Exception e) {
			_log.error(e);
		} 
		return fileUrl;
	}
	public static String actionExportBienBanGhiNhanKetQuaKiemTraList(String realPath, String lstConfirmedInspectionId){
		String fileUrl = "";
		
		_log.info("---lstConfirmedInspectionId===" + lstConfirmedInspectionId);
		
		try {
			String tenFile_Export = System.currentTimeMillis() + "_" + ReportConstant.GIAY_BIEN_BAN_GHI_NHAN_KQ_KIEM_TRA_EXPORT;
			BienBanGhiNhanKetQuaKiemTraList objectReport = BienBanGhiNhanKetQuaKiemTraExport.getListModel(lstConfirmedInspectionId);
			JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
			parameters = new HashMap<String, Object>();
			fileUrl = ReportUtils.exportFunction(realPath, ReportUtils.MAU_THEM_MOI, ReportConstant.GIAY_BIEN_BAN_GHI_NHAN_KQ_KIEM_TRA_TEMP, tenFile_Export, dataSource, parameters);
		} catch (Exception e) {
			_log.error(e);
		} 
		return fileUrl;
	}
	
}
