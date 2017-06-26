
package vn.dtt.gt.dk.nsw.message.xml;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
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
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.nsw.fac.CertificateOfQuanlityConformityFactory;
import vn.dtt.gt.dk.nsw.fac.ConfirmCancellationFactory;
import vn.dtt.gt.dk.nsw.fac.ConfirmCertificateCancellationFactory;
import vn.dtt.gt.dk.nsw.fac.ConfirmCertificateEndorsementFactory;
import vn.dtt.gt.dk.nsw.fac.ConfirmOfRemovedScheduleFactory;
import vn.dtt.gt.dk.nsw.fac.ConfirmOfRemovedVehicleFactory;
import vn.dtt.gt.dk.nsw.fac.ConfirmationOfAssignmentFactory;
import vn.dtt.gt.dk.nsw.fac.ConfirmationStatusOfQuanlityConformityFactory;
import vn.dtt.gt.dk.nsw.fac.CurrencyFactory;
import vn.dtt.gt.dk.nsw.fac.CurrentStatusOfImportedVehicleListFactory;
import vn.dtt.gt.dk.nsw.fac.DebitNoteByCertificateFactory;
import vn.dtt.gt.dk.nsw.fac.DebitNoteFactory;
import vn.dtt.gt.dk.nsw.fac.FileEndorsementFactory;
import vn.dtt.gt.dk.nsw.fac.ImportedVehicleListFactory;
import vn.dtt.gt.dk.nsw.fac.InquiryImportedVehicleReferenceFactory;
import vn.dtt.gt.dk.nsw.fac.InquiryOfCertificateContentFactory;
import vn.dtt.gt.dk.nsw.fac.NoticeCertificateEndorsementFactory;
import vn.dtt.gt.dk.nsw.fac.NoticeOfCancellationFactory;
import vn.dtt.gt.dk.nsw.fac.NoticeOfExemptionFromInspectionFactory;
import vn.dtt.gt.dk.nsw.fac.NoticeOfNonConformityFactory;
import vn.dtt.gt.dk.nsw.fac.NoticeOfViolationFactory;
import vn.dtt.gt.dk.nsw.fac.PaymentConfirmationFactory;
import vn.dtt.gt.dk.nsw.fac.PaymentNotificationFactory;
import vn.dtt.gt.dk.nsw.fac.RemovedScheduleFactory;
import vn.dtt.gt.dk.nsw.fac.RemovedVehicleFactory;
import vn.dtt.gt.dk.nsw.fac.RequestChangesFactory;
import vn.dtt.gt.dk.nsw.fac.RequestFactoty;
import vn.dtt.gt.dk.nsw.fac.RequestForChangingDateSiteFactory;
import vn.dtt.gt.dk.nsw.fac.RequestForControlFactory;
import vn.dtt.gt.dk.nsw.fac.RequestForQualityInspectionFactory;
import vn.dtt.gt.dk.nsw.fac.RequestOfEmissionTestingFactory;
import vn.dtt.gt.dk.nsw.fac.RequestOfSafeTestingFactory;
import vn.dtt.gt.dk.nsw.fac.ScheduleReportFactory;
import vn.dtt.gt.dk.nsw.fac.SelectedGroupForPaymentFactory;
import vn.dtt.gt.dk.nsw.fac.SelectedVehicleListForPaymentFactory;
import vn.dtt.gt.dk.nsw.fac.TechnicalSpecificationFactory;
import vn.dtt.gt.dk.nsw.fac.UserInformationFactory;
import vn.dtt.gt.dk.nsw.fac.VehicleInspectionRecordFactory;
import vn.dtt.gt.dk.nsw.fac.StateListFactory;
import vn.dtt.gt.dk.nsw.fac.ProvinceListFactory;
import vn.dtt.gt.dk.nsw.fac.DistrictListFactory;

public class MessageFactory {
	
