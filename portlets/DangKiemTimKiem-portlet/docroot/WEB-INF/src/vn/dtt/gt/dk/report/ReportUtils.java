
package vn.dtt.gt.dk.report;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.PortletSession;
import javax.portlet.ResourceRequest;
import javax.servlet.http.HttpServletRequest;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporter;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import vn.dtt.gt.dk.dao.common.model.DmDataItem;
import vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo;
import vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo;
import vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcBieuMauHoSoLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord;
import vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceUtil;
import vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.ImportedVehicle;
import vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.InspectionAttendee;
import vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.InspectionCommonStatus;
import vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.SpecificationList.SpecItem;
import vn.dtt.gt.dk.utils.DanhMucKey;
import vn.dtt.gt.dk.utils.config.DKConfigurationManager;
import vn.dtt.gt.dk.utils.document.DocumentUtils;
import vn.dtt.gt.dk.utils.format.Constants;
import vn.dtt.gt.dk.utils.format.ConvertUtil;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class ReportUtils {
	
	private static Log log = LogFactoryUtil.getLog(ReportUtils.class);
	
	public static final String PATH_FILE_REPORT = "report";
	public static final String PATH_FILE_EXPORT = "export";
	
	public static final String BAN_DK_KIEM_TRA = "bandkkiemtra";
	public static final String BAN_DK_THAYDOI_TGDD = "bandkthaydoitgdd";
	public static final String BAN_KE_CHI_TIET = "bankechitiet";
	public static final String BAN_THONG_TIN_NK = "banthongtinnk";
	public static final String BIEN_BAN_KIEM_TRA = "bienbankiemtra";
	public static final String THONG_SO_XE = "thongsoxe";
	public static final String THANH_TOAN = "thanhtoan";
	public static final String MAU_THEM_MOI = "mauthemmoi";
	
	public static final String CHUNGCHI_GCN = "chungchi/gcn";
	public static final String CHUNGCHI_TBKD = "chungchi/TBKD";
	public static final String CHUNGCHI_TBM = "chungchi/tbm";
	public static final String CHUNGCHI_TBVP = "chungchi/TBVP";
	
	public static <T> String getValueOfTechnicalSpecItemByCode(List<T> specList, String specCode) {
		
		String result = "";
		if (specList != null) {
			Object obj = specList.get(0);
			if (obj instanceof vn.dtt.gt.dk.nsw.model.TechnicalSpecification.SpecificationList.SpecItem) {
				if (specCode != null && specCode.trim().length() > 0) {
					for (int i = 0; i < specList.size(); i++) {
						vn.dtt.gt.dk.nsw.model.TechnicalSpecification.SpecificationList.SpecItem specItem =
							vn.dtt.gt.dk.nsw.model.TechnicalSpecification.SpecificationList.SpecItem.class.cast((specList.get(i)));
						if (specItem.getSpecificationCode().trim().equalsIgnoreCase(specCode.trim())) {
							result = specItem.getDeclarationValue1();
							break;
						}
					}
				}
			} else if (obj instanceof vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.SpecificationList.SpecItem) {
				if (specCode != null && specCode.trim().length() > 0) {
					for (int i = 0; i < specList.size(); i++) {
						vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.SpecificationList.SpecItem specItem =
							vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.SpecificationList.SpecItem.class.cast((specList.get(i)));
						if (specItem.getSpecificationCode().trim().equalsIgnoreCase(specCode.trim())) {
							result = specItem.getDeclarationValue1();
							break;
						}
					}
				}
			} else if (obj instanceof vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.SpecificationList.SpecItem) {
				if (specCode != null && specCode.trim().length() > 0) {
					for (int i = 0; i < specList.size(); i++) {
						vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.SpecificationList.SpecItem specItem =
							vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.SpecificationList.SpecItem.class.cast((specList.get(i)));
						if (specItem.getSpecificationCode().trim().equalsIgnoreCase(specCode.trim())) {
							result = specItem.getDeclarationValue1();
							break;
						}
					}
				}
			} else if (obj instanceof vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.SpecificationList.SpecItem) {
				if (specCode != null && specCode.trim().length() > 0) {
					for (int i = 0; i < specList.size(); i++) {
						vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.SpecificationList.SpecItem specItem =
							vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.SpecificationList.SpecItem.class.cast((specList.get(i)));
						if (specItem.getSpecificationCode().trim().equalsIgnoreCase(specCode.trim())) {
							result = specItem.getDeclarationValue1();
							break;
						}
					}
				}
			} else if (obj instanceof vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.SpecificationList.SpecItem) {
				if (specCode != null && specCode.trim().length() > 0) {
					for (int i = 0; i < specList.size(); i++) {
						vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.SpecificationList.SpecItem specItem =
							vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.SpecificationList.SpecItem.class.cast((specList.get(i)));
						if (specItem.getSpecificationCode().trim().equalsIgnoreCase(specCode.trim())) {
							result = specItem.getDeclarationValue1();
							break;
						}
					}
				}
			} else if (obj instanceof vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.SpecificationList.SpecItem) {
				if (specCode != null && specCode.trim().length() > 0) {
					for (int i = 0; i < specList.size(); i++) {
						vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.SpecificationList.SpecItem specItem =
							vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.SpecificationList.SpecItem.class.cast((specList.get(i)));
						if (specItem.getSpecificationCode().trim().equalsIgnoreCase(specCode.trim())) {
							result = specItem.getDeclarationValue1();
							break;
						}
					}
				}
			}
			
		}
		return result;
	}
	
	public static <T> String getValueOfTechnicalSpecItemByDM(List<T> specList, String specCode, int groupCode) {
		String result = "";
		DmDataItem dataItem = null;
		if (specList != null) {
			Object obj = specList.get(0);
			if (obj instanceof vn.dtt.gt.dk.nsw.model.TechnicalSpecification.SpecificationList.SpecItem) {
				vn.dtt.gt.dk.nsw.model.TechnicalSpecification.SpecificationList.SpecItem specItem = null;
				if (specCode != null && specCode.trim().length() > 0) {
					for (int i = 0; i < specList.size(); i++) {
						if (vn.dtt.gt.dk.nsw.model.TechnicalSpecification.SpecificationList.SpecItem.class.cast(specList.get(i)).getSpecificationCode().trim().equalsIgnoreCase(
							specCode.trim())) {
							specItem = vn.dtt.gt.dk.nsw.model.TechnicalSpecification.SpecificationList.SpecItem.class.cast(specList.get(i));
							break;
						}
					}
				}
				if (specItem != null) {
					result = specItem.getDeclarationValue1();
					dataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(groupCode, specItem.getDeclarationValue1());
					if (dataItem != null) {
						result = dataItem.getName();
					} else {
						//log.info("==getValueOfTechnicalSpecItemByDM==specItem== " + specCode + " ==DeclarationValue== " + specItem.getDeclarationValue1() + " ==Khong co Trong DB voi Group code== " + groupCode);
					}
				} else {
					//log.info("==getValueOfTechnicalSpecItemByDM==specCode=" + specCode + "==Khong co trong message SpecificationList of TechnicalSpecification");
				}
			} else if (obj instanceof vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.SpecificationList.SpecItem) {
				vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.SpecificationList.SpecItem specItem = null;
				if (specCode != null && specCode.trim().length() > 0) {
					for (int i = 0; i < specList.size(); i++) {
						if (vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.SpecificationList.SpecItem.class.cast(specList.get(i)).getSpecificationCode().trim().equalsIgnoreCase(
							specCode.trim())) {
							specItem = vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.SpecificationList.SpecItem.class.cast(specList.get(i));
							break;
						}
					}
				}
				if (specItem != null) {
					result = specItem.getDeclarationValue1();
					dataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(groupCode, specItem.getDeclarationValue1());
					if (dataItem != null) {
						result = dataItem.getName();
					} else {
						//log.info("==getValueOfTechnicalSpecItemByDM==specItem== " + specCode + " ==DeclarationValue== " + specItem.getDeclarationValue1() + " ==Khong co Trong DB voi Group code== " + groupCode);
					}
				} else {
					//log.info("==getValueOfTechnicalSpecItemByDM==specCode=" + specCode + "==Khong co trong message SpecificationList of CertificateOfQuanlityConformity");
				}
			} else if (obj instanceof vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.SpecificationList.SpecItem) {
				vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.SpecificationList.SpecItem specItem = null;
				if (specCode != null && specCode.trim().length() > 0) {
					for (int i = 0; i < specList.size(); i++) {
						if (vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.SpecificationList.SpecItem.class.cast(specList.get(i)).getSpecificationCode().trim().equalsIgnoreCase(
							specCode.trim())) {
							specItem =
								vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.SpecificationList.SpecItem.class.cast(specList.get(i));
							break;
						}
					}
				}
				if (specItem != null) {
					result = specItem.getDeclarationValue1();
					dataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(groupCode, specItem.getDeclarationValue1());
					if (dataItem != null) {
						result = dataItem.getName();
					} else {
						//log.info("==getValueOfTechnicalSpecItemByDM==specItem=DeclarationValue==" + specItem.getDeclarationValue1() + "==Khong co trong DB");
					}
				} else {
					//log.info("==getValueOfTechnicalSpecItemByDM==specCode=" + specCode + "==Khong co trong message SpecificationList of ConfirmationStatusOfQuanlityConformity voi Group code==" + groupCode);
				}
			} else if (obj instanceof vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.SpecificationList.SpecItem) {
				vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.SpecificationList.SpecItem specItem = null;
				if (specCode != null && specCode.trim().length() > 0) {
					for (int i = 0; i < specList.size(); i++) {
						if (vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.SpecificationList.SpecItem.class.cast(specList.get(i)).getSpecificationCode().trim().equalsIgnoreCase(
							specCode.trim())) {
							specItem = vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.SpecificationList.SpecItem.class.cast(specList.get(i));
							break;
						}
					}
				}
				if (specItem != null) {
					result = specItem.getDeclarationValue1();
					dataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(groupCode, specItem.getDeclarationValue1());
					if (dataItem != null) {
						result = dataItem.getName();
					} else {
						//log.info("==getValueOfTechnicalSpecItemByDM==specItem== " + specCode + " ==DeclarationValue== " + specItem.getDeclarationValue1() + " ==Khong co Trong DB voi Group code== " + groupCode);
					}
				} else {
					//log.info("==getValueOfTechnicalSpecItemByDM==specCode=" + specCode + "==Khong co trong message SpecificationList of ConfirmCertificateEndorsement");
				}
			} else if (obj instanceof vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.SpecificationList.SpecItem) {
				vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.SpecificationList.SpecItem specItem = null;
				if (specCode != null && specCode.trim().length() > 0) {
					for (int i = 0; i < specList.size(); i++) {
						if (vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.SpecificationList.SpecItem.class.cast(specList.get(i)).getSpecificationCode().trim().equalsIgnoreCase(
							specCode.trim())) {
							specItem = vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.SpecificationList.SpecItem.class.cast(specList.get(i));
							break;
						}
					}
				}
				if (specItem != null) {
					result = specItem.getDeclarationValue1();
					dataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(groupCode, specItem.getDeclarationValue1());
					if (dataItem != null) {
						result = dataItem.getName();
					} else {
						//log.info("==getValueOfTechnicalSpecItemByDM==specItem== " + specCode + " ==DeclarationValue== " + specItem.getDeclarationValue1() + " ==Khong co Trong DB voi Group code== " + groupCode);
					}
				} else {
					//log.info("==getValueOfTechnicalSpecItemByDM==specCode=" + specCode + "==Khong co trong message SpecificationList of NoticeOfExemptionFromInspection");
				}
			} else if (obj instanceof vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.SpecificationList.SpecItem) {
				vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.SpecificationList.SpecItem specItem = null;
				if (specCode != null && specCode.trim().length() > 0) {
					for (int i = 0; i < specList.size(); i++) {
						if (vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.SpecificationList.SpecItem.class.cast(specList.get(i)).getSpecificationCode().trim().equalsIgnoreCase(
							specCode.trim())) {
							specItem = vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.SpecificationList.SpecItem.class.cast(specList.get(i));
							break;
						}
					}
				}
				if (specItem != null) {
					result = specItem.getDeclarationValue1();
					dataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(groupCode, specItem.getDeclarationValue1());
					if (dataItem != null) {
						result = dataItem.getName();
					} else {
						//	log.info("==getValueOfTechnicalSpecItemByDM==specItem== " + specCode + " ==DeclarationValue== " + specItem.getDeclarationValue1() + " ==Khong co Trong DB voi Group code== " + groupCode);
					}
				} else {
					//	log.info("==getValueOfTechnicalSpecItemByDM==specCode=" + specCode + "==Khong co trong message SpecificationList of VehicleInspectionRecord");
				}
			}
		}
		return result;
	}
	
	public static String getValueOfVehicleInspectionRecord(List<SpecItem> specList, String specCode, int type) {
		//vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.SpecificationList.SpecItem
		//type = 1 Gia tri khai bao
		//type = 2 Gia tri sua doi
		//type = 3 ket luan
		String result = "";
		String khongdat = DKConfigurationManager.getStrProp("khongdat", "KhÃ´ng \u0111\u1EA1t");
		String suadoi = DKConfigurationManager.getStrProp("suadoi", "S\u1EEDa \u0111\u1ED5i");
		if (specList != null) {
			for (SpecItem specItem : specList) {
				if ((specItem.getSpecificationCode().trim().equalsIgnoreCase(specCode.trim())) && (type == 1)) {
					result = specItem.getDeclarationValue1();
				} else if ((specItem.getSpecificationCode().trim().equalsIgnoreCase(specCode.trim())) && (type == 2)) {
					result = specItem.getDeclarationValue5();
				} else if ((specItem.getSpecificationCode().trim().equalsIgnoreCase(specCode.trim())) && (type == 3)) {
					result = specItem.getDeclarationValue6();
				}
			}
		}
		return result;
	}
	
	public static String getDataItemByDataGroupIdAndItemCode(int groupCode, String item) {
		DmDataItem dataItem = null;
		if (item != null && item.trim().length() > 0) {
			dataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(groupCode, item);
			if (dataItem != null) {
				return dataItem.getName();
			} else {
				return item;
			}
		}
		
		return "";
	}
	public static String getNhomPhuongTien(String item) {
		String nhomPhuongTien = "";
		DmDataItem dataItem = null;
		if (item != null && item.trim().length() > 0) {
			dataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.VEHICLE_TYPE, item);
			if (dataItem != null) {
				List<DmDataItem> dmNhomPhuongTien = DmDataItemLocalServiceUtil.findByDataGroupIdAndLevelAndAlterName(ReportConstant.VEHICLE_TYPE, 2, dataItem.getAlterName());
				if(dmNhomPhuongTien != null && dmNhomPhuongTien.size() >0){
					nhomPhuongTien = dmNhomPhuongTien.get(0).getName();
				}
			}
		}
		return nhomPhuongTien;
	}
	
	public static String getTemplateReportFilePath(HttpServletRequest request, String reportOrexport, String fileName) {
		
		return request.getSession().getServletContext().getRealPath("/").replace("/", File.separator).replace(File.separator + ".", "") +
			reportOrexport + File.separator + fileName;
		/**
		 * ResourceRequest
		 *
		 * return resourceRequest.getPortletSession().getPortletContext().getRealPath("/").
		 * replace("/", File.separator).replace(File.separator + ".", "") + File.separator + reportOrexport + File.separator + fileName;
		 * */
	}
	
	public static String getTemplateReportFilePath(PortletSession session) {
		
		/*
		 * 
		 * 
		 */
		//		ActionRequest actionRequest;
		//		actionRequest.getPortletSession();
		
		return session.getPortletContext().getRealPath("/").replace("/", File.separator).replace(File.separator + ".", "");
		/**
		 * ResourceRequest
		 *
		 * return resourceRequest.getPortletSession().getPortletContext().getRealPath("/").
		 * replace("/", File.separator).replace(File.separator + ".", "") + File.separator + reportOrexport + File.separator + fileName;
		 * */
	}
	
	public static String getTemplateReportFilePath(ResourceRequest request) {
		return request.getPortletSession().getPortletContext().getRealPath("/").replace("/", File.separator).replace(File.separator + ".", "");
		
	}
	
	public static String getTemplateReportFilePath(HttpServletRequest request) {
		
		return request.getSession().getServletContext().getRealPath("/").replace("/", File.separator).replace(File.separator + ".", "");
		/**
		 * ResourceRequest
		 *
		 * return resourceRequest.getPortletSession().getPortletContext().getRealPath("/").
		 * replace("/", File.separator).replace(File.separator + ".", "") + File.separator + reportOrexport + File.separator + fileName;
		 * */
	}
	
	/*
	 * Function Export to Server
	 * 
	 */
	public void exportFunction(String tenFile_Template, String tenFile_Export, JRDataSource dataSource, Map<String, Object> parameters) {
		
		try {
			String pathFileTemp = null;
			InputStream inputStream = new FileInputStream(pathFileTemp + tenFile_Template);
			JasperDesign jasperDesign = JRXmlLoader.load(inputStream);
			JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
			
			parameters.put("SUBREPORT_DIR", pathFileTemp);
			
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
			String pathFileSub = null;
			JasperExportManager.exportReportToPdfFile(jasperPrint, pathFileSub + tenFile_Export);
			log.debug("----- END EXPORT SERVER ---" + pathFileSub);
		} catch (Exception e) {
			log.error("---LOI EXPORT ---" + e);
			e.printStackTrace();
		}
	}
	
	/*
	 * Function Export to Server
	 */
	public static String exportFunction(
		String realPath, String dirParent, String tenFile_Template, String tenFile_Export, JRDataSource dataSource, Map<String, Object> parameters) {
		
		String tenFile = tenFile_Export;
		
		try {
			String pathTemplate = realPath + PATH_FILE_REPORT + File.separator + dirParent + File.separator + tenFile_Template;
			log.debug("====pathTemplate====" + pathTemplate);
			log.debug("====pathTemplate====" + pathTemplate);
			log.info("====pathTemplate====" + pathTemplate);
			InputStream inputStream = new FileInputStream(pathTemplate);
			
			JasperDesign jasperDesign = JRXmlLoader.load(inputStream);
			JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
			log.info("====SUBREPORT_DIR====" + (realPath + PATH_FILE_REPORT + File.separator + dirParent + File.separator));
			parameters.put("SUBREPORT_DIR", realPath + PATH_FILE_REPORT + File.separator + dirParent + File.separator);
			parameters.put("IMG_DIR", realPath + PATH_FILE_REPORT + File.separator + "img" + File.separator);
			log.info("====IMG_DIR====" + realPath + PATH_FILE_REPORT + File.separator + "img" + File.separator);
			
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
			String pathExport = realPath + PATH_FILE_EXPORT + File.separator + tenFile_Export;
			
			log.debug("====pathExport====" + pathExport);
			log.debug("====pathExport====" + pathExport);
			log.info("====pathExport====" + pathExport);
			JasperExportManager.exportReportToPdfFile(jasperPrint, pathExport);
//			makeWordReport(pathExport, jasperPrint);
			log.debug("----- END EXPORT SERVER ---" + pathExport);
		} catch (Exception e) {
			log.error("---LOI EXPORT Return FileName---");
			tenFile = ReportConstant.TEN_FILE_DEFAULT;
			log.error("---LOI EXPORT ---" + e);
			e.printStackTrace();
		}
		
		return tenFile;
	}
	
	public static void makeWordReport(String pdfFileName, JasperPrint jasperPrint) throws IOException {
		try {
			ByteArrayOutputStream baoxDoc = new ByteArrayOutputStream();
			JRDocxExporter exporterDoc = new JRDocxExporter();
			exporterDoc.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
			exporterDoc.setParameter(JRExporterParameter.OUTPUT_STREAM, baoxDoc);
			exporterDoc.exportReport();
			FileOutputStream outputfile = new FileOutputStream(pdfFileName.replace("pdf", "doc"));
			outputfile.write(baoxDoc.toByteArray());
			
		} catch (Exception jre) {
		}
		
	}
	
	public static void exportFunctionWithSubreport(
		HttpServletRequest request, String tenFile_Template, String subreportDir, String tenFile_Export, JRDataSource jrDataSource) {
		
		try {
			String pathTemplate = getTemplateReportFilePath(request, PATH_FILE_REPORT, tenFile_Template);
			//			log.debug("====pathTemplate====" + pathTemplate);
			InputStream inputStream = new FileInputStream(pathTemplate);
			
			JasperDesign jasperDesign = JRXmlLoader.load(inputStream);
			JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
			
			Map<String, Object> parameters = new HashMap<String, Object>();
			
			subreportDir = getTemplateReportFilePath(request, PATH_FILE_REPORT, subreportDir);
			parameters.put("SUBREPORT_DIR", subreportDir);
			
			//			log.debug("====subreportDir====" + subreportDir);
			
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, jrDataSource);
			String pathExport = getTemplateReportFilePath(request, PATH_FILE_EXPORT, tenFile_Export);
			
			//			log.debug("subreport dir: " + parameters.get("SUBREPORT_DIR"));
			//			log.debug("====pathExport====" + pathExport);
			
			JasperExportManager.exportReportToPdfFile(jasperPrint, pathExport);
			//			log.debug("----- END EXPORT SERVER ---" + pathExport);
		} catch (Exception e) {
			log.error("---LOI EXPORT ---" + e);
			e.printStackTrace();
		}
		
	}
	
	public static String getTenDmData(int groupCode, String code_data) {
		String result = code_data;
		//		log.debug("----------------code Data-------------" + code_data);
		DmDataItem dataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(groupCode, code_data);
		if (dataItem != null) {
			result = dataItem.getName();
		}
		//		log.debug("----------------Ten Data-------------" + result);
		return result;
		
	}
	
	public static String getTenDmDataByCode(String itemCode) {
		String result = itemCode;
		DmDataItem dataItem;
		try {
			//			log.debug("----------------code Data-------------" + result);
			dataItem = DmDataItemLocalServiceUtil.getDmDataItem(ConvertUtil.convertToLong(itemCode));
			if (dataItem != null) {
				result = dataItem.getName();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		log.debug("----------------Ten Data-------------" + result);
		return result;
	}
	
	public static String getTenDmDataByCode2(String itemCode) {
		String result = itemCode;
		DmDataItem dataItem;
		try {
			//			log.debug("----------------code Data-------------" + result);
			dataItem = DmDataItemLocalServiceUtil.getByDataGroupCodeNameAndDataItemCode0(DanhMucKey.TRADE_MARK, itemCode);
			if (dataItem != null) {
				result = dataItem.getName();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		log.debug("----------------Ten Data-------------" + result);
		return result;
	}
	
	/*
	 * 
	 * 
	 */
	public static String getUrlFileExport(PortletSession portletSession, String portalUrl, long vehicleRecordId) {
		String urlFile = "/" + portletSession.getPortletContext().getPortletContextName() + "/export/default.pdf";
		log.debug("-----VINH====getUrlFileExport===============vehicleRecordId==" + vehicleRecordId);
		
		if (vehicleRecordId > 0) {
			VehicleRecord vehicleRecord = null;
			try {
				vehicleRecord = VehicleRecordLocalServiceUtil.fetchVehicleRecord(vehicleRecordId);
				if (vehicleRecord != null) {
					log.debug("-----vehicleRecord=================" + vehicleRecord.getId());
					try {
						log.debug("-----vehicleRecord.getCertificateRecordId()=================" + vehicleRecord.getCertificateRecordId());
						
						TthcBieuMauHoSo tthcBieuMauHoSo = null;
						TthcNoidungHoSo tthcNoidungHoSo = null;
						
						if (vehicleRecord.getCertificateRecordId() > 0) {
							CertificateRecord certificateRecord = null;
							try {
								certificateRecord = CertificateRecordLocalServiceUtil.fetchCertificateRecord(vehicleRecord.getCertificateRecordId());
								if (certificateRecord != null && certificateRecord.getAttachedFile() > 0) {
									log.debug("-----certificateRecord=================" + certificateRecord.getId());
									tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(certificateRecord.getAttachedFile());
								}
							} catch (Exception e) {
								e.printStackTrace();
							}
							
						} else if (vehicleRecord.getDraftCertificateId() > 0) {
							DraftCertificate draftCertificate = null;
							try {
								draftCertificate = DraftCertificateLocalServiceUtil.fetchDraftCertificate(vehicleRecord.getDraftCertificateId());
								if (draftCertificate != null && draftCertificate.getAttachedFile() > 0) {
									log.debug("-----draftCertificate=================" + draftCertificate.getId());
									tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(draftCertificate.getAttachedFile());
									
								}
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
						
						if (tthcNoidungHoSo != null) {
							log.debug("-----tthcNoidungHoSo=================" + tthcNoidungHoSo.getId());
							tthcBieuMauHoSo = TthcBieuMauHoSoLocalServiceUtil.getTthcBieuMauHoSo(tthcNoidungHoSo.getBieuMauHoSoId());
							String tenFile_Export = tthcBieuMauHoSo.getMaBieuMau() + "_" + tthcNoidungHoSo.getId() + ".pdf";
							
							boolean checkExistFile =
								checkFilesInFolders(getTemplateReportFilePath(portletSession) + PATH_FILE_EXPORT, tenFile_Export);
							checkExistFile = false;
							log.debug("-----check Ton Tai File ===" + checkExistFile + "-----urlFile==" + urlFile);
							if (!checkExistFile) {
								urlFile = urlFileJasperExport(portletSession, tthcNoidungHoSo);
							} else {
								urlFile = "/" + portletSession.getPortletContext().getPortletContextName() + "/export/" + tenFile_Export;
							}
							
						}
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		log.debug("______KET THUC ---Return --urlFile=================" + urlFile);
		
		return urlFile;
		
	}
	
	public static String urlFileJasperExportByIdNDHS(PortletSession portletSession, long idNoidungHoSo) {
		//		log.info("==  sao ko vao urlFileJasperExportByIdNDHS=======");
		//		log.info("== *********** dada  idNoiDungHoSo=======: " + idNoidungHoSo);
		String fileName = "";
		String urlFile = "/" + portletSession.getPortletContext().getPortletContextName() + "/export/default.pdf";
		
		TthcNoidungHoSo tthcNoidungHoSo;
		try {
			tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(idNoidungHoSo);
			//			log.info("==  tthcNoidungHoSo=======: " + tthcNoidungHoSo.getHoSoThuTucId());
			if (tthcNoidungHoSo != null) {
				if (tthcNoidungHoSo.getTaiLieuDinhKem() > 0) {
					
					urlFile = DocumentUtils.getLinkDownloadFromNoiLuuTruTaiLieuId(tthcNoidungHoSo.getTaiLieuDinhKem());
					//					log.info("==  urlFile in dinhkem=======: " + urlFile);
				} else {
					String realPath = ReportUtils.getTemplateReportFilePath(portletSession);
					//					log.info("==  realPath=======: " + realPath);
					try {
						fileName = ReportBusinessUtils.actionExport(realPath, idNoidungHoSo);
					} catch (Exception e) {
						e.printStackTrace();
					}
					urlFile = "/" + portletSession.getPortletContext().getPortletContextName() + "/export/" + fileName;
				}
			}
		} catch (SystemException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		log.debug("== urlFile=======: " + urlFile);
		log.debug("== END EXPORT FILE------------===urlFileJasperExport=======");
		return urlFile;
	}
	
	public static String urlFileJasperExport(PortletSession portletSession, TthcNoidungHoSo tthcNoidungHoSo) {
		
		log.debug("== ACTION EXPORT------------===urlFileJasperExport=======");
		
		long idNoiDungHoSo = tthcNoidungHoSo.getId();
		
		String fileName = "";
		String urlFile = "";
		
		if (tthcNoidungHoSo != null) {
			if (tthcNoidungHoSo.getTaiLieuDinhKem() > 0) {
				urlFile = DocumentUtils.getLinkDownloadFromNoiLuuTruTaiLieuId(tthcNoidungHoSo.getTaiLieuDinhKem());
			} else {
				String realPath = ReportUtils.getTemplateReportFilePath(portletSession);
				try {
					fileName = ReportBusinessUtils.actionExport(realPath, idNoiDungHoSo);
				} catch (Exception e) {
					e.printStackTrace();
				}
				urlFile = "/" + portletSession.getPortletContext().getPortletContextName() + "/export/" + fileName;
			}
		}
		log.debug("== END EXPORT FILE------------===urlFileJasperExport=======");
		return urlFile;
	}
	
	private static boolean checkFilesInFolders(String directoryName, String fileName) {
		//		log.debug("===checkFilesInFolders=======");
		
		File directory = new File(directoryName);
		//get all the files from a directory
		File[] fList = directory.listFiles();
		
		for (File file : fList) {
			if (file.getName().trim().equalsIgnoreCase(fileName)) {
				log.debug("-----exist file===========" + fileName);
				return true;
			}
		}
		return false;
	}
	
	public static String getVehicleStatusName(String status) {
		//		log.debug("===checkFilesInFolders=======");
		String result = "";
		if (status.trim().compareToIgnoreCase(Constants.Vehicle_Engine_Status_0) == 0) {
			result = DKConfigurationManager.getStrProp("Vehicle-Engine-Status-0", status);
		} else if (status.trim().compareToIgnoreCase(Constants.Vehicle_Engine_Status_1) == 0) {
			result = DKConfigurationManager.getStrProp("Vehicle-Engine-Status-1", status);
		} else {
			result = DKConfigurationManager.getStrProp("Vehicle-Engine-Status-2", status);
		}
		return result;
	}
	
	public static String getVehicleCommonStatusName(long status) {
		String result = "";
		if (status == 0) {
			result = DKConfigurationManager.getStrProp("Vehicle-Common-Status-0", String.valueOf(status));
		} else if (status == 1) {
			result = DKConfigurationManager.getStrProp("Vehicle-Common-Status-1", String.valueOf(status));
		} else if (status == 2) {
			result = DKConfigurationManager.getStrProp("Vehicle-Common-Status-2", String.valueOf(status));
		} else if (status == 3) {
			result = DKConfigurationManager.getStrProp("Vehicle-Common-Status-3", String.valueOf(status));
		} else if (status == 4) {
			result = DKConfigurationManager.getStrProp("Vehicle-Common-Status-4", String.valueOf(status));
		}
		return result;
	}
	
	public static String getDKVChinh(List<InspectionAttendee> lstInspectionAttendees) {
		String result = "";
		if (lstInspectionAttendees != null && lstInspectionAttendees.size() > 0) {
			for (InspectionAttendee inspectionAttendee : lstInspectionAttendees) {
				if (inspectionAttendee.getAttendeeRole() == 1) {
					result = inspectionAttendee.getAttendeeName();
				}
			}
		}
		return result;
	}
	
	public static String getDKVPhu(List<InspectionAttendee> lstInspectionAttendees) {
		String result = "";
		if (lstInspectionAttendees != null && lstInspectionAttendees.size() > 0) {
			for (InspectionAttendee inspectionAttendee : lstInspectionAttendees) {
				if (inspectionAttendee.getAttendeeRole() == 2) {
					result = inspectionAttendee.getAttendeeName() + ", " + result;
				}
			}
		}
		return result;
	}
	
	public static String getCommonStatus(List<InspectionCommonStatus> lstInspectionCommonStatus, String commonCode) {
		String result = "";
		long isCheckCommonStatus = -1;
		if (lstInspectionCommonStatus != null && lstInspectionCommonStatus.size() > 0) {
			for (InspectionCommonStatus inspectionCommonStatus : lstInspectionCommonStatus) {
				if ((inspectionCommonStatus.getCOMMONRESULT().equalsIgnoreCase(commonCode)) && (inspectionCommonStatus.getTYPE() == 2)) {
					String commonStatus = String.valueOf(inspectionCommonStatus.getCOMMONSTATUS());
					DmDataItem dataItem =
						DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.SAFETY_TEST_RESULT, commonStatus);
					if (dataItem != null && dataItem.getName().trim().length() > 0) {
						result = dataItem.getName();
					}
				} else if ((inspectionCommonStatus.getCOMMONRESULT().equalsIgnoreCase(commonCode)) && (inspectionCommonStatus.getTYPE() == 4)) {
					String commonStatus = String.valueOf(inspectionCommonStatus.getCOMMONSTATUS());
					DmDataItem dataItem =
						DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.EMISSION_TEST_RESULT, commonStatus);
					if (dataItem != null && dataItem.getName().trim().length() > 0) {
						result = dataItem.getName();
					}
				} else if ((inspectionCommonStatus.getCOMMONRESULT().equalsIgnoreCase(commonCode)) && (inspectionCommonStatus.getTYPE() == 6)) {
					if (inspectionCommonStatus.getCOMMONRESULT().equalsIgnoreCase("CP_6_01")) {
						if (inspectionCommonStatus.getCOMMONSTATUS() == 1) {
							result = DKConfigurationManager.getStrProp("co", "Có");
							isCheckCommonStatus = 1;
						} else if (inspectionCommonStatus.getCOMMONSTATUS() == 0) {
							result = DKConfigurationManager.getStrProp("khong", "Không");
							isCheckCommonStatus = 0;
						}
					} else if (inspectionCommonStatus.getCOMMONRESULT().equalsIgnoreCase("CP_6_02")) {
						if(isCheckCommonStatus == 1){
							if (inspectionCommonStatus.getCOMMONSTATUS() == 1) {
								result = "<100 km";
							} else if (inspectionCommonStatus.getCOMMONSTATUS() == 2) {
								result = "100 - 200 km";
							} else if (inspectionCommonStatus.getCOMMONSTATUS() == 3) {
								result = "200 - 300 km";
							} else if (inspectionCommonStatus.getCOMMONSTATUS() == 4) {
								result = "Trên 300 km";
							}
						}
					} else if (inspectionCommonStatus.getCOMMONRESULT().equalsIgnoreCase("CP_6_03")) {
						if(isCheckCommonStatus == 0){
							if (inspectionCommonStatus.getCOMMONSTATUS() == 1) {
								result = DKConfigurationManager.getStrProp("xacnhantinhphighichu1", "Khách đón");
							} else if (inspectionCommonStatus.getCOMMONSTATUS() == 2) {
								result =
									DKConfigurationManager.getStrProp("xacnhantinhphighichu2", "Cùng địa điểm với lô hàng đã tính phí");
							}
						}
					} else if (inspectionCommonStatus.getCOMMONRESULT().equalsIgnoreCase("CP_6_04")) {
						result = inspectionCommonStatus.getITEMNAME();
					}
				} else if ((inspectionCommonStatus.getCOMMONRESULT().equalsIgnoreCase(commonCode)) && (inspectionCommonStatus.getTYPE() == 1)) {
					String commonStatus = String.valueOf(inspectionCommonStatus.getCOMMONSTATUS());
					DmDataItem dataItem =
						DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.EVALUATION_RESULT, commonStatus);
					if (dataItem != null && dataItem.getName().trim().length() > 0) {
						result = dataItem.getName();
					}
				}
			}
		}
		return result;
	}
	
	public static String getItemNameInInspectionCommonStatus(List<InspectionCommonStatus> lstInspectionCommonStatus, String commonCode) {
		String result = "";
		if (lstInspectionCommonStatus != null && lstInspectionCommonStatus.size() > 0) {
			for (InspectionCommonStatus inspectionCommonStatus : lstInspectionCommonStatus) {
				if ((inspectionCommonStatus.getCOMMONRESULT().equalsIgnoreCase(commonCode)) && (inspectionCommonStatus.getTYPE() == 1)) {
					result = inspectionCommonStatus.getITEMNAME();
				}
			}
		}
		return result;
	}
	public static String getValueConfirmedResult(int code0) {
		String result = "";
		if (code0 > 0) {
			DmDataItem dmDataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.CONFIRMED_RESULT, String.valueOf(code0));
			if(dmDataItem != null){
				result = dmDataItem.getName();
			}
		}
		return result;
	}
	public static String getImportedVehicle(List<ImportedVehicle> lstImportedVehicles, String commonCode) {
		String result = "";
		if (lstImportedVehicles != null && lstImportedVehicles.size() > 0) {
			for (ImportedVehicle importedVehicle : lstImportedVehicles) {
				if (importedVehicle.getMarkAsSampleVehicle().equalsIgnoreCase("1") && commonCode.equalsIgnoreCase("TTC_1_21")) {
					result = result + importedVehicle.getChassisNumberInitial() + "<br>";
//					result = result.substring(0, result.length() - 1);
				} else if (importedVehicle.getMarkAsSampleVehicle().equalsIgnoreCase("1") && commonCode.equalsIgnoreCase("TTC_1_22")) {
					result = result + importedVehicle.getChassisNumberInitial() + "<br>";
//					result = result.substring(0, result.length() - 1);
				} else if (importedVehicle.getMarkAsSampleVehicle().equalsIgnoreCase("1") && commonCode.equalsIgnoreCase("TTC_1_23")) {
					result = result + importedVehicle.getEngineNumberInitial() + "<br>";
//					result = result.substring(0, result.length() - 1);
				} else if (importedVehicle.getMarkAsSampleVehicle().equalsIgnoreCase("1") && commonCode.equalsIgnoreCase("TTC_1_24")) {
					result = result + getVehicleStatusName(String.valueOf(importedVehicle.getVehicleEngineStatusInitial())) + "<br>";
//					result = result.substring(0, result.length() - 1);
				} else if (importedVehicle.getMarkAsSampleVehicle().equalsIgnoreCase("1") && commonCode.equalsIgnoreCase("TTC_1_25")) {
					result = result + String.valueOf(importedVehicle.getProductionYearInitial()) + "<br>";
//					result = result.substring(0, result.length() - 1);
				} else if (importedVehicle.getMarkAsSampleVehicle().equalsIgnoreCase("1") && commonCode.equalsIgnoreCase("TTC_1_26")) {
					result = result + importedVehicle.getVehicleColorInitial() + "<br>";
//					result = result.substring(0, result.length() - 1);
				}
			}
		}
		return result;
	}
	public static String getImportedVehicleSuaDoi(List<ImportedVehicle> lstImportedVehicles, String commonCode) {
		String result = "";
		if (lstImportedVehicles != null && lstImportedVehicles.size() > 0) {
			for (ImportedVehicle importedVehicle : lstImportedVehicles) {
				if (importedVehicle.getMarkAsSampleVehicle().equalsIgnoreCase("1") && commonCode.equalsIgnoreCase("TTC_1_21")) {
					result = result + importedVehicle.getChassisNumber() + "<br>";
//					result = result.substring(0, result.length() - 1);
				} else if (importedVehicle.getMarkAsSampleVehicle().equalsIgnoreCase("1") && commonCode.equalsIgnoreCase("TTC_1_22")) {
					result = result + importedVehicle.getChassisNumber() + "<br>";
//					result = result.substring(0, result.length() - 1);
				} else if (importedVehicle.getMarkAsSampleVehicle().equalsIgnoreCase("1") && commonCode.equalsIgnoreCase("TTC_1_23")) {
					result = result + importedVehicle.getEngineNumber() + "<br>";
//					result = result.substring(0, result.length() - 1);
				} else if (importedVehicle.getMarkAsSampleVehicle().equalsIgnoreCase("1") && commonCode.equalsIgnoreCase("TTC_1_24")) {
					result = result + getVehicleStatusName(String.valueOf(importedVehicle.getVehicleEngineStatus())) + "<br>";
//					result = result.substring(0, result.length() - 1);
				} else if (importedVehicle.getMarkAsSampleVehicle().equalsIgnoreCase("1") && commonCode.equalsIgnoreCase("TTC_1_25")) {
					result = result + String.valueOf(importedVehicle.getProductionYear()) + "<br>";
//					result = result.substring(0, result.length() - 1);
				} else if (importedVehicle.getMarkAsSampleVehicle().equalsIgnoreCase("1") && commonCode.equalsIgnoreCase("TTC_1_26")) {
					result = result + importedVehicle.getVehicleColor() + "<br>";
//					result = result.substring(0, result.length() - 1);
				}
			}
		}
		return result;
	}
	
	public static String getNameForDataItem(String groupName, String code_0) {
		DmDataItem dmDataItem = null;
		try {
			dmDataItem = DmDataItemLocalServiceUtil.getByDataGroupCodeNameAndDataItemCode0(groupName, code_0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (dmDataItem != null) {
			code_0 = dmDataItem.getName();
		}
		return code_0;
	}
	
	public static boolean checkNameForDataItem(String groupName, String code_0) {
		boolean check = false;
		DmDataItem dmDataItem = null;
		try {
			dmDataItem = DmDataItemLocalServiceUtil.getByDataGroupCodeNameAndDataItemCode0(groupName, code_0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (dmDataItem != null) {
			check = true;
		}
		return check;
	}
	
	public static String getNameForVehicleSpecification(String specificationValue, String specificationCode, String vehicleClass) {
		List<DmDataItem> dmDataItems = null;
		try {
			dmDataItems = DmDataItemLocalServiceUtil.findBySpecificationCodeAndspecificationvalue(specificationCode, specificationValue, vehicleClass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (dmDataItems != null && dmDataItems.size() > 0) {
			return dmDataItems.get(0).getName().trim();
		} else {
			log.debug("Khong tim thay DM VehicleSpecification with specificationValue==" + specificationValue + "==specificationCode==" + specificationCode + "==vehicleClass=" + vehicleClass);
		}
		return specificationValue;
	}
	
}
