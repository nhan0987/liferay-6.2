<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.utils.DanhMucKey"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.DmDataItem"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ include file="/portlet/init.jsp"%>
<%@ include file="/portlet/quanlyhs/thulyhs/totiepnhan/initToTiepNhan.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="text/javascript"> var imageFilesPath = '<%=request.getContextPath()%>'+"/img/";</script>
<%
	TthcLinhVucThuTuc curentLinhVucThuTuc = null;
	List<TthcLinhVucThuTuc> allLoaiThuTuc = new ArrayList<TthcLinhVucThuTuc>();
	allLoaiThuTuc = TthcLinhVucThuTucLocalServiceUtil.getTthcLinhVucThuTucs(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	
	TthcThuTucHanhChinh curentThuTucHanhChinh = null;
	List<TthcThuTucHanhChinh> allThuTucHanhChinh = null;
	
	//doi tuong xe
	String loaiThuTuc = ParamUtil.getString(request, Constants.LOAI_THU_TUC).trim();
	
	//ten thu duc
	String tenThuTuc = ParamUtil.getString(request, Constants.TEN_THU_TUC).trim();
	
	String soHoSo = ParamUtil.getString(request, Constants.SO_HO_SO).trim();
	String ngayNopHsFrom = ParamUtil.getString(request, Constants.NGAY_NOP_HO_SO_FROM).trim();
	String ngayNopHsTo = ParamUtil.getString(request, Constants.NGAY_NOP_HO_SO_TO).trim();
	String soDKKT = ParamUtil.getString(request, Constants.SO_DKKT).trim();
	String namNhap = ParamUtil.getString(request, Constants.NAM_NHAP);
	
	
	
	String quanHuyen = ParamUtil.getString(request, Constants.QUAN_HUYEN);
	
	String tinhThanh = ParamUtil.getString(request, Constants.TINH_THANH);
	
	String datNuoc = ParamUtil.getString(request, Constants.DAT_NUOC);
	datNuoc = (datNuoc.length() == 0) ? "VIE" : datNuoc;
%>
<%
PortletURL actionUrlTimKiemHoSoPhanCongDonViKiemTra = renderResponse.createActionURL();
actionUrlTimKiemHoSoPhanCongDonViKiemTra.setParameter(ActionRequest.ACTION_NAME, "timKiemPhieuXuLyPhuPhanCongNhieuDonViKiemTra");
%>
<%
	// Ghi actionlog
		
	String noidungthaotac = "Mở xem Thụ lý hồ sơ, chức năng Phân công đơn vị kiểm tra thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) ; 
	String tenmanhinhdaidien = "Phân công đơn vị kiểm tra cho nhiều hồ sơ";
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(0, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);

%>
<aui:form action="<%=actionUrlTimKiemHoSoPhanCongDonViKiemTra.toString()%>" name="myForm" id="myForm" method="POST">
	<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1">
		<!-- Tìm kiếm hồ sơ -->
		<div tabindex="0" class="CollapsiblePanelTab">
			<h5 class="tieude"><liferay-ui:message key="vn.dtt.qlhs.timkiemhs" /><i class="fa-right fa fa-angle-down"></i></h5><h5></h5>
		</div>
		
		<!-- cac option tim kiem -->
		<div class="CollapsiblePanelContent" style="display: block;">
		
			<!-------------------------- Doi tuong xe -------------------------->
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.loaithutuc" />:</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10">
					<select name="<%=Constants.LOAI_THU_TUC%>" id="<%=Constants.LOAI_THU_TUC%>" size="1" class="form-control-find" style="width: 100%">
						<option style="width: 100%" <%=(loaiThuTuc.equalsIgnoreCase("")) ? "selected" : ""%> value="">--------- <liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.hsphancongnhieudonviktsearchcontentfind.luachon"/> ---------</option>
						<%for (TthcLinhVucThuTuc linhVucThuTuc : allLoaiThuTuc) {%>
							<option <%=linhVucThuTuc.getId() == ConvertUtil.convertToLong(loaiThuTuc) ? "selected" : ""%>
								value="<%=linhVucThuTuc.getId()%>"><%=linhVucThuTuc.getTenLinhVuc()%></option>
						<%}%>
					</select>
				</div>
			</div>
			
			<!-------------------------- Ten thu tuc -------------------------->
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2"><label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.tenthutuc" />:</label></div>
				<div class="col-xs-10 col-sm-10 col-md-10">
					<select name="<%=Constants.TEN_THU_TUC%>" id=<%=Constants.TEN_THU_TUC%> size="1" class="form-control-find" style="width: 100%">
						<option style="width: 100%" <%=(tenThuTuc.equalsIgnoreCase("")) ? "selected" : ""%> value="">--------- <liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.hsphancongnhieudonviktsearchcontentfind.luachon"/> ---------</option>
						<% 
							if (loaiThuTuc.trim().length() > 0) {
								allThuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.findByLinhVuc(Long.parseLong(loaiThuTuc));
								if (allThuTucHanhChinh == null) {
									allThuTucHanhChinh = new ArrayList<TthcThuTucHanhChinh>();
								}
							} else {
								allThuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.getTthcThuTucHanhChinhs(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
							}
							for (TthcThuTucHanhChinh thuTucHanhChinh : allThuTucHanhChinh) {
						%>
								<option <%=thuTucHanhChinh.getId() == ConvertUtil.convertToLong(tenThuTuc) ? "selected" : ""%> value="<%=thuTucHanhChinh.getId()%>"><%=thuTucHanhChinh.getTenThuTuc()%></option>
						<%	
							}
						%>
					</select>
				</div>
			</div>
			
			<!-------------------------- So ĐKKT -------------------------->
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2"><label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.sohoso" /></label></div>
				<div class="col-xs-10 col-sm-10 col-md-10">
					<div class="row">
						<!-- Nhap text -->
						<div class="col-xs-3 col-sm-3 col-md-3">
							<input type="text" placeholder="Nhập text" class="form-control-find" style="width: 100%"
								name="<%=Constants.SO_HO_SO%>" id="<%=Constants.SO_HO_SO%>" value="<%=soHoSo%>" />
						</div>
						
						<!-- ngay nop ho so -->
						<div class="col-xs-3 col-sm-3 col-md-3">
							<div class="input-group">
								<input type="text" placeholder="Ngày nộp hồ sơ"  class="form-control-find-calendar"
									name="<%=Constants.NGAY_NOP_HO_SO_FROM%>"
									id="<%=Constants.NGAY_NOP_HO_SO_FROM%>"
									value="<%=ngayNopHsFrom%>"
									onclick="gtCalendar('ngayNopHsFrom')">
								<span class="input-group-btn">
									<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('ngayNopHsFrom')"><i class="fa fa-calendar"></i></button>
								</span>
							</div>
						</div>
						
						
						<!-- ngay nop ho so to -->
						<div class="col-xs-3 col-sm-3 col-md-3">
							<div class="input-group">
								<input type="text" placeholder="Đến ngày" onclick="gtCalendar('ngayNopHsTo')" class="form-control-find-calendar"
									name="<%=Constants.NGAY_NOP_HO_SO_TO%>"
									id="<%=Constants.NGAY_NOP_HO_SO_TO%>"
									value="<%=ngayNopHsTo%>">
								<span class="input-group-btn">
									<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('ngayNopHsTo')"><i class="fa fa-calendar"></i></button>
								</span>
							</div>
						</div>
						
						<!-- nam nhap -->
						<div class="col-xs-3 col-sm-3 col-md-3">
							<select size="1" class="form-control-find" style="width: 100%"
								name="<%=Constants.NAM_NHAP%>"
								id="<%=Constants.NAM_NHAP%>">
								<option style="width: 100%" <%=namNhap.equalsIgnoreCase("") ? "selected" : "" %> value=""><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.hsphancongnhieudonviktsearchcontentfind.nam"/></option>
								<%	List<String> allYears = CommonUtils.getTenYearRecently();
									for (String year : allYears) {%>
									<option <%=year.trim().equals(namNhap) ? "selected" : ""%> value="<%=year%>"><%=year%></option>
								<%}%>
							</select>
						</div>
					</div>
				</div>
			</div>
			
			<!-------------------------- noi ĐKKT -------------------------->
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2"><label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.sodkkt" /></label></div>
				<div class="col-xs-10 col-sm-10 col-md-10">
					<div class="row">
						<div class="col-xs-3 col-sm-3 col-md-3">
							<input type="text" placeholder="Nhập text" class="form-control-find" style="width: 100%"
								name="<%=Constants.SO_DKKT%>" id="<%=Constants.SO_DKKT%>" value="<%=soDKKT%>" />
						</div>
						<div class="col-xs-3 col-sm-3 col-md-3">
							<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.noidkkt" /></label>
						</div>
						<!----------------- quan huyen ----------------->
						<div class="col-xs-3 col-sm-3 col-md-3">
							<div class="input-group" style="width: 100%;">
								<select name="<%=Constants.QUAN_HUYEN%>" id="<%=Constants.QUAN_HUYEN%>" size="1" class="form-control-find">
									
									<option style="width: 100%" <%=quanHuyen.equalsIgnoreCase("") ? "selected" : ""%> value=""><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.hsphancongnhieudonviktsearchcontentfind.quanhuyen"/></option>
									<% 
										List<String> allQuanHuyens = new ArrayList<String>();
									%>
									<%for (String name : allQuanHuyens) {%>
										<option <%=name.trim().equals(quanHuyen) ? "selected" : ""%> value="<%=name%>"><%=name%></option>
									<%}%>
								</select>
							</div>
						</div>
						
						<!----------------- tinh thanh ----------------->
						<div class="col-xs-3 col-sm-3 col-md-3">
							<div class="input-group" style="width: 100%;">
								<select name="<%=Constants.TINH_THANH%>" id="<%=Constants.TINH_THANH%>" size="1" class="form-control-find">
									
									<option style="width: 100%" <%=tinhThanh.equalsIgnoreCase("") ? "selected" : "" %> value=""><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.hsphancongnhieudonviktsearchcontentfind.tinhthanh"/></option>
									<%
										List<DmDataItem> allTinhThanhs = DmDataItemLocalServiceUtil.findByDmDataGroupCodeAndLevel(DanhMucKey.ADMINISTRATIVE_UNITS, 1);
										//List<String> allTinhThanhs = new ArrayList<String>();
									%>
									<%for (DmDataItem item : allTinhThanhs) {%>
										<option <%=item.getCode0().equals(tinhThanh) ? "selected" : ""%> value="<%=item.getCode0()%>"><%=item.getName()%></option>
									<%}%>
								</select>
							</div>
						</div>
						
					</div>
				</div>
			</div>
			
			<!----------------- button tiem kiem ----------------->
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2"><label class="textlabel"></label></div>
				<div class="col-xs-10 col-sm-10 col-md-10">
					<div class="row">
						<div class="col-xs-3 col-sm-3 col-md-3">
							<div class="input-group">
								<button type="submit" class="fa-right bt btxanhduong btn btn-default"><liferay-ui:message key="vn.gt.dk.qlhs.button.timkiem" /></button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</aui:form>

<portlet:resourceURL var="updaContentURL" ></portlet:resourceURL>

<script>
	$(document).ready(function() {
		$('#loaiThuTuc').change(function(event) {
			var code = $("select#loaiThuTuc").val();
			console.log(code);
			if (code == "") {
				return;
			}
			$.ajax({
				url: '<%=updaContentURL%>',
				dataType : "json",
				data : {
					codeLoaiThuTuc : code
				},
				type : "get",
				success : function(data) {
					console.log(data);
					//preferred
					//var data2 = JSON.parse(data);
					//console.log(data2);

					//xoa du lieu cu trong khu vuc cang
					var select = $('#tenThuTuc');
					select.find('option').remove();

					$('<option>').val("").text("-------- Lựa chọn --------").appendTo(select);
					$.each(data, function(idx, obj) {
						console.log(obj);
						$('<option>').val(obj.id).text(obj.name).appendTo(select);
					});
				},
				beforeSend : function(data) {
					console.log("===beforeSend==");
					console.log(data);
				},
				complete : function(data) {
					console.log("===complete==");
					console.log(data);
				},
				error : function(data) {
					console.log("==error==");
					console.log(data);
				}
			});
		});
	});
</script>
