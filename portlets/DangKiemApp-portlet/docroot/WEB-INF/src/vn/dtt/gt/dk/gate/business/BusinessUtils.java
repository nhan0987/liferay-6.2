/**
 * 
 */

package vn.dtt.gt.dk.gate.business;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.codec.binary.Base64;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue;
import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.service.AswmsgMessageQueueLocalServiceUtil;
import vn.dtt.gt.dk.dao.aswmsg.service.AswmsgValidationLogLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.model.DmDataItem;
import vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich;
import vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo;
import vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo;
import vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh;
import vn.dtt.gt.dk.dao.common.model.impl.TthcHoSoThuTucImpl;
import vn.dtt.gt.dk.dao.common.model.impl.TthcNoidungHoSoImpl;
import vn.dtt.gt.dk.dao.common.model.impl.DmDataItemImpl;
import vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcKeHoachChuyenDichLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaNotification;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhanCongXuLy;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDienBienHoSoImpl;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaKetQuaDienBienImpl;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaNotificationImpl;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhanCongXuLyImpl;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyChinhImpl;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyPhuImpl;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaDienBienHoSoLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaKetQuaDienBienLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaNotificationLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaPhanCongXuLyLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyChinhLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyPhuLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaQuyTrinhThuTucLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaTrangThaiHoSoLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate;
import vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate;
import vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ExchangeRateImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.NewExchangeRateImpl;
import vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ExchangeRateLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.NewExchangeRateLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ProductionCountryLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupInitialLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleSpecificationLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleStatisticsLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialLocalServiceUtil;
import vn.dtt.gt.dk.gate.threat.ObjectExcute;
import vn.dtt.gt.dk.gate.threat.ThreadPassingBanKhai;
import vn.dtt.gt.dk.message.FunctionType;
import vn.dtt.gt.dk.message.MessageKey;
import vn.dtt.gt.dk.message.MessageReturnUtils;
import vn.dtt.gt.dk.message.MessageType;
import vn.dtt.gt.dk.message.MessageUtils;
import vn.dtt.gt.dk.message.dao.AswmsgMessageLogDao;
import vn.dtt.gt.dk.nsw.Header;
import vn.dtt.gt.dk.nsw.message.xml.MessageFactory;
import vn.dtt.gt.dk.nsw.model.ConfirmOfRemovedVehicle;
import vn.dtt.gt.dk.nsw.model.Currency;
import vn.dtt.gt.dk.nsw.model.StateList;
import vn.dtt.gt.dk.nsw.model.ProvinceList;
import vn.dtt.gt.dk.nsw.model.DistrictList;
import vn.dtt.gt.dk.nsw.model.FileEndorsement;
import vn.dtt.gt.dk.nsw.model.ImportedVehicleList;
import vn.dtt.gt.dk.nsw.model.InquiryOfCertificateContent;
import vn.dtt.gt.dk.nsw.model.NoticeCertificateEndorsement;
import vn.dtt.gt.dk.nsw.model.NoticeOfCancellation;
import vn.dtt.gt.dk.nsw.model.PaymentNotification;
import vn.dtt.gt.dk.nsw.model.RemovedSchedule;
import vn.dtt.gt.dk.nsw.model.RemovedVehicle;
import vn.dtt.gt.dk.nsw.model.Request;
import vn.dtt.gt.dk.nsw.model.RequestChanges;
import vn.dtt.gt.dk.nsw.model.RequestForChangingDateSite;
import vn.dtt.gt.dk.nsw.model.RequestForQualityInspection;
import vn.dtt.gt.dk.nsw.model.Response;
import vn.dtt.gt.dk.nsw.model.SelectedGroupForPayment;
import vn.dtt.gt.dk.nsw.model.SelectedVehicleListForPayment;
import vn.dtt.gt.dk.nsw.model.TechnicalSpecification;
import vn.dtt.gt.dk.nsw.model.UserInformation;
import vn.dtt.gt.dk.portlet.business.CallWebserviceNSWBusiness;
import vn.dtt.gt.dk.portlet.business.FunctionNghiepVu;
import vn.dtt.gt.dk.portlet.business.MotCuaBusiness;
import vn.dtt.gt.dk.portlet.business.NghiepVuBoSungBusiness;
import vn.dtt.gt.dk.portlet.business.NghiepVuBusiness;
import vn.dtt.gt.dk.portlet.business.TrangThaiConstains;
import vn.dtt.gt.dk.portlet.business.XuLyMessage;
import vn.dtt.gt.dk.report.ReportUtils;
import vn.dtt.gt.dk.sendmessage.MessgaePriorityLevels;
import vn.dtt.gt.dk.sendmessage.SendMessgaeFunctions;
import vn.dtt.gt.dk.sendmessage.ThreatReadDB;
import vn.dtt.gt.dk.sendmessage.ThreatSentMessage;
import vn.dtt.gt.dk.threat.ThreatSentMessage222_30;
import vn.dtt.gt.dk.utils.CheckUserLogin;
import vn.dtt.gt.dk.utils.DanhMucKey;
import vn.dtt.gt.dk.utils.TrangThaiHoSo;
import vn.dtt.gt.dk.utils.config.DKConfigurationManager;
import vn.dtt.gt.dk.utils.document.DocumentUtils;
import vn.dtt.gt.dk.utils.format.Constants;
import vn.dtt.gt.dk.utils.format.ConvertUtil;
import vn.dtt.gt.dk.utils.format.FormatData;
import vn.dtt.gt.dk.validation.ActionUtils;
import vn.dtt.gt.dk.validation.BusinessValidation;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;


/**
 * @author binhnt
 * 
 */
public class BusinessUtils {

	private Log _log = LogFactoryUtil.getLog(BusinessUtils.class);
	NghiepVuBusiness nghiepVuBusiness = new NghiepVuBusiness();
	
	NghiepVuBoSungBusiness nghiepVuBoSungBusiness = new NghiepVuBoSungBusiness();
	SendMessgaeFunctions messageFunctions = new  SendMessgaeFunctions();
//	ThreatSentMessage207_30 threatSentMessage207_30 = ThreatSentMessage207_30.init();
//	ThreatSentMessage threatSentMessage = ThreatSentMessage.init();
//	ThreatReadDB threatReadDB  = ThreatReadDB.init();  
	ThreadPassingBanKhai threadPassingBanKhai = ThreadPassingBanKhai.init();
	ThreatSentMessage222_30 thSentMessage222_30 = ThreatSentMessage222_30.init();
	CallWebserviceNSWBusiness callWebserviceNSWBusiness = new CallWebserviceNSWBusiness();
	MotCuaBusiness motCuaBusiness = new MotCuaBusiness();
	FunctionNghiepVu functionNghiepVu = new FunctionNghiepVu();
	SendMessgaeFunctions sendMessgaeFunctions = new SendMessgaeFunctions();
	// Ham phan tich du lieu nhan tu NSW.
	public String receiveMessage(String dataInput) {
		try {
			
			Header header = null;
			String data = vn.dtt.gt.dk.message.MessageUtils.replaceXML(dataInput.trim());
			
			header = vn.dtt.gt.dk.message.MessageUtils.readXmlMessageHeader(data);
			if (header != null) {
				
				List<Object> liObjects = MessageFactory.converXMLMessagesContentToObject(data);
				if (header.getSubject().getType() == MessageType.CHECK_USER
						&& FunctionType.FUNCTION_HOI_KET_QUA.compareToIgnoreCase(header.getSubject().getFunction()) == 0) {

					UserInformation information=null;
					for (Object object : liObjects) {

						if (object instanceof UserInformation) {
							information = UserInformation.class.cast(object);
							break;
						}
					}
					if(information!=null){
//						_log.info("information  "+information.getEmail()+"  information.getPassword()  "+information.getPassword() );
						
						return messageType319Function26TT(header, information, data);
					}else{
						return "TRINH";
					}
				}	
				AswmsgMessageLogDao.insertMessageLog(header, dataInput, MessageKey.NSW_TO_HTTT_BGT,
						TrangThaiHoSo.CHO_TIEP_NHAN, null);
//				_log.debug(idMessageLog + "=====idMessageLog=========" + idMessageLog);
				
				//_log.info("liObjects  "+liObjects.size());
				_log.info("header.getSubject().getType()   "+header.getSubject().getType() );
				String xmlResult = "";
				xmlResult = MessageUtils.createReturnContentAfterParserDataReceiverFromNSW(header);
				if (header.getSubject().getType() == MessageType.TVTT_THAM_CHIEU
						&& FunctionType.FUNCTION_HOI_KET_QUA.compareToIgnoreCase(header.getSubject().getFunction()) == 0) {
					// MessageType= 219 && MessageFunction= 26

					xmlResult = messageType219Function26TT(header, liObjects, data);
				}else if (header.getSubject().getType() == MessageType.KET_QUA_HO_SO) {
			
					xmlResult =messageType224Function225(header, liObjects, data);
				}
				else if (FunctionType.FUNCTION_XAC_NHAN_HOAN_THANH.compareToIgnoreCase(header.getSubject().getFunction()) == 0) {
					motCuaBusiness.tuDongChuyenDichTrangThai(header.getReference().getMessageId(),header);
					xmlResult = "";
				}else if (FunctionType.FUNCTION_THONG_BAO_TIEP_NHAN_CUA_HE_THONG.compareToIgnoreCase(header.getSubject().getFunction()) == 0) {
					messageQuue(header, FunctionType.FUNCTION_THONG_BAO_TIEP_NHAN_CUA_HE_THONG);
					xmlResult = MessageUtils.createReturnContentAfterCompleteBusiness(header);
					//roleBack(header,FunctionType.FUNCTION_THONG_BAO_TIEP_NHAN_CUA_HE_THONG);
				}else if (FunctionType.FUNCTION_XAC_NHAN_TU_CHOI_HO_SO.compareToIgnoreCase(header.getSubject().getFunction()) == 0) {
					xmlResult = "";
					functionNghiepVu.roleBack(header,FunctionType.FUNCTION_XAC_NHAN_TU_CHOI_HO_SO);
				}else{
					ObjectExcute objectExcute = new ObjectExcute(header, liObjects, data);
					ThreadPassingBanKhai.listData.add(objectExcute);
				}

				// Insert ban tin truoc khi gui di
				if(xmlResult!=null&&xmlResult.length()>0){
					Header headerReturn = vn.dtt.gt.dk.message.MessageUtils.readXmlMessageHeader(xmlResult);
					AswmsgMessageLogDao.insertMessageLog(headerReturn, xmlResult, MessageKey.HTTH_BGT_TO_NSW,
							TrangThaiHoSo.CHO_TIEP_NHAN, headerReturn.getReference().getMessageId());
				}
				
				return xmlResult;
			}
		} catch (Exception e) {
			_log.error(e);
		}
		return "Can not parse xml";
	}

