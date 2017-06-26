/**
 * 
 */
package vn.dtt.gt.dk.validation;


import java.util.List;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.nsw.model.Currency;
import vn.dtt.gt.dk.nsw.model.Currency.CurrencyList;




/**
 * @author win_64
 *
 */
public class CurrencyValidation {

	public static boolean validation(Currency obj, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };
		int[] maLoi2 = { 1, 5, 6 };
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		int[] maLoi5 = { 3, 4 };
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		//CurrencyList
		List<CurrencyList> lstCurrencyLists = obj.getCurrencyList();
		//TODO
		status = ValidationUtils.checkValidationListNull(lstCurrencyLists, logMessageValidation, "109", "CurrencyList", "02", status);
		
		if(lstCurrencyLists != null && lstCurrencyLists.size()>0){
			for(CurrencyList currencyList : lstCurrencyLists){
				status=validationCurrencyList(currencyList, idMessageLog);
				if (status == false)		
				{return status;}
			}
		}
		 
		return status;
	}

	private static boolean validationCurrencyList(CurrencyList currencyList, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };
		int[] maLoi2 = { 1, 5, 6 };
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		int[] maLoi5 = { 3, 4 };
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		//CurrencyCode
		status = ValidationUtils.checkValidation(currencyList.getCurrencyCode(), logMessageValidation, "109", "CurrencyCode", "03", maLoi2, 3, status);
		if (status == true)		
		{
		//ChangeRates
		status = ValidationUtils.checkValidationNumber(String.valueOf(currencyList.getChangeRates()), logMessageValidation, "109", "ChangeRates", "04", maLoi1, 1, 9, 2, false, status);
		}
		else if (status == false)		
		{return status;}
		
		if (status == true)		
		{
		//ApplyDate
		status = ValidationUtils.checkValidation(currencyList.getApplyDate(), logMessageValidation, "109", "ApplyDate", "05", maLoi3, 50, status);
		}
		else if (status == false)		
		{return status;}
		
		if (status == true)		
		{
		//ExpiredDate
		status = ValidationUtils.checkValidation(currencyList.getExpiredDate(), logMessageValidation, "109", "ExpiredDate", "06", maLoi3, 50, status);
		} 
		else if (status == false)		
		{return status;}
		
		return status;
	}
}

