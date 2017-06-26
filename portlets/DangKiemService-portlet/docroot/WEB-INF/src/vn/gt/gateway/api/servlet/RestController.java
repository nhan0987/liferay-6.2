package vn.gt.gateway.api.servlet;

import java.nio.charset.Charset;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.api.bean.CertificateXCG;
import vn.dtt.gt.dk.api.bean.CertificateXMY;
import vn.dtt.gt.dk.api.util.ApiUtils;
import vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordLocalServiceUtil;

@Controller
public class RestController {
	@RequestMapping(value = "/certificate", method = RequestMethod.GET)
	public ResponseEntity<String> getCertificate(@RequestParam String certificatenumber,
			@RequestParam String vehicleclass) {
		
		String result = "";
		boolean hasError = false;
		String message = "";
		
		try {
			if("xmy".equalsIgnoreCase(vehicleclass)) {
				CertificateXMY certificate = CertificateRecordLocalServiceUtil.
					findCertificateXMY(0, certificatenumber, null);
				
				result = ApiUtils.convertObjectToXml(certificate);
				
			} else if("xcg".equalsIgnoreCase(vehicleclass)) {
				CertificateXCG certificate = CertificateRecordLocalServiceUtil.
					findCertificateXCG(0, certificatenumber, null);
				
				result = ApiUtils.convertObjectToXml(certificate);
			} else {
				message = "vehicleclass is xmy or xcg";
				hasError = true;
			}
		} catch(Exception e) {
			message = "internal error";
			hasError = true;
			_log.error(e);
		}
		
		if(hasError) {
			try {
				vn.dtt.gt.dk.api.bean.Error error = new vn.dtt.gt.dk.api.bean.Error();
				
				error.setMessage(message);
				
				result = ApiUtils.convertObjectToXml(error);
			} catch(Exception e) {
				_log.error(e);
			}
		}
		
		final HttpHeaders httpHeaders= new HttpHeaders();
		httpHeaders.setContentType(new MediaType("application", "xml", Charset.forName("UTF-8")));
		
		return new ResponseEntity<String>(result, httpHeaders, HttpStatus.OK);
	}
	
	private static Log _log = LogFactoryUtil.getLog(RestController.class);
}
