/**
 * 
 */
package vn.dtt.gt.dk.validation;


import java.util.List;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.dao.common.model.DmDataItem;
import vn.dtt.gt.dk.nsw.model.StateList;
import vn.dtt.gt.dk.nsw.model.StateList.State;
import vn.dtt.gt.dk.dao.common.model.impl.DmDataItemImpl;
import vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil;

/**
 * @author win_64
 *
 */
public class StateListValidation {

	public static boolean validation(StateList obj, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };
		int[] maLoi2 = { 1, 5, 6 };
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		int[] maLoi5 = { 3, 4 };
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		//StateList
		List<State> lstState = obj.getState();
		//TODO
		status = ValidationUtils.checkValidationListNull(lstState, logMessageValidation, "137", "State", "02", status);
		
		if(lstState != null && lstState.size()>0){
			for(State StateList : lstState){
				status=validationState(StateList, idMessageLog);
				if (status == false)		
				{return status;}
			}
		}
		 
		return status;
	}

	private static boolean validationState(State StateList, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };
		int[] maLoi2 = { 1, 5, 6 };
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		int[] maLoi5 = { 3, 4 };
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		String idMessage = "137";
		//StateCode
		status = ValidationUtils.checkValidation(StateList.getStateCode(), logMessageValidation, idMessage, "StateCode", "04", maLoi2, 2, status);
				
		if (status == true)		
		{
		//Name
		status = ValidationUtils.checkValidation(StateList.getName(), logMessageValidation, idMessage, "Name", "03", maLoi2, 100, status);
		}
		else if (status == false)		
		{return status;}
		
		if (status == true)		
		{
		//Description
		status = ValidationUtils.checkValidation(StateList.getDescription(), logMessageValidation, idMessage, "Description", "05", maLoi4, 200, status);
		}
		else if (status == false)		
		{return status;}
		
		if (status == true)		
		{
		//NameVi
		status = ValidationUtils.checkValidation(StateList.getNameVi(), logMessageValidation, idMessage, "NameVi", "06", maLoi4, 255, status);
		}
		else if (status == false)		
		{return status;}
		
		if (status == true)		
		{
		//Status
		status = ValidationUtils.checkValidationNumber(String.valueOf(StateList.getStatus()), logMessageValidation, idMessage, "Status", "07", maLoi1, 0, 1, 0, false, status);
		}
		else if (status == false)		
		{return status;}
		
		/// Bo sung kiem tra nghiep vu
		
		boolean AllowDelete = false;
		boolean AllowUpdate = false;
		
		List<DmDataItem> listDataitem =  DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevel(4, 0);
		for (DmDataItem obj :listDataitem)
		{
			if (StateList.getStatus() == 2) // Them
			{
				if (StateList.getStateCode().toUpperCase().equals(obj.getCode0().toUpperCase())
						&& (obj.getStatus() == 1) )
				{
					ValidationUtils.logValidation(logMessageValidation, idMessage, 10, "StateCode", "04");
					status = false;
					return status;
				}
				AllowDelete = true;
				AllowUpdate = true;
			}
			else if (StateList.getStatus() == 1) // Sua
			{				
				if (StateList.getStateCode().toUpperCase().equals(obj.getCode0().toUpperCase())
						&& (obj.getStatus() == 0) )
				{
					ValidationUtils.logValidation(logMessageValidation, idMessage, 10, "StateCode", "04");
					status = false;
					return status;
				}
				if (StateList.getStateCode().toUpperCase().equals(obj.getCode0().toUpperCase())
						&& (obj.getStatus() == 1))
				{
					AllowUpdate = true;
					return AllowUpdate;
				}
			}
			else if (StateList.getStatus() == 0) // Danh dau Xoa
			{
				if (StateList.getStateCode().toUpperCase().equals(obj.getCode0().toUpperCase())
						&& (obj.getStatus() == 0) )
				{
					ValidationUtils.logValidation(logMessageValidation, idMessage, 10, "StateCode", "04");
					status = false;
					return status;
				}
				if (StateList.getStateCode().toUpperCase().equals(obj.getCode0().toUpperCase())
						&& (obj.getStatus() == 1))
				{
					AllowDelete = true;
					return AllowDelete;
				}
			}
			
			
		}
		
		if ((AllowDelete == false) && (AllowUpdate == false))
		{
			ValidationUtils.logValidation(logMessageValidation, idMessage, 10, "StateCode", "04");
			status = false;
			return status;
		}
		
		return status;
	}
}

