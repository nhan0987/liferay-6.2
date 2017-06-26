<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord"%>
<%@page import="vn.dtt.gt.dk.portlet.hoso.QuanLyHoSoAction"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@ include file="/portlet/init.jsp"%>
<%@ include file="/portlet/quanlyhs/thulyhs/dangkiemvien/initDangKiemVien.jsp"%>

<meta http-equiv='cache-control' content='no-cache'>
<meta http-equiv='expires' content='0'>
<meta http-equiv='pragma' content='no-cache'>

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/dangkiemvien-duocPhanCong.css">
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<meta http-equiv='cache-control' content='no-cache'>
<meta http-equiv='expires' content='0'>
<meta http-equiv='pragma' content='no-cache'>

<%
long idPhieuXuLyPhu = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU);
InspectionRecord inspectionRecord = null;
VehicleGroup vehicleGroup  = null;
	long idBienBanKiemTra = 0;
	long idThongSoKiThuat = 0;
	try{
		inspectionRecord = InspectionRecordLocalServiceUtil.findByPhieuXuLyPhuId(idPhieuXuLyPhu);
		vehicleGroup = VehicleRecordLocalServiceUtil.findVehicleGroupByInspectionRecordId(inspectionRecord.getId());
	} catch (Exception e){
		
	}
	if (inspectionRecord != null) {
		idBienBanKiemTra = inspectionRecord.getAttachedFile();
	}
	if(vehicleGroup != null){
		idThongSoKiThuat = vehicleGroup.getAttachedFile();
	}
	System.out.println("----------idNoiDungHoSo-----------jsp--"+idBienBanKiemTra);
			String urlDefault = request.getContextPath() + "/pdf.js/web/viewer.html?file=" + request.getContextPath() + "/export/" + ReportConstant.TEN_FILE_DEFAULT;
			%>
			<!-- START------------ Tab hien thi bao cao report -->
			<div style="float: left; text-align: left; width: 100%; padding: 1% 1% 1% 0; margin-left: 1%; margin-top: 1%;">
				<div class="reportContainer" style="width: 100%;">
					<ul class="reportTabs">
						<li class="tab-link current" data-tab="reportTab-0" id="liBienBanKiemTra">Biên bản kiểm tra</li>
						<li class="tab-link" data-tab="reportTab-1" id="liThongSoKiThuat">Thông số kỹ thuật</li>
						<li class="tab-link" data-tab="reportTab-2" id="liTaiLieuThuNghiem">Tài liệu thử nghiệm</li>
						<li class="tab-link" data-tab="reportTab-3" id="liTaiLieuKhiThai">Tài liệu khí thải</li>
						<li class="tab-link" data-tab="reportTab-4" id="liTaiLieuAnToan">Tài liệu an toàn</li>
						<li class="tab-link" data-tab="reportTab-5" id="liTaiLieuKhiThai">Tài liệu khác</li>
					</ul>
					<!-- START TAB_i -->
					<div id="reportTab-0" class="tab-content-report current">
						<div id="u6148" style="left: 0px; width: 100%; height: 0px; padding-left: 14px;">
							<img alt="" src="/DangKiemApp-portlet/img/under_line_image.png" class="" style="position:relative; left:-2.3%; top:-8px; width:102%; height: 5px;">
						</div>
						<div id="viewFileBienBanKiemTra">
							<embed src="<%=urlDefault%>" type='application/pdf' id='fileContentBienBanKiemTra' style='width:100%; height:400px;'>
						</div>
					</div>
					<div id="reportTab-1" class="tab-content-report">
						<div id="u6148" style="left: 0px; width: 100%; height: 0px; padding-left: 14px;">
							<img alt="" src="/DangKiemApp-portlet/img/under_line_image.png" class="" style="position:relative; left:-2.3%; top:-8px; width:102%; height: 5px;">
						</div>
						<div id="viewFileThongSoKiThuat">
							<embed src="<%=urlDefault%>" type='application/pdf' id='fileContentThongSoKiThuat' style='width:100%; height:400px;'>
						</div>
					</div>
					
					<div id="reportTab-2" class="tab-content-report">
						<div id="u6148" style="left: 0px; width: 100%; height: 0px; padding-left: 14px;">
							<img alt="" src="/DangKiemApp-portlet/img/under_line_image.png" class="" style="position: relative;left: -2.3%;top: -8px;width:102%; height:5px;">
						</div>
						<div id="viewFileTaiLieuThuNghiem">
							<embed src="<%=urlDefault%>" type='application/pdf' id='fileContentTaiLieuThuNghiem' style='width:100%; height:400px;'>
						</div>
					</div>
					
					<div id="reportTab-3" class="tab-content-report">
						<div id="u6148" style="left: 0px; width: 100%; height: 0px; padding-left: 14px;">
							<img alt="" src="/DangKiemApp-portlet/img/under_line_image.png" class="" style="position: relative; left:-2.3%;top: -8px;width: 102%;height: 5px;">
						</div>
						<div id="viewFileTaiLieuKhiThai">
							<embed src="<%=urlDefault%>" type='application/pdf' id='fileContentTaiLieuKhiThai' style='width:100%;height:400px;'>
						</div>
					</div>
					<div id="reportTab-4" class="tab-content-report">
						<div id="u6148" style="left: 0px; width: 100%; height: 0px; padding-left: 14px;">
							<img alt="" src="/DangKiemApp-portlet/img/under_line_image.png" class="" style="position: relative; left:-2.3%;top: -8px;width: 102%;height: 5px;">
						</div>
						<div id="viewFileTaiLieuAnToan">
							<embed src="<%=urlDefault%>" type='application/pdf' id='fileContentTaiLieuAnToan' style='width:100%;height:400px;'>
						</div>
					</div>
					<div id="reportTab-5" class="tab-content-report">
						<div id="u6148" style="left: 0px; width: 100%; height: 0px; padding-left: 14px;">
							<img alt="" src="/DangKiemApp-portlet/img/under_line_image.png" class="" style="position: relative; left:-2.3%;top: -8px;width: 102%;height: 5px;">
						</div>
						<div id="viewFileTaiLieuKhac">
							<embed src="<%=urlDefault%>" type='application/pdf' id='fileContentTaiLieuKhac' style='width:100%;height:400px;'>
						</div>
					</div>
					<!-- STOP TAB_i -->
				</div><!-- container -->
			</div>
