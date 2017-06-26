package vn.dtt.gt.dk.nsw.message.xml;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.xml.crypto.dom.DOMStructure;
import javax.xml.crypto.dsig.CanonicalizationMethod;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
/*import com.sun.org.apache.xpath.internal.XPathAPI;*/

public class XmlUtils {
	
	private static Log _log = LogFactoryUtil.getLog(XmlUtils.class);

	//Parses an XML file and returns a DOM document.
	// If validating is true, the contents is validated against the DTD
	// specified in the file.
	public static Document parseXmlFile(String filename, boolean validating) {
		try {
			// Create a builder factory
			DocumentBuilderFactory factory = DocumentBuilderFactory
			.newInstance();
			factory.setValidating(validating);
			// Create the builder and parse the file
			Document doc = factory.newDocumentBuilder().parse(
					new File(filename));
			return doc;
		} catch (SAXException e) {
			// A parsing error occurred; the xml input is not valid
			
			_log.error("SAXException in parsing XML File:" + filename
					+ ", will return null doc");
			//_log.error(e);
		} catch (ParserConfigurationException e) {
		
			_log.error("ParserConfigurationException in parsing XML File:"
					+ filename + ", will return null doc");
			//_log.error(e);
		} catch (IOException e) {
			_log.error("IOException in parsing XML File:" + filename
					+ ", will return null doc");
			_log.error(e);
		}
		return null;
	}

	public static Document parseXmlData(String xmlData, boolean validating) {

		try {
			// Create a builder factory
			DocumentBuilderFactory factory = DocumentBuilderFactory
			.newInstance();
			factory.setValidating(validating);
			// Create the builder and parse the file
			Document doc = factory.newDocumentBuilder().parse(
					new InputSource(new StringReader(xmlData)));
			return doc;
		} catch (SAXException e) {
			// A parsing error occurred; the xml input is not valid
			_log.error("SAXException in parsing XML data, will return null doc");
			_log.error(e);
		} catch (ParserConfigurationException e) {
			_log.error("ParserConfigurationException in parsing XML data, will return null doc");
			_log.error(e);
		} catch (IOException e) {
			_log.error("IOException in parsing XML data, will return null doc");
			_log.error(e);
		}
		return null;

	}

	/*public static Element[] applyXPath(Node node, String xpath) {
		Element[] elements = null;
		try {
			// Get the matching elements
			NodeList nodelist = XPathAPI.selectNodeList(node,
					xpath);
			elements = new Element[nodelist.getLength()];
			// Process the elements in the nodelist
			for (int i = 0; i < nodelist.getLength(); i++) {
				// Get element
				Element elem = (Element) nodelist.item(i);
				elements[i] = elem;
			}
		} catch (javax.xml.transform.TransformerException e) {
			_log.error("TransformerException in applying xpath:" + xpath
					+ ", will return null array of elements");
			_log.error(e);
		}
		return elements;
	}*/

	public static String getTextNode(Element aNode) {
		for (Node i = aNode.getFirstChild(); i != null; i = i.getNextSibling())
			if (i.getNodeType() == Node.TEXT_NODE)
				return i.getNodeValue();
		
		return null;
	}

