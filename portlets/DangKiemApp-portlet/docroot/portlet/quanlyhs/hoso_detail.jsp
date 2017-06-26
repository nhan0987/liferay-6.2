<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.utils.format.ConvertUtil"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@ include file="/portlet/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<script type="text/javascript" src="<%=request.getContextPath()%>/js/SpryTabbedPanels.js"></script>
<%
Object maPhanNhom = PortalUtil.getHttpServletRequest(renderRequest).getSession().getAttribute(Constants.MAPHANNHOMHOSO);
String thanhPhanXuLy = ParamUtil.getString(request, Constants.THANH_PHAN_XU_LY);

//Ghi actionlog
long hoSoThuTucIdActionLog = ConvertUtil.convertToLong(ParamUtil.getString(request, Constants.ID_HO_SO_THU_TUC));

String idPhanNhomHoSoActionLog = "";
if (maPhanNhom != null) {
	idPhanNhomHoSoActionLog = maPhanNhom.toString();
} else {
	idPhanNhomHoSoActionLog = "";
}
String tenPhanNhomHoSoActionLog = "";
if (idPhanNhomHoSoActionLog != null && idPhanNhomHoSoActionLog.trim().length() > 0) {
	TthcPhanNhomHoSo roTrangThaiHoSoActionLog = TthcPhanNhomHoSoLocalServiceUtil.fetchTthcPhanNhomHoSo(ConvertUtil.convertToLong(idPhanNhomHoSoActionLog));
	if (roTrangThaiHoSoActionLog != null && roTrangThaiHoSoActionLog.getTenPhanNhom().length() > 0){
		tenPhanNhomHoSoActionLog = roTrangThaiHoSoActionLog.getTenPhanNhom();
	}
	
}
String noidungthaotacThuLyHoSoActionLog = "Mở xem Thụ lý hồ sơ - [" + tenPhanNhomHoSoActionLog + "] thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) + " theo hoSoThuTucId " + hoSoThuTucIdActionLog; 
String tenmanhinhdaidienThuLyHoSoActionLog = "Thụ lý hồ sơ - [" + tenPhanNhomHoSoActionLog + "]";
String noidungthaotacXemTienTrinhThuLyHoSoActionLog = "Mở xem Tiến trình thụ lý hồ sơ - [" + tenPhanNhomHoSoActionLog + "] thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) + " theo hoSoThuTucId " + hoSoThuTucIdActionLog; 
String tenmanhinhdaidienXemTienTrinhThuLyHoSoActionLog = "Tiến trình thụ lý hồ sơ - [" + tenPhanNhomHoSoActionLog + "]";
String noidungthaotacThanhPhanDKKTHoSoActionLog = "Mở xem Thành phần nộp ĐKKT hồ sơ - [" + tenPhanNhomHoSoActionLog + "] thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) + " theo hoSoThuTucId " + hoSoThuTucIdActionLog; 
String tenmanhinhdaidienThanhPhanDKKTHoSoActionLog = "Thành phần nộp ĐKKT hồ sơ - [" + tenPhanNhomHoSoActionLog + "]";

String importernameActionLog = "";
String inspectornameActionLog = user.getScreenName();
long inspectoridActionLog = user.getUserId();



String thuLyHoSo1 = "";
String thuLyHoSo2 = "";
String thuLyHoSo3 = "";

String thanhPhanHoSo1 = "";
String thanhPhanHoSo2 = "";
String thanhPhanHoSo3 = "";

String tienTrinhHoSo1 = "";
String tienTrinhHoSo2 = "";
String tienTrinhHoSo3 = "";

String hoSoDKKT1 = "";
String hoSoDKKT2 = "";
String hoSoDKKT3 = "";

String idTab1 = "0";

String activateTienTrinhFlag = "0";
%>
<script type="text/javascript">
var idTab = 0;
</script>
<%

