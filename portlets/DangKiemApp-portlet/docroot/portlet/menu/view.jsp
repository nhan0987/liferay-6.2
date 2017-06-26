<%@page import="vn.dtt.gt.dk.portlet.menu.cache.MenuCacheUtil"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.DaKiemTraLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.LichKiemTraHienTruongLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.PhanCongDonViKiemTraLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.portlet.menu.MenuAction"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyChinhLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.portlet.menu.MenuConfiguration"%>
<%@page import="vn.dtt.gt.dk.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoVaiTroLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyPhuLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu"%>
<%@page import="com.liferay.portlet.PortletPreferencesFactoryUtil"%>
<%@page import="vn.dtt.gt.dk.utils.format.CommonUtils"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo"%>
<%@page import="com.liferay.portal.model.Role"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>

<%@ include file="/portlet/init.jsp"%>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" language="java"%>

<%! private static Log _log = LogFactoryUtil.getLog(MenuAction.class); %>
<portlet:resourceURL var="getDataAjax">
</portlet:resourceURL>
<script type="text/javascript">

	function getCount(loaiPhieuXuLy, organizationId, idPhanNhomHoSo, liRoleSelected,reset) {		
		$.ajax({
			type : 'POST',
			url : '<%=getDataAjax%>',	
			cache: false,
			data : {
				type:'COUNT',
				loaiPhieuXuLy:loaiPhieuXuLy,
				organizationId:organizationId,
				idPhanNhomHoSo:idPhanNhomHoSo,
				liRoleSelected:liRoleSelected,
				reset:reset,
			},
			success : function(data) {
				
				//if(data){
					var jsonData = JSON.parse(data);
					var msg = jsonData.msg;
					if(msg == 'success'){
				
						var countHoSo = jsonData.countHoSo;
						//document.getElementById(idPhanNhomHoSo).value = countHoSo;
						$('#'+idPhanNhomHoSo).text(countHoSo);
						
					}
					
				//}
			},
			  error: function(){
			  
			  }
		  
	});
	}
</script>
<%

	//boolean isReset = MenuCacheUtil.isReset(PortalUtil.getUserId(request));
	String reset ="0";
	//if(isReset){
	//	reset="1";
	//}
	
	PortletPreferences resourcePrefsMenu = PortletPreferencesFactoryUtil.getPortletSetup(renderRequest);

	String phanNhomHoSoQuanLyDangKiem = resourcePrefsMenu.getValue(MenuConfiguration.PHAN_NHOM_HO_SO_SETTING_DANG_KIEM_VIEN, "");
	String phanNhomHoSoQuanLyTiGia = resourcePrefsMenu.getValue(MenuConfiguration.PHAN_NHOM_HO_SO_SETTING_TI_GIA, "");
	String phanNhomHoSoQuanLyMonitor = resourcePrefsMenu.getValue(MenuConfiguration.PHAN_NHOM_HO_SO_SETTING_MONITOR, "");
	String phanNhomHoSoQuanLyKehoachchuyendich = resourcePrefsMenu.getValue(MenuConfiguration.PHAN_NHOM_HO_SO_SETTING_KEHOACH_DICHCHUYEN, "");
	String phanNhomHoSoQuanLyRuiRo = resourcePrefsMenu.getValue(MenuConfiguration.QUAN_LY_RUI_RO_PHAN_NHOM, "");
	
	HttpSession httpSession = null;
	try {
		httpSession = PortalUtil.getHttpServletRequest(renderRequest).getSession();
	} catch (Exception es) {}
	
	String maPhanNhom = "";
	if (httpSession != null) {
		Object obj = httpSession.getAttribute(Constants.MAPHANNHOMHOSO);
		if (obj != null) {
			maPhanNhom = obj.toString();
		} else {
			maPhanNhom = "";
		}
	}
	
	_log.debug("==menu/view.jsp==maPhanNhom===" + maPhanNhom);
	
	long organizationId = 0;
	if (themeDisplay.getUser().getOrganizations() != null && themeDisplay.getUser().getOrganizations().size() > 0) {
		organizationId = themeDisplay.getUser().getOrganizations().get(0).getOrganizationId();
	}
	long countHoSo = 0;
	List<TthcPhanNhomHoSo> liPhanNhomHoSos = new ArrayList<TthcPhanNhomHoSo>();
	
	String liRoleSelected = CommonUtils.checkRole(themeDisplay);
	if (liRoleSelected != null && liRoleSelected.trim().length() > 0) {
		if (httpSession != null) {
			liPhanNhomHoSos	=(List<TthcPhanNhomHoSo>)httpSession.getAttribute("MENU_LIST_DANGKIEM");
			if(liPhanNhomHoSos == null || liPhanNhomHoSos.size() <=0){
				liPhanNhomHoSos = TthcPhanNhomHoSoLocalServiceUtil.findTthcPhanNhomHoSoByVaTroXuLy(liRoleSelected);
				httpSession.setAttribute("MENU_LIST_DANGKIEM",liPhanNhomHoSos);
			}
			
		}else{
			liPhanNhomHoSos = TthcPhanNhomHoSoLocalServiceUtil.findTthcPhanNhomHoSoByVaTroXuLy(liRoleSelected);
		}
	}
	
	//menu-item tra cuu thong tin 
	String menuTraCuuThongTin = "";
	if (httpSession != null) {
		Object obj = httpSession.getAttribute(Constants.MENU_TRACUU_THONGTIN);
		if (obj != null) {
			menuTraCuuThongTin = obj.toString();
		} else {
			menuTraCuuThongTin = "";
		}
	}
	_log.debug("==menu/view.jsp==menuTraCuuThongTin===" + menuTraCuuThongTin);
	
	//menu-item xuat bao cao thong ke 
		String menuXuatBaoCao = "";
		if (httpSession != null) {
			Object obj = httpSession.getAttribute(Constants.MENU_BAOCAO_THONGKE);
			if (obj != null) {
				menuXuatBaoCao = obj.toString();
			} else {
				menuXuatBaoCao = "";
			}
		}
		_log.debug("==menu/view.jsp==menuXuatBaoCao===" + menuXuatBaoCao);
