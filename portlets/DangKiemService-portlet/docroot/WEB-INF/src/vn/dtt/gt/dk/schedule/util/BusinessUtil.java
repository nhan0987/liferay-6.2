package vn.dtt.gt.dk.schedule.util;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyChinhLocalServiceUtil;
import vn.dtt.gt.dk.dao.report.model.DocumentStatistics;
import vn.dtt.gt.dk.dao.report.service.DocumentStatisticsLocalServiceUtil;
import vn.dtt.gt.dk.utils.JSONWSClient;
import vn.dtt.gt.dk.utils.PortletPropsUtil;
import vn.dtt.gt.dk.utils.format.Constants;
import vn.dtt.gt.dk.utils.format.FormatData;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

public class BusinessUtil {
	public static void doPushAPI() {
		try {
			Calendar cal = Calendar.getInstance();
			Date now = new Date();
			cal.setTime(now);
			
			int currentYear = cal.get(Calendar.YEAR);
			int currentMonth = cal.get(Calendar.MONTH) + 1;
			
			Map<Long, DocumentStatistics> mapDocumentStatistics = new HashMap<Long, DocumentStatistics>();
			
			List<DocumentStatistics> listDocumenStatistics = new ArrayList<DocumentStatistics>();
			
			// alway send current month
			List<DocumentStatistics> documenStatistics = DocumentStatisticsLocalServiceUtil.
					getByYear_Month(currentYear, currentMonth);
			
			List<DocumentStatistics> documenStatisticNotSends = DocumentStatisticsLocalServiceUtil.
					getListDocumentStatistics(Constants.DOCUMENT_STATISTICS_STATUS_NOT_SEND);
			
			listDocumenStatistics.addAll(documenStatistics);
			listDocumenStatistics.addAll(documenStatisticNotSends);
			
			for(DocumentStatistics documenStatistic : listDocumenStatistics) {
				mapDocumentStatistics.put(documenStatistic.getId(), documenStatistic);
			}
			
			JSONWSClient client = new JSONWSClient();
			
			for(Entry<Long, DocumentStatistics> entry : mapDocumentStatistics.entrySet()) {
				
				DocumentStatistics documenStatistic = entry.getValue();
				
				List<NameValuePair> params = new ArrayList<NameValuePair>();
				
				params.add(new BasicNameValuePair("govCode", PortletPropsUtil.getString("api.dvc.gov.code")));
				params.add(new BasicNameValuePair("domainCode", PortletPropsUtil.getString("api.dvc.domain.code")));
				params.add(new BasicNameValuePair("remainingNumber", String.valueOf(documenStatistic.getRemainingNumber())));
				params.add(new BasicNameValuePair("receivedNumber", String.valueOf(documenStatistic.getReceivedNumber())));
				params.add(new BasicNameValuePair("ontimeNumber", String.valueOf(documenStatistic.getOntimeNumber())));
				params.add(new BasicNameValuePair("overtimeNumber", String.valueOf(documenStatistic.getOvertimeNumber())));
				params.add(new BasicNameValuePair("processingNumber", String.valueOf(documenStatistic.getProcessingNumber())));
				params.add(new BasicNameValuePair("delayingNumber", String.valueOf(documenStatistic.getDelayingNumber())));
				params.add(new BasicNameValuePair("month", String.valueOf(documenStatistic.getMonth())));
				params.add(new BasicNameValuePair("year", String.valueOf(documenStatistic.getYear())));
				params.add(new BasicNameValuePair("source", PortletPropsUtil.getString("api.dvc.source")));
				
				String result = client.pushAPIByPost("/api/jsonws/opencps-portlet.dossiersstatistics/push-stats", params);
				
				boolean valid = true;
				if(Validator.isNotNull(result) && result.toLowerCase().contains("exception")) {
					valid = false;
				}
				
				if(valid) {
					DocumentStatisticsLocalServiceUtil.updateStatus(
						documenStatistic, Constants.DOCUMENT_STATISTICS_STATUS_SEND);
				}
				
				_log.info("====result===" + result);
			}
		} catch(Exception e) {
			_log.error(e);
		}
	}
	
