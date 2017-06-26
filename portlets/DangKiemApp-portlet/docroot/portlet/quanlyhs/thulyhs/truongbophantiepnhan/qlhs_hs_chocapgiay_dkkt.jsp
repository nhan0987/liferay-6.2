<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.gt.dk.utils.CollectionUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="vn.dtt.gt.dk.utils.codec.FileKySoUtils"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyChinhLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyPhuLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.MotCuaPhanCongXuLyLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.MotCuaPhanCongXuLy"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalService"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo"%>
<%@ include file="/portlet/init.jsp"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<script type="text/javascript"> var imageFilesPath = '<%=request.getContextPath()%>'+"/img/";</script>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/toTiepNhan.css">

<portlet:resourceURL var="getDataAjax">
</portlet:resourceURL>

<script type="text/javascript">

	function checkTrungSoDongCo(idHoSoThuTuc) {		
		$.ajax({
			type : 'POST',
			url : '<%=getDataAjax%>',	
			async: false,//bat dong bo = fale, dong bo voi client
			cache : false,	
			data : {
				type:'TrungSoDongCo',
				idHoSoThuTuc:idHoSoThuTuc,
			},
			success : function(data) {
				var jsonData = JSON.parse(data);
				var msg = jsonData.msg;
				if(msg == 'success'){
			
					var urlFile = jsonData.urlFile;
					window.open(urlFile);
					
				}
			}
		});
	}
</script>
<%
String idHoSoThuTuc = ParamUtil.getString(request, Constants.ID_HO_SO_THU_TUC);

String idthuTucHanhChinh = ParamUtil.getString(request, Constants.TTHC_THUTUCHANHCHINH_ID);

PortletURL kyXacNhanDangKyKiemTra = renderResponse.createActionURL();
kyXacNhanDangKyKiemTra.setParameter(ActionRequest.ACTION_NAME, "kyXacNhanDangKyKiemTra");
kyXacNhanDangKyKiemTra.setParameter(Constants.ID_HO_SO_THU_TUC, idHoSoThuTuc);
kyXacNhanDangKyKiemTra.setParameter(Constants.TTHC_THUTUCHANHCHINH_ID, idthuTucHanhChinh);
kyXacNhanDangKyKiemTra.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);

PortletURL yeuCauBoXung = renderResponse.createActionURL();
yeuCauBoXung.setParameter(ActionRequest.ACTION_NAME, "boXungHoSo");
yeuCauBoXung.setParameter(Constants.ID_HO_SO_THU_TUC, idHoSoThuTuc);
yeuCauBoXung.setParameter(Constants.TTHC_THUTUCHANHCHINH_ID, idthuTucHanhChinh);
yeuCauBoXung.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);


TthcNoidungHoSo tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.findBDKByHoSoThuTucIdAndTthcId(idHoSoThuTuc, idthuTucHanhChinh);
//MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh = MotCuaPhieuXuLyChinhLocalServiceUtil.findByHoSoThuTucId(Long.parseLong(idHoSoThuTuc));
//MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.findByPhieuXuLyChinhIdAndNoiDungHoSoId(motCuaPhieuXuLyChinh.getId(), tthcNoidungHoSo.getId());
//InspectionRecord inspectionRecord = InspectionRecordLocalServiceUtil.findByPhieuXuLyPhuId(motCuaPhieuXuLyPhu.getId());

	// Ghi actionlog
	
	String noidungthaotac = "Mở xem Thụ lý hồ sơ - [" + "Chờ cấp giấy ĐKKT" + "] thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) + " theo hoSoThuTucId " + idHoSoThuTuc; 
	String tenmanhinhdaidien = "Thụ lý hồ sơ - [" + "Chờ cấp giấy ĐKKT" + "]";
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(ConvertUtil.convertToLong(idHoSoThuTuc), null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);

