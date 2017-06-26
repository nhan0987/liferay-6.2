package vn.dtt.gt.dk.portlet.business;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich;
import vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo;
import vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcKeHoachChuyenDichLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection;
import vn.dtt.gt.dk.message.BanTin219;
import vn.dtt.gt.dk.message.BanTinSystemSignature;
import vn.dtt.gt.dk.message.MessageKey;
import vn.dtt.gt.dk.message.MessageReturnUtils;
import vn.dtt.gt.dk.message.MessageType;
import vn.dtt.gt.dk.message.MessageUtils;
import vn.dtt.gt.dk.message.dao.AswmsgMessageLogDao;
import vn.dtt.gt.dk.nsw.CreateMessageFactory;
import vn.dtt.gt.dk.nsw.Header;
import vn.dtt.gt.dk.nsw.message.xml.MessageFactory;
import vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity;
import vn.dtt.gt.dk.nsw.model.ConfirmCancellation;
import vn.dtt.gt.dk.nsw.model.ConfirmCertificateCancellation;
import vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement;
import vn.dtt.gt.dk.nsw.model.ConfirmOfRemovedSchedule;
import vn.dtt.gt.dk.nsw.model.ConfirmOfRemovedVehicle;
import vn.dtt.gt.dk.nsw.model.ConfirmationOfAssignment;
import vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity;
import vn.dtt.gt.dk.nsw.model.CurrentStatusOfImportedVehicleList;
import vn.dtt.gt.dk.nsw.model.DebitNote;
import vn.dtt.gt.dk.nsw.model.DebitNoteByCertificate;
import vn.dtt.gt.dk.nsw.model.InspectorSign;
import vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection;
import vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity;
import vn.dtt.gt.dk.nsw.model.NoticeOfViolation;
import vn.dtt.gt.dk.nsw.model.PaymentConfirmation;
import vn.dtt.gt.dk.nsw.model.Request;
import vn.dtt.gt.dk.nsw.model.RequestForControl;
import vn.dtt.gt.dk.nsw.model.RequestOfEmissionTesting;
import vn.dtt.gt.dk.nsw.model.RequestOfSafeTesting;
import vn.dtt.gt.dk.nsw.model.Response;
import vn.dtt.gt.dk.nsw.model.ScheduleReport;
import vn.dtt.gt.dk.nsw.model.TechnicalSpecification;
import vn.dtt.gt.dk.putdataform2object.XacNhanDangKyKiemTraObject;
import vn.dtt.gt.dk.sendmessage.MessgaePriorityLevels;
import vn.dtt.gt.dk.sendmessage.SendMessgaeFunctions;
import vn.dtt.gt.dk.utils.TrangThaiHoSo;
import vn.dtt.gt.dk.utils.codec.FileUtils;
import vn.dtt.gt.dk.utils.config.DKConfigurationManager;
import vn.dtt.gt.dk.utils.format.Constants;
import vn.dtt.gt.dk.utils.format.DateUtils;
import vn.dtt.gt.dk.utils.format.FormatData;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.util.portlet.PortletProps;

public class CallWebserviceNSWBusiness {
	
	private static Log _log = LogFactoryUtil.getLog(CallWebserviceNSWBusiness.class);
	FunctionNghiepVu functionNghiepVu = new FunctionNghiepVu();
	SendMessgaeFunctions messgaeFunctions = new SendMessgaeFunctions();
	
