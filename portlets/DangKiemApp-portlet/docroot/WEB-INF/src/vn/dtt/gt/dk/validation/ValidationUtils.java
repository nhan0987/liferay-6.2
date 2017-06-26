/**
 * 
 */
package vn.dtt.gt.dk.validation;

import java.util.Enumeration;
import java.util.List;

import javax.portlet.ActionRequest;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.service.AswmsgValidationLogLocalServiceUtil;
import vn.dtt.gt.dk.utils.config.DKConfigurationManager;
import vn.dtt.gt.dk.utils.format.FormatData;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;

/**
 * @author win_64
 * 
 */
public class ValidationUtils {

	// Chua co gia tri. Bat buoc phai nap
	public static String MALOI_01 = DKConfigurationManager.getStrProp("vn.gt.dk.logMessageValidation.N001",
			"vn.gt.dk.logMessageValidation.N001");

	// Du lieu thuoc dang danh muc
	public static String MALOI_02 = DKConfigurationManager.getStrProp("vn.gt.dk.logMessageValidation.N002",
			"vn.gt.dk.logMessageValidation.N002");

	// Du lieu thuoc dang so
	public static String MALOI_03 = DKConfigurationManager.getStrProp("vn.gt.dk.logMessageValidation.N003",
			"vn.gt.dk.logMessageValidation.N003");
	public static String MALOI_04 = DKConfigurationManager.getStrProp("vn.gt.dk.logMessageValidation.N004",
			"vn.gt.dk.logMessageValidation.N004");

	// Du lieu thuoc dang chu
	public static String MALOI_05 = DKConfigurationManager.getStrProp("vn.gt.dk.logMessageValidation.N005",
			"vn.gt.dk.logMessageValidation.N005");
	public static String MALOI_06 = DKConfigurationManager.getStrProp("vn.gt.dk.logMessageValidation.N006",
			"vn.gt.dk.logMessageValidation.N006");

	// Du lieu dang ngay thang
	public static String MALOI_07 = DKConfigurationManager.getStrProp("vn.gt.dk.logMessageValidation.N007",
			"vn.gt.dk.logMessageValidation.N007");

	// Du lieu dang email
	public static String MALOI_08 = DKConfigurationManager.getStrProp("vn.gt.dk.logMessageValidation.N008",
			"vn.gt.dk.logMessageValidation.N008");
	
	// Rang buoc Du lieu danh muc xung dot
	public static String MALOI_10 = DKConfigurationManager.getStrProp("vn.gt.dk.logMessageValidation.N010",
			"vn.gt.dk.logMessageValidation.N010");

	// public static int DM_UNIT_GENERAL = 1;//Don vi tinh
	// public static int DM_SHIP_AGENCY = 2;
	// public static int DM_PORT_REGION = 3;
	// public static int DM_PORT_WHARF = 4;
	// public static int DM_DOC_TYPE = 5;
	// public static int DM_PASSPORT_TYPE = 6;
	// public static int DM_SECURITY_LEVEL = 7;
	// public static int DM_SHIP_TYPE = 8;
	// public static int DM_PORT = 9;
	// public static int DM_ARRIVAL_PURPOSE = 10;
	// public static int DM_STATE = 11;//danh muc quoc gia
	// public static int DM_GOODS_TYPE = 12;//danh muc loai hang hoa
	// public static int DM_RANK_RATING = 13;
	// public static int DM_GOODS = 14;//danh muc hang haa
	// public static int DM_PACKAGE = 15;
	// public static int DM_MARITIME = 16;// cang? vu,
	// public static int DM_POST_HARBOUR = 17;