%>
<portlet:actionURL var="kyXacNhanDangKyMotHs" name="kyXacNhanDangKyMotHs">
	<portlet:param name="<%=Constants.DIEU_KIEN_CHUYEN_DICH %>" value="<%=Constants.DIEU_KIEN_DICH_CHUYEN_PHU_HOP_QUY_DINH %>"/>
</portlet:actionURL>
<script type="text/javascript">
	var urlFileExport="";
</script>

<div id="divButton">
	<aui:button-row>
		<button type="button" onclick="eventHideOrShowDiv('kyXacNhan', 'true')" class="btnThuLyHS form-control"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.truongbophantiepnhan.qlhshschocapgiaydkkt.kyxacnhan"/></button>
		<button type="button" onclick="eventHideOrShowDiv('yeuCauBoSung', 'true')" class="btnThuLyHS form-control"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.truongbophantiepnhan.qlhshschocapgiaydkkt.yeucaubosung"/></button>
		<button type="button" onclick="eventHideOrShowDiv('xemXetSau', 'true')" class="btnThuLyHS form-control"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.truongbophantiepnhan.qlhshschocapgiaydkkt.xemxetsau"/></button>
		<a onclick="checkTrungSoDongCo('<%=idHoSoThuTuc%>')"><button
				type="button" class="btnThuLyHS form-control">Kiểm tra
				trùng số</button></a>

	</aui:button-row>
</div>
<div style="height: 15px" id="theDem"></div>

<aui:form action="<%=kyXacNhanDangKyMotHs.toString()%>" name="kyXacNhanKiemTra" id="kyXacNhanKiemTra" method="POST">
	<div id="kyXacNhan">
		<div class="boxnoidung">
			<div class="vungxuly">
				<%@ include file="/portlet/quanlyhs/thulyhs/truongbophantiepnhan/qlhs_hs_report_export.jsp"%>
			</div>
		</div>
		<input type='hidden' id="<%=Constants.ID_HO_SO_THU_TUC%>" name="<%=Constants.ID_HO_SO_THU_TUC %>" value="<%=idHoSoThuTuc%>"/>
		<input type='checkbox' id="xacNhanKyDuyet" style=';' class='user'><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.truongbophantiepnhan.qlhshschocapgiaydkkt.xacnhandongykyduyet"/>
		<input type='hidden' id="file_content" name="file_content" value=""/>
		<input type='hidden' id="is_kySo_" name="is_kySo_" value=""/>
		<div id="thongBaoLoading"></div>
		<aui:button-row>
			<button type="button" id="kyBanCoYeu" name="kyBanCoYeu" value="" onclick="getFileComputerHash()" class="btnThuLyHS form-control">Ký số BCY</button>
			<button type="button" id="quayLai" name="quayLai" onclick="eventHideOrShowDiv('kyXacNhan', 'false')" class="btnThuLyHS form-control"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.truongbophantiepnhan.qlhshschocapgiaydkkt.quaylai"/></button>
		</aui:button-row>
	</div>

</aui:form>

<!-- Yêu cầu bổ sung -->
<aui:form action="<%=yeuCauBoXung.toString()%>" name="yeuCauBoSung" id="yeuCauBoSung" method="POST">
	<div id="yeuCauBoSung">
		<input type="text" hidden="true" name="<%=Constants.DIEU_KIEN_CHUYEN_DICH%>" value="<%=Constants.DIEU_KIEN_DICH_CHUYEN_BO_SUNG%>" />
		<div><p style="text-align: left;"><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.truongbophantiepnhan.qlhshschocapgiaydkkt.ykienchidao"/></span></p></div>
		<div><textarea class="textAreaAutosize" id="yKienChiDao" name="yKienChiDao"><%=StringPool.BLANK%></textarea></div>
		<div>
			<p style="text-align: left;"><span>Ngày hoàn thiện hồ sơ</span></p>
			<input type="text" id="ngayChiDao" name="ngayChiDao" style="width: 400px; float: left;" class="form-control-find"
				value="<%=DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date())%>" onclick="gtCalendar('ngayThongBao')"/>
			<span class="input-group-btn">
				<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('ngayChiDao')"><i class="fa fa-calendar"></i></button>
			</span>
		</div>
		<div>
			<br>
			<aui:button-row>
				<button type="button" onclick="if(validatorYeuCauBoSung()) beforSummitForm('yeuCauBoSung', '<%=yeuCauBoXung.toString()%>')" class="btnThuLyHS form-control">Yêu cầu bổ sung</button>
				<button type="button" onclick="eventHideOrShowDiv('yeuCauBoSung', 'false')" class="btnThuLyHS form-control"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.truongbophantiepnhan.qlhshschocapgiaydkkt.quaylai"/></button>
			</aui:button-row>
		</div>
	</div>
