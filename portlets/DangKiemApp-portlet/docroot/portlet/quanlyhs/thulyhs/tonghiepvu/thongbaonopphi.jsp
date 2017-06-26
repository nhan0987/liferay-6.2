<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoVaiTroLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro"%>
<%@page import="vn.dtt.gt.dk.utils.format.CommonUtils"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.gt.dk.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyPhuLocalServiceUtil"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<%@ include file="/portlet/init.jsp"%>
<%
String loaiThuTuc = ParamUtil.getString(request, Constants.LOAI_THU_TUC);
String tenThuTuc = ParamUtil.getString(request, Constants.TEN_THU_TUC);
String soHoSo = ParamUtil.getString(request, Constants.SO_HO_SO);
String doanhNghiep = ParamUtil.getString(request, Constants.DOANH_NGHIEP);
String ngayNopHsFrom = ParamUtil.getString(request, Constants.NGAY_NOP_HO_SO_FROM);
String ngayNopHsTo = ParamUtil.getString(request, Constants.NGAY_NOP_HO_SO_TO);
String namNhap = ParamUtil.getString(request, Constants.NAM_NHAP);

HttpSession httpSession = null;
try {
	httpSession = PortalUtil.getHttpServletRequest(renderRequest).getSession();
} catch (Exception es) {
}
String idPhanNhomHoSo = "";
if (httpSession != null) {
	Object obj = httpSession.getAttribute(Constants.MAPHANNHOMHOSO);
	if (obj != null) {
		idPhanNhomHoSo = obj.toString();
	} else {
		idPhanNhomHoSo = "";
	}
}
long organizationId = 0;
if (themeDisplay.getUser().getOrganizations() != null && themeDisplay.getUser().getOrganizations().size() > 0) {
	organizationId = themeDisplay.getUser().getOrganizations().get(0).getOrganizationId();
}

TthcPhanNhomHoSo tthcPhanNhomHoSo = TthcPhanNhomHoSoLocalServiceUtil.fetchTthcPhanNhomHoSo(ConvertUtil.convertToLong(idPhanNhomHoSo));
System.out.println("==========tthcPhanNhomHoSo======" + tthcPhanNhomHoSo);

PortletURL portletUrl = renderResponse.createRenderURL();
portletUrl.setParameter(Constants.TEN_THU_TUC, tenThuTuc);
portletUrl.setParameter(Constants.SO_HO_SO, soHoSo);
portletUrl.setParameter(Constants.NGAY_NOP_HO_SO_FROM, ngayNopHsFrom);
portletUrl.setParameter(Constants.NGAY_NOP_HO_SO_TO, ngayNopHsTo);
portletUrl.setParameter(Constants.NAM_NHAP, namNhap);
portletUrl.setParameter(Constants.DOANH_NGHIEP, doanhNghiep);
portletUrl.setParameter("jspPage", "/portlet/quanlyhs/thulyhs/tonghiepvu/thongbaonopphi.jsp");

SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, 10, portletUrl, null, null);

List<MotCuaPhieuXuLyPhu> liPhieuXuLyPhus = new ArrayList<MotCuaPhieuXuLyPhu>();
MotCuaPhieuXuLyPhu phieuXuLyPhu = null;
long longTotal = 0;
if(organizationId > 0) {
		String liRoleSelected = CommonUtils.checkRole(themeDisplay);
		System.out.println("==========liRoleSelected======" + liRoleSelected);
		List<TthcPhanNhomHoSoVaiTro> liTthcPhanNhomHoSoVaiTros = TthcPhanNhomHoSoVaiTroLocalServiceUtil.findTthcPhanNhomHoSoVaiTroByPhanNhomHoSoAndVaiTroXuLy(ConvertUtil.convertToLong(idPhanNhomHoSo), liRoleSelected);
		String listNhomPhieuXuLy =  CommonUtils.getNhomPhieuXuLy(liTthcPhanNhomHoSoVaiTros);
		
		// Load phieu phu
		liPhieuXuLyPhus = MotCuaPhieuXuLyPhuLocalServiceUtil.findMotCuaPhieuXuLyPhuByHoSoThuTucId(listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep,  ConvertUtil.convertToInt(namNhap), searchContainer.getStart(), searchContainer.getEnd());
		longTotal = MotCuaPhieuXuLyPhuLocalServiceUtil.countMotCuaPhieuXuLyPhuByHoSoThuTucId(listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep,  ConvertUtil.convertToInt(namNhap));
		
		searchContainer.setTotal(Integer.parseInt(String.valueOf(longTotal)));
		searchContainer.setResults(liPhieuXuLyPhus);
	}


	// Ghi actionlog
	
	String noidungthaotac = "Mở xem chức năng Quản lý thu phí, lệ phí" + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) ; 
	String tenmanhinhdaidien = "Quản lý thu phí, lệ phí";
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(0, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);

