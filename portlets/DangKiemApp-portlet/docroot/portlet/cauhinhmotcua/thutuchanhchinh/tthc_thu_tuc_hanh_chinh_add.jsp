<%@page import="vn.dtt.gt.dk.dao.common.service.TthcCoQuanQlttLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcCoQuanQltt"%>
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

	String idHoSoThuTuc = ParamUtil.getString(request, Constants.ID_HO_SO_THU_TUC);
	String idthuTucHanhChinh = ParamUtil.getString(request, Constants.TTHC_THUTUCHANHCHINH_ID);
	String id_phieu_xu_ly_phu = ParamUtil.getString(request, Constants.ID_PHIEU_XU_LY_PHU);
	
	System.out.println("==idHoSoThuTuc==" + idHoSoThuTuc + "===idthuTucHanhChinh===" + idthuTucHanhChinh + "===id_phieu_xu_ly_phu===" + id_phieu_xu_ly_phu);
%>

<div style="height: 15px" id="theDem"></div>

<!---------------- Thủ tục hành chính  --------------------->
<%
PortletURL urlMotCuaThuTucHanhChinh = renderResponse.createActionURL();
urlMotCuaThuTucHanhChinh.setParameter(ActionRequest.ACTION_NAME, "insertOrUpdateMotCuaThuTucHanhChinh");
%>

