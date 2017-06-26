
package vn.dtt.gt.dk.utils.format;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	
	public static final String CURRENT_TIME_STAMP = new Date().getTime() + "";
	
	public static String dateToString(String format, Date date) { // lay ra ngay, thang, nam, gio, phu, giay hien tai
		String stringResult = "";
		SimpleDateFormat sdf = null;
		try {
			sdf = new SimpleDateFormat(format);
			stringResult = sdf.format(date);
		} catch (Exception e) {
			stringResult = "";
		}
		return stringResult;
	}
	
	public static Date stringToDate(String sDate, String format) {
		Date result = null;
		SimpleDateFormat sdf = null;
		try {
			sdf = new SimpleDateFormat(format);
			result = sdf.parse(sDate);
		} catch (Exception e) {
		}
		return result;
	}
	
	public static boolean isDate(String sDate, String format) {
		SimpleDateFormat sdf = null;
		try {
			sdf = new SimpleDateFormat(format);
			sdf.parse(sDate);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static String getDateAfterNumberDay(int soNgayAfterCurrentDay) {
		try {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(new Date());
			calendar.add(Calendar.DAY_OF_YEAR, soNgayAfterCurrentDay);
			
			return dateToString("dd/MM/yyyy HH:mm", calendar.getTime());
		} catch (Exception e) {
			
		}
		return "";
	}
}
