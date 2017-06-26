<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.portlet.hoso.QuanLyHoSoAction"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.gt.dk.utils.format.ConvertUtil"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="vn.dtt.gt.dk.utils.format.CommonUtils"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcThuTucHanhChinhLocalService"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcLinhVucThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcLinhVucThuTuc"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>

<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ include file="/portlet/init.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<style>

.col-md-14 {
    width: 14%;
}

.col-md-15 {
    width: 24%;
}

.col-md-16 {
    width: 16%;
}
</style>
<script type="text/javascript"> var imageFilesPath = '<%=request.getContextPath()%>'+"/img/";
</script>
<%
	TthcLinhVucThuTuc curentLinhVucThuTuc = null;
	List<TthcLinhVucThuTuc> allLoaiThuTuc = new ArrayList<TthcLinhVucThuTuc>();
	allLoaiThuTuc = TthcLinhVucThuTucLocalServiceUtil.getTthcLinhVucThuTucs(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	long userId = PortalUtil.getUserId(request);
	CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil.fetchByInspectorId(userId);
	TthcThuTucHanhChinh curentThuTucHanhChinh = null;
	List<TthcThuTucHanhChinh> allThuTucHanhChinh = null;
	
	List<String> allYears = CommonUtils.getTenYearRecently();
		
	String loaiThuTuc = ParamUtil.getString(request, Constants.LOAI_THU_TUC);
    String tenThuTuc = ParamUtil.getString(request, Constants.TEN_THU_TUC);
    String soHoSo = ParamUtil.getString(request, Constants.SO_HO_SO);
    String doanhNghiep = ParamUtil.getString(request, Constants.DOANH_NGHIEP);
    String ngayNopHsFrom = ParamUtil.getString(request, Constants.NGAY_NOP_HO_SO_FROM);
    String ngayNopHsTo = ParamUtil.getString(request, Constants.NGAY_NOP_HO_SO_TO);
    String namNhap = ParamUtil.getString(request, Constants.NAM_NHAP);
    String soDKKT = ParamUtil.getString(request, Constants.SO_DKKT);

    PortletURL actionUrltimkiemHoSo = renderResponse.createActionURL();
	actionUrltimkiemHoSo.setParameter(ActionRequest.ACTION_NAME, "timKiemHoSo");
	
	List<DmDataItem> liDmDataItems = DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevel(2, 0);
	
	HttpSession httpSession = null;
	try {
		httpSession = PortalUtil.getHttpServletRequest(renderRequest).getSession();
	} catch (Exception es) { }

	//-------------- phan nhom ho so
	String idPhanNhomHoSo = "";
	if (httpSession != null) {
		Object obj = httpSession.getAttribute(Constants.MAPHANNHOMHOSO);
		if (obj != null) {
			idPhanNhomHoSo = obj.toString();
		} else {
			idPhanNhomHoSo = "";
		}
	}
	
	LogFactoryUtil.getLog(QuanLyHoSoAction.class).debug( "===quanlyhs/search_content_find.jsp==idPhanNhomHoSo=" + idPhanNhomHoSo);
	
	String tenPhanNhomHoSo = "";
	TthcPhanNhomHoSo tthcPhanNhomHoSo = TthcPhanNhomHoSoLocalServiceUtil.fetchTthcPhanNhomHoSo(ConvertUtil.convertToLong(idPhanNhomHoSo));
	if(tthcPhanNhomHoSo != null){
		tenPhanNhomHoSo = tthcPhanNhomHoSo.getTenPhanNhom();
	}
	
	// Ghi actionlog
	
	String noidungthaotac = "Mở xem Tìm kiếm hồ sơ - [" + tenPhanNhomHoSo + "] thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) + " theo Số hồ sơ " + soHoSo + " hoặc Số ĐKKT " + soDKKT; 
	String tenmanhinhdaidien = "Tìm kiếm hồ sơ - [" + tenPhanNhomHoSo + "]";
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(0, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);
%>
<aui:form action="<%=actionUrltimkiemHoSo.toString()%>" name="myForm" id="myForm" method="POST">
	<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1">
		<div tabindex="0" class="CollapsiblePanelTab">
			<h5 class="tieude">
				<liferay-ui:message key="vn.dtt.qlhs.timkiemhs" /> - [<%=tenPhanNhomHoSo%>]
				<i class="fa-right fa fa-angle-down"></i>
			</h5>
			<h5></h5>
		</div>
		<div class="CollapsiblePanelContent" style="display: block;">
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.loaithutuc" /></label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10">
					<select name="loaiThuTuc" id="loaiThuTuc" size="1" class="form-control-find">
						<option style="width: 100%" selected value=""><liferay-ui:message key="vn.gt.dk.qlhs.luachon" /></option>
						<%for (DmDataItem linhVucThuTuc : liDmDataItems) {
						%>
						<option <%=linhVucThuTuc.getCode0().equals(loaiThuTuc.trim()) ? "selected" : ""%> value="<%=linhVucThuTuc.getCode0()%>"><%=linhVucThuTuc.getName()%></option>
						<%}%>
					</select>
				</div>
			</div>
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.tenthutuc" /></label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10">
					<select name="tenThuTuc" id="tenThuTuc" size="1" class="form-control-find">
						<option style="width: 100%" selected value=""><liferay-ui:message key="vn.gt.dk.qlhs.luachon" /></option>
						<% if(loaiThuTuc.trim().length() > 0){
								allThuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.findByLinhVuc(Long.parseLong("1"));
								if(allThuTucHanhChinh == null){
									allThuTucHanhChinh = new ArrayList<TthcThuTucHanhChinh>();
								}
							} else{
								allThuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.getTthcThuTucHanhChinhs(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
							}
							if ((corporationInspector != null) && (corporationInspector.getRegularTthc() > 0)){
								tenThuTuc = Long.toString(corporationInspector.getRegularTthc()); }
								
							for (TthcThuTucHanhChinh thuTucHanhChinh : allThuTucHanhChinh) {%>
						<option <%=thuTucHanhChinh.getId() == ConvertUtil.convertToLong(tenThuTuc) ? "selected" : ""%> value="<%=thuTucHanhChinh.getId()%>"><%=thuTucHanhChinh.getTenThuTuc()%></option>
						<%}%>
					</select>
				</div>
			</div>
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.sohoso" /></label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10">
					<div class="row">
						<div class="col-xs-3 col-sm-3 col-md-3">
							<input type="text" placeholder="Nhập mã số hồ sơ" class="form-control-find" name="soHoSo" id="soHoSo" value="<%=soHoSo%>" />
						</div>
						<div class="col-xs-3 col-sm-3 col-md-14">
							<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.searchcontentfind.ngaynophoso"/></label>
						</div>
						<div class="col-xs-3 col-sm-3 col-md-15" style="margin-left: -35px;">
							<div class="input-group">
								<input type="text" placeholder="Từ ngày" name="ngayNopHsFrom" id="ngayNopHsFrom" value="<%=ngayNopHsFrom%>"
									onclick="gtCalendar('ngayNopHsFrom')" class="form-control-find-calendar"> <span class="input-group-btn">
									<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('ngayNopHsFrom')">
										<i class="fa fa-calendar"></i>
									</button>
								</span>
							</div>
						</div>
						<div class="col-xs-3 col-sm-3 col-md-15">
							<div class="input-group">
								<input type="text" placeholder="Đến ngày" name="ngayNopHsTo" id="ngayNopHsTo" value="<%=ngayNopHsTo%>"
									onclick="gtCalendar('ngayNopHsTo')" class="form-control-find-calendar"> <span class="input-group-btn">
									<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('ngayNopHsTo')">
										<i class="fa fa-calendar"></i>
									</button>
								</span>
							</div>

						</div>
						<div class="col-xs-3 col-sm-3 col-md-16" style="margin-left: 7px;">
							<select name="namNhap" id="namNhap" size="1" class="form-control-find">
								<option style="width: 100%" selected value=""><liferay-ui:message key="vn.gt.dk.qlhs.nam" /></option>
								<%for (String year : allYears) {%>
								<option <%=year.trim().equals(namNhap) ? "selected" : ""%> value="<%=year%>"><%=year%></option>
								<%}%>
							</select>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Số ĐKKT</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10">
					<div class="row">
						<div class="col-xs-3 col-sm-3 col-md-3">
							<input type="text" placeholder="Nhập số đăng kí kiểm tra" class="form-control-find" name="soDKKT" id="soDKKT" value="<%=soDKKT%>" />
						</div>
						<div class="col-xs-3 col-sm-3 col-md-14">
							<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.doanhnghiep" /></label>
						</div>
						<div class="col-xs-3 col-sm-3 col-md-4" style="margin-left: -35px;width: 48%;">
							<div>
							<input type="text" name="doanhNghiep" id="doanhNghiep" value="<%=doanhNghiep %>" placeholder="Nhập tên doanh nghiệp" class="form-control-find">
							</div>
						</div>
						<div class="col-xs-3 col-sm-3 col-md-2">
							<button type="submit" class="fa-right bt btxanhduong btn btn-default"><liferay-ui:message key="vn.gt.dk.qlhs.button.timkiem" /></button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</aui:form>

<portlet:resourceURL var="updaContentURL" >
</portlet:resourceURL>

<portlet:actionURL var="findThuTucHanhChinhByLinhVuc" name="findThuTucHanhChinhByLinhVuc" />

<script>
var dataURL = '<%=findThuTucHanhChinhByLinhVuc.toString()%>';

	$(document).ready(function() {
		$('#loaiThuTuc').change(function(event) {

			var code = $("select#loaiThuTuc").val();
			var linhvucthutucid = "1";
			code = linhvucthutucid;
			console.log(code);
			
			if (code == "") {
				return;
			}
			
			
			$.ajax({
				url: '<%=updaContentURL%>',
				dataType: "json",
				data: { 
					codeLoaiThuTuc : code,
					type : 'GetTenThuTuc'
				},
				
				type: "get",
				success : function (data) {
					console.log(data);

					var select = $('#tenThuTuc');
					select.find('option').remove();

					$('<option>').val("").text("---- Lựa chọn ------").appendTo(select);
					$.each(data, function(idx, obj) {
						console.log(obj);
						$('<option>').val(obj.id).text(obj.name).appendTo(select);
				 	});

				}, beforeSend: function() {
				      console.log("===beforeSend==");
				}, complete: function() {
					console.log("===complete==");
				}, error: function() {
				      console.log("==error==");
			       // $('#userContent').html('<span style="color:red">Connection problems</span>');
			      }
			    });
			});
	});

	/**
	 * 

	 // $(function() {
	 $( ".dk-calendar" ).datepicker({
	 changeMonth: true,
	 changeYear: true,
	 yearRange: '2000:2030',
	 showButtonPanel: true
	 });
	 });
	 */
</script>
