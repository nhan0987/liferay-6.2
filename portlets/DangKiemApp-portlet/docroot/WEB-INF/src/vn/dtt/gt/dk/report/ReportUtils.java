
package vn.dtt.gt.dk.report;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.PortletRequest;
import javax.portlet.PortletSession;
import javax.servlet.http.HttpServletRequest;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
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
import vn.dtt.gt.dk.utils.codec.FileKySoUtils;
import vn.dtt.gt.dk.utils.config.DKConfigurationManager;
import vn.dtt.gt.dk.utils.document.DocumentStorageImpl;
import vn.dtt.gt.dk.utils.document.DocumentUtils;
import vn.dtt.gt.dk.utils.format.Constants;
import vn.dtt.gt.dk.utils.format.ConvertUtil;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StreamUtil;
import com.liferay.portal.kernel.util.Validator;

public class ReportUtils {
	
	private static Log _log = LogFactoryUtil.getLog(ReportUtils.class);
	
	public static final String PATH_FILE_REPORT = "report";
	public static final String PATH_FILE_EXPORT = "export";
	
	public static final String BAN_DK_KIEM_TRA = "bandkkiemtra";
	public static final String BAN_DK_THAYDOI_TGDD = "bandkthaydoitgdd";
	public static final String BAN_KE_CHI_TIET = "bankechitiet";
	public static final String BAN_THONG_TIN_NK = "banthongtinnk";
	public static final String BIEN_BAN_KIEM_TRA = "bienbankiemtra";
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
						//_log.info("==getValueOfTechnicalSpecItemByDM==specItem== " + specCode + " ==DeclarationValue== " + specItem.getDeclarationValue1() + " ==Khong co Trong DB voi Group code== " + groupCode);
					}
				} else {
					//_log.info("==getValueOfTechnicalSpecItemByDM==specCode=" + specCode + "==Khong co trong message SpecificationList of TechnicalSpecification");
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
						//_log.info("==getValueOfTechnicalSpecItemByDM==specItem== " + specCode + " ==DeclarationValue== " + specItem.getDeclarationValue1() + " ==Khong co Trong DB voi Group code== " + groupCode);
					}
				} else {
					//_log.info("==getValueOfTechnicalSpecItemByDM==specCode=" + specCode + "==Khong co trong message SpecificationList of CertificateOfQuanlityConformity");
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
						//_log.info("==getValueOfTechnicalSpecItemByDM==specItem=DeclarationValue==" + specItem.getDeclarationValue1() + "==Khong co trong DB");
					}
				} else {
					//_log.info("==getValueOfTechnicalSpecItemByDM==specCode=" + specCode + "==Khong co trong message SpecificationList of ConfirmationStatusOfQuanlityConformity voi Group code==" + groupCode);
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
						//_log.info("==getValueOfTechnicalSpecItemByDM==specItem== " + specCode + " ==DeclarationValue== " + specItem.getDeclarationValue1() + " ==Khong co Trong DB voi Group code== " + groupCode);
					}
				} else {
					//_log.info("==getValueOfTechnicalSpecItemByDM==specCode=" + specCode + "==Khong co trong message SpecificationList of ConfirmCertificateEndorsement");
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
						//_log.info("==getValueOfTechnicalSpecItemByDM==specItem== " + specCode + " ==DeclarationValue== " + specItem.getDeclarationValue1() + " ==Khong co Trong DB voi Group code== " + groupCode);
					}
				} else {
					//_log.info("==getValueOfTechnicalSpecItemByDM==specCode=" + specCode + "==Khong co trong message SpecificationList of NoticeOfExemptionFromInspection");
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
						//	_log.info("==getValueOfTechnicalSpecItemByDM==specItem== " + specCode + " ==DeclarationValue== " + specItem.getDeclarationValue1() + " ==Khong co Trong DB voi Group code== " + groupCode);
					}
				} else {
					//	_log.info("==getValueOfTechnicalSpecItemByDM==specCode=" + specCode + "==Khong co trong message SpecificationList of VehicleInspectionRecord");
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
				DmDataItem dmNhomPhuongTien = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.VEHICLE_TYPE, dataItem.getAlterName());
				if(dmNhomPhuongTien != null){
					nhomPhuongTien = dmNhomPhuongTien.getName();
				}
			}
		}
		return nhomPhuongTien;
	}
	
	public static String getTemplateReportFilePath(HttpServletRequest request, String reportOrexport, String fileName) {
		
		String realPath = request.getSession().getServletContext().getRealPath("/").replace("/", File.separator).replace(File.separator + ".", "");
		
		StringBuilder sb = new StringBuilder();
		sb.append(realPath);
		sb.append(reportOrexport);
		sb.append(File.separator);
		sb.append(fileName);
		
		return sb.toString();
	}
	
	public static String getTemplateReportFilePath(PortletSession session) {
		return session.getPortletContext().getRealPath("/").replace("/", File.separator).replace(File.separator + ".", "");
	}
	
	public static String getTemplateReportFilePath(PortletRequest portletRequest) {
		return getTemplateReportFilePath(portletRequest.getPortletSession());
		
	}
	
	public static String getTemplateReportFilePath(HttpServletRequest request) {
		
		return request.getSession().getServletContext().getRealPath("/").replace("/", File.separator).replace(File.separator + ".", "");
	}
	
	/*
	 * Function Export to Server
	 */
	public static String exportFunction(
		String realPath, String dirParent, String tenFile_Template, String tenFile_Export, JRDataSource dataSource, Map<String, Object> parameters) {
		
		String tenFile = tenFile_Export;
		
		InputStream inputStream = null;
		
		try {
			StringBuilder sbReportPath = new StringBuilder(3);
			sbReportPath.append(realPath);
			sbReportPath.append(PATH_FILE_REPORT);
			sbReportPath.append(File.separator);
			
			StringBuilder sbPathTemplate = new StringBuilder(4);
			sbPathTemplate.append(sbReportPath.toString());
			sbPathTemplate.append(dirParent);
			sbPathTemplate.append(File.separator);
			sbPathTemplate.append(tenFile_Template);
			
			String pathTemplate = sbPathTemplate.toString();
			
			_log.info("====pathTemplate====" + pathTemplate);
			inputStream = new FileInputStream(pathTemplate);
			
			JasperDesign jasperDesign = JRXmlLoader.load(inputStream);
			JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
			
			StringBuilder subReportDir = new StringBuilder(3);
			subReportDir.append(sbReportPath.toString());
			subReportDir.append(dirParent);
			subReportDir.append(File.separator);
			
			StringBuilder imgDir = new StringBuilder(3);
			imgDir.append(sbReportPath.toString());
			imgDir.append("img");
			imgDir.append(File.separator);
			
			parameters.put("SUBREPORT_DIR", subReportDir.toString());
			parameters.put("IMG_DIR", imgDir.toString());
			
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
			
			StringBuilder sbPathExport = new StringBuilder(4);
			sbPathExport.append(realPath);
			sbPathExport.append(PATH_FILE_EXPORT);
			sbPathExport.append(File.separator);
			sbPathExport.append(tenFile);
			
			String pathExport = sbPathExport.toString();
			
			_log.info("====pathExport====" + pathExport);
			JasperExportManager.exportReportToPdfFile(jasperPrint, pathExport);
			_log.info("====END EXPORT SERVER====");
		} catch (Exception e) {
			tenFile = ReportConstant.TEN_FILE_DEFAULT;
			_log.error(e);
		} finally {
			StreamUtil.cleanUp(inputStream);
		}
		
		return tenFile;
	}
	
	public static void exportFunctionWithSubreport(
		HttpServletRequest request, String tenFile_Template, String subreportDir, String tenFile_Export, JRDataSource jrDataSource) {
		
		InputStream inputStream = null;
		
		try {
			String pathTemplate = getTemplateReportFilePath(request, PATH_FILE_REPORT, tenFile_Template);
			
			inputStream = new FileInputStream(pathTemplate);
			
			JasperDesign jasperDesign = JRXmlLoader.load(inputStream);
			JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
			
			Map<String, Object> parameters = new HashMap<String, Object>();
			
			subreportDir = getTemplateReportFilePath(request, PATH_FILE_REPORT, subreportDir);
			parameters.put("SUBREPORT_DIR", subreportDir);
			
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, jrDataSource);
			
			String pathExport = getTemplateReportFilePath(request, PATH_FILE_EXPORT, tenFile_Export);
			
			JasperExportManager.exportReportToPdfFile(jasperPrint, pathExport);
		} catch (Exception e) {
			_log.error(e);
		} finally {
			StreamUtil.cleanUp(inputStream);
		}
		
	}
	
	public static String getTenDmData(int groupCode, String code_data) {
		String result = code_data;
		DmDataItem dataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(groupCode, code_data);
		if (dataItem != null) {
			result = dataItem.getName();
		}
		return result;
		
	}
	
	public static String getTenDmDataByCode(String itemCode) {
		String result = itemCode;
		DmDataItem dataItem;
		try {
			dataItem = DmDataItemLocalServiceUtil.getDmDataItem(ConvertUtil.convertToLong(itemCode));
			if (dataItem != null) {
				result = dataItem.getName();
			}
		} catch (Exception e) {
			_log.error(e);
		}
		
		return result;
	}
	
	public static String getTenDmDataByCode2(String itemCode) {
		String result = itemCode;
		DmDataItem dataItem;
		try {
			dataItem = DmDataItemLocalServiceUtil.getByDataGroupCodeNameAndDataItemCode0(DanhMucKey.TRADE_MARK, itemCode);
			if (dataItem != null) {
				result = dataItem.getName();
			}
			
		} catch (Exception e) {
			_log.error(e);
		}
		
		return result;
	}
	
	public static String getUrlFileExport(PortletSession portletSession, String portalUrl, long vehicleRecordId) {
		_log.info("===getUrlFileExport===");
		
		String urlFile = "/" + portletSession.getPortletContext().getPortletContextName() + "/export/default.pdf";
		
		try {
			if (vehicleRecordId > 0) {
				TthcNoidungHoSo noidungHoSo = TthcNoidungHoSoLocalServiceUtil.findByVehicleRecordId(vehicleRecordId);
				
				if(noidungHoSo == null) {
					VehicleRecord vehicleRecord = VehicleRecordLocalServiceUtil.fetchVehicleRecord(vehicleRecordId);
					
					if (vehicleRecord != null) {
						_log.info("-----vehicleRecord=================" + vehicleRecord.getId());
						_log.info("-----vehicleRecord.getCertificateRecordId()=================" + vehicleRecord.getCertificateRecordId());
						
						if (vehicleRecord.getCertificateRecordId() > 0) {
							CertificateRecord certificateRecord = CertificateRecordLocalServiceUtil.fetchCertificateRecord(vehicleRecord.getCertificateRecordId());
							if (certificateRecord != null && certificateRecord.getAttachedFile() > 0) {
								_log.info("-----certificateRecord=================" + certificateRecord.getId());
								noidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(certificateRecord.getAttachedFile());
							}
							
						} else if (vehicleRecord.getDraftCertificateId() > 0) {
							DraftCertificate draftCertificate = DraftCertificateLocalServiceUtil.fetchDraftCertificate(vehicleRecord.getDraftCertificateId());
							if (draftCertificate != null && draftCertificate.getAttachedFile() > 0) {
								_log.info("-----draftCertificate=================" + draftCertificate.getId());
								noidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(draftCertificate.getAttachedFile());
								
							}
						}
					}
				}
				
				urlFile = urlFileJasperExport(portletSession, noidungHoSo);
			}
		} catch (Exception e) {
			_log.error(e);
		}
		
		return urlFile;
		
	}
	public static long getUrlFile(long vehicleRecordId, long checkDongDau) {
		_log.info("===getUrlFile===");
		
		if (vehicleRecordId > 0) {
			VehicleRecord vehicleRecord = null;
			try {
				vehicleRecord = VehicleRecordLocalServiceUtil.fetchVehicleRecord(vehicleRecordId);
				if (vehicleRecord != null) {
					_log.info("-----vehicleRecord=================" + vehicleRecord.getId());
						
					TthcNoidungHoSo tthcNoidungHoSo = null;
					long check=0;
					if (vehicleRecord.getCertificateRecordId() > 0) {
						CertificateRecord certificateRecord = null;
						try {
							certificateRecord = CertificateRecordLocalServiceUtil.fetchCertificateRecord(vehicleRecord.getCertificateRecordId());								
							check=certificateRecord.getStampStatus();
							if (certificateRecord != null && certificateRecord.getAttachedFile() > 0) {
								_log.info("-----certificateRecord=================" + certificateRecord.getId());
								tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(certificateRecord.getAttachedFile());
							}
						} catch (Exception e) {
							_log.error(e);
						}
						
					} else if (vehicleRecord.getDraftCertificateId() > 0) {
						DraftCertificate draftCertificate = DraftCertificateLocalServiceUtil.fetchDraftCertificate(vehicleRecord.getDraftCertificateId());
						
						if (draftCertificate != null && draftCertificate.getAttachedFile() > 0) {
							_log.info("-----draftCertificate=================" + draftCertificate.getId());
							tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(draftCertificate.getAttachedFile());
							
						}
					}
					if(checkDongDau==0){
						if(check!=0&&check!=8) return Constants.DA_KY;
					}
					
					if (tthcNoidungHoSo != null) {
						return tthcNoidungHoSo.getTaiLieuDinhKem();
					}
				}
			} catch (Exception e) {
				_log.error(e);
			}
		}
		
		return 0;
		
	}
	
	public static String urlFileJasperExportByIdNDHS(PortletSession portletSession, long idNoidungHoSo) {
		
		TthcNoidungHoSo tthcNoidungHoSo = null;
		
		try {
			tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(idNoidungHoSo);
		} catch(SystemException e) {
			_log.error(e);
		}
		
		return urlFileJasperExport(portletSession, tthcNoidungHoSo);
	}
	
	public static String urlFileJasperExport(HttpServletRequest request, long idNoidungHoSo) {
		
		TthcNoidungHoSo tthcNoidungHoSo = null;
		
		try {
			tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(idNoidungHoSo);
		} catch(SystemException e) {
			_log.error(e);
		}
		
		return urlFileJasperExport(request, tthcNoidungHoSo);
	}
	
	public static String urlFileJasperExport(PortletSession portletSession, TthcNoidungHoSo noidungHoSo) {
		
		String portletContextPath = "/" + portletSession.getPortletContext().getPortletContextName();
		String realPath = getTemplateReportFilePath(portletSession);
		
		return urlFileJasperExport(portletContextPath, realPath, noidungHoSo);
	}
	
	public static String urlFileJasperExport(PortletRequest portletRequest, TthcNoidungHoSo noidungHoSo) {
		
		return urlFileJasperExport(portletRequest.getPortletSession(), noidungHoSo);
	}
	
	public static String urlFileJasperExport(HttpServletRequest request, TthcNoidungHoSo noidungHoSo) {
		
		String portletContextPath = request.getContextPath();
		String realPath = getTemplateReportFilePath(request);
		
		return urlFileJasperExport(portletContextPath, realPath, noidungHoSo);
	}
	
	/**
	 * portletContextPath = /DangKiemApp-portlet
	 * realPath = /opt/..../DangKiemApp-portlet.war
	 * 
	 * @param portletContextPath
	 * @param realPath
	 * @param tthcNoidungHoSo
	 * @return
	 */
	public static String urlFileJasperExport(String portletContextPath, String realPath, TthcNoidungHoSo tthcNoidungHoSo) {
		
		String urlFile = portletContextPath + "/export/default.pdf";
		
		if (tthcNoidungHoSo != null) {
			long idNoiDungHoSo = tthcNoidungHoSo.getId();
			
			try {
				// neu ho so da co file dinh kem khi lay file tu thu muc document of Liferay
				if (tthcNoidungHoSo.getTaiLieuDinhKem() > 0) {
					urlFile = DocumentUtils.getLinkDownloadFromNoiLuuTruTaiLieuId(tthcNoidungHoSo.getTaiLieuDinhKem());
				} else {
					TthcBieuMauHoSo tthcBieuMauHoSo = TthcBieuMauHoSoLocalServiceUtil.getTthcBieuMauHoSo(tthcNoidungHoSo.getBieuMauHoSoId());
					
					String tenFile_Export = tthcBieuMauHoSo.getMaBieuMau() + "_" + tthcNoidungHoSo.getId() + ".pdf";
					
					boolean checkExistFile = checkFilesInFolders(realPath + PATH_FILE_EXPORT, tenFile_Export);
					
					_log.info("===checkExistFile===" + tenFile_Export + "===" + checkExistFile);
					
					if(!checkExistFile) {
						tenFile_Export = ReportBusinessUtils.actionExport(realPath, idNoiDungHoSo);
					}
					
					urlFile = portletContextPath + "/export/" + tenFile_Export;
				}
				
			} catch (Exception e) {
				_log.error(e);
			}
		}
		
		_log.info("===urlFileJasperExport===" + urlFile);
		
		return urlFile;
	}
	
	/**
	 *
	 * Tao filePdf luon khi tao noi dung ho so
	 * 
	 * @param noidungHoSo
	 */
	public static void makePdfByNoiDungHoSo(TthcNoidungHoSo noidungHoSo) {
		//TODO: huymq performance
		
		if(noidungHoSo != null && Validator.isNotNull(noidungHoSo.getNoiDungXml())) {
			try {
				String realPath = ReportUtils.class.getResource("").getPath();
				realPath = realPath.substring(0, realPath.indexOf("WEB-INF"));
				
				String fileNameExport = ReportBusinessUtils.actionExport(realPath, noidungHoSo);
				
				if(!fileNameExport.equalsIgnoreCase(ReportBusinessUtils.FILE_NAME_NULL)) {
				
					StringBuilder sbPathExport = new StringBuilder(4);
					sbPathExport.append(realPath);
					sbPathExport.append(PATH_FILE_EXPORT);
					sbPathExport.append(File.separator);
					sbPathExport.append(fileNameExport);
					
					// Upload file da sinh len document media
					long userSystem = DKConfigurationManager.getLongProp("DK-system-use-upload_file_system");
					long noiLuuTruTaiLieuId = FileKySoUtils.uploadUrlFile(sbPathExport.toString(), userSystem, null);
					noidungHoSo.setTaiLieuDinhKem(noiLuuTruTaiLieuId);	// taiLieuDinhKemId luu tru pdf tuong ung voi noi dung xml
					
					// luu noidungxml ra document media
					long noiDungXmlId = DocumentUtils.uploadFileText(noidungHoSo.getNoiDungXml(), 
						DocumentStorageImpl.FOLDER_UPLOAD_NOIDUNG_XML, null);
					noidungHoSo.setNoiDungFile(String.valueOf(noiDungXmlId));
				}
				
			} catch(Exception e) {
				_log.error(e);
			}
		}
	}
	
	private static boolean checkFilesInFolders(String directoryName, String fileName) {
		File file = new File(directoryName + fileName);
		
		return file.exists();
	}
	
	public static String getVehicleStatusName(String status) {
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
			_log.error(e);
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
			_log.error(e);
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
			_log.error(e);
		}
		if (dmDataItems != null && dmDataItems.size() > 0) {
			return dmDataItems.get(0).getName().trim();
		} else {
			_log.debug("Khong tim thay DM VehicleSpecification with specificationValue==" + specificationValue + "==specificationCode==" + specificationCode + "==vehicleClass=" + vehicleClass);
		}
		return specificationValue;
	}
}
