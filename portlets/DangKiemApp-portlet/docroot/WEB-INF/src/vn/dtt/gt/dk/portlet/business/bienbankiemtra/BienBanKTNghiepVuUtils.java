
package vn.dtt.gt.dk.portlet.business.bienbankiemtra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionResponse;

import vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyPhuLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector;
import vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec;
import vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry;
import vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordSpecImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ProductionCountryImpl;
import vn.dtt.gt.dk.dao.nghiepvu.service.CfgTechnicalspecLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CustomsDeclarationLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionCommonStatusLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordSpecLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ProductionCountryLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupInitialLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleSpecificationLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleStatisticsLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialLocalServiceUtil;
import vn.dtt.gt.dk.portlet.business.TaoCauTrucSoDkAcBB;
import vn.dtt.gt.dk.report.ReportUtils;
import vn.dtt.gt.dk.utils.config.DKConfigurationManager;
import vn.dtt.gt.dk.utils.format.Constants;
import vn.dtt.gt.dk.utils.format.ConvertUtil;
import vn.dtt.gt.dk.utils.format.DateUtils;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.util.PortalUtil;

public class BienBanKTNghiepVuUtils {
	
	public static void insert2Inspectioncommonstatus(UploadPortletRequest request, ActionResponse response, VehicleGroup vehicleGroup, long inspectionRecordId)
		throws SystemException {
		
		_log.info("===VAO HAM == insert2Inspectioncommonstatus");
		
		/* 1. Thong tin chung */
		List<InspectionCommonStatus> lstThongTinChung =
			InspectionCommonStatusLocalServiceUtil.findByVehicleClassAndTypeAndInspecRecordIdOderBySequenceNo(vehicleGroup.getVehicleClass(), 1, -1);
		if (lstThongTinChung != null && lstThongTinChung.size() > 0) {
			int stt = 0;
			for (InspectionCommonStatus itemTTC : lstThongTinChung) {
				stt++;
				
				String giaTriSuaDoi = ParamUtil.getString(request, "giaTriKiemTraTTC" + itemTTC.getCommonCode());
				long giaTriKetQua = ParamUtil.getLong(request, "selLuaChonTTC" + stt);
				
		//		_log.info("[insert2Inspectioncommonstatus] giaTriKiemTraTTC" + itemTTC.getCommonCode() + ": " + giaTriSuaDoi);
			//	_log.info("[insert2Inspectioncommonstatus] selLuaChonTTC" + stt + ": " + giaTriKetQua);
				
				itemTTC.setId(CounterLocalServiceUtil.increment(InspectionCommonStatus.class.getName()));
				itemTTC.setItemName(giaTriSuaDoi);
				itemTTC.setCommonStatus(giaTriKetQua);
				itemTTC.setInspectionRecordId(inspectionRecordId);
				
				InspectionCommonStatusLocalServiceUtil.addInspectionCommonStatus(itemTTC);
			}
		}
		
		/* 2. An toan ky thuat */
		List<InspectionCommonStatus> lstkiemTraChatLuongAnToanKt =
			InspectionCommonStatusLocalServiceUtil.findByVehicleClassAndTypeAndInspecRecordIdOderBySequenceNo(vehicleGroup.getVehicleClass(), 2, -1);
		if (lstkiemTraChatLuongAnToanKt != null && lstkiemTraChatLuongAnToanKt.size() > 0) {
			int stt = 0;
			for (InspectionCommonStatus itemChatLuongAnToanKt : lstkiemTraChatLuongAnToanKt) {
				stt++;
				
				long giaTriKetQua = ParamUtil.getLong(request, "selChatLuongAnToanKt" + stt);
				
				itemChatLuongAnToanKt.setId(CounterLocalServiceUtil.increment(InspectionCommonStatus.class.getName()));
				itemChatLuongAnToanKt.setCommonStatus(giaTriKetQua);
				itemChatLuongAnToanKt.setInspectionRecordId(inspectionRecordId);
				
				InspectionCommonStatusLocalServiceUtil.addInspectionCommonStatus(itemChatLuongAnToanKt);
			}
		}
		
		/* 4. KIEM TRA ÃƒÆ’Ã¢â‚¬Å¾ÃƒÂ¯Ã‚Â¿Ã‚Â½OI CHIEU KET CAU KHI THAI */
		List<InspectionCommonStatus> lstKetCauKhiThais =
			InspectionCommonStatusLocalServiceUtil.findByVehicleClassAndTypeAndInspecRecordIdOderBySequenceNo(vehicleGroup.getVehicleClass(), 4, -1);
		
		if (lstKetCauKhiThais != null && lstKetCauKhiThais.size() > 0) {
			int stt = 0;
			for (InspectionCommonStatus itemKetCauKhiThai : lstKetCauKhiThais) {
				stt++;
				
				long giaTriKetQua = ParamUtil.getLong(request, "selKetCauKhiThaiKiHieu" + stt);
				
				itemKetCauKhiThai.setId(CounterLocalServiceUtil.increment(InspectionCommonStatus.class.getName()));
				itemKetCauKhiThai.setCommonStatus(giaTriKetQua);
				itemKetCauKhiThai.setInspectionRecordId(inspectionRecordId);
				
				InspectionCommonStatusLocalServiceUtil.addInspectionCommonStatus(itemKetCauKhiThai);
			}
		}
		
		/*  6. XAC NHAN CHI PHI PHAT SINH */
		List<InspectionCommonStatus> lstXacNhanChiPhiPhatSinhs =
			InspectionCommonStatusLocalServiceUtil.findByVehicleClassAndTypeAndInspecRecordIdOderBySequenceNo(vehicleGroup.getVehicleClass(), 6, -1);
		
		if (lstXacNhanChiPhiPhatSinhs != null && lstXacNhanChiPhiPhatSinhs.size() > 0) {
			for (InspectionCommonStatus itemXnChiPhi : lstXacNhanChiPhiPhatSinhs) {
				
				if (itemXnChiPhi.getCommonCode().contains("6_01")) {
					long giaTriKetQua = ParamUtil.getLong(request, "isTinhPhi");
					
					itemXnChiPhi.setId(CounterLocalServiceUtil.increment(InspectionCommonStatus.class.getName()));
					itemXnChiPhi.setCommonStatus(giaTriKetQua);
					itemXnChiPhi.setInspectionRecordId(inspectionRecordId);
					
					InspectionCommonStatusLocalServiceUtil.addInspectionCommonStatus(itemXnChiPhi);
					
				} else if (itemXnChiPhi.getCommonCode().contains("6_02")) {
					long giaTriKetQua = ParamUtil.getLong(request, "quangDuongPhatSinh");
					
					itemXnChiPhi.setInspectionRecordId(inspectionRecordId);
					itemXnChiPhi.setCommonStatus(giaTriKetQua);
					itemXnChiPhi.setId(CounterLocalServiceUtil.increment(InspectionCommonStatus.class.getName()));
					
					InspectionCommonStatusLocalServiceUtil.addInspectionCommonStatus(itemXnChiPhi);
					
				} else if (itemXnChiPhi.getCommonCode().contains("6_03")) {
					long giaTriKetQua = ParamUtil.getLong(request, "ghiChuChiPhiPhatSinh");
					
					itemXnChiPhi.setInspectionRecordId(inspectionRecordId);
					itemXnChiPhi.setCommonStatus(giaTriKetQua);
					itemXnChiPhi.setId(CounterLocalServiceUtil.increment(InspectionCommonStatus.class.getName()));
					
					InspectionCommonStatusLocalServiceUtil.addInspectionCommonStatus(itemXnChiPhi);
					
				} else if (itemXnChiPhi.getCommonCode().contains("6_04")) {
					String giaTriKetQua = ParamUtil.getString(request, "chiPhiPhatSinh");
					
					itemXnChiPhi.setInspectionRecordId(inspectionRecordId);
//					itemXnChiPhi.setCommonStatus(giaTriKetQua);
					itemXnChiPhi.setItemName(giaTriKetQua);
					itemXnChiPhi.setId(CounterLocalServiceUtil.increment(InspectionCommonStatus.class.getName()));
					
					InspectionCommonStatusLocalServiceUtil.addInspectionCommonStatus(itemXnChiPhi);
				}
			}
		}
	}
	public static void UpdateInspectionCommonStatus(UploadPortletRequest request, ActionResponse response, VehicleGroupInitial vehicleGroupInitial, long inspectionRecordId)
			throws SystemException {
				List<InspectionCommonStatus> lstThongTinChung = InspectionCommonStatusLocalServiceUtil.findByVehicleClassAndTypeAndInspecRecordIdOderBySequenceNo(vehicleGroupInitial.getVehicleClass(), 1, inspectionRecordId);
				
				if (lstThongTinChung != null && lstThongTinChung.size() > 0) {
					int stt = 0;
					for (InspectionCommonStatus item : lstThongTinChung) {
						stt++;
						
						item.setItemName(ParamUtil.getString(request, "giaTriKiemTraTTC" + item.getCommonCode()));
						item.setCommonStatus(ParamUtil.getLong(request, "selLuaChonTTC" + stt));
						
						_log.info("===UpdateInspectionCommonStatus===giaTriKiemTraTTC===" + item.getCommonCode() + ": " + item.getItemName());
						_log.info("===UpdateInspectionCommonStatus===selLuaChonTTC===" + stt + ": " + item.getCommonStatus());
						
						item.setInspectionRecordId(inspectionRecordId);
						
						InspectionCommonStatusLocalServiceUtil.updateInspectionCommonStatus(item);
					}
				}
				
				List<InspectionCommonStatus> lstkiemTraChatLuongAnToanKt = InspectionCommonStatusLocalServiceUtil.findByVehicleClassAndTypeAndInspecRecordIdOderBySequenceNo(vehicleGroupInitial.getVehicleClass(), 2, inspectionRecordId);
				if (lstkiemTraChatLuongAnToanKt != null && lstkiemTraChatLuongAnToanKt.size() > 0) {
					int stt = 0;
					for (InspectionCommonStatus item : lstkiemTraChatLuongAnToanKt) {
						stt++;
						item.setCommonStatus(ParamUtil.getLong(request, "selChatLuongAnToanKt" + stt));
						
						//_log.info("ItemName==" + stt + "=" + item.getItemName());
						//_log.info("CommonStatus==" + stt + "=" + ParamUtil.getString(request, "selChatLuongAnToanKt" + stt));
						item.setInspectionRecordId(inspectionRecordId);
						
						InspectionCommonStatusLocalServiceUtil.updateInspectionCommonStatus(item);
					}
				}
				
				List<InspectionCommonStatus> lstKetCauKhiThais = InspectionCommonStatusLocalServiceUtil.findByVehicleClassAndTypeAndInspecRecordIdOderBySequenceNo(vehicleGroupInitial.getVehicleClass(), 4, inspectionRecordId);
				if (lstKetCauKhiThais != null && lstKetCauKhiThais.size() > 0) {
					int stt = 0;
					for (InspectionCommonStatus item : lstKetCauKhiThais) {
						stt++;
						String select = ParamUtil.getString(request, "selKetCauKhiThaiKiHieu" + stt);
						//_log.info(item.getGroupName() + "==" + select);
						item.setCommonStatus(ConvertUtil.convertToLong(select));
						
						///????/?????????
					}
				}
				/*  6. XAC NHAN CHI PHI PHAT SINH */
				List<InspectionCommonStatus> lstXacNhanChiPhiPhatSinhs = InspectionCommonStatusLocalServiceUtil.findByVehicleClassAndTypeAndInspecRecordIdOderBySequenceNo(vehicleGroupInitial.getVehicleClass(), 6, inspectionRecordId);
				
				if (lstXacNhanChiPhiPhatSinhs != null && lstXacNhanChiPhiPhatSinhs.size() > 0) {
					for (InspectionCommonStatus itemXnChiPhi : lstXacNhanChiPhiPhatSinhs) {
						
						if (itemXnChiPhi.getCommonCode().contains("6_01")) {
							long giaTriKetQua = ParamUtil.getLong(request, "isTinhPhi");
							
							itemXnChiPhi.setCommonStatus(giaTriKetQua);
							itemXnChiPhi.setInspectionRecordId(inspectionRecordId);
							
							InspectionCommonStatusLocalServiceUtil.updateInspectionCommonStatus(itemXnChiPhi);
							
						} else if (itemXnChiPhi.getCommonCode().contains("6_02")) {
							long giaTriKetQua = ParamUtil.getLong(request, "quangDuongPhatSinh");
							
							itemXnChiPhi.setInspectionRecordId(inspectionRecordId);
							itemXnChiPhi.setCommonStatus(giaTriKetQua);
							
							InspectionCommonStatusLocalServiceUtil.updateInspectionCommonStatus(itemXnChiPhi);
							
						} else if (itemXnChiPhi.getCommonCode().contains("6_03")) {
							long giaTriKetQua = ParamUtil.getLong(request, "ghiChuChiPhiPhatSinh");
							
							itemXnChiPhi.setInspectionRecordId(inspectionRecordId);
							itemXnChiPhi.setCommonStatus(giaTriKetQua);
							
							InspectionCommonStatusLocalServiceUtil.updateInspectionCommonStatus(itemXnChiPhi);
						}  else if (itemXnChiPhi.getCommonCode().contains("6_04")) {
							String giaTriKetQua = ParamUtil.getString(request, "chiPhiPhatSinh");
							
							itemXnChiPhi.setInspectionRecordId(inspectionRecordId);
//							itemXnChiPhi.setCommonStatus(giaTriKetQua);
							itemXnChiPhi.setItemName(giaTriKetQua);
							
							InspectionCommonStatusLocalServiceUtil.updateInspectionCommonStatus(itemXnChiPhi);
						}
					}
				}
	}
	/*
	 *  3. KIEM TRA DOI CHIEU KET CAU - THONG SO KY THUAT XE
	 * 
	 * ======= INSERT TO  - InspectionRecordSpec -
	 * From : List<VehicleSpecification> lstVehicleSpecification
	 */
	
