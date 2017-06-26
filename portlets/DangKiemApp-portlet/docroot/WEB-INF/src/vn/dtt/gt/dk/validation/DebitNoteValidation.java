/**
 * 
 */
package vn.dtt.gt.dk.validation;


import java.util.List;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.nsw.Header;
import vn.dtt.gt.dk.nsw.model.DebitNote;
import vn.dtt.gt.dk.nsw.model.DebitNote.OtherCostsSummary;
import vn.dtt.gt.dk.nsw.model.DebitNote.PaymentDetails;
import vn.dtt.gt.dk.utils.format.FormatData;



/**
 * @author win_64
 *
 */
public class DebitNoteValidation {

	public static boolean validation(DebitNote obj, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };
		int[] maLoi2 = { 1, 5, 6 };
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		int[] maLoi5 = { 3, 4 };
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		//DebitNoteNumber
		status = ValidationUtils.checkValidation(obj.getDebitNoteNumber(), logMessageValidation, "209", "DebitNoteNumber", "02", maLoi2, 255, status);
		
		//Organization
		status = ValidationUtils.checkValidation(obj.getOrganization(), logMessageValidation, "209", "Organization", "03", maLoi2, 255, status);
		
		//Division
		status = ValidationUtils.checkValidation(obj.getDivision(), logMessageValidation, "209", "Division", "04", maLoi2, 255, status);
		
		//ReportBy
		status = ValidationUtils.checkValidation(obj.getReportBy(), logMessageValidation, "209", "ReportBy", "05", maLoi2, 255, status);
		
		//ReportDate
		status = ValidationUtils.checkValidation(obj.getReportDate(), logMessageValidation, "209", "ReportDate", "06", maLoi3, 50, status);
		
