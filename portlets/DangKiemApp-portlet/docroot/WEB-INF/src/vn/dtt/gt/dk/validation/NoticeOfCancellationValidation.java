package vn.dtt.gt.dk.validation;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.nsw.model.NoticeOfCancellation;


public class NoticeOfCancellationValidation {

	public static boolean validation(NoticeOfCancellation obj, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };
		int[] maLoi2 = { 1, 5, 6 };
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		int[] maLoi5 = { 3, 4 };
		int[] maLoi6 = { 1, 2, 5, 6 };

		//RegisteredNumber
//		status = ValidationUtils.checkValidation(obj.getRegisteredNumber(), logMessageValidation, "03", "RegisteredNumber", "02", maLoi2, 100, status);
		
		//CancelDate
		status = ValidationUtils.checkValidation(obj.getCancelDate(), logMessageValidation, "03", "CancelDate", "03", maLoi3, 50, status);

		//Organization
		if(obj.getOrganization() != null && obj.getOrganization().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getOrganization(), logMessageValidation, "03", "Organization", "04", maLoi4, 255, status);
		}
		
		//Division
		if(obj.getDivision() != null && obj.getDivision().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getDivision(), logMessageValidation, "03", "Division", "05", maLoi4, 50, status);
		}
		
		//Name
		status = ValidationUtils.checkValidation(obj.getName(), logMessageValidation, "03", "Name", "06", maLoi2, 255, status);
		
		//Reason
		status = ValidationUtils.checkValidation(obj.getReason(), logMessageValidation, "03", "Reason", "07", maLoi2, 255, status);
		
		
		
		return status;
	}
}
