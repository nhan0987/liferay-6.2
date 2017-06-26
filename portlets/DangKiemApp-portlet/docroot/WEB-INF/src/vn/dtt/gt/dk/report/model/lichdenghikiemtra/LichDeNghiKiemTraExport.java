package vn.dtt.gt.dk.report.model.lichdenghikiemtra;

import java.util.ArrayList;
import java.util.List;

import vn.dtt.gt.dk.dao.common.model.DmDataItem;
import vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration;
import vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord;
import vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CustomsDeclarationLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceUtil;
import vn.dtt.gt.dk.report.ReportConstant;
import vn.dtt.gt.dk.utils.format.ConvertUtil;
import vn.dtt.gt.dk.utils.format.FormatData;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

public class LichDeNghiKiemTraExport {
	
	private static Log log = LogFactoryUtil.getLog(LichDeNghiKiemTraExport.class);
	
	public static LichDeNghiKiemTra getModel(String lstConfirmedInspectionId) throws SystemException {
		LichDeNghiKiemTra result = new LichDeNghiKiemTra();
		
		
		LichDeNghiKiemTraChiTietPhuongTien lichDeNghiKiemTraChiTietPhuongTien = null;
		List<LichDeNghiKiemTraChiTietPhuongTien> allChiTietPhuongTien = null;
		LichDeNghiKiemTraItem itemLichDeNghiKiemTra = null;
		List<LichDeNghiKiemTraItem> allItemLichDeNghiKiemTra = null;
		
		
		
		//chi tiet phuong tien
		String nhanHieuValue = "";
		String tenThuongMaiValue = "";
		String loaiPhuongTienValue = "";
		String soKhungValue = "";
		String soDongCoValue = "";
		String tinhTrangPhuongTienValue = "";
		
		
		
		// lich de nghi co list chi tiet phuong tien


		String tenDoiValue = "";
		String ngayDeNghiKiemTraValue = "";
		String soHoSoKiemTraValue = "";
		String soHQValue = "";
		String ngayTKHQValue = "";
		String maChiCucHQValue = "";
		String nguoiLienHeValue = "";
		String soDienThoaiNguoiLienHeValue = "";
		String diaDiemValue = "";
		String diaDiemQuanValue = "";
		String diaDiemThanhPhoValue = "";
		String ghiChuValue = "";
		
		

		
		
		String [] lstConfirmedInspectionIds = lstConfirmedInspectionId.split(",");
		
		allItemLichDeNghiKiemTra = new ArrayList<LichDeNghiKiemTraItem>();
		if(lstConfirmedInspectionIds != null && lstConfirmedInspectionIds.length > 0){
			for(int i =0; i< lstConfirmedInspectionIds.length; i++){
				itemLichDeNghiKiemTra = new LichDeNghiKiemTraItem();
				
				ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil.fetchConfirmedInspection(ConvertUtil.convertToLong(lstConfirmedInspectionIds[i]));
				List<VehicleRecord> lstVehicleRecords = VehicleRecordLocalServiceUtil.findByConfirmedInspectionId(confirmedInspection.getId());
				DmDataItem dmDataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.CORPORATION, String.valueOf(confirmedInspection.getCorporationId()));
				if(dmDataItem != null){
					tenDoiValue = dmDataItem.getName();
				}
				
				
				
				allChiTietPhuongTien = new ArrayList<LichDeNghiKiemTraChiTietPhuongTien>();
				for(VehicleRecord vehicleRecord : lstVehicleRecords){
					VehicleGroup vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecord.getVehicleGroupId());
					lichDeNghiKiemTraChiTietPhuongTien = new LichDeNghiKiemTraChiTietPhuongTien();
					
					DmDataItem dmDataItemNhanHieu =DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.TRADE_MARK , String.valueOf(vehicleGroup.getTradeMark()));
					nhanHieuValue = Validator.isNotNull(dmDataItemNhanHieu) ? dmDataItemNhanHieu.getName() : "";
					tenThuongMaiValue = vehicleGroup.getCommercialName();
					
					DmDataItem dmDataItemLoaiPhuongTien =DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.VEHICLE_TYPE , String.valueOf(vehicleGroup.getVehicleType()));			
					loaiPhuongTienValue = Validator.isNotNull(dmDataItemLoaiPhuongTien) ? dmDataItemLoaiPhuongTien.getName() : "";
					
					soKhungValue = vehicleRecord.getChassisNumber();
					soDongCoValue = vehicleRecord.getEngineNumber();
					
