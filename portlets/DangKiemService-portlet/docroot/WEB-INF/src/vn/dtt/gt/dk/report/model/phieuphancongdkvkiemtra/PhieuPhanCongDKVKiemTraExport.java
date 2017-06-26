package vn.dtt.gt.dk.report.model.phieuphancongdkvkiemtra;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

import vn.dtt.gt.dk.dao.common.model.DmDataItem;
import vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector;
import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView;
import vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord;
import vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationViewLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceUtil;
import vn.dtt.gt.dk.report.ReportConstant;
import vn.dtt.gt.dk.report.model.lichdenghikiemtra.LichDeNghiKiemTraExport;
import vn.dtt.gt.dk.utils.format.FormatData;

public class PhieuPhanCongDKVKiemTraExport {
	private static Log log = LogFactoryUtil.getLog(PhieuPhanCongDKVKiemTraExport.class);
	public static PhieuPhanCongDKVKiemTra getModel(long userId, String ngayKiemTra) throws SystemException{
		PhieuPhanCongDKVKiemTra result = new PhieuPhanCongDKVKiemTra();
		
		PhieuPhanCongDKVKiemTraDSHoSo phieuPhanCongDKVKiemTraDSHoSo = null;
		List<PhieuPhanCongDKVKiemTraDSHoSo> phieuPhanCongDKVKiemTraDSHoSos = null;
		PhieuPhanCongDKVKiemTraItem phieuPhanCongDKVKiemTraItem = null;
		List<PhieuPhanCongDKVKiemTraItem> phieuPhanCongDKVKiemTraItems = null;
		
		// danh sach ho so
		String soHoSoValue = "";
		long soLuongXeValue = 0;
		String diaDiemKiemTraValue = "";
		String nguoiLienHeValue = "";
		String soDienThoaiNguoiLienHeValue = "";
		
		// phieu phan cong DKV kiem tra, co bang danh sach ho so
		String tenDoiValue = "";
		String ngayKiemTraValue = "";
		String dangKiemVienKiemTraValue = "";
		String doiTruongValue = "";
		
		List<CorporationView> corporationViews = CorporationViewLocalServiceUtil.findCorporationView(userId, 1);
		
		phieuPhanCongDKVKiemTraItems = new ArrayList<PhieuPhanCongDKVKiemTraItem>();
		
		if(corporationViews != null && corporationViews.size() > 0){ // la lanh dao, co thanh vien
			log.info("===PhieuPhanCongDKVKiemTraExport===Lanh Dao");
			log.info("===PhieuPhanCongDKVKiemTraExport===corporationViews==="+corporationViews.size());
			
			CorporationInspector corporationInspectorDoiTruong = CorporationInspectorLocalServiceUtil.fetchByInspectorId(userId);
			
			if(corporationInspectorDoiTruong != null){
				doiTruongValue = corporationInspectorDoiTruong.getInspectorName();
			}
			
			for(CorporationView corporationView : corporationViews){
				DmDataItem dmDataItemTenDoi = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.CORPORATION, corporationView.getCorporationId());
				
				if(dmDataItemTenDoi != null){
					tenDoiValue = dmDataItemTenDoi.getName();
				}
				
				Date dateNgayKiemTra = FormatData.parseDateShort3StringToDate(ngayKiemTra.trim());
				ngayKiemTraValue = FormatData.parseDateToTringDDMMYYY(dateNgayKiemTra);
				
				
				List<ConfirmedInspection> lstDangKiemVien =  ConfirmedInspectionLocalServiceUtil.findConfirmedGroupByInspectorId(corporationView.getCorporationId(), ngayKiemTra);
				if(lstDangKiemVien != null && lstDangKiemVien.size() > 0){
					for(ConfirmedInspection dangKiemVien : lstDangKiemVien){
						
						phieuPhanCongDKVKiemTraItem = new PhieuPhanCongDKVKiemTraItem();
						
						phieuPhanCongDKVKiemTraItem.setTenDoi(tenDoiValue);
						phieuPhanCongDKVKiemTraItem.setNgayKiemTra(ngayKiemTraValue); // dang yyyy/mm/dd hh:mm
						phieuPhanCongDKVKiemTraItem.setDoiTruong(doiTruongValue);
						
						if(dangKiemVien != null && dangKiemVien.getLeader() > 0){
							CorporationInspector doiTruongLeader = CorporationInspectorLocalServiceUtil.fetchByInspectorId(dangKiemVien.getLeader());
							if(doiTruongLeader != null){
								phieuPhanCongDKVKiemTraItem.setDoiTruong(Validator.isNotNull(doiTruongLeader.getInspectorName()) ? doiTruongLeader.getInspectorName() : doiTruongValue);
							}
						}
						
						CorporationInspector corporationInspectorDangKiemVienKiemTra = CorporationInspectorLocalServiceUtil.fetchByInspectorId(dangKiemVien.getInspectorId());
						if(corporationInspectorDangKiemVienKiemTra != null){
							dangKiemVienKiemTraValue = corporationInspectorDangKiemVienKiemTra.getInspectorName();
						}
						phieuPhanCongDKVKiemTraItem.setDangKiemVienKiemTra(dangKiemVienKiemTraValue);
						List<ConfirmedInspection> lstConfirmedInspections =  ConfirmedInspectionLocalServiceUtil.findByInspectorIdAndNgayKiemTra(dangKiemVien.getInspectorId(), corporationView.getCorporationId(), ngayKiemTra);
						
						log.info("------------lstConfirmedInspections---doitruong----" + lstConfirmedInspections.size());
						phieuPhanCongDKVKiemTraDSHoSos = new ArrayList<PhieuPhanCongDKVKiemTraDSHoSo>();
						if(lstConfirmedInspections != null && lstConfirmedInspections.size() > 0){
							for(ConfirmedInspection confirmedInspection : lstConfirmedInspections){
								
								phieuPhanCongDKVKiemTraDSHoSo = new PhieuPhanCongDKVKiemTraDSHoSo();
								RegisteredInspection registeredInspection =  RegisteredInspectionLocalServiceUtil.fetchRegisteredInspection(confirmedInspection.getRegisteredInspectionId());
								if(registeredInspection != null){
									soHoSoValue = Validator.isNotNull(registeredInspection.getRegisteredNumber()) ? registeredInspection.getRegisteredNumber() : "";
								}
								List<VehicleRecord> lstVehicleRecords = VehicleRecordLocalServiceUtil.findByConfirmedInspectionId(confirmedInspection.getId());
								if(lstVehicleRecords != null && lstVehicleRecords.size() > 0){
									soLuongXeValue = lstVehicleRecords.size();
								}
								String diaDiemTemp = confirmedInspection.getInspectionSite();
								DmDataItem dmDataItemDistrictCode = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.ADMINISTRATIVE_UNITS , String.valueOf(confirmedInspection.getInspectionDistrictCode()));
								DmDataItem dmDataItemProvincecode = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.ADMINISTRATIVE_UNITS , String.valueOf(confirmedInspection.getInspectionProvincecode()));
								String diaDiemQuanTemp = Validator.isNotNull(dmDataItemDistrictCode) ? "/" + dmDataItemDistrictCode.getName() : "";
								String diaDiemThanhPhoTemp = Validator.isNotNull(dmDataItemProvincecode) ? "/" + dmDataItemProvincecode.getName() : "";
								diaDiemKiemTraValue = diaDiemTemp+diaDiemQuanTemp+diaDiemThanhPhoTemp;
								
								nguoiLienHeValue = Validator.isNotNull(confirmedInspection.getContactName()) ? confirmedInspection.getContactName() : "" ;
								soDienThoaiNguoiLienHeValue = Validator.isNotNull(confirmedInspection.getContactPhone()) ? confirmedInspection.getContactPhone() : "" ;
								
								phieuPhanCongDKVKiemTraDSHoSo.setSoHoSo(soHoSoValue);
								phieuPhanCongDKVKiemTraDSHoSo.setSoLuongXe(String.valueOf(soLuongXeValue));
								phieuPhanCongDKVKiemTraDSHoSo.setDiaDiemKiemTra(diaDiemKiemTraValue);
								phieuPhanCongDKVKiemTraDSHoSo.setNguoiLienHe(nguoiLienHeValue);
								phieuPhanCongDKVKiemTraDSHoSo.setSoDienThoaiNguoiLienHe(soDienThoaiNguoiLienHeValue);
								
								phieuPhanCongDKVKiemTraDSHoSos.add(phieuPhanCongDKVKiemTraDSHoSo);
							}
							
						}
						phieuPhanCongDKVKiemTraItem.setPhieuPhanCongDKVKiemTraDSHoSos(phieuPhanCongDKVKiemTraDSHoSos);
						if(lstConfirmedInspections != null && lstConfirmedInspections.size() >0){
							phieuPhanCongDKVKiemTraItems.add(phieuPhanCongDKVKiemTraItem);
						}
					}
				}
			}
		}else{ // khong phai lanh dao
			log.info("===PhieuPhanCongDKVKiemTraExport===Thanh Vien");
			phieuPhanCongDKVKiemTraItem = new PhieuPhanCongDKVKiemTraItem();
			
			Date dateNgayKiemTra = FormatData.parseDateShort3StringToDate(ngayKiemTra.trim());
			ngayKiemTraValue = FormatData.parseDateToTringDDMMYYY(dateNgayKiemTra);
			
			CorporationInspector corporationInspectorDangKiemVienKiemTra = CorporationInspectorLocalServiceUtil.fetchByInspectorId(userId);
			CorporationView corporationView = null;
			if(corporationInspectorDangKiemVienKiemTra != null){
				dangKiemVienKiemTraValue = Validator.isNotNull(corporationInspectorDangKiemVienKiemTra.getInspectorName())? corporationInspectorDangKiemVienKiemTra.getInspectorName() : "";
				//corporationInspectorDangKiemVienKiemTra.getCorporationId();
				corporationView = CorporationViewLocalServiceUtil.findByCorporationIdAndIsLeader(corporationInspectorDangKiemVienKiemTra.getCorporationId(), 1);
			}
			if(corporationView != null){
				CorporationInspector corporationInspectorDoiTruong = CorporationInspectorLocalServiceUtil.fetchByInspectorId(corporationView.getInspectorId());
				doiTruongValue = corporationInspectorDoiTruong.getInspectorName();
			}
			
			phieuPhanCongDKVKiemTraItem.setTenDoi(tenDoiValue);
			phieuPhanCongDKVKiemTraItem.setNgayKiemTra(ngayKiemTraValue); // dang yyyy/mm/dd hh:mm
			phieuPhanCongDKVKiemTraItem.setDangKiemVienKiemTra(dangKiemVienKiemTraValue);
			phieuPhanCongDKVKiemTraItem.setDoiTruong(doiTruongValue);
			
			
			// danh sach ho so o table
			List<ConfirmedInspection> lstConfirmedInspections =  ConfirmedInspectionLocalServiceUtil.findByInspectorIdAndNgayKiemTra(userId, corporationInspectorDangKiemVienKiemTra.getCorporationId(), ngayKiemTra);
			log.info("------------lstConfirmedInspections------" + lstConfirmedInspections.size());
			
			phieuPhanCongDKVKiemTraDSHoSos = new ArrayList<PhieuPhanCongDKVKiemTraDSHoSo>();
			
			if(lstConfirmedInspections != null && lstConfirmedInspections.size() > 0){
				for(ConfirmedInspection confirmedInspection : lstConfirmedInspections){
					phieuPhanCongDKVKiemTraDSHoSo = new PhieuPhanCongDKVKiemTraDSHoSo();
					RegisteredInspection registeredInspection =  RegisteredInspectionLocalServiceUtil.fetchRegisteredInspection(confirmedInspection.getRegisteredInspectionId());
					if(registeredInspection != null){
						soHoSoValue = Validator.isNotNull(registeredInspection.getRegisteredNumber()) ? registeredInspection.getRegisteredNumber() : "";
					}
					
					List<VehicleRecord> lstVehicleRecords = VehicleRecordLocalServiceUtil.findByConfirmedInspectionId(confirmedInspection.getId());
					if(lstVehicleRecords != null && lstVehicleRecords.size() > 0){
						soLuongXeValue = lstVehicleRecords.size();
					}
					
					String diaDiemTemp = confirmedInspection.getInspectionSite();
					
					DmDataItem dmDataItemDistrictCode = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.ADMINISTRATIVE_UNITS , String.valueOf(confirmedInspection.getInspectionDistrictCode()));
					DmDataItem dmDataItemProvincecode = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.ADMINISTRATIVE_UNITS , String.valueOf(confirmedInspection.getInspectionProvincecode()));
					String diaDiemQuanTemp = Validator.isNotNull(dmDataItemDistrictCode) ? "/" + dmDataItemDistrictCode.getName() : "";
					String diaDiemThanhPhoTemp = Validator.isNotNull(dmDataItemProvincecode) ? "/" + dmDataItemProvincecode.getName() : "";
					diaDiemKiemTraValue = diaDiemTemp+diaDiemQuanTemp+diaDiemThanhPhoTemp;
					
					nguoiLienHeValue = Validator.isNotNull(confirmedInspection.getContactName()) ? confirmedInspection.getContactName() : "" ;
					soDienThoaiNguoiLienHeValue = Validator.isNotNull(confirmedInspection.getContactPhone()) ? confirmedInspection.getContactPhone() : "" ;
					
					phieuPhanCongDKVKiemTraDSHoSo.setSoHoSo(soHoSoValue);
					phieuPhanCongDKVKiemTraDSHoSo.setSoLuongXe(String.valueOf(soLuongXeValue));
					phieuPhanCongDKVKiemTraDSHoSo.setDiaDiemKiemTra(diaDiemKiemTraValue);
					phieuPhanCongDKVKiemTraDSHoSo.setNguoiLienHe(nguoiLienHeValue);
					phieuPhanCongDKVKiemTraDSHoSo.setSoDienThoaiNguoiLienHe(soDienThoaiNguoiLienHeValue);
					
					phieuPhanCongDKVKiemTraDSHoSos.add(phieuPhanCongDKVKiemTraDSHoSo);
				}
			}
			phieuPhanCongDKVKiemTraItem.setPhieuPhanCongDKVKiemTraDSHoSos(phieuPhanCongDKVKiemTraDSHoSos);
			
			if(lstConfirmedInspections != null && lstConfirmedInspections.size() >0){
				phieuPhanCongDKVKiemTraItems.add(phieuPhanCongDKVKiemTraItem);
			}
		}
		
		result.setPhieuPhanCongDKVKiemTraItems(phieuPhanCongDKVKiemTraItems);
		
		return result;
	}
}
