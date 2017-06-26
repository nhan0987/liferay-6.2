package vn.dtt.gt.dk.validation;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.nsw.model.InspectorSign;


public class InspectorSignValidation {

	public static boolean validation(InspectorSign obj, long idMessageLog) throws Exception {
		
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
		status = ValidationUtils.checkValidation(obj.getRegisteredNumber(), logMessageValidation, "200", "RegisteredNumber", "02", maLoi2, 100, status);
				
		//Organization
		status = ValidationUtils.checkValidation(obj.getOrganization(), logMessageValidation, "200", "Organization", "03", maLoi2, 255, status);
		
		//Division
		status = ValidationUtils.checkValidation(obj.getDivision(), logMessageValidation, "200", "Division", "04", maLoi2, 255, status);
		
		//SignName
		status = ValidationUtils.checkValidation(obj.getSignName(), logMessageValidation, "200", "SignName", "05", maLoi2, 255, status);
		
		//SignTitle
		if(obj.getSignTitle() != null && obj.getSignTitle().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getSignTitle(), logMessageValidation, "200", "SignTitle", "06", maLoi4, 100, status);
		}
		
		//SignPlace
		status = ValidationUtils.checkValidation(obj.getSignPlace(), logMessageValidation, "200", "SignPlace", "07", maLoi2, 50, status);
		
		//SignDate
		status = ValidationUtils.checkValidation(obj.getSignDate(), logMessageValidation, "200", "SignDate", "08", maLoi3, 50, status);
		
		
		return status;
	}
}