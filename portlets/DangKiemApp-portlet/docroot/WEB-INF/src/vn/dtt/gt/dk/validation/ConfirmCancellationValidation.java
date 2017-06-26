package vn.dtt.gt.dk.validation;

import java.util.List;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.nsw.model.ConfirmCancellation;
import vn.dtt.gt.dk.nsw.model.ConfirmCancellation.AttachedFile;


public class ConfirmCancellationValidation {

	public static boolean validation(ConfirmCancellation obj, long idMessageLog) throws Exception {
		
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
		status = ValidationUtils.checkValidation(obj.getRegisteredNumber(), logMessageValidation, "24", "RegisteredNumber", "02", maLoi2, 100, status);
		
		//CancelDate
		status = ValidationUtils.checkValidation(obj.getCancelDate(), logMessageValidation, "24", "CancelDate", "03", maLoi3, 50, status);

		//Organization
		status = ValidationUtils.checkValidation(obj.getOrganization(), logMessageValidation, "24", "Organization", "04", maLoi2, 255, status);
		
		//Division
		status = ValidationUtils.checkValidation(obj.getDivision(), logMessageValidation, "24", "Division", "05", maLoi2, 255, status);
		
		//Name
		status = ValidationUtils.checkValidation(obj.getName(), logMessageValidation, "24", "Name", "06", maLoi2, 255, status);
		
		//Reason
		status = ValidationUtils.checkValidation(obj.getReason(), logMessageValidation, "24", "Reason", "07", maLoi2, 255, status);
		
		//AttachedFile
		List<AttachedFile> liAttachedFiles = obj.getAttachedFile();
		
		if(liAttachedFiles!= null && liAttachedFiles.size() > 0){
			for(AttachedFile attachedFile : liAttachedFiles){
				status = validationAttachedFileList(attachedFile, idMessageLog);
			}
		}
		
		return status;
	}
	
	private static boolean validationAttachedFileList(AttachedFile attachedFile, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int [] maLoi2={1,5,6};
		int [] maLoi4={5,6};
		int [] maLoi5={ 3, 4 };
		
		//AttachedTypeCode
		status = ValidationUtils.checkValidation(attachedFile.getAttachedTypeCode(), logMessageValidation, "24", "AttachedTypeCode", "10", maLoi2, 20, status);
		
		//AttachedTypeName
		if(attachedFile.getAttachedTypeName() != null && attachedFile.getAttachedTypeName().trim().length() > 0){
			status = ValidationUtils.checkValidation(attachedFile.getAttachedTypeCode(), logMessageValidation, "24", "AttachedTypeName", "11", maLoi4, 200, status);
		}
		
		//AttachedDocName
		status = ValidationUtils.checkValidation(attachedFile.getAttachedDocName(), logMessageValidation, "24", "AttachedDocName", "12", maLoi2, 200, status);
		
		//AttachedNote
//		status = ValidationUtils.checkValidation(attachedFile.getAttachedNote(), logMessageValidation, "24", "AttachedNote", "13", maLoi2, 100, status);
		
		//AttachedSequenceNo
		if(attachedFile.getAttachedSequenceNo() > 0){
			status = ValidationUtils.checkValidationNumber(String.valueOf(attachedFile.getAttachedSequenceNo()), logMessageValidation, "14", "AttachedSequenceNo", "15", maLoi5, 0, 3, 0, false, status);
		}
		
		//FullFileName
		if(attachedFile.getFullFileName() != null && attachedFile.getFullFileName().trim().length() > 0){
			status = ValidationUtils.checkValidation(attachedFile.getFullFileName(), logMessageValidation, "24", "FullFileName", "15", maLoi4, 100, status);
		}
		
		//SHA1FileContent
		if(attachedFile.getSHA1FileContent() != null && attachedFile.getSHA1FileContent().trim().length() > 0){
			status = ValidationUtils.checkValidation(attachedFile.getSHA1FileContent(), logMessageValidation, "24", "SHA1FileContent", "16", maLoi4, 255, status);
		}
		
		return status;
	}
}
