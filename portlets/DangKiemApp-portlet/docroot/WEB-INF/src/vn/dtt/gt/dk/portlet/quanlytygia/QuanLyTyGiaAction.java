package vn.dtt.gt.dk.portlet.quanlytygia;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;

import net.sf.jasperreports.components.barbecue.BarcodeProviders.NW7Provider;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;

import vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate;
import vn.dtt.gt.dk.dao.nghiepvu.service.NewExchangeRateLocalServiceUtil;
import vn.dtt.gt.dk.portlet.DangKiemAction;
import vn.dtt.gt.dk.utils.format.Constants;
import vn.dtt.gt.dk.utils.format.ConvertUtil;
import vn.dtt.gt.dk.utils.format.DateUtils;

/**
 * Portlet implementation class QuanLyTyGiaAction
 */
public class QuanLyTyGiaAction extends DangKiemAction {
	
	private static Log _log = LogFactoryUtil.getLog(QuanLyTyGiaAction.class);
	
	public void deleteNewExchangeRate(ActionRequest request, ActionResponse httpReq) {
		try {
			long iDNewEx = ParamUtil.getLong(request, Constants.NewExchangeRate_ID);
			_log.info("NewExchangeRate_ID---" + iDNewEx);
			
			if (iDNewEx > 0) {
				NewExchangeRateLocalServiceUtil.deleteNewExchangeRate(iDNewEx);
			}
			
		} catch (Exception e) {
			_log.error(e);
		}
		
		PortletConfig portletConfig = (PortletConfig)request.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request,  portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		SessionMessages.add(request,  portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
	
	public void editNewExchangeRate(ActionRequest request, ActionResponse httpReq) {
		try {
			long id = ParamUtil.getLong(request, Constants.NewExchangeRate_ID);
			String originalcurrency = ParamUtil.getString(request, "originalcurrency");
			String basiccurrency = ParamUtil.getString(request, "basiccurrency");
			String exchangerate = ParamUtil.getString(request, "exchangerate");
			String publishdate = ParamUtil.getString(request, "publishdate");
			String validfrom = ParamUtil.getString(request, "validfrom");
			String validuntil = ParamUtil.getString(request, "validuntil");
			
			if (id > 0) {
				NewExchangeRate newExchangeRate = NewExchangeRateLocalServiceUtil.getNewExchangeRate(id);
				newExchangeRate.setExchangeRate(ConvertUtil.convertToDouble(exchangerate));
				newExchangeRate.setPublishDate(DateUtils.stringToDate(publishdate, "dd/MM/yyyy HH:mm"));
				newExchangeRate.setValidFrom(DateUtils.stringToDate(validfrom, "dd/MM/yyyy HH:mm"));
				newExchangeRate.setValidUntil(DateUtils.stringToDate(validuntil, "dd/MM/yyyy HH:mm"));
				NewExchangeRateLocalServiceUtil.updateNewExchangeRate(newExchangeRate);
			}
			
		} catch (Exception e) {
			_log.error(e);
		}
		
		PortletConfig portletConfig = (PortletConfig)request.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request,  portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		SessionMessages.add(request,  portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
 

}
