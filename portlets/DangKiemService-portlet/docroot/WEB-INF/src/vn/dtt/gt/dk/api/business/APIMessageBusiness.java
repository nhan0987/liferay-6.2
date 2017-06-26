package vn.dtt.gt.dk.api.business;

import java.util.Date;

import com.google.gson.Gson;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import vn.dtt.gt.dk.api.bean.tbtralai.RemovedSchedule;
import vn.dtt.gt.dk.api.util.ApiUtils;
import vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection;
import vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordLocalServiceUtil;
import vn.dtt.gt.dk.message.BanTinSystemSignature;
import vn.dtt.gt.dk.nsw.CreateMessageFactory;
import vn.dtt.gt.dk.portlet.business.MotCuaBusiness;
import vn.dtt.gt.dk.portlet.business.NghiepVuBoSungBusiness;
import vn.dtt.gt.dk.portlet.business.NghiepVuBusiness;
import vn.dtt.gt.dk.sendmessage.MessgaePriorityLevels;
import vn.dtt.gt.dk.sendmessage.SendMessgaeFunctions;
import vn.dtt.gt.dk.utils.config.DKConfigurationManager;
import vn.dtt.gt.dk.utils.format.Constants;
import vn.dtt.gt.dk.utils.format.FormatData;

public class APIMessageBusiness {
	public static Gson gson = new Gson();
	
	//NghiepVuBoSungBusiness.thongBaoHoanKiemTra
	public static void message104(long userId,
			RegisteredInspection registeredInspection,
			TthcHoSoThuTuc hoSoThuTuc, String jsonData)
		throws Exception {
		
		vn.dtt.gt.dk.api.bean.xacnhanhoankiemtra.ConfirmOfRemovedSchedule apiObject = gson.fromJson(
				jsonData, vn.dtt.gt.dk.api.bean.xacnhanhoankiemtra.ConfirmOfRemovedSchedule.class);
		
		long confirmedInspectionCode = GetterUtil.getLong(apiObject.getRequestId());
		
		ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil
				.getByR_G(registeredInspection.getId(), confirmedInspectionCode);
		
		NghiepVuBoSungBusiness nghiepVuBoSungBusiness = new NghiepVuBoSungBusiness();
		
		nghiepVuBoSungBusiness.thongBaoHoanKiemTra(hoSoThuTuc,
				registeredInspection, confirmedInspection, apiObject);
	}
	
	public static String message20(long userId, TthcHoSoThuTuc hoSoThuTuc, String jsonData) 
			throws Exception {
		
		String messageIdSentToNSW = ApiUtils.getRamdomMessage();
		SendMessgaeFunctions messgaeFunctions = new  SendMessgaeFunctions();
		MotCuaBusiness motCuaBusiness = new MotCuaBusiness();
		
		vn.dtt.gt.dk.api.bean.canbotbycbs.RequestChanges apiObject = gson.fromJson(
				jsonData, vn.dtt.gt.dk.api.bean.canbotbycbs.RequestChanges.class);
		
		String reason = apiObject.getReason();
		String userName = apiObject.getName();
		
		Date dateHanChotBoSung = FormatData.parseStringToDate(
			ApiUtils.apiDateToMsgDate(apiObject.getFinishedDate()));
		
		String xmlData =
			CreateMessageFactory.createMessageRequestChanges(
				new Date(), apiObject.getOrganization(), apiObject.getDivision(),
				userName, reason, Validator.isNull(dateHanChotBoSung) ? new Date() : dateHanChotBoSung);
		
		String xml = messgaeFunctions.insertMesssageToQueue(userName,
				hoSoThuTuc, Constants.VERSION_START, messageIdSentToNSW, "20",
				99, xmlData, BanTinSystemSignature.systemSignature(),
				MessgaePriorityLevels.HIGHT, null);
		
		String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.khong.phu.hop", "khong.phu.hop");
		
		messgaeFunctions.insertKeHoachChuyenDich(null, hoSoThuTuc.getId(), dieuKienChuyenDich, 
				reason, messageIdSentToNSW, null, "20", "99");
		
		motCuaBusiness.dichChuyenTrangThaiPhieuSuLyChinh(hoSoThuTuc.getId(), dieuKienChuyenDich, userId);
		
		String ghiChu =
			"<font color='red'> " + DKConfigurationManager.getStrProp("xacnhanhuythutuc", "DK: [ ") + FormatData.parseDateToTringType3(new Date()) + " ] ";
		ghiChu = ghiChu + reason + " </font>" + " <br> ";
		ghiChu = ghiChu + hoSoThuTuc.getGhiChu();
		hoSoThuTuc.setGhiChu(ghiChu);
		hoSoThuTuc.setSynchdate(new Date());
		
		TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(hoSoThuTuc);
		
		return xml;
	}
	
