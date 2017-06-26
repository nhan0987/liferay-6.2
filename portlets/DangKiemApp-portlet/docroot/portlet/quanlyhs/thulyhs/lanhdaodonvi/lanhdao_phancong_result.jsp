<%@page import="vn.dtt.gt.dk.dao.common.service.TthcKeHoachChuyenDichLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich"%>
<%@page import="vn.dtt.gt.dk.report.ReportConstant"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.gt.dk.utils.CollectionUtils"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CorporationTeamLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoVaiTroLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro"%>
<%@page import="vn.dtt.gt.dk.utils.format.CommonUtils"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo"%>
<%@page import="java.util.HashMap"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Set"%>
<%@page import="vn.dtt.gt.dk.portlet.hoso.QuanLyHoSoUtils"%>
<%@page import="com.liferay.portal.model.UserGroup"%>
<%@page import="vn.dtt.gt.dk.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyPhuLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="java.util.List"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<%@ include file="/portlet/init.jsp"%>
<%
//System.out.println("===============/portlet/quanlyhs/thulyhs/lanhdaodonvi/lanhdao_phancong_result.jsp===========");
Map<String,String> listMap= new HashMap<String,String>();
if(renderRequest.getPortletSession().getAttribute("listMap") != null){
listMap = (Map<String,String>)renderRequest.getPortletSession().getAttribute("listMap");
}
System.out.println("==========listMap=========result====" + listMap);
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
portletUrl.setParameter(Constants.SO_DKKT, soDKKT);
portletUrl.setParameter(Constants.DOI_DKKT, doiDKKT);
portletUrl.setParameter("jspPage", "/portlet/quanlyhs/thulyhs/lanhdaodonvi/lanhdao_phancongkiemtra.jsp");


SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, 10, portletUrl, null, null);

