package vn.dtt.gt.dk.portlet.business;

import vn.dtt.gt.dk.message.MessageUtils;
import vn.dtt.gt.dk.nsw.Header;
import vn.dtt.gt.dk.nsw.message.xml.MessageFactory;
import vn.dtt.gt.dk.nsw.model.Messsage;
import vn.dtt.gt.dk.utils.format.FormatData;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class XuLyMessage {
	
	private static Log _log = LogFactoryUtil.getLog(XuLyMessage.class);

	public static String createContentSendFromBgtvtToNSW(Header header,
			String xmlData, String messageId, String xmlSignature) {
		String xmlResult = null;
		try {
			//_log.info("========header===sendTestToNSW===" + header.getFrom().getName()+"  "+header.getFrom().getMinistryCode());
			_log.debug(
					"==XuLyMessage==Reference=="
							+ header.getSubject().getReference());
			Messsage messsage = new Messsage();

			messsage.setRefVersion(String.valueOf(header.getReference()
					.getVersion()));

			messsage.setRefMessageId(messageId);

			messsage.setFromName(header.getFrom().getName());
			messsage.setFromIdentity(String.valueOf(header.getFrom()
					.getIdentity()));

			messsage.setToName(header.getTo().getName());
			messsage.setToIdentity(String.valueOf(header.getTo().getIdentity()));

			messsage.setDocumentType(String.valueOf(header.getSubject()
					.getDocumentType()));
			messsage.setType(FormatData.formatIntToString(header.getSubject()
					.getType()));
			messsage.setFunction(String.valueOf(header.getSubject()
					.getFunction()));
			messsage.setReference(String.valueOf(header.getSubject()
					.getReference()));
			messsage.setPreReference(String.valueOf(header.getSubject()
					.getPreReference()));
			messsage.setDocumentYear(String.valueOf(header.getSubject()
					.getDocumentYear()));
			messsage.setSendDate(header.getSubject().getSendDate());

			messsage.setFromCountryCode(header.getFrom().getCountryCode());
			messsage.setFromMinistryCode(header.getFrom().getMinistryCode());
			messsage.setFromOrganizationCode(header.getFrom()
					.getOrganizationCode());
			messsage.setFromUnitCode(header.getFrom().getUnitCode());

			messsage.setToCountryCode(header.getTo().getCountryCode());
			messsage.setToMinistryCode(header.getTo().getMinistryCode());
			messsage.setToOrganizationCode(header.getTo()
					.getOrganizationCode());
			messsage.setToUnitCode(header.getTo().getUnitCode());

			xmlResult = MessageUtils.createMessageRequest(messsage);
			// Thay the hashCode NOI_DUNG_TRA_VE bằng String xmlData Trong
			// message của thẻ <Content>
			xmlResult = xmlResult.replace(MessageFactory.NOI_DUNG_TRA_VE,
					xmlData);
			if (xmlSignature != null & xmlSignature.length() > 0) {
				xmlResult = xmlResult.replace(MessageFactory.CHU_KY_SO,
						xmlSignature);
			}else{
				xmlResult = xmlResult.replace(MessageFactory.CHU_KY_SO,
						"");
			}
			_log.debug(
					"==XuLyMessage===Thong tin BGTVT gui sang HQMC==="
							+ xmlResult);
		} catch (Exception e) {
			_log.error(e);
		}

		return xmlResult;
	}

	public static String createContentForNoiDungHoSo(Header header,
			String xmlData) {
		String xmlResult = null;
		try {
			_log.debug(
					"==XuLyMessage==Reference=="
							+ header.getSubject().getReference());
			Messsage messsage = new Messsage();

			messsage.setRefVersion(String.valueOf(header.getReference()
					.getVersion()));

			messsage.setRefMessageId(header.getReference().getMessageId());

			messsage.setFromName(header.getFrom().getName());
			messsage.setFromIdentity(String.valueOf(header.getFrom()
					.getIdentity()));

			messsage.setToName(header.getTo().getName());
			messsage.setToIdentity(String.valueOf(header.getTo().getIdentity()));

			messsage.setDocumentType(String.valueOf(header.getSubject()
					.getDocumentType()));
			messsage.setType(FormatData.formatIntToString(header.getSubject()
					.getType()));
			messsage.setFunction(String.valueOf(header.getSubject()
					.getFunction()));
			messsage.setReference(String.valueOf(header.getSubject()
					.getReference()));
			messsage.setPreReference(String.valueOf(header.getSubject()
					.getPreReference()));
			messsage.setDocumentYear(String.valueOf(header.getSubject()
					.getDocumentYear()));
			messsage.setSendDate(header.getSubject().getSendDate());

			messsage.setFromCountryCode(header.getTo().getCountryCode());
			messsage.setFromMinistryCode(header.getTo().getMinistryCode());
			messsage.setFromOrganizationCode(header.getTo()
					.getOrganizationCode());
			messsage.setFromUnitCode(header.getTo().getUnitCode());

			messsage.setToCountryCode(header.getFrom().getCountryCode());
			messsage.setToMinistryCode(header.getFrom().getMinistryCode());
			messsage.setToOrganizationCode(header.getFrom()
					.getOrganizationCode());
			messsage.setToUnitCode(header.getFrom().getUnitCode());

			xmlResult = MessageUtils.createMessageRequest(messsage);
			// Thay the hashCode NOI_DUNG_TRA_VE bằng String xmlData Trong
			// message của thẻ <Content>
			xmlResult = xmlResult.replace(MessageFactory.NOI_DUNG_TRA_VE,
					xmlData);
			_log.debug(
					"==XuLyMessage===Thong tin BGTVT gui sang HQMC==="
							+ xmlResult);
		} catch (Exception e) {
			_log.error(e);
		}

		return xmlResult;
	}

}
