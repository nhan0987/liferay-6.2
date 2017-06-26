/**
 * 
 */
package vn.dtt.gt.dk.utils;

import javax.portlet.ActionRequest;
import javax.portlet.PortletSession;

/**
 * @author binhnt
 *
 */
public class ActionKeys extends com.liferay.portal.security.permission.ActionKeys {
	public static final String VIEW_PHAN_CONG_HO_SO = "VIEW_PHAN_CONG_HO_SO";
	
	
	public static boolean checkFromDate(ActionRequest actionRequest, String fromDate) {
		  String FROM_DATE = "FROM_DATE";
		  if (fromDate != null && fromDate.trim().length() > 0) {
		   PortletSession portletSession = actionRequest.getPortletSession();
		   Object oldFromDate = portletSession.getAttribute("FROM_DATE") ;
		   if (oldFromDate != null) {
		    if (fromDate.trim().compareToIgnoreCase(oldFromDate.toString().trim()) == 0) {
		     return true;
		    }
		   }
		   portletSession.setAttribute(FROM_DATE, fromDate.trim());
		  }

		  return false;
		 }
}
