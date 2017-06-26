package vn.dtt.gt.dk.validation;

import java.util.List;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.nsw.model.ConfirmCertificateCancellation;
import vn.dtt.gt.dk.nsw.model.ConfirmCertificateCancellation.CertificateDetails;
import vn.dtt.gt.dk.utils.format.FormatData;


public class ConfirmCertificateCancellationValidation {

	public static boolean validation(ConfirmCertificateCancellation obj, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };//bat buoc dang so
		int[] maLoi2 = { 1, 5, 6 };//bat buoc dang chu
		int[] maLoi3 = { 1, 7 }; // bat buoc ngay thang
		int[] maLoi4 = { 5, 6 };//dang chu	
		int[] maLoi5 = { 3, 4 };//dang so
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		//Organization
		status = ValidationUtils.checkValidation(obj.getOrganization(), logMessageValidation, "218", "Organization", "03", maLoi2, 255, status);
		
		//Division
		status = ValidationUtils.checkValidation(obj.getDivision(), logMessageValidation, "218", "Division", "04", maLoi2, 255, status);
		
		//ReportBy
		if(obj.getReportBy() != null && obj.getReportBy().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getReportBy(), logMessageValidation, "218", "ReportBy", "05", maLoi4, 100, status);
		}
		
		//ReportDate
		if (obj.getReportDate() != null && !FormatData.isThisDateValid(obj.getReportDate())) {
			status = false;
			logMessageValidation.setTagName("Message : 218" + "__" + "ReportDate");
			logMessageValidation.setValidationCode("N218706");
			logMessageValidation.setDescription(ValidationUtils.MALOI_07);
			ValidationUtils.addLogMessageValidation(logMessageValidation);
		}

		//SignName
		status = ValidationUtils.checkValidation(obj.getSignName(), logMessageValidation, "218", "SignName", "07", maLoi2, 255, status);
		
		//SignTitle
		if(obj.getSignTitle() != null && obj.getSignTitle().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getSignTitle(), logMessageValidation, "218", "SignTitle", "08", maLoi4, 100, status);
		}
		
		//SignPlace
		status = ValidationUtils.checkValidation(obj.getSignPlace(), logMessageValidation, "218", "SignPlace", "09", maLoi2, 50, status);
		
		//SignDate
		status = ValidationUtils.checkValidation(obj.getSignDate(), logMessageValidation, "218", "SignDate", "10", maLoi3, 50, status);
		
		//ReasonForCancellation
		status = ValidationUtils.checkValidation(obj.getReasonForCancellation(), logMessageValidation, "218", "ReasonForCancellation", "11", maLoi3, 500, status);
		
		//TotalofCancellation
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getTotalofCancellation()), logMessageValidation, "218", "TotalofCancellation", "12", maLoi1, 0, 9, 0, false, status);

		//CertificateDetails
				List<CertificateDetails> liCertificateDetails= obj.getCertificateDetails();
				//TODO
				status = ValidationUtils.checkValidationListNull(liCertificateDetails, logMessageValidation, "218", "CertificateDetails", "13", status);
				if(liCertificateDetails != null && liCertificateDetails.size()>0){
					for(CertificateDetails certificateDetails:liCertificateDetails){
						status=validationCertificateDetailsList(certificateDetails, idMessageLog);
					}
				}
				
		
		
		
		return status;
	}

	private static boolean validationCertificateDetailsList(
			CertificateDetails certificateDetails, long idMessageLog) throws Exception {
		
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
		status = ValidationUtils.checkValidation(certificateDetails.getCertificateNumber(),logMessageValidation, "218", "CertificateNumber", "14", maLoi2, 100 ,status);

		return status;
	}
}
