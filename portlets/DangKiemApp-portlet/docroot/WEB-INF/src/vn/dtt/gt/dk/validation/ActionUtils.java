package vn.dtt.gt.dk.validation;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.xml.datatype.XMLGregorianCalendar;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.dao.aswmsg.service.AswmsgValidationLogLocalServiceUtil;
import vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity;
import vn.dtt.gt.dk.nsw.model.ConfirmCancellation;
import vn.dtt.gt.dk.nsw.model.ConfirmCertificateCancellation;
import vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement;
import vn.dtt.gt.dk.nsw.model.ConfirmationOfAssignment;
import vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity;
import vn.dtt.gt.dk.nsw.model.Currency;
import vn.dtt.gt.dk.nsw.model.DistrictList;
import vn.dtt.gt.dk.nsw.model.ProvinceList;
import vn.dtt.gt.dk.nsw.model.StateList;
import vn.dtt.gt.dk.nsw.model.CurrentStatusOfImportedVehicleList;
import vn.dtt.gt.dk.nsw.model.DebitNote;
import vn.dtt.gt.dk.nsw.model.ImportedVehicleList;
import vn.dtt.gt.dk.nsw.model.InquiryImportedVehicleReference;
import vn.dtt.gt.dk.nsw.model.InspectorSign;
import vn.dtt.gt.dk.nsw.model.NoticeCertificateEndorsement;
import vn.dtt.gt.dk.nsw.model.NoticeOfCancellation;
import vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection;
import vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity;
import vn.dtt.gt.dk.nsw.model.NoticeOfViolation;
import vn.dtt.gt.dk.nsw.model.PaymentConfirmation;
import vn.dtt.gt.dk.nsw.model.PaymentNotification;
import vn.dtt.gt.dk.nsw.model.RequestChanges;
import vn.dtt.gt.dk.nsw.model.RequestForChangingDateSite;
import vn.dtt.gt.dk.nsw.model.RequestForControl;
import vn.dtt.gt.dk.nsw.model.RequestForQualityInspection;
import vn.dtt.gt.dk.nsw.model.RequestOfEmissionTesting;
import vn.dtt.gt.dk.nsw.model.RequestOfSafeTesting;
import vn.dtt.gt.dk.nsw.model.ScheduleReport;
import vn.dtt.gt.dk.nsw.model.SelectedGroupForPayment;
import vn.dtt.gt.dk.nsw.model.SelectedVehicleListForPayment;
import vn.dtt.gt.dk.nsw.model.TechnicalSpecification;
import vn.dtt.gt.dk.utils.config.DKConfigurationManager;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;

public class ActionUtils {

	public static final String REGISTRATION_ACTION = "action";
	public static final String REGISTRATION_ACTION_GO_BACK = "back";
	public static final String REGISTRATION_GO_BUSINESS_COOPERATION = "registration.go_business.cooperation";
	public static final String REGISTRATION_BUSINESS_COOPERATION = "registration.business.cooperation";

	// Danh Sach Giao Dich
	public static final String VIEW_REGISTRATION_BUSINESS = "brms.registration";
	public static final String VIEW_TRANSACTION = "brms.transaction";
	public static final String VIEW_TRANSACTION_DETAILS = "brms.transaction.details";
	public static final String VIEW_DOCUMENT = "brms.document";
	public static final String LEVEL_CONTENT = "3";

	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	// public static String REGISTER_CITIZEN_ID =
	// DKConfigurationManager.getStrProp("egov.application.brms.profile.citizen.id",
	// "Cong Dan");
	// public static String REGISTER_COMPANY_ID =
	// DKConfigurationManager.getStrProp("egov.application.brms.profile.company.id",
	// "Doanh Nghiep");
	// public static String REGISTER_FAMILY_ID =
	// DKConfigurationManager.getStrProp(

	public static String NumberFormat(int value) {
		try {

			DecimalFormat format = new DecimalFormat("#,###");

			return format.format("NumberFormat");

		} catch (Exception es) {

		}
		return "";
	}

	public static String NumberFormat1(String value) {
		try {
			DecimalFormat format = new DecimalFormat("#,###");

			return format.format("");

		} catch (Exception es) {

		}
		return "";
	}

	public static void NumberFM(String[] args) {

		DecimalFormat format = new DecimalFormat("#,###");

		_log.info(format.format(1000000000));
	}