	public static void doStatistics() {
		try {
			Calendar calNow = Calendar.getInstance();
			Date now = new Date();
			calNow.setTime(now);
			calNow.set(Calendar.MONTH, calNow.get(Calendar.MONTH) + 1);
			
			int startYear = PortletPropsUtil.getInteger("api.dvc.statistics.start.year");
			int startMonth = PortletPropsUtil.getInteger("api.dvc.statistics.start.month");
			
			Calendar calStart = Calendar.getInstance();
			calStart.set(Calendar.YEAR, startYear);
			calStart.set(Calendar.MONTH, startMonth - 1);
			
			int incMonth = calStart.get(Calendar.MONTH);
			
			while(calStart.before(calNow)) {
				
				int year = calStart.get(Calendar.YEAR);
				int month = calStart.get(Calendar.MONTH);
				
				List<DocumentStatistics> documentStatistics = DocumentStatisticsLocalServiceUtil.getByYear_Month_Status(
						year, month, Constants.DOCUMENT_STATISTICS_STATUS_SEND);
			
				if(documentStatistics.size() == 0) {
					Calendar calFrom = Calendar.getInstance();
					Calendar calTo = Calendar.getInstance();
					
					calFrom.set(Calendar.YEAR, year);
					calFrom.set(Calendar.MONTH, month);
					calFrom.set(Calendar.DAY_OF_MONTH, 1);
					calFrom.set(Calendar.HOUR_OF_DAY, 0);
					calFrom.set(Calendar.MINUTE, 0);
					calFrom.set(Calendar.SECOND, 0);
					
					calTo.set(Calendar.YEAR, year);
					calTo.set(Calendar.MONTH, month + 1);
					calTo.set(Calendar.DAY_OF_MONTH, 1);
					calTo.set(Calendar.HOUR_OF_DAY, 0);
					calTo.set(Calendar.MINUTE, 0);
					calTo.set(Calendar.SECOND, 0);
					
					String dateFrom = FormatData.parseDateToTringType3(calFrom.getTime());
					String dateTo = FormatData.parseDateToTringType3(calTo.getTime());
					
					JSONArray jsonArray = BusinessUtil.countDocumentStatistics(dateFrom, dateTo);
					
					_log.info("===dateFrom===" + dateFrom);
					_log.info("===dateTo===" + dateTo);
					_log.info("===jsonArray===" + jsonArray);
					
					for(int i = 0; i < jsonArray.length(); i ++) {
						JSONObject jsonObject = jsonArray.getJSONObject(i);
						
						DocumentStatisticsLocalServiceUtil.updateDocumentStatistics(year, month + 1, 
								jsonObject.getString("documentTypeCode"),
								jsonObject.getLong("remainingNumber"),
								jsonObject.getLong("receivedNumber"),
								jsonObject.getLong("processingNumber"),
								jsonObject.getLong("ontimeNumber"),
								jsonObject.getLong("overtimeNumber"),
								jsonObject.getLong("delayingNumber"));
					}
				}
				
				incMonth ++;
				calStart.set(Calendar.YEAR, startYear);
				calStart.set(Calendar.MONTH, incMonth);
			}
			
		} catch(Exception e) {
			_log.error(e);
		}
	}
	
	public static JSONArray countDocumentStatistics(String dateFrom, String dateTo) throws SystemException {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
		
		long receivedNumber = MotCuaPhieuXuLyChinhLocalServiceUtil
				.countMotCuaPhieuXuLyChinhByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(
						null, null, null,
						0, 0, null,
						null, dateFrom, dateTo,
						null, 0);
		
		long ontimeNumber = MotCuaPhieuXuLyChinhLocalServiceUtil
				.countMotCuaPhieuXuLyChinhByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(
						null, null, null,
						0, 57, null,
						null, dateFrom, dateTo,
						null, 0);
		
		ontimeNumber += MotCuaPhieuXuLyChinhLocalServiceUtil
				.countMotCuaPhieuXuLyChinhByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(
						null, null, null,
						0, 74, null,
						null, dateFrom, dateTo,
						null, 0);
		
		long processingNumber = (receivedNumber - ontimeNumber);
		
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
		
		jsonObject.put("documentTypeCode", PortletPropsUtil.getString("api.dvc.domain.code"));
		jsonObject.put("receivedNumber", receivedNumber);
		jsonObject.put("processingNumber", processingNumber);
		jsonObject.put("ontimeNumber", ontimeNumber);
		
		jsonArray.put(jsonObject);
		
		return jsonArray;
	}
	
	private static final Log _log = LogFactoryUtil.getLog(BusinessUtil.class);
}