	private static Log _log = LogFactoryUtil.getLog(MessageFactory.class);
	
	public static final String NOI_DUNG_TRA_VE = "NOI_DUNG_TRA_VE";
	public static final String CHU_KY_SO = "CHU_KY_SO";
	
	public static List<Object> converXMLMessagesContentToObject(String xmlString) {
		List<Object> objects = null;
		String content = null;
		String objectName = null;
		XPath xPath = XPathFactory.newInstance().newXPath();
		String expression = "//Body/Content";
		DOMSource source = null;
		
		try {
			ByteArrayInputStream stream = new ByteArrayInputStream(xmlString.getBytes("UTF-8"));
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = (Document) builder.parse(stream);
			
			NodeList nodeList;
			Node node1 = (Node) xPath.compile(expression).evaluate(doc, XPathConstants.NODE);
			
			objects = new ArrayList<Object>();
			if (null != node1) {
				nodeList = node1.getChildNodes();
				for (int i = 0; null != nodeList && i < nodeList.getLength(); i++) {
					Node nod = nodeList.item(i);
					if (nod.getNodeType() == Node.ELEMENT_NODE) objectName = nodeList.item(i).getNodeName();
					// System.out.println(nodeList.item(i).getNodeName() + " : "
					// + nod.getFirstChild().getNodeValue());
					
					if (nod instanceof Element) {
						source = new DOMSource(nod);
						// Set up the transformer to write the output string
						TransformerFactory tFactory = TransformerFactory.newInstance();
						Transformer transformer = tFactory.newTransformer();
						transformer.setOutputProperty("indent", "yes");
						transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
						StringWriter sw = new StringWriter();
						StreamResult result = new StreamResult(sw);
						// Do the transformation and output
						transformer.transform(source, result);
						content = sw.toString();
						
						if ("RequestForQualityInspection".equalsIgnoreCase(objectName)) {
							//objects.add(convertXmltoRequestForQualityInspection(content));
							objects.add(MessageFactory.converXmlToObject(content, new RequestForQualityInspectionFactory()));
						}
						if ("Request".equalsIgnoreCase(objectName)) {
							//objects.add(convertXmltoRequestForQualityInspection(content));
							objects.add(MessageFactory.converXmlToObject(content, new RequestFactoty()));
						}
						if ("TechnicalSpecification".equalsIgnoreCase(objectName)) {
//							System.out.println("Co thang nayTechnicalSpecification");
							objects.add(MessageFactory.converXmlToObject(content, new TechnicalSpecificationFactory()));
						}
						
						if ("ImportedVehicleList".equalsIgnoreCase(objectName)) {
							objects.add(MessageFactory.converXmlToObject(content, new ImportedVehicleListFactory()));
						}
						
						if ("RequestForChangingDateSite".equalsIgnoreCase(objectName)) {
							objects.add(MessageFactory.converXmlToObject(content, new RequestForChangingDateSiteFactory()));
						}
						
						if ("ScheduleReport".equalsIgnoreCase(objectName)) {
							objects.add(MessageFactory.converXmlToObject(content, new ScheduleReportFactory()));
						}
						
						if ("RequestOfEmissionTesting".equalsIgnoreCase(objectName)) {
							objects.add(MessageFactory.converXmlToObject(content, new RequestOfEmissionTestingFactory()));
						}
						
						if ("RequestOfSafeTesting".equalsIgnoreCase(objectName)) {
							objects.add(MessageFactory.converXmlToObject(content, new RequestOfSafeTestingFactory()));
						}
						
						if ("RequestForControl".equalsIgnoreCase(objectName)) {
							objects.add(MessageFactory.converXmlToObject(content, new RequestForControlFactory()));
						}
						
						if ("CurrentStatusOfImportedVehicleList".equalsIgnoreCase(objectName)) {
							objects.add(MessageFactory.converXmlToObject(content, new CurrentStatusOfImportedVehicleListFactory()));
						}
						
						if ("ConfirmationOfAssignment".equalsIgnoreCase(objectName)) {
							objects.add(MessageFactory.converXmlToObject(content, new ConfirmationOfAssignmentFactory()));
						}
						
						if ("SelectedVehicleListForPayment".equalsIgnoreCase(objectName)) {
							objects.add(MessageFactory.converXmlToObject(content, new SelectedVehicleListForPaymentFactory()));
						}
						
						if ("PaymentNotification".equalsIgnoreCase(objectName)) {
							objects.add(MessageFactory.converXmlToObject(content, new PaymentNotificationFactory()));
						}
						
						if ("DebitNote".equalsIgnoreCase(objectName)) {
							objects.add(MessageFactory.converXmlToObject(content, new DebitNoteFactory()));
						}
						
						if ("PaymentConfirmation".equalsIgnoreCase(objectName)) {
							objects.add(MessageFactory.converXmlToObject(content, new PaymentConfirmationFactory()));
						}
						
						if ("CertificateOfQuanlityConformity".equalsIgnoreCase(objectName)) {
							objects.add(MessageFactory.converXmlToObject(content, new CertificateOfQuanlityConformityFactory()));
						}
						
						if ("NoticeOfExemptionFromInspection".equalsIgnoreCase(objectName)) {
							objects.add(MessageFactory.converXmlToObject(content, new NoticeOfExemptionFromInspectionFactory()));
						}
						
						if ("NoticeOfNonConformity".equalsIgnoreCase(objectName)) {
							objects.add(MessageFactory.converXmlToObject(content, new NoticeOfNonConformityFactory()));
						}
						
						if ("NoticeOfViolation".equalsIgnoreCase(objectName)) {
							objects.add(MessageFactory.converXmlToObject(content, new NoticeOfViolationFactory()));
						}
						
						if ("NoticeCertificateEndorsement".equalsIgnoreCase(objectName)) {
							objects.add(MessageFactory.converXmlToObject(content, new NoticeCertificateEndorsementFactory()));
						}
						
						if ("ConfirmationStatusOfQuanlityConformity".equalsIgnoreCase(objectName)) {
							objects.add(MessageFactory.converXmlToObject(content, new ConfirmationStatusOfQuanlityConformityFactory()));
						}
						
						if ("ConfirmCertificateEndorsement".equalsIgnoreCase(objectName)) {
							objects.add(MessageFactory.converXmlToObject(content, new ConfirmCertificateEndorsementFactory()));
						}
						
						if ("ConfirmCertificateCancellation".equalsIgnoreCase(objectName)) {
							objects.add(MessageFactory.converXmlToObject(content, new ConfirmCertificateCancellationFactory()));
						}
						
						if ("InquiryOfCertificateContent".equalsIgnoreCase(objectName)) {
							objects.add(MessageFactory.converXmlToObject(content, new InquiryOfCertificateContentFactory()));
						}
						
						if ("InquiryImportedVehicleReference".equalsIgnoreCase(objectName)) {
							objects.add(MessageFactory.converXmlToObject(content, new InquiryImportedVehicleReferenceFactory()));
						}
						
						if ("VehicleInspectionRecord".equalsIgnoreCase(objectName)) {
							objects.add(MessageFactory.converXmlToObject(content, new VehicleInspectionRecordFactory()));
						}
						if ("SelectedGroupForPayment".equalsIgnoreCase(objectName)) {
					       objects.add(MessageFactory.converXmlToObject(content, new SelectedGroupForPaymentFactory()));
					    }
						if ("RemovedSchedule".equalsIgnoreCase(objectName)) {
						       objects.add(MessageFactory.converXmlToObject(content, new RemovedScheduleFactory()));
						}
						if ("RequestChanges".equalsIgnoreCase(objectName)) {
						       objects.add(MessageFactory.converXmlToObject(content, new RequestChangesFactory()));
						}
						if ("Currency".equalsIgnoreCase(objectName)) {
						       objects.add(MessageFactory.converXmlToObject(content, new CurrencyFactory()));
						}
						if ("NoticeOfCancellation".equalsIgnoreCase(objectName)) {
						       objects.add(MessageFactory.converXmlToObject(content, new NoticeOfCancellationFactory()));
						}
						if ("ConfirmCancellation".equalsIgnoreCase(objectName)) {
						       objects.add(MessageFactory.converXmlToObject(content, new ConfirmCancellationFactory()));
						}
						if ("DebitNoteByCertificate".equalsIgnoreCase(objectName)) {
						       objects.add(MessageFactory.converXmlToObject(content, new DebitNoteByCertificateFactory()));
						}
						if ("RemovedVehicle".equalsIgnoreCase(objectName)) {
						       objects.add(MessageFactory.converXmlToObject(content, new RemovedVehicleFactory()));
						}
						if ("ConfirmOfRemovedSchedule".equalsIgnoreCase(objectName)) {
						       objects.add(MessageFactory.converXmlToObject(content, new ConfirmOfRemovedScheduleFactory()));
						}
						if ("ConfirmOfRemovedVehicle".equalsIgnoreCase(objectName)) {
						       objects.add(MessageFactory.converXmlToObject(content, new ConfirmOfRemovedVehicleFactory()));
						}
						if ("FileEndorsement".equalsIgnoreCase(objectName)) {
						       objects.add(MessageFactory.converXmlToObject(content, new FileEndorsementFactory()));
						}
						if ("UserInformation".equalsIgnoreCase(objectName)) {
						       objects.add(MessageFactory.converXmlToObject(content, new UserInformationFactory()));
						}
						if ("StateList".equalsIgnoreCase(objectName)) {
						       objects.add(MessageFactory.converXmlToObject(content, new StateListFactory()));
						}
						if ("ProvinceList".equalsIgnoreCase(objectName)) {
						       objects.add(MessageFactory.converXmlToObject(content, new ProvinceListFactory()));
						}
						if ("DistrictList".equalsIgnoreCase(objectName)) {
						       objects.add(MessageFactory.converXmlToObject(content, new DistrictListFactory()));
						}
					}
				}
			}
			
		} catch (Exception e) {
			_log.error(e);
		}
		return objects;
	}
	
