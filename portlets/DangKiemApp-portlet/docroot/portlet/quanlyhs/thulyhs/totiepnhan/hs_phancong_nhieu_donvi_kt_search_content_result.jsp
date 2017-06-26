<%@page import="vn.dtt.gt.dk.dao.aswmsg.service.MonitorMessageQueueLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.aswmsg.model.MonitorMessageQueue"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.LichKiemTraHienTruongLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.PhanCongDonViKiemTraLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="vn.dtt.gt.dk.utils.DanhMucKey"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.DmDataGroupLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.DmDataGroup"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<%@ include file="/portlet/init.jsp"%>
<%@ include file="/portlet/quanlyhs/thulyhs/totiepnhan/initToTiepNhan.jsp"%>
<%
	//Khong tim kiem phieuXuLyPhu theo doanh nghiep, ho so
	String doanhNghiep = "";

	HttpSession httpSession = null;
	try {
		httpSession = PortalUtil.getHttpServletRequest(renderRequest).getSession();
	} catch (Exception es) {}
	
	//----------Phan nhom ho so
	String idPhanNhomHoSo = "";
	if (httpSession != null) {
		Object obj = httpSession.getAttribute(Constants.MAPHANNHOMHOSO);
		if (obj != null) {
			idPhanNhomHoSo = obj.toString();
		} else {
			idPhanNhomHoSo = "";
		}
	}
	
	//----------organizationId
	long organizationId = 0;
	if (themeDisplay.getUser().getOrganizations() != null && themeDisplay.getUser().getOrganizations().size() > 0) {
		organizationId = themeDisplay.getUser().getOrganizations().get(0).getOrganizationId();
	}
	
	PortletURL portletUrl = renderResponse.createRenderURL();
	portletUrl.setParameter("jspPage", "/portlet/quanlyhs/thulyhs/totiepnhan/hs_phancong_nhieu_donvi_kt.jsp");
	portletUrl.setParameter(Constants.LOAI_THU_TUC, loaiThuTuc);
	portletUrl.setParameter(Constants.TEN_THU_TUC, tenThuTuc);
	portletUrl.setParameter(Constants.SO_HO_SO, soHoSo);
	portletUrl.setParameter(Constants.SO_DKKT, soDKKT);
	portletUrl.setParameter(Constants.NGAY_NOP_HO_SO_FROM, ngayNopHsFrom);
	portletUrl.setParameter(Constants.NGAY_NOP_HO_SO_TO, ngayNopHsTo);
	portletUrl.setParameter(Constants.NAM_NHAP, namNhap);
	portletUrl.setParameter(Constants.QUAN_HUYEN, quanHuyen);
	portletUrl.setParameter(Constants.TINH_THANH, tinhThanh);
	portletUrl.setParameter(Constants.DAT_NUOC, datNuoc);
	
	SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, 200, portletUrl, null, null);
	
	TthcPhanNhomHoSo tthcPhanNhomHoSo = TthcPhanNhomHoSoLocalServiceUtil.fetchTthcPhanNhomHoSo(ConvertUtil.convertToLong(idPhanNhomHoSo));
	
	List<PhanCongDonViKiemTra> resultsCuaPhieuXuLyPhus = null;
	
	long longTotal = 0;
	
	if (organizationId > 0) {
		if (Constants.LOAIPHIEUXULY_PHIEU_PHU == tthcPhanNhomHoSo.getLoaiPhieuXuLy()) {
			String liRoleSelected = CommonUtils.checkRole(themeDisplay);
			System.out.println("==hs_phancong_nhieu_donvi_kt_search_content_result.jsp==liRoleSelected==" + liRoleSelected);
			
			List<TthcPhanNhomHoSoVaiTro> lstTthcPhanNhomHoSoVaiTro = TthcPhanNhomHoSoVaiTroLocalServiceUtil.findTthcPhanNhomHoSoVaiTroByPhanNhomHoSoAndVaiTroXuLy(ConvertUtil.convertToLong(idPhanNhomHoSo), liRoleSelected);
			String listNhomPhieuXuLy =  CommonUtils.getNhomPhieuXuLy(lstTthcPhanNhomHoSoVaiTro);
	
			// Load phieu phu
			//resultsCuaPhieuXuLyPhus = MotCuaPhieuXuLyPhuLocalServiceUtil.findMotCuaPhieuXuLyPhuByHoSoThuTucId(listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep, ConvertUtil.convertToInt(namNhap), searchContainer.getStart(), searchContainer.getEnd());
			//resultsCuaPhieuXuLyPhus = MotCuaPhieuXuLyPhuLocalServiceUtil.searchPhanCongDonViKiemTraByHoSoThuTucId(listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, ngayNopHsFrom, ngayNopHsTo, ConvertUtil.convertToInt(namNhap), quanHuyen, tinhThanh, datNuoc, searchContainer.getStart(), searchContainer.getEnd());
	
			resultsCuaPhieuXuLyPhus =PhanCongDonViKiemTraLocalServiceUtil.searchPhanCongDonViKiemTraByHoSoThuTucId(listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, soDKKT, ngayNopHsFrom, ngayNopHsTo, ConvertUtil.convertToInt(namNhap), quanHuyen, tinhThanh, datNuoc, searchContainer.getStart(), searchContainer.getEnd());
			//resultsCuaPhieuXuLyPhus =LichKiemTraHienTruongLocalServiceUtil.searchPhanCongDonViKiemTraByHoSoThuTucId(listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, soDKKT, ngayNopHsFrom, ngayNopHsTo, ConvertUtil.convertToInt(namNhap), quanHuyen, tinhThanh, datNuoc, PortalUtil.getUserId(request), searchContainer.getStart(), searchContainer.getEnd());
	
			//longTotal = MotCuaPhieuXuLyPhuLocalServiceUtil.countMotCuaPhieuXuLyPhuByHoSoThuTucId(listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep, ConvertUtil.convertToInt(namNhap));
			//longTotal = MotCuaPhieuXuLyPhuLocalServiceUtil.countPhanCongDonViKiemTraByHoSoThuTucId(listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, ngayNopHsFrom, ngayNopHsTo, ConvertUtil.convertToInt(namNhap), quanHuyen, tinhThanh, datNuoc);
			longTotal = PhanCongDonViKiemTraLocalServiceUtil.countPhanCongDonViKiemTraByHoSoThuTucId(listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, soDKKT, ngayNopHsFrom, ngayNopHsTo, ConvertUtil.convertToInt(namNhap), quanHuyen, tinhThanh, datNuoc);
			
			searchContainer.setTotal(Integer.parseInt(String.valueOf(longTotal)));
			searchContainer.setResults(resultsCuaPhieuXuLyPhus);
		}
	}
	if (resultsCuaPhieuXuLyPhus == null) { 
		resultsCuaPhieuXuLyPhus = new ArrayList<PhanCongDonViKiemTra>(); 
	}
	
	PortletPreferences resourcePrefs = PortletPreferencesFactoryUtil.getPortletSetup(renderRequest);
	String loadDataBaseMotCua = resourcePrefs.getValue(Constants.LOAD_DATABASE_MOTCUA, "");
