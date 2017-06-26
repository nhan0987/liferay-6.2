package vn.dtt.gt.dk.validation;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.nsw.model.RequestChanges;


public class RequestChangesValidation {

	public static boolean validation(RequestChanges obj, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };
		int[] maLoi2 = { 1, 5, 6 };
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		int[] maLoi5 = { 3, 4 };
		int[] maLoi6 = { 1, 2, 5, 6 };

		//RequestDate
		status = ValidationUtils.checkValidation(obj.getRequestDate(), logMessageValidation, "04", "RequestDate", "02", maLoi3, 100, status);
				
//		//Organization
//		status = ValidationUtils.checkValidation(obj.getOrganization(), logMessageValidation, "04", "Organization", "03", maLoi2, 255, status);
//		
//		//Division
//		status = ValidationUtils.checkValidation(obj.getDivision(), logMessageValidation, "04", "Division", "04", maLoi2, 255, status);
//		
//		//Name
//		status = ValidationUtils.checkValidation(obj.getName(), logMessageValidation, "04", "Name", "05", maLoi2, 255, status);
		
		//Reason
		status = ValidationUtils.checkValidation(obj.getReason(), logMessageValidation, "04", "Reason", "06", maLoi2, 500, status);
		
		return status;
	}
}