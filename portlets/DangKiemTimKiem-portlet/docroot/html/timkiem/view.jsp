<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page import="vn.dtt.gt.dk.utils.format.FormatData"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.ViewDangKiemTimKiemLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.ViewDangKiemTimKiem"%>
<%@page import="java.util.List"%>

<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@ include file="/html/init.jsp"%>

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/common.css">
<%
String soChungChi = ParamUtil.getString(request, "soChungChi");
String soKhung = ParamUtil.getString(request, "soKhung");
String soDongCo = ParamUtil.getString(request, "soDongCo");
long guestId=PortalUtil.getUserId(request);
%>
   <liferay-portlet:renderURL plid="22650"  portletName="58" var="EDITDON">
     <liferay-portlet:param name="historyKey" value="/tra-cuu-thong-tin" />
   </liferay-portlet:renderURL>

<style>
.textts {
    font-size: 16px;
    font-weight: bold;
}
.flleft {
    float: left;
}
.mt0 {
    margin-top: 0;
}
.flright {
    float: right;
}
.pagination {
    display: inline-block;
    padding-left: 0;
    margin: 20px 0;
    border-radius: 4px;
}
.pagination>li {
    display: inline;
}
.pagination>li:first-child>a, .pagination>li:first-child>span {
    margin-left: 0;
    border-top-left-radius: 4px;
    border-bottom-left-radius: 4px;
}
.pagination>.active>a, .pagination>.active>span, .pagination>.active>a:hover, .pagination>.active>span:hover, .pagination>.active>a:focus, .pagination>.active>span:focus {
    z-index: 2;
    color: #fff;
    cursor: default;
    background-color: #3563c1;
    border-color: #3563c1;
}
.pagination>li>a, .pagination>li>span {
    position: relative;
    float: left;
    padding: 6px 12px;
    margin-left: -1px;
    line-height: 1.42857143;
    color: #3563c1;
    text-decoration: none;
    background-color: #fff;
    border: 1px solid #ddd;
}
.fb {
    font-weight: bold;
}
.bgdanhsach {
    padding-bottom: 50px;
}
.sr-only {
    position: absolute;
    width: 1px;
    height: 1px;
    padding: 0;
    margin: -1px;
    overflow: hidden;
    clip: rect(0,0,0,0);
    border: 0;
}
.fa {
    display: inline-block;
    font: normal normal normal 14px/1 FontAwesome;
    font-size: inherit;
    text-rendering: auto;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
}
.fa-angle-right:before {
    content: "\f105";
}
.fa-angle-double-right:before {
    content: "\f101";
}
.fa-angle-left:before {
    content: "\f104";
}
.fa-angle-double-left:before {
    content: "\f100";
}
</style>

<portlet:actionURL var="actionUrltimkiemHoSo" name="timKiemDangKiem"></portlet:actionURL>
<aui:form action="<%=actionUrltimkiemHoSo%>" name="myForm" id="myForm" method="POST">
		<div class="wd-content-container">
				<div class="bgtlemain timkiemfull">
					<h2 class="tlemenu tlemain">Tìm kiếm</h2>
					<div class="bt_top">
					</div>
				</div>
            	<div class="wd-main-content wd-page-staff bgsearch timkiemfull">
					<div class="boxsearch">
						<div class="tbl_left boxlabel">
							<table class="table_noboder">
								<thead>
									<tr>
										<th class="text-left">Số chứng chỉ:</th>
										<td class="text-leftu">
											<input name="soChungChi" id="soChungChi" type="text" value="<%=HtmlUtil.escape(soChungChi)%>">
										</td>
									</tr>
								</thead>
							</table>
						</div>
						<div class="tbl_left boxlabel">
							<table class="table_noboder">
								<thead>
									<tr>
										<th class="text-left">Số khung:</th>
										<td class="text-leftu">
											<input name="soKhung" id="soKhung" type="text" value="<%=HtmlUtil.escape(soKhung)%>">
										</td>
									</tr>
								</thead>
							</table>
						</div>
						<div class="tbl_left boxlabel">
							<table class="table_noboder">
								<thead>
									<tr>
										<th class="text-left">Số động cơ:</th>
										<td class="text-leftu">
											<input name="soDongCo" id="soDongCo" type="text" value="<%=HtmlUtil.escape(soDongCo)%>">
										</td>
									</tr>
								</thead>
							</table>
						</div>
						<div class="wd-select">
							<%
							   if (guestId==0){
							%> 
								<div class="wd-select">&nbsp;</div>
							   	<a href="#" onclick="javascript: window.location='<%=EDITDON%>';" style="font-size: 12px; font-weight: bold; color: #3563c1; padding-bottom: 50px;">
							   	<img src="<%=request.getContextPath()%>/img/my_places.png" title="Chưa đăng nhập"> Đăng nhập để tìm kiếm</a>
								<div class="wd-select">&nbsp;</div>
							 <% }else { %>
							 <button type="submit" style="text-shadow: 0px 0px #FFF;">Tìm kiếm</button>
							 <%} %>
						</div>	
					</div>				
            	</div>
            </div>
