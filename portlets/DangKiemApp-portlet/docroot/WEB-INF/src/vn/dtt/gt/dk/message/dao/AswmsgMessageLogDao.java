
package vn.dtt.gt.dk.message.dao;

import java.util.Date;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageLogImpl;
import vn.dtt.gt.dk.dao.aswmsg.service.AswmsgMessageLogLocalServiceUtil;
import vn.dtt.gt.dk.nsw.Header;
import vn.dtt.gt.dk.utils.document.DocumentStorageImpl;
import vn.dtt.gt.dk.utils.document.DocumentUtils;
import vn.dtt.gt.dk.utils.format.Constants;
import vn.dtt.gt.dk.utils.format.FormatData;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringUtil;

public class AswmsgMessageLogDao {
	private static Log log = LogFactoryUtil.getLog(AswmsgMessageLogDao.class);
	/**
	 * @Header header,
	 * @String data,
	 * @String direction,
	 * @int requestState,
	 * @String uuid
	 * */
	public static long insertMessageLog(Header header, String data, String direction, int requestState, String uuid) {
		try {
			if (uuid == null) {
				log.debug("==AswMsgMessageLogDao==insertMessageLog MessageId===uuid==messageId==" +
					header.getReference().getMessageId());
			} else {
				log.debug("==AswMsgMessageLogDao==insertMessageLog MessageId===uuid==systemGen==" + uuid);
			}
			
			AswmsgMessageLog messageLog = new AswmsgMessageLogImpl();
			
			if (uuid == null) {
				messageLog.setMessageId(header.getReference().getMessageId());
			} else {
				messageLog.setMessageId(uuid);
			}
			
			long id = CounterLocalServiceUtil.increment(Constants.ASWMSG_MESSAGELOG_AUTO_GENERATE_ID);
			
			messageLog.setId(id);
			messageLog.setVersion(header.getReference().getVersion());
			messageLog.setSenderName(header.getFrom().getName());
			messageLog.setSenderIdentity(header.getFrom().getIdentity());
			messageLog.setSenderCountryCode(header.getFrom().getCountryCode());
			messageLog.setSenderMinistryCode(header.getFrom().getMinistryCode());
			messageLog.setSenderOrganizationCode(header.getFrom().getOrganizationCode());
			messageLog.setSenderUnitCode(header.getFrom().getUnitCode());
			
			messageLog.setReceiverName(header.getTo().getName());
			messageLog.setReceiverIdentity(header.getTo().getIdentity());
			messageLog.setReceiverCountryCode(header.getTo().getCountryCode());
			messageLog.setReceiverMinistryCode(header.getTo().getMinistryCode());
			messageLog.setReceiverOrganizationCode(header.getTo().getOrganizationCode());
			messageLog.setReceiverUnitCode(header.getTo().getUnitCode());
			
			messageLog.setDocumentType(header.getSubject().getDocumentType());
			messageLog.setType(header.getSubject().getType());
			messageLog.setFunction(header.getSubject().getFunction());
			//TODO Hascode setReference
			messageLog.setReference(header.getSubject().getReference());//lÃ  mÃ£ bá»™ há»“ sÆ¡ (má»—i há»‡ thá»‘ng tá»± quáº£n lÃ½)
			messageLog.setPreReference(header.getSubject().getPreReference());
			messageLog.setDocumentYear(header.getSubject().getDocumentYear());
			messageLog.setSendDate(FormatData.parseStringToDate(header.getSubject().getSendDate()));//NgÃ y gá»­i thÃ´ng Ä‘iá»‡p
			//TODO Hascode setSignature, setSystemSignature
			messageLog.setSignature("hashcode");
			messageLog.setSystemSignature("hashcode");
			//messageLog.setAllContent(data);//Ghi toÃ n bá»™ ná»™i dung message trÆ°á»›c khi validate
			messageLog.setCreatedTime(new Date());//Thá»�i gian gá»­i nháº­n (táº¡o) message trÃªn há»‡ thá»‘ng
			//TODO Hascode setWebservice
			messageLog.setWebservice(-1);
			messageLog.setValidated(-1);
			messageLog.setValidationCode(direction);
			
			// save data to document media
			long idFileDinhKem = DocumentUtils.uploadFileText(data, DocumentStorageImpl.FOLDER_UPLOAD_LOG, null);
			
			if(idFileDinhKem > 0) {
				messageLog.setFileLogId(idFileDinhKem);
				
				log.info("===AswmsgMessageLog===id:" + id + ",data:" + DocumentUtils.getLinkDownloadFromNoiLuuTruTaiLieuId(idFileDinhKem));
			} else {
				// trong truong hop co loi khi luu vao document media thi van luu vao db
				messageLog.setAllContent(data);
			}
			
			messageLog = AswmsgMessageLogLocalServiceUtil.addAswmsgMessageLog(messageLog);
			return id;
		} catch (Exception e) {
			if (uuid == null) {
				log.debug("==Exception insertMessageLog MessageId:::: " + header.getReference().getMessageId());
			} else {
				log.debug("==Exception insertMessageLog MessageId::::  " + uuid);
			}
			
			log.error(e);
		}
		return 0;
	}
	