%>
<script type="text/javascript">
var hoSoThuTucList = new Array();
</script>
<portlet:actionURL var="thongBaoNopPhi" name="thongBaoNopPhi"> 
	<portlet:param name="<%=Constants.TEN_THU_TUC %>" value="<%=tenThuTuc %>"/>
	<portlet:param name="<%=Constants.SO_HO_SO %>" value="<%=soHoSo %>"/>
	<portlet:param name="<%=Constants.NGAY_NOP_HO_SO_FROM %>" value="<%=ngayNopHsFrom %>"/>
	<portlet:param name="<%=Constants.NGAY_NOP_HO_SO_TO %>" value="<%=ngayNopHsTo %>"/>
	<portlet:param name="<%=Constants.NAM_NHAP %>" value="<%=namNhap %>"/>
	<portlet:param name="<%=Constants.DOANH_NGHIEP %>" value="<%=doanhNghiep %>"/>	
</portlet:actionURL>
<aui:form action="<%=thongBaoNopPhi%>" method="post" name="myForm" id="myForm">
<table class="wd-table table">
	<thead>
		<tr>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.stt" /></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.lanh.dao.don.vi.chon" /><br><input id = 'check_all' name = 'check_all' type='checkbox' onclick="checkAll();"/></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.maso.biennhan" /></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.maso" /></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.ngaynop" /></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.tendoanhnghiep" /></th>
			<th width="15%"><liferay-ui:message key="vn.gt.dk.qlhs.noidung" /></th>
			<th width="30%"><liferay-ui:message key="vn.gt.dk.qlhs.ghichu" /></th>
		</tr>
	</thead>
	<tbody>
	<%
		MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = null;
		TthcHoSoThuTuc hoSoThuTuc = null;
		for (int i = 0; i < liPhieuXuLyPhus.size(); i++) {
			motCuaPhieuXuLyPhu = (MotCuaPhieuXuLyPhu)liPhieuXuLyPhus.get(i);
			hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.findByPhieuXuLyPhuId(motCuaPhieuXuLyPhu.getId());
	%>
			<tr>
				<td class="text-center"><%= (i + 1) + searchContainer.getStart() %></td>
				<td class="text-center"><input type='checkbox' id='<%=motCuaPhieuXuLyPhu.getId()%>'  class="user" onclick="changeajax('<%=motCuaPhieuXuLyPhu.getId() %>');" /></td>
				<td class="text-center"><%=hoSoThuTuc.getMaBienNhan() %></td>
				<td class="text-center"><%=hoSoThuTuc.getMaSoHoSo() %></td>
				<td class="text-center"><%=DateUtils.dateToString("dd/MM/yyyy HH:mm", hoSoThuTuc.getNgayGuiHoSo())%></td>
				<td><span class="text-left"><%=hoSoThuTuc.getTenChuHoSo()%></span></td>
				<td class="text-left"><%=motCuaPhieuXuLyPhu.getTrichYeuNoiDung() %></td>
				<td class="text-left"><%=motCuaPhieuXuLyPhu.getGhiChu() %></td>
			</tr>
			<script type="text/javascript">
			hoSoThuTucList[<%=i%>] = "<%=motCuaPhieuXuLyPhu.getId()%>";
			</script>
		<%
		}
		%>
		<input type="hidden" name="listId" id="listId" value=""/>
	</tbody>
</table>
<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />
<aui:button-row>
	<button  class="btnThuLyHS form-control" type="submit"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.thongbaonopphi.thanhtoan"/></button>		
</aui:button-row>
</aui:form>
<script type="text/javascript">
function changeajax(dataId) {
	
	var isCheck=document.getElementById(dataId).checked;
	var isCheckInternal = true;
	var listId=document.getElementById('listId').value;
	if (isCheck==true){
		//alert("--true");
		listId=listId+dataId+", ";
		for ( var i = 0; i < hoSoThuTucList.length; i++) {
			isCheckInternal = document.getElementById(hoSoThuTucList[i]).checked;
			if(isCheckInternal == false){
				break;
			}
		}
		document.getElementById("check_all").checked = isCheckInternal;
	}else{
		//alert("--false");
		var res = listId.replace(dataId+", ", "");
		document.getElementById("check_all").checked = false;
		listId=res;
	}
	document.getElementById('listId').value=listId;
}

function checkAll() {
	
	var isCheck1=document.getElementById('check_all').checked;
	var listId="";

	if (isCheck1==true){
		for ( var i = 0; i < hoSoThuTucList.length; i++) {
			document.getElementById(hoSoThuTucList[i]).checked = "checked";
			listId = listId + hoSoThuTucList[i] + ", ";
		}
		document.getElementById('listId').value = listId;
	} else {
		for ( var i = 0; i < hoSoThuTucList.length; i++) {
			document.getElementById(hoSoThuTucList[i]).checked = '';
		}
		document.getElementById('listId').value = '';
	}
}
</script>