	@SuppressWarnings({
		"unchecked"
	})
	public static <T> T converXmlToObject(String content, T t) throws IOException {
		if (!StringUtils.isEmpty(content)) {
			ByteArrayInputStream input = new ByteArrayInputStream(content.getBytes("UTF-8"));
			try {
				JAXBContext jc = JAXBContext.newInstance(t.getClass());
				
				// create an Unmarshaller
				Unmarshaller unmarshaller = jc.createUnmarshaller();
				//xmlString=xmlString.replaceAll("\\<\\?xml(.+?)\\?\\>", "").trim();
				
				// unmarshal a po instance document into a tree of Java content
				// objects composed of classes from the primer.po package.
				T obj = (T) unmarshaller.unmarshal(input);
				
				return obj;
			} catch (Exception e) {
				_log.error(e);
			} finally {
				input.close();
			}
		}
		return null;
	}
	
	public static <T> String convertObjectToXml(T t) throws IOException {
		
		if (t != null) {
			ByteArrayOutputStream output = new ByteArrayOutputStream();
			try {
				JAXBContext jc = JAXBContext.newInstance(t.getClass());
				
				// create an Marshaller
				Marshaller marshaller = jc.createMarshaller();
				//Loai bo formatted theo dinh dang indent
				//marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				marshaller.marshal(t, output);
				String toXml = new String(output.toByteArray(), "UTF-8");
				return XmlUtils.replaceXML(toXml);
			} catch (Exception e) {
				_log.error(e);
			}
		}
		return null;
	}
	
}
