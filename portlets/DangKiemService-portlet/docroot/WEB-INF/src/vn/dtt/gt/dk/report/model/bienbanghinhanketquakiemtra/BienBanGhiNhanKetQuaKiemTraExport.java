package vn.dtt.gt.dk.report.model.bienbanghinhanketquakiemtra;

import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.ls.LSResourceResolver;

import vn.dtt.gt.dk.dao.common.model.DmDataItem;
import vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector;
import vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration;
import vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord;
import vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CustomsDeclarationLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceUtil;
import vn.dtt.gt.dk.report.ReportConstant;
import vn.dtt.gt.dk.utils.format.ConvertUtil;
import vn.dtt.gt.dk.utils.format.FormatData;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

public class BienBanGhiNhanKetQuaKiemTraExport {
	private static Log log = LogFactoryUtil.getLog(BienBanGhiNhanKetQuaKiemTraExport.class);
	
	public static BienBanGhiNhanKetQuaKiemTraList getModel(long userId, String confirmedInspectionId, String lstVehicleGroupId) throws SystemException{
		
		log.info("===BienBanGhiNhanKetQuaKiemTraExport==userId---"+userId);
		log.info("===BienBanGhiNhanKetQuaKiemTraExport==confirmedInspectionId---"+confirmedInspectionId);
		log.info("===BienBanGhiNhanKetQuaKiemTraExport==lstVehicleGroupId---"+lstVehicleGroupId);
		
		BienBanGhiNhanKetQuaKiemTraList result =  new BienBanGhiNhanKetQuaKiemTraList();
		
		BienBanGhiNhanKetQuaKiemTra bienBanGhiNhanKetQuaKiemTra = null;
		List<BienBanGhiNhanKetQuaKiemTra> lstBienBanGhiNhanKetQuaKiemTra = null;
		BienBanGhiNhanKetQuaKiemTraPhuLuc bienBanGhiNhanKetQuaKiemTraPhuLuc = null;
		List<BienBanGhiNhanKetQuaKiemTraPhuLuc> lstBienBanGhiNhanKetQuaKiemTraPhuLuc = null;
		
		// danh sach phu luc
		String soKhungValue = "";
		String soDongCoValue = "";
		
		// bien ban ghi nhan, co list phu luc
		String tenDoiValue = "";
		String dkvDuocPhanCongValue = "";
		String soDKKTValue = "";
		String soVaNgayTKHQValue = "";
		String nguoiNhapKhauValue = "";
		String ngayKiemTraValue = "";
		String diaDiemKiemTraValue = "";
		String nguoiLienHeValue = "";
		String soDienThoaiValue = "";
		String soLuongXeDeNghiKTValue = "";
		
		String [] lstVehicleGroupIdSplitted = lstVehicleGroupId.split(",");
		
		ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil.fetchConfirmedInspection(ConvertUtil.convertToLong(confirmedInspectionId));
		RegisteredInspection registeredInspection =  RegisteredInspectionLocalServiceUtil.fetchRegisteredInspection(confirmedInspection.getRegisteredInspectionId());
		if(registeredInspection != null){
			soDKKTValue = Validator.isNotNull(registeredInspection.getRegisteredNumber()) ? registeredInspection.getRegisteredNumber() : "";
		}
		
		CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil.fetchByInspectorId(confirmedInspection.getInspectorId());
		DmDataItem dmDataItemTenDoi = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.CORPORATION, confirmedInspection.getCorporationId());
		
		if(dmDataItemTenDoi != null){
			tenDoiValue = Validator.isNotNull(dmDataItemTenDoi.getName()) ? dmDataItemTenDoi.getName() : "" ;
		}
		if(corporationInspector != null){
			dkvDuocPhanCongValue = Validator.isNotNull(corporationInspector.getInspectorName()) ? corporationInspector.getInspectorName() : "";
		}
		
		CustomsDeclaration customsDeclaration = CustomsDeclarationLocalServiceUtil.fetchCustomsDeclaration(confirmedInspection.getCustomsDeclarationId());
		String soTKHQTemp= "";
		String ngayTKHQTemp  = "";
	