	public static void message401(long userId,
			long registeredInspectionId,
			TthcHoSoThuTuc hoSoThuTuc, String jsonData) 
		throws Exception {
		
		RemovedSchedule apiObject = gson.fromJson(jsonData, RemovedSchedule.class);
		
		long confirmedInspectionCode = GetterUtil.getLong(apiObject.getRequestId());
		
		ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil
				.getByR_G(registeredInspectionId, confirmedInspectionCode);

		NghiepVuBoSungBusiness nghiepVuBoSungBusiness = new NghiepVuBoSungBusiness();
		
		nghiepVuBoSungBusiness.traLichKiemTraChoLanhDao(
			hoSoThuTuc.getId(), confirmedInspection, userId, apiObject);
	}
	
	//QuanLyHoSoAction.lapBanDangKyAnToan
	public static void message203(long userId, long registeredInspectionId,
			TthcHoSoThuTuc hoSoThuTuc, String jsonData) 
		throws Exception {

		vn.dtt.gt.dk.api.bean.tbdntnantoan.RequestOfSafeTesting apiObject = gson.fromJson(
				jsonData, vn.dtt.gt.dk.api.bean.tbdntnantoan.RequestOfSafeTesting.class);
		
		InspectionRecord inspectionRecord = InspectionRecordLocalServiceUtil
				.getByR_I(registeredInspectionId, apiObject.getInspectionRecordNumber());
		
		NghiepVuBusiness nghiepVuBusiness = new NghiepVuBusiness();
		
		nghiepVuBusiness.lapDeNghiThuNhiemAnToan(hoSoThuTuc, userId,
				registeredInspectionId, inspectionRecord, apiObject);
		
		inspectionRecord.setMarkupSafeTest(Constants.MARKUP_INSPECTION_RECORD_DA_LAP);
		inspectionRecord.setSynchdate(new Date());
		
		InspectionRecordLocalServiceUtil.updateInspectionRecord(inspectionRecord);
	}
	
	//QuanLyHoSoAction.lapBanDangKyKhiThai
	public static void message202(long userId, long registeredInspectionId,
			TthcHoSoThuTuc hoSoThuTuc, String jsonData) 
		throws Exception {

		vn.dtt.gt.dk.api.bean.tbdntnkhithai.RequestOfEmissionTesting apiObject = gson.fromJson(
				jsonData, vn.dtt.gt.dk.api.bean.tbdntnkhithai.RequestOfEmissionTesting.class);
		
		InspectionRecord inspectionRecord = InspectionRecordLocalServiceUtil
				.getByR_I(registeredInspectionId, apiObject.getInspectionRecordNumber());
		
		NghiepVuBusiness nghiepVuBusiness = new NghiepVuBusiness();
		
		nghiepVuBusiness.lapDeNghiThuNhiemKhiThai(userId,
				registeredInspectionId, hoSoThuTuc, inspectionRecord, apiObject);
		
		inspectionRecord.setMarkupEmissionTest(Constants.MARKUP_INSPECTION_RECORD_DA_LAP);
		inspectionRecord.setSynchdate(new Date());
		
		InspectionRecordLocalServiceUtil.updateInspectionRecord(inspectionRecord);
	}
	
	//QuanLyHoSoAction.lapBanDangKyGiamDinh
	public static void message204(long userId, long registeredInspectionId,
			TthcHoSoThuTuc hoSoThuTuc, String jsonData) 
		throws Exception {

		vn.dtt.gt.dk.api.bean.tbtcgd.RequestForControl apiObject = gson.fromJson(
				jsonData, vn.dtt.gt.dk.api.bean.tbtcgd.RequestForControl.class);
		
		InspectionRecord inspectionRecord = InspectionRecordLocalServiceUtil
				.getByR_I(registeredInspectionId, apiObject.getInspectionRecordNumber());
		
		NghiepVuBusiness nghiepVuBusiness = new NghiepVuBusiness();
		
		nghiepVuBusiness.lapDeNghiGiamDinh(userId, registeredInspectionId,
				hoSoThuTuc, inspectionRecord, apiObject);
		
		inspectionRecord.setMarkupControl(Constants.MARKUP_INSPECTION_RECORD_DA_LAP);
		inspectionRecord.setSynchdate(new Date());
		
		InspectionRecordLocalServiceUtil.updateInspectionRecord(inspectionRecord);
	}
}
