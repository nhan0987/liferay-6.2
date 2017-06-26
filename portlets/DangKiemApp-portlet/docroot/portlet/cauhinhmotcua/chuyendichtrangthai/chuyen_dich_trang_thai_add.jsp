<%@page import="vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.MotCuaTrangThaiHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo"%>
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
System.out.println("/cauhinhmotcua/chuyendichtrangthai/chuyen_dich_trang_thai_add.jsp");
	TthcLinhVucThuTuc curentLinhVucThuTuc = null;
	List<TthcLinhVucThuTuc> allLoaiThuTuc = new ArrayList<TthcLinhVucThuTuc>();
	allLoaiThuTuc = TthcLinhVucThuTucLocalServiceUtil.getTthcLinhVucThuTucs(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	
	TthcThuTucHanhChinh curentThuTucHanhChinh = null;
	List<TthcThuTucHanhChinh> allThuTucHanhChinh = null;
	
	List<String> allYears = CommonUtils.getTenYearRecently();
	
	String loaiThuTuc = ParamUtil.getString(request, Constants.LOAI_THU_TUC);
    String tenThuTuc = ParamUtil.getString(request, Constants.TEN_THU_TUC);
   
    PortletURL actionUrlThemMoiChuyeDichTrangThai = renderResponse.createActionURL();
    actionUrlThemMoiChuyeDichTrangThai.setParameter(ActionRequest.ACTION_NAME, "themMoiChuyenDichTrangThai");
	
	List<DmDataItem> liDmDataItems = DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevel(2, 0);
	List<MotCuaTrangThaiHoSo> allTrangThaiHoSo = MotCuaTrangThaiHoSoLocalServiceUtil.getMotCuaTrangThaiHoSos(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	List<TthcPhanNhomHoSo> allPhanNhomHoSo = TthcPhanNhomHoSoLocalServiceUtil.getTthcPhanNhomHoSos(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	
%>
<aui:form action="<%=actionUrlThemMoiChuyeDichTrangThai.toString()%>" name="myForm" id="myForm" method="POST">
	<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1">
		<div tabindex="0" class="CollapsiblePanelTab">
			<h5 class="tieude">
				<liferay-ui:message key="vn.dtt.qlhs.timkiemhs" />
				<i class="fa-right fa fa-angle-down"></i>
			</h5>
			<h5></h5>
		</div>
		<div class="CollapsiblePanelContent" style="display: block;">
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Loại thủ tục</label>
				</div>
				<div class="col-xs-3 col-sm-3 col-md-3">
					<select name="loaiThuTuc" id="loaiThuTuc" size="1" class="form-control-find">
						<option style="width: 100%" selected value=""><liferay-ui:message key="vn.gt.dk.chmc.luachon" /></option>
						<%for (DmDataItem linhVucThuTuc : liDmDataItems) {
						%>
						<option <%=linhVucThuTuc.getCode0().equals(loaiThuTuc.trim()) ? "selected" : ""%> value="<%=linhVucThuTuc.getCode0()%>"><%=linhVucThuTuc.getName()%></option>
						<%}%>
					</select>
				</div>
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel"><liferay-ui:message key="vn.gt.dk.chmc.tenthutuc" /></label>
				</div>
				<div class="col-xs-3 col-sm-3 col-md-3">
					<select name="tenThuTuc" id="tenThuTuc" size="1" class="form-control-find">
						<option style="width: 100%" selected value=""><liferay-ui:message key="vn.gt.dk.chmc.luachon" /></option>
						<% if(loaiThuTuc.trim().length() > 0){
								allThuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.findByLinhVuc(Long.parseLong(loaiThuTuc));
								if(allThuTucHanhChinh == null){
									allThuTucHanhChinh = new ArrayList<TthcThuTucHanhChinh>();
								}
							} else{
								allThuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.getTthcThuTucHanhChinhs(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
							}
							for (TthcThuTucHanhChinh thuTucHanhChinh : allThuTucHanhChinh) {%>
						<option <%=thuTucHanhChinh.getId() == ConvertUtil.convertToLong(tenThuTuc) ? "selected" : ""%> value="<%=thuTucHanhChinh.getId()%>"><%=thuTucHanhChinh.getTenThuTuc()%></option>
						<%}%>
					</select>
				</div>
			</div>
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Trạng thái nguồn</label>
				</div>
				<div class="col-xs-3 col-sm-3 col-md-3">
					<select name="trangThaiNguon" id="trangThaiNguon" size="1" class="form-control-find">
						<option style="width: 100%" selected value=""><liferay-ui:message key="vn.gt.dk.chmc.luachon" /></option>
						<%for (MotCuaTrangThaiHoSo trangThaiHs : allTrangThaiHoSo) {
						%>
						<option value="<%=String.valueOf(trangThaiHs.getId())%>"><%=trangThaiHs.getTenTrangThai()%></option>
						<%}%>
					</select>
				</div>
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Trạng thái đích</label>
				</div>
				<div class="col-xs-3 col-sm-3 col-md-3">
					<select name="trangThaiDich" id="trangThaiDich" size="1" class="form-control-find">
						<option style="width: 100%" selected value=""><liferay-ui:message key="vn.gt.dk.chmc.luachon" /></option>
						<%for (MotCuaTrangThaiHoSo trangThaiHs : allTrangThaiHoSo) {
						%>
						<option value="<%=String.valueOf(trangThaiHs.getId())%>"><%=trangThaiHs.getTenTrangThai()%></option>
						<%}%>
					</select>
				</div>
			</div>
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Người xóa</label>
				</div>
				<div class="col-xs-3 col-sm-3 col-md-3">
					<input type="text" placeholder="Nhập tên người xóa" class="form-control-find" name="nguoiXoa" id="nguoiXoa" value="" />
				</div>
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Ngày xóa</label>
				</div>
				<div class="col-xs-3 col-sm-3 col-md-3" style="margin-left: -35px;">
					<div class="input-group">
						<input type="text" placeholder="Từ ngày" name="ngayXoa" id="ngayXoa" value=""
							onclick="gtCalendar('ngayXoa')" class="form-control-find-calendar"> <span class="input-group-btn">
							<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('ngayXoa')">
								<i class="fa fa-calendar"></i>
							</button>
						</span>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Điều kiện dịch chuyển</label>
				</div>
				<div class="col-xs-3 col-sm-3 col-md-3">
					<input type="text" placeholder="Nhập điều kiện dịch chuyển" class="form-control-find" name="dieuKienDichChuyen" id="dieuKienDichChuyen" value="" />
				</div>
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Số ngày xử lý</label>
				</div>
				<div class="col-xs-3 col-sm-3 col-md-3">
					<input type="text" placeholder="Nhập số ngày xử lý" class="form-control-find" name="soNgayXuLy" id="soNgayXuLy" value="" />
				</div>
			</div>
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Hành động xử lý</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10">
					<input type="text" placeholder="Nhập hành động xử lý" class="form-control-find" name="hanhDongXuLy" id="hanhDongXuLy" value="" />
				</div>
			</div>
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Phân nhóm hồ sơ</label>
				</div>
				<div class="col-xs-3 col-sm-3 col-md-3">
					<select name="phanNhomHoSo" id="phanNhomHoSo" size="1" class="form-control-find">
						<option style="width: 100%" selected value=""><liferay-ui:message key="vn.gt.dk.chmc.luachon" /></option>
						<%for (TthcPhanNhomHoSo phanNhomHs : allPhanNhomHoSo) {
						%>
						<option value="<%=String.valueOf(phanNhomHs.getId())%>"><%=phanNhomHs.getTenPhanNhom()%></option>
						<%}%>
					</select>
				</div>
			</div>
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2">
					<button type="submit" class="fa-right bt btxanhduong btn btn-default">Thêm mới</button>
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
			console.log(code);
			
			if (code == "") {
				return;
			}
			/**
			var JSONdata = jQuery.ajax({
			     type: "GET",
			     dataType: "json",
			     url: dataURL,
			     data : { codeLoaiThuTuc : code }
			}).done(function(jsonData) {
			     // do something with the data, it should already be parsed
			     alert(jsonData.length); // your data sample is an array, see if it gets a length back
			     console.log(jsonData);
			   //preferred
					console.log("===");
					var data2 = JSON.parse(jsonData);

					//console.log(data2);
					//xoa du lieu cu trong khu vuc cang
					var select = $('#tenThuTuc');
					select.find('option').remove();
					
					$('<option>').val("").text("---- Lựa chọn ------").appendTo(select);
					for ( var i = 0; i < data2.length; i++) {
						$('<option>').val(data2[i].id).text(data2[i].name).appendTo(select);
					}
			     
			}).fail(function(xhr) {
				console.log("false----hoho==");
				console.log(xhr);
				
			     // uh oh, we failed.. you should always handle failures too.
			});
			*/
			
			
			
			$.ajax({
				//url : dataURL,
				url: '<%=updaContentURL%>',
				dataType: "json",
				data: { 
					codeLoaiThuTuc : code,
					type : 'GetTenThuTuc'
				},
				
				type: "get",
				success : function (data) {
					console.log(data);
					//preferred
					//var data2 = JSON.parse(data);
					//console.log(data2);
					
					//xoa du lieu cu trong khu vuc cang
					var select = $('#tenThuTuc');
					select.find('option').remove();

					$('<option>').val("").text("---- Lựa chọn ------").appendTo(select);
					$.each(data, function(idx, obj) {
						console.log(obj);
						$('<option>').val(obj.id).text(obj.name).appendTo(select);
				 	});
					//for ( var i = 0; i < data2.id.length; i++) {
					//};
				}, beforeSend: function() {
				      console.log("===beforeSend==");
			    	  //$("#wait").css("display","block");
				}, complete: function() {
					console.log("===complete==");
					//$("#wait").css("display","none");
					//$('#usersTable').empty();
		  	  		//$('#usersTable').html(allRows.trim());
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