		if(customsDeclaration != null){
			soTKHQTemp = Validator.isNotNull(customsDeclaration.getImportCustomDeclareNo()) ? customsDeclaration.getImportCustomDeclareNo() : "";
			ngayTKHQTemp = Validator.isNotNull(customsDeclaration.getImportCustomDeclareDate()) ? "/"+FormatData.parseDateToTringType3(customsDeclaration.getImportCustomDeclareDate()) : "";
		}
		soVaNgayTKHQValue = soTKHQTemp +ngayTKHQTemp;
		
		nguoiNhapKhauValue = Validator.isNotNull(registeredInspection.getImporterName()) ? registeredInspection.getImporterName() : ""; 
		ngayKiemTraValue = Validator.isNotNull(confirmedInspection.getInspectionDate()) ? FormatData.parseDateToTringType3(confirmedInspection.getInspectionDate()) : "";
		
		String diaDiemTemp = Validator.isNotNull(confirmedInspection.getInspectionSite()) ? confirmedInspection.getInspectionSite() : "";
		DmDataItem dmDataItemDistrictCode = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.ADMINISTRATIVE_UNITS , String.valueOf(confirmedInspection.getInspectionDistrictCode()));
		DmDataItem dmDataItemProvincecode = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.ADMINISTRATIVE_UNITS , String.valueOf(confirmedInspection.getInspectionProvincecode()));
		String diaDiemQuanTemp = Validator.isNotNull(dmDataItemDistrictCode) ? "/" + dmDataItemDistrictCode.getName() : "";
		String diaDiemThanhPhoTemp = Validator.isNotNull(dmDataItemProvincecode) ? "/" + dmDataItemProvincecode.getName() : "";
		diaDiemKiemTraValue = diaDiemTemp+diaDiemQuanTemp+diaDiemThanhPhoTemp;
		
		nguoiLienHeValue = Validator.isNotNull(confirmedInspection.getContactName()) ? confirmedInspection.getContactName() : "";
		soDienThoaiValue = Validator.isNotNull(confirmedInspection.getContactPhone()) ? confirmedInspection.getContactPhone() : "";
		
		lstBienBanGhiNhanKetQuaKiemTra = new ArrayList<BienBanGhiNhanKetQuaKiemTra>();		
		if(lstVehicleGroupIdSplitted != null && lstVehicleGroupIdSplitted.length > 0){
			
			log.info("===BienBanGhiNhanKetQuaKiemTraList-----lstVehicleGroupIdSplitted------" + lstVehicleGroupIdSplitted.length);
			
			for(int i = 0 ; i < lstVehicleGroupIdSplitted.length ; i++){
				bienBanGhiNhanKetQuaKiemTra = new BienBanGhiNhanKetQuaKiemTra();
				List<VehicleRecord> lstVehicleRecords = VehicleRecordLocalServiceUtil.findByConfirmedInspectionIdAndVehicleGroupId(confirmedInspectionId, lstVehicleGroupIdSplitted[i]);
				soLuongXeDeNghiKTValue = Validator.isNotNull(lstVehicleRecords) ? String.valueOf(lstVehicleRecords.size()) : "0";
				lstBienBanGhiNhanKetQuaKiemTraPhuLuc = new ArrayList<BienBanGhiNhanKetQuaKiemTraPhuLuc>();
				for(VehicleRecord vehicleRecord : lstVehicleRecords){
					bienBanGhiNhanKetQuaKiemTraPhuLuc = new BienBanGhiNhanKetQuaKiemTraPhuLuc();
					
					soKhungValue = Validator.isNotNull(vehicleRecord.getChassisNumber()) ? vehicleRecord.getChassisNumber() : "";
					soDongCoValue = Validator.isNotNull(vehicleRecord.getEngineNumber()) ? vehicleRecord.getEngineNumber() : "";
					bienBanGhiNhanKetQuaKiemTraPhuLuc.setSoKhung(soKhungValue);
					bienBanGhiNhanKetQuaKiemTraPhuLuc.setSoDongCo(soDongCoValue);
					lstBienBanGhiNhanKetQuaKiemTraPhuLuc.add(bienBanGhiNhanKetQuaKiemTraPhuLuc);
				}
				

				bienBanGhiNhanKetQuaKiemTra.setTenDoi(tenDoiValue);
				bienBanGhiNhanKetQuaKiemTra.setDkvDuocPhanCong(dkvDuocPhanCongValue);
				bienBanGhiNhanKetQuaKiemTra.setSoDKKT(soDKKTValue);
				bienBanGhiNhanKetQuaKiemTra.setSoVaNgayTKHQ(soVaNgayTKHQValue);
				bienBanGhiNhanKetQuaKiemTra.setNguoiNhapKhau(nguoiNhapKhauValue);
				bienBanGhiNhanKetQuaKiemTra.setNgayKiemTra(ngayKiemTraValue);
				bienBanGhiNhanKetQuaKiemTra.setDiaDiemKiemTra(diaDiemKiemTraValue);
				bienBanGhiNhanKetQuaKiemTra.setNguoiLienHe(nguoiLienHeValue);
				bienBanGhiNhanKetQuaKiemTra.setSoDienThoai(soDienThoaiValue);
				bienBanGhiNhanKetQuaKiemTra.setSoLuongXeDeNghiKT(soLuongXeDeNghiKTValue);
				bienBanGhiNhanKetQuaKiemTra.setBienBanGhiNhanKQKTPhuLuc(lstBienBanGhiNhanKetQuaKiemTraPhuLuc);
				
				
				lstBienBanGhiNhanKetQuaKiemTra.add(bienBanGhiNhanKetQuaKiemTra);
			}
		}
		log.info("===BienBanGhiNhanKetQuaKiemTraList-----lstBienBanGhiNhanKetQuaKiemTra------" + lstBienBanGhiNhanKetQuaKiemTra.size());

		result.setLstBienBanGhiNhanKetQuaKiemTra(lstBienBanGhiNhanKetQuaKiemTra);
		
		return result;
	}
	
	//nhieu Bien ban ghi nhan
	public static BienBanGhiNhanKetQuaKiemTraList getListModel(String lstConfirmedInspectionId) throws SystemException{
		
		String [] lstConfirmedInspectionIdSplit = lstConfirmedInspectionId.split(",");
		BienBanGhiNhanKetQuaKiemTraList result =  new BienBanGhiNhanKetQuaKiemTraList();
		List<BienBanGhiNhanKetQuaKiemTra> lstBienBanGhiNhan = new ArrayList<BienBanGhiNhanKetQuaKiemTra>();
		BienBanGhiNhanKetQuaKiemTra bienBanGhiNhanKetQuaKiemTra = null;
		if(lstConfirmedInspectionIdSplit != null && lstConfirmedInspectionIdSplit.length >0){
			for(int i = 0; i < lstConfirmedInspectionIdSplit.length; i ++){
				ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil.fetchConfirmedInspection(ConvertUtil.convertToLong(lstConfirmedInspectionIdSplit[i]));
				if(confirmedInspection != null){
					bienBanGhiNhanKetQuaKiemTra = new BienBanGhiNhanKetQuaKiemTra();
					RegisteredInspection registeredInspection =  RegisteredInspectionLocalServiceUtil.fetchRegisteredInspection(confirmedInspection.getRegisteredInspectionId());
					if(registeredInspection != null){
						bienBanGhiNhanKetQuaKiemTra.setSoDKKT(Validator.isNotNull(registeredInspection.getRegisteredNumber()) ? registeredInspection.getRegisteredNumber() : "");
						bienBanGhiNhanKetQuaKiemTra.setNguoiNhapKhau(Validator.isNotNull(registeredInspection.getImporterName()) ? registeredInspection.getImporterName() : "");
						bienBanGhiNhanKetQuaKiemTra.setNgayKiemTra(Validator.isNotNull(confirmedInspection.getInspectionDate()) ? FormatData.parseDateToTringType3(confirmedInspection.getInspectionDate()) : "");
					}
					
					DmDataItem dmDataItemTenDoi = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.CORPORATION, confirmedInspection.getCorporationId());
					if(dmDataItemTenDoi != null){
						bienBanGhiNhanKetQuaKiemTra.setTenDoi(Validator.isNotNull(dmDataItemTenDoi.getName()) ? dmDataItemTenDoi.getName() : "");
					}
					
					CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil.fetchByInspectorId(confirmedInspection.getInspectorId());
					if(corporationInspector != null){
						bienBanGhiNhanKetQuaKiemTra.setDkvDuocPhanCong(Validator.isNotNull(corporationInspector.getInspectorName()) ? corporationInspector.getInspectorName() : "");
					}
					
					CustomsDeclaration customsDeclaration = CustomsDeclarationLocalServiceUtil.fetchCustomsDeclaration(confirmedInspection.getCustomsDeclarationId());
					if(customsDeclaration != null){
						String soTKHQTemp= "";
						String ngayTKHQTemp  = "";
						soTKHQTemp = Validator.isNotNull(customsDeclaration.getImportCustomDeclareNo()) ? customsDeclaration.getImportCustomDeclareNo() : "";
						ngayTKHQTemp = Validator.isNotNull(customsDeclaration.getImportCustomDeclareDate()) ? "/"+FormatData.parseDateToTringType3(customsDeclaration.getImportCustomDeclareDate()) : "";
						bienBanGhiNhanKetQuaKiemTra.setSoVaNgayTKHQ(soTKHQTemp + ngayTKHQTemp);
					}
					
					String diaDiemTemp = Validator.isNotNull(confirmedInspection.getInspectionSite()) ? confirmedInspection.getInspectionSite() : "";
					DmDataItem dmDataItemDistrictCode = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.ADMINISTRATIVE_UNITS , String.valueOf(confirmedInspection.getInspectionDistrictCode()));
					DmDataItem dmDataItemProvincecode = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.ADMINISTRATIVE_UNITS , String.valueOf(confirmedInspection.getInspectionProvincecode()));
					String diaDiemQuanTemp = Validator.isNotNull(dmDataItemDistrictCode) ? "/" + dmDataItemDistrictCode.getName() : "";
					String diaDiemThanhPhoTemp = Validator.isNotNull(dmDataItemProvincecode) ? "/" + dmDataItemProvincecode.getName() : "";
					
					bienBanGhiNhanKetQuaKiemTra.setDiaDiemKiemTra(diaDiemTemp+diaDiemQuanTemp+diaDiemThanhPhoTemp);
					bienBanGhiNhanKetQuaKiemTra.setNguoiLienHe(Validator.isNotNull(confirmedInspection.getContactName()) ? confirmedInspection.getContactName() : "");
					bienBanGhiNhanKetQuaKiemTra.setSoDienThoai(Validator.isNotNull(confirmedInspection.getContactPhone()) ? confirmedInspection.getContactPhone() : "");
					
					List<VehicleRecord> lstVehicleRecords = VehicleRecordLocalServiceUtil.findByConfirmedInspectionId(confirmedInspection.getId());
					List<BienBanGhiNhanKetQuaKiemTraPhuLuc> lstBienBanGhiNhanKetQuaKiemTraPhuLuc = new ArrayList<BienBanGhiNhanKetQuaKiemTraPhuLuc>();
					BienBanGhiNhanKetQuaKiemTraPhuLuc bienBanGhiNhanKetQuaKiemTraPhuLuc = new BienBanGhiNhanKetQuaKiemTraPhuLuc();
					if(lstVehicleRecords != null && lstVehicleRecords.size() >0){
						for(VehicleRecord vehicleRecord : lstVehicleRecords){
							bienBanGhiNhanKetQuaKiemTraPhuLuc = new BienBanGhiNhanKetQuaKiemTraPhuLuc();
							bienBanGhiNhanKetQuaKiemTraPhuLuc.setSoKhung(Validator.isNotNull(vehicleRecord.getChassisNumber()) ? vehicleRecord.getChassisNumber() : "");
							bienBanGhiNhanKetQuaKiemTraPhuLuc.setSoDongCo(Validator.isNotNull(vehicleRecord.getEngineNumber()) ? vehicleRecord.getEngineNumber() : "");
							lstBienBanGhiNhanKetQuaKiemTraPhuLuc.add(bienBanGhiNhanKetQuaKiemTraPhuLuc);
						}
					}
					bienBanGhiNhanKetQuaKiemTra.setBienBanGhiNhanKQKTPhuLuc(lstBienBanGhiNhanKetQuaKiemTraPhuLuc);
					bienBanGhiNhanKetQuaKiemTra.setSoLuongXeDeNghiKT(Validator.isNotNull(lstVehicleRecords) ? String.valueOf(lstVehicleRecords.size()) : "0");
					
					lstBienBanGhiNhan.add(bienBanGhiNhanKetQuaKiemTra);
				}
			}
		}
		
		if(lstBienBanGhiNhan != null && lstBienBanGhiNhan.size() >0){
			result.setLstBienBanGhiNhanKetQuaKiemTra(lstBienBanGhiNhan);
		}
		
		return result;
	}
}