		//TODO PaymentSummary
		status = ValidationUtils.checkValidationNull(obj.getPaymentSummary(), logMessageValidation, "209", "PaymentSummary", "07", status);
		if(status){
		//FromDate
		if (obj.getPaymentSummary().getFromDate() != null && !FormatData.isThisDateValid(obj.getPaymentSummary().getFromDate())) {
			status = false;
			logMessageValidation.setTagName("Message : 209" + "__" + "FromDate");
			logMessageValidation.setValidationCode("N209708");
			logMessageValidation.setDescription(ValidationUtils.MALOI_07);
			ValidationUtils.addLogMessageValidation(logMessageValidation);
		}
		
		//ToDate
		if (obj.getPaymentSummary().getToDate() != null && !FormatData.isThisDateValid(obj.getPaymentSummary().getToDate())) {
			status = false;
			logMessageValidation.setTagName("Message : 209" + "__" + "ToDate");
			logMessageValidation.setValidationCode("N209709");
			logMessageValidation.setDescription(ValidationUtils.MALOI_07);
			ValidationUtils.addLogMessageValidation(logMessageValidation);
		}
		
		//TotalOfPayment
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getPaymentSummary().getTotalOfPayment()), logMessageValidation, "209", "TotalOfPayment", "10", maLoi1, 0, 20, 0, false, status);
		
		//TotalOfVehicle
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getPaymentSummary().getTotalOfVehicle()), logMessageValidation, "209", "TotalOfVehicle", "11", maLoi1, 0, 9, 0, false, status);
		}
		//PaymentDetails
		List<PaymentDetails> liPaymentDetails = obj.getPaymentDetails();
		//TODO PaymentDetails
		status = ValidationUtils.checkValidationListNull(liPaymentDetails, logMessageValidation, "209", "PaymentDetails", "12", status);
		
		if(liPaymentDetails != null && liPaymentDetails.size()>0){
			for(PaymentDetails paymentDetails : liPaymentDetails){
				status=validationPaymentDetailslist(paymentDetails, idMessageLog);
			}
		}
		
		//TODO ChargesSummary
		status = ValidationUtils.checkValidationNull(obj.getChargesSummary(), logMessageValidation, "209", "ChargesSummary", "33", status);
		if(status){
		//ChargeType
		status = ValidationUtils.checkValidation(obj.getChargesSummary().getChargeType(), logMessageValidation, "209", "ChargeType", "34", maLoi2, 100, status);
		
		//Remarks
		status = ValidationUtils.checkValidation(obj.getChargesSummary().getRemarks(), logMessageValidation, "209", "ChargeType", "35", maLoi2, 255, status);
		
		//Unit
		if(obj.getChargesSummary().getUnit() >= 0){
			status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getChargesSummary().getUnit()), logMessageValidation, "209", "Unit", "36", maLoi5, 0, 9, 0, false, status);
		}
		
		//Price
		if(obj.getChargesSummary().getPrice() >= 0){
			status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getChargesSummary().getPrice()), logMessageValidation, "209", "Price", "37", maLoi5, 0, 20, 0, false, status);
		}
		
		//Total
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getChargesSummary().getTotal()), logMessageValidation, "209", "Total", "38", maLoi1, 0, 20, 0, false, status);
		}
		//OtherCostsSummary
		List<OtherCostsSummary> liOtherCostsSummary = obj.getOtherCostsSummary();
		
		//TODO
		status = ValidationUtils.checkValidationListNull(liOtherCostsSummary, logMessageValidation, "209", "OtherCostsSummary", "39", status);
		
		if(liOtherCostsSummary!= null && liOtherCostsSummary.size()>0){
			for(OtherCostsSummary otherCostsSummary : liOtherCostsSummary){
				status=validationOtherCostsSummarylist(otherCostsSummary, idMessageLog);
			}
		}
		
		return status;
	}

	private static boolean validationOtherCostsSummarylist(OtherCostsSummary otherCostsSummary, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };
		int[] maLoi2 = { 1, 5, 6 };
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		int[] maLoi5 = { 3, 4 };
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		//SequenceNo
		status = ValidationUtils.checkValidationNumber(String.valueOf(otherCostsSummary.getSequenceNo()), logMessageValidation, "209", "SequenceNo", "40", maLoi1, 0, 9, 0, false, status);
		
		//RegisteredNumberRef
		status = ValidationUtils.checkValidation(otherCostsSummary.getRegisteredNumberRef(), logMessageValidation, "209", "RegisteredNumberRef", "41", maLoi2, 100, status);
		
		//Remarks
		status = ValidationUtils.checkValidation(otherCostsSummary.getRemarks(), logMessageValidation, "209", "Remarks", "42", maLoi2, 255, status);
		
		//Amount
		status = ValidationUtils.checkValidationNumber(String.valueOf(otherCostsSummary.getAmount()), logMessageValidation, "209", "Amount", "43", maLoi1, 0, 20, 0, false, status);
		
		return status;
	}

	private static boolean validationPaymentDetailslist(PaymentDetails paymentDetails, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };
		int[] maLoi2 = { 1, 5, 6 };
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		int[] maLoi5 = { 3, 4 };
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		//SequenceNo
		status = ValidationUtils.checkValidationNumber(String.valueOf(paymentDetails.getSequenceNo()), logMessageValidation, "209", "SequenceNo", "13", maLoi1, 0, 9, 0, false, status);
		
		//CodeNumber
		status = ValidationUtils.checkValidationNumber(String.valueOf(paymentDetails.getCodeNumber()), logMessageValidation, "209", "CodeNumber", "14", maLoi1, 0, 9, 0, false, status);
		
		//RegisteredNumber
		status = ValidationUtils.checkValidation(paymentDetails.getRegisteredNumber(), logMessageValidation, "209", "RegisteredNumber", "15", maLoi2, 100, status);
		
		//MarkAsVehicle
		status = ValidationUtils.checkValidationNumber(String.valueOf(paymentDetails.getMarkAsVehicle()), logMessageValidation, "209", "MarkAsVehicle", "16", maLoi1, 0, 1, 0, false, status);
		
		//TradeMark
		status = ValidationUtils.checkValidation(paymentDetails.getTradeMark(), logMessageValidation, "209", "TradeMark", "17", maLoi2, 50, status);
		
		//ModelType