%>
<div id="cot1" class="col-xs-12 col-sm-11 col-md-12">
	<ul class="menu">
		<li class="cap1 fa-xd"><a class="textc1" href='#'><i class="mr5 fa-w fa fa-file-text fa-2"></i><liferay-ui:message key="vn.gt.dk.qlhs.menu.title" /></a>
			<ul class="sub">
				<%
				for (TthcPhanNhomHoSo tthcPhanNhomHoSo : liPhanNhomHoSos) {
					long idPhanNhomHoSo = tthcPhanNhomHoSo.getId();
					countHoSo =  0;					
				
					//set maPhanNhom vao session, default la 10. first
					if (maPhanNhom != null && maPhanNhom.trim().length() == 0) {
						maPhanNhom = String.valueOf(tthcPhanNhomHoSo.getId());
						if (httpSession != null) {
							httpSession.setAttribute(Constants.MAPHANNHOMHOSO, maPhanNhom);
						}
					}
				%>
					<portlet:actionURL var="xemThanhPhanHoSoThuTuc">
						<portlet:param name="jspPage" value="/portlet/view.jsp" />
						<portlet:param name="<%=Constants.MAPHANNHOMHOSO%>" value="<%=String.valueOf(tthcPhanNhomHoSo.getId())%>" />
						<portlet:param name="<%=ActionRequest.ACTION_NAME%>" value="changeMenu" />
					</portlet:actionURL>
				<%
					String requestUrl = themeDisplay.getURLCurrent().replaceAll("%2F", "/");
					_log.debug("==menu/view.jsp==requestUrl===" + requestUrl);
					_log.debug("==menu/view.jsp==phanNhomHoSoQuanLyDangKiem===" + phanNhomHoSoQuanLyDangKiem);
					
					if (maPhanNhom.compareToIgnoreCase(String.valueOf(tthcPhanNhomHoSo.getId())) == 0 && menuTraCuuThongTin.length() == 0) {
						
						
						if (phanNhomHoSoQuanLyDangKiem != null && phanNhomHoSoQuanLyDangKiem.trim().compareToIgnoreCase(String.valueOf(tthcPhanNhomHoSo.getId())) == 0) {
							%>
							<li class="liactiv"><a href='<%=xemThanhPhanHoSoThuTuc%>' onclick=""><%=tthcPhanNhomHoSo.getTenPhanNhom() %></a></li>
							<%
						
						//-----------
						} else if (phanNhomHoSoQuanLyRuiRo != null && phanNhomHoSoQuanLyRuiRo.trim().compareToIgnoreCase(String.valueOf(tthcPhanNhomHoSo.getId())) == 0) {
							%>
							<li class="liactiv"><a href='<%=xemThanhPhanHoSoThuTuc%>' onclick=""><%=tthcPhanNhomHoSo.getTenPhanNhom() %></a></li>
							<%
						
						//-----------
						} else if (phanNhomHoSoQuanLyTiGia != null && phanNhomHoSoQuanLyTiGia.trim().compareToIgnoreCase(String.valueOf(tthcPhanNhomHoSo.getId())) == 0) {
							%>
							<li class="liactiv"><a href='<%=xemThanhPhanHoSoThuTuc%>' onclick=""><%=tthcPhanNhomHoSo.getTenPhanNhom() %></a></li>
							<%
						
						//-----------
						} else if (phanNhomHoSoQuanLyMonitor != null && phanNhomHoSoQuanLyMonitor.trim().compareToIgnoreCase(String.valueOf(tthcPhanNhomHoSo.getId())) == 0) {
							%>
							<li class="liactiv"><a href='<%=xemThanhPhanHoSoThuTuc%>' onclick=""><%=tthcPhanNhomHoSo.getTenPhanNhom() %></a></li>
							<%
						//----------
						} else if (phanNhomHoSoQuanLyKehoachchuyendich != null && phanNhomHoSoQuanLyKehoachchuyendich.trim().compareToIgnoreCase(String.valueOf(tthcPhanNhomHoSo.getId())) == 0) {
							%>
							<li class="liactiv"><a href='<%=xemThanhPhanHoSoThuTuc%>' onclick=""><%=tthcPhanNhomHoSo.getTenPhanNhom() %></a></li>
							<%
						} else {
							if (requestUrl.contains("/group/dang-kiem/setting")) {
								%>
								<li class=""><a href='<%=xemThanhPhanHoSoThuTuc%>' onclick=""><span class="boxhong badge pull-right"></span><%=tthcPhanNhomHoSo.getTenPhanNhom() %></a></li>
								
							<%} else if (requestUrl.contains("/group/dang-kiem/ti-gia")) { %>
							
								<li class=""><a href='<%=xemThanhPhanHoSoThuTuc%>' onclick=""><span class="boxhong badge pull-right"></span><%=tthcPhanNhomHoSo.getTenPhanNhom() %></a></li>
								
							<%} else if (requestUrl.contains("/group/dang-kiem/monitor")) { %>
							
								<li class=""><a href='<%=xemThanhPhanHoSoThuTuc%>' onclick=""><span class="boxhong badge pull-right"></span><%=tthcPhanNhomHoSo.getTenPhanNhom() %></a></li>
							<%} else if (requestUrl.contains("/group/dang-kiem/kehoachdichchuyen")) {%>
							
							<%} else {
								%>
								<li class="liactiv"><a href='<%=xemThanhPhanHoSoThuTuc%>' onclick=""><span class="boxhong badge pull-right countmenu"  id="<%=idPhanNhomHoSo%>"><%=countHoSo %></span><%=tthcPhanNhomHoSo.getTenPhanNhom() %></a></li>
								<script type="text/javascript">
								getCount('<%=tthcPhanNhomHoSo.getLoaiPhieuXuLy()%>', '<%=organizationId%>','<%= idPhanNhomHoSo%>', '<%=liRoleSelected%>','<%=reset%>');
								</script>
								<%
							}
						}
						
					} else {
						if (phanNhomHoSoQuanLyDangKiem != null && phanNhomHoSoQuanLyDangKiem.trim().compareToIgnoreCase(String.valueOf(tthcPhanNhomHoSo.getId())) == 0) {
							
							if (requestUrl.contains("/group/dang-kiem/setting")) {
								%>
								<li class="liactiv"><a href='<%=xemThanhPhanHoSoThuTuc%>'><%=tthcPhanNhomHoSo.getTenPhanNhom() %></a></li>
							<%} else {
								%>
								<li><a href='<%=xemThanhPhanHoSoThuTuc%>'><%=tthcPhanNhomHoSo.getTenPhanNhom() %></a></li>
								<%
							}
						} else if (phanNhomHoSoQuanLyTiGia != null && phanNhomHoSoQuanLyTiGia.trim().compareToIgnoreCase(String.valueOf(tthcPhanNhomHoSo.getId())) == 0) {
							if (requestUrl.contains("/group/dang-kiem/ti-gia")) {
								%>
								<li class="liactiv"><a href='<%=xemThanhPhanHoSoThuTuc%>'><%=tthcPhanNhomHoSo.getTenPhanNhom() %></a></li>
							<%} else {
								%>
								<li><a href='<%=xemThanhPhanHoSoThuTuc%>'><%=tthcPhanNhomHoSo.getTenPhanNhom() %></a></li>
								<%
							}
						} else if (phanNhomHoSoQuanLyMonitor != null && phanNhomHoSoQuanLyMonitor.trim().compareToIgnoreCase(String.valueOf(tthcPhanNhomHoSo.getId())) == 0) {
							if (requestUrl.contains("/group/dang-kiem/monitor")) {
								%>
								<li class="liactiv"><a href='<%=xemThanhPhanHoSoThuTuc%>'><%=tthcPhanNhomHoSo.getTenPhanNhom() %></a></li>
								<%
							} else {
								%>
								<li><a href='<%=xemThanhPhanHoSoThuTuc%>'><%=tthcPhanNhomHoSo.getTenPhanNhom() %></a></li>
								<%
							}
						
						} else if (phanNhomHoSoQuanLyKehoachchuyendich != null && phanNhomHoSoQuanLyKehoachchuyendich.trim().compareToIgnoreCase(String.valueOf(tthcPhanNhomHoSo.getId())) == 0) {
							if (requestUrl.contains("/group/dang-kiem/kehoachdichchuyen")) {
								%>
								<li class="liactiv"><a href='<%=xemThanhPhanHoSoThuTuc%>'><%=tthcPhanNhomHoSo.getTenPhanNhom() %></a></li>
								<%
							} else {
								%>
								<li><a href='<%=xemThanhPhanHoSoThuTuc%>'><%=tthcPhanNhomHoSo.getTenPhanNhom() %></a></li>
								<%
							}
						} else {
							%>
							<li><a href='<%=xemThanhPhanHoSoThuTuc%>'><span class="boxvang badge pull-right countmenu"  id="<%=idPhanNhomHoSo%>"><%=countHoSo %></span><%=tthcPhanNhomHoSo.getTenPhanNhom() %></a></li>
							<script type="text/javascript">
								getCount('<%=tthcPhanNhomHoSo.getLoaiPhieuXuLy()%>', '<%=organizationId%>','<%= idPhanNhomHoSo%>', '<%=liRoleSelected%>','<%=reset%>');
								</script>
							<%
						}
					}
				}
				%>
			</ul>
		</li>
		
		<!------------- Tra cuu thong tin ------------->
		<li class="cap1 fa-xd"><a class="textc1" href='#'><i class="mr5 fa-w fa fa-search fa-2" style="width: 43px;"></i><liferay-ui:message key="vn.gt.dk.menu.view.tracuuthongtin"/></a>
			<ul class="sub">
				<li <%=menuTraCuuThongTin.equalsIgnoreCase("tra_cuu_chung_chi") ? "class='liactiv'" : "class=''"%>>
					<portlet:actionURL var="traCuuChungChiURL">
						<portlet:param name="jspPage" value="/portlet/view.jsp" />
						<portlet:param name="<%=Constants.MAPHANNHOMHOSO%>" value="<%=MenuConfiguration.TRANG_GOI_TRA_CUU_DANG_KIEM_VIEN%>" />
						<portlet:param name="<%=ActionRequest.ACTION_NAME%>" value="changeMenu" />
						<portlet:param name="<%=Constants.MENU_TRACUU_THONGTIN%>" value="tra_cuu_chung_chi" />
					</portlet:actionURL>
					<a href='<%=traCuuChungChiURL%>' onclick="#"><liferay-ui:message key="vn.gt.dk.menu.view.tracuuthongtin.tracuuchungchi"/></a>
				</li>
				<li <%=menuTraCuuThongTin.equalsIgnoreCase("tim_kiem_ho_so") ? "class='liactiv'" : "class=''"%>>
					<portlet:actionURL var="timKiemHoSoURL">
						<portlet:param name="jspPage" value="/portlet/view.jsp" />
						<portlet:param name="<%=Constants.MAPHANNHOMHOSO%>" value="<%=MenuConfiguration.TRANG_GOI_TRA_CUU_DANG_KIEM_VIEN%>" />
						<portlet:param name="<%=ActionRequest.ACTION_NAME%>" value="changeMenu" />
						<portlet:param name="<%=Constants.MENU_TRACUU_THONGTIN%>" value="tim_kiem_ho_so" />
					</portlet:actionURL>
					<a href='<%=timKiemHoSoURL%>' onclick="#"><liferay-ui:message key="vn.gt.dk.menu.view.tracuuthongtin.timkiemhoso"/></a>
				</li>
				<li <%=menuTraCuuThongTin.equalsIgnoreCase("tra_cuu_phuong_tien") ? "class='liactiv'" : "class=''"%>>
					<portlet:actionURL var="timKiemHoSoURL">
						<portlet:param name="jspPage" value="/portlet/view.jsp" />
						<portlet:param name="<%=Constants.MAPHANNHOMHOSO%>" value="<%=MenuConfiguration.TRANG_GOI_TRA_CUU_DANG_KIEM_VIEN%>" />
						<portlet:param name="<%=ActionRequest.ACTION_NAME%>" value="changeMenu" />
						<portlet:param name="<%=Constants.MENU_TRACUU_THONGTIN%>" value="tra_cuu_phuong_tien" />
					</portlet:actionURL>
					<a href='<%=timKiemHoSoURL%>' onclick="#"><liferay-ui:message key="vn.gt.dk.menu.view.tracuuthongtin.tracuuphuongtiennhapkhau"/></a>
				</li>
			</ul>
		</li>
		
		<!------------- Bao cao thong ke ------------->
		<li class="cap1 fa-xd"><a class="textc1" href='#'><i class="mr5 fa-w fa fa-bar-chart-o fa-2"  style="width: 43px;"></i><liferay-ui:message key="vn.gt.dk.menu.view.baocaothongke"/></a>
		<ul class="sub">
			<li <%=menuTraCuuThongTin.equalsIgnoreCase("xuat_bao_cao_thong_ke") ? "class='liactiv'" : "class=''"%>>
					<portlet:actionURL var="xuatBaoCaoThongKeURL">
						<portlet:param name="jspPage" value="/portlet/view.jsp" />
						<portlet:param name="<%=Constants.MAPHANNHOMHOSO%>" value="<%=MenuConfiguration.TRANG_GOI_TRA_CUU_DANG_KIEM_VIEN%>" />
						<portlet:param name="<%=ActionRequest.ACTION_NAME%>" value="changeMenu" />
						<portlet:param name="<%=Constants.MENU_TRACUU_THONGTIN%>" value="xuat_bao_cao_thong_ke" />
					</portlet:actionURL>
					<a href='<%=xuatBaoCaoThongKeURL%>' onclick="#"><liferay-ui:message key="vn.gt.dk.menu.view.baocaothongke"/></a>
			</li>
			<li <%=menuTraCuuThongTin.equalsIgnoreCase("man_hinh_theo_doi_ho_so_truc_tuyen") ? "class='liactiv'" : "class=''"%>>
					<portlet:actionURL var="xuatBaoCaoThongKeURL">
						<portlet:param name="jspPage" value="/portlet/view.jsp" />
						<portlet:param name="<%=Constants.MAPHANNHOMHOSO%>" value="<%=MenuConfiguration.TRANG_GOI_TRA_CUU_DANG_KIEM_VIEN%>" />
						<portlet:param name="<%=ActionRequest.ACTION_NAME%>" value="changeMenu" />
						<portlet:param name="<%=Constants.MENU_TRACUU_THONGTIN%>" value="man_hinh_theo_doi_ho_so_truc_tuyen" />
					</portlet:actionURL>
					<a href='<%=xuatBaoCaoThongKeURL%>' onclick="#">Màn hình theo dõi trực tuyến</a>
			</li>
		</ul>
		
		</li>
			
	</ul>
</div>