	public static void logValidation(AswmsgValidationLog logMess, String id, int maLoi, String nameColumn,
			String idColumn) throws SystemException {

		switch (maLoi) {
		case 1:
			logMess.setTagName("Message : " + id + "__" + nameColumn);
			logMess.setValidationCode(id + "1" + idColumn);
			logMess.setDescription(MALOI_01);
			addLogMessageValidation(logMess);
			break;
		case 2:
			logMess.setTagName("Message : " + id + "__" + nameColumn);
			logMess.setValidationCode(id + "2" + idColumn);
			logMess.setDescription(MALOI_02);
			addLogMessageValidation(logMess);
			break;
		case 3:
			logMess.setTagName("Message : " + id + "__" + nameColumn);
			logMess.setValidationCode(id + "3" + idColumn);
			logMess.setDescription(MALOI_03);
			addLogMessageValidation(logMess);
			break;
		case 4:
			logMess.setTagName("Message : " + id + "__" + nameColumn);
			logMess.setValidationCode(id + "4" + idColumn);
			logMess.setDescription(MALOI_04);
			addLogMessageValidation(logMess);
			break;
		case 5:
			logMess.setTagName("Message : " + id + "__" + nameColumn);
			logMess.setValidationCode(id + "5" + idColumn);
			logMess.setDescription(MALOI_05);
			addLogMessageValidation(logMess);
			break;
		case 6:
			logMess.setTagName("Message : " + id + "__" + nameColumn);
			logMess.setValidationCode(id + "6" + idColumn);
			logMess.setDescription(MALOI_06);
			addLogMessageValidation(logMess);
			break;
		case 7:
			logMess.setTagName("Message : " + id + "__" + nameColumn);
			logMess.setValidationCode(id + "7" + idColumn);
			logMess.setDescription(MALOI_07);
			addLogMessageValidation(logMess);
			break;
		case 8:
			logMess.setTagName("Message : " + id + "__" + nameColumn);
			logMess.setValidationCode(id + "8" + idColumn);
			logMess.setDescription(MALOI_08);
			addLogMessageValidation(logMess);
			break;
		case 10:
			logMess.setTagName("Message : " + id + "__" + nameColumn);
			logMess.setValidationCode(id + "10" + idColumn);
			logMess.setDescription(MALOI_10);
			addLogMessageValidation(logMess);
			break;
		default:
			break;
		}
	}

	/**
	 * kiem tra dieu kien dung chung
	 * */

	public static boolean checkValidationNull(Object validation, AswmsgValidationLog logMess, String id,
			String nameColumn, String idColumn, boolean inputCheck)  {
		if(!inputCheck){
			return inputCheck;
		}
		boolean status = inputCheck;
		if (validation == null) {
			_log.info("----checkValidationNull  "+validation);
			status = false;
			try{
			logValidation(logMess, id, 1, nameColumn, idColumn);
			}catch (Exception e) {
				_log.error(e);
			}
		}
		return status;
	}
	
	public static <T> boolean checkValidationListNull(List<T> validation, AswmsgValidationLog logMess, String id,
			String nameColumn, String idColumn, boolean inputCheck)  {
		if(!inputCheck){
			return inputCheck;
		}
		boolean status = inputCheck;
		if(validation != null && validation.size() > 0){
			_log.info("----checkValidationListNull  "+validation);
			status = true;
		} else {
			status = false;
			try{
			logValidation(logMess, id, 1, nameColumn, idColumn);
			}catch (Exception e) {
				_log.error(e);
			}
		}
		return status;
	}

