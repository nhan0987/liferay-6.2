
package vn.dtt.gt.webservice.client;

import org.tempuri.IMTService;
import org.tempuri.MTService;
import org.tempuri.MTServiceLocator;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class CallWs2HaiQuan {
	
	private static Log _log = LogFactoryUtil.getLog(CallWs2HaiQuan.class);
	
	public static IMTService getIMTSercice() {
		try {
			
			/*MTServiceLocator fooLocator = new MTServiceLocator();
			fooLocator.getEngine().setOption("sendMultiRefs", false);
			IMTService foo = fooLocator.getFooService(new URL(soapServiceUrl));

			FooStub binding = (FooStub) foo;
			binding.setTimeout(soapTimeoutSecs * 1000);*/
//			return new IMTServiceProxy().getIMTService();
			
//			MTServiceLocator mtServiceLocator = new MTServiceLocator();
			MTService mtService = new MTServiceLocator();
//			mtService.getEngine().setOption("sendMultiRefs", true);
			IMTService imtService = mtService.getBasicHttpBinding_IMTService();
//			
//			BasicHttpBinding_IMTServiceStub xxx = (BasicHttpBinding_IMTServiceStub) imtService;
//			xxx.setTimeout(165000);
			return imtService;
		} catch (Exception e) {
			_log.error(e);
		}
		
		return null;
	}

	/*public static void main(String[] abc){
		try{
			CallWs2HaiQuan callWs2HaiQuan = new CallWs2HaiQuan();
			IMTService imtService =  callWs2HaiQuan.getIMTSercice();
			
			String test = imtService.receive("nguyen");
			_log.info("test  "+test);
			_log.info(0%2);
			_log.info(1%2);
			_log.info(2%2);
			_log.info(3%2);
			_log.info(4%2);
			_log.info(5%2);
		}catch (Exception e) {
		}
	}*/
	
//	
//	public String getWeather(String city) throws MalformedURLException,
//	IOException {
//	 
//	//Code to make a webservice HTTP request
//	String responseString = "";
//	String outputString = "";
//	String wsURL = "http://www.deeptraining.com/webservices/weather.asmx";
//	URL url = new URL(wsURL);
//	URLConnection connection = url.openConnection();
//	HttpURLConnection httpConn = (HttpURLConnection)connection;
//	ByteArrayOutputStream bout = new ByteArrayOutputStream();
//	String xmlInput =
//	" <soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:web=\"http://litwinconsulting.com/webservices/\">\n" +
//	" <soapenv:Header/>\n" +
//	" <soapenv:Body>\n" +
//	" <web:GetWeather>\n" +
//	" <!--Optional:-->\n" +
//	" <web:City>" + city + "</web:City>\n" +
//	" </web:GetWeather>\n" +
//	" </soapenv:Body>\n" +
//	" </soapenv:Envelope>";
//	 
//	byte[] buffer = new byte[xmlInput.length()];
//	buffer = xmlInput.getBytes();
//	bout.write(buffer);
//	byte[] b = bout.toByteArray();
//	String SOAPAction =
//	"http://litwinconsulting.com/webservices/GetWeather";
//	// Set the appropriate HTTP parameters.
//	httpConn.setRequestProperty("Content-Length",
//	String.valueOf(b.length));
//	httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
//	httpConn.setRequestProperty("SOAPAction", SOAPAction);
//	httpConn.setRequestMethod("POST");
//	httpConn.setDoOutput(true);
//	httpConn.setDoInput(true);
//	OutputStream out = httpConn.getOutputStream();
//	//Write the content of the request to the outputstream of the HTTP Connection.
//	out.write(b);
//	out.close();
//	//Ready with sending the request.
//	 
//	//Read the response.
//	InputStreamReader isr =
//	new InputStreamReader(httpConn.getInputStream());
//	BufferedReader in = new BufferedReader(isr);
//	 
//	//Write the SOAP message response to a String.
//	while ((responseString = in.readLine()) != null) {
//	outputString = outputString + responseString;
//	}
//	//Parse the String output to a org.w3c.dom.Document and be able to reach every node with the org.w3c.dom API.
//	Document document = parseXmlFile(outputString);
//	NodeList nodeLst = document.getElementsByTagName("GetWeatherResult");
//	String weatherResult = nodeLst.item(0).getTextContent();
//	_log.info("Weather: " + weatherResult);
//	 
//	//Write the SOAP message formatted to the console.
//	String formattedSOAPResponse = formatXML(outputString);
//	_log.info(formattedSOAPResponse);
//	return weatherResult;
//	}
}