List<MotCuaPhieuXuLyPhu> liPhieuXuLyPhus = new ArrayList<MotCuaPhieuXuLyPhu>();
List<MotCuaPhieuXuLyPhu> liPhieuXuLyPhusDemo = new ArrayList<MotCuaPhieuXuLyPhu>();
MotCuaPhieuXuLyPhu phieuXuLyPhu = null;
long longTotal = 0;
if(organizationId > 0) {
		String liRoleSelected = CommonUtils.checkRole(themeDisplay);
		System.out.println("==========liRoleSelected======" + liRoleSelected);
		List<TthcPhanNhomHoSoVaiTro> liTthcPhanNhomHoSoVaiTros = TthcPhanNhomHoSoVaiTroLocalServiceUtil.findTthcPhanNhomHoSoVaiTroByPhanNhomHoSoAndVaiTroXuLy(ConvertUtil.convertToLong(idPhanNhomHoSo), liRoleSelected);
		String listNhomPhieuXuLy =  CommonUtils.getNhomPhieuXuLy(liTthcPhanNhomHoSoVaiTros);
		
		String listIdResult = "";
		Set<String> keys = listMap.keySet();
		for(String key : keys){
			listIdResult = listIdResult + listMap.get(key).trim();
		}
		if(listIdResult.length() > 0){
		listIdResult=listIdResult.substring(0, listIdResult.length()-1)+"";
		}
		// Load phieu phu
		liPhieuXuLyPhus = MotCuaPhieuXuLyPhuLocalServiceUtil.findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndCorporationid(listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep, doiDKKT, soDKKT, ConvertUtil.convertToInt(namNhap), listIdResult, PortalUtil.getUserId(request), searchContainer.getStart(), searchContainer.getEnd());
		liPhieuXuLyPhusDemo = MotCuaPhieuXuLyPhuLocalServiceUtil.findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndCorporationid(listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep, doiDKKT, soDKKT, ConvertUtil.convertToInt(namNhap), listIdResult, PortalUtil.getUserId(request), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		longTotal = MotCuaPhieuXuLyPhuLocalServiceUtil.countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndCorporationid(listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep, doiDKKT, soDKKT, ConvertUtil.convertToInt(namNhap), listIdResult, PortalUtil.getUserId(request));
		
		searchContainer.setTotal(Integer.parseInt(String.valueOf(longTotal)));
		searchContainer.setResults(liPhieuXuLyPhus);
	}
String lstPhieuXuLyPhu = CollectionUtils.getListIDPhieuXuLyPhu(liPhieuXuLyPhusDemo);
System.out.println("==========lstIdPhieuXuLyPhu=======" + lstPhieuXuLyPhu);
lCorporationInspectors = CorporationInspectorLocalServiceUtil.findDanhSachDangKiemVienByTeam(PortalUtil.getUserId(request));

PortletURL viewHoSoUrl4 = renderResponse.createRenderURL();
viewHoSoUrl4.setParameter("jspPage", "/portlet/report_export_themmoi.jsp");
viewHoSoUrl4.setParameter("lstIdPhieuXuLyPhu", lstPhieuXuLyPhu);
viewHoSoUrl4.setParameter("type", "LichDeNghiKiemTra");
%>
<script type="text/javascript">
var hoSoThuTucList = new Array();
</script>

<style>
.egov-multi-select{
	border: 1px solid rgb(224,224,224);
	padding:7px;
	padding-top:6px;
	padding-bottom:6px;
	padding-right:2px;
	color:black;
	font-style:normal;
	height: 200px;
	margin:0px;
	font-size: 14px;
	width: 100%;
	
}
.egov-multi-select:focus{
	border: 1px solid rgb(90, 142, 49);
	
}

.egov-button-normal {
padding: 7px;
clear: both;
text-align: center;
margin: 0 auto;
background: #22AD18;
cursor: pointer;
color: #fff !important;
border: none;
font-weight: bold;
-moz-border-radius: 2px;
-webkit-border-radius: 2px;
border-radius: 2px;
font-size: 13px;
text-shadow: 0 0 #fff;
}
</style>

<%
PortletURL urlPhanCongResult = renderResponse.createActionURL();
urlPhanCongResult.setParameter(ActionRequest.ACTION_NAME, "phanCongResult");
urlPhanCongResult.setParameter(Constants.TEN_THU_TUC, tenThuTuc);
urlPhanCongResult.setParameter(Constants.SO_HO_SO, soHoSo);
urlPhanCongResult.setParameter(Constants.NGAY_NOP_HO_SO_FROM, ngayNopHsFrom);
urlPhanCongResult.setParameter(Constants.NGAY_NOP_HO_SO_TO , ngayNopHsTo);
urlPhanCongResult.setParameter(Constants.NAM_NHAP, namNhap);
urlPhanCongResult.setParameter(Constants.SO_DKKT, soDKKT);
urlPhanCongResult.setParameter(Constants.DOI_DKKT, doiDKKT);
urlPhanCongResult.setParameter(Constants.LIST_DANG_KIEM_VIEN_, listMapDangKiemVien);

PortletURL urlPhanCongTatCaResult = renderResponse.createActionURL();
urlPhanCongTatCaResult.setParameter(ActionRequest.ACTION_NAME, "phanCongTatCaResult");
urlPhanCongTatCaResult.setParameter(Constants.TEN_THU_TUC, tenThuTuc);
urlPhanCongTatCaResult.setParameter(Constants.SO_HO_SO, soHoSo);
urlPhanCongTatCaResult.setParameter(Constants.NGAY_NOP_HO_SO_FROM, ngayNopHsFrom);
urlPhanCongTatCaResult.setParameter(Constants.NGAY_NOP_HO_SO_TO , ngayNopHsTo);
urlPhanCongTatCaResult.setParameter(Constants.NAM_NHAP, namNhap);
urlPhanCongTatCaResult.setParameter(Constants.SO_DKKT, soDKKT);
urlPhanCongTatCaResult.setParameter(Constants.DOI_DKKT, doiDKKT);
urlPhanCongTatCaResult.setParameter("lstPhieuXuLyPhu", lstPhieuXuLyPhu);
urlPhanCongTatCaResult.setParameter(Constants.LIST_DANG_KIEM_VIEN_, listMapDangKiemVien);
%>
<aui:form action="<%=urlPhanCongResult.toString()%>" method="POST" name="formPhanCong" id="formPhanCong">
<table class="wd-table table">
	<thead>
		<tr>
			<th width="20px"><liferay-ui:message key="vn.gt.dk.qlhs.lanh.dao.don.vi.stt" /></th>
			<th width="20px"><liferay-ui:message key="vn.gt.dk.qlhs.lanh.dao.don.vi.chon" /><br><input id = 'check_all' name = 'check_all' type='checkbox' onclick="checkAll();"/></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.lanh.dao.don.vi.so.ngay.dkkt" /></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.lanh.dao.don.vi.tochuc.canhan" /></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.lanh.dao.don.vi.noidung" /></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.lanh.dao.don.vi.ghichu" /></th>
			<th>Đội</th>
		</tr>
	</thead>
	<tbody>
			<%
			
			RegisteredInspection registeredInspection = null;
			
			int k=0;			
			for(int i = 0; i < liPhieuXuLyPhus.size(); i++){
				phieuXuLyPhu = (MotCuaPhieuXuLyPhu)liPhieuXuLyPhus.get(i);
				List<TthcKeHoachChuyenDich>  keHoachChuyenDichs= TthcKeHoachChuyenDichLocalServiceUtil.findByPhieuXuLyPhuId(phieuXuLyPhu.getId());
				if(keHoachChuyenDichs==null||keHoachChuyenDichs.size()==0){
					registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(phieuXuLyPhu.getPhieuXuLyChinhId());
					ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil.findByPhieuXuLyPhuId(phieuXuLyPhu.getId());
					
					DmDataItem dataItem = null;
					if(confirmedInspection != null){
						dataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.CORPORATION, confirmedInspection.getCorporationId());
					}
						%>
						<tr>
							<td class="text-center"><%=(i + 1) + searchContainer.getStart() %></td>
							<td class="text-center"><input type='checkbox' id='<%=phieuXuLyPhu.getId()%>'  class="user" onclick="changeajax('<%=phieuXuLyPhu.getId() %>');" /></td>
							<td class="text-center"><%=Validator.isNotNull(registeredInspection) ? registeredInspection.getRegisteredNumber() : StringPool.BLANK%><br><%=Validator.isNotNull(registeredInspection) ? ConvertUtil.parseDateToString(registeredInspection.getInspectionDate()) : StringPool.BLANK%></td>
							<td class="text-center"><%=Validator.isNotNull(registeredInspection) ? registeredInspection.getImporterName() : StringPool.BLANK%></td>
							<td class="text-center"><%=Validator.isNotNull(phieuXuLyPhu) ? phieuXuLyPhu.getTrichYeuNoiDung() : StringPool.BLANK%></td>
							<td class="text-center"><%=Validator.isNotNull(phieuXuLyPhu) ? phieuXuLyPhu.getGhiChu() : StringPool.BLANK%></td>
							<td class="text-center"><%=Validator.isNotNull(dataItem) ? dataItem.getName() : ""%></td>
						</tr>
						<script type="text/javascript">
						hoSoThuTucList[<%=k%>] = "<%=phieuXuLyPhu.getId()%>";
						</script>
				<%
				 k =k+1;
				}
			}
			%>
			<input type="hidden" name="listId" id="listId" value=""/>
	</tbody> 
