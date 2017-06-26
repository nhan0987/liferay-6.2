
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
import vn.dtt.gt.dk.report.model.bienbanghinhanketquakiemtra.BienBanGhiNhanKetQuaKiemTraExport;
import vn.dtt.gt.dk.report.model.bienbanghinhanketquakiemtra.BienBanGhiNhanKetQuaKiemTraList;
import vn.dtt.gt.dk.report.model.lichdenghikiemtra.LichDeNghiKiemTra;
import vn.dtt.gt.dk.report.model.lichdenghikiemtra.LichDeNghiKiemTraExport;
import vn.dtt.gt.dk.report.model.phieuphancongdkvkiemtra.PhieuPhanCongDKVKiemTra;
import vn.dtt.gt.dk.report.model.phieuphancongdkvkiemtra.PhieuPhanCongDKVKiemTraExport;
import vn.dtt.gt.dk.report.model.thongbaotrungsokhungsodongco.ThongBaoTrungSoKhungSoDongCo;
import vn.dtt.gt.dk.report.model.thongbaotrungsokhungsodongco.ThongBaoTrungSoKhungSoDongCoExport;

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