	public void messageSuaDoiBoSung(long hoSotthcongId, String messageId, String version, String userName, String reason, String ngayHanChotBoSung) {
		Header header = null;
		String xmlData = null;
		try {
			
			_log.debug("==requestCodeHeader==" + messageId);
			//functionNghiepVu.getRamdomMessage()
			//String messageIdSentToNSW = UUID.randomUUID().toString();
			//			String messageIdSentToNSW = functionNghiepVu.getRamdomMessage();
			//			String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.doi.chieu.thieu.tai.lieu", "doi.chieu.thieu.tai.lieu");
			//			messgaeFunctions.insertKeHoachChuyenDich(null, hoSotthcongId, dieuKienChuyenDich, ghiChu, messageIdSentToNSW);
			TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSotthcongId);
			
			//			hoSoThuTuc.setGhiChu( "<font color='red'> "+ reason+" </font>");
			String ghiChu =
				"<font color='red'> " + DKConfigurationManager.getStrProp("xacnhanhuythutuc", "DK: [ ") + FormatData.parseDateToTringType3(new Date()) + " ] ";
			ghiChu = ghiChu + reason + " </font>" + " <br> ";
			ghiChu = ghiChu + hoSoThuTuc.getGhiChu();
			hoSoThuTuc.setGhiChu(ghiChu);
			
			TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(hoSoThuTuc);
			
			header = MessageReturnUtils.crateHeader("20", 99, userName, messageId, version, hoSoThuTuc);
			
			Date dateHanChotBoSung = DateUtils.stringToDate(ngayHanChotBoSung, "dd/MM/yyyy HH:mm");
			
			xmlData =
				CreateMessageFactory.createMessageRequestChanges(
					new Date(), DKConfigurationManager.getStrProp("vr_organization", "ORGANIZATION"), DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"),
					userName, reason, Validator.isNull(dateHanChotBoSung) ? new Date() : dateHanChotBoSung);
			String xml =
				messgaeFunctions.insertMesssageToQueue(
					userName, hoSoThuTuc, version, messageId, "20", 99, xmlData, BanTinSystemSignature.systemSignature(), MessgaePriorityLevels.HIGHT, null);
			//			String xml = sendMessage2HaiQuan(messageIdSentToNSW, header, xmlData, BanTinSystemSignature.systemSignature());
			//MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh = MotCuaPhieuXuLyChinhLocalServiceUtil.fetchMotCuaPhieuXuLyChinh(hoSotthcongId);
			
//			_log.debug("=======Du lieu NHAN  HQMC day ========" + xml);
		} catch (Exception e) {
			AswmsgMessageLogDao.insertMessageLogWhenException(
				header, xmlData, MessageKey.HTTH_BGT_TO_NSW_ERROR, TrangThaiHoSo.DA_BO_SUNG_CHO_TIEP_NHAP, messageId, e.toString(), 1);
			
			_log.error(e);
		}
	}
	
	public void message99va22(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			String requestCodeHeader = PortletProps.get(MessageKey.REQUEST_CODE_DEFAULT);
			String version = PortletProps.get(MessageKey.VERSION_HEADER_DEFAULT);
			_log.debug("message99va22==requestCodeHeader==" + requestCodeHeader + "==VERSION==" + version);
			
			String messageId = requestCodeHeader;
			int messageType = 99;
			String messageFunction = "22";
			
			String xmlData = CreateMessageFactory.createMessageReject("01", "01", "01", "01", "01", new Date());
			//sendTestToNSW(version, messageId, messageFunction, messageType, xmlData,null);
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public void message99va20(String messageId, String version, String userName, String reason) {
		try {
			
			int messageType = 99;
			String messageFunction = "20";
			String xmlData =
				CreateMessageFactory.createMessageRequestChanges(
					new Date(), DKConfigurationManager.getStrProp("vr_organization", "ORGANIZATION"), DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"),
					userName, reason, new Date());
			//String xmlData = CreateMessageFactory.createMessageRequestChanges(new Date(), "01", "01", "01", "01", new Date());
			//sendTestToNSW(version, messageId, messageFunction, messageType, xmlData,null);
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	
	public String message200va30(
		String userName, long hoSoThuTucId, String requestCodeHeader, String version, String registeredNumber, XacNhanDangKyKiemTraObject dangKyKiemTraObject,
		ActionRequest actionRequest, RegisteredInspection registeredInspection)
		throws IOException, SystemException {
		
		//			_log.info("-message200va30==requestCodeHeader==" + requestCodeHeader + "==VERSION==" + version);
		
		_log.debug("message200va30==requestCodeHeader==" + requestCodeHeader + "==VERSION==" + version);
		TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
		String messageId = requestCodeHeader;
		int messageType = 200;
		String messageFunction = "30";
		
		InspectorSign inspectorSign = new InspectorSign();
		inspectorSign.setRegisteredNumber(registeredNumber);
		inspectorSign.setOrganization(DKConfigurationManager.getStrProp("vr_organization", "ORGANIZATION"));
		inspectorSign.setDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
		inspectorSign.setSignName(dangKyKiemTraObject.getInspectorSignName());
		inspectorSign.setSignTitle(dangKyKiemTraObject.getInspectorSignTitle());
		inspectorSign.setSignPlace(dangKyKiemTraObject.getInspectorSignPlace());
		inspectorSign.setSignDate(FormatData.parseDateToTring(new Date()));
		
		List<vn.dtt.gt.dk.nsw.model.InspectorSign.AttachedFile> attachedFiles = new ArrayList<vn.dtt.gt.dk.nsw.model.InspectorSign.AttachedFile>();
		try {
			vn.dtt.gt.dk.nsw.model.InspectorSign.AttachedFile attachedFilePDFKy = new vn.dtt.gt.dk.nsw.model.InspectorSign.AttachedFile();
			long kySoId = 0;
			TthcNoidungHoSo noidungHoSo = null;
			
			if (registeredInspection != null) {
				noidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(registeredInspection.getAttachedFile());
				if (noidungHoSo != null) {
					kySoId = noidungHoSo.getTaiLieuDinhKem();
				}
			}
			if (kySoId > 0) {
				//					String urlFilePDFKy = NghiepVuBusiness.getHost(actionRequest) + DocumentUtils.getLinkDownloadFromNoiLuuTruTaiLieuId(kySoId);
				_log.info("--------kySoId-----" + kySoId);
				attachedFilePDFKy.setAttachedTypeCode("200");
				attachedFilePDFKy.setAttachedTypeName("MAU_FILE_KY");
				attachedFilePDFKy.setAttachedDocName("MAU_FILE_KY");
				attachedFilePDFKy.setAttachedNote("MAU_FILE_KY");
				attachedFilePDFKy.setAttachedSequenceNo(3);
				attachedFilePDFKy.setBase64FileContent(FileUtils.getBase64FileContent1(kySoId));				
				attachedFilePDFKy.setFullFileName(FileUtils.getNameByFileEntryId(kySoId));
				
				attachedFiles.add(attachedFilePDFKy);
				// END
			}
			if (attachedFiles != null && attachedFiles.size() > 0) {
				inspectorSign.getAttachedFile().addAll(attachedFiles);
			}
		} catch (Exception e) {
			_log.error(e);
		}
		
		String xmlData = MessageFactory.convertObjectToXml(inspectorSign);
		
		//				_log.info("============xmlData==SAU========"+xmlData);
		
		String kq =
			messgaeFunctions.insertMesssageToQueue(
				userName, hoSoThuTuc, version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature(), MessgaePriorityLevels.HIGHT,
				null);
		//			MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh = MotCuaPhieuXuLyChinhLocalServiceUtil.fetchMotCuaPhieuXuLyChinh(hoSoThuTuc.getId());
		//			String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.cap.giay.dkkt", "cap.giay.dkkt");
		//			messgaeFunctions.insertKeHoachChuyenDich(null,hoSoThuTucId, dieuKienChuyenDich, null, messageId);
		return kq;
		
	}
	
	/** message99va24 */
	public void message99va24(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			// String requestCodeHeader =
			// PortletProps.get(MessageKey.REQUEST_CODE_DEFAULT);
			// String version =
			// PortletProps.get(MessageKey.VERSION_HEADER_DEFAULT);
			String requestCodeHeader = ParamUtil.getString(actionRequest, MessageKey.lOG_MESSAGEID);
			String version = ParamUtil.getString(actionRequest, MessageKey.LOG_VERSION);
			_log.debug("message99va24==requestCodeHeader==" + requestCodeHeader + "==VERSION==" + version);
			
			String messageId = requestCodeHeader;
			int messageType = 99;
			String messageFunction = "24";
			
			String xmlData = "";
			// String xmlData = CreateMessageFactory.createMessageReject("01",
			// "01", "01", "01", "01", new Date());
			// String xmlData =
			// CreateMessageFactory.createMessageRequestChanges(new Date(),
			// "01", "01", "01", "01", new Date());
			// String xmlData =
			// CreateMessageFactory.create_24_XacNhanHuyThuTuc("01", new Date(),
			// "02", "01", "01", "02");
			// String xmlData = CreateMessageFactory.createMessageHuyHoSo("01",
			// new Date(), "02", "01", "01", "02");
			//sendTestToNSW(version, messageId, messageFunction, messageType, xmlData,null);
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	/** message100va99 */
	public void message100va99(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			//			String requestCodeHeader = ParamUtil.getString(actionRequest, MessageKey.lOG_MESSAGEID);
			//			String version = ParamUtil.getString(actionRequest, MessageKey.LOG_VERSION);
			//			_log.debug("message100va99==requestCodeHeader==" + requestCodeHeader + "==VERSION==" + version);
			//
			//			String messageId = requestCodeHeader;
			//			int messageType = 100;
			//			String messageFunction = "99";
			//			// AswmsgMessageLog messageLog =
			//			// AswmsgMessageLogLocalServiceUtil.getByVersionAndMessageId(version,
			//			// messageId);
			//			// String allContent = messageLog.getAllContent();
			//
			//			String xmlData = CreateMessageFactory.createMessageRequestChanges(new Date(), "01", "01", "01", "01",
			//					new Date());
			//			sendTestToNSW(version, messageId, messageFunction, messageType, xmlData,null);
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public void message101va99(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			//			String requestCodeHeader = ParamUtil.getString(actionRequest, MessageKey.lOG_MESSAGEID);
			//			String version = ParamUtil.getString(actionRequest, MessageKey.LOG_VERSION);
			//			_log.debug("message101va99==requestCodeHeader==" + requestCodeHeader + "==VERSION==" + version);
			//
			//			String messageId = requestCodeHeader;
			//			int messageType = 101;
			//			String messageFunction = "99";
			//
			//			String xmlData = CreateMessageFactory.createMessageRequestChanges(new Date(), "01", "01", "01", "01",
			//					new Date());
			//			sendTestToNSW(version, messageId, messageFunction, messageType, xmlData,null);
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public void message102va99(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			//			String requestCodeHeader = ParamUtil.getString(actionRequest, MessageKey.lOG_MESSAGEID);
			//			String version = ParamUtil.getString(actionRequest, MessageKey.LOG_VERSION);
			//			_log.debug("message101va99==requestCodeHeader==" + requestCodeHeader + "==VERSION==" + version);
			//
			//			String messageId = requestCodeHeader;
			//			int messageType = 102;
			//			String messageFunction = "99";
			//
			//			String xmlData = CreateMessageFactory.createMessageRequestChanges(new Date(), "01", "01", "01", "01",
			//					new Date());
			//			sendTestToNSW(version, messageId, messageFunction, messageType, xmlData,null);
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public void message108va99(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			//			String requestCodeHeader = PortletProps.get(MessageKey.REQUEST_CODE_DEFAULT);
			//			String version = PortletProps.get(MessageKey.VERSION_HEADER_DEFAULT);
			//			_log.debug("message108va99==requestCodeHeader==" + requestCodeHeader + "==VERSION==" + version);
			//
			//			String messageId = requestCodeHeader;
			//			int messageType = 108;
			//			String messageFunction = "99";
			//
			//			// String xmlData = BanTin108.createXacNhanDKKT_CL("01", "01", "01",
			//			// "01", "01", "01", new Date());
			//			String xmlData = CreateMessageFactory.createMessageRequestChanges(new Date(), "01", "01", "01", "01",
			//					new Date());
			//			sendTestToNSW(version, messageId, messageFunction, messageType, xmlData,null);
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public void message108va22(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			//			String requestCodeHeader = PortletProps.get(MessageKey.REQUEST_CODE_DEFAULT);
			//			String version = PortletProps.get(MessageKey.VERSION_HEADER_DEFAULT);
			//			_log.debug("message108va21==requestCodeHeader==" + requestCodeHeader + "==VERSION==" + version);
			//
			//			String messageId = requestCodeHeader;
			//			int messageType = 108;
			//			String messageFunction = "21";
			//
			//			String xmlData = BanTin108.createXacNhanDKKT_CL("01", "01", "01", "01", "01", "01", new Date());
			//			sendTestToNSW(version, messageId, messageFunction, messageType, xmlData,null);
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public void message201va30(String userName, TthcHoSoThuTuc hoSoThuTuc, String messageId, String version, ScheduleReport scheduleReport, long phieuXuLyPhuId) {
		
		try {
			
			int messageType = 201;
			String messageFunction = "30";
			String xmlData = MessageFactory.convertObjectToXml(scheduleReport);
			//			String xmlData = BanTin201.createXeBonBanh();
			
			//			sendMesssageToNSW(userName,hoSoThuTuc,version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature());
			xmlData =
				messgaeFunctions.insertMesssageToQueue(
					userName, hoSoThuTuc, version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature(),
					MessgaePriorityLevels.HIGHT, null);
			
			//			MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh = MotCuaPhieuXuLyChinhLocalServiceUtil.fetchMotCuaPhieuXuLyChinh(hoSoThuTuc.getId());
			//			String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.phan.cong.dkv", "phan.cong.dkv");
			//			messgaeFunctions.insertKeHoachChuyenDich(phieuXuLyPhuId,  hoSoThuTuc.getId(), dieuKienChuyenDich, null, messageId);
			//			
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public String builtMessage224(String userName, Header header, String messageId, String version, Request response) {
		String xmlData = "";
		try {
			
			int messageType = 224;
			String messageFunction = "26";
			xmlData = MessageFactory.convertObjectToXml(response);
			//_log.info("xmlData  "+xmlData);			
			String messageIdSentToNSW = messageId;
			//AswmsgMessageLog messageLog = AswmsgMessageLogLocalServiceUtil.getByVersionAndMessageId(version, messageId);
			Header header1 = MessageReturnUtils.crateHeader(messageFunction, messageType, userName, messageIdSentToNSW, version, header);
			
			// _log.info("========header===sendTestToNSW===" + header1.getFrom().getName()+"  "+header1.getFrom().getMinistryCode());
			
			xmlData = XuLyMessage.createContentSendFromBgtvtToNSW(header1, xmlData, messageIdSentToNSW, BanTinSystemSignature.systemSignature());
		} catch (Exception e) {
			_log.error(e);
		}
		return xmlData;
	}
	
	public String builtMessage225(String userName, Header header, String messageId, String version, Response response) {
		String xmlData = "";
		try {
			
			int messageType = 225;
			String messageFunction = "26";
			xmlData = MessageFactory.convertObjectToXml(response);
			//_log.info("xmlData  "+xmlData);			
			String messageIdSentToNSW = messageId;
			//AswmsgMessageLog messageLog = AswmsgMessageLogLocalServiceUtil.getByVersionAndMessageId(version, messageId);
			Header header1 = MessageReturnUtils.crateHeader(messageFunction, messageType, userName, messageIdSentToNSW, version, header);
			
			// _log.info("========header===sendTestToNSW===" + header1.getFrom().getName()+"  "+header1.getFrom().getMinistryCode());
			
			xmlData = XuLyMessage.createContentSendFromBgtvtToNSW(header1, xmlData, messageIdSentToNSW, BanTinSystemSignature.systemSignature());
		} catch (Exception e) {
			_log.error(e);
		}
		return xmlData;
	}
	
	public String builtMessage101va30(String userName, Header header, String messageId, String version, TechnicalSpecification technicalSpecification) {
		String xmlData = "";
		try {
			
			int messageType = 101;
			String messageFunction = "30";
			xmlData = MessageFactory.convertObjectToXml(technicalSpecification);
			//_log.info("xmlData  "+xmlData);			
			String messageIdSentToNSW = messageId;
			//AswmsgMessageLog messageLog = AswmsgMessageLogLocalServiceUtil.getByVersionAndMessageId(version, messageId);
			Header header1 = MessageReturnUtils.crateHeader(messageFunction, messageType, userName, messageIdSentToNSW, version, header);
			
			// _log.info("========header===sendTestToNSW===" + header1.getFrom().getName()+"  "+header1.getFrom().getMinistryCode());
			
			xmlData = XuLyMessage.createContentSendFromBgtvtToNSW(header1, xmlData, messageIdSentToNSW, BanTinSystemSignature.systemSignature());
		} catch (Exception e) {
			_log.error(e);
		}
		return xmlData;
	}
	
	public void message202va30(String userName, TthcHoSoThuTuc hoSoThuTuc, String messageId, String version, RequestOfEmissionTesting requestOfEmissionTesting) {
		try {
			
			int messageType = 202;
			String messageFunction = "30";
			String xmlData = MessageFactory.convertObjectToXml(requestOfEmissionTesting);
			//String xmlData = BanTin202.createXeDapDien();
			xmlData =
				messgaeFunctions.insertMesssageToQueue(
					userName, hoSoThuTuc, version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature(),
					MessgaePriorityLevels.HIGHT, null);
			
			////			MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh = MotCuaPhieuXuLyChinhLocalServiceUtil.fetchMotCuaPhieuXuLyChinh(hoSoThuTuc.getId());
			//			String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.cap.giay.dkkt", "cap.giay.dkkt");
			//			messgaeFunctions.insertKeHoachChuyenDich(null,  hoSoThuTuc.getId(), dieuKienChuyenDich, null, messageId);
			
			//			sendMesssageToNSW(userName,hoSoThuTuc,version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature());
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public void message203va30(String userName, TthcHoSoThuTuc hoSoThuTuc, String messageId, String version, RequestOfSafeTesting requestOfSafeTesting) {
		try {
			
			int messageType = 203;
			String messageFunction = "30";
			String xmlData = MessageFactory.convertObjectToXml(requestOfSafeTesting);
			xmlData =
				messgaeFunctions.insertMesssageToQueue(
					userName, hoSoThuTuc, version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature(),
					MessgaePriorityLevels.HIGHT, null);
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public void message204va30(String userName, TthcHoSoThuTuc hoSoThuTuc, String messageId, String version, RequestForControl requestForControl) {
		try {
			
			int messageType = 204;
			String messageFunction = "30";
			//String xmlData = BanTin204.createXeBonBanh();
			String xmlData = MessageFactory.convertObjectToXml(requestForControl);
			xmlData =
				messgaeFunctions.insertMesssageToQueue(
					userName, hoSoThuTuc, version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature(),
					MessgaePriorityLevels.HIGHT, null);
			//			sendMesssageToNSW(userName, hoSoThuTuc, version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature());
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public void message205va30(
		String userName, TthcHoSoThuTuc hoSoThuTuc, String messageId, String version, CurrentStatusOfImportedVehicleList currentStatusOfImportedVehicleList) {
		try {
			
			int messageType = 205;
			String messageFunction = "30";
			//String xmlData = BanTin205.createXeMay();
			String xmlData = MessageFactory.convertObjectToXml(currentStatusOfImportedVehicleList);
			//			sendMesssageToNSW(userName,hoSoThuTuc, version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature());
			xmlData =
				messgaeFunctions.insertMesssageToQueue(
					userName, hoSoThuTuc, version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature(),
					MessgaePriorityLevels.HIGHT, null);
			
			//			MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh = MotCuaPhieuXuLyChinhLocalServiceUtil.fetchMotCuaPhieuXuLyChinh(hoSoThuTuc.getId());
			//			String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.dong.dau.chung.chi", "dong.dau");
			//			messgaeFunctions.insertKeHoachChuyenDich(null, hoSoThuTuc.getId(),  dieuKienChuyenDich, null, messageId);
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public void message206va30(
		String userName, TthcHoSoThuTuc hoSoThuTuc, String messageId, String version, ConfirmationOfAssignment confirmationOfAssignment, Long phieuXuLyPhuId) {
		try {
			
			int messageType = 206;
			String messageFunction = "30";
			// String xmlData = BanTin206.createConfirmationOfAssignment();
			String xmlData = MessageFactory.convertObjectToXml(confirmationOfAssignment);
			
			//			sendMesssageToNSW(userName,hoSoThuTuc,version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature());
			xmlData =
				messgaeFunctions.insertMesssageToQueue(
					userName, hoSoThuTuc, version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature(),
					MessgaePriorityLevels.HIGHT, phieuXuLyPhuId);
			//MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh = MotCuaPhieuXuLyChinhLocalServiceUtil.fetchMotCuaPhieuXuLyChinh(hoSoThuTuc.getId());
			//			String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.phan.cong.don.vi.kt",
			//					"phan.cong.don.vi.kt");
			//			messgaeFunctions.insertKeHoachChuyenDich(phieuXuLyPhuId, hoSoThuTuc.getId(), dieuKienChuyenDich, null, messageId);
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public String message104va30(String userName, TthcHoSoThuTuc hoSoThuTuc,
			String messageId, String version,
			ConfirmOfRemovedSchedule confirmOfRemovedSchedule,
			long phieuXuLyPhuId) 
		throws IOException {
			
		int messageType = 104;
		String messageFunction = "30";
		String xmlData = MessageFactory.convertObjectToXml(confirmOfRemovedSchedule);
		
		xmlData =
			messgaeFunctions.insertMesssageToQueue(
				userName, hoSoThuTuc, version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature(),
				MessgaePriorityLevels.HIGHT, phieuXuLyPhuId);
		
		return xmlData;
	}
	
	
	public void message104va30MessageId(
			String userName, TthcHoSoThuTuc hoSoThuTuc, String messageId, String version, ConfirmOfRemovedSchedule confirmOfRemovedSchedule, String messsageId2) {
			try {
				
				int messageType = 104;
				String messageFunction = "30";
				// String xmlData = BanTin206.createConfirmationOfAssignment();
				String xmlData = MessageFactory.convertObjectToXml(confirmOfRemovedSchedule);
				
				//sendMesssageToNSW(userName,hoSoThuTuc,version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature());
				xmlData =
					messgaeFunctions.insertMesssageToQueueMessageId(
						userName, hoSoThuTuc, version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature(),
						MessgaePriorityLevels.CHUA_LAY_RA, messsageId2);
				
				//			MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh = MotCuaPhieuXuLyChinhLocalServiceUtil.fetchMotCuaPhieuXuLyChinh(hoSoThuTuc.getId());
				//			String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.phan.cong.don.vi.kt",
				//					"phan.cong.don.vi.kt");
				//			messgaeFunctions.insertKeHoachChuyenDich(null, motCuaPhieuXuLyChinh, hoSoThuTuc, dieuKienChuyenDich, null, messageId);
			} catch (Exception e) {
				_log.error(e);
			}
		}
	
	
	public void message106va30(String userName, TthcHoSoThuTuc hoSoThuTuc, String messageId, String version, ConfirmOfRemovedVehicle confirmOfRemovedVehicle) {
		try {
			
			int messageType = 106;
			String messageFunction = "30";
			// String xmlData = BanTin206.createConfirmationOfAssignment();
			String xmlData = MessageFactory.convertObjectToXml(confirmOfRemovedVehicle);
			
			//			sendMesssageToNSW(userName,hoSoThuTuc,version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature());
			xmlData =
				messgaeFunctions.insertMesssageToQueue(
					userName, hoSoThuTuc, version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature(),
					MessgaePriorityLevels.HIGHT, null);
			//			MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh = MotCuaPhieuXuLyChinhLocalServiceUtil.fetchMotCuaPhieuXuLyChinh(hoSoThuTuc.getId());
			//			String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.phan.cong.don.vi.kt",
			//					"phan.cong.don.vi.kt");
			//			messgaeFunctions.insertKeHoachChuyenDich(null, motCuaPhieuXuLyChinh, hoSoThuTuc, dieuKienChuyenDich, null, messageId);
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public String builtMessage209va30(String userName, TthcHoSoThuTuc hoSoThuTuc, String messageId, String version, DebitNote debitNote) {
		try {
			
			int messageType = 209;
			String messageFunction = "30";
			
			String xmlData = MessageFactory.convertObjectToXml(debitNote);
			//String xmlData = BanTin209.createCurrentStatusOfImportedVehicleList();
			String messageIdSentToNSW = messageId;
			Header header = MessageReturnUtils.crateHeader(messageFunction, messageType, userName, messageIdSentToNSW, version, hoSoThuTuc);
			
			_log.debug("========header===sendTestToNSW===" + header);
			
			return XuLyMessage.createContentSendFromBgtvtToNSW(header, xmlData, messageIdSentToNSW, BanTinSystemSignature.systemSignature());
			
			//sendTestToNSW(userName,hoSoThuTuc,version, messageId, messageFunction, messageType, xmlData,null);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public String builtMessage223va30(String userName, TthcHoSoThuTuc hoSoThuTuc, String messageId, String version, DebitNoteByCertificate debitNote) {
		try {
			
			int messageType = 223;
			String messageFunction = "30";
			
			String xmlData = MessageFactory.convertObjectToXml(debitNote);
			//String xmlData = BanTin209.createCurrentStatusOfImportedVehicleList();
			String messageIdSentToNSW = messageId;
			Header header = MessageReturnUtils.crateHeader(messageFunction, messageType, userName, messageIdSentToNSW, version, hoSoThuTuc);
			
			_log.debug("========header===sendTestToNSW===" + header);
			
			return XuLyMessage.createContentSendFromBgtvtToNSW(header, xmlData, messageIdSentToNSW, BanTinSystemSignature.systemSignature());
			
			//sendTestToNSW(userName,hoSoThuTuc,version, messageId, messageFunction, messageType, xmlData,null);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public String message210va30(
		String userName, TthcHoSoThuTuc hoSoThuTuc, String messageId, String version, PaymentConfirmation paymentConfirmation, Long phieuXuLyPhuId) {
		try {
			
			int messageType = 210;
			String messageFunction = "30";
			
			String xmlData = MessageFactory.convertObjectToXml(paymentConfirmation);
			//String xmlData = BanTin210.createCurrentStatusOfImportedVehicleList();
			//_log.info("message210va30   "+xmlData);
			//xmlData =sendMesssageToNSW(userName,hoSoThuTuc,version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature());
			xmlData =
				messgaeFunctions.insertMesssageToQueue(
					userName, hoSoThuTuc, version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature(),
					MessgaePriorityLevels.HIGHT, phieuXuLyPhuId);
			//			MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh = MotCuaPhieuXuLyChinhLocalServiceUtil.fetchMotCuaPhieuXuLyChinh(hoSoThuTuc.getId());
			//			String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.phan.cong.don.vi.kt",
			//					"phan.cong.don.vi.kt");
			//			messgaeFunctions.insertKeHoachChuyenDich(null, motCuaPhieuXuLyChinh, hoSoThuTuc, dieuKienChuyenDich, null, messageId);
			return xmlData;
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public String message211va30(
		String userName, TthcHoSoThuTuc hoSoThuTuc, String messageId, String version, CertificateOfQuanlityConformity certificateOfQuanlityConformity) {
		try {
			
			int messageType = 211;
			String messageFunction = "30";
			//String xmlData = BanTin211.createCurrentStatusOfImportedVehicleList();
			certificateOfQuanlityConformity.setVehicleColor(null);
			String xmlData = MessageFactory.convertObjectToXml(certificateOfQuanlityConformity);
			xmlData =
				messgaeFunctions.insertMesssageToQueue(
					userName, hoSoThuTuc, version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature(),
					MessgaePriorityLevels.CHUNG_CHI, null);
			//			MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh = MotCuaPhieuXuLyChinhLocalServiceUtil.fetchMotCuaPhieuXuLyChinh(hoSoThuTuc.getId());
			//			String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.phan.cong.don.vi.kt",
			//					"phan.cong.don.vi.kt");
			//			messgaeFunctions.insertKeHoachChuyenDich(null, motCuaPhieuXuLyChinh, hoSoThuTuc, dieuKienChuyenDich, null, messageId);
			return xmlData;
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public void message211va30WithHeader(TthcHoSoThuTuc hoSoThuTuc, String messageId, String version, CertificateOfQuanlityConformity certificateOfQuanlityConformity,String transactionID) {
		try {
			
			int messageType = 211;
			String messageFunction = "30";
//			header.getSubject().setFunction(messageFunction);
//			header.getSubject().setType(messageType);
//			Header header =null;
			_log.info("message211va30WithHeader  ");
			
			Header header = MessageReturnUtils.crateHeader(messageFunction, messageType, "System", messageId,
					version,hoSoThuTuc);
			 header.getSubject().setFunction(messageFunction);
				header.getSubject().setType(messageType);
			//String xmlData = BanTin211.createCurrentStatusOfImportedVehicleList();
			String xmlData = MessageFactory.convertObjectToXml(certificateOfQuanlityConformity);
			xmlData = XuLyMessage.createContentSendFromBgtvtToNSW(header, xmlData, messageId, BanTinSystemSignature.systemSignature());
			SendMessgaeFunctions.insertMessageQueueMessageId(
					header, xmlData, MessageKey.HTTH_BGT_TO_NSW, TrangThaiHoSo.DA_BO_SUNG_CHO_TIEP_NHAP, 
					header.getReference().getMessageId(), MessgaePriorityLevels.CHUA_LAY_RA, null,
					 transactionID);
//			sendMessageToNSW(header, version, messageId, xmlData, BanTinSystemSignature.systemSignature());
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public void message212va30(
		String userName, TthcHoSoThuTuc hoSoThuTuc, String messageId, String version, NoticeOfExemptionFromInspection noticeOfExemptionFromInspection) {
		try {
			
			int messageType = 212;
			String messageFunction = "30";
			//			String xmlData = BanTin212.createCurrentStatusOfImportedVehicleList();
			
			String xmlData = MessageFactory.convertObjectToXml(noticeOfExemptionFromInspection);
			messgaeFunctions.insertMesssageToQueue(
				userName, hoSoThuTuc, version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature(), MessgaePriorityLevels.CHUNG_CHI,
				null);
			//			MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh = MotCuaPhieuXuLyChinhLocalServiceUtil.fetchMotCuaPhieuXuLyChinh(hoSoThuTuc.getId());
			//			String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.phan.cong.don.vi.kt",
			//					"phan.cong.don.vi.kt");
			//			messgaeFunctions.insertKeHoachChuyenDich(null, motCuaPhieuXuLyChinh, hoSoThuTuc, dieuKienChuyenDich, null, messageId);
			
			//		sendMesssageToNSW(userName,hoSoThuTuc,version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature());
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public void message212va30WithHeader(TthcHoSoThuTuc hoSoThuTuc, String messageId, String version, NoticeOfExemptionFromInspection noticeOfExemptionFromInspection,String transactionID) {
		try {
			
			int messageType = 212;
			String messageFunction = "30";

			Header header = MessageReturnUtils.crateHeader(messageFunction, messageType, "System", messageId,
					version,hoSoThuTuc);
			 header.getSubject().setFunction(messageFunction);
				header.getSubject().setType(messageType);
			//			String xmlData = BanTin212.createCurrentStatusOfImportedVehicleList();
			String xmlData = MessageFactory.convertObjectToXml(noticeOfExemptionFromInspection);
			xmlData = XuLyMessage.createContentSendFromBgtvtToNSW(header, xmlData, messageId, BanTinSystemSignature.systemSignature());
			SendMessgaeFunctions.insertMessageQueueMessageId(
					header, xmlData, MessageKey.HTTH_BGT_TO_NSW, TrangThaiHoSo.DA_BO_SUNG_CHO_TIEP_NHAP, 
					header.getReference().getMessageId(), MessgaePriorityLevels.CHUA_LAY_RA, null,
					 transactionID);
//			sendMessageToNSW(header, version, messageId, xmlData, BanTinSystemSignature.systemSignature());
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public void message213va30(String userName, TthcHoSoThuTuc hoSoThuTuc, String messageId, String version, NoticeOfNonConformity noticeOfNonConformity) {
		try {
			
			int messageType = 213;
			String messageFunction = "30";
			
			String xmlData = MessageFactory.convertObjectToXml(noticeOfNonConformity);
			//			String xmlData = BanTin213.createCurrentStatusOfImportedVehicleList();
			messgaeFunctions.insertMesssageToQueue(
				userName, hoSoThuTuc, version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature(), MessgaePriorityLevels.HIGHT,
				null);
			//			MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh = MotCuaPhieuXuLyChinhLocalServiceUtil.fetchMotCuaPhieuXuLyChinh(hoSoThuTuc.getId());
			//			String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.phan.cong.don.vi.kt",
			//					"phan.cong.don.vi.kt");
			//			messgaeFunctions.insertKeHoachChuyenDich(null, motCuaPhieuXuLyChinh, hoSoThuTuc, dieuKienChuyenDich, null, messageId);
			
			//			sendMesssageToNSW(userName,hoSoThuTuc,version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature());
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public void message213va30WithHeader(TthcHoSoThuTuc hoSoThuTuc, String messageId, String version, NoticeOfNonConformity noticeOfNonConformity,String transactionID) {
		try {
			
			int messageType = 213;
			String messageFunction = "30";

			Header header = MessageReturnUtils.crateHeader(messageFunction, messageType, "System", messageId,
					version,hoSoThuTuc);
			 header.getSubject().setFunction(messageFunction);
				header.getSubject().setType(messageType);
			String xmlData = MessageFactory.convertObjectToXml(noticeOfNonConformity);
			//			String xmlData = BanTin213.createCurrentStatusOfImportedVehicleList();
			
			xmlData = XuLyMessage.createContentSendFromBgtvtToNSW(header, xmlData, messageId, BanTinSystemSignature.systemSignature());
			SendMessgaeFunctions.insertMessageQueueMessageId(
					header, xmlData, MessageKey.HTTH_BGT_TO_NSW, TrangThaiHoSo.DA_BO_SUNG_CHO_TIEP_NHAP, 
					header.getReference().getMessageId(), MessgaePriorityLevels.CHUA_LAY_RA, null,
					 transactionID);
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public void message214va30(String userName, TthcHoSoThuTuc hoSoThuTuc, String messageId, String version, NoticeOfViolation noticeOfViolation) {
		try {
			
			int messageType = 214;
			String messageFunction = "30";
			
			String xmlData = MessageFactory.convertObjectToXml(noticeOfViolation);
			//			String xmlData = BanTin214.createCurrentStatusOfImportedVehicleList();
			messgaeFunctions.insertMesssageToQueue(
				userName, hoSoThuTuc, version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature(), MessgaePriorityLevels.HIGHT,
				null);
			//			MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh = MotCuaPhieuXuLyChinhLocalServiceUtil.fetchMotCuaPhieuXuLyChinh(hoSoThuTuc.getId());
			//			String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.phan.cong.don.vi.kt",
			//					"phan.cong.don.vi.kt");
			//			messgaeFunctions.insertKeHoachChuyenDich(null, motCuaPhieuXuLyChinh, hoSoThuTuc, dieuKienChuyenDich, null, messageId);
			
			//			sendMesssageToNSW(userName,hoSoThuTuc,version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature());
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public void message214va30WithHeader(TthcHoSoThuTuc hoSoThuTuc, String messageId, String version, NoticeOfViolation noticeOfViolation,String transactionID) {
		try {
			
			int messageType = 214;
			String messageFunction = "30";
			Header header = MessageReturnUtils.crateHeader(messageFunction, messageType, "System", messageId,
					version,hoSoThuTuc);
			 header.getSubject().setFunction(messageFunction);
				header.getSubject().setType(messageType);
			String xmlData = MessageFactory.convertObjectToXml(noticeOfViolation);
			//			String xmlData = BanTin214.createCurrentStatusOfImportedVehicleList();
			
			xmlData = XuLyMessage.createContentSendFromBgtvtToNSW(header, xmlData, messageId, BanTinSystemSignature.systemSignature());
			SendMessgaeFunctions.insertMessageQueueMessageId(
					header, xmlData, MessageKey.HTTH_BGT_TO_NSW, TrangThaiHoSo.DA_BO_SUNG_CHO_TIEP_NHAP, 
					header.getReference().getMessageId(), MessgaePriorityLevels.CHUA_LAY_RA, null,
					 transactionID);
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public void message216va30(
		String userName, TthcHoSoThuTuc hoSoThuTuc, String messageId, String version, ConfirmationStatusOfQuanlityConformity confirmationStatusOfQuanlityConformity) {
		try {
			
			int messageType = 216;
			String messageFunction = "30";
			
			String xmlData = MessageFactory.convertObjectToXml(confirmationStatusOfQuanlityConformity);
			//			String xmlData = BanTin216.createCurrentStatusOfImportedVehicleList();
			messgaeFunctions.insertMesssageToQueue(
				userName, hoSoThuTuc, version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature(), MessgaePriorityLevels.HIGHT,
				null);
			//			MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh = MotCuaPhieuXuLyChinhLocalServiceUtil.fetchMotCuaPhieuXuLyChinh(hoSoThuTuc.getId());
			//			String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.phan.cong.don.vi.kt",
			//					"phan.cong.don.vi.kt");
			//			messgaeFunctions.insertKeHoachChuyenDich(null, motCuaPhieuXuLyChinh, hoSoThuTuc, dieuKienChuyenDich, null, messageId);
			
			//sendMesssageToNSW(userName,hoSoThuTuc,version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature());
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public void message216va30WithHeader(TthcHoSoThuTuc hoSoThuTuc, String messageId, String version, ConfirmationStatusOfQuanlityConformity confirmationStatusOfQuanlityConformity,String transactionID) {
		try {
			
			int messageType = 216;
			String messageFunction = "30";
			Header header = MessageReturnUtils.crateHeader(messageFunction, messageType, "System", messageId,
					version,hoSoThuTuc);
			 header.getSubject().setFunction(messageFunction);
				header.getSubject().setType(messageType);
			String xmlData = MessageFactory.convertObjectToXml(confirmationStatusOfQuanlityConformity);
			//			String xmlData = BanTin216.createCurrentStatusOfImportedVehicleList();
			
			xmlData = XuLyMessage.createContentSendFromBgtvtToNSW(header, xmlData, messageId, BanTinSystemSignature.systemSignature());
			SendMessgaeFunctions.insertMessageQueueMessageId(
					header, xmlData, MessageKey.HTTH_BGT_TO_NSW, TrangThaiHoSo.DA_BO_SUNG_CHO_TIEP_NHAP, 
					header.getReference().getMessageId(), MessgaePriorityLevels.CHUA_LAY_RA, null,
					 transactionID);
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public void message217va30(String userName, TthcHoSoThuTuc hoSoThuTuc, String messageId, String version, ConfirmCertificateEndorsement confirmCertificateEndorsement) {
		try {
			
			int messageType = 217;
			String messageFunction = "30";
			
			String xmlData = MessageFactory.convertObjectToXml(confirmCertificateEndorsement);
			//String xmlData = BanTin217.createCurrentStatusOfImportedVehicleList();
			messgaeFunctions.insertMesssageToQueue(
				userName, hoSoThuTuc, version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature(), MessgaePriorityLevels.HIGHT,
				null);
			//			sendMesssageToNSW(userName,hoSoThuTuc,version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature());
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public void message218va30(String userName, TthcHoSoThuTuc hoSoThuTuc, String messageId, String version, ConfirmCertificateCancellation confirmCertificateCancellation) {
		try {
			
			int messageType = 218;
			String messageFunction = "30";
			
			String xmlData = MessageFactory.convertObjectToXml(confirmCertificateCancellation);
			//String xmlData = BanTin218.createCurrentStatusOfImportedVehicleList();
			messgaeFunctions.insertMesssageToQueue(
				userName, hoSoThuTuc, version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature(), MessgaePriorityLevels.HIGHT,
				null);
			//			sendMesssageToNSW(userName,hoSoThuTuc,version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature());
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public void message219va26(String userName, TthcHoSoThuTuc hoSoThuTuc) {
		try {
			String requestCodeHeader = PortletProps.get(MessageKey.REQUEST_CODE_DEFAULT);
			String version = PortletProps.get(MessageKey.VERSION_HEADER_DEFAULT);
			_log.debug("message218va30==requestCodeHeader==" + requestCodeHeader + "==VERSION==" + version);
			
			String messageId = requestCodeHeader;
			int messageType = 219;
			String messageFunction = "26";
			
			String xmlData = BanTin219.createRequestOfEmissionTesting(new Date(), "cvsdfs3242", "1");
			messgaeFunctions.insertMesssageToQueue(
				userName, hoSoThuTuc, version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature(), MessgaePriorityLevels.HIGHT,
				null);
			//			sendMesssageToNSW(userName,hoSoThuTuc,version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature());
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public String builtMessage219va30(String userName, Header header, String requestDate, String certificateNumber, String requestStatus) {
		String xmlData = "";
		try {
			//String version = PortletProps.get(MessageKey.VERSION_HEADER_DEFAULT);
			String version = "01";
			
			int messageType = 219;
			String messageFunction = "30";
			
			xmlData = BanTin219.createInquiryOfCertificateContent(requestDate, certificateNumber, requestStatus);
			String messageIdSentToNSW = UUID.randomUUID().toString();
			//AswmsgMessageLog messageLog = AswmsgMessageLogLocalServiceUtil.getByVersionAndMessageId(version, messageId);
			Header header1 = MessageReturnUtils.crateHeader(messageFunction, messageType, userName, messageIdSentToNSW, version, header);
			
			// _log.info("========header===sendTestToNSW===" + header1.getFrom().getName()+"  "+header1.getFrom().getMinistryCode());
			
			xmlData = XuLyMessage.createContentSendFromBgtvtToNSW(header1, xmlData, messageIdSentToNSW, BanTinSystemSignature.systemSignature());
			//sendMesssageToNSW(userName,header,version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature());
		} catch (Exception e) {
			_log.error(e);
		}
		return xmlData;
	}
	
	public String builtXML(
		String userName, TthcHoSoThuTuc hoSoThuTuc, String version, String messageId, String messageFunction, int messageType, String xmlData, String xmlSignature) {
		try {
			
			String messageIdSentToNSW = messageId;
			//AswmsgMessageLog messageLog = AswmsgMessageLogLocalServiceUtil.getByVersionAndMessageId(version, messageId);
			Header header = MessageReturnUtils.crateHeader(messageFunction, messageType, userName, messageIdSentToNSW, version, hoSoThuTuc);
			
			xmlData = XuLyMessage.createContentSendFromBgtvtToNSW(header, xmlData, messageIdSentToNSW, xmlSignature);
			_log.debug("=====Du lieu gui di HQMC===");
			_log.debug(xmlData);
			
		} catch (Exception e) {
			_log.error(e);
		}
		return xmlData;
	}
	
	public String builtXML(String userName, TthcHoSoThuTuc hoSoThuTuc, String messageFunction, int messageType, String xmlData) {
		try {
			
			String messageIdSentToNSW = functionNghiepVu.getRamdomMessage();
			//AswmsgMessageLog messageLog = AswmsgMessageLogLocalServiceUtil.getByVersionAndMessageId(version, messageId);
			Header header = MessageReturnUtils.crateHeader(messageFunction, messageType, userName, messageIdSentToNSW, Constants.VERSION_START, hoSoThuTuc);
			
			xmlData = XuLyMessage.createContentSendFromBgtvtToNSW(header, xmlData, messageIdSentToNSW, BanTinSystemSignature.systemSignature());
			_log.debug("=====Du lieu gui di HQMC===");
			_log.debug(xmlData);
			
		} catch (Exception e) {
			_log.error(e);
		}
		return xmlData;
	}
	
	public String builtXMLNotSend(
		String userName, TthcHoSoThuTuc hoSoThuTuc, String version, String messageId, String messageFunction, int messageType, String xmlData, String xmlSignature) {
		try {
			
			String messageIdSentToNSW = messageId;
			//AswmsgMessageLog messageLog = AswmsgMessageLogLocalServiceUtil.getByVersionAndMessageId(version, messageId);
			Header header = MessageReturnUtils.crateHeader(messageFunction, messageType, userName, messageIdSentToNSW, version, hoSoThuTuc);
			
			xmlData = XuLyMessage.createContentSendFromBgtvtToNSW(header, xmlData, messageIdSentToNSW, xmlSignature);
			//			AswmsgMessageLogDao.insertMessageLog(header, xmlData, MessageKey.HTTH_BGT_TO_NSW,
			//					TrangThaiHoSo.DA_BO_SUNG_CHO_TIEP_NHAP, messageIdSentToNSW);
			_log.debug("=====Du lieu gui di HQMC===");
			_log.debug(xmlData);
			
		} catch (Exception e) {
			_log.error(e);
		}
		return xmlData;
	}
	
	public void sendMessageComplete(Header header,Long phieuXuLyPhuId) {
		try {
			
			header.getSubject().setFunction(String.valueOf(MessageType.XAC_NHAN_SU_LY));
			
			String toName = header.getTo().getName();
			String fromName = header.getFrom().getName();
			
			header.getTo().setName(fromName);
			header.getFrom().setName(toName);
			//			IMTService imtService = CallWs2HaiQuan.getIMTSercice();
			
			String messageIdSentToNSW = header.getReference().getMessageId();
			
			String xmlData = MessageUtils.createReturnContentAfterCompleteBusiness(header);
			long hoSoTtid=0;
			TthcHoSoThuTuc hoSoThuTuc = null;
			try{
				hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.getByMaSoHoSo(header.getSubject().getReference() + "");
				hoSoTtid=hoSoThuTuc.getId();
			}catch (Exception e) {
				//_log.error(e);
			}
			SendMessgaeFunctions.insertMessageQueue(
				header, xmlData, MessageKey.HTTH_BGT_TO_NSW, TrangThaiHoSo.DA_BO_SUNG_CHO_TIEP_NHAP, messageIdSentToNSW, MessgaePriorityLevels.HIGHT, hoSoTtid,
				phieuXuLyPhuId);
			
			List<TthcKeHoachChuyenDich> tthcKeHoachChuyenDichs = TthcKeHoachChuyenDichLocalServiceUtil.findByMessageId(header.getReference().getMessageId());
			if (tthcKeHoachChuyenDichs != null&&tthcKeHoachChuyenDichs.size()>0) {
				int size =tthcKeHoachChuyenDichs.size();
				for(int i=0;i<size;i++){
					TthcKeHoachChuyenDich tthcKeHoachChuyenDich = tthcKeHoachChuyenDichs.get(i);
					TthcKeHoachChuyenDichLocalServiceUtil.deleteTthcKeHoachChuyenDich(tthcKeHoachChuyenDich.getId());
				}
			}
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	
	public void sendMessageCompleteMessageId(Header header,String messageId) {
		try {
			
			header.getSubject().setFunction(String.valueOf(MessageType.XAC_NHAN_SU_LY));
			
			String toName = header.getTo().getName();
			String fromName = header.getFrom().getName();
			
			header.getTo().setName(fromName);
			header.getFrom().setName(toName);
			//			IMTService imtService = CallWs2HaiQuan.getIMTSercice();
			
			String messageIdSentToNSW = header.getReference().getMessageId();
			
//			_log.debug("========header===sendTestToNSW===" + header);
			
			String xmlData = MessageUtils.createReturnContentAfterCompleteBusiness(header);
			long hoSoTtid=0;
			TthcHoSoThuTuc hoSoThuTuc = null;
			try{
				hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.getByMaSoHoSo(header.getSubject().getReference() + "");
				hoSoTtid=hoSoThuTuc.getId();
			}catch (Exception e) {
				//_log.error(e);
			}
			SendMessgaeFunctions.insertMessageQueueMessageId(
				header, xmlData, MessageKey.HTTH_BGT_TO_NSW, TrangThaiHoSo.DA_BO_SUNG_CHO_TIEP_NHAP, messageIdSentToNSW, MessgaePriorityLevels.HIGHT, hoSoTtid,
				messageId);
			
			List<TthcKeHoachChuyenDich> tthcKeHoachChuyenDichs = TthcKeHoachChuyenDichLocalServiceUtil.findByMessageId(header.getReference().getMessageId());
			if (tthcKeHoachChuyenDichs != null&&tthcKeHoachChuyenDichs.size()>0) {
				int size =tthcKeHoachChuyenDichs.size();
				for(int i=0;i<size;i++){
					TthcKeHoachChuyenDich tthcKeHoachChuyenDich = tthcKeHoachChuyenDichs.get(i);
					TthcKeHoachChuyenDichLocalServiceUtil.deleteTthcKeHoachChuyenDich(tthcKeHoachChuyenDich.getId());
				}
			}
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public String message99va24(String userName, TthcHoSoThuTuc hoSoThuTuc, String messageId, ConfirmCancellation confirmCancellation) {
		try {
			
			//String messageId =functionNghiepVu.getRamdomMessage();
			String version = Constants.VERSION_START;
			
			int messageType = 99;
			String messageFunction = "24";
			//String xmlData = BanTin211.createCurrentStatusOfImportedVehicleList();
			String xmlData = MessageFactory.convertObjectToXml(confirmCancellation);
			//xmlData =sendMesssageToNSW(userName,hoSoThuTuc,version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature());
			xmlData =
				messgaeFunctions.insertMesssageToQueue(
					userName, hoSoThuTuc, version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature(),
					MessgaePriorityLevels.HIGHT, null);
			//			MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh = MotCuaPhieuXuLyChinhLocalServiceUtil.fetchMotCuaPhieuXuLyChinh(hoSoThuTuc.getId());
			//			String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.phan.cong.don.vi.kt",
			//					"phan.cong.don.vi.kt");
			//			messgaeFunctions.insertKeHoachChuyenDich(null, motCuaPhieuXuLyChinh, hoSoThuTuc, dieuKienChuyenDich, null, messageId);
			
			return xmlData;
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public String message99va24MessageId(String userName, TthcHoSoThuTuc hoSoThuTuc, String messageId, ConfirmCancellation confirmCancellation, String messageId2) {
		try {
			
			//String messageId =functionNghiepVu.getRamdomMessage();
			String version = Constants.VERSION_START;
			
			int messageType = 99;
			String messageFunction = "24";
			//String xmlData = BanTin211.createCurrentStatusOfImportedVehicleList();
			String xmlData = MessageFactory.convertObjectToXml(confirmCancellation);
			//xmlData =sendMesssageToNSW(userName,hoSoThuTuc,version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature());
			xmlData =
				messgaeFunctions.insertMesssageToQueueMessageId(
					userName, hoSoThuTuc, version, messageId, messageFunction, messageType, xmlData, BanTinSystemSignature.systemSignature(),
					MessgaePriorityLevels.CHUA_LAY_RA, messageId2);
			//			MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh = MotCuaPhieuXuLyChinhLocalServiceUtil.fetchMotCuaPhieuXuLyChinh(hoSoThuTuc.getId());
			//			String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.phan.cong.don.vi.kt",
			//					"phan.cong.don.vi.kt");
			//			messgaeFunctions.insertKeHoachChuyenDich(null, motCuaPhieuXuLyChinh, hoSoThuTuc, dieuKienChuyenDich, null, messageId);
			
			return xmlData;
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
}