</aui:form>         

<%
PortletURL portletUrl = renderResponse.createRenderURL();
if (soChungChi != null) {
	portletUrl.setParameter("soChungChi", soChungChi);
}
if (soKhung != null) {
	portletUrl.setParameter("soKhung", soKhung);
}
if (soDongCo != null) {
	portletUrl.setParameter("soDongCo", soDongCo);
}
SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, 15, portletUrl, null, "");

List<ViewDangKiemTimKiem> lstDangKiemTimKiems = ViewDangKiemTimKiemLocalServiceUtil.searchDangKiemTimKiem(soChungChi, soKhung, soDongCo, guestId, searchContainer.getStart(), searchContainer.getEnd());
long longTotal = ViewDangKiemTimKiemLocalServiceUtil.countDangKiemTimKiem(soChungChi, soKhung, soDongCo, guestId);

searchContainer.setResults(lstDangKiemTimKiems);
searchContainer.setTotal(Integer.parseInt(String.valueOf(longTotal)));

//System.out.println("==lstDangKiemTimKiems==" + lstDangKiemTimKiems.size());
//System.out.println("==soChungChi==" + soChungChi);
%>
 <div class="wd-content-container bgdanhsach">
				<h2 class="tlemenu">Danh sách kết quả tìm kiếm</h2>
				<div class="boxnd">
					<table class="wd-table">
						<thead>
							<tr>
								<th>STT</th>
								<th>Số ĐKKT<br>Ngày ĐKKT</th>
								<th>Số BBKT<br>Ngày BBKT</th>
								<th>Số chứng chỉ<br>Ngày cấp</th>
								<th>Số khung</th>
								<th>Số động cơ</th>
								<th width="100px">Năm sản xuất</th>
								<th width="100px">Thao tác</th>
							</tr>
						</thead>
						<tbody>
							<%
							if(lstDangKiemTimKiems != null && lstDangKiemTimKiems.size() >0){
								int index = 0;
								for(ViewDangKiemTimKiem viewDangKiemTimKiem : lstDangKiemTimKiems){
									index ++;
									
									PortletURL viewChungChu = renderResponse.createRenderURL();
									viewChungChu.setParameter("jspPage", "/html/report_export.jsp");
									viewChungChu.setParameter(Constants.TTHC_NOIDUNGHOSO_ID, String.valueOf(viewDangKiemTimKiem.getAttachedFile()));
									
									PortletURL viewThongSoXe = renderResponse.createRenderURL();
									viewThongSoXe.setParameter("jspPage", "/html/report_export.jsp");
									viewThongSoXe.setParameter(Constants.TTHC_NOIDUNGHOSO_ID_BBKT, String.valueOf(viewDangKiemTimKiem.getAttachedFileBbkt()));
									viewThongSoXe.setParameter("soChungChi", viewDangKiemTimKiem.getCertificateNumber());
									viewThongSoXe.setParameter("ngayKyChungChi", String.valueOf(viewDangKiemTimKiem.getSignDate()));
									viewThongSoXe.setParameter("maBieuMau", viewDangKiemTimKiem.getVehicleClass());
									
								%>
								<tr>
									<td><%=index %></td>
									<td class="text-center"><%=viewDangKiemTimKiem.getRegisteredNumber()%><br><%=FormatData.parseDateToTringDDMMYYY(viewDangKiemTimKiem.getInspectorSignDate())%></td>
									<td class="text-center"><%=viewDangKiemTimKiem.getInspectionrecordno()%><br><%=FormatData.parseDateToTringDDMMYYY(viewDangKiemTimKiem.getInspectionRecordDate())%></td>
									<td class="text-center"><%=viewDangKiemTimKiem.getCertificateNumber()%><br><%=FormatData.parseDateToTringDDMMYYY(viewDangKiemTimKiem.getSignDate())%></td>
									<td class="text-center"><%=viewDangKiemTimKiem.getChassisNumber()%></td>
									<td class="text-center"><%=viewDangKiemTimKiem.getEngineNumber()%></td>
									<td class="text-center"><%=viewDangKiemTimKiem.getProductionYear()%></td>
									<td class="text-center">
										<a href="<%=viewChungChu.toString()%>"><img src="<%=request.getContextPath()%>/img/icon_tiepnhan.png" title="Xem chứng chỉ"></a>
										<%
										 long userId=PortalUtil.getUserId(request);
										   if (userId==0){
										%>
										   <a href="#" onclick="javascript: window.location='<%=EDITDON%>';"><img src="<%=request.getContextPath()%>/img/my_places.png" title="Chưa đăng nhập"></a>
										 <% }else { %>
										 <a href="<%=viewThongSoXe.toString()%>"><img src="<%=request.getContextPath()%>/img/icon_xemhs.png" title="Xem thông tin xe"></a>
										 <%} %>
									</td>
								</tr>
							<%
								}
							}
							%>
						</tbody>
					</table>
					<div style="padding-top: 15px;">
						<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />
					</div>
				</div>
			</div>