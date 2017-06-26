
package vn.dtt.gt.dk.portlet.business.bienbankiemtra;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec;
import vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ConfirmedInspectionImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordAttachImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupImpl;
import vn.dtt.gt.dk.dao.nghiepvu.service.CfgTechnicalspecLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordAttachLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordSpecLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupInitialLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceUtil;
import vn.dtt.gt.dk.message.BanTinSystemSignature;
import vn.dtt.gt.dk.nsw.message.xml.MessageFactory;
import vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord;
import vn.dtt.gt.dk.portlet.business.CallWebserviceNSWBusiness;
import vn.dtt.gt.dk.portlet.business.FunctionNghiepVu;
import vn.dtt.gt.dk.portlet.business.LanhDaoPhongBusiness;
import vn.dtt.gt.dk.portlet.business.NghiepVuBusiness;
import vn.dtt.gt.dk.portlet.business.TaoCauTrucSoDkAcBB;
import vn.dtt.gt.dk.report.ReportUtils;
import vn.dtt.gt.dk.utils.ActionKeys;
import vn.dtt.gt.dk.utils.config.DKConfigurationManager;
import vn.dtt.gt.dk.utils.document.DocumentUtils;
import vn.dtt.gt.dk.utils.format.Constants;
import vn.dtt.gt.dk.utils.format.ConvertUtil;
import vn.dtt.gt.dk.utils.format.DateUtils;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StreamUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.util.PortalUtil;

public class LapBienBanKiemTraAction {
	
	private Log log = LogFactoryUtil.getLog(LapBienBanKiemTraAction.class);
	
	NghiepVuBusiness nghiepVuBusiness = new NghiepVuBusiness();
	CallWebserviceNSWBusiness callWebserviceNSWBusiness = new CallWebserviceNSWBusiness();
	FunctionNghiepVu functionNghiepVu = new FunctionNghiepVu();
	