</aui:form>

<!-- Xem xet sau -->
<div id="xemXetSau">
	<div><p style="text-align: left;"><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.truongbophantiepnhan.qlhshschocapgiaydkkt.noidungkiennghi"/></span></p></div>
	<div>
		<aui:button-row>
			<button type="button" onclick="eventHideOrShowDiv('xemXetSau', 'false')" class="btnThuLyHS form-control"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.truongbophantiepnhan.qlhshschocapgiaydkkt.quaylai"/></button>
		</aui:button-row>
	</div>
</div>

<div id="div_WarningMsg" style="display: none;min-height: 130px !important;">
	<table width="100%">
		<tr>
			<td colspan="2" style="width: 100%;"><label class="egov-label">
				Ký nhiều hồ sơ</label> 
			</td>
		</tr>
		<tr>
			<td colspan="2" style="width: 100%;">
				Chưa ký số được cho Hồ sơ. Tiếp tục thực hiện ?
			</td>
		</tr>		
		<tr>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="button" class="egov-button-normal" value="Đồng ý" id="btnXacNhanThongTinDSXe"
					onclick="javascript: func_xacnhanPheDuyetDSXe('<%=kyXacNhanDangKyKiemTra%>');">
				&nbsp;&nbsp; 
				<input type="button" class="egov-button-normal" value="Hủy" onclick="javascript: func_huyPheDuyetDSXe();" >
			</td>
		</tr>
	</table>
</div>

<portlet:resourceURL var="getDataAjax"></portlet:resourceURL>
<portlet:actionURL var="signatureURL" name="signature"></portlet:actionURL>

<object id="plugin0" type="application/x-cryptolib05plugin" width="0" height="0"></object>

