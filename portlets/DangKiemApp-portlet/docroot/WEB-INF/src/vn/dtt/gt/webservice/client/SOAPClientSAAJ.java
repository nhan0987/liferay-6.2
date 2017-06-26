package vn.dtt.gt.webservice.client;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.nio.charset.Charset;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
 

public class SOAPClientSAAJ {

	public static String callWebservice(String data){
		String result="";
		 try {
//			 System.out.println("  abgbt aa  "+data);
			 data=  data.replace("\"","\\\"");
			 data=  data.replace("<","&lt;");
			 data=  data.replace(">","&gt;");
//			 System.out.println("  anhnt  "+data);
	            // Create SOAP Connection
	            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
	            
	            SOAPConnection soapConneaction = soapConnectionFactory.createConnection();
	            String xml="<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:tem=\"http://tempuri.org/\">"
	            + "<soapenv:Header/>"
	            + "<soapenv:Body>"
	            + " <tem:Receive>"
	            + "  <!--Optional:-->"
	            + " <tem:XMLData>"
	            +data
	            +"</tem:XMLData>"
	            + "</tem:Receive>"
	            + "</soapenv:Body>"
	            + "</soapenv:Envelope>";
	            // Send SOAP Message to SOAP Server
	            String url = "http://103.248.160.16/VNRegister/MTService.svc";
//	            String url = "http://hanoi.dtt.vn:8055/DangKiemApp-portlet/services/MessageAndResponseImpl?wsdl";
//	            soapConnection.
	            
	            SOAPMessage soapMessage =createSOAPRequest(xml);
	            MimeHeaders headers = soapMessage.getMimeHeaders();
	            headers.addHeader("SOAPAction", "http://tempuri.org/IMTService/Receive");
	            //soapConneaction.setRequestProperty("SOAPAction", "http://tempuri.org/IMTService/Receive");
//	            URL endpoint =
//	            		  new URL(new URL("http://103.248.160.16/VNRegister/MTService.svc"),
//	            		          "/path/to/webservice",
//	            		          new URLStreamHandler() {
//	            		            @Override
//	            		            protected URLConnection openConnection(URL url) throws IOException {
//	            		              URL target = new URL(url.toString());
//	            		              URLConnection connection = target.openConnection();
//	            		              // Connection settings
//	            		              connection.setConnectTimeout(10000); // 10 sec
//	            		              connection.setReadTimeout(60000); // 1 min
//	            		              return(connection);
//	            		            }
//	            		          });
	            System.out.println("1");
	            SOAPMessage soapResponse = soapConneaction.call(soapMessage, url);
//	            SOAPMessage soapResponse = soapConneaction.call(soapMessage, endpoint);
	            System.out.println("2");
	            

	            // Process the SOAP Response
	            result =printSOAPResponse(soapResponse);

	            soapConneaction.close();
	        } catch (Exception e) {
	            System.err.println("Error occurred while sending SOAP Request to Server");
	        }
		 return result;
	}
    /**
     * Starting point for the SAAJ - SOAP Client Testing
     */
    /*public static void main(String args[]) {
        try {
            // Create SOAP Connection
            System.out.println("<The ANh>");
        	SOAPClientSAAJ.callWebservice( "<The ANh> \" ");
        } catch (Exception e) {
            System.err.println("Error occurred while sending SOAP Request to Server");
        }
    }*/

    
    
    private static SOAPMessage createSOAPRequest(String xml) throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage message = messageFactory.createMessage(new MimeHeaders(), new ByteArrayInputStream(xml.getBytes(Charset.forName("UTF-8"))));
//        message.set
//        message.s
        return message;
    }

    /**
     * Method used to print the SOAP Response
     */
    private static String printSOAPResponse(SOAPMessage soapResponse) throws Exception {
    	String kq="";
    	System.out.println("printSOAPResponse 1");
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        System.out.println("printSOAPResponse 2");
        Source sourceContent = soapResponse.getSOAPPart().getContent();
        System.out.println("printSOAPResponse 3");
        //System.out.println("Response SOAP Message = ");
//        PrintStream  printStream = new P 
        StringWriter writer = new StringWriter();
        System.out.println("printSOAPResponse 4");
        StreamResult result = new StreamResult(writer);
        System.out.println("printSOAPResponse 5");
        transformer.transform(sourceContent, result);
        System.out.println("printSOAPResponse 6");
        
        
//        StreamSource source = new StreamSource(new StringReader("<xml>blabla</xml>"));
        
        String strResult = writer.toString();
        System.out.println("printSOAPResponse 7");
//        System.out.println("strResult  "+strResult);
        Document document = convertStringToDocument(strResult);
        System.out.println("printSOAPResponse 8");
        NodeList nodeList=  document.getElementsByTagName("ReceiveResult");
        if(nodeList!=null&&nodeList.getLength()>0){
        	System.out.println("printSOAPResponse 10");
        	kq=nodeList.item(0).getTextContent();
        }
        //System.out.println("kq  "+kq);
        return kq;
//        DocumentBuilderFactoryImpl.newInstance().newDocumentBuilder().parse(sourceContent.);
    }
    private static Document convertStringToDocument(String xmlStr) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
        DocumentBuilder builder;  
        try 
        {  
            builder = factory.newDocumentBuilder();  
            Document doc = builder.parse( new InputSource( new StringReader( xmlStr ) ) ); 
            return doc;
        } catch (Exception e) {  
        } 
        return null;
    }
}