<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.NewExchangeRateLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.NewExchangeRateImpl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="java.util.List"%>
<%@ include file="/portlet/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>

<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
<%
	NewExchangeRate exRate = null;
	List<NewExchangeRate> lstNewExchangeRates = NewExchangeRateLocalServiceUtil.getNewExchangeRates(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	
	if (lstNewExchangeRates == null) { lstNewExchangeRates = new ArrayList<NewExchangeRate>(); }
	if (exRate == null) { exRate = new NewExchangeRateImpl(); }
	
	PortletURL viewHoSoUrl_danhgiadoanhnghiep = renderResponse.createRenderURL();
	viewHoSoUrl_danhgiadoanhnghiep.setParameter("jspPage", "/portlet/quanlyruiro/viewdanhgiadoanhnghiep.jsp");
	
	PortletURL viewHoSoUrl_kiemsoatdoanhnghiep = renderResponse.createRenderURL();
	viewHoSoUrl_kiemsoatdoanhnghiep.setParameter("jspPage", "/portlet/quanlyruiro/viewkiemsoatdoanhnghiep.jsp");
	
	PortletURL viewHoSoUrl_kiemsoatruirosanpham = renderResponse.createRenderURL();
	viewHoSoUrl_kiemsoatruirosanpham.setParameter("jspPage", "/portlet/quanlyruiro/viewkiemsoatruirosanpham.jsp");
	
	PortletURL viewHoSoUrl_kiemsoatloivaq = renderResponse.createRenderURL();
	viewHoSoUrl_kiemsoatloivaq.setParameter("jspPage", "/portlet/quanlyruiro/viewkiemsoatloivaq.jsp");
	
	//PortletURL viewHoSoUrl_kiemsoatketquacop = renderResponse.createRenderURL();
	//viewHoSoUrl_kiemsoatketquacop.setParameter("jspPage", "/portlet/quanlyruiro/viewkiemsoatketquacop.jsp");
	
	PortletURL viewHoSoUrl_danhgianhansugiantiep = renderResponse.createRenderURL();
	viewHoSoUrl_danhgianhansugiantiep.setParameter("jspPage", "/portlet/quanlyruiro/viewdanhgianhansugiantiep.jsp");
	
	PortletURL viewHoSoUrl_danhgianhansutructiep = renderResponse.createRenderURL();
	viewHoSoUrl_danhgianhansutructiep.setParameter("jspPage", "/portlet/quanlyruiro/viewdanhgianhansutructiep.jsp");
	
	PortletURL viewHoSoUrl_luachonphuongthuckiemtra = renderResponse.createRenderURL();
	viewHoSoUrl_luachonphuongthuckiemtra.setParameter("jspPage", "/portlet/quanlyruiro/viewluachonphuongthuckiemtra.jsp");
	
	PortletURL viewHoSoUrl_thietlapdinhkydanhgiaruiro = renderResponse.createRenderURL();
	viewHoSoUrl_thietlapdinhkydanhgiaruiro.setParameter("jspPage", "/portlet/quanlyruiro/viewthietlapdinhkydanhgiaruiro.jsp");

	PortletURL viewHoSoUrl_thietlapkhuonkho = renderResponse.createRenderURL();
	viewHoSoUrl_thietlapkhuonkho.setParameter("jspPage", "/portlet/quanlyruiro/viewthietlapkhuonkho.jsp");
	
	// Ghi actionlog
	String noidungthaotac = "Vào menu Quản lý rủi ro thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()); 
	String tenmanhinhdaidien = "Quản lý rủi ro";
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(0, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);

%>
<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1" >
		<div tabindex="0" class="CollapsiblePanelTab">
			<h5 class="tieude">
				Cơ sở dữ liệu Quản lý rủi ro
				<i class="fa-right fa fa-angle-down"></i>
			</h5>
			<h5></h5>
		</div>
		<!-- Duong line doc -->
		<div class="CollapsiblePanelContent" style="width: 0.1%; float:left; height:210px; border-right: 0px solid #d8d8d8;"/></div>
		
		<div class="CollapsiblePanelContent" style="display: block; float:left; margin-left: 10.5%">
				<div class="row" style="height:30px;">
				&nbsp;&nbsp;&nbsp;
				</div>
				<div class="row" style="height:30px;">
				<a href="<%= viewHoSoUrl_kiemsoatloivaq.toString() %>" class="aicon"><i class="mar_r10 xanh fa fa-circle" style="font-size: 13x;"></i>Kiểm soát lỗi VAQ</a><br>
				</div>
				<div class="row" style="height:30px;">
				<a href="<%= viewHoSoUrl_thietlapdinhkydanhgiaruiro.toString() %>" class="aicon"><i class="mar_r10 xanh fa fa-circle" style="font-size: 13x;"></i>Thiết lập định kỳ đánh giá rủi ro</a><br>
				</div>
				<div class="row" style="height:30px;">
				<a href="<%= viewHoSoUrl_thietlapkhuonkho.toString() %>" class="aicon"><i class="mar_r10 xanh fa fa-circle" style="font-size: 13x;"></i>Thiết lập khuôn khổ, phân luồng đánh giá</a><br>
				</div>
				<div class="row" style="height:30px;">
				<a href="<%= viewHoSoUrl_danhgiadoanhnghiep.toString() %>" class="aicon"><i class="mar_r10 xanh fa fa-circle" style="font-size: 13x;"></i>Đánh giá doanh nghiệp</a><br>
				</div>		
				<div class="row" style="height:30px;">
				<a href="<%= viewHoSoUrl_kiemsoatdoanhnghiep.toString() %>" class="aicon"><i class="mar_r10 xanh fa fa-circle" style="font-size: 13x;"></i>Kiểm soát doanh nghiệp</a><br>
				</div>		
				<div class="row" style="height:30px;">
				<a href="<%= viewHoSoUrl_kiemsoatruirosanpham.toString() %>" class="aicon"><i class="mar_r10 xanh fa fa-circle" style="font-size: 13x;"></i>Kiểm soát rủi ro sản phẩm</a><br>
				</div>		
				<div class="row" style="height:30px;">
				<a href="<%= viewHoSoUrl_danhgianhansutructiep.toString() %>" class="aicon"><i class="mar_r10 xanh fa fa-circle" style="font-size: 13x;"></i>Đánh giá Nhân sự - Khối trực tiếp</a><br>
				</div>
				<div class="row" style="height:30px;">
				<a href="<%= viewHoSoUrl_danhgianhansugiantiep.toString() %>" class="aicon"><i class="mar_r10 xanh fa fa-circle" style="font-size: 13x;"></i>Đánh giá Nhân sự - Khối gián tiếp</a><br>
				</div>				
				<div class="row" style="height:30px;" disabled>
				<a href="<%= viewHoSoUrl_luachonphuongthuckiemtra.toString() %>" class="aicon"><i class="mar_r10 xanh fa fa-circle" style="font-size: 13x;"></i>Lựa chọn phương thức kiểm tra</a><br>
				</div>		
		
		
		</div>
</div>		

	</div>
</div>