	public void thucHienLapBienBanKiemTra(ActionRequest actionRequest, ActionResponse response){
		
		UploadPortletRequest request = PortalUtil.getUploadPortletRequest(actionRequest);
		long userId = PortalUtil.getUserId(actionRequest);
		
		String fromDate = ParamUtil.getString(request, "formDate").trim();
		if (ActionKeys.checkFromDate(actionRequest, fromDate)) {
			log.info("==RE=START==thucHienLapBienBanKiemTra");
			return;
		}
		
		String buttonType = ParamUtil.getString(request, Constants.BUTTON_TYPE);
		log.info("===== buttonType - - buttonType " + buttonType);
		log.info("===START==thucHienLapBienBanKiemTra");
		
		long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.TTHC_THUTUCHANHCHINH_ID);
		long idHoSoThuTuc = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
		long idPhieuXyLyPhu = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU);
		
		long idVehicleGroup = ParamUtil.getLong(request, Constants.ID_VEHICLE_GROUP);
		// Khi thuc hien lap thi idVehicleGroupInitial = idVehicleGroup;
		long idVehicleGroupInitial = ParamUtil.getLong(request, Constants.ID_VEHICLE_GROUP);	
		
		String danhSachVehicleRecord = ParamUtil.getString(request, "danhSachVehicleRecord");
		String listIdVehicleRecordMau = ParamUtil.getString(request, "listVehicleRecordMau");
		String thanhPhanXuLy = ParamUtil.getString(request, Constants.THANH_PHAN_XU_LY);
		
		long inspectionRecordId = 0;
		long confirmedInspectionId = 0;
		
		log.info("===buttonType===" + buttonType);
		log.info("===confirmedInspectionId===" + confirmedInspectionId);
		log.info("===idHoSoThuTuc===" + idHoSoThuTuc);
		log.info("===idPhieuXyLyPhu===" + idPhieuXyLyPhu);
		log.info("===idVehicleGroup===" + idVehicleGroup);
		log.info("===danhSachVehicleRecord===" + danhSachVehicleRecord);
		log.info("===listIdVehicleRecordMau===" + listIdVehicleRecordMau);
		log.info("===thanhPhanXuLy===" + thanhPhanXuLy);
		log.info("===thuTucHanhChinhId===" + thuTucHanhChinhId);
		
		long newVehicleGroupId = idVehicleGroup;
		
		List<String> errors = new ArrayList<String>();
		
		try{
			
			List<VehiclerecordInitial> lstVehicleRecord = LanhDaoPhongBusiness.getListVehicleRecordInitial(danhSachVehicleRecord);
			if (lstVehicleRecord != null && lstVehicleRecord.size() > 0) {
				
				VehicleGroup vehicleGroup = new VehicleGroupImpl();
				try {
					vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(idVehicleGroup);
				} catch (SystemException e) {
					log.error(e);
				}
				
				ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil.findByPhieuXuLyPhuId(idPhieuXyLyPhu);
				if (confirmedInspection == null) {
					confirmedInspection = new ConfirmedInspectionImpl();
				}
				
				confirmedInspectionId = confirmedInspection.getId();
				
				long registerInspectionId = 0;
				RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(idHoSoThuTuc);
				if (registeredInspection != null) {
					registerInspectionId = registeredInspection.getId();
				}
				
				long sequenceno = 0; // lay so thu tu xe mau
				for (VehiclerecordInitial item : lstVehicleRecord) {
					if (listIdVehicleRecordMau.contains(item.getId() + ",")) {
						log.info("===VehiclerecordInitialId===" + item.getId());
						sequenceno = item.getSequenceNo();
					}

				} 
				if(buttonType.trim().equalsIgnoreCase(Constants.LAP_BIEN_BAN_KIEM_TRA) && (sequenceno==0)){
					return; // Khong lap bien ban kiem tra
				}
				/* 
				 * @huymq: Thay doi nghiep vu khac so voi truoc
				 * 
				 * Truoc: khi lap BBKT (InspectionRecord) se update vao VehicleGroup
				 * Thay doi se khong update ma insert
				*/
				
				log.info("===1 == insertVehicleGroup ");
				VehicleGroup newVehicleGroup = BienBanKTNghiepVuUtils.insertVehicleGroup(request, response, vehicleGroup);
				
				log.info("===2 == tao moi InspectionRecord");
				InspectionRecord inspectionRecord =
					BienBanKTNghiepVuUtils.insert2InspectionRecord(request, response, registerInspectionId, confirmedInspection,idHoSoThuTuc, registeredInspection, sequenceno, buttonType);
				
				List<ObjXmlDoiChieuThongSoKtXe> objXmlDoiChieuThongSoKtXes = null;
				List<VehicleRecord> lstVehicleRecords = null;
				
				if(newVehicleGroup != null && inspectionRecord != null) {
					newVehicleGroupId = newVehicleGroup.getId();
					log.info("===newVehicleGroupId===" + newVehicleGroupId);
				
					inspectionRecordId = inspectionRecord.getId();
					
					log.info("===3 == tao moi Inspection Record Spec");
					objXmlDoiChieuThongSoKtXes =
						BienBanKTNghiepVuUtils.insert2InspectionRecordSpec(request, newVehicleGroup, inspectionRecord.getId());
					
					log.info("===4 == insert2Inspectioncommonstatus");
					BienBanKTNghiepVuUtils.insert2Inspectioncommonstatus(request, response, newVehicleGroup, inspectionRecord.getId());
					
					log.info("===5 == saveCustomsDeclaration ");
					//BienBanKTNghiepVuUtils.saveCustomsDeclaration(request, response, confirmedInspection);
					BienBanKTNghiepVuUtils.saveCustomsDeclarationToInspectionRecord(request, response, confirmedInspection, inspectionRecord);
					
					//Update Danh sach sua doi xe
					lstVehicleRecords = new BienBanKTNghiepVuUtils().getlstVehicleRecords(request, response);
					log.info("===lstVehicleRecords size " + lstVehicleRecords.size());
					
					long counterTTKhacBySpTTKN = ParamUtil.getLong(request, "counterTTKhacBySp_TTKN");
					String itemRemovedOtherArrTTKN = ParamUtil.getString(request, "itemRemovedOtherArr_TTKN").trim();
					
					String itemPrefix = "";
					
					if(counterTTKhacBySpTTKN > 0){
						for (int i = 1; i <= counterTTKhacBySpTTKN; i++) {
							if(!itemRemovedOtherArrTTKN.contains("" + i)){
								InputStream inputStream = null;
								
								try {
									itemPrefix = "TTKN_" + i;
									
									String fileDinhKemUpload = "attachment_" + itemPrefix;
									log.info("attachment_" + i + " : " + fileDinhKemUpload);
									
									String fileName =  String.valueOf(request.getFileName(fileDinhKemUpload));
									log.info("fileName_" + i + " : " + fileName);
									
									inputStream = request.getFileAsStream(fileDinhKemUpload); // upload file
									
									if(inputStream != null && Validator.isNotNull(fileName)){
										byte[] fileContext =  DocumentUtils.getByteFromInputStream(inputStream);
										long entryId = DocumentUtils.uploadTaiLieu(fileContext, userId, fileName);
										
										InspectionRecordAttach inspectionRecordAttach = new  InspectionRecordAttachImpl();
										inspectionRecordAttach.setId(CounterLocalServiceUtil.increment(InspectionRecordAttach.class.getName()));
										inspectionRecordAttach.setInspectionRecordId(inspectionRecord.getId());
										inspectionRecordAttach.setHoSoThuTucId(idHoSoThuTuc);
										inspectionRecordAttach.setEnTryId(entryId);
										inspectionRecordAttach.setEnTryName(fileName);
										inspectionRecordAttach.setInspectorId(userId);
										inspectionRecordAttach.setUploadTime(new Date());
										inspectionRecordAttach.setMarkUpDelte(0);
										// 1 la xoa, 0 la chua xoa
										
										InspectionRecordAttachLocalServiceUtil.addInspectionRecordAttach(inspectionRecordAttach);
									}
								} catch(Exception e) {
									errors.add(BienBanKiemTraMessage.ATTACH_FILE_MAX_SIZE);
									throw new SystemException(e);
								} finally {
									StreamUtil.cleanUp(inputStream);
								}
							}
						}
					}
				} else {
					errors.add(BienBanKiemTraMessage.ERROR);
				}
				
				String dieuKienChuyenDich = "";
				
				if(buttonType.trim().equalsIgnoreCase(Constants.LAP_BIEN_BAN_KIEM_TRA)){
					nghiepVuBusiness.lapBienBanKiemTraDangKiemVien(
						idHoSoThuTuc, idPhieuXyLyPhu, dieuKienChuyenDich, userId, listIdVehicleRecordMau, inspectionRecord,
						objXmlDoiChieuThongSoKtXes, lstVehicleRecords, newVehicleGroup, registeredInspection, confirmedInspection);
					
					response.setRenderParameter(Constants.ID_HO_SO_THU_TUC, StringUtil.valueOf(idHoSoThuTuc));
					response.setRenderParameter(Constants.TTHC_THUTUCHANHCHINH_ID, ParamUtil.getString(request, Constants.TTHC_THUTUCHANHCHINH_ID));
					response.setRenderParameter(Constants.ID_PHIEU_XU_LY_PHU, StringUtil.valueOf(idPhieuXyLyPhu));
					response.setRenderParameter(Constants.THANH_PHAN_XU_LY, ParamUtil.getString(request, Constants.THANH_PHAN_XU_LY));
					
				} else if(buttonType.trim().equalsIgnoreCase(Constants.BIEN_BAN_LUU_TAM)){
					if(newVehicleGroup != null && lstVehicleRecords != null && lstVehicleRecords.size() >0){
						
						for (VehicleRecord item : lstVehicleRecords) {
							log.info("===VehicleRecordUpdateId===" + item.getId());
							
							item.setVehicleGroupId(newVehicleGroup.getId());
							item.setInspectionRecordId(inspectionRecord.getId());
							
							if (listIdVehicleRecordMau.contains(item.getId() + ",")) {
								item.setMarkAsSample(1);
							} else {
								item.setMarkAsSample(0);
							}
							item.setSynchDate(new Date());
							
							VehicleRecordLocalServiceUtil.updateVehicleRecord(item);
						}
					}
				}
			}
		} catch (Exception e) {
			errors.add(BienBanKiemTraMessage.ERROR);
			log.error(e);
		}
		
		// Trong qua trinh luu du lieu, neu co loi xay ra, van luu vao db nhung cho quay lai man hinh luu tam
		if(!errors.isEmpty() || buttonType.trim().equalsIgnoreCase(Constants.BIEN_BAN_LUU_TAM)) {
			for(String error : errors) {
				SessionErrors.add(actionRequest, error);
			}
			
			response.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(idHoSoThuTuc));
			response.setRenderParameter(Constants.ID_INSPECTION_RECORD, String.valueOf(inspectionRecordId));
			response.setRenderParameter(Constants.TTHC_THUTUCHANHCHINH_ID, String.valueOf(thuTucHanhChinhId));
			response.setRenderParameter(Constants.ID_PHIEU_XU_LY_PHU, String.valueOf(idPhieuXyLyPhu));
			response.setRenderParameter(Constants.ID_PHIEU_XU_LY_PHU_BBLT, String.valueOf(idPhieuXyLyPhu));
			response.setRenderParameter(Constants.THANH_PHAN_XU_LY, thanhPhanXuLy);
			response.setRenderParameter(Constants.ID_CONFIRMED_INSPECTION, String.valueOf(confirmedInspectionId));
			response.setRenderParameter(Constants.ID_VEHICLE_GROUP, String.valueOf(newVehicleGroupId));
			response.setRenderParameter(Constants.ID_VEHICLE_GROUP_INITIAL, String.valueOf(idVehicleGroupInitial));
			
			response.setRenderParameter("jspPage", "/portlet/quanlyhs/thulyhs/dangkiemvien/suabienbanktra_dangKiemVien.jsp");
		}
	}
	
	public void thucHienSuaBienBanKiemTra(ActionRequest actionRequest, ActionResponse response) {
		
		log.info("===START==thucHienSuaBienBanKiemTra");
		
		UploadPortletRequest request = PortalUtil.getUploadPortletRequest(actionRequest);
		
		long userId = PortalUtil.getUserId(actionRequest);
		
		String fromDate = ParamUtil.getString(request, "formDate").trim();
		if (ActionKeys.checkFromDate(actionRequest, fromDate)) {
			log.info("==RE=START==thucHienSuaBienBanKiemTra");
			return;
		}
		
		String buttonType = ParamUtil.getString(request, Constants.BUTTON_TYPE);

		long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.TTHC_THUTUCHANHCHINH_ID);
		long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
		long phieuXyLyPhuId = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU);
		long phieuXyLyPhuBBLTId = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU_BBLT);
		if(phieuXyLyPhuBBLTId < 2 ){
			phieuXyLyPhuBBLTId = phieuXyLyPhuId;
		}
		long vehicleGroupId = ParamUtil.getLong(request, Constants.ID_VEHICLE_GROUP);
		long vehicleGroupInitialId = ParamUtil.getLong(request, Constants.ID_VEHICLE_GROUP_INITIAL);
		long inspectionRecordId = ParamUtil.getLong(request, Constants.ID_INSPECTION_RECORD);
		long registeredInspectionId = ParamUtil.getLong(request, Constants.ID_REGISTERED_INSPECTION);
		long confirmedInspectionId = ParamUtil.getLong(request, Constants.ID_CONFIRMED_INSPECTION);
		
		String danhSachVehicleRecord = ParamUtil.getString(request, "danhSachVehicleRecord");
		String listIdVehicleRecordMau = ParamUtil.getString(request, "listVehicleRecordMau");
		long soPhuongTienKiemTraBanDau = ParamUtil.getLong(request, "soPhuongTienKiemTraBanDau");
		
		String thanhPhanXuLy = ParamUtil.getString(request, Constants.THANH_PHAN_XU_LY);
		
		if(buttonType.trim().equalsIgnoreCase(Constants.LAP_BIEN_BAN_KIEM_TRA) && (listIdVehicleRecordMau.trim().length() == 0)){
			return; // Khong thuc hien Hoan tat bien ban kiem tra
		}
		log.info("===buttonType===" + buttonType);
		log.info("===confirmedInspectionId===" + confirmedInspectionId);
		log.info("===idHoSoThuTuc===" + hoSoThuTucId);
		log.info("===idPhieuXyLyPhu===" + phieuXyLyPhuId);
		log.info("===phieuXyLyPhuBBLTId===" + phieuXyLyPhuBBLTId);
		log.info("===idVehicleGroup===" + vehicleGroupId);
		log.info("===idInspectionRecord===" + inspectionRecordId);
		log.info("===registeredInspectionId===" + registeredInspectionId);
		log.info("===danhSachVehicleRecord===" + danhSachVehicleRecord);
		log.info("===listIdVehicleRecordMau===" + listIdVehicleRecordMau);
		log.info("===thanhPhanXuLy===" + thanhPhanXuLy);
		log.info("===thuTucHanhChinhId===" + thuTucHanhChinhId);
		
		List<String> errors = new ArrayList<String>();
		
		try {
			
			ConfirmedInspection confirmedInspection = null;
			
			if(confirmedInspectionId > 0) {
				confirmedInspection = ConfirmedInspectionLocalServiceUtil.fetchConfirmedInspection(confirmedInspectionId);
			} else {
				confirmedInspection = ConfirmedInspectionLocalServiceUtil.findByPhieuXuLyPhuId(phieuXyLyPhuBBLTId);
			}
			
			if (confirmedInspection == null) {
				confirmedInspection = new ConfirmedInspectionImpl();
			}
			
			InspectionRecord inspectionRecord = InspectionRecordLocalServiceUtil.fetchInspectionRecord(inspectionRecordId);
			VehicleGroupInitial vehicleGroupInitial = VehicleGroupInitialLocalServiceUtil.fetchVehicleGroupInitial(vehicleGroupInitialId);
			VehicleGroup vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleGroupId);
			RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil.fetchRegisteredInspection(registeredInspectionId);
			
			BienBanKTNghiepVuUtils.UpdateInspectionCommonStatus(request, response, vehicleGroupInitial, inspectionRecordId);
			
			List<VehicleRecord> lstVehicleRecords = new BienBanKTNghiepVuUtils().getlstVehicleRecords(request, response);
			
			List<ObjXmlDoiChieuThongSoKtXe> objXmlDoiChieuThongSoKtXes = new ArrayList<ObjXmlDoiChieuThongSoKtXe>();
			
			List<InspectionRecordSpec> lstInspectionRecordSpec = InspectionRecordSpecLocalServiceUtil.findByInspectionRecordId(inspectionRecordId);
			
			//String[] specificationCodes = ParamUtil.getParameterValues(request, "specificationcode");
			
			//log.info("===specificationCodes.length===" + specificationCodes.length);
			
			String specCategoryChoose = ParamUtil.getString(request, "specCategoryChoose");
			
			List<String> specCodeBySpecCategory = null;
			
			// Lay danh sach SpecificationCode theo 2 nhom dong co khong chon
			if(vehicleGroup.getVehicleClass().equalsIgnoreCase("XCG") && Validator.isNotNull(specCategoryChoose)) {
				
				String[] maNhomDongCo = new String[]{"'" + Constants.NHOM_DONG_CO_DOT_TRONG + "'", 
						"'" + Constants.NHOM_DONG_CO_HYBIRD + "'", "'" + Constants.NHOM_DONG_CO_XE_CHAY_DIEN + "'"};
				
				String[] arrSpecCategory = ArrayUtil.remove(maNhomDongCo, "'" + specCategoryChoose + "'");
				
				//log.info("===specCategoryChoose===" + specCategoryChoose);
				//log.info("===KHONG_CHON_NHOM_DONG_CO===" + Arrays.toString(arrSpecCategory));
				
				if(arrSpecCategory != null && arrSpecCategory.length < 3) {
					specCodeBySpecCategory = CfgTechnicalspecLocalServiceUtil.getSpecificationCodeBySpecCategory(arrSpecCategory);
				}
			}
			
			//TODO: HUYMQ DEBUG
			
			boolean flag = true;
			
			if (lstInspectionRecordSpec != null && lstInspectionRecordSpec.size() > 0) {
				//int stt = 0;
				flag = false;
				
				for (InspectionRecordSpec item: lstInspectionRecordSpec) {
					//stt++;
					String giaTriSuaDoiCode = ParamUtil.getString(request, 
							"giaTriSuaDoiKetCauVaThongSoKtXe" + item.getSpecificationCode());
					long selLuaChonKetQua = ParamUtil.getLong(request, 
							"selLuaChonDangKiKetCauVaThongSoKtXe" + item.getSpecificationCode(), 
							Constants.SEL_KQ_DAT);
					
					String giaTriDangKyValue = ParamUtil.getString(request, 
							"giaTriDangKiKetCauVaThongSoKtXe" + item.getSpecificationCode());
					String giaTriSuaDoiValue = ParamUtil.getString(request, 
							"giaTriSuaDoiKetCauVaThongSoKtXe_" + item.getSpecificationCode());
					
					// Truong hop khong chon 2 nhom dong co trong 3 nhom dong co thi reset gia tri
					if(specCodeBySpecCategory != null && specCodeBySpecCategory.contains(
							item.getSpecificationCode())) {
						
						giaTriSuaDoiCode = "";
						selLuaChonKetQua = Constants.SEL_KQ_DAT;
						
						giaTriDangKyValue = "";
						giaTriSuaDoiValue = "";
					}
					
					item.setSpecificationValue(giaTriSuaDoiCode);
					item.setEvaluationResult(selLuaChonKetQua);
					
					if(Validator.isNotNull(giaTriSuaDoiCode)) {
						flag = true;
					}
					
					//insert loai dong co vao vehicle group
					if(item.getSpecificationCode().trim().equalsIgnoreCase("DCX0006")){
						vehicleGroup.setEngineType(giaTriSuaDoiCode);
						vehicleGroup.setSynchDate(new Date());
						VehicleGroupLocalServiceUtil.updateVehicleGroup(vehicleGroup);
					}
					
					ObjXmlDoiChieuThongSoKtXe objXml = new ObjXmlDoiChieuThongSoKtXe();
					
					objXml.setSpecificationCode(item.getSpecificationCode());
					objXml.setSpecificationName(item.getSpecificationName());
					objXml.setDeclarationValue(giaTriDangKyValue);
					objXml.setDeclarationValueEdit(giaTriSuaDoiValue);
					
					objXml.setDeclarationResult(ReportUtils.getVehicleCommonStatusName(selLuaChonKetQua));
					
					objXmlDoiChieuThongSoKtXes.add(objXml);
				}
			}
			
			if(!flag) {	// Truong hop tat ca cac gia gri thong so ky thuat deu khong co gia tri
				
				//TODO: DEBUG
				if (lstInspectionRecordSpec != null && lstInspectionRecordSpec.size() > 0) {
					for(InspectionRecordSpec inspectionRecordSpec : lstInspectionRecordSpec) {
						log.info("==giaTriSuaDoiKetCauVaThongSoKtXe==" + inspectionRecordSpec.getSpecificationCode() + "===" + ParamUtil.getString(request, "giaTriSuaDoiKetCauVaThongSoKtXe" + inspectionRecordSpec.getSpecificationCode()));
					}
				}
				
				throw new SystemException("ERROR_THONG_SO_KY_THUAT_EMPTY_ALL");
			} else {
				if (lstInspectionRecordSpec != null && lstInspectionRecordSpec.size() > 0) {
					for(InspectionRecordSpec inspectionRecordSpec : lstInspectionRecordSpec) {
						InspectionRecordSpecLocalServiceUtil.updateInspectionRecordSpec(inspectionRecordSpec);
					}
				}
			}
			
			Date inspectionDateFrom = DateUtils.stringToDate(ParamUtil.getString(request, "ngayKiemTraTuNgay"), "dd/MM/yyyy HH:mm");
			Date inspectionDateTo = DateUtils.stringToDate(ParamUtil.getString(request, "ngayKiemTraDenNgay"), "dd/MM/yyyy HH:mm");
			String chonPhuongThucKT = ParamUtil.getString(request, "chonPhuongThucKT");
			
			if(buttonType.trim().equalsIgnoreCase(Constants.LAP_BIEN_BAN_KIEM_TRA)){
				TaoCauTrucSoDkAcBB taoCauTrucSoDangKi = new TaoCauTrucSoDkAcBB();
				CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil.fetchByInspectorId(userId);
				String maNhanVien = (corporationInspector != null) ? corporationInspector.getContactcode() : "";
				// sonvh bosung 20170220 - thay doi quy tac sinh so bien ban kiem tra theo so thu tu xe mau.
				long sequenceno = 0; // lay so thu tu xe mau
				for (VehicleRecord item : lstVehicleRecords) {
					if (listIdVehicleRecordMau.contains(item.getId() + ",")) {
						log.info("===VehiclerecordId===" + item.getId());
						sequenceno = item.getSequenceNo();
					}

				}
				String soDangKyKiemTra = "";
				soDangKyKiemTra = taoCauTrucSoDangKi.quyDinhSoBienBanKiemTraTheoThuTuXeMau(registeredInspection.getRegisteredNumber(), maNhanVien, sequenceno);
				if (InspectionRecordLocalServiceUtil.countMaSoBienBanKiemTra(hoSoThuTucId, soDangKyKiemTra) > 0){
					// phuong an phu lan 1: sinh so bien ban theo so tang dan
					soDangKyKiemTra = taoCauTrucSoDangKi.quyDinhSoBienBanKiemTra(registeredInspection.getRegisteredNumber(), maNhanVien);
					if (InspectionRecordLocalServiceUtil.countMaSoBienBanKiemTra(hoSoThuTucId, soDangKyKiemTra) > 0){
						// phuong an phu lan 2: sinh so bien ban theo so tang dan
						soDangKyKiemTra = taoCauTrucSoDangKi.quyDinhSoBienBanKiemTra(registeredInspection.getRegisteredNumber(), maNhanVien);
					}
				}
				//soDangKyKiemTra = taoCauTrucSoDangKi.quyDinhSoBienBanKiemTra(registeredInspection.getRegisteredNumber(), maNhanVien);
				inspectionRecord.setInspectionRecordNo(soDangKyKiemTra);
			}
			
			inspectionRecord.setInspectionDateFrom((inspectionDateFrom == null) ? new Date() : inspectionDateFrom);
			inspectionRecord.setInspectionDateTo((inspectionDateTo == null) ? new Date() : inspectionDateTo);
			inspectionRecord.setInspectionRecordDate(inspectionRecord.getInspectionDateFrom());
			inspectionRecord.setInspectionMode(ConvertUtil.convertToLong(chonPhuongThucKT));
			
			long result = ParamUtil.getLong(request, "selXuLyKetQua");
			inspectionRecord.setConfirmedResult(result);
			
			String denghithunghiemntoan = ParamUtil.getString(request, "markupSafeTest");
			
			if (denghithunghiemntoan.equalsIgnoreCase("1")) {
				if (inspectionRecord.getMarkupSafeTest() < 1) {
					inspectionRecord.setMarkupSafeTest(1);
				}
			} else {
				inspectionRecord.setMarkupSafeTest(0);
			}
			
			String denghithunghiepkhithai = ParamUtil.getString(request, "markupEmissionTest");
			
			if (denghithunghiepkhithai.equalsIgnoreCase("1")) {
				if (inspectionRecord.getMarkupEmissionTest() < 1) {
					inspectionRecord.setMarkupEmissionTest(1);
				}
			} else {
				inspectionRecord.setMarkupEmissionTest(0);
			}
			String denghigiaminh = ParamUtil.getString(request, "markupControl");
			if (denghigiaminh.equalsIgnoreCase("1")) {
				if (inspectionRecord.getMarkupControl() < 1) {
					inspectionRecord.setMarkupControl(1);
				}
			} else {
				inspectionRecord.setMarkupControl(0);
			}
			
			String ykiendangkiemvien = ParamUtil.getString(request, "yKienDangKiemVien");
	
			inspectionRecord.setRemarks(ykiendangkiemvien);
	
			String ghiChu = ParamUtil.getString(request, "ghiChuInVaoGiayChungChi");
	
			inspectionRecord.setDescription(ghiChu);
			
			String chiPhiPhatSinh = ParamUtil.getString(request, "chiPhiPhatSinh");
			inspectionRecord.setOtherCosts(ConvertUtil.convertToLong(chiPhiPhatSinh));
			inspectionRecord.setMarkupPaid(0);
			
			InspectionRecordLocalServiceUtil.updateInspectionRecord(inspectionRecord);
			
			log.info("===4 == updateVehicleGroup ");
			BienBanKTNghiepVuUtils.updateVehicleGroup(request, response, vehicleGroup);
			
			log.info("===5 == saveCustomsDeclaration ");
			BienBanKTNghiepVuUtils.saveCustomsDeclarationToInspectionRecord(request, response, confirmedInspection, inspectionRecord);
			
			long counterTTKhacBySpTTKN = ParamUtil.getLong(request, "counterTTKhacBySp_TTKN");
			String itemRemovedOtherArrTTKN = ParamUtil.getString(request, "itemRemovedOtherArr_TTKN").trim();
			
			String itemPrefix = "";
			if(counterTTKhacBySpTTKN > 0){
				for (int i = 1; i <= counterTTKhacBySpTTKN; i++) {
					if(!itemRemovedOtherArrTTKN.contains("" + i)){
						
						InputStream inputStream = null;
						
						try {
						
							itemPrefix = "TTKN_" + i;
							String fileDinhKemUpload = "attachment_" + itemPrefix;
							log.info("attachment_" + i + " : " + fileDinhKemUpload);
							String fileName =  String.valueOf(request.getFileName(fileDinhKemUpload));
							log.info("fileName_" + i + " : " + fileName);
							
							inputStream = request.getFileAsStream(fileDinhKemUpload); // upload file
							
							if(inputStream != null && Validator.isNotNull(fileName)){
								byte[] fileContext = DocumentUtils.getByteFromInputStream(inputStream);
								long entryId = DocumentUtils.uploadTaiLieu(fileContext, userId, fileName);
								
								InspectionRecordAttach inspectionRecordAttach = new InspectionRecordAttachImpl();
								inspectionRecordAttach.setId(CounterLocalServiceUtil.increment(InspectionRecordAttach.class.getName()));
								inspectionRecordAttach.setInspectionRecordId(inspectionRecord.getId());
								inspectionRecordAttach.setHoSoThuTucId(hoSoThuTucId);
								inspectionRecordAttach.setEnTryId(entryId);
								inspectionRecordAttach.setEnTryName(fileName);
								inspectionRecordAttach.setInspectorId(userId);
								inspectionRecordAttach.setUploadTime(new Date());
								inspectionRecordAttach.setMarkUpDelte(0);
								// 1 la xoa, 0 la chua xoa
								
								InspectionRecordAttachLocalServiceUtil.addInspectionRecordAttach(inspectionRecordAttach);
							}
						} catch(Exception e) {
							errors.add(BienBanKiemTraMessage.ATTACH_FILE_MAX_SIZE);
							throw new SystemException(e);
						} finally {
							StreamUtil.cleanUp(inputStream);
						}
					}
				}
			}
			
			String dieuKienChuyenDich = "";
			
			if(buttonType.trim().equalsIgnoreCase(Constants.SUA_BIEN_BAN_KIEM_TRA)){
				suaBienBanKiemTra(response, request, hoSoThuTucId, phieuXyLyPhuId,
						userId, registeredInspectionId, listIdVehicleRecordMau,
						soPhuongTienKiemTraBanDau, inspectionRecord,
						lstVehicleRecords, objXmlDoiChieuThongSoKtXes,
						lstInspectionRecordSpec);
				
				response.setRenderParameter(Constants.ID_HO_SO_THU_TUC, StringUtil.valueOf(hoSoThuTucId));
				response.setRenderParameter(Constants.ID_PHIEU_XU_LY_PHU, StringUtil.valueOf(phieuXyLyPhuId));
				response.setRenderParameter(Constants.TTHC_THUTUCHANHCHINH_ID, String.valueOf(thuTucHanhChinhId));
				response.setRenderParameter(Constants.THANH_PHAN_XU_LY, thanhPhanXuLy);
				
			} else if(buttonType.trim().equalsIgnoreCase(Constants.BIEN_BAN_LUU_TAM)){
				luuTamBienBan(response, request, hoSoThuTucId, phieuXyLyPhuId, phieuXyLyPhuBBLTId,
						vehicleGroupInitialId, listIdVehicleRecordMau,
						inspectionRecord, vehicleGroup, lstVehicleRecords);
			} else if(buttonType.trim().equalsIgnoreCase(Constants.LAP_BIEN_BAN_KIEM_TRA)){
				
				nghiepVuBusiness.lapBienBanKiemTraDangKiemVien(
						hoSoThuTucId, phieuXyLyPhuId, dieuKienChuyenDich, userId, listIdVehicleRecordMau, inspectionRecord,
					objXmlDoiChieuThongSoKtXes, lstVehicleRecords, vehicleGroup, registeredInspection, confirmedInspection);
				
				response.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
				response.setRenderParameter(Constants.ID_PHIEU_XU_LY_PHU, String.valueOf(phieuXyLyPhuId));
				response.setRenderParameter(Constants.TTHC_THUTUCHANHCHINH_ID, String.valueOf(thuTucHanhChinhId));
				response.setRenderParameter(Constants.THANH_PHAN_XU_LY, thanhPhanXuLy);
			}
		
		} catch (Exception e) {
			errors.add(BienBanKiemTraMessage.ERROR);
			log.error(e);
		}
		
		// Trong qua trinh luu du lieu, neu co loi xay ra, van luu vao db nhung cho quay lai man hinh luu tam
		if(!errors.isEmpty() || buttonType.trim().equalsIgnoreCase(Constants.BIEN_BAN_LUU_TAM)) {
			for(String error : errors) {
				SessionErrors.add(actionRequest, error);
			}
			
			response.setRenderParameter(Constants.ID_HO_SO_THU_TUC, StringUtil.valueOf(hoSoThuTucId));
			response.setRenderParameter(Constants.ID_INSPECTION_RECORD, String.valueOf(inspectionRecordId));
			response.setRenderParameter(Constants.TTHC_THUTUCHANHCHINH_ID, String.valueOf(thuTucHanhChinhId));
			response.setRenderParameter(Constants.ID_PHIEU_XU_LY_PHU, String.valueOf(phieuXyLyPhuId));
			response.setRenderParameter(Constants.ID_PHIEU_XU_LY_PHU_BBLT, String.valueOf(phieuXyLyPhuBBLTId));
			response.setRenderParameter(Constants.THANH_PHAN_XU_LY, thanhPhanXuLy);
			response.setRenderParameter(Constants.ID_VEHICLE_GROUP, String.valueOf(vehicleGroupId));
			response.setRenderParameter(Constants.ID_VEHICLE_GROUP_INITIAL, String.valueOf(vehicleGroupInitialId));
			
			response.setRenderParameter("jspPage", "/portlet/quanlyhs/thulyhs/dangkiemvien/suabienbanktra_dangKiemVien.jsp");
		}
	}

	private void suaBienBanKiemTra(ActionResponse response,
			UploadPortletRequest request, long hoSoThuTucId,
			long phieuXyLyPhuId, long userId, long registeredInspectionId,
			String listIdVehicleRecordMau, long soPhuongTienKiemTraBanDau,
			InspectionRecord inspectionRecord,
			List<VehicleRecord> lstVehicleRecords,
			List<ObjXmlDoiChieuThongSoKtXe> objXmlDoiChieuThongSoKtXes,
			List<InspectionRecordSpec> lstInspectionRecordSpec)
			throws SystemException {
		//log.info("===vao== buttonType - - SuaBienBanKiemTra ");
		if(lstVehicleRecords != null && lstVehicleRecords.size() >0){
			for (VehicleRecord item : lstVehicleRecords) {
				
				log.info("--VehicleRecord-====update===ID=====" + item.getId());
				
				item.setInspectionRecordId(inspectionRecord.getId());
				
				if (listIdVehicleRecordMau.contains(item.getId() + ",")) {
					item.setMarkAsSample(1);
				} else {
					item.setMarkAsSample(0);
				}
				item.setSynchDate(new Date());
				
				VehicleRecordLocalServiceUtil.updateVehicleRecord(item);
			}
		}
		
		nghiepVuBusiness.suaBienBanKiemtra(hoSoThuTucId, phieuXyLyPhuId, userId, registeredInspectionId, inspectionRecord, lstInspectionRecordSpec, lstVehicleRecords, objXmlDoiChieuThongSoKtXes, soPhuongTienKiemTraBanDau);
	}

	private void luuTamBienBan(ActionResponse response,
			UploadPortletRequest request, long hoSoThuTucId, long phieuXyLyPhuId,
			long phieuXyLyPhuBBLTId, long vehicleGroupInitialId,
			String listIdVehicleRecordMau, InspectionRecord inspectionRecord,
			VehicleGroup vehicleGroup, List<VehicleRecord> lstVehicleRecords)
			throws SystemException {
		if(lstVehicleRecords != null && lstVehicleRecords.size() >0){
			for (VehicleRecord item : lstVehicleRecords) {
				log.info("--VehicleRecord-====update===ID=====" + item.getId());
				
				item.setInspectionRecordId(inspectionRecord.getId());
				
				if (listIdVehicleRecordMau.contains(item.getId() + ",")) {
					item.setMarkAsSample(1);
				} else {
					item.setMarkAsSample(0);
				}
				item.setSynchDate(new Date());
				
				VehicleRecordLocalServiceUtil.updateVehicleRecord(item);
			}
		}
	}
	
	//ha minh xem lai dung ko
	public boolean suaVehiclerecordInitial(long hoSoThuTucId, long phieuXuLyPhuId, String dieuKienChuyenDich, long userId, String listIdVehicleRecordMau,
		InspectionRecord inspectionRecord, List<ObjXmlDoiChieuThongSoKtXe> objXmlDoiChieuThongSoKtXes, List<VehiclerecordInitial> vehicleRecords, VehicleGroupInitial vehicleGroup,
		RegisteredInspection registeredInspection, ConfirmedInspection confirmedInspection) {
		boolean result = true;
		try {
			
			TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
			
			//BienBanKTNghiepVuUtils.updateVehicleRecords(phieuXuLyPhuId, vehicleRecords, inspectionRecord.getId(), listIdVehicleRecordMau, registeredInspection.getId(), tthcHoSoThuTuc);
			
			//VehicleInspectionRecord vehicleInspectionRecord =NghiepVuBusiness.noiDungBienBanKiemTraDKV(hoSoThuTucId, phieuXuLyPhuId, userId, vehicleGroup, vehicleRecords, inspectionRecord, null, registeredInspection, objXmlDoiChieuThongSoKtXes);
			VehicleInspectionRecord vehicleInspectionRecord = null;
			int messageType = 221;
			String messageFunction = "30";
			
			
			String xml = MessageFactory.convertObjectToXml(vehicleInspectionRecord);
			xml = callWebserviceNSWBusiness.builtXML(userId + "", tthcHoSoThuTuc, functionNghiepVu.getRamdomMessage(), Constants.VERSION_START, messageFunction, messageType, xml, BanTinSystemSignature.systemSignature());
			
			long loaiTaiLieu = Constants.LOAI_TAI_LIEU_KET_QUA_CHUA_KY;
			String mauTrucTuyen = "";
			if (vehicleGroup.getVehicleClass().trim().equalsIgnoreCase("DCX")) {
				mauTrucTuyen = Constants.MAU_TRUC_TUYEN_BIENBANKIEMTRA_DONGCO;
			} else {
				mauTrucTuyen = Constants.MAU_TRUC_TUYEN_BIENBANKIEMTRA;
			}
			
			String tenTaiLieu =
				DKConfigurationManager.getStrProp("bien_ban_kiem_tra_phuong_tien_nhap_khau", "bien_ban_kiem_tra_phuong_tien_nhap_khau") + "   " +
					inspectionRecord.getInspectionRecordNo();
			
			long idNoiDungHoSo = nghiepVuBusiness.taoNoiDungHoSo(userId, xml, tthcHoSoThuTuc, loaiTaiLieu, mauTrucTuyen, tenTaiLieu,0);
			inspectionRecord.setAttachedFile(idNoiDungHoSo);
			
			InspectionRecordLocalServiceUtil.updateInspectionRecord(inspectionRecord);
			dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.du.dieu.kien.kt", "du.dieu.kien.kt");
			String lyDo = null;
			if (vehicleGroup.getReferenceCertificateNo() != null && vehicleGroup.getReferenceCertificateNo().length() > 0) {
				lyDo = DKConfigurationManager.getStrProp("cothamchieu", "cothamchieu") + vehicleGroup.getReferenceCertificateNo();
			}
			nghiepVuBusiness.ketThucKiemTra(hoSoThuTucId, userId, dieuKienChuyenDich, inspectionRecord, lyDo);
			
			if (confirmedInspection != null) {
				long count1 = VehicleRecordLocalServiceUtil.countByConfirmedInspectionIdAndInspectionRecordId(confirmedInspection.getId());
				long count2 = VehicleRecordLocalServiceUtil.countByConfirmedInspectionIdAndMarkUpStatus(confirmedInspection.getId());
				long count3 = VehicleRecordLocalServiceUtil.countByConfirmedInspectionId(confirmedInspection.getId());
				long count = count1 + count2;
				
				if (count >= count3) {
					nghiepVuBusiness.ketThucKiemTraHienTruong(hoSoThuTucId, phieuXuLyPhuId, userId, confirmedInspection.getId());
				}
			}
		} catch (Exception e) {
			log.error(e);
			result = false;
		}
		return result;
	}
}