					DmDataItem dmDataItemTinhTrangPhuongTien =DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.USAGE , String.valueOf(vehicleRecord.getVehicleEngineStatus()));
					tinhTrangPhuongTienValue = dmDataItemTinhTrangPhuongTien.getName();
					
					
					lichDeNghiKiemTraChiTietPhuongTien.setNhanHieu(nhanHieuValue);
					lichDeNghiKiemTraChiTietPhuongTien.setTenThuongMai(tenThuongMaiValue);
					lichDeNghiKiemTraChiTietPhuongTien.setLoaiPhuongTien(loaiPhuongTienValue);
					lichDeNghiKiemTraChiTietPhuongTien.setSoKhung(soKhungValue);
					lichDeNghiKiemTraChiTietPhuongTien.setSoDongCo(soDongCoValue);
					lichDeNghiKiemTraChiTietPhuongTien.setTinhTrangPhuongTien(tinhTrangPhuongTienValue);
					
					allChiTietPhuongTien.add(lichDeNghiKiemTraChiTietPhuongTien);
					
				}
				
				ngayDeNghiKiemTraValue = Validator.isNotNull(confirmedInspection.getInspectionDate()) ? FormatData.parseDateToTringType3(confirmedInspection.getInspectionDate()) : "";
				
				RegisteredInspection registeredInspection =  RegisteredInspectionLocalServiceUtil.fetchRegisteredInspection(confirmedInspection.getRegisteredInspectionId());
				if(registeredInspection != null){
					soHoSoKiemTraValue = Validator.isNotNull(registeredInspection.getRegisteredNumber()) ? registeredInspection.getRegisteredNumber() : "";
				}
				soHoSoKiemTraValue = registeredInspection.getRegisteredNumber();
				
				CustomsDeclaration customsDeclaration = CustomsDeclarationLocalServiceUtil.fetchCustomsDeclaration(confirmedInspection.getCustomsDeclarationId());
				if(customsDeclaration != null){
				soHQValue = Validator.isNotNull(customsDeclaration.getImportCustomDeclareNo()) ? customsDeclaration.getImportCustomDeclareNo() : "";
				ngayTKHQValue = FormatData.parseDateToTringType3(customsDeclaration.getImportCustomDeclareDate());
				}
				
				maChiCucHQValue = "";
				nguoiLienHeValue = confirmedInspection.getContactName();
				soDienThoaiNguoiLienHeValue = confirmedInspection.getContactPhone();
				diaDiemValue = confirmedInspection.getInspectionSite();
				DmDataItem dmDataItemDistrictCode = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.ADMINISTRATIVE_UNITS , String.valueOf(confirmedInspection.getInspectionDistrictCode()));
				DmDataItem dmDataItemProvincecode = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.ADMINISTRATIVE_UNITS , String.valueOf(confirmedInspection.getInspectionProvincecode()));
				diaDiemQuanValue = Validator.isNotNull(dmDataItemDistrictCode) ? dmDataItemDistrictCode.getName() : "";
				diaDiemThanhPhoValue = Validator.isNotNull(dmDataItemProvincecode) ? dmDataItemProvincecode.getName() : "";
				ghiChuValue = confirmedInspection.getRemarks();
				
				
				itemLichDeNghiKiemTra.setTenDoi(tenDoiValue);
				itemLichDeNghiKiemTra.setNgayDeNghiKiemTra(ngayDeNghiKiemTraValue );
				itemLichDeNghiKiemTra.setSoHoSoKiemTra(String.valueOf(soHoSoKiemTraValue));
				itemLichDeNghiKiemTra.setSoHQ(soHQValue);
				itemLichDeNghiKiemTra.setNgayTKHQ(ngayTKHQValue);
				itemLichDeNghiKiemTra.setMaChiCucHQ(maChiCucHQValue);
				itemLichDeNghiKiemTra.setNguoiLienHe(nguoiLienHeValue);
				itemLichDeNghiKiemTra.setSoDienThoaiNguoiLienHe(soDienThoaiNguoiLienHeValue);
				itemLichDeNghiKiemTra.setDiaDiem(diaDiemValue);
				itemLichDeNghiKiemTra.setDiaDiemQuan(diaDiemQuanValue);
				itemLichDeNghiKiemTra.setDiaDiemThanhPho(diaDiemThanhPhoValue);
				itemLichDeNghiKiemTra.setGhiChu(ghiChuValue);
				itemLichDeNghiKiemTra.setDanhSachChiTietPhuongTien(allChiTietPhuongTien);
				
				//itemLichDeNghiKiemTra.setAllVehicleRecords(lstVehicleRecords);
				allItemLichDeNghiKiemTra.add(itemLichDeNghiKiemTra);
				
			}
		}
		log.info("------------allItemLichDeNghiKiemTra------" + allItemLichDeNghiKiemTra.size());
		result.setLichDeNghiKiemTraItem(allItemLichDeNghiKiemTra);
		
		return result;
	}
	

	
}