	public static long insertMessageLogWhenException(Header header, String data, String direction, int requestState, String uuid, String desc,int soLanGui) {
		try {
			if (uuid == null) {
				log.debug("==AswMsgMessageLogDao==insertMessageLogWhenException MessageId===uuid==messageId==" +
					header.getReference().getMessageId());
			} else {
				log.debug("==AswMsgMessageLogDao==insertMessageLogWhenException MessageId===uuid==systemGen==" + uuid);
			}
			AswmsgMessageLog messageLog = new AswmsgMessageLogImpl();
			
			if (uuid == null) {
				messageLog.setMessageId(header.getReference().getMessageId());
			} else {
				messageLog.setMessageId(uuid);
			}
			
			long id = CounterLocalServiceUtil.increment(Constants.ASWMSG_MESSAGELOG_AUTO_GENERATE_ID);
			
			messageLog.setId(id);
			messageLog.setVersion(header.getReference().getVersion());
			messageLog.setSenderName(header.getFrom().getName());
			messageLog.setSenderIdentity(header.getFrom().getIdentity());
			messageLog.setSenderCountryCode(header.getFrom().getCountryCode());
			messageLog.setSenderMinistryCode(header.getFrom().getMinistryCode());
			messageLog.setSenderOrganizationCode(header.getFrom().getOrganizationCode());
			messageLog.setSenderUnitCode(header.getFrom().getUnitCode());
			
			messageLog.setReceiverName(header.getTo().getName());
			messageLog.setReceiverIdentity(header.getTo().getIdentity());
			messageLog.setReceiverCountryCode(header.getTo().getCountryCode());
			messageLog.setReceiverMinistryCode(header.getTo().getMinistryCode());
			messageLog.setReceiverOrganizationCode(header.getTo().getOrganizationCode());
			messageLog.setReceiverUnitCode(header.getTo().getUnitCode());
			messageLog.setSoLanGui(soLanGui);
			messageLog.setDocumentType(header.getSubject().getDocumentType());
			messageLog.setType(header.getSubject().getType());
			messageLog.setFunction(header.getSubject().getFunction());
			//TODO Hascode setReference
			messageLog.setReference(header.getSubject().getReference());
			messageLog.setPreReference(header.getSubject().getPreReference());
			messageLog.setDocumentYear(header.getSubject().getDocumentYear());
			messageLog.setSendDate(FormatData.parseStringToDate(header.getSubject().getSendDate()));
			//TODO Hascode setSignature, setSystemSignature
			messageLog.setSignature("hashcode");
			messageLog.setSystemSignature("hashcode");
			//messageLog.setAllContent(data);
			messageLog.setCreatedTime(new Date());
			//TODO Hascode setWebservice
			messageLog.setWebservice(-1);
			messageLog.setValidated(-1);
			messageLog.setValidationCode(direction);
			messageLog.setDescription(desc);
			
			// save data to document media
			long idFileDinhKem = DocumentUtils.uploadFileText(data, DocumentStorageImpl.FOLDER_UPLOAD_LOG, null);
			
			if(idFileDinhKem > 0) {
				messageLog.setFileLogId(idFileDinhKem);
				log.info("===AswmsgMessageLog===id:" + id + ",data:" + DocumentUtils.getLinkDownloadFromNoiLuuTruTaiLieuId(idFileDinhKem));
			} else {
				// trong truong hop co loi khi luu vao document media thi van luu vao db
				messageLog.setAllContent(data);
			}
			
			messageLog = AswmsgMessageLogLocalServiceUtil.addAswmsgMessageLog(messageLog);
			return id;
		} catch (Exception e) {
			if (uuid == null) {
				log.debug("==Exception insertMessageLogWhenException MessageId:::: " + header.getReference().getMessageId());
			} else {
				log.debug("==Exception insertMessageLogWhenException MessageId::::  " + uuid);
			}
			log.error(e);
		}
		return 0;
	}

	public static long updateMessageLog(String requestCode, int requestState) {
		try {
			log.debug("===updateMessageLog===messageId===" + requestCode);
			String version = "1";
			String messageId = requestCode;
			AswmsgMessageLog messageLog = AswmsgMessageLogLocalServiceUtil.getByVersionAndMessageId(version, messageId);
			messageLog.setFunction(StringUtil.valueOf(requestState));
			
			AswmsgMessageLogLocalServiceUtil.updateAswmsgMessageLog(messageLog);
			return messageLog.getId();
		} catch (Exception e) {
			log.error(e);
		}
		return 0;
	}
}