if (Constants.XU_LY_TT.compareToIgnoreCase(thanhPhanXuLy) == 0) {
	tienTrinhHoSo1 = "TabbedPanelsTabFocused TabbedPanelsTabSelected";
	tienTrinhHoSo2 = "TabbedPanelsContentVisible";
	tienTrinhHoSo3 = "block";
	
	thanhPhanHoSo1 = "";
	thanhPhanHoSo2 = "";
	thanhPhanHoSo3 = "none";
	
	thuLyHoSo1 = "";
	thuLyHoSo2 = "";
	thuLyHoSo3 = "none";
	
	hoSoDKKT1 = "";
	hoSoDKKT2 = "";
	hoSoDKKT3 = "none";
	idTab1 = "2";
} else if (Constants.XU_LY_TLHS.compareToIgnoreCase(thanhPhanXuLy) == 0) {
	LogFactoryUtil.getLog(DangKiemAction.class).debug("======Constants.XU_LY_TLHS.compareToIgnoreCase(thanhPhanXuLy) == 0=======" + thuLyHoSo3);
	thuLyHoSo1 = "TabbedPanelsTabFocused TabbedPanelsTabSelected";
	thuLyHoSo2 = "TabbedPanelsContentVisible";
	thuLyHoSo3 = "block";
	
	tienTrinhHoSo1 = "";
	tienTrinhHoSo2 = "";
	tienTrinhHoSo3 = "none";
	
	thanhPhanHoSo1 = "";
	thanhPhanHoSo2 = "";
	thanhPhanHoSo3 = "none";

	hoSoDKKT1 = "";
	hoSoDKKT2 = "";
	hoSoDKKT3 = "none";
	
	idTab1 = "1";
} else if (Constants.XU_LY_TPHS2.compareToIgnoreCase(thanhPhanXuLy) == 0) {
	LogFactoryUtil.getLog(DangKiemAction.class).debug("======Constants.XU_LY_TLHS.compareToIgnoreCase(thanhPhanXuLy) == 0=======" + thuLyHoSo3);
	
	hoSoDKKT1 = "TabbedPanelsTabFocused TabbedPanelsTabSelected";
	hoSoDKKT2 = "TabbedPanelsContentVisible";
	hoSoDKKT3 = "none";
	
	thuLyHoSo1 = "";
	thuLyHoSo2 = "";
	thuLyHoSo3 = "none";
	
	tienTrinhHoSo1 = "";
	tienTrinhHoSo2 = "";
	tienTrinhHoSo3 = "none";
	
	thanhPhanHoSo1 = "";
	thanhPhanHoSo2 = "";
	thanhPhanHoSo3 = "none";
	
	idTab1 = "3";
} else {
	thanhPhanHoSo1 = "TabbedPanelsTabFocused TabbedPanelsTabSelected";
	thanhPhanHoSo2 = "TabbedPanelsContentVisible";
	thanhPhanHoSo3 = "block";
	
	tienTrinhHoSo1 = "";
	tienTrinhHoSo2 = "";
	tienTrinhHoSo3 = "none";
	
	thuLyHoSo1 = "";
	thuLyHoSo2 = "";
	thuLyHoSo3 = "none";
	
	hoSoDKKT1 = "";
	hoSoDKKT2 = "";
	hoSoDKKT3 = "none";
	
	idTab1 = "0";
}
LogFactoryUtil.getLog(DangKiemAction.class).debug("======thuLyHoSo3=======" + thuLyHoSo3);
LogFactoryUtil.getLog(DangKiemAction.class).debug("========thuLyHoSo2=====" + thuLyHoSo2);
LogFactoryUtil.getLog(DangKiemAction.class).debug("=======thuLyHoSo1======" + thuLyHoSo1);
%>
<jsp:include page="/portlet/quanlyhs/hoso_detail_content.jsp"></jsp:include>


<div class="col-md-12" id="main">
	<div class="TabbedPanels" id="TabbedPanels1">
		<ul class="TabbedPanelsTabGroup">
			<li tabindex="0" class="TabbedPanelsTab <%=thanhPhanHoSo1%>" onclick="changeIdTab('<%=0%>');">Thành phần hồ sơ</li>
			<li tabindex="0" class="TabbedPanelsTab <%=thuLyHoSo1%>" onclick="changeIdTab('<%=1%>');">Thụ lý hồ sơ</li>
			<li tabindex="0" class="TabbedPanelsTab <%=tienTrinhHoSo1%>" onclick="changeIdTab('<%=2%>');">Tiến trình thụ lý hồ sơ</li>
			<li tabindex="0" class="TabbedPanelsTab <%=hoSoDKKT1%>" onclick="changeIdTab('<%=3%>');">HS ĐKKT</li>
		</ul>
		<div class="TabbedPanelsContentGroup">
			<!-- Lay cac code khac tuy tab vao day -->
			<div class="TabbedPanelsContent <%=thanhPhanHoSo2%>"	style="display:  <%=thanhPhanHoSo3%>;">
				<jsp:include page="/portlet/quanlyhs/hoso_detail_content_tphs.jsp"></jsp:include>
			</div>
			<div class="TabbedPanelsContent <%=thuLyHoSo2%>" style="display: <%=thuLyHoSo3%>;">
				<jsp:include page="/portlet/quanlyhs/thulyhs/hoso_detail_content_tlhs.jsp"></jsp:include>
			</div>
			
			<div class="TabbedPanelsContent <%=tienTrinhHoSo2%>" style="display: <%=tienTrinhHoSo3%>;">
				<jsp:include page="/portlet/quanlyhs/tientrinh/hoso_detail_content_tlhs_tt.jsp"></jsp:include>
			</div>
			
			<div class="TabbedPanelsContent <%=hoSoDKKT2%>" style="display: <%=hoSoDKKT3%>;">
				<jsp:include page="/portlet/quanlyhs/hoso_detail_content_hs_dkkt.jsp"></jsp:include>
			</div>			
		</div>
	</div>