%>
<!------------------------- START form ------------------------->
<%
PortletURL hoSoPhanCongNhieuDonViKiemTra = renderResponse.createActionURL();
hoSoPhanCongNhieuDonViKiemTra.setParameter(ActionRequest.ACTION_NAME, "hoSoPhanCongNhieuDonViKiemTra");

PortletURL hoSoPhanCongNhieuDonViKiemTraDefaultDoi = renderResponse.createActionURL();
hoSoPhanCongNhieuDonViKiemTraDefaultDoi.setParameter(ActionRequest.ACTION_NAME, "hoSoPhanCongNhieuDonViKiemTraDefaultDoi");
%>
<aui:form action="<%=hoSoPhanCongNhieuDonViKiemTra.toString()%>" name="formPhanCongNhieuDonVi" id="formPhanCongNhieuDonVi" method="POST">
<input hidden="true" type="text" id="<%=Constants.DIEU_KIEN_CHUYEN_DICH%>" name="<%=Constants.DIEU_KIEN_CHUYEN_DICH%>"
	value="<%=Constants.DIEU_KIEN_DICH_CHUYEN_PHAN_CONG_DON_VI_KT%>" />
<table class="wd-table table">
	<thead>
		<tr>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.stt"/></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.hsphancongnhieudonviktsearchcontentresult.chon"/></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.hsphancongnhieudonviktsearchcontentresult.songaydkkt"/></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.hsphancongnhieudonviktsearchcontentresult.tochuccanhannophoso"/></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.noidung"/></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.hsphancongnhieudonviktsearchcontentresult.ghichu"/></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.hsphancongnhieudonviktsearchcontentresult.noitiepnhan"/></th>
		</tr>
	</thead>
	<tbody>
	<%
	//phieu xu ly phu
	if (Constants.LOAIPHIEUXULY_PHIEU_PHU == tthcPhanNhomHoSo.getLoaiPhieuXuLy()) {
	
		int index = 1;
		int hoSoThuTucId = 0;
		TthcHoSoThuTuc hoSoThuTuc = null;
		ConfirmedInspection confirmedInspection = null;
		DmDataItem dmDonVi = null;
		DmDataItem dmDonViKiemTra = null;
		for (PhanCongDonViKiemTra item : resultsCuaPhieuXuLyPhus) {
			List<MonitorMessageQueue> monitorMessageQueues =  MonitorMessageQueueLocalServiceUtil.findByLayPhieuXuLyPhuId(item.getId());
			if(monitorMessageQueues==null||monitorMessageQueues.size()==0){
				if (item != null&&item.getInspectionProvincecode()!=null&&item.getInspectionProvincecode().length()>0) {
					dmDonVi = DmDataItemLocalServiceUtil.getByDmDataGroupCodeNameAndCode0AndLevel(DanhMucKey.ADMINISTRATIVE_UNITS, item.getInspectionProvincecode(), 1);
					if (dmDonVi != null) {
						dmDonViKiemTra = DmDataItemLocalServiceUtil.getByDataGroupCodeNameAndDataItemCode0(DanhMucKey.CORPORATION, dmDonVi.getCode3());
					}
				}
				%>
				<tr>
					<td class="text-center">
						<input type="text" hidden="true" disabled="disabled" id="lstPhieuXuLyPhuId_<%=index%>" name="lstPhieuXuLyPhuId" value="<%=item.getId()%>" class="classPhieuXuLyPhu"/>
						<input type="text" hidden="true" disabled="disabled" id="lstHoSoThuTucId_<%=index%>" name="lstHoSoThuTucId" value="<%=item.getPhieuXuLyChinhId()%>" class="classHoSoThuTuc"/>
						<input type="text" hidden="true" disabled="disabled" id="dmDonViKiemTra_<%=index%>" name="dmDonViKiemTra_<%=index%>" value="<%=dmDonViKiemTra.getCode0()%>"/>
						<%=(index) + searchContainer.getStart()%>
					</td>
					<td class="text-center">
						<input type="checkbox" id="checkbox<%=index%>" name="checkbox<%=index%>" class="cbPXLphu"
							onchange="changeValueSubmit('checkbox<%=index%>', 'lstPhieuXuLyPhuId_<%=index%>', 'lstHoSoThuTucId_<%=index%>')"/></td>
					<td class="text-left"><%=item.getMaBienNhan()%><br><%=DateUtils.dateToString("HH:mm dd/MM/yyyy", item.getNgayGuiHoSo())%></td>
					<td class="text-left"><%=item.getTenChuHoSo() %></td>
					<td class="text-left"><%=item.getTrichYeuNoiDung()%></td>
					<td class="text-left"><%=item.getGhiChu()%></td>
					<td class="text-center"><%=Validator.isNotNull(dmDonViKiemTra) ? dmDonViKiemTra.getName() : ""%></td>
				</tr>
				<%
				index++;
			}
		}
		%>
		<input type="hidden" name="danhSachPhieuXuLyPhuId" id="danhSachPhieuXuLyPhuId" value=""/>
		<input type="hidden" name="danhSachHoSoThuTucId" id="danhSachHoSoThuTucId" value=""/>
		<%
	}
	%>
	</tbody>
