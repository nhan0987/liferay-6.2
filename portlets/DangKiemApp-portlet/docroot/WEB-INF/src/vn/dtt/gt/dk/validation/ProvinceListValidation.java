/**
 * 
 */
package vn.dtt.gt.dk.validation;


import java.util.List;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.nsw.model.ProvinceList;
import vn.dtt.gt.dk.nsw.model.ProvinceList.Province;
import vn.dtt.gt.dk.dao.common.model.DmDataItem;
import vn.dtt.gt.dk.dao.common.model.impl.DmDataItemImpl;
import vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil;

/**
 * @author win_64
 *
 */
public class ProvinceListValidation {

	public static boolean validation(ProvinceList obj, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };
		int[] maLoi2 = { 1, 5, 6 };
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		int[] maLoi5 = { 3, 4 };
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		//ProvinceList
		List<Province> lstProvince = obj.getProvince();
		//TODO
		status = ValidationUtils.checkValidationListNull(lstProvince, logMessageValidation, "138", "Province", "02", status);
		
		if(lstProvince != null && lstProvince.size()>0){
			for(Province ProvinceList : lstProvince){
				status=validationProvince(ProvinceList, idMessageLog);
				if (status == false)		
				{return status;}
			}
		}
		 
		return status;
	}

	private static boolean validationProvince(Province ProvinceList, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };
		int[] maLoi2 = { 1, 5, 6 };
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		int[] maLoi5 = { 3, 4 };
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		String idMessage = "138";
		//ProvinceCode
		status = ValidationUtils.checkValidation(ProvinceList.getProvinceCode(), logMessageValidation, idMessage, "ProvinceCode", "04", maLoi2, 3, status);
		
		if (status == true)		
		{
		//ProvinceName
		status = ValidationUtils.checkValidation(ProvinceList.getProvinceName(), logMessageValidation, idMessage, "ProvinceName", "03", maLoi2, 255, status);
		}
		else if (status == false)		
		{return status;}
		
		if (status == true)		
		{
		//ParentProvinceCode
		status = ValidationUtils.checkValidation(ProvinceList.getParentProvinceCode(), logMessageValidation, idMessage, "ParentProvinceCode", "05", maLoi4, 3, status);
		}
		else if (status == false)		
		{return status;}
				
		if (status == true)		
		{
		//PublicLevel
			status = ValidationUtils.checkValidationNumber(String.valueOf(ProvinceList.getPublicLevel()), logMessageValidation, idMessage, "PublicLevel", "06", maLoi5, 0, 9, 0, false, status);
		}
		else if (status == false)		
		{return status;}
		
		if (status == true)		
		{
		//Arrange
			status = ValidationUtils.checkValidationNumber(String.valueOf(ProvinceList.getArrange()), logMessageValidation, idMessage, "Arrange", "07", maLoi5, 0, 9, 0, false, status);
		}
		else if (status == false)		
		{return status;}
		
		if (status == true)		
		{
		//Status
		status = ValidationUtils.checkValidationNumber(String.valueOf(ProvinceList.getStatus()), logMessageValidation, idMessage, "Status", "08", maLoi1, 0, 1, 0, false, status);
		}
		else if (status == false)		
		{return status;}		
		
		/// Bo sung kiem tra nghiep vu
		
		boolean AllowDelete = false;
		boolean AllowUpdate = false;	
		
		
		List<DmDataItem> listRefDataitem =  DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevel(33, 2);
		if (ProvinceList.getStatus() == 0)
		{  // Xoa
			for (DmDataItem obj :listRefDataitem)
			{
				if (ProvinceList.getProvinceCode().toUpperCase().equals(obj.getAlterName().toUpperCase())
						&& (obj.getStatus() == 1) )
				{
					ValidationUtils.logValidation(logMessageValidation, idMessage, 10, "ProvinceCode", "04");
					AllowDelete = false;
					return AllowDelete;
				}
			}
		}		
		
		
		List<DmDataItem> listDataitem =  DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevel(33, 1);
		for (DmDataItem obj :listDataitem)
		{
			if (ProvinceList.getStatus() == 2) // Them
			{
				if (ProvinceList.getProvinceCode().toUpperCase().equals(obj.getCode0().toUpperCase())
						&& (obj.getStatus() == 1) )
				{
					ValidationUtils.logValidation(logMessageValidation, idMessage, 10, "ProvinceCode", "04");
					status = false;
					return status;
				}
				AllowDelete = true;
				AllowUpdate = true;
			}
			else if (ProvinceList.getStatus() == 1) // Sua
			{				
				if (ProvinceList.getProvinceCode().toUpperCase().equals(obj.getCode0().toUpperCase())
						&& (obj.getStatus() == 0) )
				{
					ValidationUtils.logValidation(logMessageValidation, idMessage, 10, "ProvinceCode", "04");
					status = false;
					return status;
				}
				if (ProvinceList.getProvinceCode().toUpperCase().equals(obj.getCode0().toUpperCase())
						&& (obj.getStatus() == 1))
				{
					AllowUpdate = true;
					return AllowUpdate;
				}
			}
			else if (ProvinceList.getStatus() == 0) // Danh dau Xoa
			{
				if (ProvinceList.getProvinceCode().toUpperCase().equals(obj.getCode0().toUpperCase())
						&& (obj.getStatus() == 0) )
				{
					ValidationUtils.logValidation(logMessageValidation, idMessage, 10, "ProvinceCode", "04");
					status = false;
					return status;
				}
				if (ProvinceList.getProvinceCode().toUpperCase().equals(obj.getCode0().toUpperCase())
						&& (obj.getStatus() == 1))
				{
					AllowDelete = true;
					return AllowDelete;
				}
			}
		}
		
		
		if ((AllowDelete == false) && (AllowUpdate == false))
		{
			ValidationUtils.logValidation(logMessageValidation, idMessage, 10, "ProvinceCode", "04");
			status = false;
			return status;
		}
		
		return status;
	}
}