	public void nhanBanKhai(Header header, String data, List<Object> liObjects) {
		// Tao ban tin tra ve bao da nhan thong tin.
		try {

//			_log.debug("==Request MessageId==" + header.getReference().getMessageId()
//					+ " header.getSubject().getDocumentType()   " + header.getSubject().getDocumentType());
			long idMessageLog = AswmsgMessageLogDao.insertMessageLog(header, data, MessageKey.NSW_TO_HTTT_BGT,
					TrangThaiHoSo.CHO_TIEP_NHAN, null);
			String xmlResult="";
			boolean flag = BusinessValidation.validation(header, idMessageLog, liObjects);
			if (flag&&(FunctionType.FUNCTION_XAC_NHAN_HOAN_THANH.compareToIgnoreCase(header.getSubject().getFunction()) != 0)
					&&(FunctionType.FUNCTION_THONG_BAO_TIEP_NHAN_CUA_HE_THONG.compareToIgnoreCase(header.getSubject().getFunction()) != 0)
					&&(FunctionType.FUNCTION_XAC_NHAN_TU_CHOI_HO_SO.compareToIgnoreCase(header.getSubject().getFunction()) != 0)) {
				flag = ActionUtils.checkValidation(liObjects, idMessageLog);
			}
//			_log.info(" flag "+flag);
			if (flag) {
				
//				_log.info(" xuLyBanKhaiKhongErrrors "+flag);
					xuLyBanKhaiKhongErrrors(header, data, liObjects);
					if (FunctionType.FUNCTION_XAC_NHAN_HOAN_THANH.compareToIgnoreCase(header.getSubject().getFunction()) == 0) {
						// Xu ly lai ban tin tra ve 11
						_log.info("Xu ly lai ban tin tra ve 11 ");
						motCuaBusiness.tuDongChuyenDichTrangThai(header.getReference().getMessageId(),header);
						xmlResult = "";
					}
				
			}else{
//				_log.info(" errors "+flag);
				List<AswmsgValidationLog> liAswmsgValidationLogs = AswmsgValidationLogLocalServiceUtil
						.findByMessageLogId(idMessageLog);
				xmlResult = MessageUtils.createReturnContentAfterValidationErrorFromNSW(header,
						liAswmsgValidationLogs.get(0).getTagName());
				long hoSoTtid=0;
				TthcHoSoThuTuc hoSoThuTuc = null;
				try{
					hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchByMaSoHoSo(header.getSubject().getReference() + "");
					hoSoTtid=hoSoThuTuc.getId();
				}catch (Exception e) {
					//_log.error(e);
				}
				SendMessgaeFunctions.insertMessageQueue(
						header, xmlResult, MessageKey.HTTH_BGT_TO_NSW, TrangThaiHoSo.DA_BO_SUNG_CHO_TIEP_NHAP,
						header.getReference().getMessageId(), MessgaePriorityLevels.HIGHT, hoSoTtid,
						null);
				xmlResult = "";
				
			}
			if(xmlResult!=null&&xmlResult.length()>0){
				callWebserviceNSWBusiness.sendMessage(xmlResult);
			}
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	private void xuLyBanKhaiKhongErrrors(Header header, String data,
			List<Object> liObjects) throws IOException, SystemException {
//		sendMessgaeFunctions.insertKeHoachChuyenDichTuViettel(header);
		// Tao ho so.
		if (header.getSubject().getType() == MessageType.HO_SO
				&& FunctionType.FUNCTION_KHAI_MOI.compareToIgnoreCase(header.getSubject().getFunction()) == 0) {
			// MessageType= 99 && MessageFunction= 01

			messageType99Function01(header, liObjects, data);
		}else if (header.getSubject().getType() == MessageType.TVTT_THAM_CHIEU
				&& FunctionType.FUNCTION_HOI_KET_QUA.compareToIgnoreCase(header.getSubject().getFunction()) == 0) {
			// MessageType= 219 && MessageFunction= 26

			messageType219Function26TT(header, liObjects, data);
		}	else if (header.getSubject().getType() == MessageType.THONG_BAO_HOAN_KIEM_TRA
				&& FunctionType.FUNCTION_GUI_KET_QUA_XU_LY_HO_SO.compareToIgnoreCase(header.getSubject().getFunction()) == 0) {
			// MessageType= 103 && MessageFunction= 30

			messageType103Function30(header, liObjects, data);
		} 
//			else if (header.getSubject().getType() == MessageType.TVTT_THAM_CHIEU
//					&& FunctionType.FUNCTION_HOI_KET_QUA.compareToIgnoreCase(header.getSubject().getFunction()) == 0) {
//				// MessageType= 99 && MessageFunction= 02
//
//				messageType219Function26(header, liObjects, data);
//			}
		
		else if (header.getSubject().getType() == MessageType.THONG_BAO_LOAI_BO_PHUONG_TIEN
				&& FunctionType.FUNCTION_GUI_KET_QUA_XU_LY_HO_SO.compareToIgnoreCase(header.getSubject().getFunction()) == 0) {
			// MessageType= 105 && MessageFunction= 30

			messageType105Function30(header, liObjects, data);
		}else if (header.getSubject().getType() == MessageType.HO_SO
				&& FunctionType.FUNCTION_KHAI_SUA.compareToIgnoreCase(header.getSubject().getFunction()) == 0) {
			// MessageType= 99 && MessageFunction= 02
			_log.info("==/===============Vao BusinessUtil message 99 20============");
			messageType99Function02(header, liObjects, data);
		} else if (header.getSubject().getType() == MessageType.CHON_NHOM_DC_XD_NOP_PHI
				&& FunctionType.FUNCTION_GUI_KET_QUA_XU_LY_HO_SO.compareToIgnoreCase(header.getSubject()
						.getFunction()) == 0) {
			// MessageType= 222 && MessageFunction= 30

			messageType222Function30(header, liObjects);
		} else if ((header.getSubject().getType() == MessageType.HO_SO
				|| header.getSubject().getType() == MessageType.GDK_KTCL_ATKT_BVMT_XE_NHAP_KHAU || header
				.getSubject().getType() == MessageType.BAN_KE_CHI_TIET_SO_KHUNG_SO_DONG_CO)
				&& FunctionType.FUNCTION_KHAI_BO_SUNG_CHUNG_TU.compareToIgnoreCase(header.getSubject()
						.getFunction()) == 0) {
			
			// MessageType= 99 && MessageFunction= 04			
			message99AndFunction04(header, data, liObjects);
		}  else if ((header.getSubject().getType() == MessageType.HO_SO
				|| header.getSubject().getType() == MessageType.GDK_KTCL_ATKT_BVMT_XE_NHAP_KHAU || header
				.getSubject().getType() == MessageType.BAN_KE_CHI_TIET_SO_KHUNG_SO_DONG_CO)
				&& FunctionType.FUNCTION_KHAI_BO_SUNG_CHUNG_TU.compareToIgnoreCase(header.getSubject()
						.getFunction()) == 0) {
			
			// MessageType= 99 && MessageFunction= 04
			message99AndFunction04(header, data, liObjects);
		} else if (header.getSubject().getType() == MessageType.BAN_CUNG_CAP_TT_XE_NHAP_KHAU
				&& FunctionType.FUNCTION_KHAI_BO_SUNG_CHUNG_TU.compareToIgnoreCase(header.getSubject()
						.getFunction()) == 0) {
			// MessageType= 101 && MessageFunction= 04
			messageType101AndFunction04(header, data, liObjects);
		}
		
		else if (header.getSubject().getType() == MessageType.DONG_BO_TY_GIA		) {

			messageType109(header, data, liObjects);
		} 
		
		else if (header.getSubject().getType() == MessageType.DONG_BO_DM_QUOC_GIA		) {

			messageType137(header, data, liObjects);
		} 
		else if (header.getSubject().getType() == MessageType.DONG_BO_DM_TINH_THANH		) {

			messageType138(header, data, liObjects);
		} 
		else if (header.getSubject().getType() == MessageType.DONG_BO_DM_QUAN_HUYEN		) {

			messageType139(header, data, liObjects);
		} 
		else if (header.getSubject().getType() == MessageType.TAI_LIEU_DINH_KEM_BO_SUNG
				&& FunctionType.FUNCTION_GUI_KET_QUA_XU_LY_HO_SO.compareToIgnoreCase(header.getSubject()
						.getFunction()) == 0) {
//				_log.info("header.getSubject().getType()  "+header.getSubject().getType());
//				_log.info("header.getSubject().getFunction()  "+header.getSubject()
//						.getFunction());
			messageType107AndFunction30(header, data, liObjects);
		} else if (header.getSubject().getType() == MessageType.XN_THOI_GIAN_VA_DIA_DIEM_KIEM_TRA
				&& FunctionType.FUNCTION_KHAI_BO_SUNG_CHUNG_TU.compareToIgnoreCase(header.getSubject()
						.getFunction()) == 0) {
			// MessageType= 108 && MessageFunction= 04
			
			messageType108AndFunction04(header, data, liObjects);
		} else if (header.getSubject().getType() == MessageType.TB_TINH_TRANG_NOP_PHI_LE_PHI
				&& FunctionType.FUNCTION_GUI_KET_QUA_XU_LY_HO_SO.compareToIgnoreCase(header.getSubject()
						.getFunction()) == 0) {
			// MessageType= 208 && MessageFunction= 30

			messageType208Function(header, data, liObjects);
		}  else if (header.getSubject().getType() == MessageType.TB_CHON_PHUONG_TIEN_DE_NOP_PHI_LE_PHI
				&& FunctionType.FUNCTION_GUI_KET_QUA_XU_LY_HO_SO.compareToIgnoreCase(header.getSubject()
						.getFunction()) == 0) {

			messageType207Function30(header, data, liObjects);
		} else if (header.getSubject().getType() == MessageType.HO_SO
				&& FunctionType.FUNCTION_KHAI_HUY.compareToIgnoreCase(header.getSubject().getFunction()) == 0) {

			messageType99Function03(header, data, liObjects);
		} else if (header.getSubject().getType() == MessageType.TB_DE_NGHI_SUA_DOI_GCN
				&& FunctionType.FUNCTION_PHAN_HOI_KET_QUA_XU_LY_HO_SO.compareToIgnoreCase(header.getSubject()
						.getFunction()) == 0) {

			messageType215Function29(header, data, liObjects);
		}
	}

	private void message99AndFunction04(Header header, String data, List<Object> liObjects) {
		try {
			TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.findByMaThuTuc(header
					.getSubject().getDocumentType());
			RequestForQualityInspection requestForQualityInspection = null;
			//String mauTrucTuyen = "";
			RequestChanges requestChanges = null;
			for (Object object : liObjects) {

				if (object instanceof RequestChanges) {
					requestChanges = RequestChanges.class.cast(object);
					break;
				}
			}
//			_log.info("message99AndFunction041");
			long userSystem = DKConfigurationManager.getLongProp("DK-system-use-upload_file_system", 0);
			String lyDoTuChoi = DKConfigurationManager.getStrProp("hethongtuchoicapnhatcahoso",
					"He thong tu choi cap nhat ca ho so");

			TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchByMaSoHoSo(String.valueOf(header
					.getSubject().getReference()));
			long idMotCuaNotification = 0;
			MotCuaNotification motCuaNotification = null;
			if (requestChanges != null) {
				motCuaNotification = new MotCuaNotificationImpl();
				idMotCuaNotification = CounterLocalServiceUtil.increment(MotCuaNotification.class.getName());
				motCuaNotification.setId(idMotCuaNotification);
				motCuaNotification.setDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
				motCuaNotification
						.setOrganization(DKConfigurationManager.getStrProp("vr_organization", "ORGANIZATION"));
				motCuaNotification.setMessageID(header.getReference().getMessageId());
				motCuaNotification.setDossierid(tthcHoSoThuTuc.getId());
				motCuaNotification.setRequestContent(requestChanges.getReason());
				motCuaNotification.setIsReply(1);
				motCuaNotification.setMessageType(MessageType.HO_SO);
				motCuaNotification.setRequestTime(FormatData.parseStringToDate(requestChanges.getRequestDate()));
				motCuaNotification.setRequestSender(requestChanges.getName());
				_log.info("requestChanges");
				MotCuaNotificationLocalServiceUtil.addMotCuaNotification(motCuaNotification);

			}
			_log.info("message99AndFunction0412");
			long hoSoThuTucId = tthcHoSoThuTuc.getId();
			RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil
					.findByDossierId(hoSoThuTucId);
			if (registeredInspection!=null&&registeredInspection.getRegisteredNumber() != null
					&& registeredInspection.getRegisteredNumber().length() > 0) {
				_log.info("message99AndFunction042  "+registeredInspection.getRegisteredNumber());
				userSystem = DKConfigurationManager.getLongProp("DK-system-use-upload_file_system", 0);
				lyDoTuChoi = DKConfigurationManager.getStrProp("hethongtuchoicapnhatcahoso",
						"He thong tu choi cap nhat ca ho so");

				motCuaNotification = new MotCuaNotificationImpl();
				idMotCuaNotification = CounterLocalServiceUtil.increment(MotCuaNotification.class.getName());
				motCuaNotification.setId(idMotCuaNotification);
				motCuaNotification.setDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
				motCuaNotification
						.setOrganization(DKConfigurationManager.getStrProp("vr_organization", "ORGANIZATION"));
				motCuaNotification.setMessageID(header.getReference().getMessageId());
				motCuaNotification.setDossierid(tthcHoSoThuTuc.getId());
				motCuaNotification.setRequestContent(requestChanges.getReason());
				motCuaNotification.setIsReply(0);
				motCuaNotification.setMessageType(MessageType.HO_SO);
				motCuaNotification.setResponse(lyDoTuChoi);
				motCuaNotification.setResponseTime(new Date());
				motCuaNotification.setOfficerName(userSystem + "");
				MotCuaNotificationLocalServiceUtil.addMotCuaNotification(motCuaNotification);

				callWebserviceNSWBusiness.messageTuChoiTiepNhan(tthcHoSoThuTuc, Constants.VERSION_START, userSystem
						+ "", lyDoTuChoi);
				return;
			}

			for (Object object : liObjects) {

				if (object instanceof RequestForQualityInspection) {
					requestForQualityInspection = RequestForQualityInspection.class.cast(object);
					break;
				}
			}

			xuLyHoSo99and04(header, data, liObjects, thuTucHanhChinh, requestForQualityInspection, tthcHoSoThuTuc,
					hoSoThuTucId,requestChanges);
		} catch (Exception e) {
			_log.error(e);
		}
	}

	private void messageType101AndFunction04(Header header, String data, List<Object> liObjects) {
		try {
			_log.info("messageType101AndFunction041");
			TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.findByMaThuTuc(header
					.getSubject().getDocumentType());
			RequestChanges requestChanges = null;
			for (Object object : liObjects) {

				if (object instanceof RequestChanges) {
					requestChanges = RequestChanges.class.cast(object);
					break;
				}
			}


			long userSystem = DKConfigurationManager.getLongProp("DK-system-use-upload_file_system", 0);
			TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchByMaSoHoSo(String.valueOf(header
					.getSubject().getReference()));
			long idMotCuaNotification = 0;
			MotCuaNotification motCuaNotification = null;
			if (requestChanges != null) {
	//			_log.info("requestChanges != null");
				motCuaNotification = new MotCuaNotificationImpl();
				idMotCuaNotification = CounterLocalServiceUtil.increment(MotCuaNotification.class.getName());
				motCuaNotification.setId(idMotCuaNotification);
				motCuaNotification.setDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
				motCuaNotification
						.setOrganization(DKConfigurationManager.getStrProp("vr_organization", "ORGANIZATION"));
				motCuaNotification.setMessageID(header.getReference().getMessageId());
				motCuaNotification.setDossierid(tthcHoSoThuTuc.getId());
				motCuaNotification.setRequestContent(requestChanges.getReason());
				motCuaNotification.setIsReply(1);
				motCuaNotification.setMessageType(MessageType.HO_SO);
				motCuaNotification.setRequestTime(FormatData.parseStringToDate(requestChanges.getRequestDate()));
				motCuaNotification.setRequestSender(requestChanges.getName());

				MotCuaNotificationLocalServiceUtil.addMotCuaNotification(motCuaNotification);

			}
		//	_log.info("requestChanges != null2");
			long hoSoThuTucId = tthcHoSoThuTuc.getId();
			RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil
					.findByDossierId(hoSoThuTucId);


			xuLyHoSo101and04(header, data, liObjects, thuTucHanhChinh, registeredInspection,tthcHoSoThuTuc,
					hoSoThuTucId);
			
			if(requestChanges!=null){
				String ghiChu = "<font color='blue'> "+ DKConfigurationManager.getStrProp("bosunghoso", "KH: [ ") + FormatData.parseDateToTringType3( FormatData.parseStringToDate(requestChanges.getRequestDate()))+" ]";
				ghiChu = ghiChu + requestChanges.getReason()+" </font>"+" <br> ";
				ghiChu = ghiChu + tthcHoSoThuTuc.getGhiChu();
				tthcHoSoThuTuc.setGhiChu(ghiChu);
				tthcHoSoThuTuc.setSynchDate(new Date());
				TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(tthcHoSoThuTuc);
			
			}
			MotCuaBusiness motCuaBusiness = new MotCuaBusiness();
			String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.bo.sung.hskt", "bo.sung.hskt");
			//long userSystem = DKConfigurationManager.getLongProp("DK-system-use-upload_file_system", 0);
			motCuaBusiness.dichChuyenTrangThaiPhieuSuLyChinh(hoSoThuTucId, dieuKienChuyenDich, userSystem);
			callWebserviceNSWBusiness.sendMessageComplete(header,null);
		} catch (Exception e) {
			_log.error(e);
			
		}
	}
	

	private void messageType109(Header header, String data, List<Object> liObjects) {
		try {
		_log.info("messageType109");
		if(liObjects!=null&&liObjects.size()>0){
			long size = liObjects.size();
			Currency  currency = null;
			_log.info("messageType109  "+ size);
			for(int i=0;i<size;i++){
				Object object =liObjects.get(i);
				if(object instanceof Currency){
					currency = Currency.class.cast(object);
				   List<Currency.CurrencyList>  currencyLists=	currency.getCurrencyList();
				   if(currencyLists!=null&&currencyLists.size()>0){
					   int sizeCurrencyList = currencyLists.size();
					   
					   for(int j=0;j<sizeCurrencyList;j++){
						   Currency.CurrencyList currencyList = currencyLists.get(j) ;
						   ExchangeRate exchangeRate = new ExchangeRateImpl();
						   exchangeRate.setBasicCurrency("VND");
						   exchangeRate.setOriginalCurrency(currencyList.getCurrencyCode());
						   exchangeRate.setExchangeRate(currencyList.getChangeRates());
						   exchangeRate.setPublishDate(FormatData.parseStringToDate(currencyList.getApplyDate()));
						   exchangeRate.setValidFrom(FormatData.parseStringToDate(currencyList.getApplyDate()));
						   exchangeRate.setValidUntil(FormatData.parseStringToDate(currencyList.getExpiredDate()));
						   ExchangeRateLocalServiceUtil.addExchangeRate(exchangeRate);
						   
						   List<NewExchangeRate> newExchangeRates= NewExchangeRateLocalServiceUtil.findByOriginalCurrencyBasicCurrency(currencyList.getCurrencyCode(),"VND");
						   if(newExchangeRates!=null&&newExchangeRates.size()>0){
							   NewExchangeRate newExchangeRate = newExchangeRates.get(0);
							   newExchangeRate.setBasicCurrency("VND");
							   newExchangeRate.setOriginalCurrency(currencyList.getCurrencyCode());
							   newExchangeRate.setExchangeRate(currencyList.getChangeRates());
							   newExchangeRate.setPublishDate(FormatData.parseStringToDate(currencyList.getApplyDate()));
							   newExchangeRate.setValidFrom(FormatData.parseStringToDate(currencyList.getApplyDate()));
							   newExchangeRate.setValidUntil(FormatData.parseStringToDate(currencyList.getExpiredDate()));
							   NewExchangeRateLocalServiceUtil.updateNewExchangeRate(newExchangeRate);
							      
						   }else{
							   NewExchangeRate newExchangeRate = new NewExchangeRateImpl();
							   newExchangeRate.setBasicCurrency("VND");
							   newExchangeRate.setOriginalCurrency(currencyList.getCurrencyCode());
							   newExchangeRate.setExchangeRate(currencyList.getChangeRates());
							   newExchangeRate.setPublishDate(FormatData.parseStringToDate(currencyList.getApplyDate()));
							   newExchangeRate.setValidFrom(FormatData.parseStringToDate(currencyList.getApplyDate()));
							   newExchangeRate.setValidUntil(FormatData.parseStringToDate(currencyList.getExpiredDate()));
							   NewExchangeRateLocalServiceUtil.addNewExchangeRate(newExchangeRate);
							   
						   }
					   }
				   }
				}
			}
		}

		} catch (Exception e) {
			_log.error(e);
		}
		
		
	}

	
	private void messageType107AndFunction30(Header header, String data, List<Object> liObjects) {
		try {
			TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.findByMaThuTuc(header
					.getSubject().getDocumentType());
			FileEndorsement fileEndorsement = null;
			for (Object object : liObjects) {

				if (object instanceof FileEndorsement) {
					fileEndorsement = FileEndorsement.class.cast(object);
					break;
				}
			}

			long userSystem = DKConfigurationManager.getLongProp("DK-system-use-upload_file_system", 0);

			TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchByMaSoHoSo(String.valueOf(header
					.getSubject().getReference()));
			long idMotCuaNotification = 0;
			MotCuaNotification motCuaNotification = null;
			if (fileEndorsement != null) {
				motCuaNotification = new MotCuaNotificationImpl();
				idMotCuaNotification = CounterLocalServiceUtil.increment(MotCuaNotification.class.getName());
				motCuaNotification.setId(idMotCuaNotification);
				motCuaNotification.setDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
				String org=DKConfigurationManager.getStrProp("vr_organization", "ORGANIZATION");
				motCuaNotification
						.setOrganization(org);
				motCuaNotification.setMessageID(header.getReference().getMessageId());
				motCuaNotification.setDossierid(tthcHoSoThuTuc.getId());
				motCuaNotification.setRequestContent(fileEndorsement.getReasonForEndorsement());
				motCuaNotification.setIsReply(1);
				motCuaNotification.setMessageType(MessageType.HO_SO);
				motCuaNotification.setRequestTime(FormatData.parseStringToDate(fileEndorsement.getRequestDate()));
				motCuaNotification.setRequestSender(fileEndorsement.getName());
				MotCuaNotificationLocalServiceUtil.addMotCuaNotification(motCuaNotification);

			}
			long hoSoThuTucId = tthcHoSoThuTuc.getId();

			xuLyHoSo107and30(header, data, liObjects, thuTucHanhChinh, 
					hoSoThuTucId);
			List<MotCuaPhieuXuLyPhu>  motCuaPhieuXuLyPhus = MotCuaPhieuXuLyPhuLocalServiceUtil.findByPhieuXuLyChinhId(hoSoThuTucId);
			if(motCuaPhieuXuLyPhus!=null&&motCuaPhieuXuLyPhus.size()>0){
				int size = motCuaPhieuXuLyPhus.size();
				String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.bo.sung.hskt", "bo.sung.hskt");
				for(int j=0;j<size;j++){
					MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = motCuaPhieuXuLyPhus.get(j);
					if(motCuaPhieuXuLyPhu.getTrangThaiHienTaiId()==11){
						motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId, motCuaPhieuXuLyPhu.getId(), dieuKienChuyenDich, userSystem);
						motCuaPhieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.fetchMotCuaPhieuXuLyPhu(motCuaPhieuXuLyPhu.getId());
						String ghiChu = "<font color='blue'> "+ DKConfigurationManager.getStrProp("bosunghoso", "KH: [ ") + FormatData.parseDateToTringType3( FormatData.parseStringToDate(fileEndorsement.getRequestDate()))+" ]";
						ghiChu = ghiChu + fileEndorsement.getReasonForEndorsement()+" </font>"+" <br> ";
						ghiChu = ghiChu + tthcHoSoThuTuc.getGhiChu();
						motCuaPhieuXuLyPhu.setGhiChu(ghiChu);
						MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(motCuaPhieuXuLyPhu);
						
					}
				}
			}
			
			String ghiChu = "<font color='blue'> "+ DKConfigurationManager.getStrProp("bosunghoso", "KH: [ ") + FormatData.parseDateToTringType3( FormatData.parseStringToDate(fileEndorsement.getRequestDate()))+" ]";
			ghiChu = ghiChu + fileEndorsement.getReasonForEndorsement()+" </font>"+" <br> ";
			ghiChu = ghiChu + tthcHoSoThuTuc.getGhiChu();
			tthcHoSoThuTuc.setGhiChu(ghiChu);
			tthcHoSoThuTuc.setSynchDate(new Date());
			TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(tthcHoSoThuTuc);
		

			MotCuaBusiness motCuaBusiness = new MotCuaBusiness();
			String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.bo.sung", "bo.sung");
			motCuaBusiness.dichChuyenTrangThaiPhieuSuLyChinh(hoSoThuTucId, dieuKienChuyenDich, userSystem);
			callWebserviceNSWBusiness.sendMessageComplete(header,null);
		} catch (Exception e) {
			_log.error(e);
		}
	}

	
	private void xuLyHoSo99and04(Header header, String data, List<Object> liObjects,
			TthcThuTucHanhChinh thuTucHanhChinh, RequestForQualityInspection requestForQualityInspection,
			TthcHoSoThuTuc tthcHoSoThuTuc, long hoSoThuTucId,RequestChanges requestChanges) {
		try{
		_log.info("xuLyHoSo99and04  ");
		String mauTrucTuyen;
		String chiTietNoiDung = "";
		TechnicalSpecification technicalSpecification;

		RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(hoSoThuTucId);
		
		if ((requestForQualityInspection!= null) && (registeredInspection!=null) && 
				(registeredInspection.getId() > 0) && (registeredInspection.getRegisteredNumber().trim().length() == 0)) {
			registeredInspection.setInspectionDate(FormatData
					.parseStringToDate(requestForQualityInspection.getInspection()
							.getInpectionDate()));
			registeredInspection.setInspectionSite(requestForQualityInspection.getInspection()
					.getInspectionSite());
			registeredInspection.setInspectionDistrictCode(requestForQualityInspection
					.getInspection().getDistrictCode().trim());
			registeredInspection.setInspectionProvinceCode(requestForQualityInspection
					.getInspection().getProvinceCode().trim());
			RegisteredInspectionLocalServiceUtil.updateRegisteredInspection(registeredInspection);
		}

		for (Object object : liObjects) {
			if (object instanceof RequestForQualityInspection) {
				mauTrucTuyen = Constants.MAU_TRUC_TUYEN_BAN_DANG_KY;
				requestForQualityInspection = RequestForQualityInspection.class.cast(object);

				insertNoiDungHoSo(hoSoThuTucId, 0, data, thuTucHanhChinh, mauTrucTuyen, header
						.getReference().getVersion(), Constants.MAU_TRUC_TUYEN_BAN_DANG_KY, header.getSubject()
						.getSendDate(), "", "",Constants.CHUA_CAP_NHAP_DB_NGHIEP_VU);

				for (RequestForQualityInspection.AttachedFile attachedFile : requestForQualityInspection
						.getAttachedFile()) {

					if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("1") == 0) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_HOA_DON_THUONG_MAI;
					} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("2") == 0) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GIAY_TO_KHAC;
					} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("3") == 0) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TAI_LIEU_KY_THUAT;
					} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("2") == 0) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GIAY_TO_KHAC;
					} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("4") == 0) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TAI_LIEU_KHI_THAI;
					} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("5") == 0) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GNC_KIEU_LOAI;
					} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("6") == 0) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GNC_CHAT_LUONG_NSX;
					} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("7") == 0) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GNC_DANG_KY_XE_NSX;
					}
					String tenTaiLieu =getTenTaiLieu( mauTrucTuyen, attachedFile.getAttachedDocName(),attachedFile.getAttachedNote());
					 insertNoiDungHoSo(hoSoThuTucId, 0, data, thuTucHanhChinh, mauTrucTuyen, header
							.getReference().getVersion(), tenTaiLieu, header.getSubject()
							.getSendDate(), attachedFile.getBase64FileContent(), attachedFile.getFullFileName(),Constants.CHUA_CAP_NHAP_DB_NGHIEP_VU);
				}
			} else if (object instanceof TechnicalSpecification) {
				technicalSpecification = TechnicalSpecification.class.cast(object);
				if (technicalSpecification.getGeneralInfo().getMarkAsVehicle() == 1) {
					mauTrucTuyen = Constants.MAU_TRUC_TUYEN_THONG_TIN_XE_NK;
				} else {
					mauTrucTuyen = Constants.MAU_TRUC_TUYEN_THONG_TIN_DONG_CO;
				}
				String tenTaiLieu = tenTaiLieuBangDangKy(technicalSpecification);
				chiTietNoiDung = chiTietNoiDung + "<br>" + tenTaiLieu;
				insertNoiDungHoSo(hoSoThuTucId, 0, data, thuTucHanhChinh, mauTrucTuyen,
						technicalSpecification.getTechnicalSpecCode(), tenTaiLieu, header
								.getSubject().getSendDate(), "", "",Constants.CHUA_CAP_NHAP_DB_NGHIEP_VU);

				for (TechnicalSpecification.AttachedFile attachedFile : technicalSpecification.getAttachedFile()) {

					if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("3") == 0) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TAI_LIEU_KY_THUAT;
					} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("2") == 0) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GIAY_TO_KHAC;
					} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("4") == 0) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TAI_LIEU_KHI_THAI;
					} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("5") == 0) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GNC_KIEU_LOAI;
					} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("6") == 0) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GNC_CHAT_LUONG_NSX;
					} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("7") == 0) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GNC_DANG_KY_XE_NSX;
					}
					 tenTaiLieu =getTenTaiLieu( mauTrucTuyen, attachedFile.getAttachedDocName(),attachedFile.getAttachedNote());
					insertNoiDungHoSo(hoSoThuTucId, 0, data, thuTucHanhChinh, mauTrucTuyen,
							technicalSpecification.getTechnicalSpecCode(), tenTaiLieu, header
									.getSubject().getSendDate(), attachedFile.getBase64FileContent(),
							attachedFile.getFullFileName(),Constants.CHUA_CAP_NHAP_DB_NGHIEP_VU);
				}
			} else if (object instanceof RequestForChangingDateSite) {
				//RequestForChangingDateSite requestForChangingDateSite = RequestForChangingDateSite.class.cast(object);
				mauTrucTuyen = Constants.MAU_TRUC_TUYEN_XAC_NHAN_KE_HOACH;

				insertNoiDungHoSo(hoSoThuTucId, 0, data, thuTucHanhChinh, mauTrucTuyen, header
						.getReference().getVersion(), Constants.MAU_TRUC_TUYEN_XAC_NHAN_KE_HOACH, header.getSubject()
						.getSendDate(), "", "",Constants.CHUA_CAP_NHAP_DB_NGHIEP_VU);
			}

		}
		 //updatePhieuXuLyChinh(hoSoThuTucId, header, requestForQualityInspection, thuTucHanhChinh);
		if(requestChanges!=null){
			String ghiChu = "<font color='blue'> "+ DKConfigurationManager.getStrProp("denghihuythutuc", "KH: [ ") + FormatData.parseDateToTringType3( FormatData.parseStringToDate(requestChanges.getRequestDate()))+" ]";
			ghiChu = ghiChu + requestChanges.getReason()+" </font>"+" <br> ";
			ghiChu = ghiChu + tthcHoSoThuTuc.getGhiChu();
			tthcHoSoThuTuc.setGhiChu(ghiChu);
			tthcHoSoThuTuc.setSynchDate(new Date());
			TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(tthcHoSoThuTuc);
		
		}
		MotCuaBusiness motCuaBusiness = new MotCuaBusiness();
		String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.bo.sung", "bo.sung");
		_log.info("xuLyHoSo99and04  dieuKienChuyenDich  "+dieuKienChuyenDich);
		long userSystem = DKConfigurationManager.getLongProp("DK-system-use-upload_file_system", 0);
		motCuaBusiness.dichChuyenTrangThaiPhieuSuLyChinh(hoSoThuTucId, dieuKienChuyenDich, userSystem);
		}catch (Exception e) {
			_log.error(e);
			
		}
	}

	private void xuLyHoSo101and04(Header header, String data, List<Object> liObjects,
			TthcThuTucHanhChinh thuTucHanhChinh, RegisteredInspection registeredInspection,
			TthcHoSoThuTuc tthcHoSoThuTuc, long hoSoThuTucId) {
		try {
			String mauTrucTuyen;
			List<TechnicalSpecification> technicalSpecifications = new ArrayList<TechnicalSpecification>();
			TechnicalSpecification technicalSpecification;
			for (Object object : liObjects) {
				if (object instanceof TechnicalSpecification) {
						boolean check=true;
						technicalSpecification = TechnicalSpecification.class.cast(object);
						if(technicalSpecifications!=null && technicalSpecifications.size()>0){
							int size=technicalSpecifications.size();
							for(int i=0;i<size;i++){
								if(technicalSpecification.getTechnicalSpecCode().equals(technicalSpecifications.get(i).getTechnicalSpecCode())){
									check=false;
									break;
								}
							}
						}
						if(check){
							technicalSpecifications.add(technicalSpecification);
							//technicalSpecification = TechnicalSpecification.class.cast(object);
							if (technicalSpecification.getGeneralInfo().getMarkAsVehicle() == 1) {
								mauTrucTuyen = Constants.MAU_TRUC_TUYEN_THONG_TIN_XE_NK;
							} else {
								mauTrucTuyen = Constants.MAU_TRUC_TUYEN_THONG_TIN_DONG_CO;
							}
							String tenTaiLieu = tenTaiLieuBangDangKy(technicalSpecification);
							String xmlData = MessageFactory.convertObjectToXml(technicalSpecification);
							xmlData = XuLyMessage.createContentForNoiDungHoSo(header, xmlData);
							
							//_log.info("TechnicalSpecification.getTechnicalSpecCode  "+technicalSpecification.getTechnicalSpecCode());
							long noiDungHoSoId = insertNoiDungHoSo(hoSoThuTucId, 0, xmlData, thuTucHanhChinh, mauTrucTuyen,
									technicalSpecification.getTechnicalSpecCode(), tenTaiLieu,
									header.getSubject().getSendDate(), "", "",Constants.CHUA_CAP_NHAP_DB_NGHIEP_VU);
							TthcNoidungHoSo noidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(noiDungHoSoId);
							
							VehicleStatistics vehicleStatistics = null;

							vehicleStatistics =nghiepVuBusiness.khaiSuaHoSo(registeredInspection,  technicalSpecification, noidungHoSo);
							if(vehicleStatistics!=null){
							String trichYeuNoiDung = DKConfigurationManager.getStrProp("TONG_SO_DANG_KY_KIEM_TRA",
									"Tong So Dang Ky Kiem Tra");
							trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalRegisteredVehicle() + " <br> ";
							trichYeuNoiDung = trichYeuNoiDung
									+ DKConfigurationManager.getStrProp("SO_PHUONG_TIEN_CHUA_DE_NGHI_KIEM_TRA",
											"So Phuong Tien Chua De Nghi Kiem Tra");
							trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalNotYetRequestedVehicle() + " <br> ";
		
							trichYeuNoiDung = trichYeuNoiDung
									+ DKConfigurationManager.getStrProp("SO_PT_DN_KT", "So Phuong Tien De Nghi Kiem Tra");
							trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalRequestedVehicle() + " <br> ";
		
							trichYeuNoiDung = trichYeuNoiDung
									+ DKConfigurationManager.getStrProp("SO_PT_DA_KT", "So Phuong Tien da Kiem Tra");
							trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalInspectedVehicle() + " <br> ";
		
							trichYeuNoiDung = trichYeuNoiDung
									+ DKConfigurationManager.getStrProp("SO_PT_HOAN_KT", "So Phuong Tien hoan Kiem Tra");
							trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalCancelledVehicle() + " <br> ";
		
							tthcHoSoThuTuc.setTrichYeuNoiDung(trichYeuNoiDung);
							tthcHoSoThuTuc.setSynchDate(new Date());
							TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(tthcHoSoThuTuc);
							}
							for (TechnicalSpecification.AttachedFile attachedFile : technicalSpecification.getAttachedFile()) {
		
								if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("3") == 0) {
									mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TAI_LIEU_KY_THUAT;
								} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("2") == 0) {
									mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GIAY_TO_KHAC;
								} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("4") == 0) {
									mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TAI_LIEU_KHI_THAI;
								} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("5") == 0) {
									mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GNC_KIEU_LOAI;
								} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("6") == 0) {
									mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GNC_CHAT_LUONG_NSX;
								} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("7") == 0) {
									mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GNC_DANG_KY_XE_NSX;
								}
								tenTaiLieu =getTenTaiLieu( mauTrucTuyen, attachedFile.getAttachedDocName(),attachedFile.getAttachedNote());
								noiDungHoSoId = insertNoiDungHoSo(hoSoThuTucId, 0, data, thuTucHanhChinh, mauTrucTuyen,
										technicalSpecification.getTechnicalSpecCode(), tenTaiLieu,
										header.getSubject().getSendDate(), attachedFile.getBase64FileContent(),
										attachedFile.getFullFileName(),Constants.CHUA_CAP_NHAP_DB_NGHIEP_VU);
							}
					}
				}
			}
			
			if(technicalSpecifications!=null&&technicalSpecifications.size()>0){
				ImportedVehicleList importedVehicleList = nghiepVuBusiness.updateImportedVehicleList(tthcHoSoThuTuc.getId());
				String xmlData = MessageFactory.convertObjectToXml(importedVehicleList);
				xmlData = XuLyMessage.createContentForNoiDungHoSo(header, xmlData);
				
				mauTrucTuyen = Constants.MAU_TRUC_TUYEN_BAN_KE_CHI_TIET;
				String tenTaiLieu = mauTrucTuyen+" / "+ importedVehicleList.getImportedVehicle().size();
				insertNoiDungHoSo(hoSoThuTucId, 0, xmlData, thuTucHanhChinh, mauTrucTuyen,
						technicalSpecifications.get(0).getTechnicalSpecCode(), tenTaiLieu, header
								.getSubject().getSendDate(), "", "",Constants.CHUA_CAP_NHAP_DB_NGHIEP_VU);
			}
			
		} catch (Exception e) {
			_log.error(e);
		}
	}

	public String getTenTaiLieu(String mauTrucTuyen, String docName, String attachedNode){
//		if(docNam==null||docNam.length()==0){
//			docNam=" ";
//		}
//		if(attachedNode==null||attachedNode.length()==0){
//			attachedNode =" ";
//		}
//		String tenTaiLieu =mauTrucTuyen+"  "+ docNam+"  "+attachedNode;
		
		// Sonvh bosung 20170407 : rut gon ten tai lieu
		String tenTaiLieu = mauTrucTuyen;
		
		if (docName !=null && docName.length() > 0)
		{
			tenTaiLieu = "";
			tenTaiLieu = docName;
		}
		
		if (attachedNode !=null && attachedNode.length() > 0)
		{
			tenTaiLieu = "";
			tenTaiLieu = attachedNode;
		}
		
		if ((docName !=null && docName.length() > 0) && (attachedNode !=null && attachedNode.length() > 0))
		{
			tenTaiLieu = "";
			tenTaiLieu = docName+"  "+attachedNode;
		}
		return tenTaiLieu;
	}
	
	private void xuLyHoSo107and30(Header header, String data, List<Object> liObjects,
			TthcThuTucHanhChinh thuTucHanhChinh, 
			 long hoSoThuTucId) {
		try {
			String mauTrucTuyen=null;
			FileEndorsement fileEndorsement = null;

			//_log.info("xuLyHoSo107and04");
			for (Object object : liObjects) {
				if (object instanceof FileEndorsement) {
					fileEndorsement = FileEndorsement.class.cast(object);
				//	_log.info("FileEndorsement");	
					for (FileEndorsement.AttachedFile attachedFile : fileEndorsement.getAttachedFile()) {
							
						mauTrucTuyen = createMauTrucTuyen(mauTrucTuyen,
								attachedFile);
					//	_log.info("mauTrucTuyen");
						String tenTaiLieu = getTenTaiLieu( mauTrucTuyen, attachedFile.getAttachedDocName(),attachedFile.getAttachedNote());
						insertNoiDungHoSo(hoSoThuTucId, 0, data, thuTucHanhChinh, mauTrucTuyen,
								attachedFile.getTechnicalSpecCode(), tenTaiLieu,
								header.getSubject().getSendDate(), attachedFile.getBase64FileContent(),
								attachedFile.getFullFileName(),Constants.CHUA_CAP_NHAP_DB_NGHIEP_VU);
					}
				}
			}
			
		} catch (Exception e) {
			_log.error(e);
		}
	}

	private String createMauTrucTuyen(String mauTrucTuyen,
			FileEndorsement.AttachedFile attachedFile) {
		if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("3") == 0) {
			mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TAI_LIEU_KY_THUAT;
		} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("2") == 0) {
			mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GIAY_TO_KHAC;
		} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("4") == 0) {
			mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TAI_LIEU_KHI_THAI;
		} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("5") == 0) {
			mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GNC_KIEU_LOAI;
		} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("6") == 0) {
			mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GNC_CHAT_LUONG_NSX;
		} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("7") == 0) {
			mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GNC_DANG_KY_XE_NSX;
		}else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("1") == 0) {
			mauTrucTuyen = Constants.MAU_TRUC_TUYEN_HOA_DON_THUONG_MAI;
		}
		return mauTrucTuyen;
	}

	
	private void messageType208Function(Header header, String data, List<Object> liObjects) {
		try{
			
			PaymentNotification paymentNotification = null;
			for (Object object : liObjects) {
	
				if (object instanceof PaymentNotification) {
					paymentNotification = PaymentNotification.class.cast(object);
					break;
				}
			}
			if (paymentNotification != null) {
				callWebserviceNSWBusiness.sendMessageCompleteMessageId(header, paymentNotification.getTransactionID());
				vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote  debitNote = DebitNoteLocalServiceUtil.findByDebitNoteNumber(paymentNotification.getDebitNoteNumber());
	//			debitNote.setPaymentType(2);
				if(debitNote!=null){
					debitNote.setMarkAsDeleted(1);
					DebitNoteLocalServiceUtil.updateDebitNote(debitNote);
				}
				_log.info("messageType208Function");
				
				nghiepVuBusiness.capChungChiHangLoatWithHeader(header, paymentNotification, 0,paymentNotification.getTransactionID());
			}
		}catch (Exception e) {
			_log.error(e);
		}

	}

	private void messageType207Function30(Header header, String data, List<Object> liObjects) {

		SelectedVehicleListForPayment selectedVehicleListForPayment = null;
		for (Object object : liObjects) {

			if (object instanceof SelectedVehicleListForPayment) {
				selectedVehicleListForPayment = SelectedVehicleListForPayment.class.cast(object);
				break;
			}
		}
		if (selectedVehicleListForPayment != null) {
			try {
				createMessage209(selectedVehicleListForPayment,header.getReference().getMessageId());
				callWebserviceNSWBusiness.sendMessageComplete(header,ConvertUtil.convertToLong( selectedVehicleListForPayment.getTransactionID()));


			} catch (Exception e) {
				_log.error(e);
			}
		}
	}
	
	private void createMessage209(
			SelectedVehicleListForPayment selectedVehicleListForPayment,String messageId2) {
		if (selectedVehicleListForPayment != null) {
			
			Header headerRequest = null;
			String xml = "";
			try {
				xml = nghiepVuBusiness.thongBaoNopPhi(selectedVehicleListForPayment, 0, Constants.KHAI_BAO_TRUC_TUYEN_THONG_BAO_NOP_PHI_LE_PHI);
//				xml = callWebserviceNSWBusiness.builtMessage209va30( "0", hoSoThuTuc,
//						functionNghiepVu.getRamdomMessage(), Constants.VERSION_START, debitNoteMessage);
				headerRequest = MessageUtils.readXmlMessageHeader(xml);
				
				long hoSoTtid=0;

//				SendMessgaeFunctions.insertMessageQueue(
//						headerRequest, xml, MessageKey.HTTH_BGT_TO_NSW, TrangThaiHoSo.DA_BO_SUNG_CHO_TIEP_NHAP, 
//						headerRequest.getReference().getMessageId(), MessgaePriorityLevels.CHUA_LAY_RA, hoSoTtid,
//						ConvertUtil.convertToLong( selectedVehicleListForPayment.getTransactionID()));
				SendMessgaeFunctions.insertMessageQueueMessageId(headerRequest, xml,  MessageKey.HTTH_BGT_TO_NSW, TrangThaiHoSo.DA_BO_SUNG_CHO_TIEP_NHAP, 
						headerRequest.getReference().getMessageId(), MessgaePriorityLevels.CHUA_LAY_RA, hoSoTtid, messageId2);
			
				

			} catch (Exception e) {
				_log.error(e);
			}
		}
	}

	private void messageType215Function29(Header header, String data, List<Object> liObjects) {
		xuLyHoSoType215Function29(header, liObjects, data);
//		callWebserviceNSWBusiness.sendMessageComplete(header);
	}

	private void messageType99Function03(Header header, String data, List<Object> liObjects) {
		_log.info("messageType99Function031");
		callWebserviceNSWBusiness.sendMessageComplete(header,null);
		long userSystem = DKConfigurationManager.getLongProp("DK-system-use-upload_file_system", 0);
		NoticeOfCancellation noticeOfCancellation = null;
		for (Object object : liObjects) {

			if (object instanceof NoticeOfCancellation) {
				noticeOfCancellation = NoticeOfCancellation.class.cast(object);
				break;
			}
		}
		if (noticeOfCancellation != null) {
			try {
				TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchByMaSoHoSo(header.getSubject()
						.getReference() + "");
				MotCuaNotification motCuaNotification = new MotCuaNotificationImpl();
				long idMotCuaNotification = CounterLocalServiceUtil.increment(MotCuaNotification.class.getName());
				motCuaNotification.setId(idMotCuaNotification);
				motCuaNotification.setDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
				motCuaNotification
						.setOrganization(DKConfigurationManager.getStrProp("vr_organization", "ORGANIZATION"));
				motCuaNotification.setMessageID(header.getReference().getMessageId());
				motCuaNotification.setDossierid(tthcHoSoThuTuc.getId());
				motCuaNotification.setRequestContent(noticeOfCancellation.getReason());
				motCuaNotification.setIsReply(0);
				motCuaNotification.setMessageType(header.getSubject().getType());
				motCuaNotification.setRequestSender(noticeOfCancellation.getName());
				motCuaNotification.setRequestTime(FormatData.parseStringToDate(noticeOfCancellation.getCancelDate()));
				MotCuaNotificationLocalServiceUtil.addMotCuaNotification(motCuaNotification);
				_log.info("messageType99Function032");
				if (noticeOfCancellation.getRegisteredNumber() != null
						&& noticeOfCancellation.getRegisteredNumber().length() > 0) {
					RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil
							.findByRegisteredNumber(noticeOfCancellation.getRegisteredNumber());
					_log.info("messageType99Function033");
					if (registeredInspection == null) {
						_log.info("messageType99Function034");
						nghiepVuBoSungBusiness.tuDongHuyHoSo(header, tthcHoSoThuTuc.getId(), userSystem, noticeOfCancellation,
								idMotCuaNotification);
					} else {
						_log.info("messageType99Function035");
						List<ConfirmedInspection> confirmedInspections = ConfirmedInspectionLocalServiceUtil
								.findByRegisteredInspectionId(registeredInspection.getId());
						if (confirmedInspections != null && confirmedInspections.size() > 0) {
							_log.info("messageType99Function036");
							int size = confirmedInspections.size();
							boolean check = false;
							for (int i = 0; i < size; i++) {
								ConfirmedInspection confirmedInspection = confirmedInspections.get(i);
								long countBySoLuongPT = VehicleRecordLocalServiceUtil.countBySoLuongPT(Long.toString(confirmedInspection.getPhieuXuLyPhuId()));
								if ((confirmedInspection.getCorporationId() != null)
										&& (confirmedInspection.getCorporationId().length() > 0)  && (countBySoLuongPT > 0) ) {
									// Sonvh bosung 20170407 : Dieu kien huy cho phuong tien hoan kiem tra
									check = true;
									break;
								}
							}
							if (check) {
								_log.info("messageType99Function037");
								nghiepVuBoSungBusiness.tuDongKhongChoHuyHoSo(header, tthcHoSoThuTuc, userSystem,
										noticeOfCancellation, idMotCuaNotification);
							} else {
								_log.info("messageType99Function038");
								nghiepVuBoSungBusiness.choXacNhanHuyHoSo(header,tthcHoSoThuTuc.getId(), userSystem,
										noticeOfCancellation, idMotCuaNotification);
							}

						} else {
							_log.info("messageType99Function039");
							nghiepVuBoSungBusiness.choXacNhanHuyHoSo(header,tthcHoSoThuTuc.getId(), userSystem, noticeOfCancellation,
									idMotCuaNotification);
						}

					}
				}else {
					
					RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(tthcHoSoThuTuc.getId());
					
					if(registeredInspection != null){
						if (registeredInspection != null && (registeredInspection.getRegisteredNumber() == null || registeredInspection.getRegisteredNumber().trim().length() == 0)) {
							_log.info("messageType99Function0310");
							nghiepVuBoSungBusiness.tuDongHuyHoSo(header,tthcHoSoThuTuc.getId(), userSystem, noticeOfCancellation,
									idMotCuaNotification);
						} else {
							_log.info("messageType99Function0311");
							List<ConfirmedInspection> confirmedInspections = ConfirmedInspectionLocalServiceUtil
									.findByRegisteredInspectionId(registeredInspection.getId());
							if (confirmedInspections != null && confirmedInspections.size() > 0) {
								_log.info("messageType99Function0312");
								int size = confirmedInspections.size();
								boolean check = false;
								for (int i = 0; i < size; i++) {
									ConfirmedInspection confirmedInspection = confirmedInspections.get(i);
									long countBySoLuongPT = VehicleRecordLocalServiceUtil.countBySoLuongPT(Long.toString(confirmedInspection.getPhieuXuLyPhuId()));
									if ((confirmedInspection.getCorporationId() != null)
											&& (confirmedInspection.getCorporationId().length() > 0)  && (countBySoLuongPT > 0) ) {
										// Sonvh bosung 20170407 : Dieu kien huy cho phuong tien hoan kiem tra										
										check = true;
										break;
									}
								}
								if (check) {
									_log.info("messageType99Function0313");
									nghiepVuBoSungBusiness.tuDongKhongChoHuyHoSo(header,tthcHoSoThuTuc, userSystem,
											noticeOfCancellation, idMotCuaNotification);
								} else {
									_log.info("messageType99Function0314");
									nghiepVuBoSungBusiness.choXacNhanHuyHoSo(header,tthcHoSoThuTuc.getId(), userSystem,
											noticeOfCancellation, idMotCuaNotification);
								}
	
							} else {
								_log.info("messageType99Function0315");
								nghiepVuBoSungBusiness.choXacNhanHuyHoSo(header,tthcHoSoThuTuc.getId(), userSystem, noticeOfCancellation,
										idMotCuaNotification);
							}
	
						}
					} else {
						_log.info("messageType99Function0316");
						nghiepVuBoSungBusiness.tuDongHuyHoSo(header,tthcHoSoThuTuc.getId(), userSystem, noticeOfCancellation,
								idMotCuaNotification);
					}
					
				}
//				callWebserviceNSWBusiness.sendMessageComplete(header);
			} catch (Exception e) {
				_log.error(e);
			}
		}
	}

	private void messageType99Function02(Header header, List<Object> liObjects, String data) throws IOException {
	try {			

		RequestForQualityInspection requestForQualityInspection = null;
		RequestForChangingDateSite requestForChangingDateSite = null;

		TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.findByMaThuTuc(header.getSubject()
				.getDocumentType());
		for (Object object : liObjects) {
			if (object instanceof RequestForQualityInspection) {
				requestForQualityInspection = RequestForQualityInspection.class.cast(object);
				break;
			}
		}
		for (Object object : liObjects) {
			if (object instanceof RequestForChangingDateSite) {
				requestForChangingDateSite = RequestForChangingDateSite.class.cast(object);
				break;
			}
		}
		
		RequestChanges requestChanges = null;
		for (Object object : liObjects) {

			if (object instanceof RequestChanges) {
				requestChanges = RequestChanges.class.cast(object);
				break;
			}
		}

		TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchByMaSoHoSo(String.valueOf(header
				.getSubject().getReference()));
		long idMotCuaNotification = 0;
		MotCuaNotification motCuaNotification = null;
		if (requestChanges != null) {
			motCuaNotification = new MotCuaNotificationImpl();
			idMotCuaNotification = CounterLocalServiceUtil.increment(MotCuaNotification.class.getName());
			motCuaNotification.setId(idMotCuaNotification);
			motCuaNotification.setDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
			motCuaNotification
					.setOrganization(DKConfigurationManager.getStrProp("vr_organization", "ORGANIZATION"));
			motCuaNotification.setMessageID(header.getReference().getMessageId());
			motCuaNotification.setDossierid(tthcHoSoThuTuc.getId());
			motCuaNotification.setRequestContent(requestChanges.getReason());
			motCuaNotification.setIsReply(1);
			motCuaNotification.setMessageType(MessageType.HO_SO);
			motCuaNotification.setRequestTime(FormatData.parseStringToDate(requestChanges.getRequestDate()));
			motCuaNotification.setRequestSender(requestChanges.getName());
			_log.info("requestChanges");
			MotCuaNotificationLocalServiceUtil.addMotCuaNotification(motCuaNotification);

		}
		

		long hoSoThuTucId = tthcHoSoThuTuc.getId();
		RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(hoSoThuTucId);
		if (registeredInspection!=null  ) {
			if (registeredInspection.getRegisteredNumber() != null
					&& registeredInspection.getRegisteredNumber().length() > 0){
				
				
			long userSystem = DKConfigurationManager.getLongProp("DK-system-use-upload_file_system", 0);
			String lyDoTuChoi = DKConfigurationManager.getStrProp("hethongtuchoicapnhatcahoso",
					"He thong tu choi cap nhat ca ho so");
			_log.info("lyDoTuChoi  "+lyDoTuChoi);
				
			
			motCuaNotification = new MotCuaNotificationImpl();
			idMotCuaNotification = CounterLocalServiceUtil.increment(MotCuaNotification.class.getName());
			motCuaNotification.setId(idMotCuaNotification);
			motCuaNotification.setDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
			motCuaNotification
					.setOrganization(DKConfigurationManager.getStrProp("vr_organization", "ORGANIZATION"));
			motCuaNotification.setMessageID(header.getReference().getMessageId());
			motCuaNotification.setDossierid(tthcHoSoThuTuc.getId());
			motCuaNotification.setRequestContent(requestChanges.getReason());
			motCuaNotification.setIsReply(0);
			motCuaNotification.setMessageType(MessageType.HO_SO);
			motCuaNotification.setResponse(lyDoTuChoi);
			motCuaNotification.setResponseTime(new Date());
			motCuaNotification.setOfficerName(userSystem + "");
			MotCuaNotificationLocalServiceUtil.addMotCuaNotification(motCuaNotification);
			
			callWebserviceNSWBusiness.messageTuChoiTiepNhan(tthcHoSoThuTuc, Constants.VERSION_START, userSystem + "",
					lyDoTuChoi);
			return;
			}
		}
		_log.info("xuLyHoSoType99Function02 vao day");
		callWebserviceNSWBusiness.sendMessageComplete(header,null);
		xuLyHoSoType99Function02(header, liObjects, data, requestForQualityInspection, requestForChangingDateSite,
				thuTucHanhChinh, tthcHoSoThuTuc, hoSoThuTucId,registeredInspection);
		} catch (Exception e) {
			_log.error(e);
		}
	}

	private void messageType105Function30(Header header, List<Object> liObjects, String data) throws IOException {

		try{
//			callWebserviceNSWBusiness.sendMessageComplete(header,null);
			RemovedVehicle removedVehicle = null;
			
			TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.findByMaThuTuc(header.getSubject()
					.getDocumentType());

			TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchByMaSoHoSo(String.valueOf(header
					.getSubject().getReference()));
			RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(tthcHoSoThuTuc.getId());
			if (!( registeredInspection!=null&&registeredInspection.getRegisteredNumber()!=null&&	registeredInspection.getRegisteredNumber().length()>0)){
				tuDongGui106(header, removedVehicle, tthcHoSoThuTuc);
				return;
			}

			long check =0;
			for (Object object : liObjects) {
				if (object instanceof RemovedSchedule) {
					removedVehicle = RemovedVehicle.class.cast(object);
					List<RemovedVehicle.ImportedVehicle> importedVehicles= removedVehicle.getImportedVehicle();
					if(importedVehicles!=null){
					int size = importedVehicles.size();
					for(int k=0;k<size;k++){
						RemovedVehicle.ImportedVehicle vehicle = importedVehicles.get(k);
						check=VehicleRecordLocalServiceUtil.checkHoanKiemTra(vehicle.getCodeNumber(), vehicle.getChassisNumber(),vehicle.getEngineNumber());
						if(check>0){
							break;
						}
					}
					}
				}
				if(check>0){
					break;
				}
			}
			
			
			
			if (check > 0) {
				tuDongGui106(header, removedVehicle, tthcHoSoThuTuc);
				return;
			}


			_log.info("xuLyHoSoType105Function30 vao day");
			xuLyHoSoType105Function30(header, liObjects, data,
					thuTucHanhChinh, tthcHoSoThuTuc);
			
			}catch (Exception e) {
				_log.error(e);
			}
		
	}

	private String messageType219Function26TT(Header header, List<Object> liObjects, String data) {
		
		try{
			long userSystem = DKConfigurationManager.getLongProp("DK-system-use-upload_file_system", 0);
			InquiryOfCertificateContent inquiryOfCertificateContent = null;
			for (Object object : liObjects) {
				if (object instanceof InquiryOfCertificateContent) {
					inquiryOfCertificateContent = InquiryOfCertificateContent.class.cast(object);
					return nghiepVuBusiness.guiThongTinThamChieuTT(header, userSystem, inquiryOfCertificateContent);
					
					
				}
			}
			
		}catch (Exception e) {
			_log.error(e);
		}
		return "";
	}
	
	