</table>


<div id="divBtnPhanCongDonViKiemTra">
	<aui:button-row>
		<button type="button" onclick="chonPhieuXuLyPhu('true')" class="btnThuLyHS form-control" style="width: 150px;"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.hsphancongnhieudonviktsearchcontentresult.chontatca"/></button>
		<button type="button" onclick="chonPhieuXuLyPhu('false')" class=" btnThuLyHS form-control" style="width: 150px;"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.hsphancongnhieudonviktsearchcontentresult.bochon"/></button>
		<button type="button" onclick="eventHideOrShowDiv('phanCongDonViKiemTra', 'true')" class="btnThuLyHS form-control" style="width: 150px;"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.hsphancongnhieudonviktsearchcontentresult.chonphancong"/></button>
		<button type="button" onclick="if(validatorBeforeDataDefault()) beforSummitForm('formPhanCongNhieuDonVi','<%=hoSoPhanCongNhieuDonViKiemTraDefaultDoi.toString()%>')" class="btnThuLyHS form-control" style="width: 200px;"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.hsphancongnhieudonviktsearchcontentresult.phancong"/></button>
	</aui:button-row>
</div>

<div style="height: 15px" id="theDem"></div>

<div id="phanCongDonViKiemTra">
	<p><span><b><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.hsphancongnhieudonviktsearchcontentresult.phancongdonvikiemtra"/></b></span></p>
	
	<div class="row">
		<div class="col-xs-2 col-sm-2 col-md-2"><label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.chondonvikiemtra" /></label></div>
		<div class="col-xs-10 col-sm-10 col-md-10">
			<div class="row">
			<%
				List<DmDataItem> lstDonViThucHien = DmDataItemLocalServiceUtil.findByDataGroupIdAndLevelAlterName(DanhMucKey.CORPORATION, 1, "KIEMTRA");
				if (lstDonViThucHien == null) { lstDonViThucHien = new ArrayList<DmDataItem>(); }
			%>
				<select id="corporationId" name="corporationId" class="form-control-find" style="width: 65%;">
					<option selected="selected" value="-1">---<liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.hsphancongnhieudonviktsearchcontentresult.chondonvikiemtra"/>---</option>
					<%for (DmDataItem dm : lstDonViThucHien) {%>
						<option value="<%=dm.getCode0()%>"><%=dm.getName()%></option>
					<%}%>
				</select>
			</div>
		</div>
	</div>
	<aui:button-row>
		<button type="button" class="btnThuLyHS form-control" style="width: 150px;"
			onclick="if(validatorBeforeData()) beforSummitForm('formPhanCongNhieuDonVi','<%=hoSoPhanCongNhieuDonViKiemTra.toString()%>')"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.hsphancongnhieudonviktsearchcontentresult.thuchien"/></button>
		<button type="button" onclick="eventHideOrShowDiv('phanCongDonViKiemTra', 'false')" class=" btnThuLyHS form-control" style="width: 150px;"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.hsphancongnhieudonviktsearchcontentresult.quaylai"/></button>
	</aui:button-row>