<div id="divThuTucHanhChinh">
<aui:form action="<%=urlMotCuaThuTucHanhChinh.toString()%>" name="formMotCuaThuTucHanhChinh" id="formMotCuaThuTucHanhChinh" method="GET">

	<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1">
		<!------------------------------ Mã thủ tục ------------------------------>
		<div class="row">
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel">Mã thủ tục</label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 65%;">
				<input type="text" id="mathutuc" name="mathutuc" class="form-control-find" style="width: 100%" placeholder="Mã thủ tục"/>
			</div>
		</div>
		
		<!------------------------------ Tên thủ tục ------------------------------>
		<div class="row">
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel">Tên thủ tục</label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 65%;">
				<input type="text" id="tenthutuc" name="tenthutuc" class="form-control-find" style="width: 100%" placeholder="Tên thủ tục"/>
			</div>
		</div>
		
		
		<!------------------------------ trinhtuthuchien ------------------------------>
		<div class="row">
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel">Trình tự thực hiện</label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 65%;">
				<input type="text" id="trinhtuthuchien" name="trinhtuthuchien" class="form-control-find" style="width: 100%" placeholder="Trình tự thực hiện"/>
			</div>
		</div>
		
		<!------------------------------ Cách thực hiện ------------------------------>
		<div class="row">
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel">Cách thực hiện</label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 65%;">
				<input type="text" id="cachthucthuchien" name="cachthucthuchien" class="form-control-find" style="width: 100%" placeholder="Cách thực hiện"/>
			</div>
		</div>
		
		<!------------------------------ Thành phần hồ sơ ------------------------------>
		<div class="row">
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel">Thành phần hồ sơ</label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 65%;">
				<input type="text" id="thanhphanhoso" name="thanhphanhoso" class="form-control-find" style="width: 100%" placeholder="Thành phần hồ sơ"/>
			</div>
		</div>
		
		<!------------------------------ Điều kiện thực hiện ------------------------------>
		<div class="row">
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel">Điều kiện thực hiện</label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 65%;">
				<input type="text" id="dieukienthuchien" name="dieukienthuchien" class="form-control-find" style="width: 100%" placeholder="Điều kiện thực hiện"/>
			</div>
		</div>
		
		
		<!------------------------------ Thời gian giải quyết ------------------------------>
		<div class="row">
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel">Thời gian giải quyết</label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 65%;">
				<input type="text" placeholder="Thời gian giải quyết" class="form-control-find-calendar"
						name="thoihangiaiquyet" id="thoihangiaiquyet" onclick="gtCalendar('thoihangiaiquyet')"
						style="width: 40%; float: left;">
				<span class="input-group-btn">
					<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('thoihangiaiquyet')"><i class="fa fa-calendar"></i></button>
				</span>
			</div>
		</div>
		
		<!------------------------------ Đối tượng thực hiện ------------------------------>
		<div class="row">
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel">Đối tượng thực hiện</label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 65%;">
				<input type="text" id="doituongthuchien" name="doituongthuchien" class="form-control-find" style="width: 100%" placeholder="Đối tượng thực hiện"/>
			</div>
		</div>
		
		<!------------------------------ Kết quả xử lý ------------------------------>
		<div class="row">
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel">Kết quả xử lý</label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 65%;">
				<input type="text" id="ketquaxuly" name="ketquaxuly" class="form-control-find" style="width: 100%" placeholder="Kết quả xử lý"/>
			</div>
		</div>
		
		
		<!------------------------------ Căn cứ pháp lý ------------------------------>
		<div class="row">
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel">Căn cứ pháp lý</label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 65%;">
				<input type="text" id="cancuphaply" name="cancuphaply" class="form-control-find" style="width: 100%" placeholder="Căn cứ pháp lý"/>
			</div>
		</div>
		
		
		<!------------------------------ Lệ phí ------------------------------>
		<div class="row">
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel">Lệ phí</label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 65%;">
				<input type="text" id="lephi" name="lephi" class="form-control-find" style="width: 100%" placeholder="Lệ phí"/>
			</div>
		</div>
		
		<!------------------------------ Cơ quan quản lý thủ tục, coquanqlttid ------------------------------>
		<div class="row">
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel">Cơ quan quản lý thủ tục</label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 65%;">
				<%
					List<TthcCoQuanQltt> lstCoQuanQltt = TthcCoQuanQlttLocalServiceUtil.getTthcCoQuanQltts(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
					if (lstCoQuanQltt == null) { lstCoQuanQltt = new ArrayList<TthcCoQuanQltt>(); }
				%>
				<select id="coquanqlttid" name="coquanqlttid" class="form-control-find" style="width: 100%;">
					<option selected="selected" value="-1">-------------  <liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.hsphancongmondonvikt.chondonvikiemtra"/>  -------------</option>
					<%for (TthcCoQuanQltt item : lstCoQuanQltt) {%>
						<option value="<%=item.getId()%>"><%=item.getTenCoQuanQltt()%></option>
					<%}%>
				</select>
			</div>
		</div>
		
	
		
		<!------------------------------ Lĩnh vực thủ tục, linhvucthutucid ------------------------------>
		<div class="row">
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel">Lĩnh vực thủ tục</label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 65%;">
				<%
					List<TthcLinhVucThuTuc> lstLinhVucThuTuc = TthcLinhVucThuTucLocalServiceUtil.getTthcLinhVucThuTucs(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
					if (lstLinhVucThuTuc == null) { lstLinhVucThuTuc = new ArrayList<TthcLinhVucThuTuc>(); }
				%>
				<select id="linhvucthutucid" name="linhvucthutucid" class="form-control-find" style="width: 100%;">
					<option selected="selected" value="-1">-------------  <liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.hsphancongmondonvikt.chondonvikiemtra"/>  -------------</option>
					<%for (TthcLinhVucThuTuc item : lstLinhVucThuTuc) {%>
						<option value="<%=item.getId()%>"><%=item.getTenLinhVuc()%></option>
					<%}%>
				</select>
			</div>
		</div>
		
		<!------------------------------ Ngày có hiệu lực ------------------------------>
		<div class="row">
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel">Ngày có hiệu lực</label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 65%;">
				<input type="text" placeholder="Ngày có hiệu lực" class="form-control-find-calendar"
						name="ngaycohieuluc" id="ngaycohieuluc" onclick="gtCalendar('ngaycohieuluc')"
						style="width: 40%; float: left;">
				<span class="input-group-btn">
					<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('ngaycohieuluc')"><i class="fa fa-calendar"></i></button>
				</span>
			</div>
		</div>
		
		
		<!------------------------------ Ngày hết hiệu lực ------------------------------>
		<div class="row">
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel">Ngày hết hiệu lực</label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 65%;">
				<input type="text" placeholder="Ngày hết hiệu lực" class="form-control-find-calendar"
						name="ngayhethieuluc" id="ngayhethieuluc" onclick="gtCalendar('ngayhethieuluc')"
						style="width: 40%; float: left;">
				<span class="input-group-btn">
					<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('ngayhethieuluc')"><i class="fa fa-calendar"></i></button>
				</span>
			</div>
		</div>
		
		
		
		<!------------------------------ Hướng dẫn thực hiện ------------------------------>
		<div class="row">
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel">Hướng dẫn thực hiện</label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 65%;">
				<input type="text" id="huongdanthuchien" name="huongdanthuchien" class="form-control-find" style="width: 100%" placeholder="Hướng dẫn thực hiện"/>
			</div>
		</div>
		
	</div>
	
	<aui:button-row>
		<button type="button" class="btnThuLyHS form-control" style="width: 150px"
			onclick="if(validatorBeforeData()) beforSummitForm('formMotCuaThuTucHanhChinh', '<%=urlMotCuaThuTucHanhChinh.toString() %>')"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.hsphancongmondonvikt.yeucaubosung"/></button>
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