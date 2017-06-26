/**
 * 
 */
package vn.dtt.gt.dk.validation;


import java.util.List;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.dao.common.model.DmDataItem;
import vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil;
import vn.dtt.gt.dk.nsw.model.ProvinceList;
import vn.dtt.gt.dk.nsw.model.ProvinceList.Province;
import vn.dtt.gt.dk.nsw.model.DistrictList;
import vn.dtt.gt.dk.nsw.model.DistrictList.District;
import vn.dtt.gt.dk.dao.common.model.impl.DmDataItemImpl;
import vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil;


/**
 * @author win_64
 *
 */
public class DistrictListValidation {

	public static boolean validation(DistrictList obj, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };
		int[] maLoi2 = { 1, 5, 6 };
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		int[] maLoi5 = { 3, 4 };
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		//DistrictList
		List<District> lstDistrict = obj.getDistrict();
		//TODO
		status = ValidationUtils.checkValidationListNull(lstDistrict, logMessageValidation, "139", "District", "02", status);
		
		if(lstDistrict != null && lstDistrict.size()>0){
			for(District DistrictList : lstDistrict){
				status=validationDistrict(DistrictList, idMessageLog);
				if (status == false)		
				{return status;}
			}
		}
		 
		return status;
	}

	private static boolean validationDistrict(District DistrictList, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };
		int[] maLoi2 = { 1, 5, 6 };
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		int[] maLoi5 = { 3, 4 };
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		String idMessage = "139";
		//DistrictCode
		status = ValidationUtils.checkValidation(DistrictList.getDistrictCode(), logMessageValidation, idMessage, "DistrictCode", "04", maLoi2, 3, status);
		
		if (status == true)		
		{
		//DistrictName
		status = ValidationUtils.checkValidation(DistrictList.getDistrictName(), logMessageValidation, idMessage, "DistrictName", "03", maLoi2, 255, status);
		}
		else if (status == false)		
		{return status;}
		
		if (status == true)		
		{
		//ProvinceCode
		status = ValidationUtils.checkValidation(DistrictList.getProvinceCode(), logMessageValidation, idMessage, "ProvinceCode", "05", maLoi2, 3, status);
		}
		else if (status == false)		
		{return status;}
				
		if (status == true)		
		{
		//PublicLevel
			status = ValidationUtils.checkValidationNumber(String.valueOf(DistrictList.getPublicLevel()), logMessageValidation, idMessage, "PublicLevel", "06", maLoi5, 0, 9, 0, false, status);
		}
		else if (status == false)		
		{return status;}
		
		if (status == true)		
		{
		//Arrange
			status = ValidationUtils.checkValidationNumber(String.valueOf(DistrictList.getArrange()), logMessageValidation, idMessage, "Arrange", "07", maLoi5, 0, 9, 0, false, status);
		}
		else if (status == false)		
		{return status;}
		
		if (status == true)		
		{
		//Status
		status = ValidationUtils.checkValidationNumber(String.valueOf(DistrictList.getStatus()), logMessageValidation, idMessage, "Status", "08", maLoi1, 0, 1, 0, false, status);
		}
		else if (status == false)		
		{return status;}		
		
		/// Bo sung kiem tra nghiep vu
		
		boolean AllowDelete = false;
		boolean AllowUpdate = false;	
		boolean AllowInsert = false;	
		
		List<DmDataItem> listRefDataitem =  DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevel(33, 1);
		if ((DistrictList.getStatus() == 1) || (DistrictList.getStatus() == 2) ) 
		{  // Sua, Them
			for (DmDataItem obj :listRefDataitem)
			{
				if (DistrictList.getProvinceCode().toUpperCase().equals(obj.getCode0().toUpperCase())
						&& (obj.getStatus() == 1) )
				{
					AllowInsert = true;
					
				}
			}
		}		
		
		
		List<DmDataItem> listDataitem =  DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevel(33, 1);
		for (DmDataItem obj :listDataitem)
		{
			if (DistrictList.getStatus() == 2) // Them
			{
				if (DistrictList.getDistrictCode().toUpperCase().equals(obj.getCode0().toUpperCase())
						&& (obj.getStatus() == 1) )
				{
					ValidationUtils.logValidation(logMessageValidation, idMessage, 10, "DistrictCode", "04");
					status = false;
					return status;
				}
				AllowDelete = true;
				AllowUpdate = true;
			}
			else if (DistrictList.getStatus() == 1) // Sua
			{				
				if (DistrictList.getDistrictCode().toUpperCase().equals(obj.getCode0().toUpperCase())
						&& (obj.getStatus() == 0) )
				{
					ValidationUtils.logValidation(logMessageValidation, idMessage, 10, "DistrictCode", "04");
					status = false;
					return status;
				}
				if (DistrictList.getDistrictCode().toUpperCase().equals(obj.getCode0().toUpperCase())
						&& (obj.getStatus() == 1))
				{
					
					AllowUpdate = true;
					return AllowUpdate;
				}
			}
			else if (DistrictList.getStatus() == 0) // Danh dau Xoa
			{
				
				if (DistrictList.getDistrictCode().toUpperCase().equals(obj.getCode0().toUpperCase())
						&& (obj.getStatus() == 0) )
				{
					ValidationUtils.logValidation(logMessageValidation, idMessage, 10, "DistrictCode", "04");
					status = false;
					return status;
				}
				if (DistrictList.getDistrictCode().toUpperCase().equals(obj.getCode0().toUpperCase())
						&& (obj.getStatus() == 1))
				{
					
					AllowDelete = true;
					return AllowDelete;
				}
				AllowInsert = true;
			}
		}
		
		
		if ((AllowDelete == false) && (AllowUpdate == false))
		{
			ValidationUtils.logValidation(logMessageValidation, idMessage, 10, "DistrictCode", "04");
			status = false;
			return status;
		}
		if (AllowInsert == false)
		{
			ValidationUtils.logValidation(logMessageValidation, idMessage, 10, "ProvinceCode", "05");
			status = false;
			return status;
		}
		
		return status;
	}
}

