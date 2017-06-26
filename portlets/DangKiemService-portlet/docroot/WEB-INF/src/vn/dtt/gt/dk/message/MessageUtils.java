package vn.dtt.gt.dk.message;

import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import vn.dtt.gt.dk.nsw.CreateMessageFactory;
import vn.dtt.gt.dk.nsw.Header;
import vn.dtt.gt.dk.nsw.HeaderFactory;
import vn.dtt.gt.dk.nsw.message.xml.MessageFactory;
import vn.dtt.gt.dk.nsw.model.Messsage;
import vn.dtt.gt.dk.utils.format.FormatData;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;


public class MessageUtils {
	
	private static Log _log = LogFactoryUtil.getLog(MessageUtils.class);
	public static final String NOI_DUNG_TRA_VE = "NOI_DUNG_TRA_VE";
	public static final String CHU_KY_SO = "CHU_KY_SO";
	
	public static String replaceXML(String data) {
		try {
			String dataPrefix = data.substring(0, data.indexOf("?>") + 2).toLowerCase();
			if (dataPrefix.contains("version") && dataPrefix.contains("encoding")) {
				return data.substring(data.indexOf("?>") + 2, data.length());
			//TODO Truong hop khac
			} else if (dataPrefix.contains("version") | dataPrefix.contains("encoding")) {
				return data.substring(data.indexOf("?>") + 2, data.length());
			}
			return data;
		} catch (Exception e) {
			_log.error(e);
		}
		return data;
	}
	
	public static String replaceSignature(String data) {
		try {
			String dataPrefix = data.substring(0, data.indexOf("<Signature>")).toLowerCase();
			return dataPrefix;
		} catch (Exception e) {
			_log.error(e);
		}
		return data;
	}
	
	public static Header readXmlMessageHeader(String xmlString)
		throws Exception {
		
		XPath xPath = XPathFactory.newInstance().newXPath();
		String expression = "Envelope/Header";//"//Body/Content";//
		
		DOMSource source = null;
		ByteArrayInputStream stream = new ByteArrayInputStream(xmlString.getBytes("UTF-8"));
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(stream);
		
		Node node = (Node) xPath.compile(expression).evaluate(doc, XPathConstants.NODE);
		source = new DOMSource(node);
		
		TransformerFactory tFactory = TransformerFactory.newInstance();
		Transformer transformer = tFactory.newTransformer();
		transformer.setOutputProperty("indent", "yes");
		transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		
		StringWriter sw = new StringWriter();
		StreamResult result = new StreamResult(sw);
		
		transformer.transform(source, result);
		
		StringReader reader = new StringReader(sw.toString());
		
		// create a JAXBContext capable of handling classes generated into
		// Document doc1 =XmlUtils.parseXmlFile("C://header.xml", false);
		
		JAXBContext jc = JAXBContext.newInstance(HeaderFactory.class);
		
		// create an Unmarshaller
		Unmarshaller unmarshaller = jc.createUnmarshaller();
		String xmlHeader = sw.toString();
		//xmlString=xmlString.replaceAll("\\<\\?xml(.+?)\\?\\>", "").trim();
		
		ByteArrayInputStream input = new ByteArrayInputStream(xmlHeader.getBytes("UTF-8"));
		
		// unmarshal a po instance document into a tree of Java content
		// objects composed of classes from the primer.po package.
		
		Header header = (Header) unmarshaller.unmarshal(input);
		return header;
		
	}
	
