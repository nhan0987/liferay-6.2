package vn.dtt.gt.dk.portlet.menu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpSession;

import vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro;
import vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoVaiTroLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.DaKiemTraLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyChinhLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyPhuLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.PhanCongDonViKiemTraLocalServiceUtil;
import vn.dtt.gt.dk.portlet.DangKiemAction;
import vn.dtt.gt.dk.utils.format.CommonUtils;
import vn.dtt.gt.dk.utils.format.Constants;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.PortletPreferencesFactoryUtil;

/**
 * Portlet implementation class MenuAction
 */
public class MenuAction extends DangKiemAction {

	private static Log _log = LogFactoryUtil.getLog(MenuAction.class);
	
	public void changeMenu(ActionRequest actionRequest, ActionResponse httpReq) {
		HttpSession httpSession = null;
		_log.debug("==begin  changeMenu: ");
		try {
			httpSession = PortalUtil.getHttpServletRequest(actionRequest).getSession();
			String maPhanNhom = ParamUtil.getString(actionRequest, Constants.MAPHANNHOMHOSO);
			
			// them test
			String loaiConfig = ParamUtil.getString(actionRequest, "loaiConfig");
			_log.debug("==changeMenu==loaiConfig: " + loaiConfig);
			
		
			if (httpSession != null && maPhanNhom != null && maPhanNhom.trim().length() > 0) {
				httpSession.setAttribute(Constants.MAPHANNHOMHOSO, maPhanNhom);
			}
			PortletPreferences resourcePrefs = PortletPreferencesFactoryUtil.getPortletSetup(actionRequest);
			
			
			
			
			String url_string = resourcePrefs.getValue(Constants.RETURN_URL, "");
			String url_cauHinh = resourcePrefs.getValue(MenuConfiguration.TRANG_GOI_CAU_HINH_MOT_CUA, "");
			String url_TraCuuHoSo = resourcePrefs.getValue(MenuConfiguration.TRANG_GOI_TRA_CUU_DANG_KIEM_VIEN, "");
			
			//qUAN LY HO SO Quáº£n trá»‹ ngÆ°á»�i dÃ¹ng
			String url_dang_kiem_vien = resourcePrefs.getValue(MenuConfiguration.TRANG_GOI_SETTING_DANG_KIEM_VIEN, "");
			String phanNhomDangKiemVien = resourcePrefs.getValue(MenuConfiguration.PHAN_NHOM_HO_SO_SETTING_DANG_KIEM_VIEN, "");
			
			//QUAN LY HO SO, QUAN LY TI GIA
			String url_ti_gia = resourcePrefs.getValue(MenuConfiguration.TRANG_GOI_SETTING_TI_GIA, "");
			String phanNhomTiGia = resourcePrefs.getValue(MenuConfiguration.PHAN_NHOM_HO_SO_SETTING_TI_GIA, "");
			
			//QUAN LY HO SO, QUAN LY RUI RO
			String quanLyRuiRoURL = resourcePrefs.getValue(MenuConfiguration.QUAN_LY_RUI_RO_URL, "");
			String quanLyRuiRoPhanNhom = resourcePrefs.getValue(MenuConfiguration.QUAN_LY_RUI_RO_PHAN_NHOM, "");
			
			//portlet quan ly monitor
			String url_monitor = resourcePrefs.getValue(MenuConfiguration.TRANG_GOI_SETTING_MONITOR, "");
			String phanNhomMonitor = resourcePrefs.getValue(MenuConfiguration.PHAN_NHOM_HO_SO_SETTING_MONITOR, "");
			
			//--man hinh ke hoach dich chuyen
			String url_kehoachdichchuyen = resourcePrefs.getValue(MenuConfiguration.TRANG_GOI_SETTING_KEHOACH_DICHCHUYEN, "");
			String phanNhomkehoachdichchuyen = resourcePrefs.getValue(MenuConfiguration.PHAN_NHOM_HO_SO_SETTING_KEHOACH_DICHCHUYEN, "");
			
			_log.debug("==changeMenu==maPhanNhom==========" + maPhanNhom);
			
			_log.debug("==changeMenu==url_string==========" + url_string);
			_log.debug("==changeMenu==url_cauHinh=========" + url_cauHinh);
			_log.debug("==changeMenu==url_TraCuuHoSo======" + url_TraCuuHoSo);
			_log.debug("==changeMenu==url_monitor==========" + url_monitor);
			
			_log.debug("==changeMenu==phanNhomDangKiemVien========" + phanNhomDangKiemVien);
			_log.debug("==changeMenu==url_dang_kiem_vien==" + url_dang_kiem_vien);
			
			_log.debug("==changeMenu==phanNhomTiGia=======" + phanNhomTiGia);
			_log.debug("==changeMenu==url_ti_gia==========" + url_ti_gia);
			
			
			
			
			if (phanNhomDangKiemVien != null && phanNhomDangKiemVien.trim().compareToIgnoreCase(maPhanNhom) == 0) {
				if (url_dang_kiem_vien != null && url_dang_kiem_vien.length() > 0) {
					_log.debug("==changeMenu==Portlet Quan ly ho so / Quan ly dang kiem vien-");
					httpSession.setAttribute(Constants.MENU_TRACUU_THONGTIN, "");
					httpReq.sendRedirect(PortalUtil.getPortalURL(actionRequest) + url_dang_kiem_vien);
				}
				
			} else if (quanLyRuiRoPhanNhom != null && quanLyRuiRoPhanNhom.trim().compareToIgnoreCase(maPhanNhom) == 0) {
				if (quanLyRuiRoURL != null && quanLyRuiRoURL.length() > 0) {
					_log.debug("==changeMenu==Portlet quan ly rui ro -");
					httpSession.setAttribute(Constants.MENU_TRACUU_THONGTIN, "");
					httpReq.sendRedirect(PortalUtil.getPortalURL(actionRequest) + quanLyRuiRoURL);
				}
			
			} else if (phanNhomTiGia != null && phanNhomTiGia.trim().compareToIgnoreCase(maPhanNhom) == 0) {
				if (url_ti_gia != null && url_ti_gia.length() > 0) {
					_log.debug("==changeMenu==Portlet Quan ly ho so / Quan ly ti gia -");
					httpSession.setAttribute(Constants.MENU_TRACUU_THONGTIN, "");
					httpReq.sendRedirect(PortalUtil.getPortalURL(actionRequest) + url_ti_gia);
				}
			
			//-----------
			} else if (phanNhomMonitor != null && phanNhomMonitor.trim().compareToIgnoreCase(maPhanNhom) == 0) {
				if (url_monitor != null && url_monitor.length() > 0) {
					_log.debug("==changeMenu==Portlet Quan ly ho so /Theo doi gui message-");
					httpSession.setAttribute(Constants.MENU_TRACUU_THONGTIN, "");
					httpReq.sendRedirect(PortalUtil.getPortalURL(actionRequest) + url_monitor);
				}
			
			//-------------------
			} else if (phanNhomkehoachdichchuyen != null && phanNhomkehoachdichchuyen.trim().compareToIgnoreCase(maPhanNhom) == 0) {
				if (url_kehoachdichchuyen != null && url_kehoachdichchuyen.length() > 0) {
					_log.debug("==changeMenu==ke hoach dich chuyen");
					httpSession.setAttribute(Constants.MENU_TRACUU_THONGTIN, "");
					httpReq.sendRedirect(PortalUtil.getPortalURL(actionRequest) + url_kehoachdichchuyen);
				}
				
			
			//----------------- -------------------------------------------------------------------------------------------------
			} else if (maPhanNhom != null && maPhanNhom.trim().compareToIgnoreCase(MenuConfiguration.TRANG_GOI_TRA_CUU_DANG_KIEM_VIEN) == 0) {
				if (url_TraCuuHoSo != null && url_TraCuuHoSo.length() > 0) {
					String menuTraCuThongTin = ParamUtil.getString(actionRequest, Constants.MENU_TRACUU_THONGTIN);
					_log.debug("==changeMenu==MenuTraCuuThongTin===" + menuTraCuThongTin);
					
					if (httpSession != null && maPhanNhom != null && maPhanNhom.trim().length() > 0) {
						httpSession.setAttribute(Constants.MENU_TRACUU_THONGTIN, menuTraCuThongTin);
						httpSession.removeAttribute(Constants.MAPHANNHOMHOSO);
					}
					
					_log.debug("==changeMenu==maPhanNhom==========" + maPhanNhom);
					_log.debug("==changeMenu==Tra cuu thong tin");
					httpReq.sendRedirect(PortalUtil.getPortalURL(actionRequest) + url_TraCuuHoSo);
				}
			} else if (maPhanNhom != null && maPhanNhom.trim().compareToIgnoreCase(MenuConfiguration.TRANG_GOI_CAU_HINH_MOT_CUA) == 0) {
				if (url_cauHinh != null && url_cauHinh.length() > 0) {
					_log.debug("==change cau hinh==");
					//httpReq.setRenderParameter("jspPage", PortalUtil.getPortalURL(resourceRequest) + url_cauHinh);
					httpReq.setRenderParameter("loaiConfig", loaiConfig);
					_log.debug("==changeMenu==Goi cau hinh mot cua");
					httpReq.sendRedirect(PortalUtil.getPortalURL(actionRequest) + url_cauHinh);
					
				}
			} else if (url_string != null && url_string.length() > 0) {
				
				httpSession.setAttribute(Constants.MENU_TRACUU_THONGTIN, "");
				httpReq.sendRedirect(PortalUtil.getPortalURL(actionRequest) + url_string);
			}
		} catch (Exception e) {
			_log.error(e);
		}
		_log.debug("==end  changeMenu: ");
		
		PortletConfig portletConfig = (PortletConfig)actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(actionRequest,  portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		SessionMessages.add(actionRequest,  portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
	@Override
	public void serveResource(ResourceRequest request, ResourceResponse response)
			throws IOException, PortletException {
		try {

			String type = ParamUtil.getString(request, "type");
//			_log.debug("type  "+type);
			if (type.equals("COUNT")) {
				getCount(request, response);
			}
		}catch (Exception e) {
		}
	}
	
	/**
	 * Fix performance by liemnn 03/03/2016
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	private void getCount(ResourceRequest request, ResourceResponse response)
			throws IOException {
		
		long loaiPhieuXuLy = ParamUtil.getLong(request,"loaiPhieuXuLy");
		long organizationId = ParamUtil.getLong(request, "organizationId");
		long idPhanNhomHoSo = ParamUtil.getLong(request, "idPhanNhomHoSo");
		String liRoleSelected = ParamUtil.getString(request, "liRoleSelected");
		long reset = ParamUtil.getLong(request, "reset",1);

		long countHoSo =  0;
		long userId =PortalUtil.getUserId(request);
		//_log.debug("=====show menu[userid="+userId+",loaiPhieuXuLy="+loaiPhieuXuLy+",organizationId="+organizationId+",idPhanNhomHoSo="+idPhanNhomHoSo+",liRoleSelected="+liRoleSelected+",reset="+reset);
		boolean isReset = true;
		if(reset == 0){
			//_log.debug("=====show menu cache");
			isReset=false;
		}else{
			//_log.debug("=====show menu not cache");
		}
		//TODO: FIX SAU
		isReset = true;
		//UserMenu menu = MenuCacheUtil.getCache(userId);
		String menuKey ="";
		//get value menu
		if (loaiPhieuXuLy == Constants.LOAIPHIEUXULY_PHIEU_CHINH) {
			//_log.debug("2.LOAIPHIEUXULY_PHIEU_CHINH");	
			if(idPhanNhomHoSo ==10){
				countHoSo =  MotCuaPhieuXuLyChinhLocalServiceUtil.countMotCuaPhieuXuLyChinhByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(null, 
						null, null, organizationId, idPhanNhomHoSo, null, null, null, null, null, 0);
				
			}else{
				//menuKey =getMenuKey(userId, loaiPhieuXuLy, organizationId, idPhanNhomHoSo, "LOAIPHIEUXULY_PHIEU_CHINH");
				//long value =menu.getValue(menuKey);
				//if(isReset || value <=0){
					countHoSo =  MotCuaPhieuXuLyChinhLocalServiceUtil.countMotCuaPhieuXuLyChinhByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(null, 
						null, null, organizationId, idPhanNhomHoSo, null, null, null, null, null, 0);
					//menu.getMenuValue().put(menuKey, countHoSo);
				//}else{
					//countHoSo= value;
					//_log.debug("2.LOAIPHIEUXULY_PHIEU_CHINH---cache:"+value);	
				//}
			}
			//ok fix by liemnn
		} else if (loaiPhieuXuLy == Constants.LOAIPHIEUXULY_PHIEU_PHU) {
			List<TthcPhanNhomHoSoVaiTro> liTthcPhanNhomHoSoVaiTros = TthcPhanNhomHoSoVaiTroLocalServiceUtil
					.findTthcPhanNhomHoSoVaiTroByPhanNhomHoSoAndVaiTroXuLy(idPhanNhomHoSo, liRoleSelected);
			String listNhomPhieuXuLy =  CommonUtils.getNhomPhieuXuLy(liTthcPhanNhomHoSoVaiTros);
			//get list cache
			
			if ((idPhanNhomHoSo == 24) ||(idPhanNhomHoSo == 29)) {
				//_log.debug("31.LOAIPHIEUXULY_PHIEU_PHU:24,29");
				//menuKey =getMenuKey(userId, loaiPhieuXuLy, organizationId, idPhanNhomHoSo, listNhomPhieuXuLy);
				//long value =menu.getValue(menuKey);
				//if(isReset || value <=0){
					
					countHoSo = PhanCongDonViKiemTraLocalServiceUtil.countLichKiemTraHienTruong(listNhomPhieuXuLy, organizationId, idPhanNhomHoSo
							, null, null, null, null, null, 0, null, null, null,PortalUtil.getUserId(request));
				//	menu.getMenuValue().put(menuKey, countHoSo);
				//}else{
				//	countHoSo= value;
					//_log.debug("31.LOAIPHIEUXULY_PHIEU_PHU:24,29--cache:"+countHoSo);
				//}
			} else if ((idPhanNhomHoSo == 25) 
					||(idPhanNhomHoSo == 26) 
					||(idPhanNhomHoSo ==20) 
					||(idPhanNhomHoSo ==21) 
					||(idPhanNhomHoSo ==19)) {
				//_log.debug("31.LOAIPHIEUXULY_PHIEU_PHU:25,26,20,21,19");
				
				//menuKey =getMenuKey(userId, loaiPhieuXuLy, organizationId, idPhanNhomHoSo, listNhomPhieuXuLy);
				//long value =menu.getValue(menuKey);
				//if(isReset || value <=0){	
					/*countHoSo = DaKiemTraLocalServiceUtil
							.countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra(null, null, PortalUtil.getUserId(request)
									,listNhomPhieuXuLy, organizationId, idPhanNhomHoSo, null, null, null, null, null,0);*/
					countHoSo = DaKiemTraLocalServiceUtil.countByMotCuaPhieuXuLyPhu(
								null, null, PortalUtil.getUserId(request),listNhomPhieuXuLy, 
								organizationId, idPhanNhomHoSo, null, null, null, null, null,0);
				//	menu.getMenuValue().put(menuKey, countHoSo);
				//}else{
				//	countHoSo= value;
					//_log.debug("31.LOAIPHIEUXULY_PHIEU_PHU:25,26,20,21,19--cache:"+countHoSo);
				//}
				
			} else if ((idPhanNhomHoSo == 14) ) {
				//_log.debug("31.LOAIPHIEUXULY_PHIEU_PHU:14");
				//menuKey =getMenuKey(userId, loaiPhieuXuLy, organizationId, idPhanNhomHoSo, listNhomPhieuXuLy);
				//long value =menu.getValue(menuKey);
				//if(isReset || value <=0){		
					
					countHoSo = PhanCongDonViKiemTraLocalServiceUtil.countPhanCongDonViKiemTraByHoSoThuTucId(listNhomPhieuXuLy
							, organizationId, idPhanNhomHoSo, null, null, null, null, null, 0, null, null, null);
				//	menu.getMenuValue().put(menuKey, countHoSo);
				//}else{
				//	countHoSo= value;
					//_log.debug("31.LOAIPHIEUXULY_PHIEU_PHU:14---cache:"+countHoSo);
				//}
			} else if ((idPhanNhomHoSo == 16) ) {
				//_log.debug("31.LOAIPHIEUXULY_PHIEU_PHU:16");
				//menuKey =getMenuKey(userId, loaiPhieuXuLy, organizationId, idPhanNhomHoSo, listNhomPhieuXuLy);
				//long value =menu.getValue(menuKey);
				//if(isReset || value <=0){	
					
					countHoSo = PhanCongDonViKiemTraLocalServiceUtil.countPhanCongKiemTraHienTruong(listNhomPhieuXuLy, organizationId, idPhanNhomHoSo
							, null, null, null, null, null, 0, null, null, null,PortalUtil.getUserId(request));
				//	menu.getMenuValue().put(menuKey, countHoSo);
				//}else{
				//	countHoSo= value;
				//}
			} else {
				//_log.debug("31.LOAIPHIEUXULY_PHIEU_PHU:else all");
				//menuKey =getMenuKey(userId, loaiPhieuXuLy, organizationId, idPhanNhomHoSo, listNhomPhieuXuLy);
				//long value =menu.getValue(menuKey);
				//if(isReset || value <=0){	
					
					countHoSo = MotCuaPhieuXuLyPhuLocalServiceUtil.countMotCuaPhieuXuLyPhuByHoSoThuTucId(listNhomPhieuXuLy, organizationId, idPhanNhomHoSo
							, null, null, null, null, null, 0);
				//	menu.getMenuValue().put(menuKey, countHoSo);
				//}else{
				//	countHoSo= value;
					//_log.debug("31.LOAIPHIEUXULY_PHIEU_PHU:16--cache:"+countHoSo);
				//}
			}
			
		}
		
		//MenuCacheUtil.mCache.put(userId, menu);
		
		//_log.debug("=====end show menu:");
	

//		JSONArray array = JSONFactoryUtil.createJSONArray();
		JSONObject json = null;
		json = JSONFactoryUtil.createJSONObject();
		json.put("msg", "success");
		json.put("countHoSo", countHoSo);
//		_log.debug("getCount "+countHoSo);

//		for (TthcThuTucHanhChinh item : lstTthc) {
//			json = JSONFactoryUtil.createJSONObject();
//			json.put("id", item.getId());
//			json.put("name", item.getTenThuTuc());
//			array.put(json);
//		}
		PrintWriter out = response.getWriter();
//		_log.debug(json.toString());
		out.print(json.toString());
	}
	
	/*private String getMenuKey(long userId,long loaiPhieuXuLy,long organizationId,
			long idPhanNhomHoSo,String listNhomPhieuXuLy){
		StringBuffer key = new StringBuffer("");
		key.append("KEY");
		key.append(userId);
		key.append(loaiPhieuXuLy);
		key.append(organizationId);
		key.append(idPhanNhomHoSo);
		key.append(listNhomPhieuXuLy);
		return key.toString();
	}*/

}
