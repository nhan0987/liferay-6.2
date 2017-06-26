<%@page import="vn.dtt.gt.dk.dao.common.service.TthcBieuMauHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo"%>
<%@page import="vn.dtt.gt.dk.utils.DanhMucKey"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.DmDataItem"%>
<%@ include file="/portlet/init.jsp"%>
<%@ include file="/portlet/quanlyhs/thulyhs/totiepnhan/initToTiepNhan.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
	HttpSession httpSession = null;
	try {
		httpSession = PortalUtil.getHttpServletRequest(renderRequest).getSession();
	} catch (Exception es) {
	}
	
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
	
	//----------- organizationId
	long organizationId = 0;
	if (themeDisplay.getUser().getOrganizations() != null && themeDisplay.getUser().getOrganizations().size() > 0) {
		organizationId = themeDisplay.getUser().getOrganizations().get(0).getOrganizationId();
	}
	
	String liRoleSelected = CommonUtils.checkRole(themeDisplay);
%>

<div style="height: 15px" id="theDem"></div>

<!---------------- Thành phần Hồ sơ --------------------->
<%
PortletURL urlThanhPhanHoSo = renderResponse.createActionURL();
urlThanhPhanHoSo.setParameter(ActionRequest.ACTION_NAME, "hoSoPhanCongMotDonViKiemTra");
%>

<div id="divThanhPhanHoSo">
<aui:form action="<%=urlThanhPhanHoSo.toString()%>" name="formThanhPhanHoSo" id="formThanhPhanHoSo" method="GET">

	<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1">
		<!----------------------------- Thủ tục hành chính, thutuchanhchinhid  ----------------------------->
		<div class="row">
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel"></label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 65%;">
				<%
					List<TthcThuTucHanhChinh> lstThuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.getTthcThuTucHanhChinhs(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
					if (lstThuTucHanhChinh == null) { lstThuTucHanhChinh = new ArrayList<TthcThuTucHanhChinh>(); }
				%>
				<select id="thutuchanhchinhid" name="thutuchanhchinhid" class="form-control-find" style="width: 100%;">
					<option selected="selected" value="-1">-------------  <liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.hsphancongmondonvikt.chondonvikiemtra"/>  -------------</option>
					<%for (TthcThuTucHanhChinh item : lstThuTucHanhChinh) {%>
						<option value="<%=item.getId()%>"><%=item.getTenThuTuc()%></option>
					<%}%>
				</select>
			</div> 
		</div>
		
		
		<!----------------------------- Biểu mẫu hồ sơ, bieumauhosoid ----------------------------->
		<div class="row">
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel">Biểu mẫu hồ sơ</label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 65%;">
				<%
					List<TthcBieuMauHoSo> lstBieuMauHoSo = TthcBieuMauHoSoLocalServiceUtil.getTthcBieuMauHoSos(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
					if (lstBieuMauHoSo == null) { lstBieuMauHoSo = new ArrayList<TthcBieuMauHoSo>(); }
				%>
				<select id="bieumauhosoid" name="bieumauhosoid" class="form-control-find" style="width: 100%;">
					<option selected="selected" value="-1">-------------  <liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.hsphancongmondonvikt.chondonvikiemtra"/>  -------------</option>
					<%for (TthcBieuMauHoSo item : lstBieuMauHoSo) {%>
						<option value="<%=item.getId()%>"><%=item.getTenBieuMau()%></option>
					<%}%>
				</select>
			</div> 
		</div>
		
		
		
		<!-- Thứ tự hiển thị, thutuhienthi -->
		<div class="row">
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel">Thứ tự hiển thị</label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 65%;">
				<input type="text" id="thutuhienthi" name="thutuhienthi" class="form-control-find" style="width: 100%" placeholder="Thứ tự hiển thị"/>
			</div> 
		</div>
		
		
		<!-- Loại thành phần, loaithanhphan -->
		<div class="row">
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel">Loại thành phần</label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 65%;">
				<input type="text" id="loaithanhphan" name="loaithanhphan" class="form-control-find" style="width: 100%" placeholder="Loại thành phần"/>
			</div> 
		</div>
		
		
		<!-- Mẫu trực tuyến, mautructuyen -->
		<div class="row">
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel">Mẫu trực tuyến</label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 65%;">
				<input type="text" id="mautructuyen" name="mautructuyen" class="form-control-find" style="width: 100%" placeholder="Mẫu trực tuyến"/>
			</div> 
		</div>
		
		
		<!-- Số tài liệu đính kèm, sotailieudinhkem -->
		<div class="row">
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel">Số tài liệu đính kèm</label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 65%;">
				<input type="text" id="sotailieudinhkem" name="sotailieudinhkem" class="form-control-find" style="width: 100%" placeholder="Số tài liệu đính kèm"/>
			</div> 
		</div>
		
		
	</div>
	
	<aui:button-row>
		<button type="button" class="btnThuLyHS form-control" style="width: 150px"
			onclick="if(validatorBeforeData()) beforSummitForm('formThanhPhanHoSo', '<%=urlThanhPhanHoSo.toString() %>')">Insert Or Update</button>
	</aui:button-row>
</aui:form>
</div>

<script type="text/javascript">

	function validatorBeforeData () {
		var code = $("select#corporationId").val();
		if (code === '-1') {
			alert("Đề nghị chọn đơn vị phân công kiểm tra !");
			return false;
		} else {
			return true;
		}
	}

	//de ve file js, ko an doan code: <portlet:namespace/>
	function beforSummitForm(idForm, url) {
		console.log('=beforSummitForm=' + idForm);
		var urlAction = document.getElementById('<portlet:namespace/>' + idForm).action;
		if (urlAction == '') {
			document.getElementById('<portlet:namespace/>' + idForm).action = url;
		}
		var status = confirm("Bạn có muốn tiếp tục xử lý?");
		if (status) { 
			document.getElementById('<portlet:namespace/>' + idForm).submit(); 
		} else {
			document.getElementById('<portlet:namespace/>' + idForm).action = '';
		}
	}
</script>