	public static Node getTextChild(Element aNode)
	{
		for (Node i = aNode.getFirstChild(); i != null; i = i.getNextSibling())
			if (i.getNodeType() == Node.TEXT_NODE)
				return i;
		return null;
	}
	
	
	/*public static Element getUniqueChildNodeFromXPath(Document doc, String xpath) {
		Element elements = null;
		try {
			// Get the matching elements
			NodeList nodelist = XPathAPI.selectNodeList(doc,
					xpath);
			if (nodelist == null)
				return null;
			if (nodelist.getLength() > 1) {
				_log.error("MK-WARNING!! was expecting only one child but there are more!!");
			} else if (nodelist.getLength() == 1) {
				elements = (Element) nodelist.item(0);
			}
		} catch (javax.xml.transform.TransformerException e) {
			_log.error("TransformerException in applying xpath:" + xpath
					+ ", will return null element");
			_log.error(e);
		}
		return elements;
	}

	
	public static Element getUniqueChildNodeFromXPathTM(Document doc, String xpath) {
		Element elements = null;
		try {
			// Get the matching elements
			NodeList nodelist = XPathAPI.selectNodeList(doc,
					xpath);
			if (nodelist == null)
				return null;
			if (nodelist.getLength() > 1) {
				_log.error("WARNING! was expecting only one child but there are more Returning first one!!");
				elements = (Element) nodelist.item(0);
			} else if (nodelist.getLength() == 1) {
				elements = (Element) nodelist.item(0);
			}
		} catch (javax.xml.transform.TransformerException e) {
			_log.error("TransformerException in applying xpath:" + xpath
					+ ", will return null element");
			_log.error(e);
		}
		return elements;
	}*/
	
	
	public static void writeXML(String OUTPUT_XML_FILE,
			org.w3c.dom.Document xmlDoc) {
		try {
			javax.xml.transform.Source source = new DOMSource(xmlDoc);
			_log.info("writing File: " + OUTPUT_XML_FILE);
			// Prepare the output file
			File file = new File(OUTPUT_XML_FILE);
			Result result = new StreamResult(file);
			// Write the DOM document to the file
			javax.xml.transform.Transformer xformer = javax.xml.transform.TransformerFactory
			.newInstance().newTransformer();
			xformer.setOutputProperty(OutputKeys.INDENT, "yes");
			xformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
			xformer.transform(source, result);
		} catch (Exception e) {
			_log.error("Exception in writing file:" + OUTPUT_XML_FILE);
			_log.error(e);
		}
	}
	
	public static Element addANode(Document doc, String name, Node parent)
	{
		Element e = doc.createElement(name);
		parent.appendChild(e);
		return e;
	}
	
	public static void addAttribute(Document doc, String name, Element e, String value)
	{
		Node attrNode = doc.createAttribute(name);
		attrNode.setNodeValue(value);
		NamedNodeMap attrs = e.getAttributes();
		attrs.setNamedItem(attrNode);
	}
	
	public static Document getNewDocument()
	{
		Document doc = null;
		//initializing the DOM object to load the XML object into
		try {
			javax.xml.parsers.DocumentBuilderFactory factory = javax.xml.parsers.DocumentBuilderFactory
					.newInstance();
			javax.xml.parsers.DocumentBuilder docbuilder = factory
					.newDocumentBuilder();
			doc = docbuilder.newDocument();
		} catch (Exception e) {
			_log.error(e);
		}
		return doc;
	}
	
	private PrivateKey privateKey;
	private static final String WSSE_NAMESPACE = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";

	private static final String WSU_NAMESPACE = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd";

	private static final String SOAP_NAMESPACE = "http://www.w3.org/2003/05/soap-envelope";

	private static final String XMLNS_NS = "http://www.w3.org/2000/xmlns/";
	private String digestAlgorithm;
	private boolean signBody;
	private boolean signBinarySecurityToken;
	private String signatureAlgorithm;
	
