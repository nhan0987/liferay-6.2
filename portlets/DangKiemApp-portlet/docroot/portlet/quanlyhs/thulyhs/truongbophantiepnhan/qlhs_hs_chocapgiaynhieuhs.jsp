<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="com.liferay.portal.kernel.servlet.ServletContextUtil"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="vn.dtt.gt.dk.utils.codec.FileKySoUtils"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyChinhLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoVaiTroLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo"%>
<%@page import="vn.dtt.gt.dk.utils.format.CommonUtils"%>
<%@page import="vn.dtt.gt.dk.utils.config.DKConfigurationManager"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupImpl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyPhuLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord"%>
<%@page import="vn.dtt.gt.dk.report.ReportConstant"%>
<%@page import="vn.dtt.gt.dk.report.ReportUtils"%>
<%@page import="vn.dtt.gt.dk.report.ReportBusinessUtils"%>
<%@page import="vn.dtt.gt.dk.report.ReportFunction"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceWrapper"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup"%>
<%@page import="vn.dtt.gt.dk.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection"%>
<%@ include file="/portlet/init.jsp"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% long javaScriptLastModified = ServletContextUtil.getLastModified(application, "/js/", true); %>
<script type="text/javascript" src='<%= PortalUtil.getStaticResourceURL(request, request.getContextPath() + "/js/kynhieuhoso.js", javaScriptLastModified) %>'></script>
<%

	String tenThuTuc = ParamUtil.getString(request, Constants.TEN_THU_TUC);
	String soHoSo = ParamUtil.getString(request, Constants.SO_HO_SO);
	String doanhNghiep = ParamUtil.getString(request, Constants.DOANH_NGHIEP);
	String ngayNopHsFrom = ParamUtil.getString(request, Constants.NGAY_NOP_HO_SO_FROM);
	String ngayNopHsTo = ParamUtil.getString(request, Constants.NGAY_NOP_HO_SO_TO);
	String namNhap = ParamUtil.getString(request, Constants.NAM_NHAP);
	
	String idHoSoThuTuc = ParamUtil.getString(request, Constants.ID_HO_SO_THU_TUC);

	String idthuTucHanhChinh = ParamUtil.getString(request, Constants.TTHC_THUTUCHANHCHINH_ID);
	
	HttpSession httpSession = null;
	try {
		httpSession = PortalUtil.getHttpServletRequest(renderRequest).getSession();
	} catch (Exception es) { }
	
	String idPhanNhomHoSo = "";
	if (httpSession != null) {
		Object obj = httpSession.getAttribute(Constants.MAPHANNHOMHOSO);
		if (obj != null) {
			idPhanNhomHoSo = obj.toString();
		} else {
			idPhanNhomHoSo = "";
		}
	}
	long longTotal = 0;
	long organizationId = 0;
	if (themeDisplay.getUser().getOrganizations() != null && themeDisplay.getUser().getOrganizations().size() > 0) {
		organizationId = themeDisplay.getUser().getOrganizations().get(0).getOrganizationId();
	}
	List<TthcHoSoThuTuc> results = new ArrayList<TthcHoSoThuTuc>();
	List<MotCuaPhieuXuLyPhu> resultsCuaPhieuXuLyPhus = new ArrayList<MotCuaPhieuXuLyPhu>(); 
	List<MotCuaPhieuXuLyChinh> resultMcPhieuXyLyChinhs = new ArrayList<MotCuaPhieuXuLyChinh>();
	if(organizationId > 0){
	String liRoleSelected = CommonUtils.checkRole(themeDisplay);

	List<TthcPhanNhomHoSoVaiTro> liTthcPhanNhomHoSoVaiTros = TthcPhanNhomHoSoVaiTroLocalServiceUtil.findTthcPhanNhomHoSoVaiTroByPhanNhomHoSoAndVaiTroXuLy(ConvertUtil.convertToLong(idPhanNhomHoSo), liRoleSelected);
	String listNhomPhieuXuLy =  CommonUtils.getNhomPhieuXuLy(liTthcPhanNhomHoSoVaiTros);
	
	resultMcPhieuXyLyChinhs = MotCuaPhieuXuLyChinhLocalServiceUtil.findMotCuaPhieuXuLyChinhByHoSoThuTucId(listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep, ConvertUtil.convertToInt(namNhap), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	longTotal = MotCuaPhieuXuLyChinhLocalServiceUtil.countMotCuaPhieuXuLyChinhByHoSoThuTucId(listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep, ConvertUtil.convertToInt(namNhap));
	}

%>

<%
	// Ghi actionlog
	String tenPhanNhomHoSo = "";
	if (idPhanNhomHoSo != null && idPhanNhomHoSo.trim().length() > 0) {
		TthcPhanNhomHoSo roTrangThaiHoSo = TthcPhanNhomHoSoLocalServiceUtil.fetchTthcPhanNhomHoSo(ConvertUtil.convertToLong(idPhanNhomHoSo));
		if (roTrangThaiHoSo != null && roTrangThaiHoSo.getTenPhanNhom().length() > 0){
			tenPhanNhomHoSo = roTrangThaiHoSo.getTenPhanNhom();
		}
		
	}	
	
	String noidungthaotac = "Mở xem Cấp giấy ĐKKT nhiều hồ sơ - [" + tenPhanNhomHoSo + "] thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) ; 
	String tenmanhinhdaidien = "Cấp giấy ĐKKT nhiều hồ sơ - [" + tenPhanNhomHoSo + "]";
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(ConvertUtil.convertToLong(idHoSoThuTuc), null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);
%>
<script type="text/javascript">
var hoSoThuTucList = new Array();
</script>

<portlet:actionURL var="kyXacNhanDangKyKiemTraNhieuHoSo" name="kyXacNhanDangKyKiemTraNhieuHoSo">
	<portlet:param name="<%=Constants.DIEU_KIEN_CHUYEN_DICH %>" value="<%=Constants.DIEU_KIEN_DICH_CHUYEN_PHU_HOP_QUY_DINH %>"/>
	<portlet:param name="<%=Constants.THANH_PHAN_XU_LY %>" value="<%=Constants.XU_LY_TLHS %>"/>
	<portlet:param name="<%=Constants.TEN_THU_TUC %>" value="<%=tenThuTuc %>"/>
	<portlet:param name="<%=Constants.SO_HO_SO %>" value="<%=soHoSo %>"/>
	<portlet:param name="<%=Constants.DOANH_NGHIEP %>" value="<%=doanhNghiep %>"/>
	<portlet:param name="<%=Constants.NGAY_NOP_HO_SO_FROM %>" value="<%=ngayNopHsFrom %>"/>
	<portlet:param name="<%=Constants.NGAY_NOP_HO_SO_TO %>" value="<%=ngayNopHsTo %>"/>
</portlet:actionURL>

<portlet:actionURL var="kyXacNhanDangKyHs" name="kyXacNhanDangKyHs">
	<portlet:param name="<%=Constants.DIEU_KIEN_CHUYEN_DICH %>" value="<%=Constants.DIEU_KIEN_DICH_CHUYEN_PHU_HOP_QUY_DINH %>"/>
</portlet:actionURL>

<%
//quay lai trang
PortletURL renderBackURL = renderResponse.createRenderURL();
renderBackURL.setParameter("jspPage", "/portlet/quanlyhs/search_content.jsp");
renderBackURL.setParameter(Constants.ID_HO_SO_THU_TUC, StringUtil.valueOf(idHoSoThuTuc));
renderBackURL.setParameter(Constants.TTHC_THUTUCHANHCHINH_ID, idthuTucHanhChinh);
%>
<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
		<aui:form action="<%=kyXacNhanDangKyHs.toString()%>" name="kyXacNhanKiemTra" id="kyXacNhanKiemTra" method="POST">
		
			<div id="kyXacNhan">
				<div>
					<p style="text-align: left;">
					<h5 class="tieude">
						<span style="font-size: 13px; font-weight: bold;"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.truongbophantiepnhan.qlhshschocapgiaynhieuhs.danhsachhosochokyduyet"/></span>
					</h5>
					<h5></h5>
					</p>
				</div>
				<input type='hidden' id='listHoSoThuTucId' name='listHoSoThuTucId' value='' >
				<table class="wd-table table">
					<thead>
						<tr>
							<th><liferay-ui:message key="vn.gt.dk.qlhs.stt" /></th>
							<td align = 'center'><input id = "check_all" name ="check_all" type="checkbox" onclick="checkAll();"/></td>
							<th width="30%"><liferay-ui:message key="vn.gt.dk.qlhs.tthc" /></th>
							<th><liferay-ui:message key="vn.gt.dk.qlhs.maso" /></th>
							<th><liferay-ui:message key="vn.gt.dk.qlhs.ngaynop" /></th>
							<th><liferay-ui:message key="vn.gt.dk.qlhs.tendoanhnghiep" /></th>
							<th width="15%"><liferay-ui:message key="vn.gt.dk.qlhs.noidung" /></th>
							<th width="15%"><liferay-ui:message key="vn.gt.dk.qlhs.ghichu" /></th>
						</tr>
					</thead>
					<tbody>
				<%
			
					TthcHoSoThuTuc hoSoThuTuc = null;
					TthcThuTucHanhChinh tthcThuTucHanhChinh = null;
					int index = 0;
					int i=0;
					for (MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh : resultMcPhieuXyLyChinhs) {
						
						hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(motCuaPhieuXuLyChinh.getHoSoThuTucId());
						tthcThuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(hoSoThuTuc.getThuTucHanhChinhId());
						
						%>
						<script type="text/javascript">
						hoSoThuTucList[<%=index++%>] = "<%=hoSoThuTuc.getId()%>";
						</script>
						<tr>
							<td class="text-center"><%= ++i%></td>
							<td align = "center"><input type='checkbox' id='<%=hoSoThuTuc.getId() %>' style=';' class='user'  onclick="changeajax('<%=hoSoThuTuc.getId() %>');"/></td>
							<td class="text-left"><%=tthcThuTucHanhChinh.getTenThuTuc() %></td>
							<td class="text-center"><%=hoSoThuTuc.getMaSoHoSo() %></td>
							<td class="text-center"><%=ConvertUtil.parsefulldateToString(hoSoThuTuc.getNgayGuiHoSo()) %></td>
							<td><span class="text-left"><%=hoSoThuTuc.getTenChuHoSo() %></span></td>
							<td class="text-left"><%=hoSoThuTuc.getTrichYeuNoiDung()%></td>
							<td class="text-left"><%=hoSoThuTuc.getGhiChu()%></td>
										<input type='hidden' id="fileContent_<%=hoSoThuTuc.getId()%>" name="fileContent_<%=hoSoThuTuc.getId()%>" value=""/>
										<input type='hidden' id="is_kySo_<%=hoSoThuTuc.getId()%>" name="is_kySo_<%=hoSoThuTuc.getId()%>" value=""/>
							
						</tr>
					<%
					}
					%>
					</tbody> 
				</table>
				<br>
				<input type="checkbox" checked id="xacNhanKyDuyet" class='user'><label for="xacNhanKyDuyet"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.truongbophantiepnhan.qlhshschocapgiaynhieuhs.xacnhandongykyduyet"/></label>
				<div id="divXacNhan">
					<aui:button-row>
						<button type="button" id="kyBanCoYeu" name="kyBanCoYeu" value="" onclick="kyBanCoYeuNhieuHS()" class="btnThuLyHS form-control">Ký số BCY</button>
						<a href="<%=renderBackURL.toString()%>"><button type="button" class="btnThuLyHS form-control" style="width: 100px !important;"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.truongbophantiepnhan.qlhshschocapgiaynhieuhs.quaylai"/></button></a>
					</aui:button-row>
				</div>
				
				<div id="thongBaoLoading"></div>
			</div>
		</aui:form>
	</div>
</div>

<portlet:resourceURL var="getDataAjax">
</portlet:resourceURL>

<portlet:actionURL var="signatureURL" name="signature"></portlet:actionURL>

<object id="plugin0" type="application/x-cryptolib05plugin" width="0" height="0"></object>

<script type="text/javascript">
	var plugin = function plugin0() {
		return document.getElementById('plugin0');
	}
	
	var url = '<%=getDataAjax%>';
	var complateSignatureURL = '<%=signatureURL%>';
	var kyNhieuHoSo=0;
	$(document).ready(function(){
		var refreshId=setInterval( function() 
		{	
			if (kyNhieuHoSo==1){
				document.getElementById('<portlet:namespace/>kyXacNhanKiemTra').submit();
				clearInterval(refreshId);
			}
			
		}, 8000);
	});

	function changeajax(dataId) {
		
		var isCheck=document.getElementById(dataId).checked;
		var isCheckInternal = true;
		var listHoSoThuTucId=document.getElementById('listHoSoThuTucId').value;
		if (isCheck==true){
			//alert("--true");
			listHoSoThuTucId=listHoSoThuTucId+dataId+", ";
			for ( var i = 0; i < hoSoThuTucList.length; i++) {
				isCheckInternal = document.getElementById(hoSoThuTucList[i]).checked;
				if(isCheckInternal == false){
					break;
				}
			}
			document.getElementById("check_all").checked = isCheckInternal;
		}else{
			//alert("--false");
			var res = listHoSoThuTucId.replace(dataId+", ", "");
			document.getElementById("check_all").checked = false;
			listHoSoThuTucId=res;
		}
		document.getElementById('listHoSoThuTucId').value=listHoSoThuTucId;
	}

	function checkAll() {
		
		var isCheck1=document.getElementById('check_all').checked;
		var listHoSoThuTucId="";

		if (isCheck1==true){
			for ( var i = 0; i < hoSoThuTucList.length; i++) {
				document.getElementById(hoSoThuTucList[i]).checked = "checked";
				listHoSoThuTucId = listHoSoThuTucId + hoSoThuTucList[i] + ", ";
			}
			document.getElementById('listHoSoThuTucId').value = listHoSoThuTucId;
		} else {
			for ( var i = 0; i < hoSoThuTucList.length; i++) {
				document.getElementById(hoSoThuTucList[i]).checked = '';
			}
			document.getElementById('listHoSoThuTucId').value = '';
		}
	}


	var idthuTucHanhChinh='<%=idthuTucHanhChinh%>';
	var dieuKienChuyenDich='<%=Constants.DIEU_KIEN_DICH_CHUYEN_PHU_HOP_QUY_DINH%>';
	var idHoSoThuTuc='<%=idHoSoThuTuc%>';
</script>