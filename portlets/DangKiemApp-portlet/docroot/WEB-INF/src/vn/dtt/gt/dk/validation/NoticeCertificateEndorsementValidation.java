/**
 * 
 */
package vn.dtt.gt.dk.validation;

import java.util.List;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.nsw.model.NoticeCertificateEndorsement;
import vn.dtt.gt.dk.nsw.model.NoticeCertificateEndorsement.CertificateDetails;

/**
 * @author win_64
 * 
 */
public class NoticeCertificateEndorsementValidation {

	public static boolean validation(NoticeCertificateEndorsement obj, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;

		int[] maLoi1 = { 1, 3, 4 }; // kieu so n...200 va co bat buoc
		int[] maLoi2 = { 1, 5, 6 }; // kieu chu an...200 va co bat buoc
		int[] maLoi3 = { 1, 7 }; // kieu date co bat buoc
		int[] maLoi4 = { 5, 6 }; // kieu chu
		int[] maLoi5 = { 3, 4 }; // kieu so
		int[] maLoi6 = { 1, 2, 5, 6 };

		// RequestDate
		status = ValidationUtils.checkValidation(obj.getRequestDate(),logMessageValidation, "215", "RequestDate", "02", maLoi3, 50,status);

		// Organization
		if (obj.getOrganization() != null && obj.getOrganization().trim().length() > 0) {
			status = ValidationUtils.checkValidation(obj.getOrganization(),logMessageValidation, "215", "Organization", "03", maLoi4,225, status);
		}

		// Division
		if (obj.getDivision() != null && obj.getDivision().trim().length() > 0) {
			status = ValidationUtils.checkValidation(obj.getDivision(),logMessageValidation, "215", "Division", "04", maLoi4, 255,status);
		}
		
		//Name
		if(obj.getName() != null && obj.getName().trim().length()>0){
			status=ValidationUtils.checkValidation(obj.getName(), logMessageValidation,"215" , "Name", "05", maLoi4, 255, status);
		}
			
		//ReasonForEndorsement
		status = ValidationUtils.checkValidation(obj.getReasonForEndorsement(),logMessageValidation, "215", "ReasonForEndorsement", "06", maLoi2, 500,status);
		
		//TotalOfEndorsement
		status = ValidationUtils.checkValidationNumber(obj.getReasonForEndorsement(),logMessageValidation, "215", "TotalOfEndorsement", "07", maLoi1, 0, 9, 0, false, status);
		
		//CertificateDetails
				List<CertificateDetails> liCertificateDetails= obj.getCertificateDetails();
				//TODO
				status = ValidationUtils.checkValidationListNull(liCertificateDetails, logMessageValidation, "215", "CertificateDetails", "08", status);
				if(liCertificateDetails != null && liCertificateDetails.size()>0){
					for(CertificateDetails certificateDetails:liCertificateDetails){
						status=validationCertificateDetailsList(certificateDetails, idMessageLog);
					}
				}
				
				
				
		return status;
	}
	private static boolean validationCertificateDetailsList(CertificateDetails certificateDetails, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);

		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 }; // kieu so n...200 va co bat buoc
		int[] maLoi2 = { 1, 5, 6 }; // kieu chu an...200 va co bat buoc
		int[] maLoi3 = { 1, 7 }; // kieu date co bat buoc
		int[] maLoi4 = { 5, 6 }; // kieu chu
		int[] maLoi5 = { 3, 4 }; // kieu so
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		//CertificateNumber
		status = ValidationUtils.checkValidation(certificateDetails.getCertificateNumber(),logMessageValidation, "215", "CertificateNumber", "09", maLoi2, 100 ,status);
		
		return status;
	}
}