	public static String createMessageRequest(Messsage messsage) {
		
		try {
			javax.xml.parsers.DocumentBuilderFactory factory = javax.xml.parsers.DocumentBuilderFactory.newInstance();
			javax.xml.parsers.DocumentBuilder docbuilder = factory.newDocumentBuilder();
			Document doc = docbuilder.newDocument();
			Node corpus = doc.createElement("Envelope");
			Node header = doc.createElement("Header");
			corpus.appendChild(header);
			
			Node reference = doc.createElement("Reference");
			header.appendChild(reference);
			
			Node refversion = doc.createElement("version");
			refversion.appendChild(doc.createTextNode(messsage.getRefVersion()));
			reference.appendChild(refversion);
			Node refmessageId = doc.createElement("messageId");
			refmessageId.appendChild(doc.createTextNode(messsage.getRefMessageId()));
			reference.appendChild(refmessageId);
			
			//-- From
			Node from = doc.createElement("From");
			
			Node frmName = doc.createElement("name");
			frmName.appendChild(doc.createTextNode(messsage.getFromName()));
			from.appendChild(frmName);
			Node frmIdentity = doc.createElement("identity");
			frmIdentity.appendChild(doc.createTextNode(messsage.getFromIdentity()));
			from.appendChild(frmIdentity);
			
			Node frmCountryCode = doc.createElement("countryCode");
			frmCountryCode.appendChild(doc.createTextNode(messsage.getFromCountryCode()));
			from.appendChild(frmCountryCode);
			Node frmMinistryCode = doc.createElement("ministryCode");
			frmMinistryCode.appendChild(doc.createTextNode(messsage.getFromMinistryCode()));
			from.appendChild(frmMinistryCode);
			
			Node frmOrganizationCode = doc.createElement("organizationCode");
			frmOrganizationCode.appendChild(doc.createTextNode(messsage.getFromOrganizationCode()));
			from.appendChild(frmOrganizationCode);
			Node frmUnitCode = doc.createElement("unitCode");
			frmUnitCode.appendChild(doc.createTextNode(messsage.getFromUnitCode()));
			from.appendChild(frmUnitCode);
			
			header.appendChild(from);
			
			//---------- To ----------
			Node to = doc.createElement("To");
			Node toName = doc.createElement("name");
			toName.appendChild(doc.createTextNode(messsage.getToName()));
			to.appendChild(toName);
			
			Node toIdentity = doc.createElement("identity");
			toIdentity.appendChild(doc.createTextNode(messsage.getToIdentity()));
			to.appendChild(toIdentity);
			
			Node frmCountryCodeTo = doc.createElement("countryCode");
			frmCountryCodeTo.appendChild(doc.createTextNode(messsage.getToCountryCode()));
			to.appendChild(frmCountryCodeTo);
			
			Node frmMinistryCodeTo = doc.createElement("ministryCode");
			frmMinistryCodeTo.appendChild(doc.createTextNode(messsage.getToMinistryCode()));
			to.appendChild(frmMinistryCodeTo);
			
			Node frmOrganizationCodeTo = doc.createElement("organizationCode");
			frmOrganizationCodeTo.appendChild(doc.createTextNode(messsage.getToOrganizationCode()));
			to.appendChild(frmOrganizationCodeTo);
			Node frmUnitCodeTo = doc.createElement("unitCode");
			frmUnitCodeTo.appendChild(doc.createTextNode(messsage.getToUnitCode()));
			to.appendChild(frmUnitCodeTo);
			
			header.appendChild(to);
			
			//---------- Subject ----------
			Node subject = doc.createElement("Subject");
			
			Node documentType = doc.createElement("documentType");
			documentType.appendChild(doc.createTextNode(messsage.getDocumentType()));
			subject.appendChild(documentType);
			
			Node type = doc.createElement("type");
			type.appendChild(doc.createTextNode(messsage.getType()));
			subject.appendChild(type);
			
			Node nfunction = doc.createElement("function");
			nfunction.appendChild(doc.createTextNode(messsage.getFunction()));
			subject.appendChild(nfunction);
			
			Node nreference = doc.createElement("reference");
			nreference.appendChild(doc.createTextNode(messsage.getReference()));
			subject.appendChild(nreference);
			
			Node preReference = doc.createElement("preReference");
			preReference.appendChild(doc.createTextNode(messsage.getPreReference()));
			subject.appendChild(preReference);
			Node documentYear = doc.createElement("documentYear");
			documentYear.appendChild(doc.createTextNode(messsage.getDocumentYear()));
			subject.appendChild(documentYear);
			
			Node sendDate = doc.createElement("sendDate");
			sendDate.appendChild(doc.createTextNode(messsage.getSendDate()));
			subject.appendChild(sendDate);
			
			header.appendChild(subject);
			Node body = doc.createElement("Body");
			corpus.appendChild(body);
			
			Node content = doc.createElement("Content");
			
			content.setTextContent(NOI_DUNG_TRA_VE);
			body.appendChild(content);
			
			Node signature = doc.createElement("SystemSignature");
			
			signature.setTextContent(CHU_KY_SO);
			corpus.appendChild(signature);
			doc.appendChild(corpus);
			return getStringFromDocument(doc);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	public static String getStringFromDocument(Document doc) {
		try {
			DOMSource domSource = new DOMSource(doc);
			StringWriter writer = new StringWriter();
			StreamResult result = new StreamResult(writer);
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer transformer = tf.newTransformer();
			//Tạo chuổi String, trên cùng một dòng
			//transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			transformer.transform(domSource, result);
			return writer.toString();
		} catch (Exception e) {
			_log.error(e);
			return null;
		}
	}
	
	public static String createReturnContentAfterParserDataReceiverFromNSW(Header header) {
		Messsage messsage = new Messsage();
		
		messsage.setRefVersion(String.valueOf(header.getReference().getVersion()));
		messsage.setRefMessageId(header.getReference().getMessageId());
		
		messsage.setFromName(header.getTo().getName());
		messsage.setFromIdentity(String.valueOf(header.getTo().getIdentity()));
		
		messsage.setToName(header.getFrom().getName());
		messsage.setToIdentity(String.valueOf(header.getFrom().getIdentity()));
		
		messsage.setDocumentType(header.getSubject().getDocumentType());
		
		messsage.setType(FormatData.formatIntToString(header.getSubject().getType()));
		messsage.setFunction(String.valueOf(MessageType.HO_SO));
		
		messsage.setReference(String.valueOf(header.getSubject().getReference()));
		messsage.setPreReference(String.valueOf(header.getSubject().getPreReference()));
		messsage.setDocumentYear(String.valueOf(header.getSubject().getDocumentYear()));
		messsage.setSendDate(header.getSubject().getSendDate());
		
		messsage.setFromCountryCode(header.getTo().getCountryCode());
		messsage.setFromMinistryCode(header.getTo().getMinistryCode());
		messsage.setFromOrganizationCode(header.getTo().getOrganizationCode());
		messsage.setFromUnitCode(header.getTo().getUnitCode());
		
		messsage.setToCountryCode(header.getFrom().getCountryCode());
		messsage.setToMinistryCode(header.getFrom().getMinistryCode());
		messsage.setToOrganizationCode(header.getFrom().getOrganizationCode());
		messsage.setToUnitCode(header.getFrom().getUnitCode());
		
		String xmlResult = MessageUtils.createMessageRequest(messsage);
		
		xmlResult = xmlResult.replace(MessageFactory.NOI_DUNG_TRA_VE, "<ReceiveDate>" + FormatData.parseDateToTring(new Date()) + "</ReceiveDate>");
		xmlResult = xmlResult.replace(MessageFactory.CHU_KY_SO,
				BanTinSystemSignature.systemSignature());
		return xmlResult;
	}
	
	
	public static String createReturnContentAfterCompleteBusiness(Header header) {
		Messsage messsage = new Messsage();
		
		messsage.setRefVersion(String.valueOf(header.getReference().getVersion()));
		messsage.setRefMessageId(header.getReference().getMessageId());
		
		messsage.setFromName(header.getTo().getName());
		messsage.setFromIdentity(String.valueOf(header.getTo().getIdentity()));
		
		messsage.setToName(header.getFrom().getName());
		messsage.setToIdentity(String.valueOf(header.getFrom().getIdentity()));
		
		messsage.setDocumentType(header.getSubject().getDocumentType());
		
		messsage.setType(FormatData.formatIntToString(header.getSubject().getType()));
		messsage.setFunction(String.valueOf(MessageType.XAC_NHAN_SU_LY));
		
		messsage.setReference(String.valueOf(header.getSubject().getReference()));
		messsage.setPreReference(String.valueOf(header.getSubject().getPreReference()));
		messsage.setDocumentYear(String.valueOf(header.getSubject().getDocumentYear()));
		messsage.setSendDate(header.getSubject().getSendDate());
		
		messsage.setFromCountryCode(header.getTo().getCountryCode());
		messsage.setFromMinistryCode(header.getTo().getMinistryCode());
		messsage.setFromOrganizationCode(header.getTo().getOrganizationCode());
		messsage.setFromUnitCode(header.getTo().getUnitCode());
		
		messsage.setToCountryCode(header.getFrom().getCountryCode());
		messsage.setToMinistryCode(header.getFrom().getMinistryCode());
		messsage.setToOrganizationCode(header.getFrom().getOrganizationCode());
		messsage.setToUnitCode(header.getFrom().getUnitCode());
		
		String xmlResult = MessageUtils.createMessageRequest(messsage);
		
		xmlResult = xmlResult.replace(MessageFactory.NOI_DUNG_TRA_VE, "<ReceiveDate>" + FormatData.parseDateToTring(new Date()) + "</ReceiveDate>");
		xmlResult = xmlResult.replace(MessageFactory.CHU_KY_SO,
				BanTinSystemSignature.systemSignature());
		return xmlResult;
	}
	
	public static String createReturnContentAfterValidationErrorFromNSW(Header header,String lyDo) {
		Messsage messsage =
			new Messsage(
				
				String.valueOf(header.getReference().getVersion()),//ref_version
				header.getReference().getMessageId(),//ref_messageId
				
				//--From
				header.getTo().getName(),
				String.valueOf(header.getTo().getIdentity()),
				
				//--To
				header.getFrom().getName(), String.valueOf(header.getFrom().getIdentity()),
				
				String.valueOf(header.getSubject().getDocumentType()),
				FormatData.formatIntToString(header.getSubject().getType()),
				String.valueOf(MessageType.FUNCTION_TYPE_MESSAGETYPE_RESPONSE_WHEN_ERROR_VALIDATION),
				String.valueOf(header.getSubject().getReference()),
				String.valueOf(header.getSubject().getPreReference()),
				String.valueOf(header.getSubject().getDocumentYear()),
				header.getSubject().getSendDate(),
				
				//--From
				header.getTo().getCountryCode(), header.getTo().getMinistryCode(),
				header.getTo().getOrganizationCode(), header.getTo().getUnitCode(),
				
				//--TO
				header.getFrom().getCountryCode(), header.getFrom().getMinistryCode(),
				header.getFrom().getOrganizationCode(), header.getFrom().getUnitCode());
		
		String xmlResult = MessageUtils.createMessageRequest(messsage);
		
		xmlResult =
			xmlResult.replace(MessageFactory.NOI_DUNG_TRA_VE, CreateMessageFactory.createMessageRejectSystem(
				header.getReference().getMessageId(), lyDo, "System", "System", new Date()));
		xmlResult = xmlResult.replace(MessageFactory.CHU_KY_SO,
				BanTinSystemSignature.systemSignature());
//		log.debug("=====Thong tin tra ve HQMC===" + xmlResult);
		
		return xmlResult;
	}
}