private String messageType224Function225(Header header, List<Object> liObjects, String data) {
	long userSystem = DKConfigurationManager.getLongProp("DK-system-use-upload_file_system", 0);
		try{
			
			Request request = null;
			for (Object object : liObjects) {
				if (object instanceof Request) {
					request = Request.class.cast(object);
//					List<TthcKeHoachChuyenDich> keHoachChuyenDichs = TthcKeHoachChuyenDichLocalServiceUtil.findByMessageId(request.getMessageId());;
//					if(keHoachChuyenDich!=null){
//						Response response = new Response();
//						response.setMessageId(request.getMessageId());
//						return callWebserviceNSWBusiness.builtMessage225(userSystem+"", header, request.getMessageId(),"01", response);	
//					}else{
						
						List<AswmsgMessageQueue> aswmsgMessageQueues = AswmsgMessageQueueLocalServiceUtil.findByMessageId(request.getMessageId());
						if(aswmsgMessageQueues!=null&&aswmsgMessageQueues.size()>0){
							AswmsgMessageQueue aswmsgMessageQueue = aswmsgMessageQueues.get(0);
							String xml =aswmsgMessageQueue.getAllContent();
							AswmsgMessageQueueLocalServiceUtil.deleteAswmsgMessageQueue(aswmsgMessageQueue.getId());
							return xml; 
						}else{
							Response response = new Response();
							response.setMessageId(request.getMessageId());
							return callWebserviceNSWBusiness.builtMessage225(userSystem+"", header, functionNghiepVu.getRamdomMessage(),"01", response);	
						}
					}
					
//				}
			}
			
		}catch (Exception e) {
			_log.error(e);
		}
		Response response = new Response();
		response.setMessageId(header.getReference().getMessageId());
		return callWebserviceNSWBusiness.builtMessage225(userSystem+"", header,header.getReference().getMessageId(),"01", response);
	}
	private String messageType319Function26TT(Header header, UserInformation information, String data) {
		
		try{
			CheckUserLogin checkUserLogin = new CheckUserLogin();
			UserInformation userInformation = checkUserLogin.check(information.getEmail(), information.getPassword());
			String xmlData = MessageFactory.convertObjectToXml(userInformation);
			return xmlData;
		}catch (Exception e) {
			_log.error(e);
		}
		return "";
	}
	
	private void tuDongGui106(Header header, RemovedVehicle removedVehicle,
			TthcHoSoThuTuc tthcHoSoThuTuc) throws SystemException {
		long idMotCuaNotification;
		MotCuaNotification motCuaNotification;
		long userSystem;
		String lyDoTuChoi;
		userSystem = DKConfigurationManager.getLongProp("DK-system-use-upload_file_system", 0);
		lyDoTuChoi = DKConfigurationManager.getStrProp("khongdongyloaibophuongtien",
				"He thong tu choi loai bo phuong tien");

		motCuaNotification = new MotCuaNotificationImpl();
		idMotCuaNotification = CounterLocalServiceUtil.increment(MotCuaNotification.class.getName());
		motCuaNotification.setId(idMotCuaNotification);
		motCuaNotification.setDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
		motCuaNotification
				.setOrganization(DKConfigurationManager.getStrProp("vr_organization", "ORGANIZATION"));
		motCuaNotification.setMessageID(header.getReference().getMessageId());
		motCuaNotification.setDossierid(tthcHoSoThuTuc.getId());
		motCuaNotification.setRequestContent(removedVehicle.getReasonForRemoving());
		motCuaNotification.setIsReply(0);
		motCuaNotification.setMessageType(MessageType.HO_SO);
		motCuaNotification.setResponse(lyDoTuChoi);
		motCuaNotification.setResponseTime(new Date());
		motCuaNotification.setOfficerName(userSystem + "");
		MotCuaNotificationLocalServiceUtil.addMotCuaNotification(motCuaNotification);
		callWebserviceNSWBusiness.sendMessageComplete(header,null);
		system_message106function30(removedVehicle,userSystem+"",tthcHoSoThuTuc,lyDoTuChoi,0);
		
		return;
	}

	public void system_message106function30(RemovedVehicle removedVehicle,String userName,TthcHoSoThuTuc hoSoThuTuc,String lyDo,int markedAsDelete){
//		RemovedSchedule removedSchedule = RemovedSchedule.class.cast(object);
		
		ConfirmOfRemovedVehicle confirmOfRemovedVehicle = new ConfirmOfRemovedVehicle();
		confirmOfRemovedVehicle.setDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
		confirmOfRemovedVehicle.setOrganization(DKConfigurationManager.getStrProp("vr_organization", "ORGANIZATION"));
		confirmOfRemovedVehicle.setRequestDate(FormatData.parseDateToTring( new Date()));
		confirmOfRemovedVehicle.setName(userName);
		
		confirmOfRemovedVehicle.setReasonForRemoving(lyDo);
		List<ConfirmOfRemovedVehicle.ImportedVehicle> importedVehicles = new ArrayList<ConfirmOfRemovedVehicle.ImportedVehicle>();
		for(RemovedVehicle.ImportedVehicle importedVehicle : removedVehicle.getImportedVehicle()){
		
			ConfirmOfRemovedVehicle.ImportedVehicle vehicle  = new ConfirmOfRemovedVehicle.ImportedVehicle();
			vehicle.setMarkedAsDelete(markedAsDelete);
			vehicle.setChassisNumber(importedVehicle.getChassisNumber());
			vehicle.setCodeNumber(importedVehicle.getCodeNumber());
			vehicle.setEngineNumber(importedVehicle.getEngineNumber());
			vehicle.setProductionYear(importedVehicle.getProductionYear());
			vehicle.setSequenceNo(importedVehicle.getSequenceNo());
			vehicle.setVehicleColor(importedVehicle.getVehicleColor());
			vehicle.setVehicleEngineStatus(importedVehicle.getVehicleEngineStatus());
			importedVehicles.add(vehicle);
					
		}
		if(importedVehicles!=null&&importedVehicles.size()>0){
			confirmOfRemovedVehicle.getImportedVehicle().addAll(importedVehicles);
		}
		
		callWebserviceNSWBusiness.message106va30(userName, hoSoThuTuc, functionNghiepVu.getRamdomMessage(),
				Constants.VERSION_START, confirmOfRemovedVehicle);
	}

	private void messageType103Function30(Header header, List<Object> liObjects, String data)  {
		try{
			//_log.info("messageType103Function30");
//		callWebserviceNSWBusiness.sendMessageComplete(header);
		RemovedSchedule removedSchedule = null;
		
		TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.findByMaThuTuc(header.getSubject()
				.getDocumentType());

		TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchByMaSoHoSo(String.valueOf(header
				.getSubject().getReference()));
		
		long userSystem = DKConfigurationManager.getLongProp("DK-system-use-upload_file_system", 0);
		List<ConfirmedInspection> confirmedInspections = null;
		long checkDaLapBienBanKiemTra =0;
		long checkChuaPhanCongDonViKiemTra=0;
		long requestId = 0;
		//RemovedSchedule.ImportedVehicle vehicleChuaPhanCongKiemTra =null; 
		for (Object object : liObjects) {
			if (object instanceof RemovedSchedule) {
				removedSchedule = RemovedSchedule.class.cast(object);
				requestId = removedSchedule.getRequestId();
				List<RemovedSchedule.ImportedVehicle> importedVehicles= removedSchedule.getImportedVehicle();
				if(importedVehicles!=null){
				int size = importedVehicles.size();
				for(int k=0;k<size;k++){
					RemovedSchedule.ImportedVehicle vehicle = importedVehicles.get(k);
					checkChuaPhanCongDonViKiemTra=VehicleRecordLocalServiceUtil.checkChuaPhanCongDonViKiemTra(vehicle.getCodeNumber(), vehicle.getChassisNumber(),vehicle.getEngineNumber(),tthcHoSoThuTuc.getId());
					if(checkChuaPhanCongDonViKiemTra>0){
						//vehicleChuaPhanCongKiemTra = vehicle;
						if(confirmedInspections==null){
							confirmedInspections = ConfirmedInspectionLocalServiceUtil.getListConfirmedInspection(vehicle.getCodeNumber(), vehicle.getChassisNumber(),vehicle.getEngineNumber(),tthcHoSoThuTuc.getId());
						}
						checkDaLapBienBanKiemTra = VehicleRecordLocalServiceUtil.checkHoanKiemTraDoDaLapBienBanKiemTra(vehicle.getCodeNumber(), vehicle.getChassisNumber(),vehicle.getEngineNumber(),tthcHoSoThuTuc.getId());
						if(checkDaLapBienBanKiemTra>0){
							
						break;
						}
						break;	
					}else{
						if(confirmedInspections==null){
						confirmedInspections = ConfirmedInspectionLocalServiceUtil.getListConfirmedInspection(vehicle.getCodeNumber(), vehicle.getChassisNumber(),vehicle.getEngineNumber(),tthcHoSoThuTuc.getId());
						}
					}

					if(checkDaLapBienBanKiemTra>0){
						break;	
					}
					
					if(checkChuaPhanCongDonViKiemTra>0){
						break;	
					}
					
					
				}
				}
			}
			if(checkDaLapBienBanKiemTra>0){
				break;
			}
			if(checkChuaPhanCongDonViKiemTra>0){
				break;
			}
			
	
		}
		_log.info("checkChuaPhanCongDonViKiemTra  "+checkChuaPhanCongDonViKiemTra+" checkDaLapBienBanKiemTra  "+checkDaLapBienBanKiemTra);
		String lyDo =DKConfigurationManager.getStrProp("lydohethongtuchoidenghihoankiemtra", "He thong tu choi de nghi hoan kiem tra");
		if (checkDaLapBienBanKiemTra > 0) {
			_log.info("messageType103Function30 check > 0");
			userSystem = addMotCuaNotification(header, removedSchedule,
					tthcHoSoThuTuc);
			callWebserviceNSWBusiness.sendMessageComplete(header,null);
			nghiepVuBoSungBusiness.message104function30( removedSchedule,userSystem+"",tthcHoSoThuTuc,lyDo,0,header);
			return;
		}else if(checkChuaPhanCongDonViKiemTra == 0){
			_log.info("confirmedInspections  "+confirmedInspections);
			if(confirmedInspections!=null&&confirmedInspections.size()>0){
				_log.info("confirmedInspections  "+confirmedInspections.size());
				for (int i = 0; i < confirmedInspections.size(); i++) {
					try{
						
					ConfirmedInspection confirmedInspection = confirmedInspections.get(i);
//					_log.info("confirmedInspection "+confirmedInspection.getId()+"  confirmedInspection.getPhieuXuLyPhuId() "+confirmedInspection.getPhieuXuLyPhuId());
					long count = VehicleRecordLocalServiceUtil.countByConfirmedInspectionId(confirmedInspection.getId());
					RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(tthcHoSoThuTuc.getId());
					nghiepVuBoSungBusiness.updateVehicleStatisticsAfterRemoveSchedules(tthcHoSoThuTuc, registeredInspection, count);
					
					
					VehicleRecordLocalServiceUtil.updateVehicleRecordWithConfirmedInspectionId(confirmedInspection.getId());
					MotCuaPhieuXuLyPhuLocalServiceUtil.deleteMotCuaPhieuXuLyPhu(confirmedInspection.getPhieuXuLyPhuId());
					ConfirmedInspectionLocalServiceUtil.deleteConfirmedInspection(confirmedInspection.getId());
					}catch (Exception e) {
						_log.info( " error  messageType103Function30  ");
						_log.error(e);
					}
				}				
			}
			lyDo =DKConfigurationManager.getStrProp("hethongtudongxacnhanhuylichkiemtra", "He thong tu dong xac nhan huy lich kiem tra");
			userSystem = addMotCuaNotification(header, removedSchedule,
					tthcHoSoThuTuc);
			callWebserviceNSWBusiness.sendMessageComplete(header,null);
			nghiepVuBoSungBusiness.message104function30( removedSchedule,userSystem+"",tthcHoSoThuTuc,lyDo,1,header);
			return;
		}
		if(confirmedInspections!=null&&confirmedInspections.size()>0){
			int size = confirmedInspections.size();
			for(int i=0;i<size;i++){
				ConfirmedInspection confirmedInspection = confirmedInspections.get(i);
				if(confirmedInspection.getConfirmationCode() == requestId){
				MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.fetchMotCuaPhieuXuLyPhu(confirmedInspection.getPhieuXuLyPhuId());
				motCuaPhieuXuLyPhu.setGhiChu(motCuaPhieuXuLyPhu.getGhiChu()+" <br> <b> <font color='blue'>  "+
				DKConfigurationManager.getStrProp("bosunghoso", "KH: [ ") + FormatData.parseDateToTringType3( FormatData.parseStringToDate(removedSchedule.getRequestDate()))+" ]"
				+ removedSchedule.getReasonForRemoving()+ " </font> </b>");
				MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(motCuaPhieuXuLyPhu);
				}
			}
		}
		_log.info("xuLyHoSoType103Function30 vao day");
		xuLyHoSoType103Function30(header, liObjects, data,thuTucHanhChinh, tthcHoSoThuTuc);
		
		}catch (Exception e) {
			_log.error(e);
		}
	}

	private long addMotCuaNotification(Header header,
			RemovedSchedule removedSchedule, TthcHoSoThuTuc tthcHoSoThuTuc)
			throws SystemException {
		long idMotCuaNotification;
		MotCuaNotification motCuaNotification;
		long userSystem;
		String lyDoTuChoi;
		userSystem = DKConfigurationManager.getLongProp("DK-system-use-upload_file_system", 0);
		lyDoTuChoi = DKConfigurationManager.getStrProp("hethongtuchoicapnhatcahoso",
				"He thong tu choi cap nhat ca ho so");

		motCuaNotification = new MotCuaNotificationImpl();
		idMotCuaNotification = CounterLocalServiceUtil.increment(MotCuaNotification.class.getName());
		motCuaNotification.setId(idMotCuaNotification);
		motCuaNotification.setDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
		motCuaNotification
				.setOrganization(DKConfigurationManager.getStrProp("vr_organization", "ORGANIZATION"));
		motCuaNotification.setMessageID(header.getReference().getMessageId());
		motCuaNotification.setDossierid(tthcHoSoThuTuc.getId());
		motCuaNotification.setRequestContent(removedSchedule.getReasonForRemoving());
		motCuaNotification.setIsReply(0);
		motCuaNotification.setMessageType(MessageType.HO_SO);
		motCuaNotification.setResponse(lyDoTuChoi);
		motCuaNotification.setResponseTime(new Date());
		motCuaNotification.setOfficerName(userSystem + "");
		MotCuaNotificationLocalServiceUtil.addMotCuaNotification(motCuaNotification);
		return userSystem;
	}

	private void xuLyHoSoType103Function30(Header header, List<Object> liObjects, String data,
			 TthcThuTucHanhChinh thuTucHanhChinh,
			TthcHoSoThuTuc tthcHoSoThuTuc) throws IOException {
		_log.info("---Vinh ==============xuLyHoSoType103Function30==============");
		String mauTrucTuyen;

		for (Object object : liObjects) {
			if (object instanceof RemovedSchedule) {
				_log.info("---RemovedSchedule ==============xuLyHoSoType103Function30==============");

				mauTrucTuyen = Constants.MAU_TRUC_TUYEN_THONG_BAO_HOAN;
				RemovedSchedule removedSchedule = RemovedSchedule.class.cast(object);
				long size = removedSchedule.getImportedVehicle().size();
				String xmlData = MessageFactory.convertObjectToXml(removedSchedule);
				xmlData = XuLyMessage.createContentForNoiDungHoSo(header, xmlData);
				
				long noiDungHoSoId=insertNoiDungHoSo(tthcHoSoThuTuc.getId(), 0, xmlData, thuTucHanhChinh, mauTrucTuyen, header
						.getReference().getVersion(), Constants.MAU_TRUC_TUYEN_THONG_BAO_HOAN, header.getSubject()
						.getSendDate(), "", "",Constants.CHUA_CAP_NHAP_DB_NGHIEP_VU);
				String nhomPhieuXuLy=Constants.MAU_TRUC_TUYEN_THONG_BAO_HOAN;
				String trichYeuNoiDung = DKConfigurationManager.getStrProp("sophuongtienhoankiemtra",
						"So phuong tien DN hoan kiem tra: ");
				trichYeuNoiDung = trichYeuNoiDung + size + " <br> "+  DKConfigurationManager.getStrProp("ngaydenghi",
						"Ngay de nghi: ")  + FormatData.parseDateToTring( FormatData.parseStringToDate(removedSchedule.getRequestDate()));
				trichYeuNoiDung = trichYeuNoiDung + " <br> " + DKConfigurationManager.getStrProp("ma.yeu.cau","(No)") + removedSchedule.getRequestId();
				
				String ghiChu ="<b> <font color='blue'>  "+ DKConfigurationManager.getStrProp("denghihuythutuc", "KH: [ ") + FormatData.parseDateToTringType3( FormatData.parseStringToDate(removedSchedule.getRequestDate()))+" ]";
				ghiChu = ghiChu + removedSchedule.getReasonForRemoving()+ " </font> </b>";

				//String ghiChu =  removedSchedule.getReasonForRemoving();
				long phieuXuLyPhuId = insertPhieuXuLyPhu(tthcHoSoThuTuc.getId(), noiDungHoSoId,  TrangThaiConstains.TAO_MOI,nhomPhieuXuLy,trichYeuNoiDung,ghiChu);
				callWebserviceNSWBusiness.sendMessageComplete(header,phieuXuLyPhuId);
				String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.tb.hoan.kiem.tra", "tb.hoan.kiem.tra");
				long userSystem = DKConfigurationManager.getLongProp("DK-system-use-upload_file_system", 0);
				motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(tthcHoSoThuTuc.getId(), phieuXuLyPhuId, dieuKienChuyenDich, userSystem);
			}
		}
	}
	
	private void xuLyHoSoType105Function30(Header header, List<Object> liObjects, String data,
			 TthcThuTucHanhChinh thuTucHanhChinh,
			TthcHoSoThuTuc tthcHoSoThuTuc) throws IOException {
		_log.info("---Vinh ==============xuLyHoSoType105Function30==============");
		String mauTrucTuyen;

		for (Object object : liObjects) {
			if (object instanceof RemovedVehicle) {
				_log.info("---RemovedVehicle ==============xuLyHoSoType105Function30==============");

				mauTrucTuyen = Constants.MAU_TRUC_TUYEN_BONG_BAO_LOAI_BO_PT;
				RemovedVehicle removedVehicle = RemovedVehicle.class.cast(object);
				long size = removedVehicle.getImportedVehicle().size();
				String xmlData = MessageFactory.convertObjectToXml(removedVehicle);
				xmlData = XuLyMessage.createContentForNoiDungHoSo(header, xmlData);
				long noiDungHoSoId=insertNoiDungHoSo(tthcHoSoThuTuc.getId(), 0, xmlData, thuTucHanhChinh, mauTrucTuyen, header
						.getReference().getVersion(), Constants.MAU_TRUC_TUYEN_BONG_BAO_LOAI_BO_PT, header.getSubject()
						.getSendDate(), "", "",Constants.CHUA_CAP_NHAP_DB_NGHIEP_VU);
				
				String nhomPhieuXuLy ="";

				String trichYeuNoiDungPP = DKConfigurationManager.getStrProp("sophuongtiendenghiloaibo",
						"So phuong tien DN loai bo: ");
				trichYeuNoiDungPP = trichYeuNoiDungPP + size + " <br> "+  DKConfigurationManager.getStrProp("ngaydenghi",
						"Ngay de nghi: ")  +FormatData.parseDateToTringType3( FormatData.parseStringToDate(removedVehicle.getRequestDate()));
				String ghiChu = "<font color='blue'> "+ DKConfigurationManager.getStrProp("bosunghoso", "KH: [ ") +
						FormatData.parseDateToTringType3( FormatData.parseStringToDate(removedVehicle.getRequestDate()))+" ]";
				ghiChu = ghiChu + removedVehicle.getReasonForRemoving()+" </font>"+" <br> ";
				ghiChu = ghiChu + tthcHoSoThuTuc.getGhiChu();
				

				long phieuXuLyPhuId = insertPhieuXuLyPhu(tthcHoSoThuTuc.getId(), noiDungHoSoId,  TrangThaiConstains.TAO_MOI,nhomPhieuXuLy,trichYeuNoiDungPP,ghiChu);
				callWebserviceNSWBusiness.sendMessageComplete(header,phieuXuLyPhuId);
				String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.tb.loai.bo.phuong.tien", "tb.loai.bo.phuong.tien");
				long userSystem = DKConfigurationManager.getLongProp("DK-system-use-upload_file_system", 0);
				motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(tthcHoSoThuTuc.getId(), phieuXuLyPhuId, dieuKienChuyenDich, userSystem);
				
			
			}
		}

	}	
	private void xuLyHoSoType215Function29(Header header, List<Object> liObjects, String data) {
		try{
		_log.info("---Vinh ==============xuLyHoSoType215Function30==============");
		String mauTrucTuyen;

		TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.findByMaThuTuc(header.getSubject()
				.getDocumentType());

		TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchByMaSoHoSo(String.valueOf(header
				.getSubject().getReference()));

		for (Object object : liObjects) {
			if (object instanceof NoticeCertificateEndorsement) {
				_log.info("---RemovedVehicle ==============xuLyHoSoType215Function30==============");

				mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TB_SUA_DOI_CC;
				NoticeCertificateEndorsement endorsement = NoticeCertificateEndorsement.class.cast(object);
				long size = endorsement.getTotalOfEndorsement();
				String xmlData = MessageFactory.convertObjectToXml(endorsement);
				xmlData = XuLyMessage.createContentForNoiDungHoSo(header, xmlData);
				long noiDungHoSoId=insertNoiDungHoSo(tthcHoSoThuTuc.getId(), 0, xmlData, thuTucHanhChinh, mauTrucTuyen, header
						.getReference().getVersion(), Constants.MAU_TRUC_TUYEN_TB_SUA_DOI_CC, header.getSubject()
						.getSendDate(), "", "",Constants.CHUA_CAP_NHAP_DB_NGHIEP_VU);
				
				String nhomPhieuXuLy =Constants.MAU_TRUC_TUYEN_TB_SUA_DOI_CC;

				String trichYeuNoiDungPP = DKConfigurationManager.getStrProp("soluongchungchidenghisua",
						"So luong chung chi de nghi sua: ");
				trichYeuNoiDungPP = trichYeuNoiDungPP + size + " <br> "+  DKConfigurationManager.getStrProp("ngaydenghi",
						"Ngay de nghi: ")  +FormatData.parseDateToTring( FormatData.parseStringToDate(endorsement.getRequestDate()));
				
				String ghiChu = "<font color='blue'> "+ DKConfigurationManager.getStrProp("bosunghoso", "KH: [ ") + FormatData.parseDateToTringType3( FormatData.parseStringToDate(endorsement.getRequestDate()))+" ]";
				ghiChu = ghiChu + endorsement.getReasonForEndorsement()+" </font>";

				long phieuXuLyPhuId = insertPhieuXuLyPhu(tthcHoSoThuTuc.getId(), noiDungHoSoId,  TrangThaiConstains.TAO_MOI,nhomPhieuXuLy,trichYeuNoiDungPP,ghiChu);
				callWebserviceNSWBusiness.sendMessageComplete(header,phieuXuLyPhuId);
				String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.tb.sua.chung.chi", "tb.sua.chung.chi");
				long userSystem = DKConfigurationManager.getLongProp("DK-system-use-upload_file_system", 0);
				motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(tthcHoSoThuTuc.getId(), phieuXuLyPhuId, dieuKienChuyenDich, userSystem);

			}
		}
		}catch (Exception e) {
			_log.error(e);
		}
	}	

	private void xuLyHoSoType99Function02(Header header, List<Object> liObjects, String data,
			RequestForQualityInspection requestForQualityInspection,
			RequestForChangingDateSite requestForChangingDateSite, TthcThuTucHanhChinh thuTucHanhChinh,
			TthcHoSoThuTuc tthcHoSoThuTuc, long hoSoThuTucId,RegisteredInspection registeredInspection)  {
//		_log.info("---Vinh ==============xuLyHoSoType99Function02==============");
		try{
			//RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(hoSoThuTucId);
			
			if ((requestForQualityInspection!= null) && (registeredInspection!=null) && 
					(registeredInspection.getId() > 0) && (registeredInspection.getRegisteredNumber().trim().length() == 0)) {
				registeredInspection.setInspectionDate(FormatData
						.parseStringToDate(requestForQualityInspection.getInspection()
								.getInpectionDate()));
				registeredInspection.setInspectionSite(requestForQualityInspection.getInspection()
						.getInspectionSite());
				registeredInspection.setInspectionDistrictCode(requestForQualityInspection
						.getInspection().getDistrictCode().trim());
				registeredInspection.setInspectionProvinceCode(requestForQualityInspection
						.getInspection().getProvinceCode().trim());
				RegisteredInspectionLocalServiceUtil.updateRegisteredInspection(registeredInspection);
			}
			List<TechnicalSpecification> technicalSpecifications = new ArrayList<TechnicalSpecification>();
			List<VehicleGroup> vehicleGroups = VehicleGroupLocalServiceUtil.findByRegisteredInspectionId(registeredInspection.getId());
			if(vehicleGroups!=null&&vehicleGroups.size()>0){
				
				int size = vehicleGroups.size();
//				_log.info("---Vinh ==============size=============="+size);
				for(int i=0;i<size;i++){
					VehicleGroup vehicleGroup = vehicleGroups.get(i);
//					_log.info("---Vinh ==============size=============="+vehicleGroup.getId());
					ProductionCountryLocalServiceUtil.deleteProductionCountryWithVehicleGroupId(vehicleGroup.getId());
					VehicleRecordLocalServiceUtil.deleteVehicleRecordWithVehicleGroupId(vehicleGroup.getId());
					VehiclerecordInitialLocalServiceUtil.deleteVehicleRecordInitialWithVehicleGroupId(vehicleGroup.getId());
					VehicleSpecificationLocalServiceUtil.deleteVehicleSpecificationInitialWithVehicleGroupId(vehicleGroup.getId());
					
				}
				VehicleStatisticsLocalServiceUtil.deleteVehicleStatisticsWithRegisteredInspectionId(registeredInspection.getId());
				VehicleGroupInitialLocalServiceUtil.deleteVehicleGroupInitialWithRegisteredInspectionId(registeredInspection.getId());
				VehicleGroupLocalServiceUtil.deleteVehicleGroupWithRegisteredInspectionId(registeredInspection.getId());
			}

		String mauTrucTuyen;
		String chiTietNoiDung = "";
		TechnicalSpecification technicalSpecification;

		RequestChanges requestChanges = null;
		for (Object object : liObjects) {

			if (object instanceof RequestChanges) {
				requestChanges = RequestChanges.class.cast(object);
				break;
			}
		}
		for (Object object : liObjects) {
			if (object instanceof RequestForQualityInspection) {
//				_log.info("---RequestForQualityInspection ==============xuLyHoSoType99Function02==============");

				mauTrucTuyen = Constants.MAU_TRUC_TUYEN_BAN_DANG_KY;
				requestForQualityInspection = RequestForQualityInspection.class.cast(object);

				String xmlData = MessageFactory.convertObjectToXml(requestForQualityInspection);
				xmlData = XuLyMessage.createContentForNoiDungHoSo(header, xmlData);
				insertNoiDungHoSo(hoSoThuTucId, 0, xmlData, thuTucHanhChinh, mauTrucTuyen, header
						.getReference().getVersion(), Constants.MAU_TRUC_TUYEN_BAN_DANG_KY, header.getSubject()
						.getSendDate(), "", "",Constants.CHUA_CAP_NHAP_DB_NGHIEP_VU);
				// insertKetQuaDienBien(dienBienHoSoId, noiDungHoSoId);

				for (RequestForQualityInspection.AttachedFile attachedFile : requestForQualityInspection
						.getAttachedFile()) {

					if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("1") == 0) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_HOA_DON_THUONG_MAI;
					} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("2") == 0) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GIAY_TO_KHAC;
					} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("3") == 0) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TAI_LIEU_KY_THUAT;
					} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("2") == 0) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GIAY_TO_KHAC;
					} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("4") == 0) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TAI_LIEU_KHI_THAI;
					} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("5") == 0) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GNC_KIEU_LOAI;
					} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("6") == 0) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GNC_CHAT_LUONG_NSX;
					} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("7") == 0) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GNC_DANG_KY_XE_NSX;
					}
