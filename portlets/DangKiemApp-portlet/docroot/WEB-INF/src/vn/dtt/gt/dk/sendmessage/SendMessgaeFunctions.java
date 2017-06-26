package vn.dtt.gt.dk.sendmessage;

import java.util.Date;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageQueueImpl;
import vn.dtt.gt.dk.dao.aswmsg.service.AswmsgMessageQueueLocalServiceUtil;
import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgSyndatahistoryImpl;
import vn.dtt.gt.dk.dao.aswmsg.service.AswmsgSyndatahistoryLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich;
import vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichImpl;

import vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcKeHoachChuyenDichLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyChinhLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyPhuLocalServiceUtil;
import vn.dtt.gt.dk.message.MessageKey;
import vn.dtt.gt.dk.message.MessageReturnUtils;
import vn.dtt.gt.dk.nsw.Header;
import vn.dtt.gt.dk.portlet.business.XuLyMessage;
import vn.dtt.gt.dk.utils.TrangThaiHoSo;
import vn.dtt.gt.dk.utils.config.DKConfigurationManager;
import vn.dtt.gt.dk.utils.format.Constants;
import vn.dtt.gt.dk.utils.format.FormatData;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class SendMessgaeFunctions {
	
	private static Log _log = LogFactoryUtil.getLog(SendMessgaeFunctions.class);
	
	public String insertMesssageToQueue(String userName, TthcHoSoThuTuc hoSoThuTuc,String version, String messageId, String messageFunction, int messageType, String xmlData, String xmlSignature,int level,Long phieuSuLyPhuId) {
		Header header =null;
		try {
			
			String messageIdSentToNSW = messageId;
			 header = MessageReturnUtils.crateHeader(messageFunction, messageType, userName, messageIdSentToNSW,
					version,hoSoThuTuc);

			// _log.info("========header===sendTestToNSW===" + header);
			
			xmlData = XuLyMessage.createContentSendFromBgtvtToNSW(header, xmlData, messageIdSentToNSW, xmlSignature);
			SendMessgaeFunctions.insertMessageQueue(header, xmlData, MessageKey.HTTH_BGT_TO_NSW,
					TrangThaiHoSo.DA_BO_SUNG_CHO_TIEP_NHAP, messageIdSentToNSW,level,hoSoThuTuc.getId(),phieuSuLyPhuId);
		//	_log.info("=====Du lieu gui di HQMC==="+xmlData);
			_log.debug(xmlData,null);
		} catch (Exception e) {
			_log.error(e);
		}
		return xmlData;
	}

	
	public String insertMesssageToQueueMessageId(String userName, TthcHoSoThuTuc hoSoThuTuc,String version, String messageId, String messageFunction, int messageType, String xmlData, String xmlSignature,int level,String messageId2) {
		Header header =null;
		try {
			
			String messageIdSentToNSW = messageId;
			 header = MessageReturnUtils.crateHeader(messageFunction, messageType, userName, messageIdSentToNSW,
					version,hoSoThuTuc);

			// _log.info("========header===sendTestToNSW===" + header);
			
			xmlData = XuLyMessage.createContentSendFromBgtvtToNSW(header, xmlData, messageIdSentToNSW, xmlSignature);
			SendMessgaeFunctions.insertMessageQueueMessageId(header, xmlData, MessageKey.HTTH_BGT_TO_NSW,
					TrangThaiHoSo.DA_BO_SUNG_CHO_TIEP_NHAP, messageIdSentToNSW,level,hoSoThuTuc.getId(),messageId2);
		//	_log.info("=====Du lieu gui di HQMC==="+xmlData);
			_log.debug(xmlData,null);
		} catch (Exception e) {
			_log.error(e);
		}
		return xmlData;
	}
	public static long insertMessageQueue(Header header, String data, String direction, int requestState, String uuid,int level,Long hoSoThuTucId,Long phieuXuLyPhuId) {
		try {
			
			AswmsgMessageQueue aswmsgMessageQueue = new AswmsgMessageQueueImpl();
			
			if (uuid == null) {
				aswmsgMessageQueue.setMessageId(header.getReference().getMessageId());
			} else {
				aswmsgMessageQueue.setMessageId(uuid);
			}
			long id = CounterLocalServiceUtil.increment(Constants.ASWMSG_MESSAGELOG_AUTO_GENERATE_ID);
			
			aswmsgMessageQueue.setId(id);
			aswmsgMessageQueue.setVersion(header.getReference().getVersion());
			aswmsgMessageQueue.setSenderName(header.getFrom().getName());
			aswmsgMessageQueue.setSenderIdentity(header.getFrom().getIdentity());
			aswmsgMessageQueue.setSenderCountryCode(header.getFrom().getCountryCode());
			aswmsgMessageQueue.setSenderMinistryCode(header.getFrom().getMinistryCode());
			aswmsgMessageQueue.setSenderOrganizationCode(header.getFrom().getOrganizationCode());
			aswmsgMessageQueue.setSenderUnitCode(header.getFrom().getUnitCode());
			aswmsgMessageQueue.setPriority(level);
			aswmsgMessageQueue.setReceiverName(header.getTo().getName());
			aswmsgMessageQueue.setReceiverIdentity(header.getTo().getIdentity());
			aswmsgMessageQueue.setReceiverCountryCode(header.getTo().getCountryCode());
			aswmsgMessageQueue.setReceiverMinistryCode(header.getTo().getMinistryCode());
			aswmsgMessageQueue.setReceiverOrganizationCode(header.getTo().getOrganizationCode());
			aswmsgMessageQueue.setReceiverUnitCode(header.getTo().getUnitCode());
			if(hoSoThuTucId!=null&&hoSoThuTucId>0){
				aswmsgMessageQueue.setHoSoThuTucId(hoSoThuTucId);
			}
			if(phieuXuLyPhuId!=null&&phieuXuLyPhuId>0){
			aswmsgMessageQueue.setPhieuXuLyPhuId(phieuXuLyPhuId);
			}
			aswmsgMessageQueue.setDocumentType(header.getSubject().getDocumentType());
			aswmsgMessageQueue.setType(header.getSubject().getType());
			aswmsgMessageQueue.setFunction(header.getSubject().getFunction());
			aswmsgMessageQueue.setReference(header.getSubject().getReference());
			aswmsgMessageQueue.setPreReference(header.getSubject().getPreReference());
			aswmsgMessageQueue.setDocumentYear(header.getSubject().getDocumentYear());
			aswmsgMessageQueue.setSendDate(FormatData.parseStringToDate(header.getSubject().getSendDate()));
			aswmsgMessageQueue.setSignature("hashcode");
			aswmsgMessageQueue.setSystemSignature("hashcode");
			aswmsgMessageQueue.setAllContent(data);
			aswmsgMessageQueue.setCreatedTime(new Date());
			aswmsgMessageQueue.setWebservice(-1);
			aswmsgMessageQueue.setValidated(-1);
			aswmsgMessageQueue.setValidationCode(direction);
			
			aswmsgMessageQueue = AswmsgMessageQueueLocalServiceUtil.addAswmsgMessageQueue(aswmsgMessageQueue);
			return id;
		} catch (Exception e) {
			
			_log.error(e);
			
		}
		return 0;
	}
	

	public static long insertMessageQueueMessageId(Header header, String data, String direction, int requestState, String uuid,int level,Long hoSoThuTucId,String messsageId) {
		try {
			
			AswmsgMessageQueue aswmsgMessageQueue = new AswmsgMessageQueueImpl();
			
			if (uuid == null) {
				aswmsgMessageQueue.setMessageId(header.getReference().getMessageId());
			} else {
				aswmsgMessageQueue.setMessageId(uuid);
			}
			long id = CounterLocalServiceUtil.increment(Constants.ASWMSG_MESSAGELOG_AUTO_GENERATE_ID);
			
			aswmsgMessageQueue.setId(id);
			aswmsgMessageQueue.setVersion(header.getReference().getVersion());
			aswmsgMessageQueue.setSenderName(header.getFrom().getName());
			aswmsgMessageQueue.setSenderIdentity(header.getFrom().getIdentity());
			aswmsgMessageQueue.setSenderCountryCode(header.getFrom().getCountryCode());
			aswmsgMessageQueue.setSenderMinistryCode(header.getFrom().getMinistryCode());
			aswmsgMessageQueue.setSenderOrganizationCode(header.getFrom().getOrganizationCode());
			aswmsgMessageQueue.setSenderUnitCode(header.getFrom().getUnitCode());
			aswmsgMessageQueue.setPriority(level);
			aswmsgMessageQueue.setReceiverName(header.getTo().getName());
			aswmsgMessageQueue.setReceiverIdentity(header.getTo().getIdentity());
			aswmsgMessageQueue.setReceiverCountryCode(header.getTo().getCountryCode());
			aswmsgMessageQueue.setReceiverMinistryCode(header.getTo().getMinistryCode());
			aswmsgMessageQueue.setReceiverOrganizationCode(header.getTo().getOrganizationCode());
			aswmsgMessageQueue.setReceiverUnitCode(header.getTo().getUnitCode());
			if(hoSoThuTucId!=null&&hoSoThuTucId>0){
				aswmsgMessageQueue.setHoSoThuTucId(hoSoThuTucId);
			}
			aswmsgMessageQueue.setDocumentType(messsageId);
			aswmsgMessageQueue.setType(header.getSubject().getType());
			aswmsgMessageQueue.setFunction(header.getSubject().getFunction());
			aswmsgMessageQueue.setReference(header.getSubject().getReference());
			aswmsgMessageQueue.setPreReference(header.getSubject().getPreReference());
			aswmsgMessageQueue.setDocumentYear(header.getSubject().getDocumentYear());
			aswmsgMessageQueue.setSendDate(FormatData.parseStringToDate(header.getSubject().getSendDate()));
			aswmsgMessageQueue.setSignature("hashcode");
			aswmsgMessageQueue.setSystemSignature("hashcode");
			aswmsgMessageQueue.setAllContent(data);
			aswmsgMessageQueue.setCreatedTime(new Date());
			aswmsgMessageQueue.setWebservice(-1);
			aswmsgMessageQueue.setValidated(-1);
			aswmsgMessageQueue.setValidationCode(direction);
			
			aswmsgMessageQueue = AswmsgMessageQueueLocalServiceUtil.addAswmsgMessageQueue(aswmsgMessageQueue);
			return id;
		} catch (Exception e) {
			
			_log.error(e);
			
		}
		return 0;
	}

	
	public  long insertKeHoachChuyenDich(Long phieuXuLyPhuId, Long hoSoThuTucId, String dieuKienChuyenDich, String ghiChu, String uuid,
			String debitnoteNumber, String messageFunction,String messageType) {
		try {
			TthcKeHoachChuyenDich keHoachChuyenDich = new TthcKeHoachChuyenDichImpl();
			long id =CounterLocalServiceUtil.increment(TthcKeHoachChuyenDich.class.getName());
			keHoachChuyenDich.setId(id);
			keHoachChuyenDich.setDieuKienChuyenDich(dieuKienChuyenDich);
			keHoachChuyenDich.setMessageId(uuid);
			keHoachChuyenDich.setMessageStatus("00");
			keHoachChuyenDich.setMessageType(messageType);
			keHoachChuyenDich.setMessageFunction(messageFunction);
			if(debitnoteNumber!=null&&debitnoteNumber.length()>0){
				keHoachChuyenDich.setDebitnoteNumber(debitnoteNumber);
			}
			if(ghiChu !=null&&ghiChu.length()>0){
				keHoachChuyenDich.setGhiChu(ghiChu);
			}
			if(phieuXuLyPhuId!=null&&phieuXuLyPhuId >0){
				MotCuaPhieuXuLyPhu phieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.fetchMotCuaPhieuXuLyPhu(phieuXuLyPhuId);
				keHoachChuyenDich.setPhieuXuLyPhuId(phieuXuLyPhu.getId());			
				keHoachChuyenDich.setNhomPhieuXuLy(phieuXuLyPhu.getNhomPhieuXuLy());
				keHoachChuyenDich.setTrangThaiNguonId(phieuXuLyPhu.getTrangThaiHienTaiId());
				keHoachChuyenDich.setPhanNhomHoSoId(phieuXuLyPhu.getPhanNhomHoSoId());
				keHoachChuyenDich.setPhieuXuLyChinhId(phieuXuLyPhu.getPhieuXuLyChinhId());
				ghiChu =phieuXuLyPhu.getGhiChu()+" <br>" +DKConfigurationManager.getStrProp("dangxuly", "Dang cho xu ly....") ;
				phieuXuLyPhu.setGhiChu(ghiChu);
				MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(phieuXuLyPhu);
			}else if(hoSoThuTucId !=null&&hoSoThuTucId>0){
				TthcHoSoThuTuc hoSoThuTuc= TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
				MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh = MotCuaPhieuXuLyChinhLocalServiceUtil.fetchMotCuaPhieuXuLyChinh(hoSoThuTucId);
				keHoachChuyenDich.setTrangThaiNguonId(motCuaPhieuXuLyChinh.getTrangThaiHienTaiId());
				keHoachChuyenDich.setPhieuXuLyChinhId(hoSoThuTucId);
				keHoachChuyenDich.setPhanNhomHoSoId(hoSoThuTuc.getPhanNhomHoSoId());
				 ghiChu =hoSoThuTuc.getGhiChu()+" <br>" +DKConfigurationManager.getStrProp("dangxuly", "Dang cho xu ly....") ;
				 hoSoThuTuc.setGhiChu(ghiChu);
					// chua update ngay 28/10/2015
				TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(hoSoThuTuc);
			}
			keHoachChuyenDich.setThoiDiemCapNhat( new Date());
			TthcKeHoachChuyenDichLocalServiceUtil.addTthcKeHoachChuyenDich(keHoachChuyenDich);
			return id;
		} catch (Exception e) {
			
			_log.error(e);
			
		}
		return 0;
	}
	
	
	
	public  long insertKeHoachChuyenDichTuViettel( Header header ){
		try {
			TthcKeHoachChuyenDich keHoachChuyenDich = new TthcKeHoachChuyenDichImpl();
			long id =CounterLocalServiceUtil.increment(TthcKeHoachChuyenDich.class.getName());
			keHoachChuyenDich.setId(id);
			keHoachChuyenDich.setDieuKienChuyenDich("");
			keHoachChuyenDich.setMessageId(header.getReference().getMessageId());
			keHoachChuyenDich.setMessageStatus("99");
			
			keHoachChuyenDich.setGhiChu("Reference:= "+header.getSubject().getReference()+" - Function:= "+ header.getSubject().getFunction()+" - Type:="+header.getSubject().getType());
			
			keHoachChuyenDich.setThoiDiemCapNhat( new Date());
			TthcKeHoachChuyenDichLocalServiceUtil.addTthcKeHoachChuyenDich(keHoachChuyenDich);
			return id;
		} catch (Exception e) {
			
			_log.error(e);
			
		}
		return 0;
	}
	
	
	public static long insertMessageSynHistory(Header header, String data, String direction, int requestState, String uuid,int level) {
		try {
			
			AswmsgSyndatahistory syndatahistory = new AswmsgSyndatahistoryImpl();
			
			if (uuid == null) {
				syndatahistory.setMessageId(header.getReference().getMessageId());
			} else {
				syndatahistory.setMessageId(uuid);
			}
			long id = CounterLocalServiceUtil.increment(Constants.ASWMSG_SYNDATAHISTORY_ID);
			
			syndatahistory.setId(id);
			syndatahistory.setVersion(header.getReference().getVersion());
			syndatahistory.setSenderName(header.getFrom().getName());
			syndatahistory.setSenderIdentity(header.getFrom().getIdentity());
			syndatahistory.setSenderCountryCode(header.getFrom().getCountryCode());
			syndatahistory.setSenderMinistryCode(header.getFrom().getMinistryCode());
			syndatahistory.setSenderOrganizationCode(header.getFrom().getOrganizationCode());
			syndatahistory.setSenderUnitCode(header.getFrom().getUnitCode());
			syndatahistory.setPriority(level);
			syndatahistory.setReceiverName(header.getTo().getName());
			syndatahistory.setReceiverIdentity(header.getTo().getIdentity());
			syndatahistory.setReceiverCountryCode(header.getTo().getCountryCode());
			syndatahistory.setReceiverMinistryCode(header.getTo().getMinistryCode());
			syndatahistory.setReceiverOrganizationCode(header.getTo().getOrganizationCode());
			syndatahistory.setReceiverUnitCode(header.getTo().getUnitCode());			
			syndatahistory.setDocumentType(header.getSubject().getDocumentType());
			syndatahistory.setType(header.getSubject().getType());
			syndatahistory.setFunction(header.getSubject().getFunction());
			syndatahistory.setReference(header.getSubject().getReference());
			syndatahistory.setPreReference(header.getSubject().getPreReference());
			syndatahistory.setDocumentYear(header.getSubject().getDocumentYear());
			syndatahistory.setSendDate(FormatData.parseStringToDate(header.getSubject().getSendDate()));
			syndatahistory.setSignature("hashcode");
			syndatahistory.setSystemSignature("hashcode");
			syndatahistory.setAllContent(data);
			syndatahistory.setCreatedTime(new Date());
			syndatahistory.setWebservice(-1);
			syndatahistory.setValidated(9);
			syndatahistory.setValidationCode(direction);
			
			syndatahistory = AswmsgSyndatahistoryLocalServiceUtil.addAswmsgSyndatahistory(syndatahistory);
			return id;
		} catch (Exception e) {
			
			_log.error(e);
			
		}
		return 0;
	}

	
}