	public static boolean checkValidation(String validation, AswmsgValidationLog logMess, String id, String nameColumn,
			String idColumn, int[] maLois, int lengthData, boolean inputCheck) throws SystemException {
		if(!inputCheck){
			return inputCheck;
		}
		boolean isBreak = false;
		boolean status = true;
		for (int maLoi : maLois) {
			switch (maLoi) {
			case 1:
				// Chua co gia tri. Bat buoc phai nap
				if (validation == null) {
					status = false;
					isBreak = true;
					logValidation(logMess, id, maLoi, nameColumn, idColumn);
				}
				break;
			case 2:
				// Du lieu thuoc dang danh muc:
				break;
			case 3:
				// Dinh dang so khong hop le
				break;
			case 4:
				// Gia tri so khong hop le (vuot qua gioi han min, max,
				// overflow)
				break;
			case 5:
				// Gia tri vuot qua do dai cho phep
				if (!ActionUtils.checkLength(validation, lengthData)) {
					status = false;
					isBreak = true;
					logValidation(logMess, id, maLoi, nameColumn, idColumn);
				}
				break;
			case 6:
				// Gia tri co ky tu dac biet
				if (!ActionUtils.checkIfIsAValidSpecialCharacters(validation)) {
					status = false;
					isBreak = true;
					logValidation(logMess, id, maLoi, nameColumn, idColumn);
				}
				break;
			case 7:
				// Kiem tra ngay thang
				if (!FormatData.isThisDateValid(validation)) {
					status = false;
					isBreak = true;
					logValidation(logMess, id, maLoi, nameColumn, idColumn);
				}
				break;
			case 8:
				// Kiem tra dinh dang email
				if (!ActionUtils.checkIfIsAValidEmail(validation)) {
					status = false;
					isBreak = true;
					logValidation(logMess, id, maLoi, nameColumn, idColumn);
				}
				break;
			default:
				break;
			}
			if (isBreak == true) {
				break;
			}
		}
		return status;
	}

	/**
	 * DataType = 0 la so Interger, DataType = 1 la so Double
	 * 
	 * before la dinh so phan truoc dau phay ? after la dinh so phan sau dau
	 * phay ? isFixLength = true thi so truyen vao co do dai dung bang length
	 * */
	public static boolean checkValidationNumber(String validation, AswmsgValidationLog logMess, String id,
			String nameColumn, String idColumn, int[] maLois, int dataType, int before, int after, boolean isFixLength,
			boolean inputCheck) throws SystemException {
		if(!inputCheck){
			return inputCheck;
		}
		
		boolean isBreak = false;
		boolean status = inputCheck;
		for (int maLoi : maLois) {
			switch (maLoi) {
			case 1:
				// Chua co gia tri. Bat buoc phai nap
				if (validation == null) {
					logValidation(logMess, id, maLoi, nameColumn, idColumn);
					isBreak = true;
					status = false;
				}
				break;
			case 3:
				// Dinh dang so khong hop le
				if (dataType == 0) {
					if (!ActionUtils.checkIfIsLong(validation)) {
						logValidation(logMess, id, maLoi, nameColumn, idColumn);
						isBreak = true;
						status = false;
					}
				} else if (dataType == 1) {
					if (!ActionUtils.checkIfIsDouble(validation)) {
						logValidation(logMess, id, maLoi, nameColumn, idColumn);
						isBreak = true;
						status = false;
					}
				}
				break;
			case 4:
				// Gia tri so khong hop le (vuot qua gioi han min, max,
				// overflow)
				if (dataType == 0) {
					if (!ActionUtils.checkFormatInterger(validation, before, isFixLength)) {
						logValidation(logMess, id, maLoi, nameColumn, idColumn);
						isBreak = true;
						status = false;
					} else if (!ActionUtils.checkFormatDouble(validation, before, after)) {
						logValidation(logMess, id, maLoi, nameColumn, idColumn);
						isBreak = true;
						status = false;
					}
				}
				break;

			default:
				break;
			}
			if (isBreak == true) {
				break;
			}
		}
		return status;
	}