</table>
<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />


<table class="wd-table table">
	<%
	 liCorporationTeams = CorporationTeamLocalServiceUtil.findByInspectorId(userId);
	%>
				<!-- Dang Kiem Vien Chinh -->
				<tr>
					<td width="250px"><span>Chọn đăng kiểm viên chính : </span></td>
					<td>
						<select id="dangKiemVienId" name="dangKiemVienId" style="width: 250px">
						<%
						if(lCorporationInspectors!=null && lCorporationInspectors.size()>0){
							for (CorporationInspector corporationInspector : lCorporationInspectors) {
						%>
							<option  value="<%=corporationInspector.getId()%>"><%=corporationInspector.getInspectorName()%></option>
						<%
						} }
						%>
						</select>
					</td>
				</tr>	
				
				<!-- Dang Kiem Vien Phoi Hop -->
				<tr>
					<td width="250px"><span>Chọn đăng kiểm viên phối hợp : </span></td>
					<td>
						
					<table style="padding-left: 0px; padding-right: 0px; width: 100%; background-color: white;">
						<tr>
						<input type="hidden" name="listDKVPhoiHop"  id="listDKVPhoiHop" >	
							<td width="43%"><label class="egov-label-bold">Danh sách cán bộ phối hợp</label> 
								<div class="moh-select">
								<select class="egov-multi-select" size="10" 
									multiple="multiple" id="select-system-id-hinhThucQc">
						<%
						if(lCorporationInspectors!=null && lCorporationInspectors.size()>0){
							for (CorporationInspector corporationInspector : lCorporationInspectors) {
						%>
							<option  value="<%=corporationInspector.getId()%>"><%=corporationInspector.getInspectorName()%></option>
						<%
						} }
						%>
								</select> </div>
								<div class="moh-select">
								<select id="select-data-system-hinhThucQc" class="egov-select" style="display: none;">
									
								</select></div> 
								
							</td>
							<td width="4%" align="center" style="padding: 10px;"><br>
								<br>
								<br>
								<br> <input type="button" class="egov-button-normal"
									value=">>"
									onclick="moveOptions('select-system-id-hinhThucQc','select-selected-idHinhThucQc');">
									<br>
								<br> <input type="button" class="egov-button-normal"
									value="<<" onclick="moveOptions('select-selected-idHinhThucQc','select-system-id-hinhThucQc');">
							</td>
							
							<td width="43%"><label class="egov-label-bold"> Đã chọn
								</label> <select
									class="egov-multi-select" size="10" multiple="multiple" 
									id="select-selected-idHinhThucQc">
								</select>
							</td>
						</tr>
					</table>						
					</td>
				</tr>	