	private void addSignature(Element wsSecurityHeaderElement,
			Element tsElement, Element bodyElement)
			throws NoSuchAlgorithmException,
			InvalidAlgorithmParameterException,
			javax.xml.crypto.dsig.XMLSignatureException, NoSuchProviderException, javax.xml.crypto.MarshalException {

		DOMSignContext domSignContext = new DOMSignContext(this.privateKey,	wsSecurityHeaderElement);
		domSignContext.setDefaultNamespacePrefix("ds");
		domSignContext.setIdAttributeNS(tsElement, WSU_NAMESPACE, "Id");
		domSignContext.setIdAttributeNS(bodyElement, WSU_NAMESPACE, "Id");
		
		XMLSignatureFactory xmlSignatureFactory = XMLSignatureFactory.getInstance("DOM");

		List<Reference> references = new LinkedList<Reference>();

		List<String> tsPrefixes = new LinkedList<String>();
		tsPrefixes.add("wsse");
		tsPrefixes.add("S");
		ExcC14NParameterSpec tsTransformSpec = new ExcC14NParameterSpec(tsPrefixes);
		Reference tsReference = xmlSignatureFactory.newReference("#TS", xmlSignatureFactory.newDigestMethod(
						this.digestAlgorithm, null), Collections 
						.singletonList(xmlSignatureFactory.newTransform(
								CanonicalizationMethod.EXCLUSIVE,
								tsTransformSpec)), null, null);
		references.add(tsReference);

		if (this.signBody) {
			List<String> bodyPrefixes = new LinkedList<String>();
			ExcC14NParameterSpec bodyTransformSpec = new ExcC14NParameterSpec(
					bodyPrefixes);
			Reference bodyReference = xmlSignatureFactory.newReference("#Body",
					xmlSignatureFactory.newDigestMethod(this.digestAlgorithm,
							null), Collections
							.singletonList(xmlSignatureFactory.newTransform(
									CanonicalizationMethod.EXCLUSIVE,
									bodyTransformSpec)), null, null);
			references.add(bodyReference);
		}

		if (this.signBinarySecurityToken) {
			Reference bstReference = xmlSignatureFactory
					.newReference("#X509", xmlSignatureFactory.newDigestMethod(
							this.digestAlgorithm, null), Collections
							.singletonList(xmlSignatureFactory.newTransform(
									CanonicalizationMethod.EXCLUSIVE,
									(TransformParameterSpec) null)), null, null);
			references.add(bstReference);
		}

		SignedInfo signedInfo = xmlSignatureFactory.newSignedInfo(
				xmlSignatureFactory.newCanonicalizationMethod(
						CanonicalizationMethod.EXCLUSIVE,
						(C14NMethodParameterSpec) null), xmlSignatureFactory
						.newSignatureMethod(this.signatureAlgorithm, null),
				references);

		KeyInfoFactory keyInfoFactory = xmlSignatureFactory.getKeyInfoFactory();
		Document document = wsSecurityHeaderElement.getOwnerDocument();
		Element securityTokenReferenceElement = document.createElementNS(
				WSSE_NAMESPACE, "wsse:SecurityTokenReference");
		Element referenceElement = document.createElementNS(WSSE_NAMESPACE,
				"wsse:Reference");
		referenceElement
				.setAttribute(
						"ValueType",
						"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-x509-token-profile-1.0#X509v3");
		referenceElement.setAttribute("URI", "#X509");
		securityTokenReferenceElement.appendChild(referenceElement);
		KeyInfo keyInfo = keyInfoFactory
				.newKeyInfo(Collections.singletonList(new DOMStructure(
						securityTokenReferenceElement)));

		XMLSignature xmlSignature = xmlSignatureFactory.newXMLSignature(signedInfo, keyInfo, null, "SIG", null);
		xmlSignature.sign(domSignContext);
	}	
	
	public static void createMessageRequest(Object from,Object to,Object subject, Object content){
		
	}
	
	  /**remove '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>'*/
	  public static String replaceXML(String data) {
			try {
				String dataPrefix = data.substring(0, data.indexOf("?>") + 2).toLowerCase();
				if (dataPrefix.contains("version") && dataPrefix.contains("encoding")) {
					return data.substring(data.indexOf("?>") + 2, data.length());
					//TODO Truong hop khac
				} else if (dataPrefix.contains("version") | dataPrefix.contains("encoding")) { return data.substring(
					data.indexOf("?>") + 2, data.length()); }
				return data;
			} catch (Exception e) {
				_log.error(e);
			}
			return data;
		}
	
}
