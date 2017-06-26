
package vn.dtt.gt.dk.portlet.chungchi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;

import vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec;
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIDONGCO;
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEBONBANH;
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG;
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI;
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEDAPDIEN;
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIDONGCOImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEBONBANHImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECHUYENDUNGImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEDAPDIENImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEMAYImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleCertificateImpl;
import vn.dtt.gt.dk.dao.nghiepvu.service.CfgTechnicalspecLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIDONGCOLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEBONBANHLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECHUYENDUNGLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECOGIOILocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEDAPDIENLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEMAYLocalServiceUtil;

public class TraCuuChungChiUtil {
	
	public static XSSFWorkbook exportExcel(List<VehicleCertificate> lstVehicleCertificate, String doiTuong) 
			throws SystemException {
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet();
		
		List<String> headers = new ArrayList<String>();
		
		Object[][] vehicleCertificateColumns = VehicleCertificateImpl.TABLE_COLUMNS;
		for(int i = 0; i < vehicleCertificateColumns.length; i++) {
			Object[] tableColumn = vehicleCertificateColumns[i];
			String col = GetterUtil.getString(tableColumn[0]);
			headers.add(col);
		}
		
		Object[][] specColumns = null;
		if(doiTuong.equalsIgnoreCase("DCX")) {
			specColumns = THONGSOCHUNGCHIDONGCOImpl.TABLE_COLUMNS;
		} else if(doiTuong.equalsIgnoreCase("XBB")) {
			specColumns = THONGSOCHUNGCHIXEBONBANHImpl.TABLE_COLUMNS;
		} else if(doiTuong.equalsIgnoreCase("XCD")) {
			specColumns = THONGSOCHUNGCHIXECHUYENDUNGImpl.TABLE_COLUMNS;
		} else if(doiTuong.equalsIgnoreCase("XCG")) {
			specColumns = THONGSOCHUNGCHIXECOGIOIImpl.TABLE_COLUMNS;
		} else if(doiTuong.equalsIgnoreCase("XDD")) {
			specColumns = THONGSOCHUNGCHIXEDAPDIENImpl.TABLE_COLUMNS;
		} else if(doiTuong.equalsIgnoreCase("XMY")) {
			specColumns = THONGSOCHUNGCHIXEMAYImpl.TABLE_COLUMNS;
		}
		
		if(specColumns != null) {
			for(int i = 0; i < specColumns.length; i++) {
				Object[] tableColumn = specColumns[i];
				String col = GetterUtil.getString(tableColumn[0]);
				
				// get name of col
				CfgTechnicalspec technicalSpec = CfgTechnicalspecLocalServiceUtil.findBySpecificationCode(col);
				
				if(technicalSpec != null) {
					headers.add(technicalSpec.getSpecificationName());
				} else {
					headers.add(col);
				}
			}
		}
		
		// Create header row
		
		XSSFRow header = sheet.createRow(0);
		
		for(int i = 0; i < headers.size(); i++) {
			
			XSSFCell cell = header.createCell(i);
			cell.setCellValue(headers.get(i));
		}
		
		int cntRow = 1;
		for(VehicleCertificate vehicleCertificate : lstVehicleCertificate) {
			
			XSSFRow row = sheet.createRow(cntRow);
			cntRow ++;
			
			Map<String, Object> attributes = vehicleCertificate.getModelAttributes();
			
			long certificateRecordId = vehicleCertificate.getCertificateRecordid();
			long vehicleGroupId = vehicleCertificate.getVehicleGroupInitialId();
			String IDGCN = vehicleCertificate.getCertificateNumber();
			// value for VehicleCertificate
			int cntCell = 0;
			for(int i = 0; i < vehicleCertificateColumns.length; i++) {
				Object[] tableColumn = vehicleCertificateColumns[i];
				String col = GetterUtil.getString(tableColumn[0]);
				XSSFCell cell = row.createCell(cntCell);
				cntCell++;
				
				cell.setCellType(CellType.STRING);
				String value = String.valueOf(attributes.get(col));
				if(value == null || value == "null") {
					cell.setCellValue("");
				} else {
					cell.setCellValue(value);
				}
			}
			
			Map<String, Object> specAttributes = null;
			
			if(doiTuong.equalsIgnoreCase("DCX")) {
				THONGSOCHUNGCHIDONGCO item = new THONGSOCHUNGCHIDONGCOImpl();
				
				if(certificateRecordId > 0) {
					List<THONGSOCHUNGCHIDONGCO> list = THONGSOCHUNGCHIDONGCOLocalServiceUtil.
							findByCertificateRecordId(certificateRecordId);
					
					if(list != null && list.size() > 0) {
						item = list.get(0);
					}
				} else if(vehicleGroupId > 0) {
					List<THONGSOCHUNGCHIDONGCO> list = THONGSOCHUNGCHIDONGCOLocalServiceUtil.
							findByVehicleGroupId(vehicleGroupId);
					
					if(list != null && list.size() > 0) {
						item = list.get(0);
					}
				}
				
				specAttributes = item.getModelAttributes();
			} else if(doiTuong.equalsIgnoreCase("XBB")) {
				THONGSOCHUNGCHIXEBONBANH item = new THONGSOCHUNGCHIXEBONBANHImpl();
				
				if(certificateRecordId > 0) {
					List<THONGSOCHUNGCHIXEBONBANH> list = THONGSOCHUNGCHIXEBONBANHLocalServiceUtil.
							findByCertificateRecordId(certificateRecordId);
					
					if(list != null && list.size() > 0) {
						item = list.get(0);
					}
				} else if(vehicleGroupId > 0) {
					List<THONGSOCHUNGCHIXEBONBANH> list = THONGSOCHUNGCHIXEBONBANHLocalServiceUtil.
							findByVehicleGroupId(vehicleGroupId);
					
					if(list != null && list.size() > 0) {
						item = list.get(0);
					}
				}
				
				specAttributes = item.getModelAttributes();
			} else if(doiTuong.equalsIgnoreCase("XCD")) {
				THONGSOCHUNGCHIXECHUYENDUNG itemXCD = new THONGSOCHUNGCHIXECHUYENDUNGImpl();
				
				if(certificateRecordId > 0) {
					List<THONGSOCHUNGCHIXECHUYENDUNG> list = THONGSOCHUNGCHIXECHUYENDUNGLocalServiceUtil.
							findByCertificateRecordId(certificateRecordId);
					
					if(list != null && list.size() > 0) {
						itemXCD = list.get(0);
					}
				} else if(vehicleGroupId > 0) {
					List<THONGSOCHUNGCHIXECHUYENDUNG> list = THONGSOCHUNGCHIXECHUYENDUNGLocalServiceUtil.
							findByVehicleGroupId(vehicleGroupId);
					
					if(list != null && list.size() > 0) {
						itemXCD = list.get(0);
					}
				}
				else if ((vehicleGroupId == 0) && (certificateRecordId == 0)) {
					List<THONGSOCHUNGCHIXECHUYENDUNG> list = THONGSOCHUNGCHIXECHUYENDUNGLocalServiceUtil.findByXCD0009(IDGCN);
					
					if(list != null && list.size() > 0) {
						itemXCD = list.get(0);
					}
				}
				specAttributes = itemXCD.getModelAttributes();
				
			} else if(doiTuong.equalsIgnoreCase("XCG")) {
				THONGSOCHUNGCHIXECOGIOI itemXCG = new THONGSOCHUNGCHIXECOGIOIImpl();
				
				if(certificateRecordId > 0) {
					List<THONGSOCHUNGCHIXECOGIOI> list = THONGSOCHUNGCHIXECOGIOILocalServiceUtil.
							findByCertificateRecordId(certificateRecordId);
					
					if(list != null && list.size() > 0) {
						itemXCG = list.get(0);
					}
				} else if(vehicleGroupId > 0) {
					List<THONGSOCHUNGCHIXECOGIOI> list = THONGSOCHUNGCHIXECOGIOILocalServiceUtil.
							findByVehicleGroupId(vehicleGroupId);
					
					if(list != null && list.size() > 0) {
						itemXCG = list.get(0);
					}
				}
				
				specAttributes = itemXCG.getModelAttributes();
			} else if(doiTuong.equalsIgnoreCase("XDD")) {
				THONGSOCHUNGCHIXEDAPDIEN itemXDD = new THONGSOCHUNGCHIXEDAPDIENImpl();
				
				if(certificateRecordId > 0) {
					List<THONGSOCHUNGCHIXEDAPDIEN> list = THONGSOCHUNGCHIXEDAPDIENLocalServiceUtil.
							findByCertificateRecordId(certificateRecordId);
					
					if(list != null && list.size() > 0) {
						itemXDD = list.get(0);
					}
				} else if(vehicleGroupId > 0) {
					List<THONGSOCHUNGCHIXEDAPDIEN> list = THONGSOCHUNGCHIXEDAPDIENLocalServiceUtil.
							findByVehicleGroupId(vehicleGroupId);
					
					if(list != null && list.size() > 0) {
						itemXDD = list.get(0);
					}
				}
				
				specAttributes = itemXDD.getModelAttributes();
			} else if(doiTuong.equalsIgnoreCase("XMY")) {
				THONGSOCHUNGCHIXEMAY itemXMY = new THONGSOCHUNGCHIXEMAYImpl();
				
				if(certificateRecordId > 0) {
					List<THONGSOCHUNGCHIXEMAY> list = THONGSOCHUNGCHIXEMAYLocalServiceUtil.
							findByCertificateRecordId(certificateRecordId);
					
					if(list != null && list.size() > 0) {
						itemXMY = list.get(0);
					}
				} else if(vehicleGroupId > 0) {
					List<THONGSOCHUNGCHIXEMAY> list = THONGSOCHUNGCHIXEMAYLocalServiceUtil.
							findByVehicleGroupId(vehicleGroupId);
					
					if(list != null && list.size() > 0) {
						itemXMY = list.get(0);
					}
				}
				
				specAttributes = itemXMY.getModelAttributes();
			}
			
			// value for specification
			if(specColumns != null) {
				for(int i = 0; i < specColumns.length; i++) {
					Object[] tableColumn = specColumns[i];
					String col = GetterUtil.getString(tableColumn[0]);
					XSSFCell cell = row.createCell(cntCell);
					cntCell++;
					
					cell.setCellType(CellType.STRING);
					String value = String.valueOf(specAttributes.get(col));
					if(value == null || value == "null") {
						cell.setCellValue("");
					} else {
						cell.setCellValue(value);
					}
				}
			}
		}
		
		return wb;
	}
	
	private static final Log _log = LogFactoryUtil.getLog(TraCuuChungChiUtil.class);
}
