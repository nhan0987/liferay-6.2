
package vn.dtt.gt.dk.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.portlet.ResourceRequest;
import javax.servlet.http.HttpServletRequest;

import vn.dtt.gt.dk.dao.common.model.DmDataItem;
import vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu;
import vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra;
import vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry;
import vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionLocalServiceUtil;
import vn.dtt.gt.dk.report.ReportBusinessUtils;
import vn.dtt.gt.dk.report.ReportConstant;
import vn.dtt.gt.dk.report.ReportUtils;
import vn.dtt.gt.dk.utils.format.ConvertUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class CollectionUtils {
	
	private static Log _log = LogFactoryUtil.getLog(CollectionUtils.class);
	
	public static <T> String listToString(List<T> list) {
		StringBuilder builder = new StringBuilder();
		boolean firstCheck = true;
		for (T s : list) {
			if (firstCheck) {
				builder.append(s);
				firstCheck = false;
			} else {
				builder.append(",");
				builder.append(s);
			}
		}
		return builder.toString();
	}
	
	public static String listProductionCountryToString(List<ProductionCountry> list) {
		StringBuilder builder = new StringBuilder();
		boolean firstCheck = true;
		DmDataItem dataItemState = null;
		for (ProductionCountry item : list) {
			dataItemState = DmDataItemLocalServiceUtil.getByDataGroupCodeNameAndDataItemCode0(DanhMucKey.State, item.getCountryCode().trim());
			if (dataItemState != null) {
				if (firstCheck) {
					builder.append(dataItemState.getName());
					firstCheck = false;
				} else {
					builder.append(",");
					builder.append(dataItemState.getName());
				}
			}
		}
		return builder.toString();
	}
	
	
	
	public static <T> String productCountryToString(T obj) {
		StringBuilder builder = new StringBuilder();
		DmDataItem dataItem = null;
		if (obj instanceof vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.GeneralInfo.ProductionCountry) {
			vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.GeneralInfo.ProductionCountry productCountry = vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.GeneralInfo.ProductionCountry.class.cast(obj);
			List<String> allStr = productCountry.getCountryCode();
			boolean firstCheck = true;
			for (String string : allStr) {
				dataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.STATE, string);
				if (dataItem != null) {
					if (firstCheck) {
						builder.append(dataItem.getName());
						firstCheck = false;
					} else {
						builder.append(",");
						builder.append(dataItem.getName());
					}
				} else {
					_log.info("VehicleInspectionRecord.ProductionCountry==" + string + " khong ton tai trong db STATE");
				}
			}
		} else if (obj instanceof vn.dtt.gt.dk.nsw.model.InquiryImportedVehicleReference.CertificateDetails.ProductionCountry) {
			vn.dtt.gt.dk.nsw.model.InquiryImportedVehicleReference.CertificateDetails.ProductionCountry productCountry = vn.dtt.gt.dk.nsw.model.InquiryImportedVehicleReference.CertificateDetails.ProductionCountry.class.cast(obj);
			List<String> allStr = productCountry.getCountryCode();
			boolean firstCheck = true;
			for (String string : allStr) {
				dataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.STATE, string);
				if (dataItem != null) {
					if (firstCheck) {
						builder.append(dataItem.getName());
						firstCheck = false;
					} else {
						builder.append(",");
						builder.append(dataItem.getName());
					}
				} else {
					_log.info("InquiryImportedVehicleReference.ProductionCountry==" + string + " khong ton tai trong db STATE");
				}
			}
		} else if (obj instanceof vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.ProductionCountry) {
			vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.ProductionCountry productCountry = vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.ProductionCountry.class.cast(obj);
			List<String> allStr = productCountry.getCountryCode();
			boolean firstCheck = true;
			for (String string : allStr) {
				dataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.STATE, string);
				if (dataItem != null) {
					if (firstCheck) {
						builder.append(dataItem.getName());
						firstCheck = false;
					} else {
						builder.append(",");
						builder.append(dataItem.getName());
					}
				} else {
					_log.info("ConfirmCertificateEndorsement.ProductionCountry==" + string + " khong ton tai trong db STATE");
				}
			}
		} else if (obj instanceof vn.dtt.gt.dk.nsw.model.TechnicalSpecification.GeneralInfo.ProductionCountry) {
			vn.dtt.gt.dk.nsw.model.TechnicalSpecification.GeneralInfo.ProductionCountry productCountry = vn.dtt.gt.dk.nsw.model.TechnicalSpecification.GeneralInfo.ProductionCountry.class.cast(obj);
			List<String> allStr = productCountry.getCountryCode();
			boolean firstCheck = true;
			for (String string : allStr) {
				dataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.STATE, string);
				if (dataItem != null) {
					if (firstCheck) {
						builder.append(dataItem.getName());
						firstCheck = false;
					} else {
						builder.append(",");
						builder.append(dataItem.getName());
					}
				} else {
					_log.info("TechnicalSpecification.ProductionCountry==" + string + " khong ton tai trong db STATE");
				}
			}
		} else if (obj instanceof vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.ProductionCountry) {
			vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.ProductionCountry productCountry = vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.ProductionCountry.class.cast(obj);
			List<String> allStr = productCountry.getCountryCode();
			boolean firstCheck = true;
			for (String string : allStr) {
				dataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.STATE, string);
				if (dataItem != null) {
					if (firstCheck) {
						builder.append(dataItem.getName());
						firstCheck = false;
					} else {
						builder.append(",");
						builder.append(dataItem.getName());
					}
				} else {
					_log.info("CertificateOfQuanlityConformity.ProductionCountry==" + string + " khong ton tai trong db STATE");
				}
			}
		} else if (obj instanceof vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.ProductionCountry) {
			vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.ProductionCountry productCountry = vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.ProductionCountry.class.cast(obj);
			List<String> allStr = productCountry.getCountryCode();
			boolean firstCheck = true;
			for (String string : allStr) {
				dataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.STATE, string);
				if (dataItem != null) {
					if (firstCheck) {
						builder.append(dataItem.getName());
						firstCheck = false;
					} else {
						builder.append(",");
						builder.append(dataItem.getName());
					}
				} else {
					_log.info("NoticeOfNonConformity.ProductionCountry==" + string + " khong ton tai trong db STATE");
				}
			}
		} else if (obj instanceof vn.dtt.gt.dk.nsw.model.NoticeOfViolation.ProductionCountry) {
			vn.dtt.gt.dk.nsw.model.NoticeOfViolation.ProductionCountry productCountry = vn.dtt.gt.dk.nsw.model.NoticeOfViolation.ProductionCountry.class.cast(obj);
			List<String> allStr = productCountry.getCountryCode();
			boolean firstCheck = true;
			for (String string : allStr) {
				dataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.STATE, string);
				if (dataItem != null) {
					if (firstCheck) {
						builder.append(dataItem.getName());
						firstCheck = false;
					} else {
						builder.append(",");
						builder.append(dataItem.getName());
					}
				} else {
					_log.info("NoticeOfViolation.ProductionCountry==" + string + " khong ton tai trong db STATE");
				}
			}
		} else if (obj instanceof vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.ProductionCountry) {
			vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.ProductionCountry productCountry = vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.ProductionCountry.class.cast(obj);
			List<String> allStr = productCountry.getCountryCode();
			boolean firstCheck = true;
			for (String string : allStr) {
				dataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.STATE, string);
				if (dataItem != null) {
					if (firstCheck) {
						builder.append(dataItem.getName());
						firstCheck = false;
					} else {
						builder.append(",");
						builder.append(dataItem.getName());
					}
				} else {
					_log.info("ConfirmationStatusOfQuanlityConformity.ProductionCountry==" + string + " khong ton tai trong db STATE");
				}
			}
		} else if (obj instanceof vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.ProductionCountry) {
			vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.ProductionCountry productCountry = vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.ProductionCountry.class.cast(obj);
			List<String> allStr = productCountry.getCountryCode();
			boolean firstCheck = true;
			for (String string : allStr) {
				dataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.STATE, string);
				if (dataItem != null) {
					if (firstCheck) {
						builder.append(dataItem.getName());
						firstCheck = false;
					} else {
						builder.append(",");
						builder.append(dataItem.getName());
					}
				} else {
					_log.info("NoticeOfExemptionFromInspection.ProductionCountry==" + string + " khong ton tai trong db STATE");
				}
			}
		}
		
		return builder.toString();
	}
	
	public static List<String> stringOfListToList(String s) {
		if (s == null) { return new ArrayList<String>(); }
		return Arrays.asList(s.split("\\s*,\\s*"));
	}
	
	public static String getListIDPhieuXuLyPhu(List<MotCuaPhieuXuLyPhu> lstMotCuaPhieuXuLyPhus){
		String lstId = "";
		if(lstMotCuaPhieuXuLyPhus != null && lstMotCuaPhieuXuLyPhus.size() >0){
			for(MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu : lstMotCuaPhieuXuLyPhus){
				lstId = lstId + motCuaPhieuXuLyPhu.getId() + ",";
			}
		}
		
		return lstId;
	}
	public static String getListIdBienBanKiemTra(List<MotCuaPhieuXuLyPhu> lstMotCuaPhieuXuLyPhus){
		String lstId = "";
		if(lstMotCuaPhieuXuLyPhus != null && lstMotCuaPhieuXuLyPhus.size() >0){
			for(MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu : lstMotCuaPhieuXuLyPhus){
				ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil.findByPhieuXuLyPhuId(motCuaPhieuXuLyPhu.getId());
				if(confirmedInspection != null){
					lstId = lstId + confirmedInspection.getId() + ",";
				}
			}
		}
		
		return lstId;
	}
	public static String getListIdBienBanKiemTra2(List<PhanCongDonViKiemTra> lstMotCuaPhieuXuLyPhus){
		String lstId = "";
		if(lstMotCuaPhieuXuLyPhus != null && lstMotCuaPhieuXuLyPhus.size() >0){
			for(PhanCongDonViKiemTra lichKiemTra : lstMotCuaPhieuXuLyPhus){
				
				//ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil.findByPhieuXuLyPhuId(motCuaPhieuXuLyPhu.getId());
				if(lichKiemTra != null){
					lstId = lstId + lichKiemTra.getConfirmedinspectionId() + ",";
				}
			}
		}
		
		return lstId;
	}
	public static String getListIDConfirmedInspection(String lstIdPhieuXuLyPhu){
		String lstId = "";
		if(lstIdPhieuXuLyPhu != null && lstIdPhieuXuLyPhu.trim().length() >0){
			String [] allIdPhieuXuLyPhus = lstIdPhieuXuLyPhu.split(",");
			for(int i = 0; i < allIdPhieuXuLyPhus.length ; i ++){
				ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil.findByPhieuXuLyPhuId(ConvertUtil.convertToLong(allIdPhieuXuLyPhus[i]));
				if(confirmedInspection != null){
					lstId = lstId + confirmedInspection.getId() + ",";
				}
			}
		}
		
		return lstId;
	}
	
	public static String getStringUrlFile(HttpServletRequest request, long idNoiDungHoSo){
		/*String urlFile = "";
		if(idNoiDungHoSo > 0){
			TthcNoidungHoSo tthcNoidungHoSo = null;
			try {
				tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(idNoiDungHoSo);
			} catch (SystemException e) {
				_log.error(e);
			}
			String tenFileExport = "defaultPDF.pdfs";
			String fileName = "";
			if(tthcNoidungHoSo != null){
				if(tthcNoidungHoSo.getTaiLieuDinhKem() > 0){
					urlFile = DocumentUtils.getLinkDownloadFromNoiLuuTruTaiLieuId(tthcNoidungHoSo.getTaiLieuDinhKem());
				} else{
					String realPath=ReportUtils.getTemplateReportFilePath(request);
					try {
						fileName = ReportBusinessUtils.actionExport(realPath, idNoiDungHoSo);
					} catch (Exception e) {
						_log.error(e);
					}
					
					if (fileName.equalsIgnoreCase(ReportBusinessUtils.FILE_NAME_NULL) == false) {
						tenFileExport = fileName;
					}
					
					urlFile = request.getContextPath() + "/export/" + tenFileExport;
				}
			}
		}*/
		return ReportUtils.urlFileJasperExport(request, idNoiDungHoSo);
	}
	public static String getStringUrlFileBienBanGhiNhanKetQuaKiemTra(HttpServletRequest request, long userId, String confirmedInspectionId, String lstVehicleGroupId){
		String urlFile = "";
		if(confirmedInspectionId != null && confirmedInspectionId.trim().length() > 0 && lstVehicleGroupId != null && lstVehicleGroupId.trim().length() > 0){
			String tenFileExport = "defaultPDF.pdfs";
			String fileName = "";
			
					String realPath=ReportUtils.getTemplateReportFilePath(request);
					try {
						fileName = ReportBusinessUtils.actionExportBienBanGhiNhanKetQuaKiemTra(realPath, userId, confirmedInspectionId, lstVehicleGroupId);
					} catch (Exception e) {
						_log.error(e);
					}
					
					if (fileName.equalsIgnoreCase(ReportBusinessUtils.FILE_NAME_NULL) == false) {
						tenFileExport = fileName;
					}
					
					urlFile = request.getContextPath() + "/pdf.js/web/viewer.html?file=" + request.getContextPath() + "/export/" + tenFileExport;
				}
		return urlFile;
	}
	public static String getStringUrlFileBienBanGhiNhanKetQuaKiemTraList(HttpServletRequest request, String lstConfirmedInspectionId){
		String urlFile = "";
		if(lstConfirmedInspectionId != null && lstConfirmedInspectionId.trim().length() > 0){
			String tenFileExport = "defaultPDF.pdfs";
			String fileName = "";
			
					String realPath=ReportUtils.getTemplateReportFilePath(request);
					try {
						fileName = ReportBusinessUtils.actionExportBienBanGhiNhanKetQuaKiemTraList(realPath, lstConfirmedInspectionId);
					} catch (Exception e) {
						_log.error(e);
					}
					
					if (fileName.equalsIgnoreCase(ReportBusinessUtils.FILE_NAME_NULL) == false) {
						tenFileExport = fileName;
					}
					
					urlFile = request.getContextPath() + "/export/" + tenFileExport;
				}
		return urlFile;
	}
	public static String getStringUrlFileThongBaoTrungSoKhungSoDongCo(HttpServletRequest request, long idHoSoThuTuc){
		String urlFile = "";
		if(idHoSoThuTuc > 0){
			String tenFileExport = "defaultPDF.pdfs";
			String fileName = "";
			
					String realPath=ReportUtils.getTemplateReportFilePath(request);
					try {
						fileName = ReportBusinessUtils.actionExportThongBaoTrungSoKhungDongCo(realPath, idHoSoThuTuc);
					} catch (Exception e) {
						_log.error(e);
					}
					
					if (fileName.equalsIgnoreCase(ReportBusinessUtils.FILE_NAME_NULL) == false) {
						tenFileExport = fileName;
					}
					
					urlFile = request.getContextPath() + "/export/" + tenFileExport;
				}
		return urlFile;
	}
	public static String getStringUrlFileThongBaoTrungSoKhungSoDongCo(ResourceRequest request, long idHoSoThuTuc){
		String urlFile = "";
		if(idHoSoThuTuc > 0){
			String tenFileExport = "defaultPDF.pdfs";
			String fileName = "";
			
					String realPath=ReportUtils.getTemplateReportFilePath(request);
					try {
						fileName = ReportBusinessUtils.actionExportThongBaoTrungSoKhungDongCo(realPath, idHoSoThuTuc);
					} catch (Exception e) {
						_log.error(e);
					}
					
					if (fileName.equalsIgnoreCase(ReportBusinessUtils.FILE_NAME_NULL) == false) {
						tenFileExport = fileName;
					}
					
					urlFile = request.getContextPath() + "/export/" + tenFileExport;
				}
		return urlFile;
	}
}