<portlet:resourceURL var="updaContentURL" ></portlet:resourceURL>
<script type="text/javascript">
var path = '<%= request.getContextPath() + "/pdf.js/web/viewer.html?file=" + request.getContextPath() + "/export/" %>';

function callAjaxHienThiBaoCaoBienBanReport() {
	var idBienBanKiemTra = <%= idBienBanKiemTra%>;
	var idThongSoKiThuat = <%=idThongSoKiThuat%>;
	$.ajax({
		url: '<%=updaContentURL%>',
		dataType: "json",
		async: false,//bat dong bo = fale, dong bo voi client
		cache: false,
		data: { 
			idBienBanKiemTra : idBienBanKiemTra,
			idThongSoKiThuat : idThongSoKiThuat,
			type : 'callAjaxHienThiBaoCaoBienBanReport'
		},
		type: "get",
		success : function (data) {
			console.log('callAjaxHienThiBaoCaoBienBanReport==(2)==neu thanh cong==success==');
			console.log(data);
			var obj = JSON.parse(JSON.stringify(data));

			var fileNameBienBanKiemTra = obj.bienBanKiemTra;
			var fileNameThongSoKiThuat = obj.thongSoKiThuat;
			var fileNameTaiLieuThuNghiem = obj.taiLieuThuNghiem;
			var fileNameTalLieuKhiThai = obj.taiLieuKhiThai;
			var fileNameTalLieuAnToan = obj.taiLieuAnToan;
			var fileNameTalLieuKhac = obj.taiLieuKhac;

			console.log('fileNameBienBanKiemTra==' + fileNameBienBanKiemTra+" ---path + fileNameBienBanKiemTra-- "+path + fileNameBienBanKiemTra);
			
			loadDocument(path + fileNameBienBanKiemTra, 'viewFileBienBanKiemTra', 'fileContentBienBanKiemTra');
			loadDocument(path + fileNameThongSoKiThuat, 'viewFileThongSoKiThuat', 'fileContentThongSoKiThuat');
			loadDocument(path + fileNameTaiLieuThuNghiem, 'viewFileTaiLieuThuNghiem', 'fileContentTaiLieuThuNghiem');
			loadDocument(path + fileNameTalLieuKhiThai, 'viewFileTaiLieuKhiThai', 'fileContentTaiLieuKhiThai');
			loadDocument(path + fileNameTalLieuAnToan, 'viewFileTaiLieuAnToan', 'fileContentTaiLieuAnToan');
			loadDocument(path + fileNameTalLieuKhac, 'viewFileTaiLieuKhac', 'fileContentTaiLieuKhac');

			
		}, beforeSend: function(data) {
			console.log("callAjaxHienThiBaoCaoBienBanReport==(1)==beforeSend==" + data);
			//$('#waiting').show();
			//$('body').addClass("loading");
			
			//$("#wait").css("display","block");
			//$(document.body).css("display","block");
		}, complete: function(data) {
			console.log("callAjaxHienThiBaoCaoBienBanReport==(3) finally===complete==" + data);
			//$("#wait").css("display","none");
			//$('#usersTable').empty();
			//$('#usersTable').html(allRows.trim());
		}, error: function(data) {
			console.log("callAjaxHienThiBaoCaoBienBanReport==(2) neu that bai==error==" + data);
			//$('#userContent').html('<span style="color:red">Connection problems</span>');
		}
	});
}
function loadDocument(url, idDiv, idEmbed) {
	var doc = $('<embed src="' + url + '" type="application/pdf" style="width: 100%; height: 1000px;" id="' + idEmbed + '"/>');
	$('#' + idDiv).empty().append(doc);
}

//chuc nang hien thi tab
$(document).ready(function() {
	$('ul.tabs li').click(function() {
		var tab_id = $(this).attr('data-tab');
		$('ul.tabs li').removeClass('current');
		$('.tab-content').removeClass('current');
		$(this).addClass('current');
		$("#" + tab_id).addClass('current');
	})
})


$(document).ready(function() {
	$('ul.reportTabs li').click(function() {
		console.log('event click reportTabs');
		console.log(this);
		//lay ra id cua tab, duoc de trong data-tab
		var tab_id = $(this).attr('data-tab');
		console.log('tab_id==' + tab_id);
		$('ul.reportTabs li').removeClass('current');
		$('.tab-content-report').removeClass('current');
		$(this).addClass('current');
		$("#" + tab_id).addClass('current');
	})
})
</script>