//					_log.info("---RequestForQualityInspection.AttachedFile ==============xuLyHoSoType99Function02=============="+mauTrucTuyen);
					String tenTaiLieu =getTenTaiLieu( mauTrucTuyen, attachedFile.getAttachedDocName(),attachedFile.getAttachedNote());
					insertNoiDungHoSo(hoSoThuTucId, 0, data, thuTucHanhChinh, mauTrucTuyen, header
							.getReference().getVersion(), tenTaiLieu, header.getSubject()
							.getSendDate(), attachedFile.getBase64FileContent(), attachedFile.getFullFileName(),Constants.CHUA_CAP_NHAP_DB_NGHIEP_VU);
					// insertKetQuaDienBien(dienBienHoSoId, noiDungHoSoId);
				}
			} else if (object instanceof TechnicalSpecification) {
//				_log.info("---TechnicalSpecification ==============xuLyHoSoType99Function02==============");
				boolean check=true;
				technicalSpecification = TechnicalSpecification.class.cast(object);
				if(technicalSpecifications!=null&&technicalSpecifications.size()>0){
					int size=technicalSpecifications.size();
					for(int i=0;i<size;i++){
						if(technicalSpecification.getTechnicalSpecCode().equals(technicalSpecifications.get(i).getTechnicalSpecCode())){
							check=false;
							break;
						}
					}
						
				}
				if(check){
					technicalSpecifications.add(technicalSpecification);
					technicalSpecification = TechnicalSpecification.class.cast(object);
					if (technicalSpecification.getGeneralInfo().getMarkAsVehicle() == 1) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_THONG_TIN_XE_NK;
					} else {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_THONG_TIN_DONG_CO;
					}
					String xmlData = MessageFactory.convertObjectToXml(technicalSpecification);
					xmlData = XuLyMessage.createContentForNoiDungHoSo(header, xmlData);
					String tenTaiLieu = tenTaiLieuBangDangKy(technicalSpecification);
					chiTietNoiDung = chiTietNoiDung + "<br>" + tenTaiLieu;
					long noiDungHoSoId=insertNoiDungHoSo(hoSoThuTucId, 0, xmlData, thuTucHanhChinh, mauTrucTuyen,
							technicalSpecification.getTechnicalSpecCode(), tenTaiLieu, header
									.getSubject().getSendDate(), "", "",Constants.DA_CAP_NHAP_DB_NGHIEP_VU);
					// insertKetQuaDienBien(dienBienHoSoId, noiDungHoSoId);
					nghiepVuBusiness.khaiMoiHoSo(registeredInspection, technicalSpecification, noiDungHoSoId);
					for (TechnicalSpecification.AttachedFile attachedFile : technicalSpecification.getAttachedFile()) {
	
						if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("3") == 0) {
							mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TAI_LIEU_KY_THUAT;
						} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("2") == 0) {
							mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GIAY_TO_KHAC;
						} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("4") == 0) {
							mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TAI_LIEU_KHI_THAI;
						} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("5") == 0) {
							mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GNC_KIEU_LOAI;
						} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("6") == 0) {
							mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GNC_CHAT_LUONG_NSX;
						} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("7") == 0) {
							mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GNC_DANG_KY_XE_NSX;
						}
						
						_log.info("---TechnicalSpecification.AttachedFile ==============xuLyHoSoType99Function02=============="+mauTrucTuyen);
						tenTaiLieu =getTenTaiLieu( mauTrucTuyen, attachedFile.getAttachedDocName(),attachedFile.getAttachedNote());
						insertNoiDungHoSo(hoSoThuTucId, 0, data, thuTucHanhChinh, mauTrucTuyen,
								technicalSpecification.getTechnicalSpecCode(),tenTaiLieu, header
										.getSubject().getSendDate(), attachedFile.getBase64FileContent(),
								attachedFile.getFullFileName(),Constants.CHUA_CAP_NHAP_DB_NGHIEP_VU);
						// insertKetQuaDienBien(dienBienHoSoId, noiDungHoSoId);
					}
				}
			}
		}
		if(requestChanges!=null){
			VehicleStatistics vehicleStatistics = VehicleStatisticsLocalServiceUtil.findByRegisteredInspectionId(registeredInspection.getId());
			String ghiChuBanDau = tthcHoSoThuTuc.getGhiChu();
			String[] parts = ghiChuBanDau.split(DKConfigurationManager.getStrProp("THOI_GIAN_DIA_DIEM_KIEM_TRA","Thoi Gian Dia Diem Kiem Tra"), 2);
			String part1 = parts[0]; // su dung part1
			String part2 = parts[1]; 

			
			String ghiChu = "<font color='blue'> "+ DKConfigurationManager.getStrProp("bosunghoso", "KH: [ ") + FormatData.parseDateToTringType3( FormatData.parseStringToDate(requestChanges.getRequestDate()))+" ]";
			ghiChu = ghiChu + requestChanges.getReason()+" </font>"+" <br> " + part1 +" <br> ";
			if(requestForQualityInspection!=null){
			ghiChu = ghiChu +DKConfigurationManager.getStrProp("THOI_GIAN_DIA_DIEM_KIEM_TRA","Thoi Gian Dia Diem Kiem Tra")
					+ "<br>"
					+ FormatData.parseDateToTringType4(FormatData.parseStringToDate(requestForQualityInspection
							.getInspection().getInpectionDate()))
					+ "<br>"
					+ requestForQualityInspection.getInspection().getDistrictName()
					+ "<br>"
					+ requestForQualityInspection.getInspection().getProvinceName();
			}

			tthcHoSoThuTuc.setGhiChu(ghiChu);
			String trichYeuNoiDung = DKConfigurationManager.getStrProp("TONG_SO_PT_DKKT", "TONG SO PT DKKT")
					+ requestForQualityInspection.getTotalNumberVehicle() + chiTietNoiDung;
			tthcHoSoThuTuc.setTrichYeuNoiDung(trichYeuNoiDung);
			tthcHoSoThuTuc.setSynchDate(new Date());
			TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(tthcHoSoThuTuc);
		
		}
		if(technicalSpecifications!=null&&technicalSpecifications.size()>0){
			ImportedVehicleList importedVehicleList = nghiepVuBusiness.createImportedVehicleList( technicalSpecifications);
			String xmlData = MessageFactory.convertObjectToXml(importedVehicleList);
			xmlData = XuLyMessage.createContentForNoiDungHoSo(header, xmlData);
			
			mauTrucTuyen = Constants.MAU_TRUC_TUYEN_BAN_KE_CHI_TIET;
			String tenTaiLieu = mauTrucTuyen+" / "+ importedVehicleList.getImportedVehicle().size();
			insertNoiDungHoSo(hoSoThuTucId, 0, xmlData, thuTucHanhChinh, mauTrucTuyen,
					technicalSpecifications.get(0).getTechnicalSpecCode(), tenTaiLieu, header
							.getSubject().getSendDate(), "", "",Constants.CHUA_CAP_NHAP_DB_NGHIEP_VU);
		}
		MotCuaBusiness motCuaBusiness = new MotCuaBusiness();
		String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.bo.sung", "bo.sung");
		long userSystem = DKConfigurationManager.getLongProp("DK-system-use-upload_file_system", 0);
		motCuaBusiness.dichChuyenTrangThaiPhieuSuLyChinh(hoSoThuTucId, dieuKienChuyenDich, userSystem);
		}catch (Exception e) {
			_log.error(e);
		}
	}

	private void messageType99Function01(Header header, List<Object> liObjects, String data) throws IOException, SystemException {
		String mauTrucTuyen = "";
		TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.findByMaThuTuc(header.getSubject()
				.getDocumentType());
		if (thuTucHanhChinh != null) {
			_log.debug(" Da tim duoc thu tuc hanh chinh  " + thuTucHanhChinh.getId() + "   voi ma  =   "
					+ header.getSubject().getDocumentType());
		} else {
			_log.debug(" Ko tim duoc thu tuc hanh chinh     voi ma  =   " + header.getSubject().getDocumentType());
		}
		RequestForQualityInspection requestForQualityInspection = null;
		TechnicalSpecification technicalSpecification = null;
//		RequestForChangingDateSite requestForChangingDateSite = null;
		for (Object object : liObjects) {

			if (object instanceof RequestForQualityInspection) {
				requestForQualityInspection = RequestForQualityInspection.class.cast(object);
				break;
			}
		}
		for (Object object : liObjects) {

			if (object instanceof TechnicalSpecification) {
				technicalSpecification = TechnicalSpecification.class.cast(object);
				break;
			}
		}
		long hoSoThuTucId = insertHoSo(header, requestForQualityInspection, thuTucHanhChinh,technicalSpecification);
		nghiepVuBusiness.createRegisteredInspection(hoSoThuTucId, requestForQualityInspection);
		String chiTietNoiDung = "";
		//long userSystem = DKConfigurationManager.getLongProp("DK-system-use-upload_file_system", 0);
		long phieuXuLyChinhId = insertPhieuXuLyChinh(hoSoThuTucId, header, requestForQualityInspection, thuTucHanhChinh);
		long dienBienHoSoId = insertDienBienHoSo(phieuXuLyChinhId, 0, TrangThaiConstains.TAO_MOI, DKConfigurationManager.getStrProp("taomoihoso", "He Thong Tao Moi Ho So") , 0, 0, 0);
		List<TechnicalSpecification> technicalSpecifications = new ArrayList<TechnicalSpecification>();
		for (Object object : liObjects) {
			if (object instanceof RequestForQualityInspection) {
				mauTrucTuyen = Constants.MAU_TRUC_TUYEN_BAN_DANG_KY;
				requestForQualityInspection = RequestForQualityInspection.class.cast(object);
				String xmlData = MessageFactory.convertObjectToXml(requestForQualityInspection);
				xmlData = XuLyMessage.createContentForNoiDungHoSo(header, xmlData);
				String tenTaiLieu=Constants.MAU_TRUC_TUYEN_BAN_DANG_KY;
				long noiDungHoSoId = insertNoiDungHoSo(hoSoThuTucId, 0, xmlData, thuTucHanhChinh, mauTrucTuyen, header
						.getReference().getVersion(), tenTaiLieu, header.getSubject()
						.getSendDate(), "", "",Constants.CHUA_CAP_NHAP_DB_NGHIEP_VU);
				insertKetQuaDienBien(dienBienHoSoId, noiDungHoSoId);

				for (RequestForQualityInspection.AttachedFile attachedFile : requestForQualityInspection
						.getAttachedFile()) {

					if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("1") == 0) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_HOA_DON_THUONG_MAI;
					} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("2") == 0) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GIAY_TO_KHAC;
					} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("3") == 0) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TAI_LIEU_KY_THUAT;
					} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("2") == 0) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GIAY_TO_KHAC;
					} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("4") == 0) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TAI_LIEU_KHI_THAI;
					} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("5") == 0) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GNC_KIEU_LOAI;
					} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("6") == 0) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GNC_CHAT_LUONG_NSX;
					} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("7") == 0) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GNC_DANG_KY_XE_NSX;
					}
					 tenTaiLieu =getTenTaiLieu( mauTrucTuyen, attachedFile.getAttachedDocName(),attachedFile.getAttachedNote());
					noiDungHoSoId = insertNoiDungHoSo(hoSoThuTucId, 0, data, thuTucHanhChinh, mauTrucTuyen, header
							.getReference().getVersion(), tenTaiLieu, header.getSubject()
							.getSendDate(), attachedFile.getBase64FileContent(), attachedFile.getFullFileName(),Constants.CHUA_CAP_NHAP_DB_NGHIEP_VU);
					insertKetQuaDienBien(dienBienHoSoId, noiDungHoSoId);
				}
			} else if (object instanceof TechnicalSpecification) {
				boolean check=true;
				technicalSpecification = TechnicalSpecification.class.cast(object);
				if(technicalSpecifications!=null&&technicalSpecifications.size()>0){
					int size=technicalSpecifications.size();
					for(int i=0;i<size;i++){
						if(technicalSpecification.getTechnicalSpecCode().equals(technicalSpecifications.get(i).getTechnicalSpecCode())){
							check=false;
							break;
						}
					}
						
				}
				if(check){
					technicalSpecifications.add(technicalSpecification);
					if (technicalSpecification.getGeneralInfo().getMarkAsVehicle() == 1) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_THONG_TIN_XE_NK;
					} else {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_THONG_TIN_DONG_CO;
					}
					String tenTaiLieuBangDangKy = tenTaiLieuBangDangKy(technicalSpecification);
					chiTietNoiDung = chiTietNoiDung + "<br>" + tenTaiLieuBangDangKy;
					String xmlData = MessageFactory.convertObjectToXml(technicalSpecification);
					xmlData = XuLyMessage.createContentForNoiDungHoSo(header, xmlData);
					long noiDungHoSoId = insertNoiDungHoSo(hoSoThuTucId, 0, xmlData, thuTucHanhChinh, mauTrucTuyen,
							technicalSpecification.getTechnicalSpecCode(), tenTaiLieuBangDangKy, header
									.getSubject().getSendDate(), "", "",Constants.DA_CAP_NHAP_DB_NGHIEP_VU);
					
					RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(hoSoThuTucId);
					nghiepVuBusiness.khaiMoiHoSo(registeredInspection, technicalSpecification, noiDungHoSoId);
					insertKetQuaDienBien(dienBienHoSoId, noiDungHoSoId);
					for (TechnicalSpecification.AttachedFile attachedFile : technicalSpecification.getAttachedFile()) {
	
						if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("3") == 0) {
							mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TAI_LIEU_KY_THUAT;
						} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("2") == 0) {
							mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GIAY_TO_KHAC;
						} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("4") == 0) {
							mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TAI_LIEU_KHI_THAI;
						} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("5") == 0) {
							mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GNC_KIEU_LOAI;
						} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("6") == 0) {
							mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GNC_CHAT_LUONG_NSX;
						} else if (attachedFile.getAttachedTypeCode().compareToIgnoreCase("7") == 0) {
							mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GNC_DANG_KY_XE_NSX;
						}
						tenTaiLieuBangDangKy =getTenTaiLieu( mauTrucTuyen, attachedFile.getAttachedDocName(),attachedFile.getAttachedNote());
						noiDungHoSoId = insertNoiDungHoSo(hoSoThuTucId, 0, data, thuTucHanhChinh, mauTrucTuyen,
								technicalSpecification.getTechnicalSpecCode(),tenTaiLieuBangDangKy, header
										.getSubject().getSendDate(), attachedFile.getBase64FileContent(),
								attachedFile.getFullFileName(),Constants.CHUA_CAP_NHAP_DB_NGHIEP_VU);
						insertKetQuaDienBien(dienBienHoSoId, noiDungHoSoId);
					}
				
				}
			}

		}