</div>
</aui:form>
<!------------------------- End form ------------------------->

<script type="text/javascript">

	function validatorBeforeData () {
		var phieuXuLy = $("#danhSachPhieuXuLyPhuId").val();
		var data = $.trim(phieuXuLy);
		if (data.length == 0) {
			alert("Đề nghị chọn hồ sơ Đăng kí kiểm tra !");
			return false;
		} else {
			var code = $("select#corporationId").val();
			if (code === '-1') {
				alert("Đề nghị chọn đơn vị phân công kiểm tra !");
				return false;
			} else {
				return true;
			}
		}
	}

	function validatorBeforeDataDefault () {
		var phieuXuLy = $("#danhSachPhieuXuLyPhuId").val();
		var data = $.trim(phieuXuLy);
		if (data.length == 0) {
			alert("Đề nghị chọn hồ sơ Đăng kí kiểm tra !");
			return false;
		}
		return true; 
	}
	
	//de ve file js, ko an doan code: <portlet:namespace/>
	function beforSummitForm(idForm, url) {
		console.log('=beforSummitForm=' + idForm);
		var status = confirm("Bạn có muốn tiếp tục xử lý?");
		if (status) {
			document.getElementById('<portlet:namespace/>' + idForm).action = url; 
			document.getElementById('<portlet:namespace/>' + idForm).submit(); 
		} else {
			document.getElementById('<portlet:namespace/>' + idForm).action = '';
		}
	}

	$(document).ready(function() {
		$(".cbPXLphu").click(function(event) {
			if ($(this).is(":checked")) {
				//$("#danhSachPhieuXuLyPhuId").val($("#danhSachPhieuXuLyPhuId").val() + $(this).val() + ",");
			} else {
				//var listAll = $("#listId").val();
				//var currentElement = $(this).val()+",";
				//listAll = listAll.replace(currentElement, "");
				//$("#listId").val(listAll);
			}
		});
		
		$('#selectall').click(function(event) {
			if (this.checked) {
				$('.user').each(function() {
					if (this.checked != true) {
						this.checked = true;
						$("#listId").val($("#listId").val() + $(this).val() + ",");
					}
				});
			} else {
				$('.user').each(function() {
					this.checked = false;
					var listAll = $("#listId").val();
					var currentElement = $(this).val() + ",";
					listAll = listAll.replace(currentElement, "");
					$("#listId").val(listAll);
				});
			}
		});
	});

	function changeValueSubmit(idCheckBox, idPhieuXuLyPhuId, idHoSoThuTucId) {
		console.log(idCheckBox + ' ' + idPhieuXuLyPhuId + ' ' + idHoSoThuTucId);
		
		console.log($('#' + idCheckBox).val());
		console.log($('#' + idPhieuXuLyPhuId).val());
		console.log($('#' + idHoSoThuTucId).val());
		
		var giaTri = $('#' + idCheckBox).is(':checked');
		
		if (giaTri == true) {
			$('#' + idPhieuXuLyPhuId).prop('disabled', false);
			$('#' + idHoSoThuTucId).prop('disabled', false);
			
			
			$("#danhSachPhieuXuLyPhuId").val($("#danhSachPhieuXuLyPhuId").val() + $('#' + idPhieuXuLyPhuId).val() + ",");
			//$("#danhSachHoSoThuTucId").val($("#danhSachHoSoThuTucId").val() + $('#' + idHoSoThuTucId).val() + ",");

			//console.log($("#danhSachPhieuXuLyPhuId").val());
			//console.log($("#danhSachHoSoThuTucId").val());
			console.log('changeValueSubmit==' + giaTri);
		} else if (giaTri == false) {
			
			$('#' + idPhieuXuLyPhuId).prop('disabled', true);
			$('#' + idHoSoThuTucId).prop('disabled', true);
			//$("#" + idPhieuXuLyPhuId).attr('id', idPhieuXuLyPhuId).attr('name', idPhieuXuLyPhuId);
			//$("#" + lstHoSoThuTucId).attr('id', lstHoSoThuTucId).attr('name', lstHoSoThuTucId);
			
			var AlldsPhieuXuLyPhuId = $("#danhSachPhieuXuLyPhuId").val();
			var currentElement = $('#' + idPhieuXuLyPhuId).val() + ",";
			AlldsPhieuXuLyPhuId = AlldsPhieuXuLyPhuId.replace(currentElement, "");
			$("#danhSachPhieuXuLyPhuId").val(AlldsPhieuXuLyPhuId);
			
			//console.log($("#danhSachPhieuXuLyPhuId").val());
			//console.log($("#danhSachHoSoThuTucId").val());
			console.log('changeValueSubmit==' + giaTri);
		}
	}


	function chonPhieuXuLyPhu(isChonAll) {
		console.log('chonPhieuXuLyPhu:' + isChonAll);
		if (isChonAll === 'true') {
			$('.cbPXLphu').each(function() { //loop through each checkbox
				this.checked = true;  //select all checkboxes with class "cbPXLphu"
			});
			
			$("input[name='lstPhieuXuLyPhuId']").each(function(){
				$(this).prop('disabled', false);
				$("#danhSachPhieuXuLyPhuId").val($("#danhSachPhieuXuLyPhuId").val() + $(this).val() + ",");
			});
			
			$("input[name='lstHoSoThuTucId']").each(function(){
				$(this).prop('disabled', false);
				//$("#danhSachHoSoThuTucId").val($("#danhSachHoSoThuTucId").val() + $(this).val() + ",");
			});

			console.log('select all checkboxes');
			console.log('==danhSachPhieuXuLyPhuId==' + $("#danhSachPhieuXuLyPhuId").val());
			//console.log('==danhSachHoSoThuTucId==' + $("#danhSachHoSoThuTucId").val());
		} else if (isChonAll === 'false') {
			$('.cbPXLphu').each(function() { //loop through each checkbox
				this.checked = false; //deselect all checkboxes with class "cbPXLphu"
			});

			$("input[name='lstPhieuXuLyPhuId']").each(function(){
				$(this).prop('disabled', true);
			});

			$("input[name='lstHoSoThuTucId']").each(function(){
				$(this).prop('disabled', true);
			});
			
			$("#danhSachPhieuXuLyPhuId").val('');
			//$("#danhSachHoSoThuTucId").val('');
			console.log('deselect all checkboxes');
			console.log('==danhSachPhieuXuLyPhuId==' + $("#danhSachPhieuXuLyPhuId").val());
			//console.log('==danhSachHoSoThuTucId==' + $("#danhSachHoSoThuTucId").val());
		}
	}

	$(function() {
		$('#phanCongDonViKiemTra').hide();
	});

	$(document).ready(function() {
		$('#selecctall').click(function(event) {//on click 
			if (this.checked) { // check select status
				$('.checkbox1').each(function() { //loop through each checkbox
					this.checked = true;  //select all checkboxes with class "checkbox1"
				});
			} else {
				$('.checkbox1').each(function() { //loop through each checkbox
					this.checked = false; //deselect all checkboxes with class "checkbox1"
				});
			}
		});
	});

	
	function setGetParameter(paramName, paramValue) {
		var url = window.location.href;
		if (url.indexOf(paramName + "=") >= 0) {
			var prefix = url.substring(0, url.indexOf(paramName));
			var suffix = url.substring(url.indexOf(paramName));
			suffix = suffix.substring(suffix.indexOf("=") + 1);
			suffix = (suffix.indexOf("&") >= 0) ? suffix.substring(suffix.indexOf("&")) : "";
			url = prefix + paramName + "=" + paramValue + suffix;
		} else {
			if (url.indexOf("?") < 0) {
				url += "?" + paramName + "=" + paramValue;
			} else {
				url += "&" + paramName + "=" + paramValue;
			}
		}
		window.location.href = url;
	}
</script>
