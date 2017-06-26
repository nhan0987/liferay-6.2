
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
import vn.dtt.gt.dk.nsw.model.DebitNote;
import vn.dtt.gt.dk.nsw.model.ImportedVehicleList;
import vn.dtt.gt.dk.nsw.model.InspectorSign;
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

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringUtil;

public class ReportBusinessUtils {
	
	private static Log log = LogFactoryUtil.getLog(ReportBusinessUtils.class);
	public static final String FILE_NAME_NULL = "file_name_null";
	private static HashMap<String, Object> parameters =  null;

	public static String actionExport(String realPath, long tthc_NoiDungHoSoID)
		throws Exception {
		
		String resultfileName = FILE_NAME_NULL;
		
		log.debug("tthc_NoiDungHoSoID==" + tthc_NoiDungHoSoID);
		TthcNoidungHoSo tthcNoidungHoSo = null;
		log.info("--------------vao actionExport----------------");
		if (tthc_NoiDungHoSoID > 0) {
			tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.getTthcNoidungHoSo(tthc_NoiDungHoSoID);
			TthcBieuMauHoSo tthcBieuMauHoSo = TthcBieuMauHoSoLocalServiceUtil.getTthcBieuMauHoSo(tthcNoidungHoSo.getBieuMauHoSoId());
			
			if (tthcNoidungHoSo != null) {
				
				String tenFile_Export = tthcBieuMauHoSo.getMaBieuMau() + "_" + tthcNoidungHoSo.getId() + ".pdf";
				
				long taiLieuDinhKem = tthcNoidungHoSo.getTaiLieuDinhKem();
				
				String noidungXml = tthcNoidungHoSo.getNoiDungXml();
				log.info("--------------begin converXMLMessagesContentToObject----------------");
				List<Object> lstObject = MessageFactory.converXMLMessagesContentToObject(noidungXml);
				log.info("--------------end converXMLMessagesContentToObject----------------");
				
				log.info((lstObject != null) ? ("lstObject==size==" + lstObject.size()) : "lstObject==null===");
				
				if(lstObject != null && lstObject.size() >0){
				for (Object object : lstObject) {
					log.info("--------------vao for ReportBusiness----------------");
					
					
					if (object instanceof CertificateOfQuanlityConformity) {
						
						log.info("-CertificateOfQuanlityConformity--");
						
						JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( CertificateOfQuanlityConformity.class.cast(object));
						parameters =  new HashMap<String, Object>();
						return  ReportUtils.exportFunction(realPath, ReportUtils.CHUNGCHI_GCN, tthcBieuMauHoSo.getMaBieuMau() + ".jrxml",
								tenFile_Export, dataSource, parameters);
						
					} else if (object instanceof NoticeOfExemptionFromInspection) {
						//TODO 212 NoticeOfExemptionFromInspection
						
						log.info("-NoticeOfExemptionFromInspection--");
						JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( NoticeOfExemptionFromInspection.class.cast(object));
						parameters =  new HashMap<String, Object>();
						return  ReportUtils.exportFunction(realPath, ReportUtils.CHUNGCHI_TBM, tthcBieuMauHoSo.getMaBieuMau() + ".jrxml",
								tenFile_Export, dataSource, parameters);
						
					} else if (object instanceof NoticeOfNonConformity){
						 //TODO 213 NoticeOfNonConformity
						log.info("-NoticeOfNonConformity--");
						JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( NoticeOfNonConformity.class.cast(object));
						parameters =  new HashMap<String, Object>();
						return  ReportUtils.exportFunction(realPath, ReportUtils.CHUNGCHI_TBKD, tthcBieuMauHoSo.getMaBieuMau() + ".jrxml",
								tenFile_Export, dataSource, parameters);
						
					} else if (object instanceof NoticeOfViolation){
						 //TODO 214 NoticeOfViolation
						log.info("-NoticeOfViolation--");
						JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( NoticeOfViolation.class.cast(object));
						parameters =  new HashMap<String, Object>();
						return  ReportUtils.exportFunction(realPath, ReportUtils.CHUNGCHI_TBVP, tthcBieuMauHoSo.getMaBieuMau() + ".jrxml",
								tenFile_Export, dataSource, parameters);
						
					} else if (object instanceof ConfirmationStatusOfQuanlityConformity) {
						 //TODO 216 ConfirmationStatusOfQuanlityConformity
						log.info("-ConfirmationStatusOfQuanlityConformity--");
						JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( ConfirmationStatusOfQuanlityConformity.class.cast(object));
						parameters =  new HashMap<String, Object>();
						return  ReportUtils.exportFunction(realPath, ReportUtils.CHUNGCHI_GCN, tthcBieuMauHoSo.getMaBieuMau() + ".jrxml",
								tenFile_Export, dataSource, parameters);
						
					} 
					
					log.info("--------------ketthuc for ReportBusiness----------------");
					log.info("--------------tenFile_Export trong ReportBusiness----------------" + tenFile_Export);
					return tenFile_Export;
				}
				}
			}
		}	
		return resultfileName;
	}
	
	public static String actionExportThongSoXe(String realPath, long tthc_NoiDungHoSoID, String maBieuMau, String soChungChi, String ngayKyChungChi)throws Exception {
			
			String resultfileName = FILE_NAME_NULL;
			
			log.debug("tthc_NoiDungHoSoID==" + tthc_NoiDungHoSoID);
			TthcNoidungHoSo tthcNoidungHoSo = null;
			log.info("--------------vao actionExport----------------");
			if (tthc_NoiDungHoSoID > 0) {
				tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.getTthcNoidungHoSo(tthc_NoiDungHoSoID);
				
				if (tthcNoidungHoSo != null) {
					
					String tenFile_Export = maBieuMau + "_" + tthcNoidungHoSo.getId() + ".pdf";
					
					long taiLieuDinhKem = tthcNoidungHoSo.getTaiLieuDinhKem();
					
					String noidungXml = tthcNoidungHoSo.getNoiDungXml();
					log.info("--------------begin converXMLMessagesContentToObject----------------");
					List<Object> lstObject = MessageFactory.converXMLMessagesContentToObject(noidungXml);
					log.info("--------------end converXMLMessagesContentToObject----------------");
					
					log.info((lstObject != null) ? ("lstObject==size==" + lstObject.size()) : "lstObject==null===");
					
					if(lstObject != null && lstObject.size() >0){
					for (Object object : lstObject) {
						log.info("--------------vao for ReportBusiness----------------");
						if (object instanceof VehicleInspectionRecord){
							log.debug("-VehicleInspectionRecord--");
							JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( VehicleInspectionRecord.class.cast(object));
							parameters =  new HashMap<String, Object>();
							parameters.put("soChungChi", soChungChi);
							parameters.put("ngayKyChungChi", ngayKyChungChi);
							return  ReportUtils.exportFunction(realPath, ReportUtils.THONG_SO_XE, maBieuMau + ".jrxml",
							
									tenFile_Export, dataSource, parameters);
						}
						
						log.info("--------------ketthuc for ReportBusiness----------------");
						log.info("--------------tenFile_Export trong ReportBusiness----------------" + tenFile_Export);
						return tenFile_Export;
					}
					}
				}
			}	
			return resultfileName;
		}
}