<script type="text/javascript">
	var url = '<%=getDataAjax%>';	
	var complateSignatureURL = '<%=signatureURL%>';
	//validator yeu cau bo sung
	function validatorYeuCauBoSung() {
		var yKienChiDao = $('#yKienChiDao').val();
		if (yKienChiDao.trim().length == 0) {
			alert("Đề nghị nhập lý do Yêu cầu bổ sung !");
			return false;
		}
	
		var ngayChiDao = $('#ngayChiDao').val();
		if (ngayChiDao.trim().length === 0) {
			alert("Đề nghị nhập ngày Thông báo !")
			return false;
		}
		
		return true;
	}

	//de ve file js, ko an doan code: <portlet:namespace/>
	function beforSummitForm(idForm, url) {
		
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
	
	var isCheck=false;
	
    function refreshPdfDiv(){
		var myDiv1 = document.getElementById('reportView').innerHTML;
		var myDiv2 = document.getElementById('reportView');
		myDiv2.innerHTML = myDiv1; 

    }

	$(function(){
		$('#kyXacNhan').hide();
		$('#yeuCauBoSung').hide();
		$('#xemXetSau').hide();
		$('#theDem').hide();
	});

	function eventHideOrShowDiv(idElement, isHide) {
		/* console.log(idElement + isHide); */
		if (isHide === 'false') {
			$('#'+idElement).hide();
			$('#theDem').hide();
			$('#divButton').show();
		} else if (isHide === 'true') { 
			$('#'+idElement).show();
			$('#theDem').show();
			$('#divButton').hide();
		}
	};

	function randomNumber(idElement) {
		var d = new Date();
		var n = d.getTime();
		$('#'+idElement).val(n);
	};

	function summitForm(url) {
	    var isCheck=document.getElementById('xacNhanKyDuyet').checked;
		if (isCheck==true){
			document.getElementById('<portlet:namespace/>kyXacNhanKiemTra').action = url;
		    document.getElementById('<portlet:namespace/>kyXacNhanKiemTra').submit();
		}else{
			return;
		}
	}

	var idthuTucHanhChinh='<%=idthuTucHanhChinh%>';
	var dieuKienChuyenDich='<%=Constants.DIEU_KIEN_DICH_CHUYEN_PHU_HOP_QUY_DINH%>';
	var idHoSoThuTuc='<%=idHoSoThuTuc%>';
	
	function getFileComputerHash() {
		//disable the button after user submitted
		document.getElementById('kyBanCoYeu').disabled = true;
		
		var listHoSoThuTucId=idHoSoThuTuc+",";
		
		$.ajax({
			type : 'POST',
			url : url,
			data : {
				listHoSoThuTucId : listHoSoThuTucId, type: 'getComputerHash',
				DIEU_KIEN_CHUYEN_DICH : dieuKienChuyenDich, TTHC_THUTUCHANHCHINH_ID : idthuTucHanhChinh
			},
			success : function(data) {
				if(data){
					var jsonData = JSON.parse(data);
					var hashComputers = jsonData.hashComputers;
					var signFieldNames = jsonData.signFieldNames;
					var fileNames = jsonData.fileNames;
					var msgs = jsonData.msg;
					
					for ( var i = 0; i < hashComputers.length; i++) {
						
						var hashComputer = hashComputers[i];
						var signFieldName = signFieldNames[i];
						var fileName = fileNames[i];
						var msg = msgs[i];
						if(plugin().valid){
							if(msg == 'success'){
								var code = plugin().Sign(hashComputer);
								if(code ===0 || code === 7){
									var sign = plugin().Signature;
									completeSignature(sign, signFieldName, fileName, idHoSoThuTuc);
								}else{
									alert(plugin().ErrorMessage);
									document.getElementById('kyBanCoYeu').disabled = false;
								}
							}else{
								alert(msg);
								document.getElementById('kyBanCoYeu').disabled = false;
							}
							
						} else {
							alert("Plugin is not working");
							document.getElementById('kyBanCoYeu').disabled = false;
						}
					}
				}
			}
		});
	}
	
	function completeSignature(sign, signFieldName, fileName, hoSoThuTucId) {
		$.ajax({
			type : 'POST',
			url : complateSignatureURL,
			data : {
				sign : sign,
				signFieldName : signFieldName,
				fileName : fileName,
				hoSoThuTucId: hoSoThuTucId
			},
			success : function(data) {
				if(data){
					var msg = data.msg;
					if(msg == 'success'){
						var signerURL = data.signerURL;
						document.getElementById("file_content").value = signerURL;
						document.getElementById('<portlet:namespace/>kyXacNhanKiemTra').submit();
					}else{
						//showThongBaoMsgKySo();
						document.getElementById('kyBanCoYeu').disabled = false;
					}
					
				}
			}
		});
	}
	
	function showThongBaoMsgKySo() {
		/* console.log("==showThongBaoMsg =="); */
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
	function func_huyPheDuyetDSXe() {
		 $('#div_WarningMsg').dialog('close');
	}
	function func_xacnhanPheDuyetDSXe(url) {
		func_huyPheDuyetDSXe();
		document.getElementById('<portlet:namespace/>kyXacNhanKiemTra').action = url;
	    document.getElementById('<portlet:namespace/>kyXacNhanKiemTra').submit();
	}
	function reportNewPage(urlFile) {
		window.open(urlFile);
	};
</script>

<script type="text/javascript">
var plugin = function plugin0() {
	return document.getElementById('plugin0');
}
</script>