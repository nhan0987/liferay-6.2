package vn.dtt.gt.dk.message;

import java.util.Date;

import vn.dtt.gt.dk.utils.format.FormatData;


public class BanTin219 {
	public static String createRequestOfEmissionTesting(Date requestDate, String certificateNumber, String requestStatus) {
		StringBuilder xmlResult = new StringBuilder("");
		xmlResult.append("<InquiryOfCertificateContent>");
		
		
		xmlResult.append("<RequestDate>");
		xmlResult.append(FormatData.parseDateToTring(requestDate));
		xmlResult.append("</RequestDate>");
		
		xmlResult.append("<CertificateNumber>");
		xmlResult.append(certificateNumber);
		xmlResult.append("</CertificateNumber>");
		
		xmlResult.append("<RequestStatus>");
		xmlResult.append(requestStatus);
		xmlResult.append("</RequestStatus>");
		xmlResult.append("</InquiryOfCertificateContent>");
		
		return xmlResult.toString();
	}
	
	public static String createInquiryOfCertificateContent(String requestDate, String certificateNumber, String requestStatus) {
		StringBuilder xmlResult = new StringBuilder("");
		xmlResult.append("<InquiryOfCertificateContent>");
		
		
		xmlResult.append("<RequestDate>");
		xmlResult.append(requestDate);
		xmlResult.append("</RequestDate>");
		
		xmlResult.append("<CertificateNumber>");
		xmlResult.append(certificateNumber);
		xmlResult.append("</CertificateNumber>");
		
		xmlResult.append("<RequestStatus>");
		xmlResult.append(requestStatus);
		xmlResult.append("</RequestStatus>");
		xmlResult.append("</InquiryOfCertificateContent>");
		
		return xmlResult.toString();
	}
	
}