//		status = ValidationUtils.checkValidation(paymentDetails.getModelType(), logMessageValidation, "209", "ModelType", "18", maLoi2, 20, status);
		
		//VehicleType
		if(paymentDetails.getVehicleType() != null && paymentDetails.getVehicleType().trim().length() > 0){
			status = ValidationUtils.checkValidation(paymentDetails.getVehicleType(), logMessageValidation, "209", "VehicleType", "19", maLoi4, 20, status);
		}
		
		//EngineType
		if(paymentDetails.getEngineType() != null && paymentDetails.getEngineType().trim().length() > 0){
			status = ValidationUtils.checkValidation(paymentDetails.getEngineType(), logMessageValidation, "209", "VehicleType", "20", maLoi4, 20, status);
		}
		
		//ProductionYear
//		status = ValidationUtils.checkValidationNumber(String.valueOf(paymentDetails.getProductionYear()), logMessageValidation, "209", "ProductionYear", "21", maLoi1, 0, 9, 0, false, status);
		
		//ChassisNumber
		status = ValidationUtils.checkValidation(paymentDetails.getChassisNumber(), logMessageValidation, "209", "ChassisNumber", "22", maLoi2, 50, status);
		
		//EngineNumber
		if(paymentDetails.getEngineNumber() != null && paymentDetails.getEngineNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(paymentDetails.getEngineNumber(), logMessageValidation, "209", "VehicleType", "23", maLoi4, 50, status);
		}
		
		//VehicleEngineStatus
		status = ValidationUtils.checkValidationNumber(String.valueOf(paymentDetails.getVehicleEngineStatus()), logMessageValidation, "209", "VehicleEngineStatus", "24", maLoi1, 0, 1, 0, false, status);
		
		//DeclarationPrice
		status = ValidationUtils.checkValidationNumber(String.valueOf(paymentDetails.getDeclarationPrice()), logMessageValidation, "209", "DeclarationPrice", "25", maLoi1, 1, 20, 3, false, status);
		
		//CurrencyCode
		status = ValidationUtils.checkValidation(paymentDetails.getCurrencyCode(), logMessageValidation, "209", "CurrencyCode", "26", maLoi2, 3, status);
		
		//UnitPrice
		status = ValidationUtils.checkValidationNumber(String.valueOf(paymentDetails.getUnitPrice()), logMessageValidation, "209", "UnitPrice", "27", maLoi1, 0, 20, 0, false, status);
		
		//TotalPrice
		status = ValidationUtils.checkValidationNumber(String.valueOf(paymentDetails.getTotalPrice()), logMessageValidation, "209", "TotalPrice", "28", maLoi1, 0, 20, 0, false, status);
		
		//TotalDebit
		status = ValidationUtils.checkValidationNumber(String.valueOf(paymentDetails.getTotalDebit()), logMessageValidation, "209", "TotalDebit", "29", maLoi1, 0, 20, 0, false, status);
		
		//PaymentDeadline
		if (paymentDetails.getPaymentDeadline() != null && !FormatData.isThisDateValid(paymentDetails.getPaymentDeadline())) {
			status = false;
			logMessageValidation.setTagName("Message : 209" + "__" + "PaymentDeadline");
			logMessageValidation.setValidationCode("N209730");
			logMessageValidation.setDescription(ValidationUtils.MALOI_07);
			ValidationUtils.addLogMessageValidation(logMessageValidation);
		}
		
		//Charges
		status = ValidationUtils.checkValidationNumber(String.valueOf(paymentDetails.getCharges()), logMessageValidation, "209", "Charges", "31", maLoi1, 0, 20, 0, false, status);
		
		//OtherCosts
		status = ValidationUtils.checkValidationNumber(String.valueOf(paymentDetails.getOtherCosts()), logMessageValidation, "209", "OtherCosts", "32", maLoi1, 0, 20, 0, false, status);
		
		
		
		
		return status;
	}
}