	/**
	 * Dieu kien kiem tra danh muc trong Database lengthData : do dai validation
	 * kiem tra chuoi truyen vao typeDanhMuc (dataType - in): kieu danh muc, xem
	 * trong file ValidationUtils.java
	 * */
	// public static boolean checkValidationDanhMuc(String validation,
	// AswmsgValidationLog logMess, String id,
	// String nameColumn, String idColumn, int[] maLois, int lengthData, int
	// typeDanhMuc, boolean inputCheck) throws SystemException {
	//
	// boolean isBreak = false;
	// boolean status = inputCheck;
	// for (int maLoi : maLois) {
	// switch (maLoi) {
	// case 1:
	// //Chua co gia tri. Bat buoc phai nap
	// if (validation == null) {
	// logValidation(logMess, id, maLoi, nameColumn, idColumn);
	// isBreak = true;
	// status = false;
	// }
	// break;
	// case 2:
	// //Du lieu thuoc dang danh muc
	// switch (typeDanhMuc) {
	// case 1:
	// //don vi tinh, asw.dm_unit_general, DM_UNIT_GENERAL
	// if (DmUnitGeneralLocalServiceUtil.getByUnitCode(validation) == null) {
	// isBreak = true;
	// status = false;
	// logValidation(logMess, id, maLoi, nameColumn, idColumn);
	// }
	// break;
	// case 2:
	// //hang~ tau, DmShipAgencyLocalServiceUtil
	// if (DmShipAgencyLocalServiceUtil.getByShipAgencyCode(validation) == null)
	// {
	// isBreak = true;
	// status = false;
	// logValidation(logMess, id, maLoi, nameColumn, idColumn);
	// }
	// break;
	// case 3:
	// //khu vuc cang, DmPortRegionLocalServiceUtil
	// if (DmPortRegionLocalServiceUtil.getByPortRegionCode(validation) == null)
	// {
	// isBreak = true;
	// status = false;
	// logValidation(logMess, id, maLoi, nameColumn, idColumn);
	// }
	// break;
	// case 4:
	// //cau cang, dia diem neo dau, DmPortWharfLocalServiceUtil
	// if (DmPortWharfLocalServiceUtil.getByPortWharfCode(validation) == null) {
	// isBreak = true;
	// status = false;
	// logValidation(logMess, id, maLoi, nameColumn, idColumn);
	// }
	// break;
	// case 5:
	// //loai ho so, asw.dm_doc_type, DM_DOC_TYPE
	// if (DmDocTypeLocalServiceUtil.getByDocumentTypeCode(validation) == null)
	// {
	// isBreak = true;
	// status = false;
	// logValidation(logMess, id, maLoi, nameColumn, idColumn);
	// }
	// break;
	// case 6:
	// //loai ho chieu, asw.dm_passport_type, DM_PASSPORT_TYPE
	// if (DmPassportTypeLocalServiceUtil.getByPassportTypeCode(validation) ==
	// null) {
	// isBreak = true;
	// status = false;
	// logValidation(logMess, id, maLoi, nameColumn, idColumn);
	// }
	// break;
	// case 7:
	// //----------------cap do an ninh, DM_SECURITY_LEVEL
	// if (DmSecurityLevelLocalServiceUtil.getBySecurityLevelCode(validation) ==
	// null) {
	// isBreak = true;
	// status = false;
	// logValidation(logMess, id, maLoi, nameColumn, idColumn);
	// }
	// break;
	// case 8:
	// //loai tau, asw.dm_ship_type, DmShipTypeLocalServiceUtil
	// if (DmShipTypeLocalServiceUtil.getByShipTypeCode(validation) == null) {
	// isBreak = true;
	// status = false;
	// logValidation(logMess, id, maLoi, nameColumn, idColumn);
	// }
	// break;
	// case 9:
	// //cang ? DmPortLocalServiceUtil
	// if (DmPortLocalServiceUtil.getByPortCode(validation) == null) {
	// isBreak = true;
	// status = false;
	// logValidation(logMess, id, maLoi, nameColumn, idColumn);
	// }
	// break;
	// case 10:
	// //muc dich den cang ?, asw.dm_arrival_purpose,
	// DmArrivalPurposeLocalServiceUtil
	// if (DmArrivalPurposeLocalServiceUtil.getByPortCode(validation) == null) {
	// isBreak = true;
	// status = false;
	// logValidation(logMess, id, maLoi, nameColumn, idColumn);
	// }
	// break;
	// case 11:
	// //quoc ki, asw.dm_state, DmStateLocalServiceUtil
	// if (DmStateLocalServiceUtil.getByStateCode(validation) == null) {
	// isBreak = true;
	// status = false;
	// logValidation(logMess, id, maLoi, nameColumn, idColumn);
	// }
	// break;
	// case 12:
	// //BAng danh muc loai hang hoa, asw.dm_goods_type, DM_GOODS_TYPE
	// if (DmGoodsTypeLocalServiceUtil.getByGoodsTypeCode(validation) == null) {
	// isBreak = true;
	// status = false;
	// logValidation(logMess, id, maLoi, nameColumn, idColumn);
	// }
	// break;
	// case 13:
	// //danh muc chuc danh thuyen vien, RankCode, DM_RANK_RATING
	// if (DmRankRatingLocalServiceUtil.getByRankCode(validation) == null) {
	// isBreak = true;
	// status = false;
	// logValidation(logMess, id, maLoi, nameColumn, idColumn);
	// }
	// break;
	// case 14:
	// //------------------hang hoa, khong co, Mã UN/GDS,DM_GOODS
	// if (DmGoodsLocalServiceUtil.getByGoodsItemCode(validation) == null) {
	// isBreak = true;
	// status = false;
	// logValidation(logMess, id, maLoi, nameColumn, idColumn);
	// }
	// break;
	// case 15:
	// //---------------danh muc loai bao kien---DM_PACKAGE
	// if (DmPackageLocalServiceUtil.getByPackageCode(validation) == null) {
	// isBreak = true;
	// status = false;
	// logValidation(logMess, id, maLoi, nameColumn, idColumn);
	// }
	// break;
	// case 16:
	// //------------------ DM _ Maritime, cang? vu,
	// if (DmMaritimeLocalServiceUtil.getByMaritimeCode(validation) == null) {
	// isBreak = true;
	// status = false;
	// logValidation(logMess, id, maLoi, nameColumn, idColumn);
	// }
	// break;
	// case 17:
	// //------------------ DM _ Post Harbour,
	// if (DmPortHarbourLocalServiceUtil.getByPortHarbourCode(validation) ==
	// null) {
	// isBreak = true;
	// status = false;
	// logValidation(logMess, id, maLoi, nameColumn, idColumn);
	// }
	// break;
	// default:
	// break;
	// }
	// break;
	// case 5:
	// //Gia tri vuot qua do dai cho phep
	// if (!ActionUtils.checkLength(validation, lengthData)) {
	// logValidation(logMess, id, maLoi, nameColumn, idColumn);
	// isBreak = true;
	// status = false;
	// }
	// break;
	// case 6:
	// //Gia tri co ky tu dac biet
	// if (!ActionUtils.checkIfIsAValidSpecialCharacters(validation)) {
	// logValidation(logMess, id, maLoi, nameColumn, idColumn);
	// isBreak = true;
	// status = false;
	// }
	// break;
	// default:
	// break;
	// }
	//
	// if (isBreak == true) { break; }
	// }
	// return status;
	// }

	public static void addLogMessageValidation(AswmsgValidationLog logMessageValidation) {
		try {
			AswmsgValidationLogLocalServiceUtil.addAswmsgValidationLog(logMessageValidation);
		} catch (SystemException e) {
			_log.error(e);
		}
	}

	public static void setParams(ActionRequest resourceRequest) {
		Enumeration<String> listName = resourceRequest.getParameterNames();
		String maTaiLieu = "";
		while (listName.hasMoreElements()) {
			maTaiLieu = listName.nextElement();
			resourceRequest.setAttribute(maTaiLieu, ParamUtil.getString(resourceRequest, maTaiLieu));
		}
	}
	
	private static Log _log = LogFactoryUtil.getLog(ValidationUtils.class);

}