	public static List<ObjXmlDoiChieuThongSoKtXe> insert2InspectionRecordSpec(
			UploadPortletRequest request, VehicleGroup vehicleGroup, long inspectionRecordId)
		throws SystemException {
		
		_log.info("===VAO HAM == List<ObjXmlDoiChieuThongSoKtXe> insert2InspectionRecordSpec");
		
		List<ObjXmlDoiChieuThongSoKtXe> objXmlDoiChieuThongSoKtXes = new ArrayList<ObjXmlDoiChieuThongSoKtXe>();
		
		List<VehicleSpecification> lstVehicleSpecification =
			VehicleSpecificationLocalServiceUtil.findByVehicleSpecificationWithVehicleGroupIdAndVehicleTypeCode(
					vehicleGroup.getId(), vehicleGroup.getVehicleClass(), vehicleGroup.getVehicleType());
		
		//String[] specificationCodes = ParamUtil.getParameterValues(request, "specificationcode");
		
		String specCategoryChoose = ParamUtil.getString(request, "specCategoryChoose");
		
		List<String> specCodeBySpecCategory = null;
		
		// Lay danh sach SpecificationCode theo 2 nhom dong co khong chon
		if(vehicleGroup.getVehicleClass().equalsIgnoreCase("XCG") && Validator.isNotNull(specCategoryChoose)) {
			
			String[] maNhomDongCo = new String[]{"'" + Constants.NHOM_DONG_CO_DOT_TRONG + "'", 
					"'" + Constants.NHOM_DONG_CO_HYBIRD + "'", "'" + Constants.NHOM_DONG_CO_XE_CHAY_DIEN + "'"};
			
			String[] arrSpecCategory = ArrayUtil.remove(maNhomDongCo, "'" + specCategoryChoose + "'");
			
			_log.info("===specCategoryChoose===" + specCategoryChoose);
			_log.info("===KHONG_CHON_NHOM_DONG_CO===" + Arrays.toString(arrSpecCategory));
			
			if(arrSpecCategory != null && arrSpecCategory.length < 3) {
				specCodeBySpecCategory = CfgTechnicalspecLocalServiceUtil.getSpecificationCodeBySpecCategory(arrSpecCategory);
			}
		}
		
		//_log.info("===specificationCodes===" + Arrays.toString(specificationCodes));
		
		//TODO: HUYMQ DEBUG
		
		boolean flag = true;
		
		if (lstVehicleSpecification != null && lstVehicleSpecification.size() > 0) {
			int stt = 0;
			
			List<InspectionRecordSpec> lstInspectionRecordSpec = new ArrayList<InspectionRecordSpec>();
			
			for (VehicleSpecification itemVSpecification : lstVehicleSpecification) {
				if (!itemVSpecification.getSpecificationName().trim().equalsIgnoreCase(Constants.SPECIFICATION_NAME)) {
					
					if(stt == 0) {
						flag = false;
					}
					
					stt++;
					
					String giaTriSuaDoiCode = ParamUtil.getString(request, 
							"giaTriSuaDoiKetCauVaThongSoKtXe" + itemVSpecification.getSpecificationCode());
					
					long selLuaChonKetQua = ParamUtil.getLong(request, 
							"selLuaChonDangKiKetCauVaThongSoKtXe" + itemVSpecification.getSpecificationCode(), 
						Constants.SEL_KQ_DAT);
					
					String giaTriDangKyValue = ParamUtil.getString(request, 
							"giaTriDangKiKetCauVaThongSoKtXe" + itemVSpecification.getSpecificationCode());
					
					String giaTriSuaDoiValue = ParamUtil.getString(request, 
							"giaTriSuaDoiKetCauVaThongSoKtXe_" + itemVSpecification.getSpecificationCode());
					
					// Truong hop khong chon 2 nhom dong co trong 3 nhom dong co thi reset gia tri
					if(specCodeBySpecCategory != null && specCodeBySpecCategory.contains(
						itemVSpecification.getSpecificationCode())) {
						
						giaTriSuaDoiCode = "";
						selLuaChonKetQua = Constants.SEL_KQ_DAT;
						
						giaTriDangKyValue = "";
						giaTriSuaDoiValue = "";
					}
					
					if(Validator.isNotNull(giaTriSuaDoiCode)) {
						flag = true;
					}
					
					InspectionRecordSpec tempIRspect = new InspectionRecordSpecImpl();
					
					tempIRspect.setSpecificationCode(itemVSpecification.getSpecificationCode());
					tempIRspect.setSpecificationName(itemVSpecification.getSpecificationName());
					
					tempIRspect.setId(CounterLocalServiceUtil.increment(InspectionRecordSpec.class.getName()));
					tempIRspect.setInspectionRecordid(inspectionRecordId);
					
					tempIRspect.setSpecificationValue(giaTriSuaDoiCode);
					tempIRspect.setEvaluationResult(selLuaChonKetQua);
					
					//InspectionRecordSpecLocalServiceUtil.addInspectionRecordSpec(tempIRspect);
					lstInspectionRecordSpec.add(tempIRspect);
					
					//insert loai dong co vao vehicle group
					if(itemVSpecification.getSpecificationCode().trim().equalsIgnoreCase("DCX0006")){
						vehicleGroup.setEngineType(giaTriSuaDoiCode);
						vehicleGroup.setSynchDate(new Date());
						VehicleGroupLocalServiceUtil.updateVehicleGroup(vehicleGroup);
					}
					
					/* insert to obj tam*/

					ObjXmlDoiChieuThongSoKtXe objXml = new ObjXmlDoiChieuThongSoKtXe();
					
					objXml.setSpecificationCode(itemVSpecification.getSpecificationCode());
					objXml.setSpecificationName(itemVSpecification.getSpecificationName());
					objXml.setDeclarationValue(giaTriDangKyValue);
					objXml.setDeclarationValueEdit(giaTriSuaDoiValue);
					
					objXml.setDeclarationResult(ReportUtils.getVehicleCommonStatusName(selLuaChonKetQua));
					
					objXmlDoiChieuThongSoKtXes.add(objXml);
				}
			}
			
			if(!flag) {	// Truong hop tat ca cac gia gri thong so ky thuat deu khong co gia tri
				
				throw new SystemException("ERROR_THONG_SO_KY_THUAT_EMPTY_ALL");
			} else {
				if (lstInspectionRecordSpec != null && lstInspectionRecordSpec.size() > 0) {
					for(InspectionRecordSpec inspectionRecordSpec : lstInspectionRecordSpec) {
						InspectionRecordSpecLocalServiceUtil.addInspectionRecordSpec(inspectionRecordSpec);
					}
				}
			}
		}
		
		_log.info("==== List<ObjXmlDoiChieuThongSoKtXe> SIZE===" + objXmlDoiChieuThongSoKtXes.size());
		
		return objXmlDoiChieuThongSoKtXes;
	}
	