	// //////////////////////////////////////////////////////////
	public static long convertToLong(String value) {
		try {
			return Long.parseLong(value.trim());
		} catch (Exception es) {
		}

		return 0;
	}

	public static int convertToInt(String value) {
		try {
			return Integer.parseInt(value.trim());
		} catch (Exception es) {
		}

		return 0;
	}

	public static double convertToDouble(String value) {
		try {
			return Double.parseDouble(value.trim());
		} catch (Exception es) {
		}

		return 0;
	}

	public static Date parseStringToDate(String data) {
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			return dateFormat.parse(data);
		} catch (Exception es) {
		}
		return null;
	}

	public static String parseDateToTring(Date date) {
		try {
			return formatDateShort.format(date);
		} catch (Exception es) {
		}
		return "";
	}

	public static String parseXMLGregorianCalendarToTring(
			XMLGregorianCalendar date) {
		try {
			return formatDateShort.format(date.toGregorianCalendar().getTime());
		} catch (Exception es) {
		}
		return "";
	}

	public static String checkData(Long number1, Long number2) {
		String out = StringPool.BLANK;
		if (number1 != null && number2 != null && number1.equals(number2)) {
			out = "selected";
		}
		return out;
	}

	public static String checkData(int number1, long number2) {
		try {
			if (number1 == number2) {
				return "selected=\"selected\"";
			}
		} catch (Exception es) {
		}
		return "";
	}

	public static String checkData(int number1, int number2) {
		try {
			if (number1 == number2) {
				return "selected=\"selected\"";
			}
		} catch (Exception es) {
		}
		return "";
	}

	public static String checkData(String number1, String number2) {
		try {
			if (null != number1 && null != number2)
				if (number1.equals(number2)) {
					return "selected=\"selected\"";
				}
		} catch (Exception es) {
		}
		return "";
	}

	public static String checkDataLong(long number1, int number2) {
		try {
			if (number1 == number2) {
				return "selected=\"selected\"";
			}
		} catch (Exception es) {
		}
		return "";
	}

	public static String checkDataForRadio(long number1, long number2) {
		try {
			if (number1 == number2) {
				return "checked=\"checked\"";
			}
		} catch (Exception es) {
		}
		return "";
	}

	public static boolean checkDataForRadio2(long number1, long number2) {
		try {
			if (number1 == number2) {
				return true;
			}
		} catch (Exception es) {
		}
		return false;
	}

	public static String checkDataToDisable(long number1, long number2) {
		try {
			if (number1 != number2) {
				return "disabled=\"disabled\"";
			}
		} catch (Exception es) {
		}
		return "";
	}

	public static String checkDataHTX(long number1, long number2) {
		try {
			if (number1 == number2) {
				return "selected";
			}
		} catch (Exception es) {
		}
		return "";
	}

	public static String getMaHoSo() {
		return Long.toString(System.currentTimeMillis());
	}

	public static String getValueString(
			HttpServletRequest resHttpServletRequest, String key) {
		try {
			if (resHttpServletRequest.getAttribute(key) != null) {
				return resHttpServletRequest.getAttribute(key).toString()
						.trim();
			}
		} catch (Exception es) {
		}

		return "";
	}

	public static long getValueLong(HttpServletRequest resHttpServletRequest,
			String key) {
		try {
			if (resHttpServletRequest.getAttribute(key) != null) {
				return convertToLong(resHttpServletRequest.getAttribute(key)
						.toString().trim());
			}
		} catch (Exception es) {
		}

		return 0;
	}

	public static List<String> getNganhNgheKinhDoanh(String listNganhNgheKDId) {
		List<String> list = new ArrayList<String>();
		StringTokenizer st = new StringTokenizer(listNganhNgheKDId, ",");
		while (st.hasMoreElements()) {
			String value = st.nextElement().toString();
			// _log.info("value   "+value);
			list.add(value);
		}
		return list;

	}

	public static String getTitle(SimpleDateFormat format) {
		Date date = new Date();
		return format.format(date);
	}

	public static String getDateTitle(SimpleDateFormat format, Date date) {

		return format.format(date);
	}

	public static boolean checkIdNganhNgheKD(Long id, List<String> list) {
		boolean rerulst = false;
		if (list != null && list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				String value = list.get(i);

				if (value.equals(id.toString())) {

					rerulst = true;
					break;
				}
			}
		}
		return rerulst;
	}

	// BinhNT Add 2013-03-13
	public static String checkColspanColumn(String value, int typeCheck) {
		if (typeCheck == 1) {
			// Check voi colspan
			if (value.length() > 0) {
				return "colspan=\"2\"";
			}
		} else {
			// Check display
			if (value.length() > 0) {
				return "none";
			}
		}

		return "";
	}

	public static boolean checkIdNganhNgheKD(Long id, String listIdNganhNghe) {

		boolean result = false;

		if (listIdNganhNghe != null && listIdNganhNghe.length() > 0) {

			String[] list = listIdNganhNghe.split(",");

			for (String item : list) {

				if (item.equalsIgnoreCase(id + "")) {
					result = true;
					break;
				}
			}

			// result = listIdNganhNghe.contains(id.toString());
		}

		return result;
	}

	public static boolean validationURL(String url) {
		try {
			String urlPattern = "^http(s{0,1})://[a-zA-Z0-9_/\\-\\.]+\\.([A-Za-z/]{2,5})[a-zA-Z0-9_/\\&\\?\\=\\-\\.\\~\\%]*";
			String urlPattern1 = "^www.[a-zA-Z0-9_/\\-\\.]+\\.([A-Za-z/]{2,5})[a-zA-Z0-9_/\\&\\?\\=\\-\\.\\~\\%]*";
			String urlPattern2 = "^[a-zA-Z0-9_/\\-\\.]+\\.([A-Za-z/]{2,5})[a-zA-Z0-9_/\\&\\?\\=\\-\\.\\~\\%]*";

			if (url.matches(urlPattern) || url.matches(urlPattern1)
					|| url.matches(urlPattern2)) {
				return true;
			}
		} catch (Exception es) {
		}

		return false;
	}

	private static SimpleDateFormat formatDateShort = new SimpleDateFormat(
			"dd/MM/yyyy");

	public static boolean checkIfIsLong(String input) {

		if (input.contains(".") || input.contains(",")) {
			return false;
		}

		try {
			Long.parseLong(input);
		} catch (NumberFormatException e) {
			return false;
		}

		return true;
	}

	public static boolean checkIfIsDouble(String input) {

		try {
			Double.parseDouble(input.replace(",", "."));
		} catch (NumberFormatException e) {
			return false;
		}

		return true;
	}

	public static int compareTwoDates(String fDate, String sDate,
			String dateFormat) throws ParseException {

		int dateDifference = 0;

		DateFormat df = new SimpleDateFormat(dateFormat);

		Date first = df.parse(fDate);
		Date second = df.parse(sDate);

		long firstDateToMillis = first.getTime();
		long secondDateToMillis = second.getTime();

		dateDifference = (int) ((firstDateToMillis - secondDateToMillis) / (24 * 60 * 60 * 1000));

		return dateDifference;
	}

	public static String getToday() {

		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		return dateFormat.format(new Date());
	}

	public static boolean chuoiChuaSo(String chuoi) {
		char[] tmp = chuoi.toCharArray();
		for (int i = 0; i < tmp.length; i++) {
			if (Character.isDigit(tmp[i]))
				return true;
		}
		return false;
	}

	public static boolean checkIfContainsFloatingPoint(String input) {

		if (input.contains(".") || input.contains(",")) {
			return true;
		}

		return false;
	}

	public static boolean checkIfIsFloat(String input) {

		try {
			Float.parseFloat(input.replace(",", "."));
		} catch (NumberFormatException e) {
			return false;
		}

		return true;
	}

	public static boolean checkIfIsAValidEmail(String email) {

		// Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		//
		// Matcher matcher = pattern.matcher(email);

		// return matcher.matches();
		return true;
	}

	public static int convertCheckBoxValueToBooleanInt(String input) {

		try {

			if (input.equalsIgnoreCase("on")) {

				return 1;
			}

		} catch (Exception e) {
		}

		return 0;
	}

	public static String convertCheckBoxValueToBooleanString(String input) {

		try {

			if (input.equalsIgnoreCase("on")) {

				return "1";
			}

		} catch (Exception e) {
		}

		return "0";
	}

	public static String convertBooleanIntToText(int value) {

		if (value == 1) {
			return DKConfigurationManager.getStrProp("vn.dtt.hms.co", "");
		} else {
			return DKConfigurationManager.getStrProp("vn.dtt.hms.khong", "");
		}
	}

	public static String checkCheckBox(int status) {

		if (status == 1) {
			return " checked=\"checked\" ";
		} else {
			return "";
		}
	}

	public static int convertFromCheckBoxValueArrayToInt(String[] values) {

		int result = 0;

		if (values != null && values.length > 0) {

			result = Integer.parseInt(values.toString(), 2);
		}

		return result;
	}

	public static int[] convertFromStringToIntArray(String input) {

		int[] results = null;

		if (input != null && input.length() > 0) {

			char[] digits = input.toCharArray();

			results = new int[digits.length];

			for (int i = 0; i < digits.length; i++) {

				results[i] = Integer.parseInt(digits[i] + "");
			}
		}

		return results;
	}

	public static boolean checkIfIsAValidSpecialCharacters(String input) {
//		 char[] kitu = input.toCharArray();
//		 for (int i = 0; i < kitu.length; i++) {
//		 if ((kitu[i] > 32 && kitu[i] < 39) || (kitu[i] == 42) || (kitu[i] ==
//		 47) || (kitu[i] == 58) || (kitu[i] == 60) ||
//		 (kitu[i] > 61 && kitu[i] < 65) || (kitu[i] == 92) || (kitu[i] == 94)
//		 || (kitu[i] == 124)|| (kitu[i] == 126)) {
//		 return false ;
//		 }
//		 }
		return true;
	}

	public static boolean checkFormatInterger(String result, int number,
			boolean isFixLength) {
		if (isFixLength) {
			if (result.length() == number) {
				return true;
			}
		} else {
			if (result.length() <= number) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean checkFormatDouble(String result, int before, int after) {
		String[] results = result.trim().split("\\.");
		if (results.length == 1) {
			if (results[0].length() <= before) {
				return true;
			}
		} else if (results.length == 2) {
			if (results[0].length() <= before && results[1].length() <= after) {
				return true;
			}
		}
		return false;
	}

	public static boolean checkLength(String result, int number) {
		if (result.length() <= number) {
			return true;
		}
		return false;
	}
	
	public  static boolean checkValidation(List<Object> lstObject, long idMessageLog){
		_log.info("=====checkValidation=====idMessageLog========" + idMessageLog);
		boolean status = true;
		try {
			if(lstObject != null && lstObject.size() > 0){
				
					for(Object object : lstObject){
						
						if(object instanceof RequestForQualityInspection){
							status = RequestForQualityInspectionValidation.validation(RequestForQualityInspection.class.cast(object), idMessageLog);
							
						}else if(object instanceof SelectedGroupForPaymentValidation){
							status = SelectedGroupForPaymentValidation.validation(SelectedGroupForPayment.class.cast(object), idMessageLog);
							
						} else if(object instanceof TechnicalSpecification){
							status = TechnicalSpecificationValidation.validation(TechnicalSpecification.class.cast(object), idMessageLog);
							
						} else if(object instanceof ImportedVehicleList){
							status = ImportedVehicleListValidation.validation(ImportedVehicleList.class.cast(object), idMessageLog);
							
						} else if(object instanceof InspectorSign){
							status = InspectorSignValidation.validation(InspectorSign.class.cast(object), idMessageLog);
							
						} else if(object instanceof RequestForChangingDateSite){
							status = RequestForChangingDateSiteValidation.validation(RequestForChangingDateSite.class.cast(object), idMessageLog);
							
						} else if(object instanceof ScheduleReport){
							status = ScheduleReportValidation.validation(ScheduleReport.class.cast(object), idMessageLog);
							
						} else if(object instanceof RequestOfEmissionTesting){
							status = RequestOfEmissionTestingValidation.validation(RequestOfEmissionTesting.class.cast(object), idMessageLog);
							
						} else if(object instanceof RequestOfSafeTesting){
							status = RequestOfSafeTestingValidation.validation(RequestOfSafeTesting.class.cast(object), idMessageLog);
							
						} else if(object instanceof RequestForControl){
							status = RequestForControlValidation.validation(RequestForControl.class.cast(object), idMessageLog);
							
						} else if(object instanceof CurrentStatusOfImportedVehicleList){
							status = CurrentStatusOfImportedVehicleListValidation.validation(CurrentStatusOfImportedVehicleList.class.cast(object), idMessageLog);
							
						} else if(object instanceof ConfirmationOfAssignment){
							status = ConfirmationOfAssignmentValidation.validation(ConfirmationOfAssignment.class.cast(object), idMessageLog);
							
						} else if(object instanceof SelectedVehicleListForPayment){
							status = SelectedVehicleListForPaymentValidation.validation(SelectedVehicleListForPayment.class.cast(object), idMessageLog);
							
						} else if(object instanceof PaymentNotification){
							status = PaymentNotificationValidation.validation(PaymentNotification.class.cast(object), idMessageLog);
							
						} else if(object instanceof DebitNote){
							status = DebitNoteValidation.validation(DebitNote.class.cast(object), idMessageLog);
							
						} else if(object instanceof PaymentConfirmation){
							status = PaymentConfirmationValidation.validation(PaymentConfirmation.class.cast(object), idMessageLog);
							
						} else if(object instanceof CertificateOfQuanlityConformity){
							status = CertificateOfQuanlityConformityValidation.validation(CertificateOfQuanlityConformity.class.cast(object), idMessageLog);
							
						} else if(object instanceof NoticeOfExemptionFromInspection){
							status = NoticeOfExemptionFromInspectionValidation.validation(NoticeOfExemptionFromInspection.class.cast(object), idMessageLog);
							
						} else if(object instanceof NoticeOfNonConformity){
							status = NoticeOfNonConformityValidation.validation(NoticeOfNonConformity.class.cast(object), idMessageLog);
							
						} else if(object instanceof NoticeOfViolation){
							status = NoticeOfViolationValidation.validation(NoticeOfViolation.class.cast(object), idMessageLog);
							
						} else if(object instanceof NoticeCertificateEndorsement){
							status = NoticeCertificateEndorsementValidation.validation(NoticeCertificateEndorsement.class.cast(object), idMessageLog);
							
						} else if(object instanceof ConfirmationStatusOfQuanlityConformity){
							status = ConfirmationStatusOfQuanlityConformityValidation.validation(ConfirmationStatusOfQuanlityConformity.class.cast(object), idMessageLog);
							
						} else if(object instanceof ConfirmCertificateEndorsement){
							status = ConfirmCertificateEndorsementValidation.validation(ConfirmCertificateEndorsement.class.cast(object), idMessageLog);
							
						} else if(object instanceof ConfirmCertificateCancellation){
							status = ConfirmCertificateCancellationValidation.validation(ConfirmCertificateCancellation.class.cast(object), idMessageLog);
							
						} else if(object instanceof InquiryImportedVehicleReference){
							status = InquiryImportedVehicleReferenceValidation.validation(InquiryImportedVehicleReference.class.cast(object), idMessageLog);
							
						} else if(object instanceof NoticeOfCancellation){
							status = NoticeOfCancellationValidation.validation(NoticeOfCancellation.class.cast(object), idMessageLog);
							
						} else if(object instanceof RequestChanges){
							status = RequestChangesValidation.validation(RequestChanges.class.cast(object), idMessageLog);
							
						} else if(object instanceof ConfirmCancellation){
							status = ConfirmCancellationValidation.validation(ConfirmCancellation.class.cast(object), idMessageLog);
							
						} else if(object instanceof Currency){
							status = CurrencyValidation.validation(Currency.class.cast(object), idMessageLog);
							
						} else if(object instanceof StateList){
							status = StateListValidation.validation(StateList.class.cast(object), idMessageLog);
							
						} else if(object instanceof ProvinceList){
							status = ProvinceListValidation.validation(ProvinceList.class.cast(object), idMessageLog);
							
						} else if(object instanceof DistrictList){
							status = DistrictListValidation.validation(DistrictList.class.cast(object), idMessageLog);
							
						}
						if(!status){
							break;
						}
					}
				
			} else {
				AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
				logMessageValidation.setMessageLogId(idMessageLog);
				logMessageValidation.setTagName("khong co body");
				AswmsgValidationLogLocalServiceUtil.addAswmsgValidationLog(logMessageValidation);
				status = false;
			}
		} catch (Exception e) {
			_log.error(e);
		}
		return status;
	}
	
	private static Log _log = LogFactoryUtil.getLog(ActionUtils.class);
}
