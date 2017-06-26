<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CorporationViewLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="vn.dtt.gt.dk.report.ReportConstant"%>
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
select.sel{
    position:relative;
    background:#fff;
    border:2px solid #000;    
}
.dropdown{
border:2px solid #000;
    margin-top:3px;
    padding:20px;
    width:160px;
    height:50px;
    display:none;
}
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
	
	TthcThuTucHanhChinh curentThuTucHanhChinh = null;
	List<TthcThuTucHanhChinh> allThuTucHanhChinh = null;
	
	List<String> allYears = CommonUtils.getTenYearRecently();
	
    PortletURL actionUrltimkiemHoSo = renderResponse.createActionURL();
	actionUrltimkiemHoSo.setParameter(ActionRequest.ACTION_NAME, "locPhanCongResult");
	
	List<DmDataItem> liDmDataItems = DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevel(2, 0);
	
	List<CorporationView> corporationViews = CorporationViewLocalServiceUtil.findByInspectorId(PortalUtil.getUserId(request));
	
	
List<DmDataItem> lstDoiKiemTra =  DmDataItemLocalServiceUtil.findByDataGroupIdAndAlterName(ReportConstant.CORPORATION, "KIEMTRA");
%>
<aui:form action="<%=actionUrltimkiemHoSo.toString()%>" name="myForm" id="myForm" method="POST">
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
					<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.loaithutuc" /></label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10">
						<div class="row">
							<div class="col-xs-3 col-sm-3 col-md-5">
								<select name="loaiThuTuc" id="loaiThuTuc" size="1" class="form-control-find">
									<option style="width: 100%" selected value=""><liferay-ui:message key="vn.gt.dk.qlhs.luachon" /></option>
									<%for (DmDataItem linhVucThuTuc : liDmDataItems) {
									%>
									<option <%=linhVucThuTuc.getCode0().equals(loaiThuTuc.trim()) ? "selected" : ""%> value="<%=linhVucThuTuc.getCode0()%>"><%=linhVucThuTuc.getName()%></option>
									<%}%>
								</select>
							</div>
							<div class="col-xs-3 col-sm-3 col-md-14">
								<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.tenthutuc" /></label>
							</div>
							<div class="col-xs-3 col-sm-3 col-md-5" style="margin-left: 22px;">
								<div>
									<select name="tenThuTuc" id="tenThuTuc" size="1" class="form-control-find">
										<option style="width: 100%" selected value=""><liferay-ui:message key="vn.gt.dk.qlhs.luachon" /></option>
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
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.sohoso" /></label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10">
					<div class="row">
						<div class="col-xs-3 col-sm-3 col-md-3">
							<input type="text" placeholder="nhập mã số hồ sơ" class="form-control-find" name="soHoSo" id="soHoSo" value="<%=soHoSo%>" />
						</div>
						<div class="col-xs-3 col-sm-3 col-md-14">
							<label class="textlabel">Ngày ĐNKT</label>
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
							<input type="text" placeholder="nhập số đkkt" class="form-control-find" name="soDKKT" id="soDKKT" value="<%=soDKKT%>" />
						</div>
						<div class="col-xs-3 col-sm-3 col-md-14">
							<label class="textlabel">Đội kiểm tra</label>
						</div>
						<div class="col-xs-3 col-sm-3 col-md-6" style="margin-left: -35px;">
							<div>
							<input type="text" placeholder="đội đkkt" class="form-control-find" name="doiDKKT" id="doiDKKT" style="width: 132%;" onclick="onChangeDoiKiemTra()" readonly="readonly"/>
							<input type="hidden" placeholder="đội đkkt" class="form-control-find" name="doiDKKT_id" id="doiDKKT_id" style="width: 132%;" />
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.doanhnghiep" /></label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10">
					<div class="row">
						<div class="col-xs-9 col-sm-9 col-md-10">
							<input type="text" name="doanhNghiep" id="doanhNghiep" value="<%=doanhNghiep %>" placeholder="nhập tên doanh nghiệp" class="form-control-find">
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


<div id="div_WarningMsg" style="display: none;">
	<table width="100%">
		<tr>
			<td colspan="2" style="width: 100%;"><label class="egov-label">
				Thay đổi giá trị nhập</label> 
			</td>
		</tr>
		<tr>
			<td colspan="2" style="width: 100%;">
				<%
				if(corporationViews  != null && corporationViews .size() >0){
					for(CorporationView dmDataItem : corporationViews ){
				%>
					<input type="checkbox" name="doi_<%=dmDataItem.getCorporationId()%>" id="doi_<%=dmDataItem.getCorporationId()%>" 
					onclick="changeState('<%=dmDataItem.getCorporationId()%>')" value="<%=dmDataItem.getCorporationName()%>"/><%=dmDataItem.getCorporationName() %>
					<br>
				<%
					}
				}
				%>
			</td>
		</tr>		
		<tr>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
					<input type="button" class="egov-button-normal" value="Đồng ý" id="btnXacNhanThongTinChung" 
					onclick="javascript: func_xacnhanPheDuyetTTChung();">
				&nbsp;&nbsp; 
				<input type="button" class="egov-button-normal" value="Hủy" onclick="javascript: func_huyPheDuyet();" >
			</td>
		</tr>
	</table>
</div>

<portlet:resourceURL var="updaContentURL">
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


	function func_xacnhanPheDuyetTTChung() {
		$('#div_WarningMsg').dialog('close');
	}
	
	function changeState(dataId) {
		
		var isCheck=document.getElementById('doi_'+dataId).checked;
		var valueGiaTriState=document.getElementById('doiDKKT_id').value;
		var hienThiGiaTriState=document.getElementById('doiDKKT').value;

		console.log("===isCheck=="+isCheck);
		console.log("===valueGiaTriState=="+valueGiaTriState);
		console.log("===hienThiGiaTriState=="+hienThiGiaTriState);

		
		var valueCheck=document.getElementById('doi_'+dataId).value;

		console.log("===valueCheck=="+valueCheck);
		
		if (isCheck==true){
			valueGiaTriState=valueGiaTriState+dataId+",";
			hienThiGiaTriState=hienThiGiaTriState+valueCheck+",";
		}else{
			var res = valueGiaTriState.replace(dataId+",", "");
			valueGiaTriState=res;
			hienThiGiaTriState=hienThiGiaTriState.replace(valueCheck+",", "");
		}

		console.log("==end=valueGiaTriState=="+valueGiaTriState);
		console.log("==end=hienThiGiaTriState=="+hienThiGiaTriState);

		
		document.getElementById('doiDKKT_id').value=valueGiaTriState;
		document.getElementById('doiDKKT').value=hienThiGiaTriState;
		
	}

	function showThongBaoMsg() {
		console.log("==showThongBaoMsg ==");
		$("#div_WarningMsg").dialog({
			title:'Xác nhận thay đổi',
	        resizable: false,
	        modal: true,
	        width: '400px',
	        
	        closeOnEscape: false,
	        open: function() {
	            jQuery('.ui-widget-overlay').bind('click', function() {
	                $('#div_WarningMsg').dialog('close');
	            });
	        }
		});
	}
	function onChangeDoiKiemTra(){
		showThongBaoMsg();
	}
	function func_huyPheDuyet() {
		 $('#div_WarningMsg').dialog('close');
	}
</script>