	/*
	 *  SET PARAM to table InspectionRecord
	 * 
	 */
	public List<VehicleRecord> getlstVehicleRecords(UploadPortletRequest request, ActionResponse response)
		throws SystemException {
		long soXe = ParamUtil.getLong(request, "soXeVehicleRecord");
		String arraySoxe = "";
		_log.info("--soXe--" + soXe);
		List<VehicleRecord> lstVehicleRecords = new ArrayList<VehicleRecord>();
		for (int i = 1; i <= soXe; i++) {
			_log.info("---i----" + i);
			long idVehicleRecordMau = ParamUtil.getLong(request, "idVehicleRecordMau" + i);
			String soKhungMauEdit = ParamUtil.getString(request, "soKhungMauEdit" + i);
			String soDongCoMauEdit = ParamUtil.getString(request, "soDongCoMauEdit" + i);
			String tinhTrangPhuongTienMauEdit = ParamUtil.getString(request, "tinhTrangPhuongTienMauEdit" + i);
			String mauXeMauEdit = ParamUtil.getString(request, "mauXeMauEdit" + i);
			String namSXXeMauEdit = ParamUtil.getString(request, "namSXXeMauEdit" + i);
			
//			_log.info("--idVehicleRecordMau-" + idVehicleRecordMau + "--soDongCoMauEdit--" + soDongCoMauEdit +
//				"--tinhTrangPhuongTienMauEdit-" + tinhTrangPhuongTienMauEdit + "--mauXeMauEdit--" + mauXeMauEdit + "--namSXXeMauEdit-" +
//				namSXXeMauEdit);
			
			VehicleRecord vehicleRecord = VehicleRecordLocalServiceUtil.fetchVehicleRecord(idVehicleRecordMau);
			if (vehicleRecord != null) {
				vehicleRecord.setChassisNumber(soKhungMauEdit);
				vehicleRecord.setEngineNumber(soDongCoMauEdit);
				vehicleRecord.setVehicleColor(mauXeMauEdit);
				vehicleRecord.setProductionYear(namSXXeMauEdit+"");
				vehicleRecord.setVehicleEngineStatus(tinhTrangPhuongTienMauEdit);
				vehicleRecord.setSynchDate(new Date());
				VehicleRecordLocalServiceUtil.updateVehicleRecord(vehicleRecord);
//				VehicleRecord vehicleRecord2 = VehicleRecordLocalServiceUtil.updateVehicleRecord(vehicleRecord);
				arraySoxe = arraySoxe + String.valueOf(idVehicleRecordMau) + ",";
//				lstVehicleRecords.add(vehicleRecord2);
//				_log.info("---update xong VehicleRecordLocalServiceUtil");
			}
		}
		String [] arraySoXeOrder = arraySoxe.split(",");
		String temp;
		for(int i=0; i<arraySoXeOrder.length; i++){ 
			for(int j=0; j<=i; j++){
			if(ConvertUtil.convertToLong(arraySoXeOrder[i])<=ConvertUtil.convertToLong(arraySoXeOrder[j])){ 
				temp = arraySoXeOrder[i];
				arraySoXeOrder[i] = arraySoXeOrder[j];
				arraySoXeOrder[j] = temp;
				}
			}
		}
		for(int i=0; i<arraySoXeOrder.length; i++){ 
			VehicleRecord vehicleRecord2 = VehicleRecordLocalServiceUtil.fetchVehicleRecord(ConvertUtil.convertToLong(arraySoXeOrder[i]));
			lstVehicleRecords.add(vehicleRecord2);
		}
		
		//Update InspectionRecord nhung xe bo chon ve = 0;
		String danhSachVehicleRecordBoChon = ParamUtil.getString(request, "danhSachVehicleRecordBoChon");
//		_log.info("===getlstVehicleRecords==danhSachVehicleRecordBoChon===" + danhSachVehicleRecordBoChon);
		String [] arraydanhSachVehicleRecordBoChon = danhSachVehicleRecordBoChon.split(",");
		if(arraydanhSachVehicleRecordBoChon != null && arraydanhSachVehicleRecordBoChon.length >0){
			for(int i = 0; i < arraydanhSachVehicleRecordBoChon.length; i++){
				VehicleRecord xeBoChon = VehicleRecordLocalServiceUtil.fetchVehicleRecord(ConvertUtil.convertToLong(arraydanhSachVehicleRecordBoChon[i]));
				if(xeBoChon != null){					
					
					VehiclerecordInitial vehicleRecordInitial = VehiclerecordInitialLocalServiceUtil.fetchVehiclerecordInitial(xeBoChon.getId());
					
					if(vehicleRecordInitial != null) {						
						// Sonvh Update lai thong tin ban dau cua xe bo chon, tranh thay doi
						xeBoChon.setCertificateRecordId(0);
						xeBoChon.setChassisNumber(vehicleRecordInitial.getChassisNumber());
						xeBoChon.setCodeNumber(vehicleRecordInitial.getCodeNumber());						
						xeBoChon.setControlRequirementId(vehicleRecordInitial.getControlRequirementId());
						xeBoChon.setCurrency(vehicleRecordInitial.getCurrency());
						xeBoChon.setDebitNoteId(0);
						xeBoChon.setDraftCertificateId(0);
						xeBoChon.setEmissionTestRequirementId(vehicleRecordInitial.getEmissionTestRequirementId());
						xeBoChon.setEngineNumber(vehicleRecordInitial.getEngineNumber());
						xeBoChon.setMarkAsSample(0);
						xeBoChon.setMarkUpStatus(vehicleRecordInitial.getMarkUpStatus());
						xeBoChon.setProductionYear(vehicleRecordInitial.getProductionYear());
						xeBoChon.setRemarks(vehicleRecordInitial.getRemarks());
						xeBoChon.setSafeTestRequirementId(vehicleRecordInitial.getSafeTestRequirementId());
						xeBoChon.setSequenceNo(vehicleRecordInitial.getSequenceNo());
						xeBoChon.setUnitPrice(vehicleRecordInitial.getUnitPrice());
						xeBoChon.setVehicleColor(vehicleRecordInitial.getVehicleColor());
						xeBoChon.setVehicleEngineStatus(vehicleRecordInitial.getVehicleEngineStatus());
						xeBoChon.setInspectionRecordId(0);
						xeBoChon.setVehicleGroupId(vehicleRecordInitial.getVehicleGroupId());
						xeBoChon.setSynchDate(new Date());
						
						VehicleRecordLocalServiceUtil.updateVehicleRecord(xeBoChon);
					}					
					
				}
			}
		}
		
		return lstVehicleRecords;
	}
	public static InspectionRecord insert2InspectionRecord(
			UploadPortletRequest request, ActionResponse response, long registerInspectionId, ConfirmedInspection confirmedInspection,long idHoSoThuTuc, RegisteredInspection registeredInspection, long soThuTuXeMau, String buttonType)
		throws SystemException {
		
//		long phieuXuLyPhuId = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU);
		
		long idConfirmedInspection = ParamUtil.getLong(request, Constants.ID_CONFIRMED_INSPECTION);
		
		Date inspectionDateFrom = DateUtils.stringToDate(ParamUtil.getString(request, "ngayKiemTraTuNgay"), "dd/MM/yyyy HH:mm");
		Date inspectionDateTo = DateUtils.stringToDate(ParamUtil.getString(request, "ngayKiemTraDenNgay"), "dd/MM/yyyy HH:mm");
		String noiDungKienNghi = ParamUtil.getString(request, "ghiChuInVaoGiayChungChi");
		String remarks = ParamUtil.getString(request, "yKienDangKiemVien");
		String provinceName = ParamUtil.getString(request, "provinceName");
		String districtCodAndProvinceCode = ParamUtil.getString(request, "districtCodAndProvinceCode");
		String inspectionSite = ParamUtil.getString(request, "inspectionSite");
		String chiPhiPhatSinh = ParamUtil.getString(request, "chiPhiPhatSinh");
		
		String diaDiemKiemTra = districtCodAndProvinceCode + " " + inspectionSite;
		if (diaDiemKiemTra == null || diaDiemKiemTra.length() == 0) {
			diaDiemKiemTra = "diaDiemKiemTra";
		}
		String chonPhuongThucKT = ParamUtil.getString(request, "chonPhuongThucKT");
		
		String markupControl = ParamUtil.getString(request, "markupControl");
		String markupEmissionTest = ParamUtil.getString(request, "markupEmissionTest");
		String markupSafeTest = ParamUtil.getString(request, "markupSafeTest");
		
		String confirmedResult = ParamUtil.getString(request, "selXuLyKetQua");
		
//		String soDangKyKiemTra = ParamUtil.getString(request, "soBienBanKiemTra");
		TaoCauTrucSoDkAcBB taoCauTrucSoDangKi = new TaoCauTrucSoDkAcBB();
		long userId = PortalUtil.getUserId(request);
		CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil.fetchByInspectorId(userId);
		String maNhanVien = (corporationInspector != null) ? corporationInspector.getContactcode() : "";
		String soDangKyKiemTra = "";
		if(buttonType.trim().equalsIgnoreCase(Constants.LAP_BIEN_BAN_KIEM_TRA)){
			// sonvh bosung 20170220 - thay doi quy tac sinh so bien ban kiem tra theo so thu tu xe mau.
			soDangKyKiemTra = taoCauTrucSoDangKi.quyDinhSoBienBanKiemTraTheoThuTuXeMau(registeredInspection.getRegisteredNumber(), maNhanVien, soThuTuXeMau);
			if (InspectionRecordLocalServiceUtil.countMaSoBienBanKiemTra(idHoSoThuTuc, soDangKyKiemTra) > 0){
				// phuong an phu lan 1: sinh so bien ban theo so tang dan
				soDangKyKiemTra = taoCauTrucSoDangKi.quyDinhSoBienBanKiemTra(registeredInspection.getRegisteredNumber(), maNhanVien);
				if (InspectionRecordLocalServiceUtil.countMaSoBienBanKiemTra(idHoSoThuTuc, soDangKyKiemTra) > 0){
					// phuong an phu lan 2: sinh so bien ban theo so tang dan
					soDangKyKiemTra = taoCauTrucSoDangKi.quyDinhSoBienBanKiemTra(registeredInspection.getRegisteredNumber(), maNhanVien);
				}
			}
			
		} else {
			soDangKyKiemTra = taoCauTrucSoDangKi.quyDinhSoBienBanKiemTraKhiChuaLapBBKT(registeredInspection.getRegisteredNumber(), maNhanVien);
		}
		InspectionRecord inspectionRecord = new InspectionRecordImpl();
		
		long idInspectionRecord = CounterLocalServiceUtil.increment(InspectionRecord.class.getName());
		
		inspectionRecord.setId(idInspectionRecord);
		
		inspectionRecord.setConfirmedInspectionId(idConfirmedInspection);
		inspectionRecord.setInspectionDateFrom((inspectionDateFrom == null) ? new Date() : inspectionDateFrom);
		inspectionRecord.setInspectionDateTo((inspectionDateTo == null) ? new Date() : inspectionDateTo);
		inspectionRecord.setDescription((noiDungKienNghi.length() == 0) ? "" : noiDungKienNghi);
		inspectionRecord.setRemarks(remarks);
		inspectionRecord.setOtherCosts(ConvertUtil.convertToLong(chiPhiPhatSinh));
		inspectionRecord.setMarkupPaid(0);
		inspectionRecord.setInspectionSite(provinceName);
		inspectionRecord.setInspectionMode(ConvertUtil.convertToLong(chonPhuongThucKT));
		
		inspectionRecord.setMarkupControl((markupControl.length() == 0) ? 0 : 1);
		inspectionRecord.setMarkupEmissionTest((markupEmissionTest.length() == 0) ? 0 : 1);
		inspectionRecord.setMarkupSafeTest((markupSafeTest.length() == 0) ? 0 : 1);
		
		inspectionRecord.setConfirmedResult(ConvertUtil.convertToLong(confirmedResult));
		
		inspectionRecord.setInspectionRecordDate((inspectionDateFrom == null) ? new Date() : inspectionDateFrom);
		
		inspectionRecord.setInspectionRecordNo(soDangKyKiemTra);
		
		inspectionRecord.setRegisteredInspectionId(registerInspectionId);
//		inspectionRecord.setPhieuXuLyPhuId(phieuXuLyPhuId);
		
		inspectionRecord.setCorporationId(confirmedInspection.getCorporationId());
		inspectionRecord.setInspectorId(confirmedInspection.getInspectorId());
		inspectionRecord.setHoSoThuTucId(idHoSoThuTuc);
		_log.info("--inspectionRecord-==ID==========" + inspectionRecord.getId());
		
		try {
			InspectionRecordLocalServiceUtil.addInspectionRecord(inspectionRecord);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return inspectionRecord;
	}
	
	public static void updateVehicleRecords(
		long idPhieuXyLyPhu, List<VehicleRecord> lstVehicleRecord, long inspectionRecordId, String listIdVehicleRecordMau, long registerInspectionId,
		TthcHoSoThuTuc tthcHoSoThuTuc, Long vehicleGroupId)
		throws SystemException {
		try {
			_log.info("--updateVehicleRecords-=action===========" + inspectionRecordId);
			if(lstVehicleRecord != null && lstVehicleRecord.size() >0){
			for (VehicleRecord item : lstVehicleRecord) {
				
				_log.info("--VehicleRecord-====update===ID=====" + item.getId());
				
				if(vehicleGroupId != null) {
					item.setVehicleGroupId(vehicleGroupId);
				}
				item.setInspectionRecordId(inspectionRecordId);
				
				if (listIdVehicleRecordMau.contains(item.getId() + ",")) {
					item.setMarkAsSample(1);
				} else {
					item.setMarkAsSample(0);
				}
				item.setSynchDate(new Date());
				
				VehicleRecordLocalServiceUtil.updateVehicleRecord(item);
			}
			}
			
			VehicleStatistics vehicleStatistics = VehicleStatisticsLocalServiceUtil.findByRegisteredInspectionId(registerInspectionId);
			vehicleStatistics.setTotalInspectedVehicle(vehicleStatistics.getTotalInspectedVehicle() + lstVehicleRecord.size());
			vehicleStatistics.setSynchDate(new Date());
			VehicleStatisticsLocalServiceUtil.updateVehicleStatistics(vehicleStatistics);
			
			MotCuaPhieuXuLyPhu phieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.fetchMotCuaPhieuXuLyPhu(idPhieuXyLyPhu);
			if(phieuXuLyPhu==null) return;
			// SO_BIEN_BAN_KIEM_TRA
			// MA_DANG_KIEM_VIEN
			String trichYeuNoiDung = DKConfigurationManager.getStrProp("TONG_SO_DANG_KY_KIEM_TRA", "Tong So Dang Ky Kiem Tra");
			trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalRegisteredVehicle() + " <br> ";
			trichYeuNoiDung =
				trichYeuNoiDung + DKConfigurationManager.getStrProp("SO_PHUONG_TIEN_CHUA_DE_NGHI_KIEM_TRA", "So Phuong Tien Chua De Nghi Kiem Tra");
			trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalNotYetRequestedVehicle() + " <br> ";
			
			trichYeuNoiDung = trichYeuNoiDung + DKConfigurationManager.getStrProp("SO_PT_DN_KT", "So Phuong Tien De Nghi Kiem Tra");
			trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalRequestedVehicle() + " <br> ";
			
			trichYeuNoiDung = trichYeuNoiDung + DKConfigurationManager.getStrProp("SO_PT_HOAN_KT", "So Phuong Tien Hoan Kiem Tra");
			trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalCancelledVehicle() + " <br> ";
			
			phieuXuLyPhu.setTrichYeuNoiDung(trichYeuNoiDung);
			
			MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(phieuXuLyPhu);
			trichYeuNoiDung = DKConfigurationManager.getStrProp("TONG_SO_DANG_KY_KIEM_TRA", "Tong So Dang Ky Kiem Tra");
			trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalRegisteredVehicle() + " <br> ";
			trichYeuNoiDung =
				trichYeuNoiDung + DKConfigurationManager.getStrProp("SO_PHUONG_TIEN_CHUA_DE_NGHI_KIEM_TRA", "So Phuong Tien Chua De Nghi Kiem Tra");
			trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalNotYetRequestedVehicle() + " <br> ";
			
			trichYeuNoiDung = trichYeuNoiDung + DKConfigurationManager.getStrProp("SO_PT_DN_KT", "So Phuong Tien De Nghi Kiem Tra");
			trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalRequestedVehicle() + " <br> ";
			
			trichYeuNoiDung = trichYeuNoiDung + DKConfigurationManager.getStrProp("SO_PT_DA_KT", "So Phuong Tien da Kiem Tra");
			trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalInspectedVehicle() + " <br> ";
			
			trichYeuNoiDung = trichYeuNoiDung + DKConfigurationManager.getStrProp("SO_PT_HOAN_KT", "So Phuong Tien hoan Kiem Tra");
			trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalCancelledVehicle() + " <br> ";
			
			if (tthcHoSoThuTuc != null) {
				tthcHoSoThuTuc.setTrichYeuNoiDung(trichYeuNoiDung);
				tthcHoSoThuTuc.setSynchDate(new Date());
				TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(tthcHoSoThuTuc);
			}
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public static void resetVehicleRecordsByVG_IR(long inspectionRecordId) {
		try {
			List<VehicleRecord> vehicleRecords = VehicleRecordLocalServiceUtil.findByInspectionRecordId(inspectionRecordId);
			
			long oldVehicleGroupId = 0;
			for (VehicleRecord vehicleRecord : vehicleRecords) {
				VehiclerecordInitial vehicleRecordInitial = VehiclerecordInitialLocalServiceUtil.fetchVehiclerecordInitial(vehicleRecord.getId());
				
				if(vehicleRecordInitial != null) {
					oldVehicleGroupId = vehicleRecord.getVehicleGroupId();
					
					vehicleRecord.setCertificateRecordId(0);
					vehicleRecord.setChassisNumber(vehicleRecordInitial.getChassisNumber());
					vehicleRecord.setCodeNumber(vehicleRecordInitial.getCodeNumber());
					// Khong duoc reset lich kiem tra cua xe huy bbkt. Phai giu lai Lich da xac nhan o lan dang ky gan nhat.
					//vehicleRecord.setConfirmedInspectionId(vehicleRecordInitial.getConfirmedInspectionId());
					vehicleRecord.setControlRequirementId(vehicleRecordInitial.getControlRequirementId());
					vehicleRecord.setCurrency(vehicleRecordInitial.getCurrency());
					vehicleRecord.setDebitNoteId(0);
					vehicleRecord.setDraftCertificateId(0);
					vehicleRecord.setEmissionTestRequirementId(vehicleRecordInitial.getEmissionTestRequirementId());
					vehicleRecord.setEngineNumber(vehicleRecordInitial.getEngineNumber());
					vehicleRecord.setMarkAsSample(0);
					vehicleRecord.setMarkUpStatus(vehicleRecordInitial.getMarkUpStatus());
					vehicleRecord.setProductionYear(vehicleRecordInitial.getProductionYear());
					vehicleRecord.setRemarks(vehicleRecordInitial.getRemarks());
					vehicleRecord.setSafeTestRequirementId(vehicleRecordInitial.getSafeTestRequirementId());
					vehicleRecord.setSequenceNo(vehicleRecordInitial.getSequenceNo());
					vehicleRecord.setUnitPrice(vehicleRecordInitial.getUnitPrice());
					vehicleRecord.setVehicleColor(vehicleRecordInitial.getVehicleColor());
					vehicleRecord.setVehicleEngineStatus(vehicleRecordInitial.getVehicleEngineStatus());
					vehicleRecord.setInspectionRecordId(0);
					vehicleRecord.setVehicleGroupId(vehicleRecordInitial.getVehicleGroupId());
					vehicleRecord.setSynchDate(new Date());
					
					VehicleRecordLocalServiceUtil.updateVehicleRecord(vehicleRecord);
				}
			}
			
			if(oldVehicleGroupId > 0) {
				BienBanKTNghiepVuUtils.deleteVehicleGroup(oldVehicleGroupId);
			}
		} catch(Exception e) {
			_log.error(e);
		}
	}
	
	public static void deleteVehicleGroup(long vehicleGroupId) {
		try {
			// Xoa vehicleGroup luc lap insert vao
			VehicleGroupLocalServiceUtil.deleteVehicleGroup(vehicleGroupId);
			
			// Xoa ProductionCountry ung voi VehicleGroup
			List<ProductionCountry> lstProductionCountries = ProductionCountryLocalServiceUtil.findByVehicleGroupId(vehicleGroupId);
			if (lstProductionCountries != null && lstProductionCountries.size() > 0) {
				for (ProductionCountry productionCountry : lstProductionCountries) {
					
						ProductionCountryLocalServiceUtil.deleteProductionCountry(productionCountry);
					
				}
			}
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public static VehicleGroup insertVehicleGroup(UploadPortletRequest request, ActionResponse response, VehicleGroup oldVehicleGroup) {
		VehicleGroup vehicleGroup = null;
		
		try {
			long vehicleGroupId = CounterLocalServiceUtil.increment(VehicleGroup.class.getName());
			
			vehicleGroup = VehicleGroupLocalServiceUtil.createVehicleGroup(vehicleGroupId);
			
			vehicleGroup.setHoSoThuTucId(oldVehicleGroup.getHoSoThuTucId());
			vehicleGroup.setAttachedFile(oldVehicleGroup.getAttachedFile());
			vehicleGroup.setVehicleClass(oldVehicleGroup.getVehicleClass());
			vehicleGroup.setRegisteredInspectionId(oldVehicleGroup.getRegisteredInspectionId());
			vehicleGroup.setTechnicalSpecCode(oldVehicleGroup.getTechnicalSpecCode()+"*");// thay doi so voi nhom TT ban dau
			vehicleGroup.setEngineType(oldVehicleGroup.getEngineType());
			vehicleGroup.setMarkAsVehicle(oldVehicleGroup.getMarkAsVehicle());
			vehicleGroup.setRemarks(oldVehicleGroup.getRemarks());
			
			String soThamChieu = ParamUtil.getString(request, "giaTriCodeTTC_SuaDoiTTC_1_06");
			String soAnToan = ParamUtil.getString(request, "giaTriCodeTTC_SuaDoiTTC_1_07");
			String soKhiThai = ParamUtil.getString(request, "giaTriCodeTTC_SuaDoiTTC_1_08");
			String soCOP = ParamUtil.getString(request, "giaTriCodeTTC_SuaDoiTTC_1_09");
			String loaiPhuongTien = ParamUtil.getString(request, "giaTriCodeTTC_SuaDoiTTC_1_10");
			String nhanHieu = ParamUtil.getString(request, "giaTriCodeTTC_SuaDoiTTC_1_11");
			String tenThuongMai = ParamUtil.getString(request, "giaTriCodeTTC_SuaDoiTTC_1_12");
			String maKieuLoai = ParamUtil.getString(request, "giaTriCodeTTC_SuaDoiTTC_1_13");
			String nuocSanXuat = ParamUtil.getString(request, "giaTriCodeTTC_SuaDoiTTC_1_14");
			String nhaMaySanXuat = ParamUtil.getString(request, "giaTriCodeTTC_SuaDoiTTC_1_15");
			String diaChiSanXuat = ParamUtil.getString(request, "giaTriCodeTTC_SuaDoiTTC_1_16");
			String tieuChuanKhiThai = ParamUtil.getString(request, "giaTriCodeTTC_SuaDoiTTC_1_17");
			
			_log.info("===giaTriCodeTTC_SuaDoiTTC_1_06===" + soThamChieu);
			_log.info("===giaTriCodeTTC_SuaDoiTTC_1_07===" + soAnToan);
			_log.info("===giaTriCodeTTC_SuaDoiTTC_1_08===" + soKhiThai);
			_log.info("===giaTriCodeTTC_SuaDoiTTC_1_09===" + soCOP);
			_log.info("===giaTriCodeTTC_SuaDoiTTC_1_10===" + loaiPhuongTien);
			_log.info("===giaTriCodeTTC_SuaDoiTTC_1_11===" + nhanHieu);
			_log.info("===giaTriCodeTTC_SuaDoiTTC_1_12===" + tenThuongMai);
			_log.info("===giaTriCodeTTC_SuaDoiTTC_1_13===" + maKieuLoai);
			_log.info("===giaTriCodeTTC_SuaDoiTTC_1_14===" + nuocSanXuat);
			_log.info("===giaTriCodeTTC_SuaDoiTTC_1_15===" + nhaMaySanXuat);
			_log.info("===giaTriCodeTTC_SuaDoiTTC_1_16===" + diaChiSanXuat);
			_log.info("===giaTriCodeTTC_SuaDoiTTC_1_17===" + tieuChuanKhiThai);
			
			vehicleGroup.setReferenceCertificateNo(soThamChieu);
			vehicleGroup.setSafetytestreportNo(soAnToan);
			vehicleGroup.setEmissiontestreportNo(soKhiThai);
			vehicleGroup.setCopreportNo(soCOP);
			vehicleGroup.setVehicleType(loaiPhuongTien);
			vehicleGroup.setTradeMark(nhanHieu);
			vehicleGroup.setCommercialName(tenThuongMai);
			vehicleGroup.setModelCode(maKieuLoai);
			vehicleGroup.setProductionPlant(nhaMaySanXuat);
			vehicleGroup.setAddressOfProductionPlant(diaChiSanXuat);
			vehicleGroup.setEmissionStandard(tieuChuanKhiThai);
			vehicleGroup.setSynchDate(new Date());
			
			//xoa ProductionCountry  truoc khi update lai
			List<ProductionCountry> lstProductionCountries = ProductionCountryLocalServiceUtil.findByVehicleGroupId(vehicleGroup.getId());
			if (lstProductionCountries != null && lstProductionCountries.size() > 0) {
				for (ProductionCountry productionCountry : lstProductionCountries) {
					ProductionCountryLocalServiceUtil.deleteProductionCountry(productionCountry);
				}
			}
			String[] counTry = nuocSanXuat.split(",");
			for (int i = 0; i < counTry.length; i++) {
				ProductionCountry productionCountry = new ProductionCountryImpl();
				productionCountry.setId(CounterLocalServiceUtil.increment(ProductionCountry.class.getName()));
				productionCountry.setCountryCode(counTry[i]);
				productionCountry.setVehicleGroupId(vehicleGroup.getId());
				ProductionCountryLocalServiceUtil.addProductionCountry(productionCountry);
			}
			
			VehicleGroupLocalServiceUtil.updateVehicleGroup(vehicleGroup);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return vehicleGroup;
	}
	
	public static void updateVehicleGroup(UploadPortletRequest request, ActionResponse response, VehicleGroup vehicleGroup) {
		try {
			String soThamChieu = ParamUtil.getString(request, "giaTriCodeTTC_SuaDoiTTC_1_06");
			String soAnToan = ParamUtil.getString(request, "giaTriCodeTTC_SuaDoiTTC_1_07");
			String soKhiThai = ParamUtil.getString(request, "giaTriCodeTTC_SuaDoiTTC_1_08");
			String soCOP = ParamUtil.getString(request, "giaTriCodeTTC_SuaDoiTTC_1_09");
			String loaiPhuongTien = ParamUtil.getString(request, "giaTriCodeTTC_SuaDoiTTC_1_10");
			String nhanHieu = ParamUtil.getString(request, "giaTriCodeTTC_SuaDoiTTC_1_11");
			String tenThuongMai = ParamUtil.getString(request, "giaTriCodeTTC_SuaDoiTTC_1_12");
			String maKieuLoai = ParamUtil.getString(request, "giaTriCodeTTC_SuaDoiTTC_1_13");
			String nuocSanXuat = ParamUtil.getString(request, "giaTriCodeTTC_SuaDoiTTC_1_14");
			String nhaMaySanXuat = ParamUtil.getString(request, "giaTriCodeTTC_SuaDoiTTC_1_15");
			String diaChiSanXuat = ParamUtil.getString(request, "giaTriCodeTTC_SuaDoiTTC_1_16");
			String tieuChuanKhiThai = ParamUtil.getString(request, "giaTriCodeTTC_SuaDoiTTC_1_17");
			
			_log.info("===giaTriCodeTTC_SuaDoiTTC_1_06===" + soThamChieu);
			_log.info("===giaTriCodeTTC_SuaDoiTTC_1_07===" + soAnToan);
			_log.info("===giaTriCodeTTC_SuaDoiTTC_1_08===" + soKhiThai);
			_log.info("===giaTriCodeTTC_SuaDoiTTC_1_09===" + soCOP);
			_log.info("===giaTriCodeTTC_SuaDoiTTC_1_10===" + loaiPhuongTien);
			_log.info("===giaTriCodeTTC_SuaDoiTTC_1_11===" + nhanHieu);
			_log.info("===giaTriCodeTTC_SuaDoiTTC_1_12===" + tenThuongMai);
			_log.info("===giaTriCodeTTC_SuaDoiTTC_1_13===" + maKieuLoai);
			_log.info("===giaTriCodeTTC_SuaDoiTTC_1_14===" + nuocSanXuat);
			_log.info("===giaTriCodeTTC_SuaDoiTTC_1_15===" + nhaMaySanXuat);
			_log.info("===giaTriCodeTTC_SuaDoiTTC_1_16===" + diaChiSanXuat);
			_log.info("===giaTriCodeTTC_SuaDoiTTC_1_17===" + tieuChuanKhiThai);
			
			vehicleGroup.setReferenceCertificateNo(soThamChieu);
			vehicleGroup.setSafetytestreportNo(soAnToan);
			vehicleGroup.setEmissiontestreportNo(soKhiThai);
			vehicleGroup.setCopreportNo(soCOP);
			vehicleGroup.setVehicleType(loaiPhuongTien);
			vehicleGroup.setTradeMark(nhanHieu);
			vehicleGroup.setCommercialName(tenThuongMai);
			vehicleGroup.setModelCode(maKieuLoai);
			vehicleGroup.setProductionPlant(nhaMaySanXuat);
			vehicleGroup.setAddressOfProductionPlant(diaChiSanXuat);
			vehicleGroup.setEmissionStandard(tieuChuanKhiThai);
			vehicleGroup.setSynchDate(new Date());
			
			//xoa ProductionCountry  truoc khi update lai
			List<ProductionCountry> lstProductionCountries = ProductionCountryLocalServiceUtil.findByVehicleGroupId(vehicleGroup.getId());
			if (lstProductionCountries != null && lstProductionCountries.size() > 0) {
				for (ProductionCountry productionCountry : lstProductionCountries) {
					ProductionCountryLocalServiceUtil.deleteProductionCountry(productionCountry);
				}
			}
			String[] counTry = nuocSanXuat.split(",");
			for (int i = 0; i < counTry.length; i++) {
				ProductionCountry productionCountry = new ProductionCountryImpl();
				productionCountry.setId(CounterLocalServiceUtil.increment(ProductionCountry.class.getName()));
				productionCountry.setCountryCode(counTry[i]);
				productionCountry.setVehicleGroupId(vehicleGroup.getId());
				ProductionCountryLocalServiceUtil.addProductionCountry(productionCountry);
			}
			
			VehicleGroupLocalServiceUtil.updateVehicleGroup(vehicleGroup);
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	/**
	 * Lay VehicleGroupInitial tu VehicleRecord
	 * <p> VehicleRecord -> VehiclerecordInitial -> VehicleRecordGroupId -> VehicleGroupInitial
	 * 
	 * @param vehicleRecord
	 * @return
	 */
	public static VehicleGroupInitial getVehicleGroupInitialByVehicleRecord(VehicleRecord vehicleRecord) {
		VehicleGroupInitial vehicleGroupInitial = null;
		
		try {
			VehiclerecordInitial vehiclerecordInitial = VehiclerecordInitialLocalServiceUtil.fetchVehiclerecordInitial(vehicleRecord.getId());
			
			if(vehiclerecordInitial != null) {
				vehicleGroupInitial = VehicleGroupInitialLocalServiceUtil.fetchVehicleGroupInitial(vehiclerecordInitial.getVehicleGroupId()); 
			}
		} catch(Exception e) {
			_log.error(e);
		}
		
		return vehicleGroupInitial;
	}
	
	/**
	 * Luu CustomsDeclaration. Neu soToKhaiHHNK la trong thi luu hoac xoa
	 * 
	 * @param request
	 * @param response
	 * @param confirmedInspection
	 * @return
	 */
	public static CustomsDeclaration saveCustomsDeclaration(
			UploadPortletRequest request, ActionResponse response,
			ConfirmedInspection confirmedInspection) {

		CustomsDeclaration customsDeclaration = null;

		try {
			long customsDeclarationId = confirmedInspection.getCustomsDeclarationId();

			boolean updateCustomsDeclaration = false;

			String soToKhaiHHNK = ParamUtil.getString(request, "giaTriCodeTTC_SuaDoiTTC_1_19");
			Date ngayToKhaiHHNK = DateUtils.stringToDate(ParamUtil.getString(request, "giaTriCodeTTC_SuaDoiTTC_1_20"), "dd/MM/yyyy HH:mm");

			if(Validator.isNotNull(soToKhaiHHNK)) {
				if(customsDeclarationId == 0) {
					customsDeclarationId = CounterLocalServiceUtil.increment(CustomsDeclaration.class.getName());

					customsDeclaration = CustomsDeclarationLocalServiceUtil.createCustomsDeclaration(customsDeclarationId);

					confirmedInspection.setCustomsDeclarationId(customsDeclarationId);
					updateCustomsDeclaration = true;
				} else {
					customsDeclaration = CustomsDeclarationLocalServiceUtil.getCustomsDeclaration(customsDeclarationId);
				}

				long idHoSoThuTuc = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
				
				customsDeclaration.setImportCustomDeclareNo(soToKhaiHHNK);
				customsDeclaration.setImportCustomDeclareDate(ngayToKhaiHHNK);
				customsDeclaration.setHosothutucId(idHoSoThuTuc);
				customsDeclaration.setCustomsResult(String.valueOf(1));
				customsDeclaration.setReleaseDate(ngayToKhaiHHNK);
				
				CustomsDeclarationLocalServiceUtil.updateCustomsDeclaration(customsDeclaration);
			} else if(Validator.isNull(soToKhaiHHNK) && customsDeclarationId > 0) {
				customsDeclaration = CustomsDeclarationLocalServiceUtil.getCustomsDeclaration(customsDeclarationId);
				
				confirmedInspection.setCustomsDeclarationId(0);
				updateCustomsDeclaration = true;
				
				CustomsDeclarationLocalServiceUtil.deleteCustomsDeclaration(customsDeclaration);
			}
			
			if(updateCustomsDeclaration) {
				ConfirmedInspectionLocalServiceUtil.updateConfirmedInspection(confirmedInspection);
			}
		} catch (Exception e) {
			_log.error(e);
		}
		
		return customsDeclaration;
	}
	
	/**
	 * Luu CustomsDeclaration vao BBKT trong InspectionRecord. Neu soToKhaiHHNK la trong thi luu hoac xoa
	 * 
	 * @param request
	 * @param response
	 * @param confirmedInspection
	 * @param inspectionRecordDetails
	 * @return
	 */
	public static CustomsDeclaration saveCustomsDeclarationToInspectionRecord(
			UploadPortletRequest request, ActionResponse response, ConfirmedInspection confirmedInspection,
			InspectionRecord inspectionRecordDetails) {

		CustomsDeclaration customsDeclaration = null;

		try {
			long customsDeclarationId = confirmedInspection.getCustomsDeclarationId();
			long customsDeclarationNewId = inspectionRecordDetails.getCustomsDeclarationid();

			boolean updateCustomsDeclaration = false;

			String soToKhaiHHNK = ParamUtil.getString(request, "giaTriCodeTTC_SuaDoiTTC_1_19");
			Date ngayToKhaiHHNK = DateUtils.stringToDate(ParamUtil.getString(request, "giaTriCodeTTC_SuaDoiTTC_1_20"), "dd/MM/yyyy HH:mm");

			if(Validator.isNotNull(soToKhaiHHNK) && (soToKhaiHHNK.length() > 0)){
								
				if(customsDeclarationNewId > 0){
					if (customsDeclarationId == 0){
					// So TKHQ khai bao khong co. TKHQ xuat hien luc kiem tra, duoc update nhieu lan
						customsDeclaration = CustomsDeclarationLocalServiceUtil.getCustomsDeclaration(customsDeclarationNewId);
					} else {
					// So TKHQ khai bao da co thong tin. Kiem tra trung voi TKHQ luc kiem tra
						if (customsDeclarationId == customsDeclarationNewId){
							// Neu trung voi TKHQ ban dau, tao moi thong tin kiem tra; Giu lai TKHQ ban dau
							customsDeclarationNewId = CounterLocalServiceUtil.increment(CustomsDeclaration.class.getName());

							customsDeclaration = CustomsDeclarationLocalServiceUtil.createCustomsDeclaration(customsDeclarationNewId);
							inspectionRecordDetails.setCustomsDeclarationid(customsDeclarationNewId);	
							updateCustomsDeclaration = true;

						} else {
							// So TKHQ ban dau khac voi TKHQ luc kiem tra, duoc update nhieu lan
							customsDeclaration = CustomsDeclarationLocalServiceUtil.getCustomsDeclaration(customsDeclarationNewId);
						}
					}
					
				} else {
					// BBKT tao moi thong tin TKHQ
					customsDeclarationNewId = CounterLocalServiceUtil.increment(CustomsDeclaration.class.getName());

					customsDeclaration = CustomsDeclarationLocalServiceUtil.createCustomsDeclaration(customsDeclarationNewId);
					inspectionRecordDetails.setCustomsDeclarationid(customsDeclarationNewId);	
					updateCustomsDeclaration = true;
				}

				long idHoSoThuTuc = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
				
				customsDeclaration.setImportCustomDeclareNo(soToKhaiHHNK);
				customsDeclaration.setImportCustomDeclareDate(ngayToKhaiHHNK);
				customsDeclaration.setHosothutucId(idHoSoThuTuc);
				customsDeclaration.setCustomsResult(String.valueOf(1));
				customsDeclaration.setReleaseDate(ngayToKhaiHHNK);
				
				CustomsDeclarationLocalServiceUtil.updateCustomsDeclaration(customsDeclaration);
			} else if(Validator.isNull(soToKhaiHHNK) && customsDeclarationNewId > 0) {
				
				inspectionRecordDetails.setCustomsDeclarationid(0);
				updateCustomsDeclaration = true;								
			} else {
				
				inspectionRecordDetails.setCustomsDeclarationid(0);
				updateCustomsDeclaration = true;
			}
			
			
			if(updateCustomsDeclaration) {
				//ConfirmedInspectionLocalServiceUtil.updateConfirmedInspection(confirmedInspection);
				InspectionRecordLocalServiceUtil.updateInspectionRecord(inspectionRecordDetails);
			}
		} catch (Exception e) {
			_log.error(e);
		}
		
		return customsDeclaration;
	}
	
	private static final Log _log = LogFactoryUtil.getLog(BienBanKTNghiepVuUtils.class);
}