</div>

<portlet:resourceURL var="updateActionLogOnlineURL"></portlet:resourceURL>

<script type="text/javascript">

	var completeUpdateActionLogOnlineURL = '<%=updateActionLogOnlineURL%>';
	
	var hoSoThuTucIdActionLog='<%=hoSoThuTucIdActionLog%>';
	var noidungthaotacThuLyHoSoActionLog='<%=noidungthaotacThuLyHoSoActionLog%>';
	var tenmanhinhdaidienThuLyHoSoActionLog='<%=tenmanhinhdaidienThuLyHoSoActionLog%>';
	var noidungthaotacXemTienTrinhThuLyHoSoActionLog='<%=noidungthaotacXemTienTrinhThuLyHoSoActionLog%>';
	var tenmanhinhdaidienXemTienTrinhThuLyHoSoActionLog='<%=tenmanhinhdaidienXemTienTrinhThuLyHoSoActionLog%>';
	var noidungthaotacThanhPhanDKKTHoSoActionLog='<%=noidungthaotacThanhPhanDKKTHoSoActionLog%>';
	var tenmanhinhdaidienThanhPhanDKKTHoSoActionLog='<%=tenmanhinhdaidienThanhPhanDKKTHoSoActionLog%>';
	var importernameActionLog='<%=importernameActionLog%>';
	var inspectornameActionLog='<%=inspectornameActionLog%>';
	var inspectoridActionLog='<%=inspectoridActionLog%>';
	
	var idPhanNhomHoSoActionLog='<%=idPhanNhomHoSoActionLog%>';
	var tenPhanNhomHoSoActionLog='<%=tenPhanNhomHoSoActionLog%>';
	

	var TabbedPanels1 = new Spry.Widget.TabbedPanels("TabbedPanels1", {defaultTab:<%=idTab1%>});
	function changeIdTab(tabId) {
		idTab = tabId;
		if(tabId == 1){
			completeUpdateActionLogOnline(hoSoThuTucIdActionLog, inspectoridActionLog, inspectornameActionLog, noidungthaotacThuLyHoSoActionLog, tenmanhinhdaidienThuLyHoSoActionLog, tenPhanNhomHoSoActionLog );
		} else if(tabId == 2){			
			completeUpdateActionLogOnline(hoSoThuTucIdActionLog, inspectoridActionLog, inspectornameActionLog, noidungthaotacXemTienTrinhThuLyHoSoActionLog, tenmanhinhdaidienXemTienTrinhThuLyHoSoActionLog, tenPhanNhomHoSoActionLog );
		} else if(tabId == 3){			
			completeUpdateActionLogOnline(hoSoThuTucIdActionLog, inspectoridActionLog, inspectornameActionLog, noidungthaotacThanhPhanDKKTHoSoActionLog, tenmanhinhdaidienThanhPhanDKKTHoSoActionLog, tenPhanNhomHoSoActionLog );
		} else if(tabId == 0){
			
		} 
		
	}
	function onchangeURL(url){
		document.location.href=url;
	}
	
	
	function completeUpdateActionLogOnline(hoSoThuTucIdActionLog, inspectoridActionLog, inspectornameActionLog, noidungthaotacActionLog, tenmanhinhdaidienActionLog, tenPhanNhomHoSoActionLog) {		
		$.ajax({
			type : 'POST',
			url : completeUpdateActionLogOnlineURL,
			data : {
				type : 'updateActionLogOnline',
				hoSoThuTucIdActionLog : hoSoThuTucIdActionLog,
				inspectoridActionLog : inspectoridActionLog,
				inspectornameActionLog : inspectornameActionLog,
				noidungthaotacActionLog : noidungthaotacActionLog,
				tenmanhinhdaidienActionLog : tenmanhinhdaidienActionLog,
				tenPhanNhomHoSoActionLog : tenPhanNhomHoSoActionLog
			},
			success : function(data) {
				if(data){
					var msg = data.msg;
					if(msg == 'success'){
						// donothing
					}else{
						console.log('=msg=failed=' + msg);
					}
					
				}
			}
		});
	}
</script>