</table>
<aui:button-row>
	<button type="button" id="phanCong" onclick="if(validatorBeforDataPhanCong()) beforSummitFormPhanCong('formPhanCong','<%=urlPhanCongResult.toString()%>')" class="btnThuLyHS form-control" style="width: 200px;float: left;">Phân công</button>
	<button type="button" id="phanCongTatCa" onclick="beforSummitFormPhanCong('formPhanCong','<%=urlPhanCongTatCaResult.toString()%>')" class="btnThuLyHS form-control" style="width: 200px;float: left;">Phân công tất cả</button>
	<a href="<%=viewHoSoUrl4.toString()%>"><button id="inAn" class="btnThuLyHS form-control" type="button" style="width: 200px;float: left;">In ấn</button></a>
</aui:button-row>
</aui:form>
<script type="text/javascript">
function beforSummitFormPhanCong(idForm, url) {
	console.log('=beforSummitForm=' + idForm);
	var status = confirm("Bạn có muốn tiếp tục xử lý?");
	if (status) {
		document.getElementById('<portlet:namespace/>' + idForm).action = url;
		document.getElementById('<portlet:namespace/>' + idForm).submit();

		document.getElementById('phanCong').disabled = true;
		document.getElementById('phanCongTatCa').disabled = true;
		document.getElementById('inAn').disabled = true;

	} else {
		document.getElementById('<portlet:namespace/>' + idForm).action = '';
	}
}
function validatorBeforDataPhanCong() {
	if (($('#listId').val().length) === 0) {
		alert("Đề nghị chọn lịch trước khi Phân công !");
		return false;
	}
	return true;
}
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

function moveOptions(fromId,toId){
	$("#"+fromId+" option").each(function() {
		if(this.selected){			
			$('#'+toId).append($('<option>', { 
		        value: this.value,
		        text : this.text 
		    }));
			
			$(this).remove();
		}
	    
	});
	getDanhSachDKVPhoiHop();
}

function getDanhSachDKVPhoiHop() {

	var idcn = "";
	$("#select-selected-idHinhThucQc option").each(function() {
		idcn = idcn + "," + this.value;
	});
	if (idcn.length > 1)
	{
		idcn = idcn.substring(1);
	}
	document.getElementById("listDKVPhoiHop").value = idcn;
	
}

function submitFormPhanCong() {
	alert("vinh");
	getDanhSachDKVPhoiHop();
	document.getElementById('<portlet:namespace/>myForm').submit();
}

</script>