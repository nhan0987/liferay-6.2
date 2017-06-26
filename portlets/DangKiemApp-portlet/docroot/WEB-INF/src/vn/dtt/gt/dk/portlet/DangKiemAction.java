/**
 * 
 */
package vn.dtt.gt.dk.portlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import vn.dtt.gt.dk.report.ReportConstant;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * @author binhnt
 *
 */
public class DangKiemAction extends MVCPortlet {
	
	private Log _log = LogFactoryUtil.getLog(DangKiemAction.class);

	 public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws IOException,
     PortletException {

		 _log.debug("----serveResource---");
		String dataId = ParamUtil.getString(resourceRequest, "dataId");
		_log.debug("----dataId---"+dataId);
		
		// Process Jason feed
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		
		JSONArray _id_data = JSONFactoryUtil.getJSONFactory().createJSONArray();
		JSONArray _name_data = JSONFactoryUtil.getJSONFactory().createJSONArray();
		JSONArray _ghiChu_data = JSONFactoryUtil.getJSONFactory().createJSONArray();
		
//		if (dataId>0){
//			for (int i=0;i<dataId; i++ ){
//				_id_data.put(i);
//				_name_data.put(" Xe may san xu�t nam 200"+i);
//				_ghiChu_data.put(" Ghi chu so "+i);
//			}
//			_log.debug("===put data Json ====");
//			
//			jsonFeed.put("iddata", _id_data);
//			jsonFeed.put("namedata", _name_data);
//			jsonFeed.put("ghichudata", _ghiChu_data);
//		}
		
		jsonFeed.put("urlFile", "/DangKiemApp-portlet/export/"+ReportConstant.TEN_FILE_DEFAULT);
		
		PrintWriter out=resourceResponse.getWriter();
		out.print(jsonFeed.toString());
		
		}
}