//		
		if(technicalSpecifications!=null&&technicalSpecifications.size()>0){
			ImportedVehicleList importedVehicleList = nghiepVuBusiness.createImportedVehicleList( technicalSpecifications);
			String xmlData = MessageFactory.convertObjectToXml(importedVehicleList);
			xmlData = XuLyMessage.createContentForNoiDungHoSo(header, xmlData);
			
			mauTrucTuyen = Constants.MAU_TRUC_TUYEN_BAN_KE_CHI_TIET;
			String tenTaiLieu = mauTrucTuyen+" / "+ importedVehicleList.getImportedVehicle().size();
			insertNoiDungHoSo(hoSoThuTucId, 0, xmlData, thuTucHanhChinh, mauTrucTuyen,
					technicalSpecification.getTechnicalSpecCode(), tenTaiLieu, header
							.getSubject().getSendDate(), "", "",Constants.CHUA_CAP_NHAP_DB_NGHIEP_VU);
			TthcHoSoThuTuc noidunghoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
			noidunghoSoThuTuc.setTrichYeuNoiDung(noidunghoSoThuTuc.getTrichYeuNoiDung() + chiTietNoiDung);
			noidunghoSoThuTuc.setSynchDate(new Date());
			TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(noidunghoSoThuTuc);
			_log.info(" chiTietNoiDung   "+chiTietNoiDung);
		}
		insertPhanCongXuLy(TrangThaiConstains.TAO_MOI, phieuXuLyChinhId, 0);
		callWebserviceNSWBusiness.sendMessageComplete(header,null);
	}

	private String tenTaiLieuBangDangKy(TechnicalSpecification technicalSpecification) {
		String tradeMark=technicalSpecification.getGeneralInfo().getTradeMark();
		if(tradeMark==null||tradeMark.length()==0){
			tradeMark="";
		}else{
			DmDataItem dataItem =  DmDataItemLocalServiceUtil.getByDataGroupCodeNameAndDataItemCode0(DanhMucKey.TRADE_MARK, tradeMark);
			if(dataItem!=null){
				tradeMark=dataItem.getName();
			}
		}
		String modelType=technicalSpecification.getGeneralInfo().getModelType();
		if(modelType==null||modelType.length()==0){
			modelType="";
		}
		String modelCode=technicalSpecification.getGeneralInfo().getModelCode();
		if(modelCode==null||modelCode.length()==0){
			modelCode="";
		}
		String vehicleType = technicalSpecification.getGeneralInfo().getVehicleType();
		if ((vehicleType != null) && (vehicleType.length() > 0) 
			&& (technicalSpecification.getGeneralInfo().getMarkAsVehicle()== 1)){
			DmDataItem dataItem =  DmDataItemLocalServiceUtil.getByDataGroupCodeNameAndDataItemCode0(DanhMucKey.VEHICLE_TYPE, vehicleType);
			if(dataItem!=null){
				vehicleType=" / "+ dataItem.getName();
			}
			 
		}else if (technicalSpecification.getGeneralInfo().getMarkAsVehicle()== 0)		{
			vehicleType = " / "+ DKConfigurationManager.getStrProp("vn.dtt.dongco",	"Dong co ");			
		}else{
			
			vehicleType = "";
			
			
		}
		
		String tenTaiLieu = tradeMark+" / "+modelType+" / ("+modelCode+") / "+technicalSpecification.getImportedVehicle().size();
		return tenTaiLieu;
	}

	private void messageType222Function30(Header header, List<Object> liObjects) throws IOException {
		//String mauTrucTuyen = "";
		TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.findByMaThuTuc(header.getSubject()
				.getDocumentType());
		if (thuTucHanhChinh != null) {
			_log.debug(" Da tim duoc thu tuc hanh chinh  " + thuTucHanhChinh.getId() + "   voi ma  =   "
					+ header.getSubject().getDocumentType());
		} else {
			_log.debug(" Ko tim duoc thu tuc hanh chinh     voi ma  =   " + header.getSubject().getDocumentType());
		}
		SelectedGroupForPayment selectedGroupForPayMent = null;

		for (Object object : liObjects) {

			if (object instanceof SelectedGroupForPayment) {
				selectedGroupForPayMent = SelectedGroupForPayment.class.cast(object);
				break;
			}
		}
		if (selectedGroupForPayMent != null) {
			try {
				createMessage223(selectedGroupForPayMent,header.getReference().getMessageId());
				callWebserviceNSWBusiness.sendMessageComplete(header,ConvertUtil.convertToLong(selectedGroupForPayMent.getTransactionID()));
//				callWebserviceNSWBusiness.sendMessageCompleteMessageId(header,header.getReference().getMessageId());
				// Tra lai ban tin 99-207, con ban tin 207-30 anh The Anh tra
				// cho khac.
				

			} catch (Exception e) {
				_log.error(e);
			}
		}
	}
	
	private void createMessage223(
			SelectedGroupForPayment selectedGroupForPayment,String messageId2) {
		Header headerRequest =null;
		String xml=null;
		try {
			 xml = nghiepVuBusiness.thongBaoNopPhiChoDCXD(selectedGroupForPayment, 0, Constants.KHAI_BAO_TRUC_TUYEN_THONG_BAO_NOP_PHI_LE_PHI);

			
			headerRequest = MessageUtils.readXmlMessageHeader(xml);
			
//			headerRequest = MessageUtils.readXmlMessageHeader(xml);
//			
			long hoSoTtid=0;
//			sendMessgaeFunctions.insertKeHoachChuyenDich(null,null , "dieuKienChuyenDich", "reason", headerRequest.getReference().getMessageId(),null,"30", "209");
//			SendMessgaeFunctions.insertMessageQueue(
//					headerRequest, xml, MessageKey.HTTH_BGT_TO_NSW, TrangThaiHoSo.DA_BO_SUNG_CHO_TIEP_NHAP, 
//					headerRequest.getReference().getMessageId(), MessgaePriorityLevels.CHUA_LAY_RA, hoSoTtid,
//					ConvertUtil.convertToLong(selectedGroupForPayment.getTransactionID()));
			SendMessgaeFunctions.insertMessageQueueMessageId(headerRequest, xml,  MessageKey.HTTH_BGT_TO_NSW, TrangThaiHoSo.DA_BO_SUNG_CHO_TIEP_NHAP, 
					headerRequest.getReference().getMessageId(), MessgaePriorityLevels.CHUA_LAY_RA, hoSoTtid, messageId2);
			
			
		} catch (Exception e) {
			if(headerRequest!=null){
				AswmsgMessageLogDao.insertMessageLogWhenException(headerRequest, xml, MessageKey.HTTH_BGT_TO_NSW_ERROR,
					TrangThaiHoSo.DA_BO_SUNG_CHO_TIEP_NHAP,  headerRequest.getReference().getMessageId(), e.toString(),1);
			}
		}
	}
	private void messageType108AndFunction04(Header header, String data, List<Object> liObjects)
			throws SystemException, IOException {
		TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.findByMaThuTuc(header.getSubject()
				.getDocumentType());
//		callWebserviceNSWBusiness.sendMessageComplete(header);
		String mauTrucTuyen = "";
		//TechnicalSpecification technicalSpecification = null;
		RequestForChangingDateSite requestForChangingDateSite = null;

		for (Object object : liObjects) {

			if (object instanceof RequestForChangingDateSite) {
				requestForChangingDateSite = RequestForChangingDateSite.class.cast(object);
				break;
			}
		}
	
		// long hoSoThuTucId = updateHoSo(header, requestForQualityInspection,
		// thuTucHanhChinh);
		TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchByMaSoHoSo(String.valueOf(header
				.getSubject().getReference()));
		long hoSoThuTucId = tthcHoSoThuTuc.getId();
		
		_log.debug("==hoSoThuTucId====333333=" + hoSoThuTucId);

		for (Object object : liObjects) {
			if (object instanceof RequestForChangingDateSite) {
				requestForChangingDateSite = RequestForChangingDateSite.class.cast(object);
				mauTrucTuyen = Constants.MAU_TRUC_TUYEN_XAC_NHAN_KE_HOACH;
				String xmlData = MessageFactory.convertObjectToXml(requestForChangingDateSite);
				xmlData = XuLyMessage.createContentForNoiDungHoSo(header, xmlData);
				String tenTaiLieu = DKConfigurationManager.getStrProp("ban_xac_nhan_ke_hoach", "Ban xac nhan ke hoach")
						+ FormatData.parseDateToTringType3(FormatData.parseStringToDate(requestForChangingDateSite
								.getInspection().getInpectionDate()));
				long noiDungHoSoId = insertNoiDungHoSo(hoSoThuTucId, 0, xmlData, thuTucHanhChinh, mauTrucTuyen, header
						.getReference().getVersion(), tenTaiLieu, header.getSubject().getSendDate(), "", "",Constants.CHUA_CAP_NHAP_DB_NGHIEP_VU);
				String nhomPhieuXuLy="XACNHANKEHOACH";
				long phieuXuLyPhuId = insertPhieuXuLyPhu(hoSoThuTucId, noiDungHoSoId, TrangThaiConstains.PHIEU_XU_LY_PHU_NHAN_DE_NGHI_KIEM_TRA,nhomPhieuXuLy,"","");
			//	long userSystem = DKConfigurationManager.getLongProp("DK-system-use-upload_file_system", 0);
				insertDienBienHoSo(hoSoThuTucId, phieuXuLyPhuId,
						TrangThaiConstains.TAO_MOI,DKConfigurationManager.getStrProp("xacnhankehoach","Xac nhan ke hoach") , 0, 0, 0);

				boolean check=nghiepVuBusiness.xacNhanKeHoachKiemTra(header, hoSoThuTucId, phieuXuLyPhuId, requestForChangingDateSite,
						noiDungHoSoId);
				if(check){
					callWebserviceNSWBusiness.sendMessageComplete(header,phieuXuLyPhuId);
				}
			}
		}
	}
	
	public boolean messageType106AndFunction30(long hoSoThuTucId, long phieuXuLyPhuId,int dongYHoan,String userName,String lyDo) {
		boolean result = true;
		try {
			if(lyDo == null || lyDo.length() == 0){
				lyDo = "---";
			}
			
			TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
			RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(hoSoThuTucId);
			
			MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.fetchMotCuaPhieuXuLyPhu(phieuXuLyPhuId);
			TthcNoidungHoSo noidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(motCuaPhieuXuLyPhu.getNoiDungHoSoId());

			String data = MessageUtils.replaceXML(noidungHoSo.getNoiDungXml());
			String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.xac.nhan.loai.bo", "xac.nhan.loai.bo");
			String listVehicleId="";
			List<Object> liObjects = MessageFactory.converXMLMessagesContentToObject(data);
			long k=0;
			for (Object object : liObjects) {
				// update
				if (object instanceof RemovedVehicle) {
					RemovedVehicle removedVehicle = RemovedVehicle.class.cast(object);
					_log.info("==========xacNhanLoaiBoPhuongTienKiemTra=============RemovedVehicle");
					ConfirmOfRemovedVehicle confirmOfRemovedVehicle = new ConfirmOfRemovedVehicle();
					confirmOfRemovedVehicle.setDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
					confirmOfRemovedVehicle.setOrganization(DKConfigurationManager.getStrProp("vr_organization", "ORGANIZATION"));
					confirmOfRemovedVehicle.setRequestDate(FormatData.parseDateToTring( new Date()));
					confirmOfRemovedVehicle.setName(userName);
					confirmOfRemovedVehicle.setReasonForRemoving(lyDo);
					List<ConfirmOfRemovedVehicle.ImportedVehicle> importedVehicles = new ArrayList<ConfirmOfRemovedVehicle.ImportedVehicle>();
					for(RemovedVehicle.ImportedVehicle importedVehicle : removedVehicle.getImportedVehicle()){
						k=k+1;
						ConfirmOfRemovedVehicle.ImportedVehicle vehicle  = new ConfirmOfRemovedVehicle.ImportedVehicle();
						vehicle.setSequenceNo(k);
						vehicle.setMarkedAsDelete(dongYHoan);
						vehicle.setChassisNumber(importedVehicle.getChassisNumber());
						vehicle.setCodeNumber(importedVehicle.getCodeNumber());
						vehicle.setEngineNumber(importedVehicle.getEngineNumber());
						vehicle.setProductionYear(importedVehicle.getProductionYear());
						vehicle.setVehicleColor(importedVehicle.getVehicleColor());
						vehicle.setVehicleEngineStatus(importedVehicle.getVehicleEngineStatus());
						importedVehicles.add(vehicle);
						if(dongYHoan==Constants.DONG_Y){
							
							VehicleRecord vehicleRecord  = VehicleRecordLocalServiceUtil.getVehicleRecord(importedVehicle.getCodeNumber(), importedVehicle.getChassisNumber(), importedVehicle.getEngineNumber());
							if(vehicleRecord!=null){
								listVehicleId=listVehicleId+vehicleRecord.getId()+",";
								VehicleRecordLocalServiceUtil.deleteVehicleRecord(vehicleRecord.getId());
							}
						}	
					}
					if(importedVehicles!=null&&importedVehicles.size()>0){
						confirmOfRemovedVehicle.getImportedVehicle().addAll(importedVehicles);						
					}
					VehicleStatistics vehicleStatistics = VehicleStatisticsLocalServiceUtil.findByRegisteredInspectionId(registeredInspection.getId());
					if((vehicleStatistics!=null) && (dongYHoan==Constants.DONG_Y)){
						vehicleStatistics.setTotalRegisteredVehicle(vehicleStatistics.getTotalRegisteredVehicle()-importedVehicles.size());
						vehicleStatistics.setTotalCancelledVehicle(vehicleStatistics.getTotalCancelledVehicle()+importedVehicles.size());
						vehicleStatistics.setTotalNotYetRequestedVehicle(vehicleStatistics.getTotalNotYetRequestedVehicle()-importedVehicles.size());
						vehicleStatistics.setSynchDate(new Date());
						VehicleStatisticsLocalServiceUtil.updateVehicleStatistics(vehicleStatistics);
					}
					String messageIdSentToNSW =functionNghiepVu.getRamdomMessage();
					messageFunctions.insertKeHoachChuyenDich(phieuXuLyPhuId, hoSoThuTucId, dieuKienChuyenDich, listVehicleId, messageIdSentToNSW,null,"30", "106");
					callWebserviceNSWBusiness.message106va30(userName, hoSoThuTuc, messageIdSentToNSW,
							Constants.VERSION_START, confirmOfRemovedVehicle);
					
					
				}
			}
			if(dongYHoan==Constants.DONG_Y){
				
				
				String ghiChu = "<b>"+"<font color='red'> "+  DKConfigurationManager.getStrProp("xacnhanhuythutuc", "DK: [ ") + FormatData.parseDateToTringType3(new Date())+" ] "
				+ DKConfigurationManager.getStrProp("dongyloaibophuongtien",
						"Dong y loai bo phuong tien ")+" </font>" +" </b> <br/> "+motCuaPhieuXuLyPhu.getGhiChu();
				motCuaPhieuXuLyPhu.setGhiChu(ghiChu);
			}else{
				String ghiChu = "<b>"+"<font color='red'> "+  DKConfigurationManager.getStrProp("xacnhanhuythutuc", "DK: [ ") + FormatData.parseDateToTringType3(new Date())+" ] "
						+ DKConfigurationManager.getStrProp("khongdongyloaibophuongtien",
						"Tu choi loai bo pt  ")+" </font>" +" </b> <br/> "+motCuaPhieuXuLyPhu.getGhiChu()+" </font>";
				motCuaPhieuXuLyPhu.setGhiChu(ghiChu);
			}
			MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(motCuaPhieuXuLyPhu);
			
//			String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.xac.nhan.loai.bo", "xac.nhan.loai.bo");
			//long userSystem = DKConfigurationManager.getLongProp("DK-system-use-upload_file_system", 0);
			motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId, phieuXuLyPhuId, dieuKienChuyenDich, ConvertUtil.convertToLong(userName));
			
			if(dongYHoan==Constants.DONG_Y){				
				
				Header header = null;
				header = MessageReturnUtils.crateHeader("04", 101, userName, "", "", hoSoThuTuc);
				TthcThuTucHanhChinh tthcThuTucHanhChinh =  TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(hoSoThuTuc.getThuTucHanhChinhId());
				ImportedVehicleList importedVehicleList = nghiepVuBusiness.updateImportedVehicleList(hoSoThuTucId);
				String xmlData = MessageFactory.convertObjectToXml(importedVehicleList);
				xmlData = XuLyMessage.createContentForNoiDungHoSo(header, xmlData);
				
				String mauTrucTuyen = Constants.MAU_TRUC_TUYEN_BAN_KE_CHI_TIET;
				String tenTaiLieu = mauTrucTuyen+" / "+ importedVehicleList.getImportedVehicle().size();
				insertNoiDungHoSo(hoSoThuTucId, ConvertUtil.convertToLong(userName), xmlData, tthcThuTucHanhChinh, mauTrucTuyen, "", tenTaiLieu, header
								.getSubject().getSendDate(), "", "",Constants.DA_CAP_NHAP_DB_NGHIEP_VU);	
			}
			
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}

	private boolean insertPhanCongXuLy(long trangThaiHoSoId, long phieuXuLyChinhId, long phieuXuLyPhuId) {
		try {

			MotCuaPhanCongXuLy motCuaPhanCongXuLy = new MotCuaPhanCongXuLyImpl();
			long idMotCuaPhanCongXuLy = CounterLocalServiceUtil.increment(MotCuaPhanCongXuLy.class.getName());
			motCuaPhanCongXuLy.setId(idMotCuaPhanCongXuLy);
			motCuaPhanCongXuLy.setTrangThaiHoSoId(trangThaiHoSoId);
			motCuaPhanCongXuLy.setPhieuXuLyChinhId(phieuXuLyChinhId);
			motCuaPhanCongXuLy.setPhieuXuLyPhuId(phieuXuLyPhuId);

			// Cac truong khac insert the nao.

			MotCuaPhanCongXuLyLocalServiceUtil.addMotCuaPhanCongXuLy(motCuaPhanCongXuLy);

			return true;
		} catch (Exception e) {
			_log.error(e);
		}

		return false;
	}

	private boolean insertKetQuaDienBien(long dienBienHoSoId, long noiDungHoSoId) {
		try {

			MotCuaKetQuaDienBien motCuaKetQuaDienBien = new MotCuaKetQuaDienBienImpl();
			long idMotCuaKetQuaDienBien = CounterLocalServiceUtil.increment(MotCuaKetQuaDienBien.class.getName());
			motCuaKetQuaDienBien.setId(idMotCuaKetQuaDienBien);
			motCuaKetQuaDienBien.setDienBienHoSoId(dienBienHoSoId);
			motCuaKetQuaDienBien.setNoiDungHoSoId(noiDungHoSoId);

			MotCuaKetQuaDienBienLocalServiceUtil.addMotCuaKetQuaDienBien(motCuaKetQuaDienBien);

			return true;
		} catch (Exception e) {
			_log.error(e);
		}

		return false;
	}
	
	private long insertNoiDungHoSo(long hoSoThuTucId, long userId, String noiDungXml,
			TthcThuTucHanhChinh thuTucHanhChinh, String mauTrucTuyen, String maTuSinh, String tenTaiLieu,
			String sendDate, String fileAttact, String tenFileDinhKemCaMoRong,long daCapNhat) {

		try {
			TthcNoidungHoSo tthcNoidungHoSo = new TthcNoidungHoSoImpl();
			long id = CounterLocalServiceUtil.increment(TthcNoidungHoSo.class.getName());
			tthcNoidungHoSo.setId(id);
			tthcNoidungHoSo.setHoSoThuTucId(hoSoThuTucId);
			List<TthcThanhPhanHoSo> lTthcThanhPhanHoSos = TthcThanhPhanHoSoLocalServiceUtil
					.findByThuTucHanhChinhIdAndMauTrucTuyen(thuTucHanhChinh.getId(), mauTrucTuyen);
			if (lTthcThanhPhanHoSos != null && lTthcThanhPhanHoSos.size() > 0) {
				tthcNoidungHoSo.setBieuMauHoSoId(lTthcThanhPhanHoSos.get(0).getBieuMauHoSoId());
			}
			tthcNoidungHoSo.setNguoiTao(userId);
			tthcNoidungHoSo.setTenTaiLieu(tenTaiLieu);
			tthcNoidungHoSo.setMaTuSinh(maTuSinh);
			tthcNoidungHoSo.setLoaiTaiLieu(10);
			tthcNoidungHoSo.setDaCapNhat(daCapNhat);
			tthcNoidungHoSo.setNgayGuiNhan(FormatData.parseStringToDate(sendDate));

			if (fileAttact != null && fileAttact.trim().length() > 0) {
				try {
					long userSystem = DKConfigurationManager.getLongProp("DK-system-use-upload_file_system", 0);
					byte[] data3 = Base64.decodeBase64(fileAttact.trim().getBytes());
					long idFileDinhKem = DocumentUtils.uploadTaiLieu(data3, userSystem, tenFileDinhKemCaMoRong);
					tthcNoidungHoSo.setTaiLieuDinhKem(idFileDinhKem);
				} catch (Exception e) {
					_log.error(e);
				}
			} else {
				String data = trimBase64FileContent(noiDungXml);
				tthcNoidungHoSo.setNoiDungXml(data);
				
				//TODO: huymq performance
				ReportUtils.makePdfByNoiDungHoSo(tthcNoidungHoSo);
			}

			TthcNoidungHoSoLocalServiceUtil.addTthcNoidungHoSo(tthcNoidungHoSo);
			
//			if (tthcNoidungHoSo != null) {
//				_log.debug("tthcNoidungHoSo.getId()  " + id);
//			}
			return id;
		} catch (Exception e) {
			_log.error(e);
		}

		return 0;
	}

	private long insertDienBienHoSo(long phieuXuLyChinhId, long phieuXuLyPhuId, long trangThaiTruocId,
			String hanhDongXuLy, int soNgayQuaHan, long trangThaiSau, long userId) {
		try {
			MotCuaDienBienHoSo motCuaDienBienHoSo = new MotCuaDienBienHoSoImpl();
			long id = CounterLocalServiceUtil.increment(MotCuaDienBienHoSo.class.getName());
			motCuaDienBienHoSo.setId(id);
			motCuaDienBienHoSo.setNgayXuLy(new Date());
			motCuaDienBienHoSo.setNguoiXuLy(userId);
//			motCuaDienBienHoSo.set
			motCuaDienBienHoSo.setPhieuXuLyChinhId(phieuXuLyChinhId);
			motCuaDienBienHoSo.setPhieuXuLyPhuId(phieuXuLyPhuId);
			motCuaDienBienHoSo.setTrangThaiSauId(trangThaiSau);
			motCuaDienBienHoSo.setTrangThaiTruocId(trangThaiTruocId);
			motCuaDienBienHoSo.setHanhDongXuLy(hanhDongXuLy);
			motCuaDienBienHoSo.setSoNgayQuaHan(soNgayQuaHan);
			MotCuaDienBienHoSoLocalServiceUtil.addMotCuaDienBienHoSo(motCuaDienBienHoSo);

			return id;
		} catch (Exception e) {
			_log.error(e);
		}

		return 0;
	}

	private long insertHoSo(Header header, RequestForQualityInspection requestForQualityInspection,
			TthcThuTucHanhChinh thuTucHanhChinh,TechnicalSpecification technicalSpecification) {
		try {
			String vehicleClass = technicalSpecification.getGeneralInfo().getVehicleType();
			
			if (technicalSpecification.getGeneralInfo().getMarkAsVehicle() == 0) {
				vehicleClass="DCX";
			} else {
				if (vehicleClass != null && vehicleClass.length() >= 3) {
					vehicleClass = vehicleClass.substring(0, 3);
				}
			}

			TthcHoSoThuTuc tthcHoSoThuTuc = new TthcHoSoThuTucImpl();
			long id = CounterLocalServiceUtil.increment(TthcHoSoThuTuc.class.getName());
			// Luu vao trong day la vehicle class
			tthcHoSoThuTuc.setTenDonViTiepNhan(vehicleClass);
			tthcHoSoThuTuc.setId(id);
			tthcHoSoThuTuc.setMaSoHoSo(String.valueOf(header.getSubject().getReference()));
			tthcHoSoThuTuc.setThuTucHanhChinhId(thuTucHanhChinh.getId());
			tthcHoSoThuTuc.setMaSoChuHoSo(String.valueOf(requestForQualityInspection.getImporter().getImporterCode()));
			tthcHoSoThuTuc.setLoaiChuHoSo(21);
			tthcHoSoThuTuc.setDiaChiChuHoSo(FormatData.replaceSpecialSign(requestForQualityInspection.getImporter()
					.getImporterAddress()));
			tthcHoSoThuTuc.setTenChuHoSo(FormatData.replaceSpecialSign(requestForQualityInspection.getImporter()
					.getImporterName()));
			tthcHoSoThuTuc.setTrichYeuNoiDung(DKConfigurationManager.getStrProp("TONG_SO_PT_DKKT", "TONG SO PT DKKT")
					+ requestForQualityInspection.getTotalNumberVehicle());
			tthcHoSoThuTuc.setNgayGuiHoSo(FormatData.parseStringToDate(header.getSubject().getSendDate()));
			tthcHoSoThuTuc.setNgayTiepNhan(new Date());
			tthcHoSoThuTuc.setGhiChu(DKConfigurationManager.getStrProp("THOI_GIAN_DIA_DIEM_KIEM_TRA",
					"Thoi Gian Dia Diem Kiem Tra")
					+ "<br>"
					+ FormatData.parseDateToTringType4(FormatData.parseStringToDate(requestForQualityInspection
							.getInspection().getInpectionDate()))
					+ "<br>"
					+ requestForQualityInspection.getInspection().getDistrictName()
					+ "<br>"
					+ requestForQualityInspection.getInspection().getProvinceName());
			
			// tthcHoSoThuTuc.setNgayBoSung(new Date());
			// tthcHoSoThuTuc.setNgayDongHoSo(NgayDongHoSo);
			tthcHoSoThuTuc.setNgayHenTra(new Date());
			tthcHoSoThuTuc.setNgayTao(new Date());
			// tthcHoSoThuTuc.setNgayTraKetQua(NgayTraKetQua);
			// tthcHoSoThuTuc.setNguoiTao(NguoiTao);
			tthcHoSoThuTuc.setTrangThaiHoSo(MotCuaTrangThaiHoSoLocalServiceUtil.fetchMotCuaTrangThaiHoSo(1)
					.getTenTrangThai());
			tthcHoSoThuTuc.setPhanNhomHoSoId(10);
			tthcHoSoThuTuc.setToChucQuanLy(DKConfigurationManager.getLongProp("coquantochuc_id", 13102));

			TthcHoSoThuTucLocalServiceUtil.addTthcHoSoThuTuc(tthcHoSoThuTuc);

			return id;
		} catch (Exception e) {
			_log.error(e);
		}
		
		return 0;
	}

	private long insertPhieuXuLyChinh(long hoSoThuTucId, Header header,
			RequestForQualityInspection requestForQualityInspection, TthcThuTucHanhChinh thuTucHanhChinh) {
		try {
			List<MotCuaQuyTrinhThuTuc> liCuaQuyTrinhThuTucs = MotCuaQuyTrinhThuTucLocalServiceUtil
					.findByThuTucHanhChinhIdAndToChucXuLy(thuTucHanhChinh.getId(),
							DKConfigurationManager.getLongProp("coquantochuc_id", 13102));
			MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh = new MotCuaPhieuXuLyChinhImpl();
			// long idMotCuaPhieuXuLyChinh =
			// CounterLocalServiceUtil.increment(MotCuaPhieuXuLyChinh.class.getName());
			motCuaPhieuXuLyChinh.setId(hoSoThuTucId);
			motCuaPhieuXuLyChinh.setHoSoThuTucId(hoSoThuTucId);
			motCuaPhieuXuLyChinh.setTenNguoiNop(requestForQualityInspection.getContacter().getContactName());
			// motCuaPhieuXuLyChinh.setDiaChiNguoiNop(requestForQualityInspection.getContacter().getContact);
			motCuaPhieuXuLyChinh.setSoDtddNguoiNop(requestForQualityInspection.getContacter().getContactPhone());
			motCuaPhieuXuLyChinh.setSoDtcdNguoiNop(requestForQualityInspection.getContacter().getContactPhone());
			motCuaPhieuXuLyChinh.setEmailNguoiNop(requestForQualityInspection.getContacter().getContactEmail());
			motCuaPhieuXuLyChinh.setNgayTaoPhieu(new Date());
			motCuaPhieuXuLyChinh.setTrangThaiHienTaiId(TrangThaiConstains.CHO_TIEP_NHAN);
			if (liCuaQuyTrinhThuTucs != null && liCuaQuyTrinhThuTucs.size() > 0) {
				motCuaPhieuXuLyChinh.setQuyTrinhThuTucId(liCuaQuyTrinhThuTucs.get(0).getId());
			}

			MotCuaPhieuXuLyChinhLocalServiceUtil.addMotCuaPhieuXuLyChinh(motCuaPhieuXuLyChinh);

			return hoSoThuTucId;
		} catch (Exception e) {
			_log.error(e);
		}
		
		return 0;
	}

	private long insertPhieuXuLyPhu(long phieuXuLyChinhId, long noiDungHoSoId,int trangThaiHienTai,String nhomPhieuXuLy,String trichYeuNoiDung,String ghiChu) {
		try {
			MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = new MotCuaPhieuXuLyPhuImpl();
			long idMotCuaPhieuXuLyPhu = CounterLocalServiceUtil.increment(MotCuaPhieuXuLyPhu.class.getName());
			motCuaPhieuXuLyPhu.setId(idMotCuaPhieuXuLyPhu);
			motCuaPhieuXuLyPhu.setPhieuXuLyChinhId(phieuXuLyChinhId);
			motCuaPhieuXuLyPhu.setNoiDungHoSoId(noiDungHoSoId);
			motCuaPhieuXuLyPhu.setNhomPhieuXuLy(nhomPhieuXuLy);
			motCuaPhieuXuLyPhu.setTrichYeuNoiDung(trichYeuNoiDung);
			motCuaPhieuXuLyPhu.setGhiChu(ghiChu);
			motCuaPhieuXuLyPhu.setTrangThaiHienTaiId(trangThaiHienTai);
			motCuaPhieuXuLyPhu.setPhanNhomHoSoId(Constants.PHIEU_XU_LY_PHU_PHAN_CONG_DON_VI_KIEM_TRA);

			 MotCuaPhieuXuLyPhuLocalServiceUtil.addMotCuaPhieuXuLyPhu(motCuaPhieuXuLyPhu);

			return idMotCuaPhieuXuLyPhu;
		} catch (Exception e) {
			_log.error(e);
		}
		
		return 0;
	}

	private static String trimBase64FileContent(String noiDungXml) {
		String returnData = noiDungXml;
		int start = returnData.indexOf("<Base64FileContent>");
		int end = returnData.indexOf("</Base64FileContent>");
		while (start > 0 && end > 0) {
			returnData = returnData.substring(0, start) + returnData.substring(end + 20, returnData.length());
			start = returnData.indexOf("<Base64FileContent>");
			end = returnData.indexOf("</Base64FileContent>");
		}

		return returnData;
	}
	
	private String messageQuue(Header header, String function)  {
		String xmlResult="";
		
		try{
			List<TthcKeHoachChuyenDich> tthcKeHoachChuyenDichs = TthcKeHoachChuyenDichLocalServiceUtil.findByMessageId(header.getReference().getMessageId());
			if(tthcKeHoachChuyenDichs !=null&&tthcKeHoachChuyenDichs.size()>0){
				int size=tthcKeHoachChuyenDichs.size();
				for(int i=0;i<size;i++){
					TthcKeHoachChuyenDich tthcKeHoachChuyenDich = tthcKeHoachChuyenDichs.get(i);
					TthcKeHoachChuyenDichLocalServiceUtil.deleteTthcKeHoachChuyenDich(tthcKeHoachChuyenDich.getId());
				}
			}
		}catch (Exception e) {
			_log.error(e);
		}
		
		return xmlResult;
	}
	
	
	private void messageType137(Header header, String data, List<Object> liObjects) {
		try {
		_log.info("messageType137");
		if(liObjects!=null&&liObjects.size()>0){
			long size = liObjects.size();
			StateList  lsState = null;
			long iDataGroupId = 4;
			_log.info("messageType137 -- iDataGroupId "+ iDataGroupId + "  -- size "+ iDataGroupId + size);			
		
			for(int i=0;i<size;i++){
				Object object =liObjects.get(i);
				if(object instanceof StateList){
					lsState = StateList.class.cast(object);
				   List<StateList.State>  StateList=	lsState.getState();
				   if(StateList!=null&&StateList.size()>0){
					   int sizeDistricList = StateList.size();
					   
					   for(int j=0;j<sizeDistricList;j++){
						   StateList.State objState = StateList.get(j) ;
						   DmDataItem dataitem = new DmDataItemImpl();
						   dataitem.setDataGroupId(iDataGroupId);
						   dataitem.setCode0(objState.getStateCode());
						   dataitem.setCode1(null);
						   dataitem.setCode2(null);
						   dataitem.setCode3(null);
						   dataitem.setLevel(0); // QuocGia
						   dataitem.setName(objState.getName());
						   dataitem.setAlterName(null);
						   dataitem.setDescription(null);
						   dataitem.setValidatedTo(null);
						   dataitem.setValidatedFrom(FormatData.parseStringToDate("2016-01-01"));
						   if (objState.getStatus() == Constants.MarkUpDelete_chua_xoa)
						   {
							   _log.info("messageType137  Xoa");
							   dataitem.setStatus(Constants.MarkUpDelete_chua_xoa); 
							   DmDataItem item = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(iDataGroupId, objState.getStateCode());
							   dataitem.setId(item.getId());
							   DmDataItemLocalServiceUtil.updateDmDataItem(dataitem);
						   }
						   else if (objState.getStatus() == 2 ){
							   _log.info("messageType137  Them");
							   DmDataItem item = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(iDataGroupId, objState.getStateCode());

							   if (item != null)
							   {
								   dataitem.setStatus(1);
								   dataitem.setId(item.getId());
								   DmDataItemLocalServiceUtil.updateDmDataItem(dataitem);
							   }else
							   {
								   dataitem.setStatus(1);
								   DmDataItemLocalServiceUtil.addDmDataItem(dataitem);
							   }
						   }
						   else if (objState.getStatus() == 1 ){
							   _log.info("messageType137  Sua");
							   dataitem.setStatus(1);							   
							   DmDataItem item = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(iDataGroupId, objState.getStateCode());
							   dataitem.setId(item.getId());
							   DmDataItemLocalServiceUtil.updateDmDataItem(dataitem);
						   }
						   else {
							   _log.info("messageType137  Them/ Sua");
							   dataitem.setStatus(1);
							   DmDataItemLocalServiceUtil.addDmDataItem(dataitem);
						   }   
					   }
				   }
				}
			}
		}

		} catch (Exception e) {
			_log.error(e);
		}
		
		
	}

	
	private void messageType138(Header header, String data, List<Object> liObjects) {
		try {
		_log.info("messageType138");
		if(liObjects!=null&&liObjects.size()>0){
			long size = liObjects.size();
			ProvinceList  lsProvince = null;
			long iDataGroupId = 33;
			_log.info("messageType138 -- iDataGroupId "+ iDataGroupId + "  -- size "+ iDataGroupId + size);			
			for(int i=0;i<size;i++){
				Object object =liObjects.get(i);
				if(object instanceof ProvinceList){
					lsProvince = ProvinceList.class.cast(object);
				   List<ProvinceList.Province>  ProvinceList=	lsProvince.getProvince();
				   if(ProvinceList!=null&&ProvinceList.size()>0){
					   int sizeProvinceList = ProvinceList.size();
					   
					   for(int j=0;j<sizeProvinceList;j++){
						   ProvinceList.Province objProvince = ProvinceList.get(j) ;
						   DmDataItem dataitem = new DmDataItemImpl();
						   dataitem.setDataGroupId(iDataGroupId);
						   dataitem.setCode0(objProvince.getProvinceCode());
						   dataitem.setCode1(null);
						   dataitem.setCode2(null);
						   dataitem.setCode3(null);
						   dataitem.setLevel(1); // TinhThanh
						   dataitem.setName(objProvince.getProvinceName());
						   dataitem.setDescription(null);
						   dataitem.setValidatedTo(null);
						   dataitem.setValidatedFrom(FormatData.parseStringToDate("2016-01-01"));
						   if (objProvince.getStatus() == Constants.MarkUpDelete_chua_xoa)
						   {
							   _log.info("messageType138  Xoa");
							   dataitem.setStatus(Constants.MarkUpDelete_chua_xoa); 	
							   DmDataItem item = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(iDataGroupId, objProvince.getProvinceCode());
							   dataitem.setId(item.getId());
							   DmDataItemLocalServiceUtil.updateDmDataItem(dataitem);
						   }
						   else if (objProvince.getStatus() == 2 ){
							   _log.info("messageType138  Them");
							   DmDataItem item = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(iDataGroupId, objProvince.getProvinceCode());
							   
							   if (item != null)
							   {
								   dataitem.setStatus(1);
								   dataitem.setId(item.getId());
								   DmDataItemLocalServiceUtil.updateDmDataItem(dataitem);
							   }else
							   {
								   dataitem.setStatus(1);
								   DmDataItemLocalServiceUtil.addDmDataItem(dataitem);
							   }
						   }
						   else if (objProvince.getStatus() == 1 ){
							   _log.info("messageType138  Sua");
							   dataitem.setStatus(1);							   
							   DmDataItem item = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(iDataGroupId, objProvince.getProvinceCode());
							   dataitem.setId(item.getId());
							   DmDataItemLocalServiceUtil.updateDmDataItem(dataitem);
						   }
						   else {
							   _log.info("messageType138  Them/ Sua");
							   dataitem.setStatus(1);
							   DmDataItemLocalServiceUtil.addDmDataItem(dataitem);
						   }
						   
					   }
				   }
				}
			}
		}

		} catch (Exception e) {
			_log.error(e);
		}
		
		
	}

	
	private void messageType139(Header header, String data, List<Object> liObjects) {
		try {
			
			
		_log.info("messageType139");
		if(liObjects!=null&&liObjects.size()>0){
			long size = liObjects.size();
			DistrictList  lsDistrict = null;
			long iDataGroupId = 33;
			_log.info("messageType139 -- iDataGroupId "+ iDataGroupId + "  -- size "+ iDataGroupId + size);
			for(int i=0;i<size;i++){
				Object object =liObjects.get(i);
				if(object instanceof DistrictList){
					lsDistrict = DistrictList.class.cast(object);
				   List<DistrictList.District>  districtList=	lsDistrict.getDistrict();
				   if(districtList!=null&&districtList.size()>0){
					   int sizeDistricList = districtList.size();
					   
					   for(int j=0;j<sizeDistricList;j++){
						   DistrictList.District objDistrict = districtList.get(j) ;
						   
						   DmDataItem dataitem = new DmDataItemImpl();
						   dataitem.setDataGroupId(iDataGroupId);
						   dataitem.setCode0(objDistrict.getDistrictCode());
						   dataitem.setCode1(null);
						   dataitem.setCode2(null);
						   dataitem.setCode3(null);
						   dataitem.setLevel(2); // QuanHuyen
						   dataitem.setName(objDistrict.getDistrictName());
						   dataitem.setAlterName(objDistrict.getProvinceCode());
						   dataitem.setDescription(null);
						   dataitem.setValidatedTo(null);
						   dataitem.setValidatedFrom(FormatData.parseStringToDate("2016-01-01"));
						   if (objDistrict.getStatus() == Constants.MarkUpDelete_chua_xoa)
						   {
							   _log.info("messageType139  Xoa");
							   dataitem.setStatus(Constants.MarkUpDelete_chua_xoa); 
							   DmDataItem item = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(iDataGroupId, objDistrict.getDistrictCode());
							   dataitem.setId(item.getId());
							   DmDataItemLocalServiceUtil.updateDmDataItem(dataitem);
						   }
						   else if (objDistrict.getStatus() == 2 ){
							   _log.info("messageType139  Them");
							   DmDataItem item = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(iDataGroupId, objDistrict.getDistrictCode());
							   
							   if (item != null)
							   {
								   dataitem.setStatus(1);
								   dataitem.setId(item.getId());
								   DmDataItemLocalServiceUtil.updateDmDataItem(dataitem);
							   }else
							   {
								   dataitem.setStatus(1);
								   DmDataItemLocalServiceUtil.addDmDataItem(dataitem);
							   }
							   
						   }
						   else if (objDistrict.getStatus() == 1 ){
							   _log.info("messageType139  Sua");
							   dataitem.setStatus(1);							   
							   DmDataItem item = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(iDataGroupId, objDistrict.getDistrictCode());
							   dataitem.setId(item.getId());
							   DmDataItemLocalServiceUtil.updateDmDataItem(dataitem);
						   }
						   else {
							   _log.info("messageType139  Them/ Sua");
							   dataitem.setStatus(1);
							   DmDataItemLocalServiceUtil.addDmDataItem(dataitem);
						   }
						   
						  
					   }
				   }
				}
			}
		}
		
		} catch (Exception e) {
			_log.error(e);
		}
		
		
	}

}
