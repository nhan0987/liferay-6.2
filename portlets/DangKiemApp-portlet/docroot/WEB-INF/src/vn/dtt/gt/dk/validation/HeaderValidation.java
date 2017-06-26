
package vn.dtt.gt.dk.validation;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.nsw.Header;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class HeaderValidation {
	
	Log _log = LogFactoryUtil.getLog(HeaderValidation.class);
	
	public boolean validation(Header header, long idMessageLog, String requestDirection)
		throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		
		int[] maLoi1 = { 1, 3, 4 };
		int[] maLoi2 = { 1, 5, 6 };
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		int[] maLoi5 = { 3, 4 };
		int[] maLoi6 = { 1, 2, 5, 6 };
		//Reference
		//version
		if (header.getReference().getVersion() != null) {
			status =
				ValidationUtils.checkValidation(
					header.getReference().getVersion().trim(), logMessageValidation, "00", "Version", "04", maLoi4, 50, status);
		}
		//messageId
		if (header.getReference().getMessageId() != null) {
			status =
				ValidationUtils.checkValidation(
					header.getReference().getMessageId().trim(), logMessageValidation, "00", "MessageId", "05", maLoi4, 35, status);
		}
		//From
		//name
		if (header.getFrom() == null || header.getFrom().getName() == null) {
			status = false;
		} else {
			status =
				ValidationUtils.checkValidation(
					header.getFrom().getName().trim(), logMessageValidation, "00", "Name", "07", maLoi2, 255, status);
		}
		
		//identity
		if (header.getFrom() == null || header.getFrom().getIdentity() == null) {
			status = false;
		} else if (header.getFrom().getIdentity() != null) {
			status =
				ValidationUtils.checkValidation(
					header.getFrom().getIdentity().trim(), logMessageValidation, "00", "Identity", "08", maLoi4, 13,
					status);
		}
		
		//countryCode
		if (header.getFrom() == null || header.getFrom().getCountryCode() == null) {
			status = false;
		} else {
			status =
				ValidationUtils.checkValidation(
					header.getFrom().getCountryCode().trim(), logMessageValidation, "00", "CountryCode", "09", maLoi2,
					2, status);
		}
		
		//ministryCode
		if (header.getFrom() == null || header.getFrom().getMinistryCode() == null) {
			status = false;
		} else {
			status =
				ValidationUtils.checkValidation(
					header.getFrom().getMinistryCode().trim(), logMessageValidation, "00", "MinistryCode", "10",
					maLoi2, 20, status);
		}
		
		//organizationCode
		if (header.getFrom() == null || header.getFrom().getOrganizationCode() == null) {
			status = false;
		} else {
			status =
				ValidationUtils.checkValidation(
					header.getFrom().getOrganizationCode().trim(), logMessageValidation, "00", "OrganizationCode",
					"11", maLoi2, 20, status);
		}
		
		//unitCode
		if (header.getFrom() == null || header.getFrom().getUnitCode() == null) {
			status = false;
		} else if (header.getFrom().getIdentity() != null) {
			status =
				ValidationUtils.checkValidation(
					header.getFrom().getUnitCode().trim(), logMessageValidation, "00", "UnitCode", "12", maLoi4, 20,
					status);
		}
		
		//To
		//name
		status =
			ValidationUtils.checkValidation(
				header.getTo().getName().trim(), logMessageValidation, "00", "Name", "14", maLoi2, 255, status);
		
		//identity
		if (header.getTo() == null || header.getTo().getIdentity() == null) {
			status = false;
		} else if (header.getTo().getIdentity() != null) {
			status =
				ValidationUtils.checkValidation(
					header.getTo().getIdentity().trim(), logMessageValidation, "00", "Identity", "15", maLoi4, 13,
					status);
		}
		//countryCode
		if (header.getTo() == null || header.getTo().getCountryCode() == null) {
			status = false;
		} else {
			status =
				ValidationUtils.checkValidation(
					header.getTo().getCountryCode().trim(), logMessageValidation, "00", "CountryCode", "16", maLoi2, 2,
					status);
		}
		
		//ministryCode
		if (header.getTo() == null || header.getTo().getMinistryCode() == null) {
			status = false;
		} else {
			status =
				ValidationUtils.checkValidation(
					header.getTo().getMinistryCode().trim(), logMessageValidation, "00", "MinistryCode", "17", maLoi2,
					20, status);
		}
		
		//organizationCode
		if (header.getTo() == null || header.getTo().getOrganizationCode() == null) {
			status = false;
		} else {
			status =
				ValidationUtils.checkValidation(
					header.getTo().getOrganizationCode().trim(), logMessageValidation, "00", "OrganizationCode", "18",
					maLoi2, 20, status);
		}
		
		//unitCode
		if (header.getTo() == null || header.getTo().getUnitCode() == null) {
			status = false;
		} else if (header.getTo().getIdentity() != null) {
			status =
				ValidationUtils.checkValidation(
					header.getTo().getUnitCode().trim(), logMessageValidation, "00", "UnitCode", "19", maLoi4, 20,
					status);
		}
		//Subject
		//documentType
		if (header.getSubject() == null || header.getSubject().getDocumentType() == null) {
			status = false;
		} else if (header.getSubject().getDocumentType() != null) {
			status =ValidationUtils.checkValidation(header.getSubject().getDocumentType().trim(), logMessageValidation, "00", "DocumentType", "21", maLoi2, 100, status);
		}
		
		//type 
		if (header.getSubject() == null || header.getSubject().getType() > 0) {
			status = false;
		} else if (header.getSubject().getType() > 0){
			status =ValidationUtils.checkValidationNumber(String.valueOf(header.getSubject().getType()), logMessageValidation, "00", "type", "22", maLoi1, 0, 3, 0, true, status);
		}
		
		//function
		if (header.getSubject() == null || header.getSubject().getFunction() == null) {
			status = false;
		} else {
			status =
				ValidationUtils.checkValidation(
					header.getSubject().getFunction().trim(), logMessageValidation, "00", "Function", "23", maLoi2, 3,
					status);
		}
		//reference
		if (header.getSubject() == null || header.getSubject().getPreReference() > 0) {
			status = false;
		} else if (header.getSubject().getPreReference() > 0){
			status =ValidationUtils.checkValidationNumber(String.valueOf(header.getSubject().getType()), logMessageValidation, "00", "reference", "24", maLoi1, 0, 9, 0, false, status);
		}
					
		
		
		//preReference
		if (header.getSubject() == null || header.getSubject().getPreReference() > 0) {
			status = false;
		} else if (header.getSubject().getPreReference() > 0){
			status =ValidationUtils.checkValidationNumber(String.valueOf(header.getSubject().getPreReference()), logMessageValidation, "00", "preReference", "25", maLoi1, 0, 9, 0, false, status);
		}
		
		//documentYear
		if (header.getSubject() == null || header.getSubject().getDocumentYear() > 0) {
			status = false;
		} else if (header.getSubject().getDocumentYear() > 0){
			status =ValidationUtils.checkValidationNumber(String.valueOf(header.getSubject().getDocumentYear()), logMessageValidation, "00", "documentYear", "26", maLoi1, 0, 4, 0, true, status);
		}
		
		//sendDate
		if (header.getSubject() == null || header.getSubject().getSendDate() == null) {
			status = false;
		} else if (header.getSubject().getSendDate() == null){
			status =ValidationUtils.checkValidation(header.getSubject().getSendDate().trim(), logMessageValidation, "00", "sendDate", "27", maLoi3, 50, status);
		}
		
		return status;
	}
}
